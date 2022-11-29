package Codes;

import javax.swing.JOptionPane;

public class InterfaceJogodaVelha extends javax.swing.JFrame {

    /** Creates new form InterfaceJogodaVelha */
    public InterfaceJogodaVelha() {
        initComponents();
        String c = JOptionPane.showInputDialog(null, "começar ?");
        if (c.equals("sim")){
            
                    }// END IF começo jogo
    }
// int [][] tabuleiro = new int [jButton1,jButton11,jButton15][3];
  int contadorCliques = 0;
  String tabuleiro [][] = new String [3][3];
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanelBackground = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 72)); // NOI18N
        jLabel4.setText("x");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton15)
                    .addComponent(jButton11)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jButton17)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      jButton1.setText("x");
      jButton1.setEnabled(false);  
      tabuleiro [0][0] = "x";
      contadorCliques++;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setText("x");
      jButton10.setEnabled(false);  
      tabuleiro [0][2] = "x";
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      jButton11.setText("o");
      jButton11.setEnabled(false);  
      tabuleiro [1][0] = "o";     
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      if (contadorCliques == 2){
      jButton12.setText("o");
      jButton12.setEnabled(false);  
      tabuleiro [0][1] = "o";
      }// END IF MAQUINA
      else {jButton12.setText("x");
      jButton12.setEnabled(false);  
      tabuleiro [0][1] = "x";}
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      jButton13.setText("o");
      jButton13.setEnabled(false);  
      tabuleiro [1][1] = "o";
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
      jButton14.setText("x");
      jButton14.setEnabled(false);  
      tabuleiro [1][2] = "x";
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jButton15.setText("x");
      jButton15.setEnabled(false);  
      tabuleiro [1][0] = "x";
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jButton16.setText("o");
      jButton16.setEnabled(false);  
      tabuleiro [2][0] = "o";
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
         jButton17.setText("x");
      jButton17.setEnabled(false);  
      tabuleiro [2][1] = "x";
    }//GEN-LAST:event_jButton17ActionPerformed



 /*
 public void actionPerformed(ActionEvent evento){
    for(int x=0;x<3;x++){
      for(int y=0;y<3;y++){
        if(evento.getSource() == botoes[x][y]){
          jogar(x,y,(contadorCliques % 2)+1);
        }
      }
    }

    if(contadorCliques==9) terminarJogo(0);
    checarVencedorVertical();
    checarVencedorHorizontal();
    checarVencedorDiagonal1();
    checarVencedorDiagonal2();
  }

  //verifica se houve algum vencedor, caso haja, termina o jogo
  private void checarVencedorVertical(){
    for(int y=0;y<3;y++){
      int countJogador1 = 0;
      int countJogador2 = 0;
      for(int x=0;x<3;x++){
        if(botoes[x][y].jogador==1)countJogador1++;
        else if(botoes[x][y].jogador==2)countJogador2++;
      }
      if(countJogador1==3) terminarJogo(1);
      else if(countJogador2==3) terminarJogo(2);
    }
  }
  //checa vencedor nas horizontais
  private void checarVencedorHorizontal(){
    for(int x=0;x<3;x++){
      int countJogador1 = 0;
      int countJogador2 = 0;
      for(int y=0;y<3;y++){
        if(botoes[x][y].jogador==1)countJogador1++;
        else if(botoes[x][y].jogador==2)countJogador2++;
      }
      if(countJogador1==3) terminarJogo(1);
      else if(countJogador2==3) terminarJogo(2);
    }
  }
  //checa vencedor na primeira diagonal
  private void checarVencedorDiagonal1(){
    int countJogador1 = 0;
    int countJogador2 = 0;
    for(int x=0;x<3;x++){
      if(botoes[x][x].jogador==1)countJogador1++;
      else if(botoes[x][x].jogador==2)countJogador2++;
    }
    if(countJogador1==3) terminarJogo(1);
    else if(countJogador2==3) terminarJogo(2);
  }
  //checa vencedor na segunda diagonal
  private void checarVencedorDiagonal2(){
    int countJogador1 = 0;
    int countJogador2 = 0;
    for(int x=0;x<3;x++){
      if(botoes[x][2-x].jogador==1)countJogador1++;
      else if(botoes[x][2-x].jogador==2)countJogador2++;
    }
    if(countJogador1==3) terminarJogo(1);
    else if(countJogador2==3) terminarJogo(2);
  }

   método executado quando o jogo termina
   se vencedor = 0 - empate
   se vencedor = 1 - jogador 1 ganhou
   se vencedor = 2 - jogador 2 ganhou
  private void terminarJogo(int vencedor){
    if(vencedor>0){
      new MensagemVencedor(vencedor);
    }
    for(int x=0;x<3;x++){
      for(int y=0;y<3;y++){
        botoes[x][y].setText("");
        botoes[x][y].jogador=0;
        botoes[x][y].setEnabled(true);
        contadorCliques=0;
      }
    }

  }

   método executado a cada jogada
  posX é a posição no arrayX do botão
  posY é a posição no arrayY do botão
  jogador é o número do jogador (ou 1 ou 2)
  private void jogar(int posX,int posY, int jogador){
    String texto = (jogador==1)?"X":"O";
    botoes[posX][posY].setText(texto);
    botoes[posX][posY].jogador = jogador;
    botoes[posX][posY].setEnabled(false);
    contadorCliques++;
  }
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
            java.util.logging.Logger.getLogger(InterfaceJogodaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceJogodaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceJogodaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceJogodaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceJogodaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelBackground;
    // End of variables declaration//GEN-END:variables

}
