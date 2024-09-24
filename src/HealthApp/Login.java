package HealthApp;


import javax.swing.JOptionPane;


/**
 *
 * @author Morris Ouedraogo
 */

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
        
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackPanel = new javax.swing.JPanel();
        OrangePanel = new javax.swing.JPanel();
        HealthApp = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        Start = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        Sname = new javax.swing.JTextField();
        Forum = new javax.swing.JButton();
        HealthNotes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(785, 550));

        BackPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackPanel.setPreferredSize(new java.awt.Dimension(710, 509));

        OrangePanel.setBackground(new java.awt.Color(255, 153, 0));

        HealthApp.setFont(new java.awt.Font("Copperplate", 0, 30)); // NOI18N
        HealthApp.setText("MyHealthApp");

        icon.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/health.jpeg"))); // NOI18N

        javax.swing.GroupLayout OrangePanelLayout = new javax.swing.GroupLayout(OrangePanel);
        OrangePanel.setLayout(OrangePanelLayout);
        OrangePanelLayout.setHorizontalGroup(
            OrangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrangePanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrangePanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(HealthApp, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        OrangePanelLayout.setVerticalGroup(
            OrangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrangePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(HealthApp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );

        Fname.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });

        name1.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        name1.setText("First Name");

        name2.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        name2.setText("Second Name");

        Login.setBackground(new java.awt.Color(255, 153, 0));
        Login.setFont(new java.awt.Font("Copperplate", 0, 24)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 153, 0));
        Login.setText("Login");

        Start.setBackground(new java.awt.Color(255, 153, 0));
        Start.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Start.setText("start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        Profile.setBackground(new java.awt.Color(255, 153, 0));
        Profile.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Profile.setText("Profile");
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });

        Sname.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnameActionPerformed(evt);
            }
        });

        Forum.setBackground(new java.awt.Color(255, 153, 0));
        Forum.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Forum.setText("Forum");
        Forum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForumActionPerformed(evt);
            }
        });

        HealthNotes.setBackground(new java.awt.Color(255, 153, 0));
        HealthNotes.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        HealthNotes.setText("Notes");
        HealthNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthNotesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addComponent(OrangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name2)
                                    .addComponent(name1)))
                            .addGroup(BackPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Sname, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(HealthNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(Forum, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Profile)
                        .addGap(20, 20, 20))))
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OrangePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(name1)
                .addGap(3, 3, 3)
                .addComponent(Sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(name2)
                .addGap(4, 4, 4)
                .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HealthNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Forum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed

        String fname = Fname.getText(); // Setting the text as Firstname (fname)
        String sname = Sname.getText(); // Setting the text as Secondname (sname)

        if (fname.isEmpty() || sname.isEmpty()){ // If fname and sname is empty  prompt message
            JOptionPane.showMessageDialog(null, " Please enter your name ");
        }else {
            JOptionPane.showMessageDialog(null, " Welcome to My HealthApp " + sname + " " + fname);
            EntryForm myGUI = new EntryForm();//Allow  access Entryform GUI
            myGUI.setVisible(true);
        }

    }//GEN-LAST:event_StartActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
       
          ProfileGUI profileGUI = new ProfileGUI(); //Allow  access Profile GUI
          profileGUI.setVisible(true);// Make GUI Visible 
    }//GEN-LAST:event_ProfileActionPerformed

    private void ForumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForumActionPerformed
         
          ForumGUI forumGUI = new ForumGUI(); //Allow  access Forum GUI
          forumGUI.setVisible(true);// Make GUI Visible 
    }//GEN-LAST:event_ForumActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void SnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SnameActionPerformed

    private void HealthNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthNotesActionPerformed
         HealthNotesGUI HGUI = new HealthNotesGUI (); //Allow  access HealthNotes GUI
         HGUI.setVisible(true);
    }//GEN-LAST:event_HealthNotesActionPerformed

    //Main Method for GUI
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackPanel;
    private javax.swing.JTextField Fname;
    private javax.swing.JButton Forum;
    private javax.swing.JLabel HealthApp;
    private javax.swing.JButton HealthNotes;
    private javax.swing.JLabel Login;
    private javax.swing.JPanel OrangePanel;
    private javax.swing.JButton Profile;
    private javax.swing.JTextField Sname;
    private javax.swing.JButton Start;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    // End of variables declaration//GEN-END:variables
}
