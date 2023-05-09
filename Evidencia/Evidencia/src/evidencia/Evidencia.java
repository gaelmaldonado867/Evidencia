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
                            System.out.print("Bienvenido" + identificador+"\n Puedes hacer lo siguiente:\n 1.Crear un usuario nuevo\n 2.Crear una cita nueva\n 3.Eliminar un usuario\n "
                                    + "4.Eliminar un paciente\n 5.Eliminar un doctor\n 6.Eliminar una cita\n 7.Ver informacion de Paciente"
                                    + "\n 8.Ver informacion de un Doctor\n 9.Ver informacion de una cita\n 10.Salir");
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
                                        Paciente paciente = new Paciente();
                                        paciente.mostrarInformacion();
                                        break;
                                    case 8:
                                        Doctor doctor = new Doctor();
                                        doctor.mostrarInformacion();
                                        break;
                                    case 9:
                                        Cita cita = new Cita();
                                        cita.mostrarInformacion();
                                        break;
                                    case 10:
                                        System.out.println("Hasta luego");
                                        break;
                                    default:
                            }
                    }
            }
        }
    }catch(Exception e){
    
    }
    }
}
///java -jar <path>

