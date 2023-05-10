/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evidencia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gael
 */
public class Evidencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu();
}
    static void Menu(){
        Admin admin = new Admin();
        Scanner entrada = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("U01", "admin123"));
        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("P01", "paciente123", "María González"));
        ArrayList<Doctor> doctores = new ArrayList<>();
        doctores.add(new Doctor("D01", "doctor123", "Juan Perez", "Cardiología"));
        System.out.print("Ingrese su identificador: "); String identificador = entrada.nextLine();
        System.out.print("Ingrese su contrasena: "); String contrasena = entrada.nextLine();
        //Aquí empiezan los menús de métodos
        try{
            char tipoUsuario = identificador.charAt(0);
            boolean Correcto = false;
            int opcion = 0;
            String nombre, Paciente, id;
            switch(tipoUsuario){
                case 'U':
                    for(Usuario usuario : usuarios){
                    if(usuario.getIdentificador().equals(identificador)&&usuario.getContrasena().equals(contrasena)){
                        Correcto = true;
                        break;
                    }
                }
                    if(Correcto){
                        while(opcion != 12){
                            System.out.print("Bienvenido " + identificador+"\n Puedes hacer lo siguiente:\n 1.Crear un usuario nuevo\n 2.Crear una cita nueva\n 3.Eliminar un usuario\n "
                                    + "4.Eliminar un paciente\n 5.Eliminar un doctor\n 6.Eliminar una cita\n 7.Ver informacion de Paciente"
                                    + "\n 8.Ver informacion de un Doctor\n 9.Ver informacion de una cita\n 10.Salir\n Ingresa la opcion deseada: ");
                            opcion = entrada.nextInt();
                            switch(opcion){
                                    case 1:
                                        admin.agregarUsuarios();
                                        break;
                                    case 2:
                                        admin.agregarCita();
                                        break;
                                    case 3:
                                        admin.eliminarUsuario();
                                        break;
                                    case 4:
                                        admin.eliminarPaciente();
                                        break;
                                    case 5:
                                        admin.eliminarDoctor();
                                        break;
                                    case 6: 
                                        admin.eliminarCita();
                                        break;
                                    case 7:
                                        System.out.print("Dame el identificador del paciente: ");
                                        id = entrada.nextLine();
                                        admin.buscarPaciente(id);
                                        break;
                                    case 8:
                                        System.out.print("Dame el identificador del doctor: ");
                                        id = entrada.nextLine();
                                        admin.buscarDoctor(id);
                                        break;
                                    case 9:
                                        System.out.print("Dame el identificador del paciente: ");
                                        id = entrada.nextLine();
                                        admin.buscarCita(id);
                                        break;
                                    case 10:
                                        System.out.println("Hasta luego");
                                        break;
                                    default:
                                        System.out.println("Opcion Incorrecta!");
                            }
                    }
            }else{
                        throw new Exception("Credenciales incorrectas");
                    }
                    break;
                case 'D':
                    for(Doctor doctor : doctores){
                        if(doctor.getIdentificador().equals(identificador)&&doctor.getContrasena().equals(contrasena)){
                            Correcto = true;
                            break;
                        }
                    }
                    if(Correcto){
                        while(opcion != 12){
                            System.out.print("Bienvenido " + identificador+"\n Puedes hacer lo siguiente:\n 1.Crear una cita nueva\n 2.Crear un paciente\n "
                                    + "3.Eliminar un paciente\n 4.Eliminar una cita\n 5.Ver informacion de Paciente"
                                    + "\n 6.Ver los datos de su usuario\n 7.Ver informacion de una cita\n 8.Salir");
                            opcion = entrada.nextInt();
                            switch(opcion){
                                    case 1:
                                        admin.agregarCita();
                                        break;
                                    case 2:
                                        admin.agregarPaciente(pacientes.size(), "", "");
                                        break;
                                    case 3:
                                        admin.eliminarPaciente();
                                        break;
                                    case 4:
                                        admin.eliminarCita();
                                        break;
                                    case 5:
                                        System.out.print("Dame el identificador del paciente: ");
                                        id = entrada.nextLine();
                                        admin.buscarPaciente(id);
                                        break;
                                    case 6:
                                        admin.buscarDoctor(identificador);
                                    case 7:
                                        System.out.print("Dame el identificador del paciente: ");
                                        id = entrada.nextLine();
                                        admin.buscarCita(id);
                                        break;
                                    case 8:
                                         System.out.println("Hasta luego");
                                        break;
                                    default:
                                        System.out.println("Opcion Incorrecta!");
                            }
                    }
            }else{
                        throw new Exception("Credenciales incorrectas");
                    }
                    break;
        }
    }catch(Exception e){
    
    }
    }
}
///java -jar <path>

