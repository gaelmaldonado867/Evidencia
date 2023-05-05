/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act13;


/**
 *
 * @author Gael
 */
public class Act13 {

   
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println("Orden por largo:");
        lista.sortPorLargoAnonimos();
        System.out.println("Orden por largo con Anonimos:"+ lista.Listas);
        lista.sortPorLargoLamba();
        System.out.println("Orden por largo con Lambda:"+ lista.Listas);
        lista.sortPorLargoReferencia();
        System.out.println("Orden por largo con Referencia:"+ lista.Listas);
        System.out.println("Orden por alfabeto:");
        lista.sortPorAlfabetoAnonimos();
        System.out.println("Orden por alfabeto con Anonimos:"+ lista.Listas);
        lista.sortPorAlfabetoLamba();
        System.out.println("Orden por alfabeto con Lambda:"+ lista.Listas);
        lista.sortPorAlfabetoReferencia();
        System.out.println("Orden por alfabeto con Referencia:"+ lista.Listas);
    }
    
}
