/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

/**
 *
 * @author Gael
 */
public class Paciente {
    private String nombre;
    private String correo;
    private String identificador;
    
    public Paciente(String nombre, String correo, String identificador){
        this.nombre = nombre;
        this.correo = correo;
        this.identificador = identificador;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public String getidentificador(){
        return identificador;
    }
    
}
