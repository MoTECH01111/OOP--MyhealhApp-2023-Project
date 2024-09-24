/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthApp;

import HealthApp.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author zador
 */


public class UserUI {

    private ArrayList<User> users;

    public UserUI() {
        users = new ArrayList<>();
    }

    public void menu() {
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select option: \n 1.Add \n 2.Print \n 3.Search \n 4.Delete"));

        switch (ans) {
            case 1:
                add();
                break;
            case 2:
                print();
                break;
            case 3:
                search();
                break;
            case 4:
                delete();
                break;
            default:
                break;
        }
    }

    private void add() {
        User user = new User() {};
        user.setName(JOptionPane.showInputDialog(null, "Enter name:"));
        user.setsName(JOptionPane.showInputDialog(null, "Enter surname:"));
        user.setId(JOptionPane.showInputDialog(null, "Enter ID:"));
        user.setDob(JOptionPane.showInputDialog(null, "Enter DOB:"));
        user.setEmail(JOptionPane.showInputDialog(null, "Enter email:"));
        user.setHeight(JOptionPane.showInputDialog(null, "Enter height:"));
        user.setWeight(JOptionPane.showInputDialog(null, "Enter weight:"));
        user.setDescription(JOptionPane.showInputDialog(null, "Enter description:"));

        users.add(user);
    }

    private void print() {
        if (users.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sorry, there are no users to display");
        } else {
            for (User user : users) {
                JOptionPane.showMessageDialog(null, user.getDetails());
            }
        }
    }

    private void search() {
        String searchTerm = JOptionPane.showInputDialog(null, "Enter the ID you wish to search for:");
        for (User user : users) {
            if (user.getId().equalsIgnoreCase(searchTerm)) {
                JOptionPane.showMessageDialog(null, user.getDetails());
            }
        }
    }

    private void delete() {
        String searchTerm = JOptionPane.showInputDialog(null, "Enter the ID you wish to search for:");
        User userToRemove = null;
        for (User user : users) {
            if (user.getId().equalsIgnoreCase(searchTerm)) {
                userToRemove = user;
                break;
            }
        }
        if (userToRemove != null) {
            users.remove(userToRemove);
        }
    }
}

