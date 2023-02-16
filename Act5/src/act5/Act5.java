/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act5;

import java.util.Scanner;


/**
 *
 * @author Gael
 */
public class Act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Las opciones son las siguientes: ");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        System.out.println("5. modulo");
        System.out.print("Dame la opcion que deseas: ");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                opcion1();
                break;
            case 2:
                opcion2();
                break;
            case 3: 
                opcion3();
                break;
            case 4: 
                opcion4();
                break;
            case 5:
                opcion5();
                break;
            default:
                System.out.println("Esa opcion no es valida");
                break;
        }
                
    }
    // Suma
    static void opcion1(){
        Scanner entrada = new Scanner(System.in);
        float x, y, s;
        System.out.print("Dame el valor de X: "); x = entrada.nextFloat();
        System.out.print("Dame el valor de Y: "); y = entrada.nextFloat();
        s = x+y;
        System.out.println("El valor de la suma es: "+s);
    }
    // Resta
    static void opcion2(){
        Scanner entrada = new Scanner(System.in);
        float x, y, r;
        System.out.print("Dame el valor de X: "); x = entrada.nextFloat();
        System.out.print("Dame el valor de Y: "); y = entrada.nextFloat();
        r = x-y;
        System.out.println("El valor de la resta es: "+r);
    }
    // Multiplicacion
    static void opcion3(){
        Scanner entrada = new Scanner(System.in);
        float x, y, m;
        System.out.print("Dame el valor de X: "); x = entrada.nextFloat();
        System.out.print("Dame el valor de Y: "); y = entrada.nextFloat();
        m = x*y;
        System.out.println("El valor de la multiplicacion es: "+m);
    }
    // Division
    static void opcion4(){
        Scanner entrada = new Scanner(System.in);
        double x, y, d;
        System.out.print("Dame el valor de X: "); x = entrada.nextDouble();
        System.out.print("Dame el valor de Y: "); y = entrada.nextDouble();
        d = x/y;
        System.out.println("El valor de la division es: "+d);
    }
    // Modulo
    static void opcion5(){
        Scanner entrada = new Scanner(System.in);
        double x, y, M;
        System.out.print("Dame el valor de X: "); x = entrada.nextDouble();
        System.out.print("Dame el valor de Y: "); y = entrada.nextDouble();
        M = x%y;
        System.out.println("El valor del modulo es: "+M);
    }
}
    
    

