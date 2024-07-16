package epic.rentals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SearchWindow extends javax.swing.JFrame {
    public SearchWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        searchWindowButton = new javax.swing.JButton();
        rentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        searchField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchField.setText("Search...");

        searchWindowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/loupe.png"))); // NOI18N
        searchWindowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchWindowButtonActionPerformed(evt);
            }
        });

        rentButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rentButton.setText("Rent");
        rentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentButtonActionPerformed(evt);
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
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchWindowButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rentButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchWindowButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rentButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        
    }//GEN-LAST:event_jPanel1ComponentShown

    private void searchWindowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchWindowButtonActionPerformed
        String word = searchField.getText();
        
        Connection conn = JDBC.getConnection();
        if (conn != null) {
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try {
                String query =  "SELECT Title, CategoryName, Type, ReleaseYear FROM items, categories\n" +
                                "WHERE (items.Title LIKE '%" + word + "%' OR categories.CategoryName LIKE '%" + word + "%' OR items.Type LIKE '%" + word + "%') \n" +
                                "AND items.CategoryID = categories.CategoryID;";
                stmt = conn.prepareStatement(query);
                rs = stmt.executeQuery();

                // Obține metadatele pentru a obține numele coloanelor
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnCount = rsmd.getColumnCount();
                String[] columnNames = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    columnNames[i-1] = rsmd.getColumnName(i);
                }

                // Adaugă datele în modelul de tabel
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i-1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }

                // Setează modelul în JTable
                jTable1.setModel(model);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_searchWindowButtonActionPerformed

    private void rentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentButtonActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            String email = JDBC.getEmail();
            String title = (String)jTable1.getValueAt(selectedRow, 0);
            int userID = 0;
            int itemID  = 0;
        
        
            Connection conn = JDBC.getConnection();
            if (conn != null) {
                PreparedStatement stmt = null;
                ResultSet rs = null;
                try{
                    String query =  "SELECT UserID FROM users  WHERE email = '" + email + "';";
                    stmt = conn.prepareStatement(query);
                    rs = stmt.executeQuery();
                    
                    if(rs.next())
                    {
                        userID = rs.getInt("UserID");
                    }
                    
                    query =  "SELECT ItemID FROM items  WHERE Title = '" + title + "';";
                    stmt = conn.prepareStatement(query);
                    rs = stmt.executeQuery();
                    if(rs.next())
                    {
                        itemID = rs.getInt("ItemID");
                    }
                    
                    query = "INSERT INTO  Rentals (UserID, ItemID, RentalDate, ReturnDate)"+ 
                            "VALUES ('"+userID+"', '"+itemID+"', curdate(), adddate(curdate(), interval 31 day))";
                    stmt = conn.prepareStatement(query);
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(this, "Rent Successful!");
                }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        } 
        else {
            JOptionPane.showMessageDialog(this, "No row selected!");
        }
    }//GEN-LAST:event_rentButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton rentButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchWindowButton;
    // End of variables declaration//GEN-END:variables
}
