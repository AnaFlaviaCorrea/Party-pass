/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.tela;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 *
 * @author anafl
 */
public class LeitorQRCode extends javax.swing.JFrame implements Runnable, ThreadFactory {

    private WebcamPanel panel = null;
    private Webcam webcam = null;

    private static final long serialVersionUID = 6441489157408381878L;
    private Executor executor = Executors.newSingleThreadExecutor(this);

    public LeitorQRCode() {
        initComponents();
        initWebcam();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultado = new javax.swing.JTextField();
        lb_Logo = new javax.swing.JLabel();
        Titulo = new javax.swing.JPanel();
        lb_titulo2 = new javax.swing.JLabel();
        leitor = new javax.swing.JPanel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(494, 375));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado.setEditable(false);
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 470, 50));

        lb_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Logo PartyPass I.png"))); // NOI18N
        getContentPane().add(lb_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 160));

        Titulo.setBackground(new java.awt.Color(153, 153, 153));

        lb_titulo2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lb_titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo2.setText("Leitor QRCode");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lb_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lb_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 450, 160));

        leitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        leitor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        container.setPreferredSize(new java.awt.Dimension(500, 400));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        leitor.add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -30, 480, 360));

        getContentPane().add(leitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 390, 300));
        leitor.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

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
                    if ("Windows".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(LeitorQRCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(LeitorQRCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(LeitorQRCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(LeitorQRCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new LeitorQRCode().setVisible(true);
                }
            });
        }
//        private javax.swing.JLabel jLabel1;
//        private javax.swing.JPanel jPanel1;
//        private javax.swing.JPanel jPanel2;
//        private javax.swing.JSeparator jSeparator1;
//        private javax.swing.JTextField resultado;
//        // End of variables declaration                   

        private void initWebcam() {
            Dimension size = WebcamResolution.QVGA.getSize();
            webcam = Webcam.getWebcams().get(0); //0 is default webcam
            webcam.setViewSize(size);

            panel = new WebcamPanel(webcam);
            panel.setPreferredSize(size);
            panel.setFPSDisplayed(true);

            leitor.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 330));

            executor.execute(this);
        }

        @Override
        public void run() {
            Result result = null;
            BufferedImage image = null;
            do {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (webcam.isOpen()) {
                    if ((image = webcam.getImage()) == null) {
                        continue;
                    }
                }

                LuminanceSource source = new BufferedImageLuminanceSource(image);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

                try {
                    result = new MultiFormatReader().decode(bitmap);
                } catch (NotFoundException e) {
                    //No result...
                }

                if (result != null) {
                    resultado.setText(result.getText());
                }
            } while (true);
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r, "My Thread");
            t.setDaemon(true);
            return t;
        }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Titulo;
    private javax.swing.JPanel container;
    private javax.swing.JLabel lb_Logo;
    private javax.swing.JLabel lb_titulo2;
    private javax.swing.JPanel leitor;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
