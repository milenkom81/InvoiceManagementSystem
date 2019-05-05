package invoice;

import java.awt.Image;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Cashform extends javax.swing.JFrame {
Connection con;
    ImageIcon img;
    public Cashform() throws SQLException {
        initComponents();
        con=ConnDb.conLink();
        
        img=new ImageIcon(new ImageIcon(getClass().getResource("logout.png")).getImage().getScaledInstance(lab2.getWidth(),lab2.getHeight(),Image.SCALE_DEFAULT));
  lab2.setIcon(img);
  img=new ImageIcon(new ImageIcon(getClass().getResource("addcust.png")).getImage().getScaledInstance(lab3.getWidth(),lab3.getHeight(),Image.SCALE_DEFAULT));
  lab3.setIcon(img);
  img=new ImageIcon(new ImageIcon(getClass().getResource("updatecust.jpg")).getImage().getScaledInstance(lab4.getWidth(),lab4.getHeight(),Image.SCALE_DEFAULT));
  lab4.setIcon(img);
  img=new ImageIcon(new ImageIcon(getClass().getResource("deletecust.jpg")).getImage().getScaledInstance(lab5.getWidth(),lab5.getHeight(),Image.SCALE_DEFAULT));
  lab5.setIcon(img);
  img=new ImageIcon(new ImageIcon(getClass().getResource("viewcust.jpg")).getImage().getScaledInstance(lab6.getWidth(),lab6.getHeight(),Image.SCALE_DEFAULT));
  lab6.setIcon(img);
  img=new ImageIcon(new ImageIcon(getClass().getResource("invoicelogo.png")).getImage().getScaledInstance(lab7.getWidth(),lab7.getHeight(),Image.SCALE_DEFAULT));
  lab7.setIcon(img);
  img=new ImageIcon(new ImageIcon(getClass().getResource("excel.png")).getImage().getScaledInstance(lab8.getWidth(),lab8.getHeight(),Image.SCALE_DEFAULT));
  lab8.setIcon(img);
  img=new ImageIcon(new ImageIcon(getClass().getResource("reset.png")).getImage().getScaledInstance(lab9.getWidth(),lab9.getHeight(),Image.SCALE_DEFAULT));
  lab9.setIcon(img);
  this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        view = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        lab7 = new javax.swing.JLabel();
        lab8 = new javax.swing.JLabel();
        lab4 = new javax.swing.JLabel();
        invoice = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab6 = new javax.swing.JLabel();
        sheet = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        lab9 = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        view.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        view.setText("VIEW CUSTOMER DETAILS");
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
        });

        update.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        update.setText("UPDATE CUSTOMER DETAIL");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        add.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        add.setText("ADD NEW CUSTOMER");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        invoice.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        invoice.setText("GENERATE AND PRINT INVOICE");
        invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceMouseClicked(evt);
            }
        });

        lab1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        lab1.setText("CASHIER DASHBOARD");

        lab2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lab2.setForeground(new java.awt.Color(0, 0, 204));
        lab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab2MouseClicked(evt);
            }
        });

        sheet.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        sheet.setText("GENERATE EXCEL SHEET");
        sheet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sheetMouseClicked(evt);
            }
        });

        password.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        password.setText("CHANGE PASSWORD");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });

        delete.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        delete.setText("DELETE CUSTOMER");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
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
                        .addComponent(lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lab7)
                            .addComponent(lab3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lab6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add)
                                    .addComponent(view))
                                .addGap(110, 110, 110)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lab8)
                                    .addComponent(lab4)))
                            .addComponent(invoice))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(update)
                                .addGap(91, 91, 91)
                                .addComponent(lab5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sheet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lab9)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(password)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(delete)
                                .addGap(60, 60, 60)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lab3, lab4, lab5, lab6, lab7, lab8, lab9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lab2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(update)
                            .addComponent(delete)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lab4)
                            .addComponent(lab3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lab5))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lab9)
                            .addComponent(lab8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sheet)
                                    .addComponent(password)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(lab6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(lab7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(view)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(invoice)
                        .addGap(18, 18, 18)))
                .addGap(34, 34, 34))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lab3, lab4, lab5, lab6, lab7, lab8, lab9});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
 
    try {
       Customer ob = new Customer();
        ob.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(Cashform.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_addMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
    try {
        Cust_update ob=new Cust_update();
        ob.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(Cashform.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
       try {
        Customer_del ob=new Customer_del();
        ob.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(Cashform.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_deleteMouseClicked

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
    try {
        Customer_del ob=new Customer_del();
        ob.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(Cashform.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_viewMouseClicked

    private void sheetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sheetMouseClicked
    try {
        InvoiceExcelSheet ob=new InvoiceExcelSheet();
        ob.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(Cashform.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }//GEN-LAST:event_sheetMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        Cashchangepwd lg = new Cashchangepwd();
        lg.setVisible(true);
    }//GEN-LAST:event_passwordMouseClicked

    private void invoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceMouseClicked

    try {
      Invo lg = new Invo();
        lg.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(Cashform.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_invoiceMouseClicked

    private void lab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lab2MouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel invoice;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel lab6;
    private javax.swing.JLabel lab7;
    private javax.swing.JLabel lab8;
    private javax.swing.JLabel lab9;
    private javax.swing.JLabel password;
    private javax.swing.JLabel sheet;
    private javax.swing.JLabel update;
    private javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables
}
