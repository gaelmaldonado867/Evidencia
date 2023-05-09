/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

import java.util.Scanner;

/**
 *
 * @author Gael
 */
public class Cita {
    private String fecha;
    private Paciente paciente;
    private Doctor doctor;
    
        public Cita(String fecha, Paciente paciente, Doctor doctor) {
        this.fecha = fecha;
        this.paciente = paciente;
        this.doctor =  doctor;
    }

    public String getFecha() {
        return fecha;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void agregarCita() {
       Admin admin = new Admin();
        admin.agregarCita();
    }
    public void eliminarCita() {
        Admin admin = new Admin();
        admin.eliminarCita();
    }
}
