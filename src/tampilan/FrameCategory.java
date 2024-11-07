package tampilan;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import kelas.category;
import kelas.user;


/**
 *
 * @author APRILIA
 */
public class FrameCategory extends javax.swing.JFrame {

    public FrameCategory() {
        initComponents();
    }
    void loadTable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Category ID");
        model.addColumn("Name");
        
        try {
            category cat = new category();
            ResultSet data = cat.tampilKategori();
            
            while(data.next()){
                model.addRow(new Object[]{
                data.getString("category_id"),
                data.getString("category_name"),
                });
                
            }
            
        } catch (SQLException sQLException) {
            
        }
        
        tKategory.setModel(model);
    }
    
    void reset(){
        autoID();
        tID.setEditable(false);
        jtexsfield.setText(null);
    }
    
    void autoID(){
        
        try {
            category cat = new category();
        ResultSet id =cat.autoID();
            
            if (id.next()) {
                int auto = id.getInt("ID") + 1;
                tID.setText(String.valueOf(auto));
                
            } else {
                tID.setText("1");
            }
        } catch (SQLException ex) {
           
        }
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtexsfield = new javax.swing.JLabel();
        bTambah = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        tID = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        zkategori = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tKategory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jtexsfield.setText("KATEGORI");

        bTambah.setText("TAMBAH");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bUbah.setText("UBAH");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bHapus.setText("HAPUS");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        tID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tIDActionPerformed(evt);
            }
        });

        tNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tNamaMouseClicked(evt);
            }
        });

        zkategori.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        zkategori.setText("KATEGORI");

        tKategory.setModel(new javax.swing.table.DefaultTableModel(
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
        tKategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tKategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tKategory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jtexsfield))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(zkategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tID)
                                    .addComponent(tNama)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(bTambah)
                                .addGap(37, 37, 37)
                                .addComponent(bUbah)
                                .addGap(37, 37, 37)
                                .addComponent(bHapus)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(zkategori)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtexsfield)
                            .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bTambah)
                            .addComponent(bUbah)
                            .addComponent(bHapus)))
                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tIDActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        try {
            category cat = new category();
            cat.setCategory_id(Integer.parseInt(tID.getText()));
            cat.setCategory_name(tNama.getText());
            cat.tambahKategori();
            
        } catch (Exception e) {
        }
        
        loadTable();
        reset();
    }//GEN-LAST:event_bTambahActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        try {
            category cat = new category();
            cat.setCategory_id(Integer.parseInt(tID.getText()));
            cat.setCategory_name(jtexsfield.getText());
            cat.ubahKategori();
            
        } catch (Exception e) {
        }
        reset();
        loadTable();
    }//GEN-LAST:event_bUbahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        
        try {
            category cat = new category();
            cat.setCategory_id(Integer.parseInt(tID.getText()));
            cat.hapusKategori();
        } catch (SQLException sQLException) {
        } catch (NumberFormatException numberFormatException) {
        }
        reset();
        loadTable();
    }//GEN-LAST:event_bHapusActionPerformed

    private void tNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tNamaMouseClicked

    }//GEN-LAST:event_tNamaMouseClicked

    private void tKategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tKategoryMouseClicked
        
        int baris = tKategory.rowAtPoint(evt.getPoint());
        String username = tKategory.getValueAt(baris,0).toString();
        
        tID.setText(username);
        tID.setEditable(false);
        String nama = null;
        tNama.setText(nama);
    }//GEN-LAST:event_tKategoryMouseClicked

    @SuppressWarnings("empty-statement")
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jtexsfield;
    private javax.swing.JTextField tID;
    private javax.swing.JTable tKategory;
    private javax.swing.JTextField tNama;
    private javax.swing.JLabel zkategori;
    // End of variables declaration//GEN-END:variables
}
