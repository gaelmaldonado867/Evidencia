/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act6;

/**
 *
 * @author Gael
 */
public class Act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       alumnos al = new alumnos();
       System.out.println("El nombre del alumno es: "+al.getAlumno());
       System.out.println("las calificaciones son: ");
       int[] cal = al.getCalificaciones();
       for(int i = 0; i<cal.length;i++){
           System.out.println("Calificacion"+(i+1)+": "+cal[i]);
       }
       al.promedio();
       al.cali();
    }
    
}
