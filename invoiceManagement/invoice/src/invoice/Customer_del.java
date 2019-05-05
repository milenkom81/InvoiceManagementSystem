package invoice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Customer_del extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
     String s1;

    
    public Customer_del() throws SQLException {
        initComponents();
         con=ConnDb.conLink();
         this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        find_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cust_del = new javax.swing.JTextField();
        del_button = new javax.swing.JButton();
        cus_find = new javax.swing.JTextField();
        list_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customer_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        find_button.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        find_button.setText("Find");
        find_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_buttonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel3.setText("VIEW CUSTOMER");

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Customer_ID", "Customer_Name" }));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel2.setText("DELETE CUSTOMER");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Customer_ID");

        cust_del.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        del_button.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        del_button.setText("Delete");
        del_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_buttonActionPerformed(evt);
            }
        });

        cus_find.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        list_button.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        list_button.setText("List");
        list_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_buttonActionPerformed(evt);
            }
        });

        Customer_table.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Customer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer_ID", "Customer_Name", "Address", "Contact", "Email"
            }
        ));
        jScrollPane1.setViewportView(Customer_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(528, 528, 528)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(find_button)
                            .addComponent(cus_find, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cust_del, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(del_button))))
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(list_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cust_del, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(del_button)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cus_find))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(find_button)
                        .addGap(32, 32, 32)
                        .addComponent(list_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

    private void list_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_buttonActionPerformed
        try {
        stmt=con.prepareStatement("select * from customer order by c_id asc");
        rs=stmt.executeQuery();
            DefaultTableModel model=new DefaultTableModel(new String[]{"Customer_ID", "Customer_name", "Address", "Contact", "Email"},0);
            while(rs.next())
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            Customer_table.setModel(model);
    } catch (SQLException ex) {
        Logger.getLogger(Customer_del.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_list_buttonActionPerformed

    private void find_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_buttonActionPerformed
     try {
          s1=(String)jComboBox1.getSelectedItem();
            if(s1.equalsIgnoreCase("Customer_id"))
                s1="select * from customer where upper(c_id)=?";
            else
                s1="select * from customer where upper(c_name)=?";
        stmt=con.prepareStatement(s1);
         stmt.setString(1,cus_find.getText().toUpperCase());
            rs=stmt.executeQuery();
            DefaultTableModel model=new DefaultTableModel(new String[]{"Customer_ID", "Customer_Name", "Address", "Contact", "Email"},0);
            while(rs.next())
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            Customer_table.setModel(model);
            
    } catch (SQLException ex) {
        Logger.getLogger(Customer_del.class.getName()).log(Level.SEVERE, null, ex);
         JOptionPane.showConfirmDialog(this,"record not found","record Deletion",JOptionPane.ERROR_MESSAGE);
        
        
    }  
    }//GEN-LAST:event_find_buttonActionPerformed

    private void del_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_buttonActionPerformed
        try {
        stmt=con.prepareStatement("delete from customer where upper(c_id)=?");
        stmt.setString(1,cust_del.getText().toUpperCase());
        int a=JOptionPane.showConfirmDialog(this,"Do you want to delete","Deletion",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
         if(a==0){
            stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Record successfully deleted!","Row deletion",JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Customer_del.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showConfirmDialog(this,"record not found","record Deletion",JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_del_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Customer_table;
    private javax.swing.JTextField cus_find;
    private javax.swing.JTextField cust_del;
    private javax.swing.JButton del_button;
    private javax.swing.JButton find_button;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton list_button;
    // End of variables declaration//GEN-END:variables
}
