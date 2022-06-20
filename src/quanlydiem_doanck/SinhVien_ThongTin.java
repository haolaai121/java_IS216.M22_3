/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlydiem_doanck;


import java.sql.*;
import java.util.HashMap;

import net.sf.jasperreports.engine.*; 
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import javax.servlet.ServletOutputStream;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.collections.map.HashedMap;

/**
 *
 * @author ASUS
 */
public class SinhVien_ThongTin extends javax.swing.JFrame {

    /**
     * @return the anhSV
     */
    public String getAnhSV() {
        return anhSV;
    }

    /**
     * @param anhSV the anhSV to set
     */
    public void setAnhSV(String anhSV) {
        this.anhSV = anhSV;
    }

    /**
     * @return the tenSV
     */
    public String getTenSV() {
        return tenSV;
    }

    /**
     * @param tenSV the tenSV to set
     */
    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    /**
     * @return the khoaSV
     */
    public String getKhoaSV() {
        return khoaSV;
    }

    /**
     * @param khoaSV the khoaSV to set
     */
    public void setKhoaSV(String khoaSV) {
        this.khoaSV = khoaSV;
    }

    /**
     * @return the lopSV
     */
    public String getLopSV() {
        return lopSV;
    }

    /**
     * @param lopSV the lopSV to set
     */
    public void setLopSV(String lopSV) {
        this.lopSV = lopSV;
    }

    /**
     * @return the nganhSV
     */
    public String getNganhSV() {
        return nganhSV;
    }

    /**
     * @param nganhSV the nganhSV to set
     */
    public void setNganhSV(String nganhSV) {
        this.nganhSV = nganhSV;
    }

    /**
     * @return the ngSinhSV
     */
    public String getNgSinhSV() {
        return ngSinhSV;
    }

    /**
     * @param ngSinhSV the ngSinhSV to set
     */
    public void setNgSinhSV(String ngSinhSV) {
        this.ngSinhSV = ngSinhSV;
    }

    /**
     * @return the gioiTinhSV
     */
    public String getGioiTinhSV() {
        return gioiTinhSV;
    }

    /**
     * @param gioiTinhSV the gioiTinhSV to set
     */
    public void setGioiTinhSV(String gioiTinhSV) {
        this.gioiTinhSV = gioiTinhSV;
    }

    /**
     * @return the sdtSV
     */
    public String getSdtSV() {
        return sdtSV;
    }

    /**
     * @param sdtSV the sdtSV to set
     */
    public void setSdtSV(String sdtSV) {
        this.sdtSV = sdtSV;
    }

    /**
     * @return the diaChiSV
     */
    public String getDiaChiSV() {
        return diaChiSV;
    }

    /**
     * @param diaChiSV the diaChiSV to set
     */
    public void setDiaChiSV(String diaChiSV) {
        this.diaChiSV = diaChiSV;
    }

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
     * Creates new form SinhVien_ThongTin
     * @param e
     */
    private String maSV = "";
    private String tenSV = "";
    private String khoaSV = "";
    private String lopSV = "";
    private String nganhSV = "";
    private String ngSinhSV = "";
    private String gioiTinhSV = "";
    private String sdtSV = "";
    private String diaChiSV = "";
    private String anhSV = "";
    public void setValueofSV(String ma, String ten, String khoa, String lop, String nganh, String ngaysinh, String gioitinh, String sodt, String diachi, String anh)
    {
        setMaSV(ma);
        setTenSV(ten);
        setKhoaSV(khoa);
        setLopSV(lop);
        setNganhSV(nganh);
        setNgSinhSV(ngaysinh);
        setGioiTinhSV(gioitinh);
        setSdtSV(sodt);
        setDiaChiSV(diachi);
        setAnhSV(anh);
    }
    public void displayInfo()
    {
        MSSVtxt.setText(this.maSV);
        tenSVtxt.setText(this.tenSV);
        khoaSVtxt.setText(this.khoaSV);
        lopSVtxt.setText(this.lopSV);
        nganhSvtxt.setText(this.nganhSV);
        ngSinhSVtxt.setText(this.ngSinhSV);
        gioiTinhSVtxt.setText(this.gioiTinhSV);
        sdtSVtxt.setText(this.sdtSV);
        diaChiSVtxt.setText(this.diaChiSV);
    }
    public SinhVien_ThongTin() {
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
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MSSVtxt = new javax.swing.JTextField();
        tenSVtxt = new javax.swing.JTextField();
        khoaSVtxt = new javax.swing.JTextField();
        lopSVtxt = new javax.swing.JTextField();
        nganhSvtxt = new javax.swing.JTextField();
        ngSinhSVtxt = new javax.swing.JTextField();
        gioiTinhSVtxt = new javax.swing.JTextField();
        sdtSVtxt = new javax.swing.JTextField();
        diaChiSVtxt = new javax.swing.JTextField();
        btnPrintTT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(99, 172, 229));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN SINH VIÊN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MÃ SỐ: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("TÊN: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("KHOA: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("LỚP: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("NGÀNH:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("NGÀY SINH:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("GIỚI TÍNH:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("SỐ ĐIỆN THOẠI:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ĐỊA CHỈ:");

        MSSVtxt.setBackground(new java.awt.Color(224, 240, 255));
        MSSVtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MSSVtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSSVtxtActionPerformed(evt);
            }
        });
        MSSVtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MSSVtxtKeyPressed(evt);
            }
        });

        tenSVtxt.setBackground(new java.awt.Color(224, 240, 255));
        tenSVtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        khoaSVtxt.setBackground(new java.awt.Color(224, 240, 255));
        khoaSVtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lopSVtxt.setBackground(new java.awt.Color(224, 240, 255));
        lopSVtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nganhSvtxt.setBackground(new java.awt.Color(224, 240, 255));
        nganhSvtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ngSinhSVtxt.setBackground(new java.awt.Color(224, 240, 255));
        ngSinhSVtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        gioiTinhSVtxt.setBackground(new java.awt.Color(224, 240, 255));
        gioiTinhSVtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        sdtSVtxt.setBackground(new java.awt.Color(224, 240, 255));
        sdtSVtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        diaChiSVtxt.setBackground(new java.awt.Color(224, 240, 255));
        diaChiSVtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnPrintTT.setBackground(new java.awt.Color(99, 172, 229));
        btnPrintTT.setText("Xuất Thông Tin Chi Tiết");
        btnPrintTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tenSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nganhSvtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MSSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(khoaSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lopSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ngSinhSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gioiTinhSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sdtSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diaChiSVtxt)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnPrintTT, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MSSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tenSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(khoaSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lopSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nganhSvtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ngSinhSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(gioiTinhSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sdtSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(diaChiSVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPrintTT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MSSVtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MSSVtxtKeyPressed
        
    }//GEN-LAST:event_MSSVtxtKeyPressed

    private void MSSVtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSSVtxtActionPerformed
        
    }//GEN-LAST:event_MSSVtxtActionPerformed

    private void btnPrintTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintTTActionPerformed
        // TODO add your handling code here:
        try
        {
            HashMap param = new HashMap();
            param.put("MSSV", MSSVtxt.getText());
            
            String localDir = System.getProperty("user.dir");
            
            ReportViewer viewer = new ReportViewer(localDir + "\\src\\quanlydiem_doanck\\report_ThongTinSinhVien.jrxml",param);
            viewer.setVisible(true);
        }
        catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_btnPrintTTActionPerformed

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
            java.util.logging.Logger.getLogger(SinhVien_ThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVien_ThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVien_ThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVien_ThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVien_ThongTin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MSSVtxt;
    private javax.swing.JButton btnPrintTT;
    private javax.swing.JTextField diaChiSVtxt;
    private javax.swing.JTextField gioiTinhSVtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField khoaSVtxt;
    private javax.swing.JTextField lopSVtxt;
    private javax.swing.JTextField ngSinhSVtxt;
    private javax.swing.JTextField nganhSvtxt;
    private javax.swing.JTextField sdtSVtxt;
    private javax.swing.JTextField tenSVtxt;
    // End of variables declaration//GEN-END:variables
}