/**
 *@author Morris Ouedraogo
 *27/11/2023
 */

package HealthApp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class HealthNoteUI{

    private ArrayList<HealthNote>healthnotes;

    public HealthNoteUI() {
        
      healthnotes = new ArrayList<>();
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
    
    private void Add() {
        
        HealthNote h = new HealthNote(){};
        
        h.setQuestNum(JOptionPane.showInputDialog(null, " Ref No:"));
        h.setQuestion(JOptionPane.showInputDialog(null, "Please enter your question"));
        h.setAnswer(JOptionPane.showInputDialog(null, "What is the answer?"));

        healthnotes.add(h);
        
    }

        
    private void Delete(){
        
       String searchTerm = JOptionPane.showInputDialog(null, " Search by Ref No ");
        for (HealthNote h :  healthnotes) {
            if (h.getQuestNum().equalsIgnoreCase(searchTerm)) {
               healthnotes.remove(h);
            }
        }
   
    }   
    
    private void Print() {

       if ( healthnotes.isEmpty()) {
              JOptionPane.showMessageDialog(null, "Sorry there is no Notes to display");
          }else {
               StringBuilder EntryNotes  = new StringBuilder();
               for (HealthNote h :  healthnotes) {
                    EntryNotes.append("RefNo ").append(h.getQuestNum()).append(" Questions: ").append(h.getQuestion()).append(" Answers: ").append(h.getAnswer()).append("\n");
                }
                JOptionPane.showMessageDialog(null,EntryNotes.toString());
            }
        }
    }
    
 




        
        

