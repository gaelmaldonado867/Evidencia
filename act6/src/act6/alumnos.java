/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act6;

import java.util.Scanner;

/**
 *
 * @author Gael
 */



public class alumnos {
    public String nombre;
    public int[] calificaciones;
    public float suma;
    public float prom;
    
    public alumnos(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dame el nombre del alumno: "); this.nombre = entrada.nextLine();
        this.calificaciones = new int[5];
        System.out.println("Dame las 5 calificaciones: ");
        for(int i = 0; i<this.calificaciones.length; i++){
            System.out.print("Calificacion "+(i+1)+": ");
            this.calificaciones[i] = entrada.nextInt();
        }
    }
    public String getAlumno(){
        return this.nombre;
    }
    public int[] getCalificaciones(){
        return this.calificaciones;
    }
    
    public void promedio(){
         suma = 0;
         prom = 0;
        for(int i=0; i<this.calificaciones.length; i++){
            suma +=this.calificaciones[i];
        }
        prom = suma / this.calificaciones.length;
       
    }
    public void cali(){
        promedio();
         if(prom<=50){
            System.out.println("Tu promedio es de: "+prom+" entonces F");
        }else{
            if(prom>=51&&prom<=60){
                System.out.println("Tu promedio es de: "+prom+" entonces E");
            }else{
                if(prom>061&&prom<=70){
                    System.out.println("Tu promedio es de: "+prom+" entonces D");
                }else{
                    if(prom>=71&&prom<=80){
                        System.out.println("Tu promedio es de: "+prom+" entonces C");
                    }else{
                        if(prom>=81&&prom<=90){
                            System.out.println("Tu promedio es de: "+prom+" entonces B");
                        }else{
                            if(prom>=91&&prom<=100){
                                System.out.println("Tu promedio es de: "+prom+" entonces A");
                            }
                        }
                    }
                }
            }
        }
    }
}
