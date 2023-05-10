/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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
    public void agregarUsuarios(){
    Scanner entrada = new Scanner(System.in);
    int nUsuarios = usuarios.size();
    String tipoUsuario;
    String identificador, contrasena = null, nombre = null, especialidad = null;

    do {
        System.out.print("Que tipo de usuario desea agregar (A = Administrador, D = Doctor, P = Paciente): ");
        tipoUsuario = entrada.nextLine().toUpperCase();
    } while (!tipoUsuario.equals("A") && !tipoUsuario.equals("D") && !tipoUsuario.equals("P"));

    switch (tipoUsuario) {
        case "A":
            agregarUsuario(nUsuarios, contrasena);
            break;
        case "D":
            agregarDoctor(nUsuarios, nombre, contrasena, especialidad);
            break;
        case "P":
            agregarPaciente(nUsuarios, nombre, contrasena);
            break;
        default:
            System.out.println("¡Esa no es una opcion!");
    }
}
    public void agregarUsuario(int nUsuarios, String contrasena) {
        usuarios.add(new Usuario("U01", "admin123"));
        Scanner entrada = new Scanner(System.in);
        String identificador = "U0" + String.format("%02d", nUsuarios);
        System.out.println("El identificador es: " + identificador);
        System.out.print("Ingresa la contrasena: "); contrasena = entrada.nextLine();
        Usuario usuario = new Usuario(identificador, contrasena);
        usuarios.add(usuario);
        
}
    //Agregar Doctor
    public void agregarDoctor(int nUsuarios, String nombre, String contrasena, String especialidad) {
        doctores.add(new Doctor("D01", "doctor123", "Juan Perez", "Cardiología"));
        Scanner entrada = new Scanner(System.in);
        String identificador = "D0" + String.format("%02d", nUsuarios);
        System.out.println("El identificador es: " + identificador);
        System.out.print("Ingresa la contrasena: "); contrasena = entrada.nextLine();
        System.out.print("Ingresa el nombre completo del doctor: "); nombre = entrada.nextLine();
        System.out.print("Ingresa la especialidad del doctor: "); especialidad = entrada.nextLine();
        Doctor doctor = new Doctor(identificador, contrasena, nombre, especialidad);
        doctores.add(doctor);
}
    //Agregar Pacientes 
    public void agregarPaciente(int nUsuarios,String nombre, String contrasena) {
        pacientes.add(new Paciente("P01", "paciente123", "María González"));
        Scanner entrada = new Scanner(System.in);
        String identificador = "P0" + String.format("%02d", nUsuarios);
        System.out.println("El identificador nuevo es: " + identificador);
        System.out.print("Ingresa la contrasena: "); contrasena = entrada.nextLine();
        System.out.print("Ingresa el nombre completo del paciente: "); nombre = entrada.nextLine();
        Paciente paciente = new Paciente(identificador, contrasena, nombre);
        pacientes.add(paciente);
}
    //eliminar paciente
    public void eliminarPaciente(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el usuario del paciente: ");
        String identificador = entrada.nextLine();
        try{
            for(Paciente paciente : pacientes){
                if(paciente.getIdentificador().equals(identificador)){
                    pacientes.remove(paciente);
                    System.out.println("Paciente eliminado");
                    return;
                }
            }
            throw new Exception("Paciente no encontrado");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
        public void eliminarDoctor(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el usuario del doctor: ");
        String identificador = entrada.nextLine();
        try{
            for(Doctor doctor : doctores){
                if(doctor.getIdentificador().equals(identificador)){
                    doctores.remove(doctor);
                    System.out.println("Doctor eliminado");
                    return;
                }
            }
            throw new Exception("Dcotor no encontrado");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
        public void eliminarUsuario(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el usuario del paciente: ");
        String identificador = entrada.nextLine();
        try{
            for(Usuario usuario : usuarios){
                if(usuario.getIdentificador().equals(identificador)){
                    usuarios.remove(usuario);
                    System.out.println("Usuario eliminado");
                    return;
                }
            }
            throw new Exception("Usuario no encontrado");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    //Agregar cita
        public void agregarCita() {
        
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
            return;
        }

        if (doctor == null) {
            System.out.println("Doctor no encontrado.");
            return;
        }
        Cita cita = new Cita(fecha, paciente, doctor);
        citas.add(cita);
    }
    //Eliminar cita
    public void eliminarCita() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese fecha de la cita a eliminar (dd/mm/aaaa): ");
        String fecha = input.nextLine();
    }
    public void buscarCita(String identificador) {
        for (Cita cita : citas) {
        if (cita.getPaciente().getIdentificador().equals(identificador)) {
            System.out.println(cita.mostrarInformacion());
            return;
            }
        }
        System.out.println("No se encontró ninguna cita para el paciente " + identificador);
    }
        public void buscarPaciente(String identificador) {
        for (Paciente paciente : pacientes) {
        if (paciente.getIdentificador().equals(identificador)) {
            System.out.println(paciente.mostrarInformacion());
            return;
            }
        }
        System.out.println("No se encontró ningun paciente: " + identificador);
    }
        public void buscarDoctor(String identificador) {
        for (Doctor doctor : doctores) {
        if (doctor.getIdentificador().equals(identificador)) {
            System.out.println(doctor.mostrarInformacion());
            return;
            }
        }
        System.out.println("No se encontró ningun doctor: " + identificador);
    }
}
