/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

import java.util.ArrayList;
import java.util.Iterator;
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
    //Agregar usuarios
    private void agregarUsuario(){
        Scanner entrada = new Scanner(System.in);
        int nUsuarios = usuarios.size();
        String identificador = "U" + String.format("%02d", nUsuarios);
        System.out.println("El identificador nuevo es: "+identificador);
        System.out.print("Favor de ingresar la contrasena nueva: ");
        String contrasena = entrada.nextLine();
        Usuario usuario = new Usuario(identificador,contrasena);
        usuarios.add(usuario);
    }
    //Eliminar usuario
    private void eliminrUsuario(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dame el usuario para eliminarlo: ");
        String identificador = entrada.nextLine();
        try{
            boolean Encontrado = false; 
            Iterator <Usuario> buscar = usuarios.iterator();
            while(buscar.hasNext()){
                Usuario usuarios = buscar.next();
                if(usuarios.getIdentificador().equals(identificador)){
                    buscar.remove();
                    Encontrado = true;
                    System.out.println("El usuario se removio con exito");
                }
            }
            if(!Encontrado){
                throw new Exception ("Usuario no encontrado");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    //Agregar Paciente
    private void agregarPaciente(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el nombre del Paciente: ");String nombre = entrada.nextLine();
        System.out.print("Ingresa el correo del Paciente: ");String correo = entrada.nextLine();
        System.out.print("Ingresa el identificador del Paciente: "); String identificador = entrada.nextLine();
        Paciente paciente = new Paciente(nombre,correo,identificador);
        pacientes.add(paciente);
    }
    //eliminar paciente
    private void eliminarPaciente(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el usuario del paciente: ");
        String identificador = entrada.nextLine();
        try{
            for(Paciente paciente : pacientes){
                if(paciente.getidentificador().equals(identificador)){
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
    
}
