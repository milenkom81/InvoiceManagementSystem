package invoice;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CashLog extends javax.swing.JFrame {

    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    ImageIcon img;
    Boolean flag;
    public CashLog() throws SQLException {
        initComponents();
         img=new ImageIcon(new ImageIcon(getClass().getResource("cashier.jpg")).getImage().getScaledInstance(lab1.getWidth(),lab1.getHeight(),Image.SCALE_DEFAULT));
  lab1.setIcon(img);
         img=new ImageIcon(new ImageIcon(getClass().getResource("rightarrow.jpg")).getImage().getScaledInstance(lab2.getWidth(),lab2.getHeight(),Image.SCALE_DEFAULT));
  lab2.setIcon(img);
        img=new ImageIcon(new ImageIcon(getClass().getResource("back.png")).getImage().getScaledInstance(lab3.getWidth(),lab3.getHeight(),Image.SCALE_DEFAULT));
  lab3.setIcon(img);
   img=new ImageIcon(new ImageIcon(getClass().getResource("leftarrow.jpg")).getImage().getScaledInstance(lab4.getWidth(),lab4.getHeight(),Image.SCALE_DEFAULT));
  lab4.setIcon(img);
  this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        pswd_tf = new javax.swing.JPasswordField();
        lab2 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        lab4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setText("Invoice Management System");

        pswd_tf.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        lab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab2MouseClicked(evt);
            }
        });

        lab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lab4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(600, 600, 600)
                        .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(pswd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lab3, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lab4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(pswd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lab3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab4MouseClicked
        this.setVisible(false);
    try {
        LoginAs lg=new LoginAs();
        lg.setVisible(true);
    }   catch (SQLException ex) {
            Logger.getLogger(CashLog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lab4MouseClicked

    private void lab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab2MouseClicked
         try {
            con=ConnDb.conLink();
          stmt=con.prepareStatement(("select * from cashlog"));  
          rs=stmt.executeQuery();
          while(rs.next())
          {
              if(pswd_tf.getText().equals(rs.getString(1)))
                      {
                        flag=true;
                        break;
                      }
              else
               JOptionPane.showMessageDialog(this,"WRONG PASSWORD","login",JOptionPane.ERROR_MESSAGE);    
          }
          if(flag)
          {
              Cashform af= new Cashform();
              this.setVisible(false);
              af.setVisible(true);
          }
             
        }
       catch(Exception t){}
        
    }//GEN-LAST:event_lab2MouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JPasswordField pswd_tf;
    // End of variables declaration//GEN-END:variables
}
