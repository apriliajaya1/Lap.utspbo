package tampilan;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.FormView;
import kelas.category;
import kelas.product;


/**
 *
 * @author APRILIA
 * 
 */
public class frameProduct extends javax.swing.JFrame {

    

    public frameProduct() {
        initComponents();
        loadTable();
        reset ();
        comboBox();
        
    }
    void loadTable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID PRODUK");
        model.addColumn("PRODUK");
        model.addColumn("DESKRIPSI");
        model.addColumn("HARGA");
        model.addColumn("KATEGORI");
         
         try {
            product pro = new product();
            ResultSet data = pro.tampilProduk();
            
             while (data.next()) {
                 model.addRow(new Object[]{
                     data.getString("ID"),
                     data.getString("Nama"),
                     data.getString("Deskripsi"),
                     data.getString("Harga"),
                     data.getString("Kategori"),});
                 
             }
         } catch (Exception e) {
         
             
        }

        void reset(){
        
            autoID();
            tID.setEditable();
            tDesk.setText(null);
            tHarga.setText(null);
            cKategori.setSelectedItem(null);
            tNama.setText(null);     
        } 
        
        void comboBox() {
           ResultSet data = null;
        try {
            category cat = new category();
            data = cat.tampilComBox();
            
            while (data.next()) {
            String isi = data.getString("category_name");
            cKategory.addItem(isi);    
        }
            
        } catch (Exception e) {
        }
        tProduk.setModel(model);    
        
        } 
        
        }
        
        void autoID() {
        
        try {
            product pro = new product();
            ResultSet id = pro.autoID();
            
            if (id.next()) {
                int auto = id.getInt("ID") + 1;
                tID.setText(String.valueOf(auto));
            } else {
                tID.setText("1");
                
            }
        } catch (SQLException sQLException) {
        }
            
        } 

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
        
        
        
    }
        
        
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bTambah = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        tID = new java.awt.TextField();
        tNama = new java.awt.TextField();
        tDesk = new java.awt.TextField();
        tHarga = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProduk = new javax.swing.JTable();
        cKategori = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jLabel2.setText("ID");

        jLabel3.setText("Nama");

        jLabel4.setText("Deskripsi");

        jLabel5.setText("Harga");

        jLabel6.setText("Kategori");

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
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

        tDesk.setText("textField3");

        tHarga.setText("textField4");

        tProduk.setModel(new javax.swing.table.DefaultTableModel(
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
        tProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tProduk);

        cKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cKategoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bTambah)
                        .addGap(18, 18, 18)
                        .addComponent(bUbah)
                        .addGap(18, 18, 18)
                        .addComponent(bHapus))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tDesk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cKategori, 0, 179, Short.MAX_VALUE)
                            .addComponent(tHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tDesk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tHarga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah)
                    .addComponent(bUbah)
                    .addComponent(bHapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cKategoriActionPerformed

    private void tIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tIDActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        try {
            product pro = new product();
            category cat = new category();
            pro.setProduct_id(Integer.parseInt(tID.getText()));
            pro.setProduct_name(tNama.getText());
            pro.setProduct_desc(tDesk.getText());
            
            pro.setProduct_price(Integer.parseInt(tHarga.getText()));
            cat.setCategory_name(cKategori.getSelected().toString());
            ResultSet data = cat.Konversi();
            
            if (data.next()) {
                String isi = data.getString("category_id");
                pro.setProduct_cat_id(Integer.parseInt(isi));
            }
            pro.tambahProduk();
        } catch (Exception e) {
            System.out.println("data tidak masuk");
        }
        loadTable();
       
        
    }//GEN-LAST:event_bTambahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        try {
            product pro = new product();
            pro.setProduct_id(tID.getText());
            pro.hapusProduk();
            
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_bHapusActionPerformed

    private void tProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProdukMouseClicked
        int baris = tProduk.rowAtPoint(evt.getPoint());
        String ID = tProduk.getValueAt(baris, 0).toString();
        String Nama = tProduk.getValueAt(baris, 1).toString();
        String Desc = tProduk.getValueAt(baris, 2).toString();
        String Harga = tProduk.getValueAt(baris, 3).toString();
        String Kategori = tProduk.getValueAt(baris, 4).toString();
        
        tID.setText(ID);
        tID.setEditable(false);
        tNama.setText(Nama);
        tHarga.setText(Harga);
        tDesk.setText(Desc);
        cKategori.setSelectedItem(Kategori);

    }//GEN-LAST:event_tProdukMouseClicked

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        try {
            product pro = new product();
category cat = new category();
pro.setProduct_id(Integer.parseInt(tID.getText()));
pro.setProduct_name(tNama.getText());
pro.setProduct_desc(tDesk.getText());

pro.setProduct_price(Integer.parseInt(tHarga.getText()));

cat.setCategory name(cKategory.getSelectedItem().toString());
Resulset data = cat.Konversi();

if (data.next()) {
String isi = data.getString("category_id");
pro.setProduct_cat_id(Integer.parseInt(isi));
}

pro.ubahProduk();

        } catch (SQLexception sQLException) {
System.out.println("data tidak masuk");
        }
loadTable();
reset();

    }//GEN-LAST:event_bUbahActionPerformed

    
        
 
     
        
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField tDesk;
    private java.awt.TextField tHarga;
    private java.awt.TextField tID;
    private java.awt.TextField tNama;
    private javax.swing.JTable tProduk;
    // End of variables declaration//GEN-END:variables

