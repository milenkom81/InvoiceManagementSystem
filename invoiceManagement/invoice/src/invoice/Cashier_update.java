package invoice;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cashier_update extends javax.swing.JFrame {
Connection con;
PreparedStatement stmt;
ResultSet rs;
    public Cashier_update() throws SQLException {
        initComponents();
        con=ConnDb.conLink();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        csemail_tf1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        csadd_tf1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        csname_tf1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cspno_tf1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        csid_tf1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("NAME");

        csemail_tf1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("PHONE NUMBER");

        csadd_tf1.setColumns(20);
        csadd_tf1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        csadd_tf1.setRows(5);
        jScrollPane1.setViewportView(csadd_tf1);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setText("update CASHIER DETAILS");

        csname_tf1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        csname_tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                csname_tf1FocusLost(evt);
            }
        });
        csname_tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                csname_tf1KeyTyped(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton2.setText("NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("EMAIL");

        cspno_tf1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cspno_tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cspno_tf1FocusLost(evt);
            }
        });
        cspno_tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cspno_tf1KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("CASHIER ID");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("ADDRESS");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        csid_tf1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cspno_tf1)
                            .addComponent(csemail_tf1)
                            .addComponent(csname_tf1)
                            .addComponent(csid_tf1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(48, 48, 48)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {csemail_tf1, csid_tf1, csname_tf1, cspno_tf1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csid_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(csname_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(csemail_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cspno_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {csemail_tf1, csid_tf1, csname_tf1, cspno_tf1});

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            stmt=con.prepareStatement("update cashier set cs_name=?,cs_email=?,cs_phone=?,cs_address=? where upper(cs_id)=?");
            stmt.setString(1,csname_tf1.getText());
            stmt.setString(2,csemail_tf1.getText());
            stmt.setString(3,cspno_tf1.getText());
            stmt.setString(4,csadd_tf1.getText());
            stmt.setString(5,csid_tf1.getText().toUpperCase());
            int r=stmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"successfully record updated","updation",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) { 
    JOptionPane.showMessageDialog(this,"updation problem!","updation",JOptionPane.INFORMATION_MESSAGE);
    } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        csid_tf1.setText("");
        csname_tf1.setText("");
        csemail_tf1.setText("");
        cspno_tf1.setText("");
        csadd_tf1.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            stmt=con.prepareStatement("select * from cashier where upper(cs_id)=?");
            stmt.setString(1,csid_tf1.getText().toUpperCase());
            rs=stmt.executeQuery();
            rs.next();
            csname_tf1.setText(rs.getString(2));
            csemail_tf1.setText(rs.getString(3));
            cspno_tf1.setText(rs.getString(4));
            csadd_tf1.setText(rs.getString(5));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Record not present!","Record NOTFOUND",JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void csname_tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_csname_tf1FocusLost
         if(csname_tf1.getText().length()==0)
       {
           csname_tf1.requestFocus();
           Toolkit.getDefaultToolkit().beep();
           JOptionPane.showMessageDialog(null,"Customer name must not be null!");
       }
    }//GEN-LAST:event_csname_tf1FocusLost

    private void csname_tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_csname_tf1KeyTyped
        char ch=evt.getKeyChar();
        if(!((ch>=65 && ch<=90)||(ch>=97 && ch<=122)||(ch==32)))
        {
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
        } 
    }//GEN-LAST:event_csname_tf1KeyTyped

    private void cspno_tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cspno_tf1FocusLost
         
        if(!(cspno_tf1.getText().length()==10))
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Phone no.should contain 10 digits!");
        }
    }//GEN-LAST:event_cspno_tf1FocusLost

    private void cspno_tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cspno_tf1KeyTyped
       char ch=evt.getKeyChar();
        if(!((ch>=65 && ch<=90)||(ch>=97 && ch<=122)))
        {
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
        }
    }//GEN-LAST:event_cspno_tf1KeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea csadd_tf1;
    private javax.swing.JTextField csemail_tf1;
    private javax.swing.JTextField csid_tf1;
    private javax.swing.JTextField csname_tf1;
    private javax.swing.JTextField cspno_tf1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
