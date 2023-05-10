/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evidencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gael
 */
public class Evidencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //agregarDoctor(1, "Gael Banuelos", "doctor123", "Cardiología");
        //agregarPaciente(1, "paciente123", "María González");
        Menu();
}
    //MENU
    static void Menu(){
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("MensajesEvidencia.txt");
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                Admin admin = new Admin();
                Scanner entrada = new Scanner(System.in);
                escribir = new FileWriter(archivo,true); linea = new PrintWriter(escribir);
                ArrayList<Usuario> usuarios = new ArrayList<>();
                usuarios.add(new Usuario("U001", "admin123"));
                ArrayList<Paciente> pacientes = new ArrayList<>();
                pacientes.add(new Paciente("P001", "paciente123", "Maria Gonzalez"));
                ArrayList<Doctor> doctores = new ArrayList<>();
                doctores.add(new Doctor("D001", "Gael Banuelos", "doctor123", "Cardiología"));
                System.out.print("Ingrese su identificador: "); String identificador = entrada.nextLine(); linea.println("Usuario: "+identificador);
                System.out.print("Ingrese su contrasena: "); String contrasena = entrada.nextLine(); linea.println("Contraseña: "+contrasena);
        //Aquí empiezan los menús de métodos
            try{
                char tipoUsuario = identificador.charAt(0);
                boolean Correcto = false;
                int opcion = 0;
                String nombre, Paciente;
                switch(tipoUsuario){
                    case 'U':
                        for(Usuario usuario : usuarios){
                        if(usuario.getIdentificador().equals(identificador)&&usuario.getContrasena().equals(contrasena)){
                            Correcto = true;
                            break;
                        }
                    }
                        if(Correcto){
                            while(opcion != 10){
                                System.out.print("Bienvenido " + identificador+"\n Puedes hacer lo siguiente:\n 1.Crear un usuario nuevo\n 2.Crear una cita nueva\n 3.Eliminar un usuario\n "
                                    + "4.Eliminar un paciente\n 5.Eliminar un doctor\n 6.Eliminar una cita\n 7.Ver informacion de Paciente"
                                    + "\n 8.Ver informacion de un Doctor\n 9.Ver informacion de una cita\n 10.Salir\n Ingresa la opcion deseada: ");
                                opcion = entrada.nextInt(); linea.println("Opción "+opcion);
                                String id;
                                Scanner entrada2 = new Scanner(System.in);
                                switch(opcion){
                                    case 1:
                                        linea.println(admin.agregarUsuarios());
                                        break;
                                    case 2:
                                        linea.println(admin.agregarCita());
                                        break;
                                    case 3:
                                        linea.println(admin.eliminarUsuario());
                                        break;
                                    case 4:
                                        linea.println(admin.eliminarPaciente());
                                        break;
                                    case 5:
                                        linea.println(admin.eliminarDoctor());
                                        break;
                                    case 6: 
                                        linea.println(admin.eliminarCita());
                                        break;
                                    case 7:
                                        System.out.print("Dame el identificador del paciente: ");
                                        id = entrada2.nextLine(); linea.println("Dame el identificador del paciente: "+ id);
                                        linea.println(admin.buscarPaciente(id));
                                        break;
                                    case 8:
                                        System.out.print("Dame el identificador del doctor: ");
                                        id = entrada2.nextLine(); linea.print("Dame el identificador del doctor"+id);
                                        linea.println(admin.buscarDoctor(id));
                                        break;
                                    case 9:
                                        System.out.print("Dame el identificador del paciente: ");
                                        id = entrada2.nextLine(); linea.println("Dame el identificador del paciente con cita: "+id);
                                        linea.println(admin.buscarCita(id));
                                        break;
                                    case 10:
                                        System.out.println("Hasta luego"); linea.println("Hasta luego");
                                        break;
                                    default:
                                        System.out.println("Opcion Incorrecta!"); linea.println("Opcion Incorrecta!");
                                }
                        }
                    }else{
                            throw new Exception("Credenciales incorrectas");
                        }
                        escribir.close();
                        break;
                    case 'D':
                        for(Doctor doctor : doctores){
                            if(doctor.getIdentificador().equals(identificador)&&doctor.getContrasena().equals(contrasena)){
                                Correcto = true;
                                break;
                            }
                        }
                        if(Correcto){
                            while(opcion != 8){
                                System.out.print("Bienvenido " + identificador+"\n Puedes hacer lo siguiente:\n 1.Crear una cita nueva\n 2.Crear un paciente\n "
                                    + "3.Eliminar un paciente\n 4.Eliminar una cita\n 5.Ver informacion de Paciente"
                                    + "\n 6.Ver los datos de su usuario\n 7.Ver informacion de una cita\n 8.Salir\n Ingresa la opcion deseada: ");
                                opcion = entrada.nextInt(); linea.println("Opción "+opcion);
                                Scanner entrada3 = new Scanner(System.in);
                                String id;
                                switch(opcion){
                                    case 1:
                                        linea.println(admin.agregarCita());
                                        break;
                                    case 2:
                                        linea.println(admin.agregarPaciente(1, "", ""));
                                        break;
                                    case 3:
                                        linea.println(admin.eliminarPaciente());
                                        break;
                                    case 4:
                                        linea.println(admin.eliminarCita());
                                        break;
                                    case 5:
                                        System.out.print("Dame el identificador del paciente: ");
                                        id = entrada3.nextLine();linea.println("Dame el identificdor del paciente: "+id);
                                        linea.println(admin.buscarPaciente(id));
                                        break;
                                    case 6:
                                        linea.println(admin.buscarDoctor(identificador));
                                        break;
                                    case 7:
                                        System.out.print("Dame el identificador del paciente con cita: ");
                                        id = entrada3.nextLine();linea.println("Dame el identificdor del paciente con cita: "+id);
                                        linea.println(admin.buscarCita(id));
                                        break;
                                    case 8:
                                         System.out.println("Hasta luego");linea.println("Hasta luego");
                                        break;
                                    default:
                                        System.out.println("Opcion Incorrecta!");linea.println("Opción Incorrecta!");
                                }
                           }
                    }else{
                            throw new Exception("Credenciales incorrectas");
                        }
                        break;
                    case 'P':
                        for(Paciente paciente : pacientes){
                            if(paciente.getIdentificador().equals(identificador)&&paciente.getContrasena().equals(contrasena)){
                                Correcto = true;
                                break;
                            }
                        }
                        if(Correcto){
                            while(opcion != 4){
                                System.out.print("Bienvenido " + identificador+"\n Puedes hacer lo siguiente:\n 1.Crear una cita nueva\n 2.Ver los datos de su usuario\n "
                                    + "3.Ver informacion de una cita\n 4.Salir\n Ingresa la opcion deseada: ");
                                opcion = entrada.nextInt();linea.println("Opción "+opcion);
                                switch(opcion){
                                    case 1:
                                        linea.println(admin.agregarCita());
                                        break;
                                    case 2:
                                        linea.println(admin.buscarPaciente(identificador));
                                        break;
                                    case 3:
                                        linea.println(admin.buscarCita(identificador));
                                        break;
                                    case 4:
                                         System.out.println("Hasta luego");linea.println("Hasta luego");
                                        break;
                                    default:
                                        System.out.println("Opcion Incorrecta!");linea.println("Opción Incorrecta!");
                                }
                            }
                        }else{
                            throw new Exception("Credenciales incorrectas");
                        }
                        break;
            }
        }catch(Exception e){
            System.out.println("Eror: "+e.getMessage());
        } 
            } catch (IOException ex) {
                Logger.getLogger(Evidencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
                        try {
                Admin admin = new Admin();
                Scanner entrada = new Scanner(System.in);
                escribir = new FileWriter(archivo,true); linea = new PrintWriter(escribir);
                ArrayList<Usuario> usuarios = new ArrayList<>();
                usuarios.add(new Usuario("U001", "admin123"));
                ArrayList<Paciente> pacientes = new ArrayList<>();
                pacientes.add(new Paciente("P001", "paciente123", "María González"));
                ArrayList<Doctor> doctores = new ArrayList<>();
                doctores.add(new Doctor("D001", "Gael Banuelos", "doctor123", "Cardiología"));
                System.out.print("Ingrese su identificador: "); String identificador = entrada.nextLine(); linea.println("Usuario: "+identificador);
                System.out.print("Ingrese su contrasena: "); String contrasena = entrada.nextLine(); linea.println("Contraseña: "+contrasena);
        //Aquí empiezan los menús de métodos
            try{
                char tipoUsuario = identificador.charAt(0);
                boolean Correcto = false;
                int opcion = 0;
                String nombre, Paciente;
                switch(tipoUsuario){
                    case 'U':
                        for(Usuario usuario : usuarios){
                        if(usuario.getIdentificador().equals(identificador)&&usuario.getContrasena().equals(contrasena)){
                            Correcto = true;
                            break;
                        }
                    }
                        if(Correcto){
                            while(opcion != 10){
                                System.out.print("Bienvenido " + identificador+"\n Puedes hacer lo siguiente:\n 1.Crear un usuario nuevo\n 2.Crear una cita nueva\n 3.Eliminar un usuario\n "
                                    + "4.Eliminar un paciente\n 5.Eliminar un doctor\n 6.Eliminar una cita\n 7.Ver informacion de Paciente"
                                    + "\n 8.Ver informacion de un Doctor\n 9.Ver informacion de una cita\n 10.Salir\n Ingresa la opcion deseada: ");
                                opcion = entrada.nextInt(); linea.println("Opción "+opcion);
                                String id;
                                Scanner entrada2 = new Scanner(System.in);
                                switch(opcion){
                                    case 1:
                                        linea.println(admin.agregarUsuarios());
                                        break;
                                    case 2:
                                        linea.println(admin.agregarCita());
                                        break;
                                    case 3:
                                        linea.println(admin.eliminarUsuario());
                                        break;
                                    case 4:
                                        linea.println(admin.eliminarPaciente());
                                        break;
                                    case 5:
                                        linea.println(admin.eliminarDoctor());
                                        break;
                                    case 6: 
                                        linea.println(admin.eliminarCita());
                                        break;
                                    case 7:
                                        System.out.print("Dame el identificador del paciente: ");
                                        id = entrada2.nextLine(); linea.println("Dame el identificador del paciente: "+ id);
                                        linea.println(admin.buscarPaciente(id));
                                        break;
                                    case 8:
                                        System.out.print("Dame el identificador del doctor: ");
                                        id = entrada2.nextLine(); linea.print("Dame el identificador del doctor"+id);
                                        linea.println(admin.buscarDoctor(id));
                                        break;
                                    case 9:
                                        System.out.print("Dame el identificador del paciente: ");
                                        id = entrada2.nextLine(); linea.println("Dame el identificador del paciente con cita: "+id);
                                        linea.println(admin.buscarCita(id));
                                        break;
                                    case 10:
                                        System.out.println("Hasta luego"); linea.println("Hasta luego");
                                        break;
                                    default:
                                        System.out.println("Opcion Incorrecta!"); linea.println("Opcion Incorrecta!");
                                }
                        }
                    }else{
                            throw new Exception("Credenciales incorrectas");
                        }
                        escribir.close();
                        break;
                    case 'D':
                        for(Doctor doctor : doctores){
                            if(doctor.getIdentificador().equals(identificador)&&doctor.getContrasena().equals(contrasena)){
                                Correcto = true;
                                break;
                            }
                        }
                        if(Correcto){
                            while(opcion != 8){
                                System.out.print("Bienvenido " + identificador+"\n Puedes hacer lo siguiente:\n 1.Crear una cita nueva\n 2.Crear un paciente\n "
                                    + "3.Eliminar un paciente\n 4.Eliminar una cita\n 5.Ver informacion de Paciente"
                                    + "\n 6.Ver los datos de su usuario\n 7.Ver informacion de una cita\n 8.Salir\n Ingresa la opcion deseada: ");
                                opcion = entrada.nextInt(); linea.println("Opción "+opcion);
                                Scanner entrada3 = new Scanner(System.in);
                                String id;
                                switch(opcion){
                                    case 1:
                                        linea.println(admin.agregarCita());
                                        break;
                                    case 2:
                                        linea.println(admin.agregarPaciente(1, "", ""));
                                        break;
                                    case 3:
                                        linea.println(admin.eliminarPaciente());
                                        break;
                                    case 4:
                                        linea.println(admin.eliminarCita());
                                        break;
                                    case 5:
                                        System.out.print("Dame el identificador del paciente: ");
                                        id = entrada3.nextLine();linea.println("Dame el identificdor del paciente: "+id);
                                        linea.println(admin.buscarPaciente(id));
                                        break;
                                    case 6:
                                        linea.println(admin.buscarDoctor(identificador));
                                        break;
                                    case 7:
                                        System.out.print("Dame el identificador del paciente con cita: ");
                                        id = entrada3.nextLine();linea.println("Dame el identificdor del paciente con cita: "+id);
                                        linea.println(admin.buscarCita(id));
                                        break;
                                    case 8:
                                         System.out.println("Hasta luego");linea.println("Hasta luego");
                                        break;
                                    default:
                                        System.out.println("Opcion Incorrecta!");linea.println("Opción Incorrecta!");
                                }
                           }
                    }else{
                            throw new Exception("Credenciales incorrectas");
                        }
                        break;
                    case 'P':
                        for(Paciente paciente : pacientes){
                            if(paciente.getIdentificador().equals(identificador)&&paciente.getContrasena().equals(contrasena)){
                                Correcto = true;
                                break;
                            }
                        }
                        if(Correcto){
                            while(opcion != 4){
                                System.out.print("Bienvenido " + identificador+"\n Puedes hacer lo siguiente:\n 1.Crear una cita nueva\n 2.Ver los datos de su usuario\n "
                                    + "3.Ver informacion de una cita\n 4.Salir\n Ingresa la opcion deseada: ");
                                opcion = entrada.nextInt();linea.println("Opción "+opcion);
                                switch(opcion){
                                    case 1:
                                        linea.println(admin.agregarCita());
                                        break;
                                    case 2:
                                        linea.println(admin.buscarPaciente(identificador));
                                        break;
                                    case 3:
                                        linea.println(admin.buscarCita(identificador));
                                        break;
                                    case 4:
                                         System.out.println("Hasta luego");linea.println("Hasta luego");
                                        break;
                                    default:
                                        System.out.println("Opcion Incorrecta!");linea.println("Opción Incorrecta!");
                                }
                            }
                        }else{
                            throw new Exception("Credenciales incorrectas");
                        }
                        break;
            }
        }catch(Exception e){
            System.out.println("Eror: "+e.getMessage());
        } 
            } catch (IOException ex) {
                Logger.getLogger(Evidencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static void agregarDoctor(int nUsuarios, String nombre, String contrasena, String especialidad) {
        String identificador = "D0" + String.format("%02d", nUsuarios);
        ArrayList<Doctor> doctores = new ArrayList<>();
        doctores.add(new Doctor("D001", "Gael Banuelos", "doctor123", "Cardiología"));
        Doctor doctor = new Doctor(identificador, nombre, contrasena, especialidad);
        doctores.add(0,doctor);
    }
    private static void agregarPaciente(int nUsuarios, String nombre, String contrasena){
        String identificador = "P0" + String.format("%02d", nUsuarios);
        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("P001", "paciente123", "María González"));
        Paciente paciente = new Paciente(identificador, contrasena, nombre);
        pacientes.add(0, paciente);
    }
    
}
///java -jar <path>

