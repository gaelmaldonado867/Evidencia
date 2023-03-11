/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act7;



/**
 *
 * @author Gael
 */
public class Metodos {
    
   public  int[] calprimos(int n){
        int con = 0, num = 2;
        int [] primos = new int[n];
        while(con<n){
            if(si(num)){
                primos[con] = num;
                con++;
            }
            num++;
       }
        return primos;
    }
   // Metodo para saber si es primo o no es primo
   private boolean si(int nume){
       if(nume <=1){
           return false;
       }
       for(int i = 2; i<=Math.sqrt(nume);i++){
           if(nume % i == 0){
               return false;
           }
       }
       return true;
   }
   public int [] sucesion(int n){
       int con = 0;
       int[] fibonacci = new int[n];
       if(n>1){
           fibonacci[1] = 1;
           con = 2;
           while(con<n){
               fibonacci[con] = fibonacci[con-1] + fibonacci[con-2];
               con++;
           }
       }
       return fibonacci;
   }

}

