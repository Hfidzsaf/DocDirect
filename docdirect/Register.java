/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package docdirect;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Hafidz
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        InputNama1 = new javax.swing.JTextField();
        InputEmail2 = new javax.swing.JTextField();
        InputPassword2 = new javax.swing.JTextField();
        RegisterBtn4 = new javax.swing.JButton();
        TombolBackToLogin = new javax.swing.JButton();
        RegisterKolom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InputNama1.setBackground(new java.awt.Color(63, 111, 253));
        InputNama1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        InputNama1.setForeground(new java.awt.Color(255, 255, 255));
        InputNama1.setText("Nama");
        InputNama1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InputNama1MouseClicked(evt);
            }
        });
        InputNama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNama1ActionPerformed(evt);
            }
        });
        getContentPane().add(InputNama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 270, 40));

        InputEmail2.setBackground(new java.awt.Color(63, 111, 253));
        InputEmail2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        InputEmail2.setForeground(new java.awt.Color(255, 255, 255));
        InputEmail2.setText("Email");
        InputEmail2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InputEmail2MouseClicked(evt);
            }
        });
        InputEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEmail2ActionPerformed(evt);
            }
        });
        getContentPane().add(InputEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 270, 40));

        InputPassword2.setBackground(new java.awt.Color(63, 111, 253));
        InputPassword2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        InputPassword2.setForeground(new java.awt.Color(255, 255, 255));
        InputPassword2.setText("Password");
        InputPassword2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InputPassword2MouseClicked(evt);
            }
        });
        InputPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPassword2ActionPerformed(evt);
            }
        });
        getContentPane().add(InputPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 270, 40));

        RegisterBtn4.setBackground(new java.awt.Color(63, 111, 253));
        RegisterBtn4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        RegisterBtn4.setForeground(new java.awt.Color(255, 255, 255));
        RegisterBtn4.setText("Register");
        RegisterBtn4.setBorder(null);
        RegisterBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RegisterBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 140, 40));

        TombolBackToLogin.setBackground(new java.awt.Color(63, 111, 253));
        TombolBackToLogin.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TombolBackToLogin.setForeground(new java.awt.Color(255, 255, 255));
        TombolBackToLogin.setText(" Back To Login");
        TombolBackToLogin.setBorder(null);
        TombolBackToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TombolBackToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolBackToLoginActionPerformed(evt);
            }
        });
        getContentPane().add(TombolBackToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 210, 40));

        RegisterKolom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/docdirect/DOC DIRECT (8) (1).png"))); // NOI18N
        getContentPane().add(RegisterKolom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 619));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputNama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNama1ActionPerformed
        // TODO add your handling code here:
        String email = InputNama1.getText();
        String password = InputNama1.getText();

        // Misalkan Anda memiliki metode untuk memeriksa kecocokan email dan password
        boolean berhasilLogin = cekKredensial(email, password);

        if (berhasilLogin) {
            // Jika login berhasil, pindahkan ke halaman berikutnya
            TampilanPasien formBerikutnya = new TampilanPasien();
            formBerikutnya.setVisible(true);
            this.dispose();
        } else {
            // Jika login gagal, tampilkan pesan kesalahan
            JOptionPane.showMessageDialog(this, "Email atau Password Salah!", "Login Gagal", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_InputNama1ActionPerformed

    private void InputEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEmail2ActionPerformed
        // TODO add your handling code here:
        String email = InputEmail2.getText();
        String password = InputEmail2.getText();

        // Misalkan Anda memiliki metode untuk memeriksa kecocokan email dan password
        boolean berhasilLogin = cekKredensial(email, password);

        if (berhasilLogin) {
            // Jika login berhasil, pindahkan ke halaman berikutnya
            TampilanPasien formBerikutnya = new TampilanPasien();
            formBerikutnya.setVisible(true);
            this.dispose();
        } else {
            // Jika login gagal, tampilkan pesan kesalahan
            JOptionPane.showMessageDialog(this, "Email atau Password Salah!", "Login Gagal", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_InputEmail2ActionPerformed

    private void InputPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPassword2ActionPerformed
        // TODO add your handling code here:
        String email = InputPassword2.getText();
        String password = InputPassword2.getText();

        // Misalkan Anda memiliki metode untuk memeriksa kecocokan email dan password
        boolean berhasilLogin = cekKredensial(email, password);

        if (berhasilLogin) {
            // Jika login berhasil, pindahkan ke halaman berikutnya
            TampilanPasien formBerikutnya = new TampilanPasien();
            formBerikutnya.setVisible(true);
            this.dispose();
        } else {
            // Jika login gagal, tampilkan pesan kesalahan
            JOptionPane.showMessageDialog(this, "Email atau Password Salah!", "Login Gagal", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_InputPassword2ActionPerformed

    private void RegisterBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtn4ActionPerformed
        // TODO add your handling code here:
        System.out.println("Register btn clicked!");
        String fullName, email, Password;
        String SUrl = "jdbc:mysql://localhost:3306/pasiendb";
        String SUser = "root";
        String SPass = "";
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
        Statement st = con.createStatement();
        
        if ("".equals(InputNama1.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Masukan Nama Lengkap Anda", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(InputEmail2.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Masukan Email Anda", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(InputPassword2.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Buat Password Anda", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            fullName = InputNama1.getText(); 
            email = InputEmail2.getText();
            Password = InputPassword2.getText();
            
            String query = "INSERT INTO user(Nama, Email, Password) VALUES ('" + fullName + "', '" + email + "' , '" + Password + "')";
            st.executeUpdate(query);

            InputNama1.setText("");
            InputEmail2.setText("");
            InputPassword2.setText("");
            showMessageDialog(null, "Akun Telah Dibuat!");
        }
    } catch (Exception e) {
        System.out.println("Error! " + e.getMessage());
        e.printStackTrace(); // Menampilkan detail exception
    }

    }//GEN-LAST:event_RegisterBtn4ActionPerformed

    private void TombolBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolBackToLoginActionPerformed
        // TODO add your handling code here:
        LoginPasien login = new LoginPasien();
        login.setVisible(true);
       
        this.dispose();
    }//GEN-LAST:event_TombolBackToLoginActionPerformed

    private void InputNama1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputNama1MouseClicked
        // TODO add your handling code here:
        InputNama1.setText("");
    }//GEN-LAST:event_InputNama1MouseClicked

    private void InputEmail2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputEmail2MouseClicked
        // TODO add your handling code here:
        InputEmail2.setText("");
    }//GEN-LAST:event_InputEmail2MouseClicked

    private void InputPassword2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputPassword2MouseClicked
        // TODO add your handling code here:
        InputPassword2.setText("");
    }//GEN-LAST:event_InputPassword2MouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputEmail2;
    private javax.swing.JTextField InputNama1;
    private javax.swing.JTextField InputPassword2;
    private javax.swing.JButton RegisterBtn4;
    private javax.swing.JLabel RegisterKolom;
    private javax.swing.JButton TombolBackToLogin;
    // End of variables declaration//GEN-END:variables

    private boolean cekKredensial(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
