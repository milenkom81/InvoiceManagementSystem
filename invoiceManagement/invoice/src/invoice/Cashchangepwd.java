
package invoice;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Cashchangepwd extends javax.swing.JFrame {
Connection con;
    PreparedStatement stmt,st;
    String str;
     ImageIcon img;
     boolean flag=false;
     ResultSet rs;
    int capcount=0,numcount=0,smallcount=0;
    public Cashchangepwd() {
        initComponents();
        img=new ImageIcon(new ImageIcon(getClass().getResource("reset.png")).getImage().getScaledInstance(lab5.getWidth(),lab5.getHeight(),Image.SCALE_DEFAULT));
  lab5.setIcon(img);
  this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        newpswd_tf2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        newpswd_tf3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        lab5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        newpswd_tf2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setText("CHANGE PASSWORD");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("NEW PASSWORD");

        newpswd_tf3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("~cashier");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("RE-ENTER NEW  PASSWORD");

        reset.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        reset.setText("RESET PASSWORD");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lab5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reset)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(newpswd_tf2)
                                        .addComponent(newpswd_tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lab5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newpswd_tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newpswd_tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        try {
            con=ConnDb.conLink();
            int j;char ch1;
            if(newpswd_tf2.getText().length()>=8 && newpswd_tf2.getText().length()<=15)
            {
                str=newpswd_tf2.getText();
                for(j=0;j<str.length();j++)
                {
                    ch1=str.charAt(j);
                    if((ch1>=65 && ch1<=90) || (ch1>=97 && ch1<=122) || (ch1>=48 && ch1<=57))
                    {
                        if(ch1>=48 && ch1<=57)
                        numcount++;
                        else if(ch1>=65 && ch1<=90)
                        capcount++;
                        else if(ch1>=97 && ch1<=122)
                        smallcount++;
                    }
                }
                String str2=newpswd_tf3.getText();
                if(!str.equals(str2))
                {
                    JOptionPane.showMessageDialog(this,"BOTH THE PASSWORD MUST BE SAME","PASSWORD CHECK",JOptionPane.ERROR_MESSAGE);
                    newpswd_tf2.setText("");
                    newpswd_tf3.setText("");
                    newpswd_tf2.requestFocus();
                    numcount=0;capcount=0;smallcount=0;
                }
                if(numcount>0 && capcount>0 && smallcount>0 && str.equals(str2))
                {
                    st=con.prepareStatement("truncate table cashlog");
                    st.executeUpdate();

                    stmt=con.prepareStatement("insert into cashlog values(?)");
                    stmt.setString(1,newpswd_tf2.getText());
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Record updated successfully","Record updation",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this,"PASSWORD MUST CONTAIN A CAPITAL AND A SMALL ALPHABET AND A NUMBER","PASSWORD CHECK",JOptionPane.ERROR_MESSAGE);
                    newpswd_tf2.setText("");
                    newpswd_tf3.setText("");
                    newpswd_tf2.requestFocus();
                    numcount=0;capcount=0;smallcount=0;
                }

            }
            else {
                JOptionPane.showMessageDialog(this,"PASSWORD MUST BE GREATER THAN 8 AND LESS THAN 15 CHARACTER","PASSWORD CHECK",JOptionPane.ERROR_MESSAGE);
                newpswd_tf2.setText("");
                newpswd_tf3.setText("");
                newpswd_tf2.requestFocus();
            }

        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_resetActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab5;
    private javax.swing.JTextField newpswd_tf2;
    private javax.swing.JTextField newpswd_tf3;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
