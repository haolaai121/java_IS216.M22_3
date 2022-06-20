/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlydiem_doanck;

import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class GiangVien_ThongTinSVLopCV extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();

    public GiangVien_ThongTinSVLopCV() throws SQLException, ClassNotFoundException {
        initComponents();        
    }

    /**
     * Creates new form ThongTinLopCV_GV
     */
    /**
     * @return the maSV
     */
    public String getMaGV() {
        return maGV;
    }

    /**
     * @param maGV the maSV to set
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public void setMaGV(String maGV) throws SQLException, ClassNotFoundException {
        this.maGV = maGV;
        loadDataLopHoc();
    }

    /**
     * Creates new form GiangVien_ThongTin
     *
     * @param e
     */
    private String maGV = "";
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

    public void loadDataLopHoc() throws SQLException, ClassNotFoundException {
        setTableModel();
        System.out.println(maGV);
        try {
            Connection sqlConnect = null;
            sqlConnect = SQLServerConnection.getSQLServerConnection();
            String sqlQuery = "SELECT sv.MaSV, sv.TenSv, k.TenKhoa, n.TenNganh, sv.MaLop, sv.NgaySinh, sv.SoDT, sv.DiaChi\n"
                    + "\n"
                    + "FROM\n"
                    + "(((SinhVien sv \n"
                    + "INNER JOIN Khoa k ON sv.MaKhoa = k.MaKhoa)\n"
                    + "INNER JOIN Nganh n ON sv.MaNganh = n.MaNganh)\n"
                    + "INNER JOIN GiaoVien gv ON sv.MaLop = \n"
                    + "gv.LopPT)\n"
                    + "WHERE gv.MaGV = ?";
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) sqlConnect.prepareStatement(sqlQuery);
            ps.setString(1, maGV);
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
                if (Tbthongtin.getSelectedRow() >= 0 )
                {
                    mssv.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 0)+ "");
                    hoten.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 1)+ "");
                    khoa.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 2)+ "");
                    nganh.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 3)+ "");
                    lop.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 4)+ "");
                    ngsinh.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 5)+ "");
                    sdt.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 6)+ "");
                    dchi.setText(Tbthongtin.getValueAt(Tbthongtin.getSelectedRow(), 7)+ "");
                }
            });
        } catch (ClassNotFoundException | SQLException ex) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbthongtin = new javax.swing.JTable();
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
        jLabel10 = new javax.swing.JLabel();
        dchi = new javax.swing.JTextField();
        btnGoBackj = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(99, 172, 229));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Tbthongtin.setAutoCreateRowSorter(true);
        Tbthongtin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MSSV", "Họ Tên", "Khoa", "Ngành", "Lớp", "Ngày sinh", "SĐT", "Địa chỉ"
            }
        ));
        jScrollPane1.setViewportView(Tbthongtin);

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

        jLabel10.setText("Địa chỉ");

        dchi.setEditable(false);

        btnGoBackj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGoBackj.setText("Quay lại màn hình chính");
        btnGoBackj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackjActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(99, 172, 229));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sdt, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(hoten)
                    .addComponent(mssv))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(181, 181, 181)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(khoa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addComponent(lop, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(nganh, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(147, 147, 147)
                            .addComponent(ngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dchi))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGoBackj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mssv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(khoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
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
                    .addComponent(btThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoBackj, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("THÔNG TIN SINH VIÊN LỚP CỐ VẤN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
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

    private void btnGoBackjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackjActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            GiangVien_MainFrame main = new GiangVien_MainFrame();
            this.setVisible(false);
            main.setMaGV(maGV);
        });
    }//GEN-LAST:event_btnGoBackjActionPerformed

    private void mssvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mssvActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mssvActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new GiangVien_ThongTinSVLopCV().setVisible(true);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GiangVien_ThongTinSVLopCV.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tbthongtin;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btnGoBackj;
    private javax.swing.JTextField dchi;
    private javax.swing.JTextField hoten;
    private javax.swing.JEditorPane jEditorPane1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField khoa;
    private javax.swing.JTextField lop;
    private javax.swing.JTextField mssv;
    private javax.swing.JTextField nganh;
    private javax.swing.JTextField ngsinh;
    private javax.swing.JTextField sdt;
    // End of variables declaration//GEN-END:variables
}
