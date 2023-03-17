/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act8;

import java.util.Scanner;

/**
 *
 * @author Gael
 */
public class Act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        Deck deck = new Deck();
        System.out.println("Menu:\nOpcion 1: mezclar el Deck\n"
                           + "Opcion 2: mostrar la primera carta\n"
                           + "Opcion 3: mostrar una carta al azar\n"
                           + "Opcion 4: mostrar 5 cartas\n"
                           + "Opcion 5: Salir");
        while(op!=5){
            System.out.print("Dame la opcion que deseas: ");
            op = entrada.nextInt();
            switch (op){
                case 1:
                    deck.shuffle();
                    System.out.println();
                    break;
                case 2:
                    deck.head();
                    System.out.println();
                    break;
                case 3:
                    deck.pick();
                    System.out.println();
                    break;
                case 4:
                    deck.hand();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema");
                    break;
                default:
                    System.out.println("Esa no es una opcion");
                    break;
            }
        }
        
    }
    
}
