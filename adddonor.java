package bloodbanksystem;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import static java.lang.Integer.parseInt;

public class adddonor extends javax.swing.JFrame {

    public adddonor(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfbloodgroup = new javax.swing.JComboBox<>();
        tfgender = new javax.swing.JComboBox<>();
        tffirstname = new javax.swing.JTextField();
        tflastname = new javax.swing.JTextField();
        tfphonenumber = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        tfid = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfunit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfhb = new javax.swing.JTextField();
        newid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(180, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add New Donor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 145, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone Number:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 209, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 177, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Blood Group:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 247, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 370, -1, -1));

        tfbloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        tfbloodgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfbloodgroupActionPerformed(evt);
            }
        });
        getContentPane().add(tfbloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 251, -1, -1));

        tfgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(tfgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 373, -1, -1));

        tffirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffirstnameActionPerformed(evt);
            }
        });
        getContentPane().add(tffirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 149, 363, -1));
        getContentPane().add(tflastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 181, 363, -1));
        getContentPane().add(tfphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 213, 363, -1));

        backbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 640, 103, -1));

        savebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        getContentPane().add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 432, 524, -1));
        getContentPane().add(tfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 697, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 717, 94, 27));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Your ID:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 133, 42));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Units:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 278, -1, -1));
        getContentPane().add(tfunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 282, 363, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("*1 unit = 5ml");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 282, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("HB:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 339, -1, -1));

        tfhb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhbActionPerformed(evt);
            }
        });
        getContentPane().add(tfhb, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 342, 363, -1));
        getContentPane().add(newid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 400, 49));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shano\\Documents\\NetBeansProjects\\BloodBankSystem\\src\\bloodbanksystem\\icons\\menu.gif")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
                setVisible(false);
		mainp su = new mainp();
		su.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        String firstName = tffirstname.getText();
    String lastName = tflastname.getText();
    String phoneNumber = tfphonenumber.getText();
    String bloodGroup = (String) tfbloodgroup.getSelectedItem();
    String gender = (String) tfgender.getSelectedItem();
    String unitString = tfunit.getText();
    String hbString = tfhb.getText();

    // Check for null or empty values
    if (firstName.isEmpty() || lastName.isEmpty() || phoneNumber.isEmpty() || unitString.isEmpty() || hbString.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all the required fields.");
        return;
    }

    // Phone number validation using regular expression
    String phoneNumberRegex = "^[0-9]+$";
    if (!phoneNumber.matches(phoneNumberRegex)) {
        JOptionPane.showMessageDialog(null, "Invalid phone number. Please enter only numeric digits.");
        return; // Stop further execution if the phone number is invalid
    }
    
        int hblevel = parseInt(tfhb.getText());
         int unit = parseInt(tfunit.getText());
         String bloodgroup = (String)tfbloodgroup.getSelectedItem();
        
        if( hblevel >= 10)
        {
            try
            {
                Conn con = new Conn();
            
                String sql = "insert into donorrr(firstname, lastname, phonenumber, bloodgroup, gender, units, hblevel) values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
                String name = tffirstname.getText();
                                
		st.setString(1, tffirstname.getText());
                st.setString(2, tflastname.getText());
		st.setString(3, tfphonenumber.getText());
		st.setString(4, (String) tfbloodgroup.getSelectedItem());
                st.setString(5, (String) tfgender.getSelectedItem());
                st.setString(6, tfunit.getText());
                st.setString(7, tfhb.getText());
                
              String q1 = "update bank set units = units + " + unit + " where bloodgroup = '" + bloodgroup + "'";
                                 con.s.executeUpdate(q1);
                                
                JOptionPane.showMessageDialog(null, "Stock Updated Successfully");
                                
		int i = st.executeUpdate();
		if (i > 0)
                {
                    JOptionPane.showMessageDialog(null, "Donor Added Successfully.");
                }
                

                
                ResultSet rs;
                rs = con.s.executeQuery("select * from donorrr where firstname = '"+name+"'");
                    if(rs.next()){
                        newid.setText(rs.getString(1));
                    }
			
        }catch(Exception e){
                System.out.println(e);
 }
        }
        else{
            JOptionPane.showMessageDialog(null, "You cannot donate blood");
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void tffirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tffirstnameActionPerformed

    private void tfbloodgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfbloodgroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfbloodgroupActionPerformed

    private void tfhbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfhbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adddonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adddonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adddonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adddonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adddonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField newid;
    private javax.swing.JButton savebtn;
    private javax.swing.JComboBox<String> tfbloodgroup;
    private javax.swing.JTextField tffirstname;
    private javax.swing.JComboBox<String> tfgender;
    private javax.swing.JTextField tfhb;
    private javax.swing.JLabel tfid;
    private javax.swing.JTextField tflastname;
    private javax.swing.JTextField tfphonenumber;
    private javax.swing.JTextField tfunit;
    // End of variables declaration//GEN-END:variables
}
