/**
 *@author Morris Ouedraogo
 *27/11/2023
 */

package HealthApp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EntryFUI{

    private ArrayList<EntryF> entryForms;

    public EntryFUI() {
        
      entryForms = new ArrayList<>();
  }
    
    public void menu(){
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null, " checker \n1.Add\n2.Delete \n3.Print"));

        switch (ans) {           
            case 1 -> Add();
            case 2 -> Delete();
            case 3 -> Print();
          
            default -> {
            }
        }
   }
    

    private void Add(){
        
      EntryF e = new EntryF(){};
        e.setDate(JOptionPane.showInputDialog(null, "Enter Date:"));
        e.setGender(JOptionPane.showInputDialog(null, "Enter your Gender:"));
        e.setAge(JOptionPane.showInputDialog(null, "Enter your Age:"));
        e.setWeight(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your weight:")));
        e.setHeight(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter height:")));
          

        entryForms.add(e);
    }


        
    private void Delete(){
        
       String searchTerm = JOptionPane.showInputDialog(null, "Enter the user no you wish to delete:");
        for (EntryF e : entryForms) {
            if (e.getDate().equalsIgnoreCase(searchTerm)) {
              entryForms.remove(e);
            }
        }
   
    }   
    
    private void Print() {

       if (entryForms.isEmpty()) {
              JOptionPane.showMessageDialog(null, "Sorry there is no users to display");
          }else {
               StringBuilder EntryDetails  = new StringBuilder();
               for (EntryF e : entryForms) {
                    EntryDetails .append("Gender: ").append(e.getGender()).append(" Age: ").append(e.getAge()).append(" Weight: ").append(e.getWeight()).append(" Height: ").append(e.getHeight()).append("\n");
                }
                JOptionPane.showMessageDialog(null,EntryDetails.toString());
            }
        }
    }
    
 



