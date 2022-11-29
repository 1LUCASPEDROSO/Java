package Codes;
import javax.swing.JOptionPane;
public class ColocrDinheiro extends javax.swing.JFrame {

int Total;
int TotalNota2 =0;
int TotalNota5 =0; 
int TotalNota10 =0; 
int TotalNota20 =0; 
int TotalNota50 =0;
int TotalNota100 =0;
int TotalNota200 =0; 
int QuantidadeNota2;
int QuantidadeNota5;
int QuantidadeNota10;
int QuantidadeNota20;
int QuantidadeNota50;
int QuantidadeNota100;
int QuantidadeNota200;
  
    public ColocrDinheiro() {
        initComponents();
    }

private void CalculoTotal (){
QuantidadeNota2 = Integer.parseInt(TextNotas2.getText());
QuantidadeNota5 = Integer.parseInt(TextNotas5.getText());
QuantidadeNota10 = Integer.parseInt(TextNotas10.getText());
QuantidadeNota20 = Integer.parseInt(TextNotas20.getText());
QuantidadeNota50 = Integer.parseInt(TextNotas50.getText());
QuantidadeNota100 = Integer.parseInt(TextNota100.getText());
QuantidadeNota2 = Integer.parseInt(TextNotas2.getText());

TotalNota2 = QuantidadeNota2 * 2;
TotalNota5 = QuantidadeNota2 * 5;
TotalNota10 = QuantidadeNota2 * 10;
TotalNota20 = QuantidadeNota2 * 20;
TotalNota50 = QuantidadeNota2 * 50;
TotalNota100 = QuantidadeNota2 * 100;
TotalNota200 = QuantidadeNota2 * 200;

Total = TotalNota2 + TotalNota5 + TotalNota10 + TotalNota20 + TotalNota50 + TotalNota100 + TotalNota200;

}

public void CalculoSaque(){

InterfaceUser IU = new InterfaceUser();

 int valor = IU.valor;



}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelNota2 = new javax.swing.JLabel();
        LabelNota5 = new javax.swing.JLabel();
        LabelNota10 = new javax.swing.JLabel();
        LabelNota50 = new javax.swing.JLabel();
        LabelNota20 = new javax.swing.JLabel();
        LabelNota100 = new javax.swing.JLabel();
        LabelNota200 = new javax.swing.JLabel();
        TextNotas2 = new javax.swing.JTextField();
        TextNotas5 = new javax.swing.JTextField();
        TextNotas10 = new javax.swing.JTextField();
        TextNotas50 = new javax.swing.JTextField();
        TextNota100 = new javax.swing.JTextField();
        TextNotas200 = new javax.swing.JTextField();
        TextNotas20 = new javax.swing.JTextField();
        BtCaixa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelNota2.setText("Digite a quantidade de notas de R$ 2");

        LabelNota5.setText("Digite a quantidade de notas de R$ 5");

        LabelNota10.setText("Digite a quantidade de notas de R$ 10");

        LabelNota50.setText("Digite a quantidade de notas de R$ 50");

        LabelNota20.setText("Digite a quantidade de notas de R$ 20");

        LabelNota100.setText("Digite a quantidade de notas de R$ 100");

        LabelNota200.setText("Digite a quantidade de notas de R$ 200");

        BtCaixa.setBackground(new java.awt.Color(0, 102, 204));
        BtCaixa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtCaixa.setForeground(new java.awt.Color(255, 255, 255));
        BtCaixa.setText("Finalizar");
        BtCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCaixaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelNota100)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelNota5)
                                .addComponent(LabelNota2)
                                .addComponent(LabelNota10)
                                .addComponent(LabelNota20)
                                .addComponent(LabelNota50))
                            .addComponent(LabelNota200)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(TextNota100, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(TextNotas50, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(TextNotas20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(TextNotas10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(TextNotas5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(TextNotas2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtCaixa)
                            .addComponent(TextNotas200, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LabelNota2)
                .addGap(12, 12, 12)
                .addComponent(TextNotas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelNota5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextNotas5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNota10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextNotas10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(LabelNota20)
                .addGap(3, 3, 3)
                .addComponent(TextNotas20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNota50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextNotas50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNota100)
                .addGap(18, 18, 18)
                .addComponent(TextNota100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelNota200)
                .addGap(18, 18, 18)
                .addComponent(TextNotas200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BtCaixa)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCaixaActionPerformed
       CalculoTotal();
        JOptionPane.showMessageDialog(null, "Total no Caixa: R$"+Total, "Caixa Pronto", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_BtCaixaActionPerformed

   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ColocrDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColocrDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColocrDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColocrDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColocrDinheiro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCaixa;
    private javax.swing.JLabel LabelNota10;
    private javax.swing.JLabel LabelNota100;
    private javax.swing.JLabel LabelNota2;
    private javax.swing.JLabel LabelNota20;
    private javax.swing.JLabel LabelNota200;
    private javax.swing.JLabel LabelNota5;
    private javax.swing.JLabel LabelNota50;
    private javax.swing.JTextField TextNota100;
    private javax.swing.JTextField TextNotas10;
    private javax.swing.JTextField TextNotas2;
    private javax.swing.JTextField TextNotas20;
    private javax.swing.JTextField TextNotas200;
    private javax.swing.JTextField TextNotas5;
    private javax.swing.JTextField TextNotas50;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
