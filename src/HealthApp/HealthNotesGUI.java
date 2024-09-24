package HealthApp;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Morris Ouedraogo
 */

public class HealthNotesGUI extends javax.swing.JFrame {
          private ArrayList<HealthNote>healthnotes;
    

 
      public HealthNotesGUI() {
        initComponents();
         healthnotes = new ArrayList<>();
        // Create Quiz instances and add them to the list
      }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back1 = new javax.swing.JPanel();
        head = new javax.swing.JPanel();
        HealthQ = new javax.swing.JLabel();
        AddAnswer = new javax.swing.JButton();
        Q1 = new javax.swing.JLabel();
        Q2 = new javax.swing.JLabel();
        Questiontxt = new javax.swing.JTextField();
        Answertxt = new javax.swing.JTextField();
        Display = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Ref = new javax.swing.JLabel();
        Reftxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(785, 550));

        Back1.setBackground(new java.awt.Color(255, 255, 255));
        Back1.setPreferredSize(new java.awt.Dimension(450, 520));

        head.setBackground(new java.awt.Color(255, 153, 51));

        HealthQ.setFont(new java.awt.Font("Copperplate", 0, 36)); // NOI18N
        HealthQ.setText("HealthNotes");
        HealthQ.setPreferredSize(new java.awt.Dimension(300, 100));

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HealthQ, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(HealthQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        AddAnswer.setBackground(new java.awt.Color(255, 153, 51));
        AddAnswer.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        AddAnswer.setText("AddNote");
        AddAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAnswerActionPerformed(evt);
            }
        });

        Q1.setFont(new java.awt.Font("Copperplate", 0, 18)); // NOI18N
        Q1.setText("Enter your question");

        Q2.setFont(new java.awt.Font("Copperplate", 0, 18)); // NOI18N
        Q2.setText("Enter the answer");

        Questiontxt.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N

        Answertxt.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N

        Display.setBackground(new java.awt.Color(255, 153, 51));
        Display.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Display.setText("Display");
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(255, 153, 51));
        Delete.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Ref.setFont(new java.awt.Font("Copperplate", 0, 18)); // NOI18N
        Ref.setText("Enter Ref No");

        Reftxt.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N

        javax.swing.GroupLayout Back1Layout = new javax.swing.GroupLayout(Back1);
        Back1.setLayout(Back1Layout);
        Back1Layout.setHorizontalGroup(
            Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Back1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Back1Layout.createSequentialGroup()
                        .addComponent(Q2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(Answertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Back1Layout.createSequentialGroup()
                        .addGroup(Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Q1)
                            .addComponent(Ref, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Questiontxt)
                            .addComponent(Reftxt, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(Back1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Back1Layout.createSequentialGroup()
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Back1Layout.createSequentialGroup()
                        .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        Back1Layout.setVerticalGroup(
            Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Back1Layout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ref)
                    .addComponent(Reftxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q1)
                    .addComponent(Questiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q2)
                    .addComponent(Answertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAnswerActionPerformed
       
        if (Answertxt.getText().isEmpty() || Questiontxt.getText().isEmpty() || Reftxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter required fields");
        } else {
            
            // Proceed with creating HealthNote object and adding it to the list
            try {
                // Create a HealthNote object using the provided fields
                HealthNote h = new HealthNote();
                h.setAnswer(Answertxt.getText());
                h.setQuestion(Questiontxt.getText());
                h.setQuestNum(Reftxt.getText());

                // Add the health note to the list
                healthnotes.add(h);

                JOptionPane.showMessageDialog(null, "MyHealth Notes \n" + h.getNotes());
            } catch (Exception e) {
                // Handle any exceptions that might occur during object creation
                JOptionPane.showMessageDialog(null, "Error creating HealthNote");
            }
        }
    }//GEN-LAST:event_AddAnswerActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
               
       if (healthnotes.isEmpty()) {
           JOptionPane.showMessageDialog(null, "Sorry there is no HealthNotes to display");
          }else{
               StringBuilder EntryNotes = new StringBuilder();
               for (HealthNote h : healthnotes){
                   EntryNotes.append(h.getNotes()).append("\n\n");
               }
               JOptionPane.showMessageDialog(null,EntryNotes.toString());
           }
           
    }//GEN-LAST:event_DisplayActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
      if(healthnotes.isEmpty()){
            JOptionPane.showMessageDialog(null," This is an invalid RefNo");
        }
        else{
            String searchTerm = JOptionPane.showInputDialog(null, "Please enter an User Number to delete");
            for(HealthNote h : healthnotes){
                if(h.getQuestNum().equalsIgnoreCase(searchTerm)){
                    healthnotes.remove(h);
                    JOptionPane.showMessageDialog(null,h.getNotes()+" has been deleted.");
                }
            }
        }   
    }//GEN-LAST:event_DeleteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new HealthNotesGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAnswer;
    private javax.swing.JTextField Answertxt;
    private javax.swing.JPanel Back1;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Display;
    private javax.swing.JLabel HealthQ;
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q2;
    private javax.swing.JTextField Questiontxt;
    private javax.swing.JLabel Ref;
    private javax.swing.JTextField Reftxt;
    private javax.swing.JPanel head;
    // End of variables declaration//GEN-END:variables
}
