package invoice;

import java.awt.Image;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class LoginAs extends javax.swing.JFrame {
Connection con;
ImageIcon img;
    public LoginAs() throws SQLException {
        initComponents();
        con=ConnDb.conLink();
        
  img=new ImageIcon(new ImageIcon(getClass().getResource("admin.png")).getImage().getScaledInstance(lab2.getWidth(),lab2.getHeight(),Image.SCALE_DEFAULT));
  lab2.setIcon(img);
  img=new ImageIcon(new ImageIcon(getClass().getResource("cashier.jpg")).getImage().getScaledInstance(lab3.getWidth(),lab3.getHeight(),Image.SCALE_DEFAULT));
  lab3.setIcon(img);
  img=new ImageIcon(new ImageIcon(getClass().getResource("back.png")).getImage().getScaledInstance(lab4.getWidth(),lab4.getHeight(),Image.SCALE_DEFAULT));
  lab4.setIcon(img);
  this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lab4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setText("Invoice management system");

        lab2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab2MouseClicked(evt);
            }
        });

        lab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab3MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("LOGIN AS ADMINISTRATOR");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("LOGIN AS CASHIER");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(lab3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lab4, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))))
            .addComponent(lab4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab2MouseClicked
        try {
        Login ob=new Login();
        this.setVisible(false);
        ob.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(LoginAs.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_lab2MouseClicked

    private void lab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab3MouseClicked
        try {
        CashLog ob=new CashLog();
        this.setVisible(false);
        ob.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(LoginAs.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_lab3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
        Login ob=new Login();
        this.setVisible(false);
        ob.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(LoginAs.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         try {
        CashLog ob=new CashLog();
        this.setVisible(false);
        ob.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(LoginAs.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    // End of variables declaration//GEN-END:variables
}
