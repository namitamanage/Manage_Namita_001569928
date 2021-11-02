/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author namita
 */
public class PatientDirectory {
     private List<Patient> patientDirectory;

    public PatientDirectory() {
        patientDirectory = new ArrayList<>();
    }

    public List<Patient> getpatientDirectory() {
        return patientDirectory;
    }

    public void setpatientDirectory(List<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    
    public Patient addPatient(Patient patient) {
        patientDirectory.add(patient);
        return patient;
    }
    
    public void removePatient(Patient patient) {
        patientDirectory.remove(patient);
    }
    
    public Patient searchPatient(String patientName) {
        for(Patient patient : patientDirectory) {
            if(patient.getName().equalsIgnoreCase(patientName)) {
                return patient;
            }
        }
        return null;
    }  
    
    
}

