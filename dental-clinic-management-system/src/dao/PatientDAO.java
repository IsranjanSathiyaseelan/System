/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Patient;
import java.sql.ResultSet;

/**
 *
 * @author Isranjan
 */
public class PatientDAO {
        // Add Patient
    public void addPatient(Patient p) {
        try {
            Connection con = DBconnection.getConnection();

            String sql = "INSERT INTO patient(patient_name, address, contact_number, gender, date_of_birth) VALUES(?,?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, p.getPatientName());
            pst.setString(2, p.getAddress());
            pst.setString(3, p.getContactNumber());
            pst.setString(4, p.getGender());
            pst.setDate(5, java.sql.Date.valueOf(p.getDateOfBirth()));

            pst.executeUpdate();

            System.out.println("Patient Added Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
        // View All Patients
    public ResultSet getAllPatients() {
        ResultSet rs = null;

        try {
            Connection con = DBconnection.getConnection();
            String sql = "SELECT * FROM patient";
            PreparedStatement pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

        } catch (Exception e) {
            System.out.println(e);
        }

        return rs;
    }
    
     // Update Patient
    public void updatePatient(Patient p) {

        try {

            Connection con = DBconnection.getConnection();

            String sql = "UPDATE patient SET patient_name=?, address=?, contact_number=?, gender=?, date_of_birth=? WHERE patient_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, p.getPatientName());
            pst.setString(2, p.getAddress());
            pst.setString(3, p.getContactNumber());
            pst.setString(4, p.getGender());
            pst.setDate(5, java.sql.Date.valueOf(p.getDateOfBirth()));
            pst.setInt(6, p.getPatientId());
            pst.executeUpdate();
            System.out.println("Patient Updated Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Delete Patient
    public void deletePatient(int patientId) {

        try {
            Connection con = DBconnection.getConnection();
            String sql = "DELETE FROM patient WHERE patient_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, patientId);
            pst.executeUpdate();
            System.out.println("Patient Deleted Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

        // Search Patient by ID
    public ResultSet searchPatient(int patientId) {
        ResultSet rs = null;

        try {
            Connection con = DBconnection.getConnection();
            String sql = "SELECT * FROM patient WHERE contact_number = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, patientId);

            rs = pst.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }
}
