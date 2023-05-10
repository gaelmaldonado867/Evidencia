/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

import java.util.ArrayList;

/**
 *
 * @author Gael
 */
public class Doctor {
    private ArrayList<Paciente> pacientes;
    private String nombre;
    private String identificador;
    private String contrasena;
    private String especialidad; 
    
    public Doctor(String nombre, String identificador, String contrasena, String especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.identificador = identificador;
        this.contrasena = contrasena;
    }

    Doctor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getIdentificador() {
        return identificador;
    }
    public String getContrasena(){
        return contrasena;
    }
    public String getUsuario(){
        return identificador + "//" + contrasena;
    }
     public String mostrarInformacion() {
         return "Doctor: "+nombre+", Especialidad: "+especialidad+", Identificador: "+identificador+", Contrasena: "+contrasena;
     }
    public void buscar(){
        Admin admin = new Admin();
        admin.buscarDoctor(identificador);
    }
} 