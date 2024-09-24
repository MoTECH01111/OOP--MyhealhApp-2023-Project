package HealthApp;


import java.io.Serializable;

/**
 *@author Morris Ouedraogo
 *27/11/2023
 */

public abstract class EntryF implements Serializable{
    
    private String date;
    String gender;
    String age;
    double weight;
    double height;
    
    
    public EntryF(){
        this.date = " "; // Set default date to current date
        this.gender = "";
        this.age = "";
        this.weight = 0.0;
        this.height = 0.0;
    }

    public EntryF(String date, String gender, String age, double weight, double height) {
        this.date = date;
        this.gender = gender;
        this.age = age;
        this.weight = Math.max(weight, 0); // Ensure weight is not negative
        this.height = Math.max(height, 0); // Ensure height is not negative
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    

    public String getDetails(){
        return " Date: "+ date+ " Gender: " + gender+ " Age: " + age + " Weight: " + weight + " Kg " + " Height: " +height+ " CM";
    }

}


