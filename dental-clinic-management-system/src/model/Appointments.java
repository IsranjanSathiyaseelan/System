/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author Isranjan
 */
public class Appointments {
    private int appointment_num;
    private int patient_id;
    private String dentist_name;
    private String treatment_type;
    private LocalDate  appointment_date;
    private LocalTime  appointment_time;

    public int getAppointment_num() {
        return appointment_num;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public String getDentist_name() {
        return dentist_name;
    }

    public String getTreatment_type() {
        return treatment_type;
    }

    public LocalDate getAppointment_date() {
        return appointment_date;
    }

    public LocalTime getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_num(int appointment_num) {
        this.appointment_num = appointment_num;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public void setDentist_name(String dentist_name) {
        this.dentist_name = dentist_name;
    }

    public void setTreatment_type(String treatment_type) {
        this.treatment_type = treatment_type;
    }

    public void setAppointment_date(LocalDate appointment_date) {
        this.appointment_date = appointment_date;
    }

    public void setAppointment_time(LocalTime appointment_time) {
        this.appointment_time = appointment_time;
    }
}
