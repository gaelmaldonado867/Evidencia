/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act8;

/**
 *
 * @author Gael
 */
public class Card {
    public String palo;
    public String color;
    public String valor;
    
    public Card(String palo, String color, String valor){
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }
    public String getPalo(){
        return this.palo;
    }
    public void setPalo(String palo){
        this.palo = palo;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getValor(){
        return this.valor;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
}
