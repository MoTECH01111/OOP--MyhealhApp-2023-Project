package HealthApp;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *@author  @author Morris Ouedraogo
 * 29/11/2023
 */

public class EntryForm extends JFrame{
   private ArrayList<EntryF> entryForms;

    
    public EntryForm() {
        
        initComponents();
        FatJbl.setVisible(false);
        Kcal.setVisible(false);
        Bmi.setVisible(false);
        CalJbl.setVisible(false);  
        entryForms = new ArrayList<>();
 
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackPanel = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        ChecJbl = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        Weight = new javax.swing.JLabel();
        Height = new javax.swing.JLabel();
        genline = new javax.swing.JTextField();
        ageline = new javax.swing.JTextField();
        Weigh = new javax.swing.JTextField();
        Heightline = new javax.swing.JTextField();
        Confirm = new javax.swing.JButton();
        CalJbl = new javax.swing.JLabel();
        Kcal = new javax.swing.JButton();
        FatJbl = new javax.swing.JLabel();
        Bmi = new javax.swing.JButton();
        FAQ = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Display = new javax.swing.JButton();
        Date = new javax.swing.JLabel();
        Dateline = new javax.swing.JTextField();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(710, 509));

        BackPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackPanel.setPreferredSize(new java.awt.Dimension(767, 550));

        Panel.setBackground(new java.awt.Color(255, 153, 0));

        ChecJbl.setFont(new java.awt.Font("Copperplate", 0, 48)); // NOI18N
        ChecJbl.setText("MyHealthApp Checker");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(ChecJbl)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(ChecJbl, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        gender.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        gender.setText("Gender");

        Age.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Age.setText("Age");

        Weight.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Weight.setText("Weight Kg");

        Height.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Height.setText("Height CM");

        genline.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        genline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genlineActionPerformed(evt);
            }
        });

        ageline.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        ageline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agelineActionPerformed(evt);
            }
        });

        Weigh.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Weigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeighActionPerformed(evt);
            }
        });

        Heightline.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Heightline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeightlineActionPerformed(evt);
            }
        });

        Confirm.setBackground(new java.awt.Color(255, 153, 0));
        Confirm.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        CalJbl.setFont(new java.awt.Font("Copperplate", 0, 18)); // NOI18N
        CalJbl.setText("My Calorie InTake");

        Kcal.setBackground(new java.awt.Color(255, 153, 51));
        Kcal.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Kcal.setText("KCAL");
        Kcal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KcalActionPerformed(evt);
            }
        });

        FatJbl.setFont(new java.awt.Font("Copperplate", 0, 18)); // NOI18N
        FatJbl.setText(" My Body Fat");

        Bmi.setBackground(new java.awt.Color(255, 153, 0));
        Bmi.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Bmi.setText("BMI");
        Bmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmiActionPerformed(evt);
            }
        });

        FAQ.setBackground(new java.awt.Color(255, 153, 0));
        FAQ.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        FAQ.setText("FAQ");
        FAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAQActionPerformed(evt);
            }
        });

        Home.setBackground(new java.awt.Color(255, 153, 0));
        Home.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Display.setBackground(new java.awt.Color(255, 153, 0));
        Display.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Display.setText("Display");
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        Date.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Date.setText("Date");

        Dateline.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N

        Delete.setBackground(new java.awt.Color(255, 153, 0));
        Delete.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gender)
                            .addComponent(Age)
                            .addComponent(Height)
                            .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Weight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(31, 31, 31)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(genline)
                            .addComponent(ageline)
                            .addComponent(Weigh)
                            .addComponent(Heightline)
                            .addComponent(Dateline, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                    .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BackPanelLayout.createSequentialGroup()
                                .addComponent(CalJbl)
                                .addGap(26, 26, 26))
                            .addGroup(BackPanelLayout.createSequentialGroup()
                                .addComponent(FatJbl, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Home)
                            .addComponent(Bmi)
                            .addComponent(Kcal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Home)
                    .addComponent(Date)
                    .addComponent(Dateline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender))
                .addGap(31, 31, 31)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age)
                    .addComponent(ageline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalJbl)
                    .addComponent(Kcal))
                .addGap(36, 36, 36)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Weight)
                    .addComponent(Weigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Height)
                            .addComponent(Heightline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FatJbl)
                            .addComponent(Bmi))))
                .addGap(35, 35, 35)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirm)
                    .addComponent(Delete))
                .addGap(44, 44, 44)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display)
                    .addComponent(FAQ))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeightlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeightlineActionPerformed
         
    }//GEN-LAST:event_HeightlineActionPerformed

    private void WeighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeighActionPerformed
             
    }//GEN-LAST:event_WeighActionPerformed
 
    private void genlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genlineActionPerformed
                
    }//GEN-LAST:event_genlineActionPerformed

    private void agelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agelineActionPerformed
            
    }//GEN-LAST:event_agelineActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
  
       if(Dateline.getText().isEmpty() || genline.getText().isEmpty() || ageline.getText().isEmpty()
                || Weigh.getText().isEmpty() || Heightline.getText().isEmpty()) {
           JOptionPane.showMessageDialog(null, "Please fill in all the fields.");
           
           
       // Proceed with creating EntryF object and adding it to the list
            try{
                 EntryF e = new EntryF(Dateline.getText(), genline.getText(), ageline.getText(),
                        Double.parseDouble(Weigh.getText()), Double.parseDouble(Heightline.getText())){
                };

                // Add the entry to the list
                entryForms.add(e);

                JOptionPane.showMessageDialog(null, "MyHealth Tracker \n" + e.getDetails());
                     Date.setVisible(false);
                     Dateline.setVisible(false);
                     FatJbl.setVisible(true);
                     Kcal.setVisible(true);
                     Bmi.setVisible(true);
                     CalJbl.setVisible(true); 
                     
             }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter weight and height in numeric format");        
          }
        }
    }//GEN-LAST:event_ConfirmActionPerformed

    private void KcalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KcalActionPerformed
         
            try{        
                Calorie c = new Calorie() {};

                c.setGender(genline.getText());
                c.setAge(ageline.getText());
                c.setWeight(Double.parseDouble(Weigh.getText()));
                c.setHeight(Double.parseDouble(Heightline.getText()));

                c.computeIntake();

                // Display the details using a JOptionPane
                JOptionPane.showMessageDialog(null, " Your Caloric Intake \n" + c.getBmr()+ " Kcal ");
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter your information correctly");
          }
    }//GEN-LAST:event_KcalActionPerformed

    private void BmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmiActionPerformed
     
            try{
                FatTips f = new FatTips(){};

                f.setGender(genline.getText());
                f.setAge(ageline.getText());
                f.setWeight(Double.parseDouble(Weigh.getText()));
                f.setHeight(Double.parseDouble(Heightline.getText()));

                // Calculate BMI Percentage

                f.computeBmiPercentage();

            // Display BMI details
                JOptionPane.showMessageDialog(null, " Your BMI percentage " + f.getBmiPercentage()+ "%");
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter your weight and height.");
          }
    }//GEN-LAST:event_BmiActionPerformed

    private void FAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAQActionPerformed
           
         FAQGUI faqGUI = new FAQGUI(); // acceess to new GUI
         faqGUI.setVisible(true);
    }//GEN-LAST:event_FAQActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
         Login myGUI = new Login(); //Access to new GUI
         myGUI.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
         
       if (entryForms.isEmpty()) {// if entryforms is Empty 
           JOptionPane.showMessageDialog(null, "Sorry there is no information to display");
          }else{
               StringBuilder EntryDetails = new StringBuilder();
               for (EntryF e : entryForms) {
                   EntryDetails.append(e.getDetails()).append("\n\n");
               }
               JOptionPane.showMessageDialog(null,EntryDetails.toString());
           }
           
    }//GEN-LAST:event_DisplayActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       
        if(entryForms.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sorry, this is an invalid User No.");
        }
        else{
            String searchTerm = JOptionPane.showInputDialog(null, "Please enter Date");
            for(EntryF e : entryForms){
                if(e.getDate().equalsIgnoreCase(searchTerm)){
                    entryForms.remove(e);
                    JOptionPane.showMessageDialog(null,e.getDetails()+" has been deleted.");
                }
            }
        }          
    }//GEN-LAST:event_DeleteActionPerformed
     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EntryForm().setVisible(true);
        }); 
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JPanel BackPanel;
    private javax.swing.JButton Bmi;
    private javax.swing.JLabel CalJbl;
    private javax.swing.JLabel ChecJbl;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel Date;
    private javax.swing.JTextField Dateline;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Display;
    private javax.swing.JButton FAQ;
    private javax.swing.JLabel FatJbl;
    private javax.swing.JLabel Height;
    private javax.swing.JTextField Heightline;
    private javax.swing.JButton Home;
    private javax.swing.JButton Kcal;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField Weigh;
    private javax.swing.JLabel Weight;
    private javax.swing.JTextField ageline;
    private javax.swing.JLabel gender;
    private javax.swing.JTextField genline;
    // End of variables declaration//GEN-END:variables

}

