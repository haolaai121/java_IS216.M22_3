/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlydiem_doanck;

import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */  
public class SinhVien_Diem extends javax.swing.JFrame {

    /**
     * @return the hocKy
     */
    public String getHocKy() {
        return hocKy;
    }

    /**
     * @param hocKy the hocKy to set
     */
    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
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
     * Creates new form SinhVien_Diem
     */
    private String maSV = "";
    private String hocKy = "";
    String[] row = null;
    DefaultTableModel dtm = null;
    private int flag = 0;
    public void getInfo(String maMH, float qt,float th, float gk, float ck, float tb)
    {
        row = new String[6];
        row[0] = maMH;
        row[1] = Float.toString(qt);
        row[2] = Float.toString(th);
        row[3] = Float.toString(gk);
        row[4] = Float.toString(ck);
        row[5] = Float.toString(tb);
    }
    public void displayInfo()
    {
        dtm.addRow(row);
    }
    public SinhVien_Diem() {
        initComponents();
        HocKycbBox.addItem("1");
        HocKycbBox.addItem("2");
    }
    public void setTableModel()
    {
        dtm = new DefaultTableModel();
        String tieude[] = {"Mã môn học","Điểm quá trình","Điểm thực hành","Điểm giữa kỳ","Điểm cuối kỳ","Điểm trung bình"};
        dtm.setColumnIdentifiers(tieude);
        DiemSVtable.setModel(dtm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DiemSVtable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        HocKycbBox = new javax.swing.JComboBox<>();
        btnXem = new javax.swing.JButton();
        btnPrintDiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(99, 172, 229));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Điểm Sinh Viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        DiemSVtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DiemSVtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã môn học", "Điểm quá trình", "Điểm thực hành", "Điểm giữa kỳ", "Điểm cuối kỳ", "Điểm trung bình"
            }
        ));
        jScrollPane1.setViewportView(DiemSVtable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Chọn học kỳ: ");

        HocKycbBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HocKycbBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                HocKycbBoxItemStateChanged(evt);
            }
        });
        HocKycbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HocKycbBoxActionPerformed(evt);
            }
        });

        btnXem.setBackground(new java.awt.Color(0, 153, 255));
        btnXem.setText("Xem");
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        btnPrintDiem.setBackground(new java.awt.Color(0, 153, 255));
        btnPrintDiem.setText("Xuất bản điểm chi tiết");
        btnPrintDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HocKycbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXem))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(btnPrintDiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HocKycbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrintDiem)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void HocKycbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HocKycbBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HocKycbBoxActionPerformed

    private void HocKycbBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_HocKycbBoxItemStateChanged
        // TODO add your handling code here:
//        try 
//        {
//            Connection sqlConnect = null;
//            sqlConnect = SQLServerConnection.getSQLServerConnection();
//            String sqlQuery = "SELECT * FROM DiemSo WHERE MaSV = ? AND HocKy = ?";
//            SQLServerPreparedStatement ps = (SQLServerPreparedStatement)sqlConnect.prepareStatement(sqlQuery);
//            ps.setString(1,maSV);
//            ps.setString(2, this.getHocKy());
//            ResultSet rs = ps.executeQuery();
//            while (rs.next())
//            {
//                this.getInfo
//                ( 
//                        rs.getString("MaMH"),
//                        rs.getFloat("DiemQT"), 
//                        rs.getFloat("DiemTH"), 
//                        rs.getFloat("DiemGK"), 
//                        rs.getFloat("DiemCK"),
//                        rs.getFloat("DiemTB")
//                );
//                this.displayInfo();
//            }
//        }
//        catch (Exception ex)
//        {
//            
//        }
    }//GEN-LAST:event_HocKycbBoxItemStateChanged

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
        // TODO add your handling code here:
        setHocKy((String)HocKycbBox.getSelectedItem());
        setTableModel();
        try 
        {
            Connection sqlConnect = null;
            sqlConnect = SQLServerConnection.getSQLServerConnection();
            String sqlQuery = "SELECT * FROM DiemSo WHERE MaSV = ? AND HocKy = ?";
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement)sqlConnect.prepareStatement(sqlQuery);
            ps.setString(1,maSV);
            ps.setString(2, this.getHocKy());
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                this.getInfo
                ( 
                        rs.getString("MaMH"),
                        rs.getFloat("DiemQT"), 
                        rs.getFloat("DiemTH"), 
                        rs.getFloat("DiemGK"), 
                        rs.getFloat("DiemCK"),
                        rs.getFloat("DiemTB")
                );
                this.displayInfo();
            }
        }
        catch (Exception ex)
        {
            
        }
        flag = 1;
    }//GEN-LAST:event_btnXemActionPerformed

    private void btnPrintDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintDiemActionPerformed
        // TODO add your handling code here:
        if (flag == 1)
        {
            try
            {
                HashMap param = new HashMap();
                param.put("MSSV", maSV);
                param.put("HK", HocKycbBox.getSelectedItem());
                String localDir = System.getProperty("user.dir");
            
                ReportViewer viewer = new ReportViewer(localDir + "\\src\\quanlydiem_doanck\\report_DiemSoSV.jrxml",param);
                viewer.setVisible(true);
            }
            catch (Exception e)
            {
                
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Chua co du lieu de hien thi, vui long bam \"Xem\" truoc","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintDiemActionPerformed

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
            java.util.logging.Logger.getLogger(SinhVien_Diem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVien_Diem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVien_Diem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVien_Diem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVien_Diem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DiemSVtable;
    private javax.swing.JComboBox<String> HocKycbBox;
    private javax.swing.JButton btnPrintDiem;
    private javax.swing.JButton btnXem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
