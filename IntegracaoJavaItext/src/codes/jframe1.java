package codes;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;

public class jframe1 extends javax.swing.JFrame {

   
    public jframe1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        ButtonCreatePDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(204, 204, 204));

        ButtonCreatePDF.setBackground(new java.awt.Color(232, 24, 24));
        ButtonCreatePDF.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCreatePDF.setText("Criar PDF");
        ButtonCreatePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreatePDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(ButtonCreatePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(ButtonCreatePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCreatePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreatePDFActionPerformed
        
        Document docPDF = new Document();
        try {
            PdfWriter.getInstance(docPDF, new FileOutputStream("Ex1PDF.pdf"));
            docPDF.open();
            docPDF.add(new Paragraph("PDF CRIADO"));
            docPDF.add(new Paragraph("1DRAKOON1", new Font(Font.FontFamily.SYMBOL,50,Font.BOLD)));
            docPDF.add(new Paragraph("Essa turma é demais.", new Font(Font.FontFamily.TIMES_ROMAN, 40, Font.BOLD)));
            docPDF.add(new Paragraph("bhshsg", new Font(Font.FontFamily.UNDEFINED,50,Font.BOLD)));
        } catch (FileNotFoundException erro1) {
            java.util.logging.Logger.getLogger(jframe1.class.getName()).log(Level.SEVERE, null, erro1);
        } catch (DocumentException ex) {
            java.util.logging.Logger.getLogger(jframe1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            docPDF.close();
        }
        try {
            //abrir o pdf
            Desktop.getDesktop().open(new File("Ex1PDF.pdf"));
        } catch (IOException erro) {
            java.util.logging.Logger.getLogger(jframe1.class.getName()).log(Level.SEVERE, null, erro);
        }
    }//GEN-LAST:event_ButtonCreatePDFActionPerformed

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
            java.util.logging.Logger.getLogger(jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton ButtonCreatePDF;
    // End of variables declaration//GEN-END:variables
}
