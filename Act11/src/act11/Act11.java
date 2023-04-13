/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act11;

import java.util.Scanner;

/**
 *
 * @author Gael
 */
public class Act11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int x;
        int y;
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Las opciones son: \n 1.Circulo\n 2.Cuadro\n 3.Triangulo equilatero\n 4.Salir");
            System.out.print("Dame la opcion que deseas: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: 
                    System.out.print("Dame el valor del radio: ");
                    x = entrada.nextInt();
                    Circle circle = new Circle(x);
                    System.out.println("Eligio el circulo\n Las opciones son:\n 1.Medir area\n 2.Medir perimetro");
                    System.out.print("dame la opcion que deseas: ");
                    y = entrada.nextInt();
                    switch(y){
                        case 1: 
                            System.out.println("Area del ciculo: "+circle.area());
                            break;
                        case 2:
                            System.out.println("Perimetro del circulo: "+circle.perimeter());
                        default:
                            System.out.println("Esa no es una opción");
                    }
                    break;
                case 2:
                    System.out.print("Dame el valor del lado: ");
                    x = entrada.nextInt();
                    Square square = new Square(x);
                    System.out.println("Eligio el cuadrado\n Las opciones son:\n 1.Medir area\n 2.Medir perimetro");
                    System.out.print("dame la opcion que deseas: ");
                    y = entrada.nextInt();
                    switch(y){
                        case 1: 
                            System.out.println("Area del cuadrado: "+square.area());
                            break;
                        case 2:
                            System.out.println("Perimetro del cuadrado: "+square.perimeter());
                            break;
                        default:
                            System.out.println("Esa no es una opción");
                    }
                    break;
                case 3:
                    System.out.print("Dame el valor del lado: ");
                    x = entrada.nextInt();
                    Triangle triangle = new Triangle(x);
                    System.out.println("Eligio el cuadrado\n Las opciones son:\n 1.Medir area\n 2.Medir perimetro");
                    System.out.print("dame la opcion que deseas: ");
                    y = entrada.nextInt();
                    switch(y){
                        case 1: 
                            System.out.println("Area del trinagulo: "+triangle.area());
                            break;
                        case 2:
                            System.out.println("Perimetro del triangulo: "+triangle.perimeter());
                            break;
                        default:
                            System.out.println("Esa no es una opción");
                    }
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }while(opcion != 4);
        
    }
}
