
package medicinebazer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class ManageProduct extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public ManageProduct() {
        initComponents();
        show_user();
        Connection();
        theader();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2); 
    }
    
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
    
    public ArrayList<Admin>userList(){
        
        ArrayList<Admin>usersList = new ArrayList<>();
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/MedicineBazer","root","");
            
            String query = "SELECT * FROM admin_add_product";
            
            pst = con.prepareStatement(query);
            rs = pst.executeQuery(query);
        
            Admin admin;
            while(rs.next()){
                admin = new Admin(rs.getString("medId"),rs.getString("medName"),rs.getString("medPrice"),rs.getString("medQty"),rs.getString("medFabDate"),rs.getString("medExpDate"),rs.getString("medCompany"));
                usersList.add(admin);
            }
    
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return usersList;
        
    }
    
    
    public void show_user(){
        
        ArrayList<Admin> list = userList();
        DefaultTableModel model = (DefaultTableModel)display_medicine.getModel();
        Object[] row = new Object[7];
        
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getprice();
            row[3]=list.get(i).getqty();
            row[4]=list.get(i).getfab();
            row[5]=list.get(i).getexp();
            row[6]=list.get(i).getcomp();
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
       TableColumn col5=display_medicine.getColumnModel().getColumn(4);
       col5.setPreferredWidth(100);
       TableColumn col6=display_medicine.getColumnModel().getColumn(5);
       col6.setPreferredWidth(100);
       TableColumn col7=display_medicine.getColumnModel().getColumn(6);
       col7.setPreferredWidth(100);
       
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_medicine = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        medID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        medName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        medPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        medQty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        medExpDate = new com.toedter.calendar.JDateChooser();
        medFabDate = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        medCompany = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        leftArrow = new javax.swing.JLabel();
        rightArrow = new javax.swing.JLabel();
        txtMinimize = new javax.swing.JLabel();
        txtClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(1480, 770));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display_medicine.setBackground(new java.awt.Color(0, 102, 102));
        display_medicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MADICINE", "PRICE", "QUANTITY", "FAB-DATE", "EXP-DATE", "COMPANY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 1190, 230));

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        medID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medIDActionPerformed(evt);
            }
        });
        jPanel1.add(medID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 230, 30));

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("COMPANY");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, 20));

        medName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medNameActionPerformed(evt);
            }
        });
        jPanel1.add(medName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 230, 30));

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("PRICE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 70, -1));

        medPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medPriceActionPerformed(evt);
            }
        });
        jPanel1.add(medPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 230, 30));

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("QUANTITY");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, 20));

        medQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medQtyActionPerformed(evt);
            }
        });
        jPanel1.add(medQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 230, 30));

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("MEDNAME");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("FABDATE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, 20));
        jPanel1.add(medExpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 210, 30));
        jPanel1.add(medFabDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 210, 30));

        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 204));
        jLabel11.setText("EXPDATE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, -1, 20));

        medCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Square", "Incepta", "Beximco", "Opsonin", "Renata", "ACI", "Indo-Bangla", "Albion" }));
        jPanel1.add(medCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 210, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("MANAGE MEDICINE");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        clearButton.setBackground(new java.awt.Color(0, 102, 102));
        clearButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
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
        jPanel1.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 150, 40));

        addButton.setBackground(new java.awt.Color(0, 102, 102));
        addButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        addButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addButtonKeyPressed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 150, 40));

        updateButton.setBackground(new java.awt.Color(0, 102, 102));
        updateButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        updateButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                updateButtonKeyPressed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 150, 40));

        removeButton.setBackground(new java.awt.Color(0, 102, 102));
        removeButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
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
        jPanel1.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 150, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 1230, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1230, 10));

        leftArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/left-arrow (1).png"))); // NOI18N
        leftArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftArrowMouseClicked(evt);
            }
        });
        jPanel1.add(leftArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, -1, -1));

        rightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/right-arrow (1).png"))); // NOI18N
        rightArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rightArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightArrowMouseClicked(evt);
            }
        });
        jPanel1.add(rightArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 700, -1, -1));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 1250, 740));

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
        jPanel5.add(txtMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 2, -1, 30));

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
        jPanel5.add(txtClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 10, 18, -1));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("MediStore");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/drug.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        new ManageProduct().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void medIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medIDActionPerformed

    private void medNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medNameActionPerformed

    private void medPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medPriceActionPerformed

    private void medQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medQtyActionPerformed

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        
        medID.setText(null);
        medName.setText(null);
        medPrice.setText(null);
        medQty.setText(null);
        medFabDate.setDate(null);
        medExpDate.setDate(null);
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void clearButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonKeyPressed
    
     public void addToDatabase(){
                               
            if(medID.getText().equals("") || medName.getText().equals("") || medPrice.getText().equals("") || medQty.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Fill the Blank Table");
            }
            else{  
                try {   
                
                SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
                
                String id = medID.getText();
                String name = medName.getText();
                String price = medPrice.getText();
                String quantity = medQty.getText();
                String fabdate = sdf.format(medFabDate.getDate());
                String expdate = sdf.format(medExpDate.getDate());
                String company = medCompany.getSelectedItem().toString();

                pst = con.prepareStatement("insert into admin_add_product(medId,medName,medPrice,medQty,medFabDate,medExpDate,medCompany)value(?,?,?,?,?,?,?)");
                pst.setString(1,id);
                pst.setString(2,name);
                pst.setString(3,price);
                pst.setString(4,quantity);
                pst.setString(5,fabdate);
                pst.setString(6,expdate);
                pst.setString(7,company);
                pst.executeUpdate();
                
                DefaultTableModel model = (DefaultTableModel)display_medicine.getModel();
                model.setRowCount(0);
                show_user();
                
                JOptionPane.showMessageDialog(this, "Added!");

                medID.setText("");
                medName.setText("");
                medPrice.setText("");
                medQty.setText("");
                //medFabDate.getDate("");
                //medExpDate.getDate("");
                medCompany.getSelectedItem().toString();

                } catch (SQLException ex) {
                    Logger.getLogger(registrationForm.class.getName()).log(Level.SEVERE, null, ex);
                }      
            }
        }

    
    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        
        addToDatabase();
    }//GEN-LAST:event_addButtonMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void addButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addButtonKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
         addToDatabase();
        }
    }//GEN-LAST:event_addButtonKeyPressed

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        if(medID.getText().equals("") || medName.getText().equals("") || medPrice.getText().equals("") || medQty.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Fill the Blank Table");
        }
        else{
           
            try {   
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");

            String id = medID.getText();
            String name = medName.getText();
            String price = medPrice.getText();
            String quantity = medQty.getText();
            String fabdate = sdf.format(medFabDate.getDate());
            String expdate = sdf.format(medExpDate.getDate());
            String company = medCompany.getSelectedItem().toString();

            pst = con.prepareStatement("UPDATE admin_add_product set medName=?,medPrice=?,medQty=?,medFabDate=?,medExpDate=?,medCompany=? where medId=?");
            
            pst.setString(1,name);
            pst.setString(2,price);
            pst.setString(3,quantity);
            pst.setString(4,fabdate);
            pst.setString(5,expdate);
            pst.setString(6,company);
            
            pst.setString(7, id);
            pst.executeUpdate();
            
            DefaultTableModel model = (DefaultTableModel)display_medicine.getModel();
            model.setRowCount(0);
            show_user();
            
            JOptionPane.showMessageDialog(this, "Updated!");

            medID.setText("");
            medName.setText("");
            medPrice.setText("");
            medQty.setText("");
            //medFabDate.getDate("");
            //medExpDate.getDate("");
            medCompany.getSelectedItem().toString();

            } catch (SQLException ex) {
                Logger.getLogger(registrationForm.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void updateButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonKeyPressed

    private void removeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseClicked
        
        DefaultTableModel model = (DefaultTableModel)display_medicine.getModel();
        model.setRowCount(0);
        show_user();
    }//GEN-LAST:event_removeButtonMouseClicked

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        
        if(medID.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Select ID to Remove");
        }
        else{
            try {         
            //SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");

            String id = medID.getText();
            //String name = medName.getText();
            //String price = medPrice.getText();
            //String quantity = medQty.getText();
            //String fabdate = sdf.format(medFabDate.getDate());
            //String expdate = sdf.format(medExpDate.getDate());
            //String company = medCompany.getSelectedItem().toString();

            pst = con.prepareStatement("Delete from admin_add_product where medId=?");
            
            pst.setString(1, id);
            pst.executeUpdate();
            
            DefaultTableModel model = (DefaultTableModel)display_medicine.getModel();
            model.setRowCount(0);
            show_user();
            
            JOptionPane.showMessageDialog(this, "Removed!");

            } catch (SQLException ex) {
                Logger.getLogger(registrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_removeButtonActionPerformed

    private void removeButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_removeButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeButtonKeyPressed

    private void display_medicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_display_medicineMouseClicked
        
        int i = display_medicine.getSelectedRow();
        TableModel model = display_medicine.getModel();
        medID.setText(model.getValueAt(i, 0).toString());
        medName.setText(model.getValueAt(i, 1).toString());
        medPrice.setText(model.getValueAt(i, 2).toString());
        medQty.setText(model.getValueAt(i, 3).toString());
        
        /*
        String company=model.getValueAt(i, 2).toString();
            switch (company) {
            case "Napa":
                company.setSelectedIndex(0);
                break;
            case "Peracitamol":
                company.setSelectedIndex(2);
                break;
            default:
                throw new AssertionError();
        }
        */
    }//GEN-LAST:event_display_medicineMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new AdminHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void leftArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftArrowMouseClicked
        new AdminHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_leftArrowMouseClicked

    private void rightArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightArrowMouseClicked
        new ManageProduct().setVisible(true);
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
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTable display_medicine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel leftArrow;
    private javax.swing.JComboBox<String> medCompany;
    private com.toedter.calendar.JDateChooser medExpDate;
    private com.toedter.calendar.JDateChooser medFabDate;
    private javax.swing.JTextField medID;
    private javax.swing.JTextField medName;
    private javax.swing.JTextField medPrice;
    private javax.swing.JTextField medQty;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel rightArrow;
    private javax.swing.JLabel txtClose;
    private javax.swing.JLabel txtMinimize;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

}
