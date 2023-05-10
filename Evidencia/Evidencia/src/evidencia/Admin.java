/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gael
 */
public class Admin {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Doctor> doctores;
    private ArrayList<Cita> citas;
    
    public Admin(){
        usuarios = new ArrayList<>();
        pacientes = new ArrayList<>();
        doctores = new ArrayList<>();
        citas = new ArrayList<>();
    }
    //Agregar usuarios, doctores y pacientes
    public String agregarUsuarios(){
    Scanner entrada = new Scanner(System.in);
    int nUsuarios = usuarios.size();
    String tipoUsuario;
    String identificador, contrasena = null, nombre = null, especialidad = null, resultado = null;
    do {
        System.out.print("Que tipo de usuario desea agregar (A = Administrador, D = Doctor, P = Paciente): ");
        tipoUsuario = entrada.nextLine().toUpperCase();
    } while (!tipoUsuario.equals("A") && !tipoUsuario.equals("D") && !tipoUsuario.equals("P"));

    switch (tipoUsuario) {
        case "A":
            resultado = agregarUsuario(nUsuarios, contrasena);
            break;
        case "D":
            resultado = agregarDoctor(nUsuarios, nombre, contrasena, especialidad);
            break;
        case "P":
            resultado = agregarPaciente(nUsuarios, nombre, contrasena);
            break;
        default:
            System.out.println("¡Esa no es una opcion!");
    }
    return "El usuario es: "+resultado;
}
    public String agregarUsuario(int nUsuarios, String contrasena) {
        usuarios.add(new Usuario("U001", "admin123"));
        Scanner entrada = new Scanner(System.in);
        String identificador = "U0" + String.format("%02d", nUsuarios);
        System.out.println("El identificador es: " + identificador);
        System.out.print("Ingresa la contrasena: "); contrasena = entrada.nextLine();
        Usuario usuario = new Usuario(identificador, contrasena);
        usuarios.add(usuario);
        return identificador;
}
    //Agregar Doctor
    public String agregarDoctor(int nUsuarios, String nombre, String contrasena, String especialidad) {
        doctores.add(new Doctor("D001", "doctor123", "Juan Perez", "Cardiología"));
        Scanner entrada = new Scanner(System.in);
        String identificador = "D0" + String.format("%02d", nUsuarios);
        System.out.println("El identificador es: " + identificador);
        System.out.print("Ingresa la contrasena: "); contrasena = entrada.nextLine();
        System.out.print("Ingresa el nombre completo del doctor: "); nombre = entrada.nextLine();
        System.out.print("Ingresa la especialidad del doctor: "); especialidad = entrada.nextLine();
        Doctor doctor = new Doctor(nombre, identificador, contrasena, especialidad);
        doctores.add(doctor);
        return identificador;
}
    //Agregar Pacientes 
    public String agregarPaciente(int nUsuarios,String nombre, String contrasena) {
        pacientes.add(new Paciente("P001", "paciente123", "María González"));
        Scanner entrada = new Scanner(System.in);
        String identificador = "P0" + String.format("%02d", nUsuarios);
        System.out.println("El identificador nuevo es: " + identificador);
        System.out.print("Ingresa la contrasena: "); contrasena = entrada.nextLine();
        System.out.print("Ingresa el nombre completo del paciente: "); nombre = entrada.nextLine();
        Paciente paciente = new Paciente(identificador, contrasena, nombre);
        pacientes.add(paciente);
        return identificador;
}
    //eliminar paciente
    public String eliminarPaciente(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el usuario del paciente: ");
        String identificador = entrada.nextLine();
        try{
            for(Paciente paciente : pacientes){
                if(paciente.getIdentificador().equals(identificador)){
                    pacientes.remove(paciente);
                    System.out.println("Paciente eliminado");
                    return "Paciente eliminado";
                }
            }
            throw new Exception("Paciente no encontrado");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "Paciente no encontrado";
    }
        public String eliminarDoctor(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el usuario del doctor: ");
        String identificador = entrada.nextLine();
        try{
            for(Doctor doctor : doctores){
                if(doctor.getIdentificador().equals(identificador)){
                    doctores.remove(doctor);
                    System.out.println("Doctor eliminado");
                    return "Doctor eliminado";
                }
            }
            throw new Exception("Dcotor no encontrado");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "Doctor no encontrado";
    }
        public String eliminarUsuario(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el usuario del paciente: ");
        String identificador = entrada.nextLine();
        try{
            for(Usuario usuario : usuarios){
                if(usuario.getIdentificador().equals(identificador)){
                    usuarios.remove(usuario);
                    System.out.println("Usuario eliminado");
                    return "Usuario eliminado";
                }
            }
            throw new Exception("Usuario no encontrado");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "Usuario no encontrado";
    }
    //Agregar cita
        public ArrayList<Cita> agregarCita() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese fecha de la cita (dd/mm/aaaa): ");
        String fecha = input.nextLine();
        System.out.print("Ingrese identificador del paciente: ");
        String identificadorPaciente = input.nextLine();
        System.out.print("Ingrese identificador del doctor: ");
        String identificadorDoctor = input.nextLine();

        Paciente paciente = null;
        Doctor doctor = null;

        // Buscar paciente y doctor correspondientes
        for (Paciente p : pacientes) {
            if (p.getIdentificador().equals(identificadorPaciente)) {
                paciente = p;
                break;
            }
        }
        for (Doctor d : doctores) {
            if (d.getIdentificador().equals(identificadorDoctor)) {
                doctor = d;
                break;
            }
        }
        if (paciente == null) {
            System.out.println("Paciente no encontrado.");
            return null;
        }

        if (doctor == null) {
            System.out.println("Doctor no encontrado.");
            return null;
        }
        Cita cita = new Cita(fecha, paciente, doctor);
        citas.add(cita);
        return citas;
    }
    //Eliminar cita
        public String eliminarCita(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el usuario del paciente: ");
        String identificador = entrada.nextLine();
        try{
            for(Cita cita : citas){
                if(cita.getPaciente().getIdentificador().equals(identificador)){
                    usuarios.remove(cita);
                    System.out.println("Cita eliminada");
                    return "Cita eliminada";
                }
            }
            throw new Exception("Cita no encontrada");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "Cita no encontrada";
    }
    public Cita buscarCita(String identificador) {
        for (Cita cita : citas) {
        if (cita.getPaciente().getIdentificador().equals(identificador)) {
            System.out.println(cita.mostrarInformacion());
            return cita;
            }
        }
        System.out.println("No se encontró ninguna cita para el paciente " + identificador);
        return null;
    }
        public Paciente buscarPaciente(String identificador) {
        for (Paciente paciente : pacientes) {
        if (paciente.getIdentificador().equals(identificador)) {
            System.out.println(paciente.mostrarInformacion());
            return paciente;
            }
        }
        System.out.println("No se encontró ningun paciente: " + identificador);
        return null;
    }
        public Doctor buscarDoctor(String identificador) {
        for (Doctor doctor : doctores) {
        if (doctor.getIdentificador().equals(identificador)) {
            System.out.println(doctor.mostrarInformacion());
            return doctor;
            }
        }
        System.out.println("No se encontró ningun doctor: " + identificador);
        return null;
    }
}
