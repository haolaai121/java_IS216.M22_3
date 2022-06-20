/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlydiem_doanck;

import javax.swing.table.DefaultTableModel;
import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
/**
 *
 * @author ASUS
 */
public class SinhVien_ThoiKhoaBieu extends javax.swing.JFrame {

    /**
     * @return the maSV
     */
    public String getMaSV() {
        return maSV;
    }

    /**
     * @param maSV the maSV to set
     */
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    /**
     * Creates new form SinhVien_ThoiKhoaBieu
     */
    private String maSV = "";
    public SinhVien_ThoiKhoaBieu() {
        initComponents();
        HocKycbBox.addItem("1");
        HocKycbBox.addItem("2");
    }
    private String[] tiet1 = null;
    private String[] tiet2 = null;
    private String[] tiet3 = null;
    private String[] tiet4 = null;
    private String[] tiet5 = null;
    private DefaultTableModel dtm = null;
    public void setTableModel()
    {
        dtm = new DefaultTableModel();
        String tieude[] = {"Tiet","Thu 2","Thu 3","Thu 5","Thu 6","Thu 7"};
        dtm.setColumnIdentifiers(tieude);
        tkbTable.setModel(dtm);
    }
    public void displayInfo(String[] row)
    {
        dtm.addRow(row);
    }
    public void insertArrayTiet1(String tietHoc, String ngayHoc, String maMH)
    {
        if (tietHoc.equals("1"))
        {
            switch(ngayHoc)
            {
                case "Thu 2":
                {
                    tiet1[1] = maMH;
                    break;
                }
                case "Thu 3":
                {
                    tiet1[2] = maMH;
                    break;
                }
                case "Thu 4":
                {
                    tiet1[3] = maMH;
                    break;
                }
                case "Thu 5":
                {
                    tiet1[4] = maMH;
                    break;
                }
                case "Thu 6":
                {
                    tiet1[5] = maMH;
                    break;
                }
                case "Thu 7":
                {
                    tiet1[6] = maMH;
                    break;
                }
            }
        }
    }
    public void insertArrayTiet2(String tietHoc, String ngayHoc, String maMH)
    {
        if (tietHoc.equals("2"))
        {
            switch(ngayHoc)
            {
                case "Thu 2":
                {
                    tiet2[1] = maMH;
                    break;
                }
                case "Thu 3":
                {
                    tiet2[2] = maMH;
                    break;
                }
                case "Thu 4":
                {
                    tiet2[3] = maMH;
                    break;
                }
                case "Thu 5":
                {
                    tiet2[4] = maMH;
                    break;
                }
                case "Thu 6":
                {
                    tiet2[5] = maMH;
                    break;
                }
                case "Thu 7":
                {
                    tiet2[6] = maMH;
                    break;
                }
            }
        }
    }
    public void insertArrayTiet3(String tietHoc, String ngayHoc, String maMH)
    {
        if (tietHoc.equals("3"))
        {
            switch(ngayHoc)
            {
                case "Thu 2":
                {
                    tiet3[1] = maMH;
                    break;
                }
                case "Thu 3":
                {
                    tiet3[2] = maMH;
                    break;
                }
                case "Thu 4":
                {
                    tiet3[3] = maMH;
                    break;
                }
                case "Thu 5":
                {
                    tiet3[4] = maMH;
                    break;
                }
                case "Thu 6":
                {
                    tiet3[5] = maMH;
                    break;
                }
                case "Thu 7":
                {
                    tiet3[6] = maMH;
                    break;
                }
            }
        }
    }
    public void insertArrayTiet4(String tietHoc, String ngayHoc, String maMH)
    {
        if (tietHoc.equals("4"))
        {
            switch(ngayHoc)
            {
                case "Thu 2":
                {
                    tiet4[1] = maMH;
                    break;
                }
                case "Thu 3":
                {
                    tiet4[2] = maMH;
                    break;
                }
                case "Thu 4":
                {
                    tiet4[3] = maMH;
                    break;
                }
                case "Thu 5":
                {
                    tiet4[4] = maMH;
                    break;
                }
                case "Thu 6":
                {
                    tiet4[5] = maMH;
                    break;
                }
                case "Thu 7":
                {
                    tiet4[6] = maMH;
                    break;
                }
            }
        }
    }
    public void insertArrayTiet5(String tietHoc, String ngayHoc, String maMH)
    {
        if (tietHoc.equals("5"))
        {
            switch(ngayHoc)
            {
                case "Thu 2":
                {
                    tiet5[1] = maMH;
                    break;
                }
                case "Thu 3":
                {
                    tiet5[2] = maMH;
                    break;
                }
                case "Thu 4":
                {
                    tiet5[3] = maMH;
                    break;
                }
                case "Thu 5":
                {
                    tiet5[4] = maMH;
                    break;
                }
                case "Thu 6":
                {
                    tiet5[5] = maMH;
                    break;
                }
                case "Thu 7":
                {
                    tiet5[6] = maMH;
                    break;
                }
            }
        }
    }
    public void getTKB()
    {
        try 
        {
            Connection sqlConnect = null;
            sqlConnect = SQLServerConnection.getSQLServerConnection();
            String sqlQuery = "SELECT * FROM TKBMH WHERE MaSV = ? AND HocKy = ?";
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement)sqlConnect.prepareStatement(sqlQuery);
            ps.setString(1,maSV);
            ps.setString(2, (String)HocKycbBox.getSelectedItem());
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                switch(rs.getString("TietHoc"))
                {
                    case "1":
                    {
                        insertArrayTiet1(rs.getString("TietHoc"), rs.getString("NgayHoc"), rs.getString("MaMH"));
                        break;
                    }
                    case "2":
                    {
                        insertArrayTiet2(rs.getString("TietHoc"), rs.getString("NgayHoc"), rs.getString("MaMH"));
                        break;
                    }
                    case "3":
                    {
                        insertArrayTiet3(rs.getString("TietHoc"), rs.getString("NgayHoc"), rs.getString("MaMH"));
                        break;
                    }
                    case "4":
                    {
                        insertArrayTiet4(rs.getString("TietHoc"), rs.getString("NgayHoc"), rs.getString("MaMH"));
                        break;
                    }
                    case "5":
                    {
                        insertArrayTiet5(rs.getString("TietHoc"), rs.getString("NgayHoc"), rs.getString("MaMH"));
                        break;
                    }
                }
            }
        }
        catch (Exception ex)
        {
            
        }
        displayInfo(tiet1);
        displayInfo(tiet2);
        displayInfo(tiet3);
        displayInfo(tiet4);
        displayInfo(tiet5);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tkbTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        HocKycbBox = new javax.swing.JComboBox<>();
        btnXem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(99, 172, 229));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỜI KHÓA BIỂU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tkbTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tkbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tiết", "THỨ 2", "THỨ 3", "THỨ 4", "THỨ 5", "THỨ 6", "THỨ 7", "CHỦ NHẬT"
            }
        ));
        jScrollPane1.setViewportView(tkbTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Chọn học kỳ: ");

        HocKycbBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnXem.setBackground(new java.awt.Color(0, 153, 255));
        btnXem.setText("Xem");
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HocKycbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(HocKycbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
        // TODO add your handling code here:
        tiet1 = new String[7];
        tiet1[0] = "1";
        tiet2 = new String[7];
        tiet2[0] = "2";
        tiet3 = new String[7];
        tiet3[0] = "3";
        tiet4 = new String[7];
        tiet4[0] = "4";
        tiet5 = new String[7];
        tiet5[0] = "5";
        setTableModel();
        getTKB();
    }//GEN-LAST:event_btnXemActionPerformed
    
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
            java.util.logging.Logger.getLogger(SinhVien_ThoiKhoaBieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVien_ThoiKhoaBieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVien_ThoiKhoaBieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVien_ThoiKhoaBieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVien_ThoiKhoaBieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> HocKycbBox;
    private javax.swing.JButton btnXem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tkbTable;
    // End of variables declaration//GEN-END:variables
}
