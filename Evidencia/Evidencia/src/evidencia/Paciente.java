/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

import java.util.Scanner;

/**
 *
 * @author Gael
 */
public class Paciente {
    private String nombre;
    private String identificador;
    private String contrasena;
    
    public Paciente(String identificador, String contrasena, String nombre){
        this.nombre = nombre;
        this.identificador = identificador;
        this.contrasena = contrasena;
    }

    Paciente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getNombre(){
        return nombre;
    }   
    public void mostrarInformacion() {
        System.out.println("Nombre: "+ nombre);
        System.out.println("Uusario: "+identificador);
        System.out.println("Contrasena: "+contrasena);
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
}
