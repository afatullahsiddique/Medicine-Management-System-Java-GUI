
package medicinebazer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.xml.namespace.QName;

public class UserHome extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public UserHome() {
        initComponents();
        Connection();
        show_user();
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
       
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_medicine = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        medId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rightArrow = new javax.swing.JLabel();
        leftArrow = new javax.swing.JLabel();
        viewBooking = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        medQuantity = new javax.swing.JTextField();
        addBill = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBill = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        medName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        clearButton1 = new javax.swing.JLabel();
        clearButton3 = new javax.swing.JLabel();
        txtBuy = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        medprice = new javax.swing.JTextField();
        txtMinimize = new javax.swing.JLabel();
        txtClose = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(1480, 770));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display_medicine.setBackground(new java.awt.Color(0, 102, 102));
        display_medicine.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        display_medicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "PRICE", "QUANTITY", "FAB-DATE", "EXP-DATE", "COMPANY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 1190, 210));

        jLabel6.setFont(new java.awt.Font("URW Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("MEDICINE ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 30));

        medId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medIdActionPerformed(evt);
            }
        });
        jPanel1.add(medId, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 210, -1));

        jLabel9.setFont(new java.awt.Font("Fira Code", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("BILL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        rightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/right-arrow (1).png"))); // NOI18N
        rightArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rightArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightArrowMouseClicked(evt);
            }
        });
        jPanel1.add(rightArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 720, -1, -1));

        leftArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/left-arrow (1).png"))); // NOI18N
        leftArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftArrowMouseClicked(evt);
            }
        });
        jPanel1.add(leftArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 720, -1, -1));

        viewBooking.setBackground(new java.awt.Color(0, 51, 51));
        viewBooking.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        viewBooking.setForeground(new java.awt.Color(0, 102, 0));
        viewBooking.setText("Details");
        viewBooking.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewBooking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewBookingMouseClicked(evt);
            }
        });
        viewBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookingActionPerformed(evt);
            }
        });
        viewBooking.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                viewBookingKeyPressed(evt);
            }
        });
        jPanel1.add(viewBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 610, 100, 40));

        jLabel7.setFont(new java.awt.Font("URW Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Quantity");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, 30));

        medQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(medQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 210, -1));

        addBill.setBackground(new java.awt.Color(153, 153, 153));
        addBill.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        addBill.setForeground(new java.awt.Color(0, 102, 0));
        addBill.setText("ADD to BILL");
        addBill.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBillMouseClicked(evt);
            }
        });
        jPanel1.add(addBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, 40));

        txtBill.setBackground(new java.awt.Color(204, 204, 204));
        txtBill.setColumns(20);
        txtBill.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 14)); // NOI18N
        txtBill.setRows(5);
        jScrollPane2.setViewportView(txtBill);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 930, 190));

        jLabel8.setFont(new java.awt.Font("URW Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("MEDICINE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, 30));

        medName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medNameActionPerformed(evt);
            }
        });
        jPanel1.add(medName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 210, -1));

        jLabel10.setFont(new java.awt.Font("Fira Code", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("WHICH MEDICINE DO YOU WANNA BUY");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        clearButton1.setBackground(new java.awt.Color(153, 153, 153));
        clearButton1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        clearButton1.setForeground(new java.awt.Color(0, 102, 0));
        clearButton1.setText("Clear");
        clearButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButton1MouseClicked(evt);
            }
        });
        jPanel1.add(clearButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 70, 40));

        clearButton3.setBackground(new java.awt.Color(153, 153, 153));
        clearButton3.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        clearButton3.setForeground(new java.awt.Color(0, 102, 0));
        clearButton3.setText("  Clear");
        clearButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButton3MouseClicked(evt);
            }
        });
        jPanel1.add(clearButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 660, 100, 40));

        txtBuy.setBackground(new java.awt.Color(153, 153, 153));
        txtBuy.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        txtBuy.setForeground(new java.awt.Color(0, 102, 0));
        txtBuy.setText("   Buy");
        txtBuy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuyMouseClicked(evt);
            }
        });
        jPanel1.add(txtBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 550, 100, 40));

        jLabel11.setFont(new java.awt.Font("URW Gothic", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 204));
        jLabel11.setText("Price");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, 30));

        medprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medpriceActionPerformed(evt);
            }
        });
        jPanel1.add(medprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 210, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 1250, 780));

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
        jPanel3.add(txtMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 2, -1, 30));

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
        jPanel3.add(txtClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 10, 24, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/drug.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("MediStore");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 102, 0));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Home");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 220, 30));

        jPanel7.setBackground(new java.awt.Color(51, 102, 0));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Home");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        jPanel6.setBackground(new java.awt.Color(51, 102, 0));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Home");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 800));

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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void medIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medIdActionPerformed

    private void display_medicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_display_medicineMouseClicked
    
        int i = display_medicine.getSelectedRow();
        TableModel model = display_medicine.getModel();
        medId.setText(model.getValueAt(i, 0).toString());
        medName.setText(model.getValueAt(i, 1).toString());
        
        price =  Integer.valueOf(model.getValueAt(i, 2).toString());
        medprice.setText(model.getValueAt(i, 2).toString());
        
        medQuantity.setText(model.getValueAt(i, 3).toString());
        
        
    }//GEN-LAST:event_display_medicineMouseClicked

    private void leftArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftArrowMouseClicked
        new UserHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_leftArrowMouseClicked

    private void rightArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightArrowMouseClicked
        new UserHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rightArrowMouseClicked

    private void viewBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewBookingMouseClicked
        new booking_list_user().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewBookingMouseClicked

    private void viewBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookingActionPerformed

    }//GEN-LAST:event_viewBookingActionPerformed

    private void viewBookingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_viewBookingKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBookingKeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        new UserHome().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void medQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medQuantityActionPerformed

    
    public void update(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/MedicineBazer","root","");

            String sqlupdate= "update admin_add_product set medQty= medQty-? where medId=? ";   
            pst=con.prepareStatement(sqlupdate);
            pst.setString(1,medQuantity.getText());    
            pst.setString(2,medId.getText());  

            pst.executeUpdate();
            
            DefaultTableModel model = (DefaultTableModel)display_medicine.getModel();
            model.setRowCount(0);
            show_user();
            
        } catch (SQLException ex) {
            Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    int i=0, price;
    
    private void addBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBillMouseClicked
        
        if(medId.getText().equals("")){
            //JOptionPane.showMessageDialog(this, "");
        }else if(medName.getText().equals("")){
            //JOptionPane.showMessageDialog(this, "");
        }if(medQuantity.getText().equals("")){
            //JOptionPane.showMessageDialog(this, "");
        }else{
            i++;
            update();
            if(i==1){
                txtBill.setText(txtBill.getText()+"            	              \t  ****************MedicineBazer****************\n"
                    + "\tID     MEDICINE      QUANTITY       PRICE      TOTAL\n\t"
                    + ""+i+"      "+medName.getText()+"           "+medQuantity.getText()+ "                     "+price+"              "
                    + Integer.valueOf(medQuantity.getText())*price); 
            }else{
                txtBill.setText(txtBill.getText()+"            	              \t  ****************MedicineBazer****************\n"
                    + "\tID     MEDICINE      QUANTITY       PRICE      TOTAL\n\t"
                    + ""+i+"      "+medName.getText()+"           "+medQuantity.getText()+ "                     "+price+"              "
                    + Integer.valueOf(medQuantity.getText())*price);
            }
        }
        
        
        
    }//GEN-LAST:event_addBillMouseClicked

    private void medNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medNameActionPerformed

    private void clearButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButton1MouseClicked
        medId.setText(null);
        medName.setText(null);
        medQuantity.setText(null);
        medprice.setText(null);
    }//GEN-LAST:event_clearButton1MouseClicked

    private void clearButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButton3MouseClicked
        txtBill.setText(null);
    }//GEN-LAST:event_clearButton3MouseClicked

    private void txtBuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuyMouseClicked
       
        if(medId.getText().equals("") || medName.getText().equals("") || medQuantity.getText().equals("")|| medprice.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Fill the blank tables");
        }
        else{
            
            try {   
                
                String id = medId.getText();
                String name = medName.getText();
                String quantity = medQuantity.getText();
                String medPrice = medprice.getText();
   
                    
                pst = con.prepareStatement("insert into booking_madicine(id,medicine,quantity,price)value(?,?,?,?)");
                pst.setString(1,id);
                pst.setString(2,name);
                pst.setString(3,quantity);
                pst.setString(4, medPrice);
                
                pst.executeUpdate();
                
                DefaultTableModel model = (DefaultTableModel)display_medicine.getModel();
                model.setRowCount(0);
                show_user();
                
                new cardDetails().setVisible(true);
                this.setVisible(false);
            
                medId.setText("");
                medName.setText("");
                medQuantity.setText("");
                medprice.setText("");

            } catch (SQLException ex) {
                Logger.getLogger(registrationForm.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        }
    }//GEN-LAST:event_txtBuyMouseClicked

    private void medpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medpriceActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        new loginForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        new registrationForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBill;
    private javax.swing.JLabel clearButton1;
    private javax.swing.JLabel clearButton3;
    private javax.swing.JTable display_medicine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel leftArrow;
    private javax.swing.JTextField medId;
    private javax.swing.JTextField medName;
    private javax.swing.JTextField medQuantity;
    private javax.swing.JTextField medprice;
    private javax.swing.JLabel rightArrow;
    private javax.swing.JTextArea txtBill;
    private javax.swing.JLabel txtBuy;
    private javax.swing.JLabel txtClose;
    private javax.swing.JLabel txtMinimize;
    private javax.swing.JButton viewBooking;
    // End of variables declaration//GEN-END:variables
}
