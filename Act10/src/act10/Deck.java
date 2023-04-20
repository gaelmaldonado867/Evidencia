/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gael
 */
public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>(52);
    
    public Deck(){
        String[] palos = {"trebol","picas","corazones","diamantes"};
        String[] colores = {"rojo","negro"};
        String[] valores = {"A","2","3","4","5","6","7","8","9,","10","J","Q","K"};
        for(String palo : palos){
            for(String color : colores){
                for(String valor : valores){
                    if(cards.size()<52){
                        this.cards.add(new Card(palo,color,valor));
                    }else{
                        break;
                    }
                }
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(this.cards);
        System.out.println("Se mezclo el Deck");
    }
    public Card head() throws Exception {
        if(this.cards.size() == 0){
            throw new Exception("Se han agotado las cartas");
        }else{
            Card card = this.cards.get(0);
            this.cards.remove(0);
            System.out.println("La carta que se saco fue: ");
            System.out.println(card.getPalo()+" / "+card.getColor()+" / "+card.getValor());
            System.out.println("Quedan "+cards.size()+" Cartas en el Dezk");
            return card;
        }
    }
    public Card pick() throws Exception {
        if(this.cards.size() == 0){
            throw new Exception("Se han agotado las cartas");
        }else{
            int num = (int)(Math.random()*cards.size());
            Card card = this.cards.get(num);
            this.cards.remove(num);
            System.out.println("La carta que se saco fue: ");
            System.out.println(card.getPalo()+" / "+card.getColor()+" / "+card.getValor());
            System.out.println("Quedan "+cards.size()+" Cartas en el Dezk");
            return card;
        }
    }
    public ArrayList<Card> hand() throws Exception{
        if(cards.size()<5){
            throw new Exception("Se han agotado las cartas");
        }else{
            ArrayList<Card>hand = new ArrayList<Card>();
            for(int i = 0; i<5; i++){
                Card Card = this.cards.get(i);
                this.cards.remove(i);
                hand.add(Card);
                System.out.println(Card.getPalo()+" / "+Card.getColor()+" / "+Card.getValor());
                
            }
            System.out.println("Quedan "+cards.size()+" crtas en el deck");
            return hand;
        }
    }
    public ArrayList<Card> cambio(int numCambios) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int ncam;
        System.out.print("Ingrese el numero de cambios: ");
        ncam = entrada.nextInt();
        if (ncam > 5) {
            System.out.println("El numero maximo de cambios es 5");
            return null;
        } else 
            if (ncam > cards.size()) {
                throw new Exception("Se han agotado las cartas");
        } else {
                ArrayList<Card> cambio = new ArrayList<Card>();
                for (int i = 0; i < ncam; i++) {
                    Card card = this.cards.get(i);
                    this.cards.remove(i);
                    cambio.add(card);
                }
                for (int i = 0; i < ncam; i++) {
                    Card card = this.cards.get(0);
                    this.cards.remove(0);
                    cambio.add(card);
                    System.out.println(card.getPalo() + " / " + card.getColor() + " / " + card.getValor());
                }
                System.out.println("Quedan " + cards.size() + " cartas en el deck");
                return cambio;
            }
        }
}
