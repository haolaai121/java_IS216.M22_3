/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlydiem_doanck;

import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class GiangVien_ThongTinSVLopDay extends javax.swing.JFrame {

    private void loadMonPT() {
        ArrayList<String> data = new ArrayList();
        String sql = "Select MaMH FROM CTLOPDAY WHERE MAGV = ?";
        try {
            Connection conn = null;
            conn = (Connection) SQLServerConnection.getSQLServerConnection();
            SQLServerPreparedStatement ps;
            ps = (SQLServerPreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, maGV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                data.add(rs.getString("MaMH"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        for (String string : data) {
            CbLopday.addItem(string);
        }
    }

    /**
     * @return the maSV
     */
    public String getMaGV() {
        return maGV;
    }

    /**
     * @param maGV the maSV to set
     */
    public void setMaGV(String maGV) throws SQLException, ClassNotFoundException {
        this.maGV = maGV;
        loadMonPT();
    }

    String[] row = null;
    DefaultTableModel dtm = null;

    public void getInfo(String MaSV, String TenSv, String TenKhoa, String TenNganh, String MaLop, String NgaySinh, String SoDT, String DiaChi) {
        row = new String[50];
        row[0] = MaSV;
        row[1] = TenSv;
        row[2] = TenKhoa;
        row[3] = TenNganh;
        row[4] = MaLop;
        row[5] = NgaySinh;
        row[6] = SoDT;
        row[7] = DiaChi;
    }

    public void displayInfo() {
        dtm.addRow(row);
    }

    public void setTableModel() {
        dtm = new DefaultTableModel();
        String tieude[] = {"MSSV", "Họ Tên", "Khoa", "Ngành", "Lớp", "Ngày sinh", "SĐT", "Địa chỉ"};
        dtm.setColumnIdentifiers(tieude);
        Tbthongtin.setModel(dtm);
    }

    /**
     * Creates new form GiangVien_ThongTin
     *
     * @param e
     */
    private String maGV = "";

    /**
     * Creates new form _GV
     */
    public GiangVien_ThongTinSVLopDay() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbthongtin = new javax.swing.JTable();
        CbLopday = new javax.swing.JComboBox<>();
        btThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mssv = new javax.swing.JTextField();
        hoten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        khoa = new javax.swing.JTextField();
        nganh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lop = new javax.swing.JTextField();
        ngsinh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sdt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btTim = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        dchi = new javax.swing.JTextField();
        btnGoBackj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(99, 172, 229));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN SINH VIÊN LỚP DẠY");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Tbthongtin.setAutoCreateRowSorter(true);
        Tbthongtin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MSSV", "HỌ TÊN", "Khoa", "Ngành", "Lớp", "Ngày sinh", "SĐT", "Địa chỉ"
            }
        ));
        jScrollPane1.setViewportView(Tbthongtin);

        CbLopday.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CbLopday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbLopdayActionPerformed(evt);
            }
        });

        btThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });

        jLabel2.setText("MSSV");

        jLabel3.setText("Họ tên");

        mssv.setEditable(false);
        mssv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mssvActionPerformed(evt);
            }
        });

        hoten.setEditable(false);

        jLabel4.setText("Khoa");

        jLabel5.setText("Ngành");

        khoa.setEditable(false);
        khoa.setToolTipText("");

        nganh.setEditable(false);
        nganh.setToolTipText("");

        jLabel6.setText("Lớp");

        jLabel7.setText("Ngày sinh");

        lop.setEditable(false);
        lop.setToolTipText("");

        ngsinh.setEditable(false);
        ngsinh.setToolTipText("");

        jLabel8.setText("SĐT");

        sdt.setEditable(false);
        sdt.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Lớp");

        btTim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btTim.setText("Tìm");
        btTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimActionPerformed(evt);
            }
        });

        jLabel10.setText("Địa chỉ");

        dchi.setEditable(false);

        btnGoBackj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGoBackj.setText("Quay lại màn hình chính");
        btnGoBackj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sdt, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(hoten)
                    .addComponent(mssv))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nganh, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(khoa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(277, Short.MAX_VALUE))
                            .addComponent(dchi)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lop, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(CbLopday, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGoBackj)
                        .addGap(134, 134, 134)
                        .addComponent(btTim, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbLopday, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mssv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(khoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(lop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(ngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(dchi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoBackj, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btThoatActionPerformed

    private void mssvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mssvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mssvActionPerformed

    private void btnGoBackjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackjActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            GiangVien_MainFrame main = new GiangVien_MainFrame();
            this.setVisible(false);
            main.setMaGV(maGV);
        });
    }//GEN-LAST:event_btnGoBackjActionPerformed

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
        String lopHoc = (String) CbLopday.getSelectedItem();
        setTableModel();
        System.out.println(maGV);
        try {
            Connection sqlConnect = null;
            sqlConnect = SQLServerConnection.getSQLServerConnection();
            String sqlQuery = "SELECT sv.MaSV, sv.TenSv, k.TenKhoa, n.TenNganh, sv.MaLop, sv.NgaySinh, sv.SoDT, sv.DiaChi\n"
                    + "FROM\n"
                    + "((((SinhVien sv \n"
                    + "JOIN Khoa k ON sv.MaKhoa = k.MaKhoa)\n"
                    + "JOIN Nganh n ON sv.MaNganh = n.MaNganh)\n"
                    + "JOIN DiemSo ds ON sv.MaSV = ds.MaSV)\n"
                    + "JOIN CTLOPDAY ct ON ds.MaMH = ct.MaMH)\n"
                    + "WHERE ct.MaGV = ? and ct.MaMH = ?";
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) sqlConnect.prepareStatement(sqlQuery);
            ps.setString(1, maGV);
            ps.setString(2, lopHoc);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                this.getInfo(
                        rs.getString("MaSV"),
                        rs.getString("TenSv"),
                        rs.getString("TenKhoa"),
                        rs.getString("TenNganh"),
                        rs.getString("MaLop"),
                        rs.getString("NgaySinh"),
                        rs.getString("SoDT"),
                        rs.getString("DiaChi")
                );
                this.displayInfo();
            }
            Tbthongtin.getSelectionModel().addListSelectionListener((ListSelectionEvent arg0) -> {
                if (Tbthongtin.getSelectedRow() >= 0) {
                    mssv.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 0) + "");
                    hoten.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 1) + "");
                    khoa.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 2) + "");
                    nganh.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 3) + "");
                    lop.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 4) + "");
                    ngsinh.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 5) + "");
                    sdt.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 6) + "");
                    dchi.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 7) + "");
                }
            });
        } catch (ClassNotFoundException | SQLException ex) {

        }
    }//GEN-LAST:event_btTimActionPerformed

    private void CbLopdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbLopdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbLopdayActionPerformed

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
            java.util.logging.Logger.getLogger(GiangVien_ThongTinSVLopDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiangVien_ThongTinSVLopDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiangVien_ThongTinSVLopDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiangVien_ThongTinSVLopDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiangVien_ThongTinSVLopDay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbLopday;
    private javax.swing.JTable Tbthongtin;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btTim;
    private javax.swing.JButton btnGoBackj;
    private javax.swing.JTextField dchi;
    private javax.swing.JTextField hoten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField khoa;
    private javax.swing.JTextField lop;
    private javax.swing.JTextField mssv;
    private javax.swing.JTextField nganh;
    private javax.swing.JTextField ngsinh;
    private javax.swing.JTextField sdt;
    // End of variables declaration//GEN-END:variables
}