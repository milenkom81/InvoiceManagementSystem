package invoice;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Front extends javax.swing.JFrame {
Connection con;
PreparedStatement stmt;
ImageIcon img;
int n,i;
boolean b;
    public Front() throws SQLException, InterruptedException {
        initComponents();
        con=ConnDb.conLink();
  img=new ImageIcon(new ImageIcon(getClass().getResource("invoice.jpg")).getImage().getScaledInstance(lab2.getWidth(),lab2.getHeight(),Image.SCALE_DEFAULT));
  lab2.setIcon(img);
   img=new ImageIcon(new ImageIcon(getClass().getResource("rightarrow.jpg")).getImage().getScaledInstance(lab3.getWidth(),lab3.getHeight(),Image.SCALE_DEFAULT));
  lab3.setIcon(img);
  this.setLocationRelativeTo(null);
  pb.setStringPainted(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        pb = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Invoice Management System");

        lab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addComponent(lab3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(pb, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lab2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lab3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(349, 349, 349)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab3MouseClicked
    for(i=1;i<=100;i++)
  {
       n=pb.getValue();
      if(n<100)
      {
          n++;
          pb.setValue(n);
          pb.update(pb.getGraphics());
          try {
               Thread.sleep(20);
          } catch (InterruptedException ex) {
              Logger.getLogger(Front.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
      if(n==100)
      {
         b=true;
      }
  
  if(b)
  {
       try {
        LoginAs lg=new LoginAs();
        this.setVisible(false);
        lg.setVisible(true);
        } catch (SQLException ex) {
             Logger.getLogger(Front.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  }
    
  
    }//GEN-LAST:event_lab3MouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JProgressBar pb;
    // End of variables declaration//GEN-END:variables
}
