package invoice;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cashier_details extends javax.swing.JFrame {
Connection con;
PreparedStatement stmt,st;
ResultSet rs;
String str;
int ctr;

    public Cashier_details() throws SQLException {
        initComponents();
        con=ConnDb.conLink();
        create();
        csname_tf.requestFocus();
        this.setLocationRelativeTo(null);
    }
public void create() throws SQLException
    {
        st=con.prepareStatement("select cs_id from automatic");
        rs=st.executeQuery();
        rs.next();
        ctr=rs.getInt(1)+1;
        if(ctr<10)
            str="CS00"+ctr;
        else if(ctr<100)
            str="CS0"+ctr;
        else if(ctr<1000)
            str="CS"+ctr;
        else
            JOptionPane.showMessageDialog(this,"More than 999 not allowed","Data excede",JOptionPane.ERROR_MESSAGE);
        csid_tf.setText(str);
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        csid_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        csname_tf = new javax.swing.JTextField();
        csemail_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        csadd_tf = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cspno_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("NAME");

        csid_tf.setEditable(false);
        csid_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("EMAIL");

        csname_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        csname_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                csname_tfFocusLost(evt);
            }
        });
        csname_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                csname_tfKeyTyped(evt);
            }
        });

        csemail_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("CASHIER ID");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        csadd_tf.setColumns(20);
        csadd_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        csadd_tf.setRows(5);
        jScrollPane1.setViewportView(csadd_tf);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("PHONE NUMBER");

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setText("CASHIER DETAILS");

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton2.setText("NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("ADDRESS");

        cspno_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cspno_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cspno_tfFocusLost(evt);
            }
        });
        cspno_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cspno_tfKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cspno_tf)
                            .addComponent(csemail_tf)
                            .addComponent(csname_tf)
                            .addComponent(csid_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(49, 49, 49)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {csemail_tf, csid_tf, csname_tf, cspno_tf});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(csname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(csemail_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cspno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {csemail_tf, csid_tf, csname_tf, cspno_tf});

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            stmt=con.prepareStatement("insert into cashier values(?,?,?,?,?)");
            stmt.setString(1,csid_tf.getText());
            stmt.setString(2,csname_tf.getText());
            stmt.setString(3,csemail_tf.getText());
            stmt.setString(4,cspno_tf.getText());
            stmt.setString(5,csadd_tf.getText());
            int r=stmt.executeUpdate();
            st=con.prepareStatement("update automatic set cs_id=?");
            st.setInt(1,ctr);
            st.executeUpdate();
            JOptionPane.showMessageDialog(this,"successfully record inserted","insertion",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Connection problem","PROBLEM",JOptionPane.INFORMATION_MESSAGE);
        Logger.getLogger(Cashier_details.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       csid_tf.setText("");
       csname_tf.setText("");
       csemail_tf.setText("");
       cspno_tf.setText("");
       csadd_tf.setText("");
       try
       {
           create();
           csname_tf.requestFocus();
       } catch (SQLException ex) {
        Logger.getLogger(Cashier_details.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void csname_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_csname_tfFocusLost
        if(csname_tf.getText().length()==0)
       {
           csname_tf.requestFocus();
           Toolkit.getDefaultToolkit().beep();
           JOptionPane.showMessageDialog(null,"Customer name must not be null!");
       }
    }//GEN-LAST:event_csname_tfFocusLost

    private void csname_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_csname_tfKeyTyped
         char ch=evt.getKeyChar();
        if(!((ch>=65 && ch<=90)||(ch>=97 && ch<=122)||(ch==32)))
        {
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
        } 
    }//GEN-LAST:event_csname_tfKeyTyped

    private void cspno_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cspno_tfFocusLost
        if(!(cspno_tf.getText().length()==10))
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Phone no.should contain 10 digits!");
        }
    }//GEN-LAST:event_cspno_tfFocusLost

    private void cspno_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cspno_tfKeyTyped
        char ch=evt.getKeyChar();
        if(((ch>=65 && ch<=90)||(ch>=97 && ch<=122)))
        {
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
        } 
    }//GEN-LAST:event_cspno_tfKeyTyped

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea csadd_tf;
    private javax.swing.JTextField csemail_tf;
    private javax.swing.JTextField csid_tf;
    private javax.swing.JTextField csname_tf;
    private javax.swing.JTextField cspno_tf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
