
package medicinebazer;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import  java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;

public class registrationForm extends javax.swing.JFrame {

    public registrationForm() {
        initComponents();
        Connection();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        //txtUser.setEnabled(true);
        //passwordField.setEnabled(false);
        //confirmPasswordField.setEnabled(false);
        
    }
    
    Connection con;
    PreparedStatement pst;
    
       
    public void Connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/MedicineBazer","root","");
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        submitButton = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        leftArrow = new javax.swing.JLabel();
        rightArrow = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtClose = new javax.swing.JLabel();
        txtMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(1480, 770));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        txtUser.setBackground(new java.awt.Color(252, 249, 249));
        txtUser.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 220, 30));

        passwordField.setBackground(new java.awt.Color(252, 249, 249));
        passwordField.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFieldKeyReleased(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 220, 30));

        jLabel4.setFont(new java.awt.Font("Cantarell", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 0));
        jLabel4.setText("I Already have a Account");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 200, 20));

        confirmPasswordField.setBackground(new java.awt.Color(252, 249, 249));
        confirmPasswordField.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        confirmPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmPasswordFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmPasswordFieldKeyReleased(evt);
            }
        });
        jPanel1.add(confirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 220, 30));

        submitButton.setBackground(new java.awt.Color(0, 102, 102));
        submitButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Sign Up");
        submitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        submitButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                submitButtonKeyPressed(evt);
            }
        });
        jPanel1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 120, 30));

        txtName.setBackground(new java.awt.Color(252, 249, 249));
        txtName.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 220, 30));

        txtAddress.setBackground(new java.awt.Color(252, 249, 249));
        txtAddress.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 220, 30));

        txtEmail.setBackground(new java.awt.Color(252, 249, 249));
        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 220, 30));

        txtPhone.setBackground(new java.awt.Color(252, 249, 249));
        txtPhone.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneKeyReleased(evt);
            }
        });
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 220, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 440, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 440, 10));

        leftArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/left-arrow (1).png"))); // NOI18N
        leftArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftArrowMouseClicked(evt);
            }
        });
        jPanel1.add(leftArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        rightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/right-arrow (1).png"))); // NOI18N
        rightArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rightArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightArrowMouseClicked(evt);
            }
        });
        jPanel1.add(rightArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Confirm Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Home");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel16.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Phone");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel17.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("E-Mail");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel18.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Username");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel19.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Password");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 480, 600));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/drug.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("MediStore");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        txtClose.setFont(new java.awt.Font("Cantarell Extra Bold", 1, 14)); // NOI18N
        txtClose.setForeground(new java.awt.Color(255, 255, 255));
        txtClose.setText("X");
        txtClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCloseMouseExited(evt);
            }
        });
        jPanel2.add(txtClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 10, 24, -1));

        txtMinimize.setFont(new java.awt.Font("Cantarell Extra Bold", 1, 20)); // NOI18N
        txtMinimize.setForeground(new java.awt.Color(255, 255, 255));
        txtMinimize.setText("-");
        txtMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMinimizeMouseExited(evt);
            }
        });
        jPanel2.add(txtMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 0, -1, 30));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rightArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightArrowMouseClicked

        new registrationForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rightArrowMouseClicked

    private void leftArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftArrowMouseClicked
        new loginForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_leftArrowMouseClicked

    private void txtPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyReleased

    }//GEN-LAST:event_txtPhoneKeyReleased

    private void txtPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            if(txtPhone.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Phone Number cannot be Blank");
            }else{
                txtEmail.setEnabled(true);
                txtEmail.requestFocus();
            }
        }
    }//GEN-LAST:event_txtPhoneKeyPressed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased

    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            if(txtEmail.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Email cannot be Blank");
            }else{
                txtUser.setEnabled(true);
                txtUser.requestFocus();
            }
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased

    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            if(txtAddress.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Address cannot be Blank");
            }else{
                txtPhone.setEnabled(true);
                txtPhone.requestFocus();
            }
        }
    }//GEN-LAST:event_txtAddressKeyPressed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased

    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            if(txtName.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Name cannot be Blank");
            }else{
                txtAddress.setEnabled(true);
                txtAddress.requestFocus();
            }

        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void submitButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_submitButtonKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            validationCheckActionPerformed();
        }
    }//GEN-LAST:event_submitButtonKeyPressed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

    }//GEN-LAST:event_submitButtonActionPerformed

    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        validationCheckActionPerformed();
    }//GEN-LAST:event_submitButtonMouseClicked

    private void confirmPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFieldKeyReleased

    private void confirmPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordFieldKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(confirmPasswordField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "password cann't blank");
            }
            else if(confirmPasswordField.getText().length() > 6){

                JOptionPane.showMessageDialog(this, "password should be 6 character");

            }
            else if(!(confirmPasswordField.getText().equals(passwordField.getText()))){

                JOptionPane.showMessageDialog(this, "password do not match");

            }
            else{
                submitButton.setEnabled(true);
                submitButton.requestFocus();

            }
        }
    }//GEN-LAST:event_confirmPasswordFieldKeyPressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new loginForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void passwordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyReleased

    }//GEN-LAST:event_passwordFieldKeyReleased

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(passwordField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "password cann't blank");
            }
            else if(passwordField.getText().length() > 6){

                JOptionPane.showMessageDialog(this, "password should be 6 character");

            }
            else{

                confirmPasswordField.setEnabled(true);
                confirmPasswordField.requestFocus();
            }
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased

    }//GEN-LAST:event_txtUserKeyReleased

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(txtUser.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Username Cann't Blank");
            }
            else{
                try {
                    String uname = txtUser.getText();

                    pst = con.prepareStatement("select * from userRegistration where username=?");
                    pst.setString(1,uname);

                    ResultSet rs = pst.executeQuery();

                    if(rs.next() == true){
                        JOptionPane.showMessageDialog(this, "Username Exist");
                    }
                    else{
                        passwordField.setEnabled(true);
                        passwordField.requestFocus();
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(registrationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new loginForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void txtMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_txtMinimizeMouseClicked

    private void txtMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinimizeMouseEntered

    private void txtMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinimizeMouseExited

    private void txtCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtCloseMouseClicked

    private void txtCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCloseMouseEntered

    private void txtCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCloseMouseExited

    public void validationCheckActionPerformed(){
        
        if(txtUser.getText().equals("") || passwordField.getText().equals("") || confirmPasswordField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Fill the blank table");
        }
        else if(txtName.getText().equals("") || txtAddress.getText().equals("") || txtPhone.getText().equals("") || txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Fill the blank table");
        }
        else if(passwordField.getText().length() > 6 || confirmPasswordField.getText().length() > 6){

            JOptionPane.showMessageDialog(this, "Password should be 6 character");

        }
        else if(!(confirmPasswordField.getText().equals(passwordField.getText()))){

            JOptionPane.showMessageDialog(this, "Password do not Match");

        }
        
        else{
            
            try {
                String uname = txtUser.getText();

                pst = con.prepareStatement("select * from user_Registration where username=?");
                pst.setString(1,uname);

                ResultSet rs = pst.executeQuery();

                if(rs.next() == true)
                {
                    JOptionPane.showMessageDialog(this, "Username Exist");
                }
                else{                        
                    try {   
                            String name = txtName.getText();
                            String address = txtAddress.getText();
                            String phone = txtPhone.getText();
                            String email = txtEmail.getText();
                            
                            String user = txtUser.getText();
                            String pass = confirmPasswordField.getText();

                            pst = con.prepareStatement("insert into user_Registration(name,address,phone,email,username,password)value(?,?,?,?,?,?)");
                            pst.setString(1,name);
                            pst.setString(2,address);
                            pst.setString(3,phone);
                            pst.setString(4,email);
                            pst.setString(5,user);
                            pst.setString(6,pass);
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(this, "Registration Successfull");
                            
                            txtName.setText("");
                            txtAddress.setText("");
                            txtPhone.setText("");
                            txtEmail.setText("");
                            txtUser.setText("");
                            passwordField.setText("");
                            confirmPasswordField.setText("");
                            txtName.requestFocus();
                            
                            new loginForm().setVisible(true);
                            this.setVisible(false);
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(registrationForm.class.getName()).log(Level.SEVERE, null, ex);
                        }                        
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }                       
        }
        
        
    }
    
    

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
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel leftArrow;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel rightArrow;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JLabel txtClose;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtMinimize;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
