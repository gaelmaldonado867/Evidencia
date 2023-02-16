/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act3;

import java.util.Scanner;

/**
 *
 * @author AnaHeredia
 */
public class Act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1 Sumar 16% a un producto
        ejercicio1();
        // Ejercicio 2 Saber si un numero es par o impar
        ejercicio2();
        // Ejercicio 3 Comparar 4 n umeros y sacar el mayor
        ejercicio3();
        // Ejercicio 4 Calcular el factorial de un numero
        ejercicio4();
    }
    
    static void ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        float a,b,c;
        System.out.print("Dame el valor del producto: ");
        a = entrada.nextFloat();
        b = (float)(a*0.16);
        c = a+b;
        System.out.println("El 16% del producto es: "+b);
        System.out.println("El valor del producto mas 16%: "+c);
    }
    
    static void ejercicio2(){
        Scanner entrada = new Scanner(System.in);
        int a;
        System.out.print("Dame el valor del numero: ");
        a = entrada.nextInt();
        if (a%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
    static void ejercicio3(){
        Scanner entrada = new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Dame el valor de A: ");
        a = entrada.nextInt();
        System.out.print("Dame el valor de B: ");
        b = entrada.nextInt();
        System.out.print("Dame el valor de C: ");
        c = entrada.nextInt();
        System.out.print("Dame el valor de D: ");
        d = entrada.nextInt();
        if (a>b&&a>c&&a>d){
            System.out.println("El valor de A es mayor");
        }else{
            if(b>c&&b>d){
                System.out.println("El valor de B es mayor");
            }else{
                if(c>d){
                    System.out.println("El valor de C es mayor");
                }else{
                    System.out.println("El valor de D es mayor");
                }
            }
        }
    }
    
    static void ejercicio4(){
        Scanner entrada = new Scanner(System.in);
        int a,n=1;
        System.out.print("Dame el valor del numero: ");
        a = entrada.nextInt();
        if(a>=0){
         for(int i = 1; i<=a; i++){
             n=i*n;
             System.out.println(n);
         }   
        }else{
            System.out.println("EL numero es menor a 0");
        }
        System.out.print("El factorial es: "+n);
    }
}
