/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package docdirect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hafidz
 */
public class LoginDokter extends javax.swing.JFrame {

    /**
     * Creates new form LoginPasien
     */
    public LoginDokter() {
        initComponents();
    }
public static LoginDokter getInstance() {
        Object instance = null;
        if (instance == null) {
            instance = new LoginDokter();
        }
        return (LoginDokter) instance;
}
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InputEmail1 = new javax.swing.JTextField();
        TombolLogin1 = new javax.swing.JButton();
        TombolRegister1 = new javax.swing.JButton();
        InputPassword1 = new javax.swing.JTextField();
        TombolBack2 = new javax.swing.JButton();
        Pasien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InputEmail1.setBackground(new java.awt.Color(63, 111, 253));
        InputEmail1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        InputEmail1.setForeground(new java.awt.Color(255, 255, 255));
        InputEmail1.setText("Email");
        InputEmail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InputEmail1MouseClicked(evt);
            }
        });
        InputEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEmail1ActionPerformed(evt);
            }
        });
        getContentPane().add(InputEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 270, 40));

        TombolLogin1.setBackground(new java.awt.Color(63, 111, 253));
        TombolLogin1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TombolLogin1.setForeground(new java.awt.Color(255, 255, 255));
        TombolLogin1.setText("Login");
        TombolLogin1.setBorder(null);
        TombolLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TombolLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolLogin1ActionPerformed(evt);
            }
        });
        getContentPane().add(TombolLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 140, 40));

        TombolRegister1.setBackground(new java.awt.Color(63, 111, 253));
        TombolRegister1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TombolRegister1.setForeground(new java.awt.Color(255, 255, 255));
        TombolRegister1.setText("Register");
        TombolRegister1.setBorder(null);
        TombolRegister1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TombolRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolRegister1ActionPerformed(evt);
            }
        });
        getContentPane().add(TombolRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 130, 40));

        InputPassword1.setBackground(new java.awt.Color(63, 111, 253));
        InputPassword1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        InputPassword1.setForeground(new java.awt.Color(255, 255, 255));
        InputPassword1.setText("Password");
        InputPassword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InputPassword1MouseClicked(evt);
            }
        });
        InputPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPassword1ActionPerformed(evt);
            }
        });
        getContentPane().add(InputPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 270, 40));

        TombolBack2.setBackground(new java.awt.Color(63, 111, 253));
        TombolBack2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TombolBack2.setForeground(new java.awt.Color(255, 255, 255));
        TombolBack2.setText("Back");
        TombolBack2.setBorder(null);
        TombolBack2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TombolBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolBack2ActionPerformed(evt);
            }
        });
        getContentPane().add(TombolBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 110, 40));

        Pasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/docdirect/DOC DIRECT (6) (1).png"))); // NOI18N
        Pasien.setText("Pasien");
        Pasien.setPreferredSize(new java.awt.Dimension(1100, 619));
        getContentPane().add(Pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean cekKredensial(String email, String password) {
    String SUrl = "jdbc:MySQL://localhost:3306/pasiendb";
    String SUser = "root";
    String SPass = "";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
        Statement st = con.createStatement();
        String query = "SELECT * FROM dokter WHERE Email= '" + email + "'";
        ResultSet rs = (ResultSet) st.executeQuery(query);
        while (rs.next()) {
            String passDb = rs.getString("Password");
            if (password.equals(passDb)) {
                return true;
            }
        }
    } catch (Exception e) {
        System.out.println("Error!" + e.getMessage());
    }
    return false;
}
    private void InputEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEmail1ActionPerformed
        // TODO add your handling code here:
    String email = InputEmail1.getText();
    String password = InputPassword1.getText();

    // Misalkan Anda memiliki metode untuk memeriksa kecocokan email dan password
    boolean berhasilLogin = cekKredensial(email, password);

    if (berhasilLogin) {
        // Jika login berhasil, pindahkan ke halaman berikutnya
        TampilanDokter formBerikutnya = new TampilanDokter();
        formBerikutnya.setVisible(true);
        this.dispose();
    } else {
        // Jika login gagal, tampilkan pesan kesalahan
        JOptionPane.showMessageDialog(this, "Email atau Password Salah!", "Login Gagal", JOptionPane.ERROR_MESSAGE);
    }
           
    }//GEN-LAST:event_InputEmail1ActionPerformed

    private void TombolLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolLogin1ActionPerformed
        // TODO add your handling code here:
        String  Email, Password, fullName = null, passDb = null;
        String SUrl, SUser, SPass;
            SUrl = "jdbc:MySQL://localhost:3306/dokterdb";
            SUser = "root";
            SPass = "";
            int notFound = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =  DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
    
            if("".equals(InputEmail1.getText())){
                 JOptionPane.showMessageDialog(new JFrame(), "Masukan Email Anda", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(InputPassword1.getText())){
                 JOptionPane.showMessageDialog(new JFrame(), "Masukan Password Anda", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else{
                Email = InputEmail1.getText();
                Password = InputPassword1.getText();
                
                String query = "SELECT * FROM dokter WHERE Email= '"+Email+"'";
       
                java.sql.ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                passDb = rs.getString("Password");    
                fullName = rs.getString("Nama");
                notFound = 1;
            }
            if(notFound == 1 && Password.equals(passDb)){
                TampilanDokter Tampilan = new TampilanDokter();
                Tampilan.setUser(fullName);
                Tampilan.setVisible(true);
                Tampilan.pack();
                Tampilan.setLocationRelativeTo(null); 
                this.dispose();
            }else{
               JOptionPane.showMessageDialog(new JFrame(), "Email atau Password Salah!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            InputPassword1.setText("");
            
            }
        }catch(Exception e){
           System.out.println("Error!" + e.getMessage()); 
        }
    }//GEN-LAST:event_TombolLogin1ActionPerformed

    private void TombolRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolRegister1ActionPerformed
        // TODO add your handling code here:
        RegisterDokter formPendaftaran = new RegisterDokter();
        formPendaftaran.setVisible(true);
        formPendaftaran.pack();
        formPendaftaran.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_TombolRegister1ActionPerformed

    private void InputPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPassword1ActionPerformed

    private void TombolBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolBack2ActionPerformed
        // TODO add your handling code here:
    LoginPasienDanDokter login = new LoginPasienDanDokter();
    login.setVisible(true);
    this.dispose();                            
    }//GEN-LAST:event_TombolBack2ActionPerformed

    private void InputEmail1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputEmail1MouseClicked
        // TODO add your handling code here:
        InputEmail1.setText("");
    }//GEN-LAST:event_InputEmail1MouseClicked

    private void InputPassword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputPassword1MouseClicked
        // TODO add your handling code here:
        InputPassword1.setText("");
    }//GEN-LAST:event_InputPassword1MouseClicked

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
            java.util.logging.Logger.getLogger(LoginDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new LoginDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputEmail1;
    private javax.swing.JTextField InputPassword1;
    private javax.swing.JLabel Pasien;
    private javax.swing.JButton TombolBack2;
    private javax.swing.JButton TombolLogin1;
    private javax.swing.JButton TombolRegister1;
    // End of variables declaration//GEN-END:variables

   

    private static class ResultSet {

        public ResultSet() {
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getString(String Password) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
