/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gael
 */
public class AddressBook {
    public Map<String, String> contactos;
    public String filePath;
    
    public AddressBook(String filePath){
        this.contactos = new HashMap<>();
        this.filePath = filePath;
    }
    public void load(){
        String inputFilename = "contactos.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFilename))){
            String line;
            while((line= reader.readLine()) != null){
                String [] contact = line.split(":");
                String numero = contact[0];
                String nombre = contact[1];
                this.contactos.put(numero, nombre);
            }
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo "+e);
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
    }
    public void save(){
        try (BufferedWriter write = new BufferedWriter(new FileWriter(this.filePath))){
            for(Map.Entry<String, String> entry : this.contactos.entrySet()){
                String numero = entry.getKey();
                String nombre = entry.getValue();
                write.write(numero + ","+ nombre);
                write.newLine();
            }
        }catch (IOException e){
            System.out.println("Error al guardar");
        }
    }
    public void list(){
        System.out.println("Contactos:");
        for(Map.Entry<String, String> entry : this.contactos.entrySet()){
            String numero = entry.getKey();
            String nombre = entry.getValue();
            System.out.println(numero+","+nombre);
            
        }
    }
    public void create(){
        Scanner entrada = new Scanner(System.in);
        String numero, nombre;
        System.out.print("Dame el numero de telfono: "); numero = entrada.nextLine();
        System.out.print("Dame el nombre del contacto: "); nombre = entrada.nextLine();
        this.contactos.put(numero, nombre);
    }
    public void delete(){
        Scanner entrada = new Scanner(System.in);
        String numero;
        System.out.print("dame el contacto a eliminar: ");numero = entrada.nextLine();
        if(this.contactos.containsKey(numero)){
            this.contactos.remove(numero);
            System.out.println("el contacto se elimino con exito");
        }else{
            System.out.println("El contacto no se encontro");
        }
    }
}
