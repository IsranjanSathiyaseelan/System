/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DBconnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import model.Appointments;

/**
 *
 * @author Isranjan
 */
public class AppointmentDAO {
    
    public void addAppointment(Appointments a){

    try{
        Connection con=DBconnection.getConnection();
        
        String sql = "INSERT INTO appointment "
                    + "(patient_id, patient_name, dentist_name, treatment_type, appointment_date, appointment_time, status) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pst=con.prepareStatement(sql);
        pst.setInt(1,a.getPatient_id());
        pst.setString(2,a.getPatient_name());
        pst.setString(3,a.getDentist_name());
        pst.setString(4,a.getTreatment_type());
        pst.setDate(5, Date.valueOf(a.getAppointment_date()));
        pst.setTime(6, Time.valueOf(a.getAppointment_time()));

        pst.executeUpdate();
        System.out.println("Appointment Added Successfully");
    }catch(Exception e){
        System.out.println(e);
    }
}
}




