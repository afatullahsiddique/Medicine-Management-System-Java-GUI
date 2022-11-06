
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
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class booking_list_user extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public booking_list_user() {
        initComponents();
        show_user();
        theader();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }
    
public ArrayList<Booking>userList(){
        
        ArrayList<Booking>usersList = new ArrayList<>();
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/MedicineBazer","root","");
            
            String query = "SELECT * FROM booking_madicine";
            
            pst = con.prepareStatement(query);
            rs = pst.executeQuery(query);
        
            Booking user;
            while(rs.next()){
                user = new Booking(rs.getInt("id"),rs.getString("medicine"),rs.getInt("quantity"),rs.getInt("price"));
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
        
        ArrayList<Booking> list = userList();
        DefaultTableModel model = (DefaultTableModel)display_medicine.getModel();
        Object[] row = new Object[7];
        
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getquantity();
            row[3]=list.get(i).getprice();
            
            model.addRow(row);
        }
    }  
     
    
    public void theader(){
       JTableHeader thead = display_medicine.getTableHeader();
       //thead.setForeground(Color.blue);
       thead.setBackground(Color.LIGHT_GRAY);
       thead.setFont(new Font("Tahome",Font.BOLD,18));
       
       
       TableColumn col1=display_medicine.getColumnModel().getColumn(0);
       col1.setPreferredWidth(100);
       TableColumn col2=display_medicine.getColumnModel().getColumn(1);
       col2.setPreferredWidth(100);
       TableColumn col3=display_medicine.getColumnModel().getColumn(2);
       col3.setPreferredWidth(100);
       TableColumn col4=display_medicine.getColumnModel().getColumn(3);
       col4.setPreferredWidth(100);
       
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        medId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        leftArrow = new javax.swing.JLabel();
        rightArrow = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_medicine = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        txtClose2 = new javax.swing.JLabel();
        txtMinimize3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1480, 770));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setForeground(new java.awt.Color(0, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 153, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Users Booking");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 210, 50));

        jPanel9.setBackground(new java.awt.Color(0, 102, 51));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Informations");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 180, 50));

        removeButton.setBackground(new java.awt.Color(0, 102, 102));
        removeButton.setFont(new java.awt.Font("Fira Code SemiBold", 1, 15)); // NOI18N
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Cancel");
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
        jPanel7.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 100, 40));

        clearButton.setBackground(new java.awt.Color(0, 102, 102));
        clearButton.setFont(new java.awt.Font("Fira Code SemiBold", 1, 15)); // NOI18N
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
        jPanel7.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 110, 40));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 1240, 10));

        medId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medIdActionPerformed(evt);
            }
        });
        jPanel7.add(medId, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 240, 30));

        jLabel6.setFont(new java.awt.Font("URW Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Medicine Id");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, 30));

        leftArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/left-arrow (1).png"))); // NOI18N
        leftArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftArrowMouseClicked(evt);
            }
        });
        jPanel7.add(leftArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, -1, -1));

        rightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/right-arrow (1).png"))); // NOI18N
        rightArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rightArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightArrowMouseClicked(evt);
            }
        });
        jPanel7.add(rightArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 700, -1, -1));

        display_medicine.setBackground(new java.awt.Color(0, 102, 102));
        display_medicine.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        display_medicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDID", "MEDICINE", "QUANTITY", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        display_medicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                display_medicineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(display_medicine);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 1210, 270));
        jPanel7.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1240, 10));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 1260, 740));

        txtClose2.setFont(new java.awt.Font("Cantarell Extra Bold", 1, 14)); // NOI18N
        txtClose2.setForeground(new java.awt.Color(255, 255, 255));
        txtClose2.setText("X");
        txtClose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtClose2txtCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtClose2txtCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtClose2txtCloseMouseExited(evt);
            }
        });
        jPanel1.add(txtClose2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 10, 18, -1));

        txtMinimize3.setFont(new java.awt.Font("Cantarell Extra Bold", 1, 20)); // NOI18N
        txtMinimize3.setForeground(new java.awt.Color(255, 255, 255));
        txtMinimize3.setText("-");
        txtMinimize3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtMinimize3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMinimize3txtMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMinimize3txtMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMinimize3txtMinimizeMouseExited(evt);
            }
        });
        jPanel1.add(txtMinimize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 0, 10, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/drug.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("E-MediBazer");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void display_medicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_display_medicineMouseClicked

        int i = display_medicine.getSelectedRow();
        TableModel model = display_medicine.getModel();
        medId.setText(model.getValueAt(i, 0).toString());

    }//GEN-LAST:event_display_medicineMouseClicked

    private void rightArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightArrowMouseClicked
        new booking_list_user().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rightArrowMouseClicked

    private void leftArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftArrowMouseClicked
        new UserHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_leftArrowMouseClicked

    private void medIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medIdActionPerformed

    private void clearButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonKeyPressed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed

        medId.setText(null);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonMouseClicked

    private void removeButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_removeButtonKeyPressed

    }//GEN-LAST:event_removeButtonKeyPressed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed

        if(medId.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Select ID to Cancel");
        }
        else{
            try {
                //SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");

                String id = medId.getText();
                //String name = medName.getText();
                //String price = medPrice.getText();
                //String quantity = medQty.getText();
                //String fabdate = sdf.format(medFabDate.getDate());
                //String expdate = sdf.format(medExpDate.getDate());
                //String company = medCompany.getSelectedItem().toString();

                pst = con.prepareStatement("Delete from booking_madicine where id=?");

                pst.setString(1, id);
                pst.executeUpdate();

                DefaultTableModel model = (DefaultTableModel)display_medicine.getModel();
                model.setRowCount(0);
                show_user();

                JOptionPane.showMessageDialog(this, "Cancelled!");

            } catch (SQLException ex) {
                Logger.getLogger(registrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void removeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseClicked

        DefaultTableModel model = (DefaultTableModel)display_medicine.getModel();
        model.setRowCount(0);
        show_user();
    }//GEN-LAST:event_removeButtonMouseClicked

    private void jLabel9jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9jLabel2MouseClicked
        new booking_list_admin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9jLabel2MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new AdminHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtClose2txtCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClose2txtCloseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClose2txtCloseMouseExited

    private void txtClose2txtCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClose2txtCloseMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClose2txtCloseMouseEntered

    private void txtClose2txtCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClose2txtCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtClose2txtCloseMouseClicked

    private void txtMinimize3txtMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimize3txtMinimizeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinimize3txtMinimizeMouseExited

    private void txtMinimize3txtMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimize3txtMinimizeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinimize3txtMinimizeMouseEntered

    private void txtMinimize3txtMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimize3txtMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_txtMinimize3txtMinimizeMouseClicked

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
            java.util.logging.Logger.getLogger(booking_list_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking_list_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking_list_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking_list_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking_list_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JTable display_medicine;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel leftArrow;
    private javax.swing.JTextField medId;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel rightArrow;
    private javax.swing.JLabel txtClose2;
    private javax.swing.JLabel txtMinimize3;
    // End of variables declaration//GEN-END:variables
}
