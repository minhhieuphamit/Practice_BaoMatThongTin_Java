/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tuan4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author Hieu Pham
 */
public class DESCS extends javax.swing.JFrame {

    /**
     * Creates new form DESCS
     */
    public DESCS() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldInputKey = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPlaintext = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCiphertext = new javax.swing.JTextArea();
        jButtonMaHoa = new javax.swing.JButton();
        jButtonUnlockA = new javax.swing.JButton();
        jButtonUnlockB = new javax.swing.JButton();
        jButtonGhiFile = new javax.swing.JButton();
        jButtonGiaiMa = new javax.swing.JButton();
        jButtonAllShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Input Key");

        jLabel2.setText("Plaintext");

        jLabel3.setText("Ciphertext");

        jTextAreaPlaintext.setColumns(20);
        jTextAreaPlaintext.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPlaintext);

        jTextAreaCiphertext.setColumns(20);
        jTextAreaCiphertext.setRows(5);
        jScrollPane2.setViewportView(jTextAreaCiphertext);

        jButtonMaHoa.setText("Mã hóa");
        jButtonMaHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaHoaActionPerformed(evt);
            }
        });

        jButtonUnlockA.setText("Mở khóa A");
        jButtonUnlockA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnlockAActionPerformed(evt);
            }
        });

        jButtonUnlockB.setText("Mở khóa B");
        jButtonUnlockB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnlockBActionPerformed(evt);
            }
        });

        jButtonGhiFile.setText("Ghi file");
        jButtonGhiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGhiFileActionPerformed(evt);
            }
        });

        jButtonGiaiMa.setText("Giải mã");
        jButtonGiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGiaiMaActionPerformed(evt);
            }
        });

        jButtonAllShow.setText("All show");
        jButtonAllShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonMaHoa)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUnlockA)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUnlockB)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGhiFile))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonGiaiMa)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAllShow))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldInputKey, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1)
                                .addComponent(jScrollPane2)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldInputKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMaHoa)
                    .addComponent(jButtonUnlockA)
                    .addComponent(jButtonUnlockB)
                    .addComponent(jButtonGhiFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGiaiMa)
                    .addComponent(jButtonAllShow))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private int mode;
    private static final String UNICODE_FORMAT = "UTF8";

    private static void doCopy(InputStream is, OutputStream os) throws IOException {
        byte[] bytes = new byte[64];
        int numBytes;
        while ((numBytes = is.read(bytes)) != -1) {
            os.write(bytes, 0, numBytes);
        }
        os.flush();
        os.close();
        is.close();
    }

    private static void encyptOrDecypt(String keyString, int mode, InputStream is, OutputStream os) throws Throwable {
        DESKeySpec dks = new DESKeySpec(keyString.getBytes());
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = skf.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES");

        if (mode == Cipher.ENCRYPT_MODE) {
            cipher.init(Cipher.ENCRYPT_MODE, desKey);
            CipherInputStream cis = new CipherInputStream(is, cipher);
            doCopy(cis, os);
        } else if (mode == Cipher.DECRYPT_MODE) {
            cipher.init(Cipher.DECRYPT_MODE, desKey);
            CipherOutputStream cos = new CipherOutputStream(os, cipher);
            doCopy(is, cos);
        }
    }

    private static void encrypt(String keyString, InputStream is, OutputStream os) throws Throwable {
        encyptOrDecypt(keyString, Cipher.ENCRYPT_MODE, is, os);
    }

    private static void decrypt(String keyString, InputStream is, OutputStream os) throws Throwable {
        encyptOrDecypt(keyString, Cipher.ENCRYPT_MODE, is, os);
    }
    private void jButtonMaHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaHoaActionPerformed
        // TODO add your handling code here:
        String key = jTextFieldInputKey.getText();
        try {
            FileInputStream fis = new FileInputStream("H:\\BaoMatThongTin\\TH_BMTT\\Tuan4\\Des.txt");
            FileOutputStream fos = new FileOutputStream("H:\\BaoMatThongTin\\TH_BMTT\\Tuan4\\EnDes.txt");
            encrypt(key, fis, fos);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonMaHoaActionPerformed

    private void jButtonUnlockAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnlockAActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader br = null;
            String fileName = "H:\\BaoMatThongTin\\TH_BMTT\\Tuan4\\KhoaA.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();

            JOptionPane.showMessageDialog(null, "Đã mở file");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            System.out.println("Du lieu la: " + " " + sb);
            String chuoi = sb.toString();
            jTextFieldInputKey.setText(chuoi);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButtonUnlockAActionPerformed

    private void jButtonUnlockBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnlockBActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader br = null;
            String fileName = "H:\\BaoMatThongTin\\TH_BMTT\\Tuan4\\KhoaB.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();

            JOptionPane.showMessageDialog(null, "Đã mở file");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            System.out.println("Du lieu la: " + " " + sb);
            String chuoi = sb.toString();
            jTextFieldInputKey.setText(chuoi);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButtonUnlockBActionPerformed

    private void jButtonGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGhiFileActionPerformed
        // TODO add your handling code here:
        try {
            BufferedWriter bw = null;
            String fileName = "H:\\BaoMatThongTin\\TH_BMTT\\Tuan4\\Des.txt";
            String s = jTextAreaPlaintext.getText();
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null, "Ghi file thành công!!!");
        } catch (Exception e) {
            Logger.getLogger(DESCS.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButtonGhiFileActionPerformed

    private void jButtonAllShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllShowActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader br = null;
            String fileName = "H:\\BaoMatThongTin\\TH_BMTT\\Tuan4\\DeDes.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Mở file thành công!!!");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            String ff = "H:\\BaoMatThongTin\\TH_BMTT\\Tuan4\\EnDes.txt";
            br = new BufferedReader(new FileReader(ff));
            StringBuffer sb1 = new StringBuffer();
            char[] ca1 = new char[5];
            while (br.ready()) {
                int len = br.read(ca1);
                sb1.append(ca1, 0, len);
            }

            System.out.println("Du lieu la: " + " " + sb);
            String chuoi = sb.toString();
            String chuoi1 = sb1.toString();
            jTextAreaPlaintext.setText(chuoi);
            jTextAreaCiphertext.setText(chuoi1);
        } catch (Exception e) {
            Logger.getLogger(DESCS.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButtonAllShowActionPerformed

    private void jButtonGiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGiaiMaActionPerformed
        // TODO add your handling code here:
        FileInputStream fis2 = null;
        try {
            String key = jTextFieldInputKey.getText();
            fis2 = new FileInputStream("H:\\BaoMatThongTin\\TH_BMTT\\EnDes.txt");
            FileOutputStream fos2 = new FileOutputStream("H:\\BaoMatThongTin\\TH_BMTT\\Tuan4\\DeDes.txt");
            decrypt(key, fis2, fos2);
            BufferedReader br = null;
            String fileName = "H:\\BaoMatThongTin\\TH_BMTT\\Tuan4\\DeDes.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showConfirmDialog(null, "Da gia ma");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            System.out.println("Du lieu la: " + sb);
            String chuoi = sb.toString();
            jTextAreaCiphertext.setText(chuoi);
        } catch (Throwable e) {
        }
    }//GEN-LAST:event_jButtonGiaiMaActionPerformed

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
            java.util.logging.Logger.getLogger(DESCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DESCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DESCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DESCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DESCS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAllShow;
    private javax.swing.JButton jButtonGhiFile;
    private javax.swing.JButton jButtonGiaiMa;
    private javax.swing.JButton jButtonMaHoa;
    private javax.swing.JButton jButtonUnlockA;
    private javax.swing.JButton jButtonUnlockB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaCiphertext;
    private javax.swing.JTextArea jTextAreaPlaintext;
    private javax.swing.JTextField jTextFieldInputKey;
    // End of variables declaration//GEN-END:variables
}
