/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlydiem_doanck;

import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ASUS
 */
public class GiangVien_MainFrame extends javax.swing.JFrame {

    /**
     * @return the maSV
     */
    public String getMaGV() {
        return maGV;
    }

    /**
     * @param maGV the maSV to set
     */
    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }
    
    private String maGV = "";
    
    /**
     * Creates new form GiangVien_MainFrame
     */
    public GiangVien_MainFrame() {
        initComponents();
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
        ttGiangVien_Btn = new javax.swing.JButton();
        dsLopCoVanBtn = new javax.swing.JButton();
        dsLopDayBtn = new javax.swing.JButton();
        GiangViennhapDiem_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(99, 172, 229));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GIẢNG VIÊN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ttGiangVien_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ttGiangVien_Btn.setText("THÔNG TIN GIẢNG VIÊN");
        ttGiangVien_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttGiangVien_BtnActionPerformed(evt);
            }
        });

        dsLopCoVanBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dsLopCoVanBtn.setText("DANH SÁCH LỚP CỐ VẤN");
        dsLopCoVanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsLopCoVanBtnActionPerformed(evt);
            }
        });

        dsLopDayBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dsLopDayBtn.setText("DANH SÁCH LỚP DẠY");
        dsLopDayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsLopDayBtnActionPerformed(evt);
            }
        });

        GiangViennhapDiem_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GiangViennhapDiem_Btn.setText("NHẬP ĐIỂM");
        GiangViennhapDiem_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiangViennhapDiem_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GiangViennhapDiem_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dsLopDayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dsLopCoVanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttGiangVien_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ttGiangVien_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dsLopCoVanBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dsLopDayBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GiangViennhapDiem_Btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void ttGiangVien_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttGiangVien_BtnActionPerformed
        GiangVien_ThongTinGV gvFrame = new GiangVien_ThongTinGV();
        try 
        {
            Connection conn = null;
            conn = (Connection) SQLServerConnection.getSQLServerConnection();
            String sqlQuery = "SELECT * FROM GiaoVien WHERE MaGV = ?";
            SQLServerPreparedStatement ps;
            ps = (SQLServerPreparedStatement)conn.prepareStatement(sqlQuery);
            ps.setString(1,maGV);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                gvFrame.setValueofGV
                (
                        maGV, 
                        rs.getString("TenGV"), 
                        rs.getString("MaKhoa"), 
                        rs.getString("LopPT"), 
                        rs.getString("MonPT") 
                );
            }
        }
        catch (ClassNotFoundException | SQLException ex)
        {
        }
        
        gvFrame.displayInfo();
        gvFrame.setVisible(true);
        gvFrame.setMaGV(maGV);
    }//GEN-LAST:event_ttGiangVien_BtnActionPerformed

    private void dsLopCoVanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsLopCoVanBtnActionPerformed
        try {
            GiangVien_ThongTinSVLopCV CV = new GiangVien_ThongTinSVLopCV();
            CV.setVisible(true);
            CV.setMaGV(maGV);
        } catch (SQLException | ClassNotFoundException ex) {
             System.out.println(ex.toString());
            Logger.getLogger(GiangVien_MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_dsLopCoVanBtnActionPerformed

    private void dsLopDayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsLopDayBtnActionPerformed
        try {
            GiangVien_ThongTinSVLopDay day = new GiangVien_ThongTinSVLopDay();
            day.setVisible(true);
            day.setMaGV(maGV);
        } catch (SQLException | ClassNotFoundException ex) {
             System.out.println(ex.toString());
            Logger.getLogger(GiangVien_MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dsLopDayBtnActionPerformed

    private void GiangViennhapDiem_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiangViennhapDiem_BtnActionPerformed
        try {
            GiangVien_NhapSuaDiem nhap = new GiangVien_NhapSuaDiem();
            nhap.setVisible(true);
            nhap.setMaGV(maGV);
        } catch (SQLException | ClassNotFoundException ex) {
             System.out.println(ex.toString());
            Logger.getLogger(GiangVien_MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GiangViennhapDiem_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(GiangVien_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiangVien_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiangVien_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiangVien_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiangVien_MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GiangViennhapDiem_Btn;
    private javax.swing.JButton dsLopCoVanBtn;
    private javax.swing.JButton dsLopDayBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton ttGiangVien_Btn;
    // End of variables declaration//GEN-END:variables

    
}
