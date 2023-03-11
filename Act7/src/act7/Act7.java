/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act7;

import java.util.Scanner;



/**
 *
 * @author Gael
 */
public class Act7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, op;
        //ingresa el tamano del array
        System.out.print("Dame la cantidad de numeros n: ");
        n = entrada.nextInt();
        Metodos m = new Metodos();
        System.out.println("Opcion 1: Calcular numeros primos ");
        System.out.println("Opcion 2: Calcular sucesion fibonacci ");
        System.out.print("Dame una opcion: ");
        op = entrada.nextInt();
        switch(op){
            case 1:
                int [] primos = m.calprimos(n);
                for(int prim:primos){
                System.out.print(prim+", ");
            }
                break;
            case 2:
                int [] fib = m.sucesion(n);
                for(int i = 0; i<n; i++){
                    System.out.print(fib[i]+", ");
                }
                break;
            default:
                System.out.println("Esa opción no es correcta");
                break;
        }
    }
}
