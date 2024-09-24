/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthApp;

import HealthApp.User;
import java.io.Serializable;

/**
 *
 * @author zador
 */
public class SpecialProfile extends User implements Serializable{
    private String specialization;

    public SpecialProfile(String name, String sName, String dob, String id, String email, String height, String weight, String description, String specialization) {
        super(name, sName, dob, id, email, height, weight, description);
        this.specialization = specialization;
    }
    
    public SpecialProfile() {
        super(); 
        this.specialization = "Default Specialization";
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String getDetails() {
        
        return super.getDetails() + "\nSpecialization: " + specialization;
    }
}


