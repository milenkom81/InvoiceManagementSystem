package invoice;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class Product_details extends javax.swing.JFrame {
Connection con;
PreparedStatement stmt,st;
ResultSet rs;
int ctr;
String str;
ImageIcon img;
    public Product_details() throws SQLException {
        initComponents();
        con=ConnDb.conLink();
        create();
    this.setLocationRelativeTo(null);
        pname_tf.requestFocus();
    }
    public void create() throws SQLException
    {
        st=con.prepareStatement("select p_id from automatic");
        rs=st.executeQuery();
        rs.next();
        ctr=rs.getInt(1)+1;
        if(ctr<10)
            str="P00"+ctr;
        else if(ctr<100)
            str="P0"+ctr;
        else if(ctr<1000)
            str="P"+ctr;
        else
            JOptionPane.showMessageDialog(this,"More than 999 not allowed","Data excede",JOptionPane.ERROR_MESSAGE);
        pid_tf.setText(str);
    }       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pquantity_tf = new javax.swing.JTextField();
        pid_tf = new javax.swing.JTextField();
        pdiscount_tf = new javax.swing.JTextField();
        pname_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pbrand_tf = new javax.swing.JTextField();
        pprice_tf = new javax.swing.JTextField();
        pweight_tf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pmfg_tf = new com.toedter.calendar.JDateChooser();
        pexp_tf = new com.toedter.calendar.JDateChooser();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("DATE OF EXPIRY");

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pquantity_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pquantity_tfKeyTyped(evt);
            }
        });

        pid_tf.setEditable(false);
        pid_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        pdiscount_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pdiscount_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pdiscount_tfKeyTyped(evt);
            }
        });

        pname_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pname_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pname_tfFocusLost(evt);
            }
        });
        pname_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pname_tfKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("DATE OF MANUFACTURING");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("DISCOUNT AVAILABLE(in percent)");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("NAME");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("PRODUCT ID");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("WEIGHT");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("QUANTITY");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("PRICE");

        pbrand_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pbrand_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pbrand_tfFocusGained(evt);
            }
        });
        pbrand_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pbrand_tfKeyTyped(evt);
            }
        });

        pprice_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pprice_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pprice_tfKeyTyped(evt);
            }
        });

        pweight_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setText("PRODUCT DETAILS");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("BRAND");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(pid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(249, 249, 249)
                        .addComponent(pbrand_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(218, 218, 218)
                        .addComponent(pquantity_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(235, 235, 235)
                        .addComponent(pweight_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(54, 54, 54)
                        .addComponent(pdiscount_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(pname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pprice_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(pmfg_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pexp_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(pbrand_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(pquantity_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel11))
                            .addComponent(pweight_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(pprice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(pname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(pmfg_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pexp_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(pdiscount_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          try {
        stmt=con.prepareStatement("insert into product values(?,?,?,?,?,?,?,?,?)");
        stmt.setString(1,pid_tf.getText());
        stmt.setString(2,pname_tf.getText());
        stmt.setString(3,pbrand_tf.getText());
        stmt.setString(4,pquantity_tf.getText());
        stmt.setString(5,pweight_tf.getText());
        stmt.setString(6,pprice_tf.getText());
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(pmfg_tf.getDate());
        stmt.setString(7,date);
        date=sdf.format(pexp_tf.getDate());
        stmt.setString(8,date);
        stmt.setString(9,pdiscount_tf.getText());
        
        int r=stmt.executeUpdate();
        st=con.prepareStatement("update automatic set p_id=?");
        st.setInt(1,ctr);
        st.executeUpdate();
        JOptionPane.showMessageDialog(this,"successfully record inserted","insertion",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this,"connection problem","problem",JOptionPane.ERROR_MESSAGE);

    }
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pid_tf.setText("");
        pname_tf.setText("");
        pbrand_tf.setText("");
        pquantity_tf.setText("");
        pweight_tf.setText("");
        pprice_tf.setText("");
        pdiscount_tf.setText("");
        
        try {
            create();
            pname_tf.requestFocus();
        } catch (SQLException ex) { 
        Logger.getLogger(Product_details.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pbrand_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pbrand_tfFocusGained
        if(pname_tf.getText().length()==0)
        {
            pname_tf.requestFocus();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Product must have some name!");
        }
    }//GEN-LAST:event_pbrand_tfFocusGained

    private void pname_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pname_tfKeyTyped
        char ch=evt.getKeyChar();
        if(!((ch>=65 && ch<=90)||(ch>=97 && ch<=122)||(ch==32)))
        {
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
        } 
    }//GEN-LAST:event_pname_tfKeyTyped

    private void pname_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pname_tfFocusLost
        if(pname_tf.getText().length()==0)
        {
            pname_tf.requestFocus();
            JOptionPane.showMessageDialog(null,"Product must have some name!");
        }
    }//GEN-LAST:event_pname_tfFocusLost

    private void pprice_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pprice_tfKeyTyped
       char ch=evt.getKeyChar();
       if(((ch>=65 && ch<=90)||(ch>=97 && ch<=122)))
        {
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
        }
    }//GEN-LAST:event_pprice_tfKeyTyped

    private void pdiscount_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pdiscount_tfKeyTyped
        char ch=evt.getKeyChar();
       if(((ch>=65 && ch<=90)||(ch>=97 && ch<=122)))
        {
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
        }
    }//GEN-LAST:event_pdiscount_tfKeyTyped

    private void pbrand_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pbrand_tfKeyTyped
       char ch=evt.getKeyChar();
        if(!((ch>=65 && ch<=90)||(ch>=97 && ch<=122)||ch==32))
        {
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
        } 
    }//GEN-LAST:event_pbrand_tfKeyTyped

    private void pquantity_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pquantity_tfKeyTyped
        char ch=evt.getKeyChar();
        if(((ch>=65 && ch<=90)||(ch>=97 && ch<=122)))
        {
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
        } 
    }//GEN-LAST:event_pquantity_tfKeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pbrand_tf;
    private javax.swing.JTextField pdiscount_tf;
    private com.toedter.calendar.JDateChooser pexp_tf;
    private javax.swing.JTextField pid_tf;
    private com.toedter.calendar.JDateChooser pmfg_tf;
    private javax.swing.JTextField pname_tf;
    private javax.swing.JTextField pprice_tf;
    private javax.swing.JTextField pquantity_tf;
    private javax.swing.JTextField pweight_tf;
    // End of variables declaration//GEN-END:variables
}
