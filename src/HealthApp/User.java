/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthApp;

import java.io.Serializable;



/**
 *
 * @author zador
 */
public class User implements Serializable{
    
    private String name;
    private String sName;
    private String dob;
    private String id;
    private String email;
    private String height;
    private String weight;
    private String description;

    public User(String name, String sName, String dob, String id, String email, String height, String weight, String description) {
        this.name = name;
        this.sName = sName;
        this.dob = dob;
        this.id = id;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.description = description;
    }
    
    public User(){
    name = " ";
    sName = " ";
    dob = " ";
    id = " ";
    email = " ";
    height = " ";
    weight = " ";
    description = " ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDetails(){
        return "User Details: \n"+name+";\n"+sName+";\n"+dob+";\n"+id+";\n"+email+";\n"+height+" cm;\n"+weight+" kg;\n"+description;
    }
}
