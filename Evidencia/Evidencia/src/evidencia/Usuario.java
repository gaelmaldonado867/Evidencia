/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

/**
 *
 * @author Gael
 */
public class Usuario {
    private String identificador;
    private String contrasena;

    public Usuario(String identificador, String contrasena) {
        this.identificador = identificador;
        this.contrasena = contrasena;
    }
     public String getIdentificador(){
        return identificador;
    }
    public String getContrasena(){
        return contrasena;
    }
}
