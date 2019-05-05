package invoice;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Invo extends javax.swing.JFrame {
Connection con;
PreparedStatement stmt,st;
ResultSet rs;
DefaultTableModel model;
float a,b,temp,c,g,total=0,e,f;
int count=1,ctr,quan,qua,temp1;
String str="",s1="";
    public Invo() throws SQLException {
        initComponents();
        con=ConnDb.conLink();
        this.setLocationRelativeTo(null);
        model=(DefaultTableModel)tab.getModel();
       
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        Date d=new Date();
        date.setText(s.format(d));
        
        create();
       st=con.prepareStatement("insert into temp values(?,?)");
        stmt=con.prepareStatement("select p_id,p_quantity from product");
        rs=stmt.executeQuery();
        while(rs.next())
        {
            pid_combo.addItem(rs.getString("p_id"));
            st.setString(1,rs.getString(1));
            st.setString(2,rs.getString(2));
            st.executeUpdate();
        }
        stmt=con.prepareStatement("select c_id from customer");
        rs=stmt.executeQuery();
        while(rs.next())
        {
            cid_combo.addItem(rs.getString("c_id"));
        }
        quan_tf.requestFocus();   
    }
    public void create() throws SQLException
    {
        st=con.prepareStatement("select invoice_no from automatic");
        rs=st.executeQuery();
        rs.next();
        ctr=rs.getInt(1)+1;
        if(ctr<10)
            str="I000"+ctr;
        else if(ctr<100)
            str="I00"+ctr;
        else if(ctr<1000)
            str="I0"+ctr;
        else if(ctr<10000)
            str="I"+ctr;
        else
            JOptionPane.showMessageDialog(this,"More than 9999 not allowed","Data excede",JOptionPane.ERROR_MESSAGE);
        ino_tf.setText(str);
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        phn_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        custname_tf = new javax.swing.JTextField();
        brand_label = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        price_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        qty1_label = new javax.swing.JLabel();
        cid_combo = new javax.swing.JComboBox<>();
        total_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        pid_label = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        ino_tf = new javax.swing.JTextField();
        tax_tf = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        weight_label = new javax.swing.JLabel();
        qua_tf = new javax.swing.JTextField();
        dis_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pid_combo = new javax.swing.JComboBox<>();
        name_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        price_label = new javax.swing.JLabel();
        brand_tf = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        qty_label = new javax.swing.JLabel();
        subt_tf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        dis_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        weight_tf = new javax.swing.JTextField();
        quan_tf = new javax.swing.JTextField();
        print_bt = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        phn_tf.setEditable(false);
        phn_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText(" EMAIL");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("DATE");

        custname_tf.setEditable(false);
        custname_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        brand_label.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        brand_label.setText("BRAND");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setText("SUB TOTAL");

        price_tf.setEditable(false);
        price_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText(" NAME");

        qty1_label.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        qty1_label.setText("QUANTITY TO BE SOLD");

        cid_combo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cid_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT" }));
        cid_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cid_comboActionPerformed(evt);
            }
        });

        total_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("INVOICE NO.");

        insert.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        pid_label.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pid_label.setText("PRODUCT ID");

        ino_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        tax_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tax_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tax_tfActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton6.setText("ADD NEW CUSTOMER");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        weight_label.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        weight_label.setText("WEIGHT");

        qua_tf.setEditable(false);
        qua_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        dis_tf.setEditable(false);
        dis_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("CUSTOMER ID");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setText("TOTAL");

        pid_combo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pid_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT" }));
        pid_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pid_comboActionPerformed(evt);
            }
        });

        name_tf.setEditable(false);
        name_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        email_tf.setEditable(false);
        email_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        tab.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERIAL NO.", "PRODUCT ID", "BRAND", "NAME", "WEIGHT", "PRICE", "QUANTITY", "TOTAL"
            }
        ));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab);

        price_label.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        price_label.setText("PRICE");

        brand_tf.setEditable(false);
        brand_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        name_label.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        name_label.setText("NAME");

        add.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Invoice");

        qty_label.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        qty_label.setText("QUANTITY AVAILABLE");

        subt_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setText("TAX(GST)");

        dis_label.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        dis_label.setText("DISCOUNT");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("PHONE NO.");

        weight_tf.setEditable(false);
        weight_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        quan_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        print_bt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        print_bt.setText("PRINT");
        print_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pid_label)
                        .addGap(4, 4, 4)
                        .addComponent(pid_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(brand_label)
                        .addGap(4, 4, 4)
                        .addComponent(brand_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(name_label)
                        .addGap(22, 22, 22)
                        .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(qty_label)
                        .addGap(22, 22, 22)
                        .addComponent(qua_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(weight_label)
                        .addGap(4, 4, 4)
                        .addComponent(weight_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dis_label)
                        .addGap(10, 10, 10)
                        .addComponent(dis_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(price_label)
                        .addGap(10, 10, 10)
                        .addComponent(price_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addGap(111, 111, 111)
                        .addComponent(custname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6)
                        .addGap(65, 65, 65)
                        .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(qty1_label)
                        .addGap(17, 17, 17)
                        .addComponent(quan_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(insert)
                        .addGap(36, 36, 36)
                        .addComponent(print_bt)
                        .addGap(436, 436, 436)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(subt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1052, 1052, 1052)
                        .addComponent(jLabel14)
                        .addGap(32, 32, 32)
                        .addComponent(tax_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1052, 1052, 1052)
                        .addComponent(jLabel15)
                        .addGap(53, 53, 53)
                        .addComponent(total_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(859, 859, 859)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(cid_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addComponent(phn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cid_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(phn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(pid_label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(pid_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(brand_label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(brand_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(name_label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(qty_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(qua_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(weight_label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(weight_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(dis_label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(dis_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(price_label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add))))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(qty1_label))
                    .addComponent(quan_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(insert))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(print_bt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13))
                    .addComponent(subt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tax_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(total_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        int rowsCount=tab.getRowCount();
        String s="";
        for(int i=0;i<rowsCount;i++)
        {
            s=s+(tab.getValueAt(i,1).toString()+",");
        }
         
        try {
        stmt=con.prepareStatement("insert into invoice values(?,?,?,?,?,?,?)");
        stmt.setString(1,ino_tf.getText());
        stmt.setString(2,date.getText());
        stmt.setString(3, (String) cid_combo.getSelectedItem());
        stmt.setString(4,s);
        stmt.setString(5,subt_tf.getText());
        stmt.setString(6,tax_tf.getText());
        stmt.setString(7,total_tf.getText());
        
        int r=stmt.executeUpdate();
        st=con.prepareStatement("update automatic set invoice_no=?");
        st.setInt(1,ctr);
        st.executeUpdate();
        JOptionPane.showMessageDialog(this,"successfully record inserted","insertion",JOptionPane.INFORMATION_MESSAGE);
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this,"connection problem","problem",JOptionPane.ERROR_MESSAGE);
             Logger.getLogger(Invo.class.getName()).log(Level.SEVERE, null, ex);
         }
        for(int i=0;i<rowsCount;i++)
        {
        try {
             quan=Integer.parseInt(tab.getValueAt(i,6).toString());
             try{
            stmt=con.prepareStatement("select * from product where upper(p_id)=?");
            stmt.setString(1,tab.getValueAt(i,1).toString() );
            rs=stmt.executeQuery();
            rs.next();
            qua=Integer.parseInt(rs.getString(4));
             }
             catch (SQLException ex) { 
              Logger.getLogger(Invo.class.getName()).log(Level.SEVERE, null, ex);
                }
            temp1=qua-quan;
            stmt=con.prepareStatement("update product set p_quantity=? where upper(p_id)=?");
             stmt.setString(2,tab.getValueAt(i,1).toString() );
             stmt.setInt(1,temp1);
            int r=stmt.executeUpdate();
             } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"product updation problem!","problem",JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(Invo.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
       
    }//GEN-LAST:event_insertActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(quan_tf.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null,"product quantity must be given!");
        }
        quan=Integer.parseInt(quan_tf.getText());
        qua=Integer.parseInt(qua_tf.getText());
        if(quan>qua)
        {
            quan_tf.requestFocus();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"quantity exceeded");
        }
        else
        {
        a=Float.parseFloat(price_tf.getText());
     b=Float.parseFloat(quan_tf.getText());
     c=Float.parseFloat(dis_tf.getText());
     g=(a-(a*c)/100);
        temp=g*b;
        total=total+temp;
        model.addRow(new Object[]{count,pid_combo.getSelectedItem(),brand_tf.getText(),name_tf.getText(),weight_tf.getText(),g,quan_tf.getText(),temp});
        subt_tf.setText(""+total);
        count++;
        }
        if(!(Integer.parseInt(qua_tf.getText())==0))
                {
         try {
            quan=Integer.parseInt(quan_tf.getText());
            qua=Integer.parseInt(qua_tf.getText());
            temp1=qua-quan;
            stmt=con.prepareStatement("update temp set p_quantity=? where upper(p_id)=?");
            stmt.setInt(1,temp1);
            stmt.setString(2, (String) pid_combo.getSelectedItem());
            int r=stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"product updation problem!","problem",JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(Invo.class.getName()).log(Level.SEVERE, null, ex);
    }
                }
       pid_combo.setSelectedItem("");
        name_tf.setText("");
        brand_tf.setText("");
        qua_tf.setText("");
        price_tf.setText("");
        dis_tf.setText("");
        weight_tf.setText("");
        quan_tf.setText("");      
    }//GEN-LAST:event_addActionPerformed
 public void print(){
        PrinterJob pjob = PrinterJob.getPrinterJob();
            PageFormat preformat = pjob.defaultPage();
            preformat.setOrientation(PageFormat.LANDSCAPE);
            PageFormat postformat = pjob.pageDialog(preformat);
            //If user does not hit cancel then print.
            if (preformat != postformat) {
                 //Set print component
            pjob.setPrintable(new Printer(this), postformat);
            if (pjob.printDialog()) {
                try {
                    pjob.print();
                } catch (PrinterException ex) {  
                }
            }  
            }
    }
    public static class Printer implements Printable {
    final Component comp;

    public Printer(Component comp){
        this.comp = comp;
    }
    @Override
        public int print(Graphics g, PageFormat format, int page_index) 
            throws PrinterException {
        if (page_index > 0) {
            return Printable.NO_SUCH_PAGE;
        }

        // get the bounds of the component
        Dimension dim = comp.getSize();
        double cHeight = dim.getHeight();
        double cWidth = dim.getWidth();
        // get the bounds of the printable area
        double pHeight = format.getImageableHeight();
        double pWidth = format.getImageableWidth();

        double pXStart = format.getImageableX();
        double pYStart = format.getImageableY();

        double xRatio = pWidth / cWidth;
        double yRatio = pHeight / cHeight;
        Graphics2D g2 = (Graphics2D) g;
        g2.translate(pXStart, pYStart);
        g2.scale(xRatio, yRatio);
        comp.paint(g2);
        return Printable.PAGE_EXISTS;
    }
}

    private void tax_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tax_tfActionPerformed
        e=Float.parseFloat(subt_tf.getText());
        f=Float.parseFloat(tax_tf.getText());
        total_tf.setText(""+(e+(e*(f/100))));
    }//GEN-LAST:event_tax_tfActionPerformed

    private void print_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_btActionPerformed
        print_bt.setVisible(false);
        pid_combo.setVisible(false);
        name_tf.setVisible(false);
        brand_tf.setVisible(false);
        qua_tf.setVisible(false);
        price_tf.setVisible(false);
        dis_tf.setVisible(false);
        weight_tf.setVisible(false);
        quan_tf.setVisible(false);
        insert.setVisible(false);
        add.setVisible(false);
        pid_label.setVisible(false);
        brand_label.setVisible(false);
        name_label.setVisible(false);
        qty_label.setVisible(false);
        dis_label.setVisible(false);
        price_label.setVisible(false);
        weight_label.setVisible(false);
        qty1_label.setVisible(false);
        print();
    }//GEN-LAST:event_print_btActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   
      
    try {
        new Customer(this).setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(Invo.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void pid_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pid_comboActionPerformed
        try{
            stmt=con.prepareStatement("select * from product where upper(p_id)=?");
            stmt.setString(1, (String) pid_combo.getSelectedItem());
            rs=stmt.executeQuery();
            rs.next();
            brand_tf.setText(rs.getString(3));
            name_tf.setText(rs.getString(2));
            weight_tf.setText(rs.getString(5));
            dis_tf.setText(rs.getString(9));
            price_tf.setText(rs.getString(6));
            } catch (SQLException ex) {
        Logger.getLogger(Invo.class.getName()).log(Level.SEVERE, null, ex);
    }
         try{
            stmt=con.prepareStatement("select * from temp where upper(p_id)=?");
            stmt.setString(1, (String) pid_combo.getSelectedItem());
            rs=stmt.executeQuery();
            rs.next();
            qua_tf.setText(rs.getString(2));
         } catch (SQLException ex) {
        Logger.getLogger(Invo.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_pid_comboActionPerformed

    private void cid_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cid_comboActionPerformed
        try{
            stmt=con.prepareStatement("select * from customer where upper(c_id)=?");
            stmt.setString(1, (String) cid_combo.getSelectedItem());
            rs=stmt.executeQuery();
            rs.next();
            custname_tf.setText(rs.getString(2));
            phn_tf.setText(rs.getString(4));
            email_tf.setText(rs.getString(3));
            } catch (SQLException ex) { 
        Logger.getLogger(Invo.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }//GEN-LAST:event_cid_comboActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        try {
            quan=Integer.parseInt(tab.getValueAt(tab.getSelectedRow(),6).toString());
             try{
            stmt=con.prepareStatement("select * from temp where upper(p_id)=?");
            System.out.println("");
            stmt.setString(1,tab.getValueAt(tab.getSelectedRow(),1).toString() );
            rs=stmt.executeQuery();
            rs.next();
            qua=Integer.parseInt(rs.getString(2));
             }
             catch (SQLException ex) { 
        Logger.getLogger(Invo.class.getName()).log(Level.SEVERE, null, ex);
    }
            temp1=qua+quan;
            stmt=con.prepareStatement("update temp set p_quantity=? where upper(p_id)=?");
            stmt.setInt(1,temp1);
            stmt.setString(2, tab.getValueAt(tab.getSelectedRow(),1).toString());
            int r=stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"product updation problem!","problem",JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(Invo.class.getName()).log(Level.SEVERE, null, ex);
    }
        int p=JOptionPane.showConfirmDialog(null,"Do you want to delete this record!");
        if(p==0)
        {
            model.removeRow(tab.getSelectedRow());  
        }
       
    }//GEN-LAST:event_tabMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    try {
        st=con.prepareStatement("truncate table temp");
        st.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(Invo.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel brand_label;
    private javax.swing.JTextField brand_tf;
    public javax.swing.JComboBox<String> cid_combo;
    private javax.swing.JTextField custname_tf;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dis_label;
    private javax.swing.JTextField dis_tf;
    private javax.swing.JTextField email_tf;
    private javax.swing.JTextField ino_tf;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_tf;
    private javax.swing.JTextField phn_tf;
    private javax.swing.JComboBox<String> pid_combo;
    private javax.swing.JLabel pid_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JTextField price_tf;
    private javax.swing.JButton print_bt;
    private javax.swing.JLabel qty1_label;
    private javax.swing.JLabel qty_label;
    private javax.swing.JTextField qua_tf;
    private javax.swing.JTextField quan_tf;
    private javax.swing.JTextField subt_tf;
    private javax.swing.JTable tab;
    private javax.swing.JTextField tax_tf;
    private javax.swing.JTextField total_tf;
    private javax.swing.JLabel weight_label;
    private javax.swing.JTextField weight_tf;
    // End of variables declaration//GEN-END:variables
}
