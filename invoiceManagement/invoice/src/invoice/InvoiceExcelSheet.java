package invoice;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class InvoiceExcelSheet extends javax.swing.JFrame {
Connection con;
PreparedStatement stmt;
ResultSet rs;
Label l;
ImageIcon img;
    public InvoiceExcelSheet() throws SQLException {
        initComponents();
        con=ConnDb.conLink();
         img=new ImageIcon(new ImageIcon(getClass().getResource("admin.png")).getImage().getScaledInstance(lab2.getWidth(),lab2.getHeight(),Image.SCALE_DEFAULT));
  lab2.setIcon(img);
   img=new ImageIcon(new ImageIcon(getClass().getResource("addprod.png")).getImage().getScaledInstance(lab3.getWidth(),lab3.getHeight(),Image.SCALE_DEFAULT));
  lab3.setIcon(img);
   img=new ImageIcon(new ImageIcon(getClass().getResource("cashier.jpg")).getImage().getScaledInstance(lab4.getWidth(),lab4.getHeight(),Image.SCALE_DEFAULT));
  lab4.setIcon(img);
   img=new ImageIcon(new ImageIcon(getClass().getResource("invoicelogo.png")).getImage().getScaledInstance(lab5.getWidth(),lab5.getHeight(),Image.SCALE_DEFAULT));
  lab5.setIcon(img);
  this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lab4 = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();
        customer_sheet = new javax.swing.JButton();
        product_sheet = new javax.swing.JButton();
        lab2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        invoice_sheet = new javax.swing.JButton();
        cashier_sheet = new javax.swing.JButton();
        lab3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        customer_sheet.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        customer_sheet.setText("CUSTOMER SHEET");
        customer_sheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_sheetActionPerformed(evt);
            }
        });

        product_sheet.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        product_sheet.setText("PRODUCT SHEET");
        product_sheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_sheetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Generate excel sheet");

        invoice_sheet.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        invoice_sheet.setText("INVOICE SHEET");
        invoice_sheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoice_sheetActionPerformed(evt);
            }
        });

        cashier_sheet.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cashier_sheet.setText("CASHIER SHEET");
        cashier_sheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashier_sheetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lab3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(product_sheet))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customer_sheet)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lab5)
                                .addGap(18, 18, 18)
                                .addComponent(invoice_sheet)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lab4)
                                .addGap(18, 18, 18)
                                .addComponent(cashier_sheet)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cashier_sheet, customer_sheet, invoice_sheet, product_sheet});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lab2, lab3, lab4, lab5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(customer_sheet))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cashier_sheet)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invoice_sheet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lab5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(product_sheet)
                                    .addGap(54, 54, 54))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lab3)
                                    .addGap(31, 31, 31)))))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cashier_sheet, customer_sheet, invoice_sheet, product_sheet});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lab2, lab3, lab4, lab5});

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invoice_sheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoice_sheetActionPerformed
        File f1=new File("d:\\invoicemanagement");
        File f2=new File("d:\\invoicemanagement\\data.xls");
        f1.mkdirs();
        f2.setWritable(true);
    try {
        WritableWorkbook myxl=Workbook.createWorkbook(f2);
        WritableSheet mysheet=myxl.createSheet("invoice",0);
        stmt=con.prepareStatement("select * from invoice");
        rs=stmt.executeQuery();
        byte i,j=0;
        ResultSetMetaData rsmd=rs.getMetaData();
        for(i=0;i<rsmd.getColumnCount();i++)
        {
            l=new Label(i,0,rsmd.getColumnName(i+1));
            mysheet.addCell(l);
        }
    while(rs.next())
    {
        ++j;
        for(i=0;i<rsmd.getColumnCount();i++)
        {
            l=new Label(i,j,rs.getString(i+1));
            mysheet.addCell(l);
        }
    }
    myxl.write();
    myxl.close();
    f2.setReadOnly();
    JOptionPane.showMessageDialog(null,"invoice sheet generated");
    } catch (IOException ex) {
        Logger.getLogger(InvoiceExcelSheet.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(InvoiceExcelSheet.class.getName()).log(Level.SEVERE, null, ex);
    } catch (WriteException ex) {
        Logger.getLogger(InvoiceExcelSheet.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_invoice_sheetActionPerformed

    private void cashier_sheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashier_sheetActionPerformed
        File f1=new File("d:\\invoicemanagement");
        File f2=new File("d:\\invoicemanagement\\data.xls");
        f1.mkdirs();
        f2.setWritable(true);
    try {
        WritableWorkbook myxl=Workbook.createWorkbook(f2);
        WritableSheet mysheet=myxl.createSheet("cashier",0);
        stmt=con.prepareStatement("select * from cashier");
        rs=stmt.executeQuery();
        byte i,j=0;
        ResultSetMetaData rsmd=rs.getMetaData();
        for(i=0;i<rsmd.getColumnCount();i++)
        {
            l=new Label(i,0,rsmd.getColumnName(i+1));
            mysheet.addCell(l);
        }
    while(rs.next())
    {
        ++j;
        for(i=0;i<rsmd.getColumnCount();i++)
        {
            l=new Label(i,j,rs.getString(i+1));
            mysheet.addCell(l);
        }
    }
    myxl.write();
    myxl.close();
    f2.setReadOnly();
    JOptionPane.showMessageDialog(null,"cashier sheet generated");
    } catch (IOException ex) {
        Logger.getLogger(InvoiceExcelSheet.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(InvoiceExcelSheet.class.getName()).log(Level.SEVERE, null, ex);
    } catch (WriteException ex) {
        Logger.getLogger(InvoiceExcelSheet.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_cashier_sheetActionPerformed

    private void customer_sheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_sheetActionPerformed
        File f1=new File("d:\\invoicemanagement");
        File f2=new File("d:\\invoicemanagement\\data.xls");
        f1.mkdirs();
        f2.setWritable(true);
    try {
        WritableWorkbook myxl=Workbook.createWorkbook(f2);
        WritableSheet mysheet=myxl.createSheet("customer",0);
        stmt=con.prepareStatement("select * from customer");
        rs=stmt.executeQuery();
        byte i,j=0;
        ResultSetMetaData rsmd=rs.getMetaData();
        for(i=0;i<rsmd.getColumnCount();i++)
        {
            l=new Label(i,0,rsmd.getColumnName(i+1));
            mysheet.addCell(l);
        }
    while(rs.next())
    {
        ++j;
        for(i=0;i<rsmd.getColumnCount();i++)
        {
            l=new Label(i,j,rs.getString(i+1));
            mysheet.addCell(l);
        }
    }
    myxl.write();
    myxl.close();
    f2.setReadOnly();
    JOptionPane.showMessageDialog(null,"customer sheet generated");
    } catch (IOException ex) {
        Logger.getLogger(InvoiceExcelSheet.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(InvoiceExcelSheet.class.getName()).log(Level.SEVERE, null, ex);
    } catch (WriteException ex) {
        Logger.getLogger(InvoiceExcelSheet.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_customer_sheetActionPerformed

    private void product_sheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_sheetActionPerformed
        File f1=new File("d:\\invoicemanagement");
        File f2=new File("d:\\invoicemanagement\\data.xls");
        f1.mkdirs();
        f2.setWritable(true);
    try {
        WritableWorkbook myxl=Workbook.createWorkbook(f2);
        WritableSheet mysheet=myxl.createSheet("product",0);
        stmt=con.prepareStatement("select * from product");
        rs=stmt.executeQuery();
        byte i,j=0;
        ResultSetMetaData rsmd=rs.getMetaData();
        for(i=0;i<rsmd.getColumnCount();i++)
        {
            l=new Label(i,0,rsmd.getColumnName(i+1));
            mysheet.addCell(l);
        }
    while(rs.next())
    {
        ++j;
        for(i=0;i<rsmd.getColumnCount();i++)
        {
            l=new Label(i,j,rs.getString(i+1));
            mysheet.addCell(l);
        }
    }
    myxl.write();
    myxl.close();
    f2.setReadOnly();
    JOptionPane.showMessageDialog(null,"product sheet generated");
    } catch (IOException ex) {
        Logger.getLogger(InvoiceExcelSheet.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(InvoiceExcelSheet.class.getName()).log(Level.SEVERE, null, ex);
    } catch (WriteException ex) {
        Logger.getLogger(InvoiceExcelSheet.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_product_sheetActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cashier_sheet;
    private javax.swing.JButton customer_sheet;
    private javax.swing.JButton invoice_sheet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JButton product_sheet;
    // End of variables declaration//GEN-END:variables
}
