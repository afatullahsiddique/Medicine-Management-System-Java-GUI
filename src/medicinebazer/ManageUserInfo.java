
package medicinebazer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class ManageUserInfo extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ManageUserInfo() {
        initComponents();
        show_user();
        theader();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }

    public ArrayList<User>userList(){
        
        ArrayList<User>usersList = new ArrayList<>();
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/MedicineBazer","root","");
            
            String query = "SELECT * FROM user_Registration";
            
            pst = con.prepareStatement(query);
            rs = pst.executeQuery(query);
        
            User user;
            while(rs.next()){
                user = new User(rs.getInt("id"),rs.getString("name"),rs.getString("address"),rs.getString("phone"),rs.getString("email"),rs.getString("username"),rs.getString("password"));
                usersList.add(user);
            }
    
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return usersList;
        
    }
    
    
    public void show_user(){
        
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel)userInfo_table.getModel();
        Object[] row = new Object[7];
        
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getaddress();
            row[3]=list.get(i).getphone();
            row[4]=list.get(i).getemail();
            row[5]=list.get(i).getusername();
            row[6]=list.get(i).getpassword();
            model.addRow(row);
        }
    }
    
    
    public void theader(){
       JTableHeader thead = userInfo_table.getTableHeader();
       //thead.setForeground(Color.blue);
       thead.setBackground(Color.LIGHT_GRAY);
       thead.setFont(new Font("Tahome",Font.BOLD,18));
       
       
       TableColumn col1=userInfo_table.getColumnModel().getColumn(0);
       col1.setPreferredWidth(100);
       TableColumn col2=userInfo_table.getColumnModel().getColumn(1);
       col2.setPreferredWidth(100);
       TableColumn col3=userInfo_table.getColumnModel().getColumn(2);
       col3.setPreferredWidth(100);
       TableColumn col4=userInfo_table.getColumnModel().getColumn(3);
       col4.setPreferredWidth(100);
       TableColumn col5=userInfo_table.getColumnModel().getColumn(4);
       col5.setPreferredWidth(100);
       TableColumn col6=userInfo_table.getColumnModel().getColumn(5);
       col6.setPreferredWidth(100);
       TableColumn col7=userInfo_table.getColumnModel().getColumn(6);
       col7.setPreferredWidth(100);
       
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userInfo_table = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        studentId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rightArrow = new javax.swing.JLabel();
        leftArrow = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtClose2 = new javax.swing.JLabel();
        txtMinimize3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1480, 770));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setForeground(new java.awt.Color(0, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userInfo_table.setBackground(new java.awt.Color(0, 102, 102));
        userInfo_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "ADDRESS", "PHONE", "EMAIL", "USERNAME", "PASSWORD"
            }
        ));
        userInfo_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userInfo_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userInfo_table);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 1190, 240));

        jPanel8.setBackground(new java.awt.Color(102, 102, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Users Registration");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 310, 50));

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Informations");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 210, 50));

        removeButton.setBackground(new java.awt.Color(0, 102, 102));
        removeButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remove");
        removeButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeButtonMouseClicked(evt);
            }
        });
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        removeButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                removeButtonKeyPressed(evt);
            }
        });
        jPanel7.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 150, 40));

        clearButton.setBackground(new java.awt.Color(0, 102, 102));
        clearButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        clearButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clearButtonKeyPressed(evt);
            }
        });
        jPanel7.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 140, 40));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 1230, 10));

        studentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdActionPerformed(evt);
            }
        });
        jPanel7.add(studentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 300, 30));

        jLabel6.setFont(new java.awt.Font("URW Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Registration ID");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, 40));

        rightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/right-arrow (1).png"))); // NOI18N
        rightArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rightArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightArrowMouseClicked(evt);
            }
        });
        jPanel7.add(rightArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 690, -1, -1));

        leftArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/left-arrow (1).png"))); // NOI18N
        leftArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftArrowMouseClicked(evt);
            }
        });
        jPanel7.add(leftArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, -1, -1));
        jPanel7.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1230, 10));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 1250, 740));

        txtClose2.setFont(new java.awt.Font("Cantarell Extra Bold", 1, 14)); // NOI18N
        txtClose2.setForeground(new java.awt.Color(255, 255, 255));
        txtClose2.setText("X");
        txtClose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtClose2.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jPanel2.add(txtClose2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 10, 18, -1));

        txtMinimize3.setFont(new java.awt.Font("Cantarell Extra Bold", 1, 20)); // NOI18N
        txtMinimize3.setForeground(new java.awt.Color(255, 255, 255));
        txtMinimize3.setText("-");
        txtMinimize3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtMinimize3.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jPanel2.add(txtMinimize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 2, -1, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/drug.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("MediStore");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new ManageUserInfo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void removeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseClicked

        DefaultTableModel model = (DefaultTableModel)userInfo_table.getModel();
        model.setRowCount(0);
        show_user();
    }//GEN-LAST:event_removeButtonMouseClicked

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        
        if(studentId.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Select ID to Remove");
        }
        else{
            try {         
            //SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");

            String id = studentId.getText();
            //String name = medName.getText();
            //String price = medPrice.getText();
            //String quantity = medQty.getText();
            //String fabdate = sdf.format(medFabDate.getDate());
            //String expdate = sdf.format(medExpDate.getDate());
            //String company = medCompany.getSelectedItem().toString();

            pst = con.prepareStatement("Delete from user_Registration where id=?");
            
            pst.setString(1, id);
            pst.executeUpdate();
            
            DefaultTableModel model = (DefaultTableModel)userInfo_table.getModel();
            model.setRowCount(0);
            show_user();
            
            JOptionPane.showMessageDialog(this, "Removed!");

            } catch (SQLException ex) {
                Logger.getLogger(registrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_removeButtonActionPerformed

    private void removeButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_removeButtonKeyPressed

    }//GEN-LAST:event_removeButtonKeyPressed

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        
        studentId.setText(null);
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void clearButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonKeyPressed

    private void studentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdActionPerformed

    private void userInfo_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userInfo_tableMouseClicked
        
        int i = userInfo_table.getSelectedRow();
        TableModel model = userInfo_table.getModel();
        studentId.setText(model.getValueAt(i, 0).toString());
        
    }//GEN-LAST:event_userInfo_tableMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new AdminHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void leftArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftArrowMouseClicked
        new AdminHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_leftArrowMouseClicked

    private void rightArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightArrowMouseClicked
        new booking_list_admin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rightArrowMouseClicked

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
            java.util.logging.Logger.getLogger(ManageUserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUserInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel leftArrow;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel rightArrow;
    private javax.swing.JTextField studentId;
    private javax.swing.JLabel txtClose2;
    private javax.swing.JLabel txtMinimize3;
    private javax.swing.JTable userInfo_table;
    // End of variables declaration//GEN-END:variables
}
