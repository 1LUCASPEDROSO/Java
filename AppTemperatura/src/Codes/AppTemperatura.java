package Codes;

import java.awt.Color;
import javax.swing.JOptionPane;

public class AppTemperatura extends javax.swing.JFrame {

    public AppTemperatura() {
        initComponents();
    }
// Atributos
    int celcius,kelvin,firenheit;
    int resultado;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo = new javax.swing.JLabel();
        LabelCelcius = new javax.swing.JLabel();
        LabelKelvin = new javax.swing.JLabel();
        LabelFirenhert = new javax.swing.JLabel();
        BdeslizanteKelvin = new javax.swing.JSlider();
        Bdeslizantecelcius = new javax.swing.JSlider();
        BdeslizanteFirenhert = new javax.swing.JSlider();
        LabelVinculadoCelcius = new javax.swing.JLabel();
        LabelVinculadoKelvin = new javax.swing.JLabel();
        LabelVinculadoFirenhert = new javax.swing.JLabel();
        PainelConversoes = new javax.swing.JPanel();
        LabelDE = new javax.swing.JLabel();
        LabelTextConversao = new javax.swing.JLabel();
        LabelPARA = new javax.swing.JLabel();
        LabelRESULTADOFINAL = new javax.swing.JLabel();
        BotãoCalcular = new javax.swing.JButton();
        BotãoLimpar = new javax.swing.JButton();
        CaixaSelecDE = new javax.swing.JComboBox<>();
        CaixaSelecPARA = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        LabelTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(63, 70, 158));
        LabelTitulo.setText("Termômetro");

        LabelCelcius.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LabelCelcius.setText("Celsius");

        LabelKelvin.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LabelKelvin.setText("Kelvin");

        LabelFirenhert.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LabelFirenhert.setText("Firenhert");

        BdeslizanteKelvin.setMajorTickSpacing(30);
        BdeslizanteKelvin.setMaximum(373);
        BdeslizanteKelvin.setMinorTickSpacing(10);
        BdeslizanteKelvin.setOrientation(javax.swing.JSlider.VERTICAL);
        BdeslizanteKelvin.setPaintLabels(true);
        BdeslizanteKelvin.setPaintTicks(true);
        BdeslizanteKelvin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BdeslizanteKelvinStateChanged(evt);
            }
        });

        Bdeslizantecelcius.setMajorTickSpacing(10);
        Bdeslizantecelcius.setMinorTickSpacing(1);
        Bdeslizantecelcius.setOrientation(javax.swing.JSlider.VERTICAL);
        Bdeslizantecelcius.setPaintLabels(true);
        Bdeslizantecelcius.setPaintTicks(true);
        Bdeslizantecelcius.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BdeslizantecelciusStateChanged(evt);
            }
        });

        BdeslizanteFirenhert.setMajorTickSpacing(30);
        BdeslizanteFirenhert.setMaximum(230);
        BdeslizanteFirenhert.setMinimum(-40);
        BdeslizanteFirenhert.setMinorTickSpacing(2);
        BdeslizanteFirenhert.setOrientation(javax.swing.JSlider.VERTICAL);
        BdeslizanteFirenhert.setPaintLabels(true);
        BdeslizanteFirenhert.setPaintTicks(true);
        BdeslizanteFirenhert.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BdeslizanteFirenhertStateChanged(evt);
            }
        });

        LabelVinculadoCelcius.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LabelVinculadoCelcius.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelVinculadoCelcius.setLabelFor(Bdeslizantecelcius);
        LabelVinculadoCelcius.setToolTipText("");

        LabelVinculadoKelvin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LabelVinculadoKelvin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelVinculadoKelvin.setLabelFor(BdeslizanteKelvin);
        LabelVinculadoKelvin.setText("100");

        LabelVinculadoFirenhert.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LabelVinculadoFirenhert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelVinculadoFirenhert.setText("50");

        PainelConversoes.setBackground(new java.awt.Color(255, 255, 255));
        PainelConversoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Converções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        LabelDE.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LabelDE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDE.setText("DE:");

        LabelTextConversao.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LabelTextConversao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTextConversao.setText("RESULTADO DA CONVERSÃO");

        LabelPARA.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LabelPARA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPARA.setText("PARA:");

        LabelRESULTADOFINAL.setBackground(new java.awt.Color(0, 0, 255));
        LabelRESULTADOFINAL.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LabelRESULTADOFINAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        BotãoCalcular.setBackground(new java.awt.Color(0, 51, 204));
        BotãoCalcular.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        BotãoCalcular.setForeground(new java.awt.Color(255, 255, 255));
        BotãoCalcular.setText("Calcular");
        BotãoCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotãoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCalcularActionPerformed(evt);
            }
        });

        BotãoLimpar.setBackground(new java.awt.Color(255, 0, 0));
        BotãoLimpar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        BotãoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        BotãoLimpar.setText("LIMPAR");
        BotãoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoLimparActionPerformed(evt);
            }
        });

        CaixaSelecDE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "**********", "CELCIUS", "KELVIN", "FIRENHERT" }));

        CaixaSelecPARA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "**********", "CELCIUS", "KELVIN", "FIRENHERT" }));

        javax.swing.GroupLayout PainelConversoesLayout = new javax.swing.GroupLayout(PainelConversoes);
        PainelConversoes.setLayout(PainelConversoesLayout);
        PainelConversoesLayout.setHorizontalGroup(
            PainelConversoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConversoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTextConversao, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PainelConversoesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BotãoCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotãoLimpar)
                .addGap(23, 23, 23))
            .addGroup(PainelConversoesLayout.createSequentialGroup()
                .addGroup(PainelConversoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelConversoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelConversoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelPARA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelConversoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CaixaSelecPARA, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CaixaSelecDE, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelConversoesLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(LabelRESULTADOFINAL, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelConversoesLayout.setVerticalGroup(
            PainelConversoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConversoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PainelConversoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDE)
                    .addComponent(CaixaSelecDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelConversoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPARA)
                    .addComponent(CaixaSelecPARA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(LabelTextConversao)
                .addGap(64, 64, 64)
                .addComponent(LabelRESULTADOFINAL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelConversoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotãoCalcular)
                    .addComponent(BotãoLimpar))
                .addGap(19, 19, 19))
        );

        jLabel1.setText("°c");
        jLabel1.setName(""); // NOI18N

        jLabel2.setText("°k");

        jLabel3.setText("°F");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(LabelTitulo))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCelcius)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LabelVinculadoCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bdeslizantecelcius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BdeslizanteKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelVinculadoKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelKelvin))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelFirenhert)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BdeslizanteFirenhert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelVinculadoFirenhert, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(17, 17, 17)
                .addComponent(PainelConversoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(LabelTitulo)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelCelcius)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bdeslizantecelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addComponent(LabelVinculadoCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelFirenhert)
                        .addGap(12, 12, 12)
                        .addComponent(BdeslizanteFirenhert, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelVinculadoFirenhert, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))))
                    .addComponent(PainelConversoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(LabelKelvin)
                .addGap(18, 18, 18)
                .addComponent(BdeslizanteKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(LabelVinculadoKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotãoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCalcularActionPerformed
       switch (CaixaSelecDE.getSelectedIndex()){
           case 0:
               CaixaSelecDE.setBackground(Color.red);
               JOptionPane.showMessageDialog(null, "selecione uma opção de temperaura", "Erro", JOptionPane.ERROR_MESSAGE);
               break;
           case 1:
               CaixaSelecDE.setBackground(Color.blue);
             celcius = Integer.parseInt(LabelVinculadoCelcius.getText());
              BdeslizanteFirenhert.equals(LabelVinculadoCelcius.getText()); BdeslizanteKelvin.equals(celcius);
               JOptionPane.showMessageDialog(null, "Temperatura em celcius registrada com suecesso.\n valor:"+celcius, "Aviso", JOptionPane.INFORMATION_MESSAGE);
               break;
           case 2:
               CaixaSelecDE.setBackground(Color.blue);
            kelvin = Integer.parseInt(LabelVinculadoKelvin.getText());
             JOptionPane.showMessageDialog(null, "Temperatura em kelvin registrada com suecesso.\n valor:"+kelvin, "Aviso", JOptionPane.INFORMATION_MESSAGE);   
               break;
           case 3:
               CaixaSelecDE.setBackground(Color.blue);
             firenheit = Integer.parseInt(LabelVinculadoFirenhert.getText());
             JOptionPane.showMessageDialog(null, "Temperatura em firenheit registrada com suecesso.\n valor:"+firenheit, "Aviso", JOptionPane.INFORMATION_MESSAGE);  
               break;

       }// END SWITCH CASE ESCOLHA DE
       if (CaixaSelecPARA.getSelectedIndex()==0){
       JOptionPane.showMessageDialog(null, "Essa escolha não é valida para calculo", "aviso",JOptionPane.WARNING_MESSAGE);
       }// END IF 
       else if (CaixaSelecDE.getSelectedIndex() ==1 && CaixaSelecPARA.getSelectedIndex() == 1){
           LabelRESULTADOFINAL.setText(celcius+"°c");
           JOptionPane.showMessageDialog(null, "Operação desnecessária, a temperatura em célcius: ", "Aviso", JOptionPane.WARNING_MESSAGE);}// END else if de celcius para celcius
       else if (CaixaSelecDE.getSelectedIndex() ==1 && CaixaSelecPARA.getSelectedIndex() == 2){
            LabelRESULTADOFINAL.setText(celcius+273.15+"°k");
            JOptionPane.showMessageDialog(null, "Operação escolhida:\n Celsius para Kelvin: ", "Aviso", JOptionPane.WARNING_MESSAGE);}// END else if de celcius para kelvin
       else if (CaixaSelecDE.getSelectedIndex() ==1 && CaixaSelecPARA.getSelectedIndex() == 3){
            LabelRESULTADOFINAL.setText(celcius+1.8+32+"°F");
            JOptionPane.showMessageDialog(null, "Operação escolhida:\n Celsius para firenheit: ", "Aviso", JOptionPane.WARNING_MESSAGE);}// END else if de celcius para fireheit
       
       else if (CaixaSelecDE.getSelectedIndex() ==2 && CaixaSelecPARA.getSelectedIndex() == 1){
            LabelRESULTADOFINAL.setText(kelvin-273.15+"°c");
            JOptionPane.showMessageDialog(null, "Operação escolhida:\n kelvin para celsius: ", "Aviso", JOptionPane.WARNING_MESSAGE);}// END else if de kelvin para celscius
        else if (CaixaSelecDE.getSelectedIndex() ==2 && CaixaSelecPARA.getSelectedIndex() == 2){
            LabelRESULTADOFINAL.setText(kelvin+"°K");
            JOptionPane.showMessageDialog(null, "Operação escolhida:\n kelvin para kelvin: ", "Aviso", JOptionPane.WARNING_MESSAGE);}// END else if de kelvin para kelvin
        else if (CaixaSelecDE.getSelectedIndex() ==2 && CaixaSelecPARA.getSelectedIndex() == 3){
            resultado = ((kelvin*9)/5)+32;
            LabelRESULTADOFINAL.setText (resultado+"°k");
            JOptionPane.showMessageDialog(null, "Operação escolhida:\n kelvin para fireheit: ", "Aviso", JOptionPane.WARNING_MESSAGE);}// END else if de kelvin para fireheit
       
        else if (CaixaSelecDE.getSelectedIndex() ==3 && CaixaSelecPARA.getSelectedIndex() == 1){
            resultado = (firenheit - 32) * 5/9;
            LabelRESULTADOFINAL.setText(resultado+"°c");
            JOptionPane.showMessageDialog(null, "Operação escolhida:\n Firenheit para celsius: ", "Aviso", JOptionPane.WARNING_MESSAGE);}// END else if de celsius para firenheit
        else if (CaixaSelecDE.getSelectedIndex() ==3 && CaixaSelecPARA.getSelectedIndex() == 2){
             double resultado = (firenheit - 32 + 273.15) * 5/9;
            LabelRESULTADOFINAL.setText(resultado+"°k");
            JOptionPane.showMessageDialog(null, "Operação escolhida:\n Firenheit para celsius: ", "Aviso", JOptionPane.WARNING_MESSAGE);}// END else if de fireheit para kelvin
         else if (CaixaSelecDE.getSelectedIndex() ==3 && CaixaSelecPARA.getSelectedIndex() == 3){
            LabelRESULTADOFINAL.setText(firenheit+"°F");
            JOptionPane.showMessageDialog(null, "Operação escolhida:\n Firenheit para celsius: ", "Aviso", JOptionPane.WARNING_MESSAGE);}// END else if de fireheit para kelvin
    }//GEN-LAST:event_BotãoCalcularActionPerformed

    private void BotãoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoLimparActionPerformed
        CaixaSelecDE.setSelectedIndex(0);
        CaixaSelecPARA.setSelectedIndex(0);
        JOptionPane.showMessageDialog(null, "Sistema limpo", "pronto", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BotãoLimparActionPerformed

    private void BdeslizantecelciusStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BdeslizantecelciusStateChanged
     celcius = Integer.parseInt(LabelVinculadoCelcius.getText());
    }//GEN-LAST:event_BdeslizantecelciusStateChanged

    private void BdeslizanteKelvinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BdeslizanteKelvinStateChanged
         kelvin = Integer.parseInt(LabelVinculadoKelvin.getText());
    }//GEN-LAST:event_BdeslizanteKelvinStateChanged

    private void BdeslizanteFirenhertStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BdeslizanteFirenhertStateChanged
        firenheit = Integer.parseInt(LabelVinculadoFirenhert.getText());
    }//GEN-LAST:event_BdeslizanteFirenhertStateChanged
        
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
            java.util.logging.Logger.getLogger(AppTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppTemperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider BdeslizanteFirenhert;
    private javax.swing.JSlider BdeslizanteKelvin;
    private javax.swing.JSlider Bdeslizantecelcius;
    private javax.swing.JButton BotãoCalcular;
    private javax.swing.JButton BotãoLimpar;
    private javax.swing.JComboBox<String> CaixaSelecDE;
    private javax.swing.JComboBox<String> CaixaSelecPARA;
    private javax.swing.JLabel LabelCelcius;
    private javax.swing.JLabel LabelDE;
    private javax.swing.JLabel LabelFirenhert;
    private javax.swing.JLabel LabelKelvin;
    private javax.swing.JLabel LabelPARA;
    private javax.swing.JLabel LabelRESULTADOFINAL;
    private javax.swing.JLabel LabelTextConversao;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelVinculadoCelcius;
    private javax.swing.JLabel LabelVinculadoFirenhert;
    private javax.swing.JLabel LabelVinculadoKelvin;
    private javax.swing.JPanel PainelConversoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
