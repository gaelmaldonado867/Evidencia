/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author AnaHeredia
 */
public class Lista {
    public List<String> Listas = new ArrayList();
    
    public Lista() {
        Listas.add("Perro");
        Listas.add("Computadora");
        Listas.add("Control");
        Listas.add("Zebra");
        Listas.add("Mariposa");
        Listas.add("Azul");
        Listas.add("Verde");
        Listas.add("Ballena");
        Listas.add("Numeros");
        Listas.add("Waltmart");
    }
    // Orden por Largo
    public void sortPorLargoAnonimos(){
        Listas.sort(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
    }
    public void sortPorLargoLamba(){
        Listas.sort((s1,s2) -> s1.compareTo(s2));
    }
    public void sortPorLargoReferencia(){
        Listas.sort(String::compareTo);
    }
    // Orden por Alfabeto 
    public void sortPorAlfabetoAnonimos(){
        Listas.sort(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }
    public void sortPorAlfabetoLamba(){
        Listas.sort((s1,s2) -> s1.compareTo(s2));
    }
    public void sortPorAlfabetoReferencia(){
        Listas.sort(String::compareTo);
    }
}