/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act;

import java.util.Scanner;

/**
 *
 * @author Gael
 */
public class Act12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AddressBook agenda = new AddressBook("contactos.txt");
        agenda.load();
        int op;
        do{
            System.out.print("Menu de opciones:\n 1.Lista de contactos\n 2.Agregar contacto\n 3.Eliminar contacto\n 4.Salir\n Ingresa una opcion: ");
            op = entrada.nextInt();
            switch(op){
                case 1:
                    agenda.list();
                    break;
                case 2:
                    agenda.create();
                    break;
                case 3:
                    agenda.delete();
                case 4:
                    System.out.println("Finalizo con exito");
                    break;
                default:
                    System.out.println("Opcion incorrecta\n Solo hay 1, 2, 3 y 4");
            }
        }while (op != 4);
    }
    
}
