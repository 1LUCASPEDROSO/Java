package Codes;

import javax.swing.JOptionPane;

public class TelaQuemSomosNos extends javax.swing.JFrame {

    public TelaQuemSomosNos() {
        initComponents();
        //centralizar na tela
        setLocationRelativeTo(null);
        //desmarcar o botão de maximizar
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        PainelNavBar3 = new javax.swing.JPanel();
        BtHamburguer2 = new javax.swing.JButton();
        BtPesquisar2 = new javax.swing.JButton();
        TextPesquisa2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        BTPaginaInicial2 = new javax.swing.JButton();
        PainelNavBar1 = new javax.swing.JPanel();
        BTConjuntos = new javax.swing.JButton();
        BTSeleções = new javax.swing.JButton();
        BTTimes = new javax.swing.JButton();
        LabelCategoria = new javax.swing.JLabel();
        BTQuemSomosNos = new javax.swing.JButton();
        BTduvidas = new javax.swing.JButton();
        BTRastrearPedido = new javax.swing.JButton();
        BTTermosDeerviço = new javax.swing.JButton();
        LabelInformações = new javax.swing.JLabel();
        BTConjuntos1 = new javax.swing.JButton();
        BTwpp = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BTInsta = new javax.swing.JButton();
        LabelInformações1 = new javax.swing.JLabel();
        BTPaginaInicial = new javax.swing.JButton();
        TituloQuemSomosNos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextQuemSomosNos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(243, 243, 243));
        jPanel3.setPreferredSize(new java.awt.Dimension(1025, 1051));
        jPanel3.setLayout(null);

        PainelNavBar3.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtHamburguer2.setBackground(new java.awt.Color(115, 115, 115));
        BtHamburguer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuHam.png"))); // NOI18N
        BtHamburguer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtHamburguer2ActionPerformed(evt);
            }
        });

        BtPesquisar2.setBackground(new java.awt.Color(115, 115, 115));
        BtPesquisar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupinha.png"))); // NOI18N
        BtPesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisar2ActionPerformed(evt);
            }
        });

        TextPesquisa2.setBackground(new java.awt.Color(232, 232, 232));
        TextPesquisa2.setForeground(new java.awt.Color(0, 0, 0));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/carrinho.png"))); // NOI18N

        jButton8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton8.setText("Login");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        BTPaginaInicial2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTPaginaInicial2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WFera Prateado Completo.png"))); // NOI18N
        BTPaginaInicial2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTPaginaInicial2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelNavBar3Layout = new javax.swing.GroupLayout(PainelNavBar3);
        PainelNavBar3.setLayout(PainelNavBar3Layout);
        PainelNavBar3Layout.setHorizontalGroup(
            PainelNavBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtHamburguer2)
                .addGap(24, 24, 24)
                .addComponent(TextPesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtPesquisar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addGap(14, 14, 14))
            .addGroup(PainelNavBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PainelNavBar3Layout.createSequentialGroup()
                    .addGap(602, 602, 602)
                    .addComponent(BTPaginaInicial2)
                    .addContainerGap(602, Short.MAX_VALUE)))
        );
        PainelNavBar3Layout.setVerticalGroup(
            PainelNavBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelNavBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PainelNavBar3Layout.createSequentialGroup()
                        .addComponent(TextPesquisa2)
                        .addGap(2, 2, 2))
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtPesquisar2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtHamburguer2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelNavBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNavBar3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTPaginaInicial2)
                    .addContainerGap()))
        );

        jPanel3.add(PainelNavBar3);
        PainelNavBar3.setBounds(0, 0, 1250, 80);

        PainelNavBar1.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BTConjuntos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTConjuntos.setText("Conjuntos");
        BTConjuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTConjuntosActionPerformed(evt);
            }
        });

        BTSeleções.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTSeleções.setText("Seleções");
        BTSeleções.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSeleçõesActionPerformed(evt);
            }
        });

        BTTimes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTTimes.setText("Times");
        BTTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTTimesActionPerformed(evt);
            }
        });

        LabelCategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelCategoria.setText("Categorias");

        BTQuemSomosNos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTQuemSomosNos.setText("Quem somos");
        BTQuemSomosNos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTQuemSomosNosActionPerformed(evt);
            }
        });

        BTduvidas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTduvidas.setText("Duvídas");
        BTduvidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTduvidasActionPerformed(evt);
            }
        });

        BTRastrearPedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTRastrearPedido.setText("Rastrear Pedido");

        BTTermosDeerviço.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTTermosDeerviço.setText("Termos de Serviço");
        BTTermosDeerviço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTTermosDeerviçoActionPerformed(evt);
            }
        });

        LabelInformações.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelInformações.setText("Informações");

        BTConjuntos1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTConjuntos1.setText("Camisetas");
        BTConjuntos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTConjuntos1ActionPerformed(evt);
            }
        });

        BTwpp.setBackground(new java.awt.Color(115, 115, 115));
        BTwpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wsp.png"))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Suporte via WhatsApp:");

        BTInsta.setBackground(new java.awt.Color(115, 115, 115));
        BTInsta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/instagram.png"))); // NOI18N

        LabelInformações1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelInformações1.setText("<html>Fique por dentro das promoções<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp cadastre seu email:");

        BTPaginaInicial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTPaginaInicial.setText("Pagina inicial");
        BTPaginaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTPaginaInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelNavBar1Layout = new javax.swing.GroupLayout(PainelNavBar1);
        PainelNavBar1.setLayout(PainelNavBar1Layout);
        PainelNavBar1Layout.setHorizontalGroup(
            PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTSeleções)
                    .addComponent(BTTimes)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BTConjuntos)
                        .addComponent(LabelCategoria)
                        .addComponent(BTConjuntos1)))
                .addGap(18, 18, 18)
                .addComponent(BTPaginaInicial)
                .addGap(237, 237, 237)
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelInformações1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(BTInsta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTwpp))
                            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2)))
                        .addGap(59, 59, 59)))
                .addGap(220, 220, 220)
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTQuemSomosNos)
                    .addComponent(LabelInformações)
                    .addComponent(BTTermosDeerviço)
                    .addComponent(BTduvidas)
                    .addComponent(BTRastrearPedido))
                .addGap(64, 64, 64))
        );
        PainelNavBar1Layout.setVerticalGroup(
            PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addComponent(LabelInformações1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTInsta)
                            .addComponent(BTwpp)))
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelInformações)
                            .addComponent(LabelCategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTQuemSomosNos)
                            .addComponent(BTConjuntos1)
                            .addComponent(BTPaginaInicial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTTermosDeerviço)
                            .addComponent(BTConjuntos))
                        .addGap(6, 6, 6)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTduvidas)
                            .addComponent(BTSeleções))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTRastrearPedido)
                            .addComponent(BTTimes))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel3.add(PainelNavBar1);
        PainelNavBar1.setBounds(0, 850, 1250, 200);

        TituloQuemSomosNos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TituloQuemSomosNos.setForeground(new java.awt.Color(0, 0, 0));
        TituloQuemSomosNos.setText("Quem somos nós");
        jPanel3.add(TituloQuemSomosNos);
        TituloQuemSomosNos.setBounds(490, 70, 276, 48);

        TextQuemSomosNos.setEditable(false);
        TextQuemSomosNos.setBackground(new java.awt.Color(243, 243, 243));
        TextQuemSomosNos.setColumns(20);
        TextQuemSomosNos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextQuemSomosNos.setForeground(new java.awt.Color(0, 0, 0));
        TextQuemSomosNos.setRows(5);
        TextQuemSomosNos.setText("Termos de Serviço  Termos de uso, política de entrega, troca e devolução de produto. \n  Por favor, leia atentamente este Termo de Uso.  Pois é o documento que regulará a conduta no uso deste site.\n Ao utilizar nossa loja virtual, você estará aderindo a todos os termos e concordando.  Expressamente, com as condições previstas para a sua utilização.\n PRIVACIDADE Garantimos ao usuário deste site o sigilo de todos os dados fornecidos. \n Comprometemo-nos a não fornecer seu e-mail ou dados pessoais para terceiros.\n\n SOBRE O CADASTRO\n O cadastro é necessário para a realização de compras neste site. \n Desde já, fica acordado que os dados pessoais fornecidos no cadastro eletrônico são verdadeiros e próprios, e que você responderá por todos os prejuízos e/ou perdas\n que a falsidade das informações possa implicar.\n\n  CONDUTA NO SITE\n  Ao acessar a nossa loja virtual, você se compromete a não enviar, carregar ou transmitir qualquer material que contenha códigos ou vírus, bem como a não utilizar identidade\n falsa e a não se conduzir de maneira vulgar.  Inadequada ou ofensiva enquanto se utilizar deste serviço, sob pena de remoção permanente\n conteúdo considerado inadequado aos termos ou cancelamento imediato da conta, sem prejuízo de responsabilização pelas eventuais perdas e danos causados.  \n \n ISENÇÃO DE RESPONSABILIDADE\n   Nós e nossos prepostos não se responsabilizarão por qualquer perda ou dano, direto ou indireto, que decorram de: \n\n (a) qualquer imprecisão ou falta de complemento das informações, atrasos, interrupções, erros ou omissões no fornecimento dos dados contidos neste site;\n (b) qualquer decisão ou ação tomada pelo usuário ou terceiros, com base nestas informações. \n\n  DEVOLUÇÃO POR ARREPENDIMENTO OU DESISTÊNCIA \n Na hipótese de desistência antes do recebimento do produto, você deve recusar o produto no ato da entrega e nos comunicar, pois.\n providenciaremos o cancelamento em até 10 (dez) dias corridos após o recebimento do produto em nossa loja novamente. \n Caso você receba o produto e queira desistir da compra, você tem o direito de devolvê-lo e receber a restituição do valor de seu pedido.\n  O prazo para desistência da compra é de 07 (sete) dias corridos a contar do recebimento do produto.\n O pedido só será cancelado caso:\n  O produto estiver sem indícios de uso, acompanhado de nota fiscal, etiquetas do produto oficial não prejudicadas e embalagem fechada.\n  O cancelamento do pedido será realizado após analisarmos o produto. A análise será realizada em até 07 (sete) dias úteis, contados a partir do recebimento do produto \nem nossa loja novamente.  Caso o produto atenda as exigências acima, será feita a restituição do valor pago. \n");
        TextQuemSomosNos.setBorder(null);
        jScrollPane1.setViewportView(TextQuemSomosNos);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(170, 140, 924, 602);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtPesquisar2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void BTConjuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntosActionPerformed
       TelaConjuntos TCN = new TelaConjuntos();
       TCN.setVisible(true);
    }//GEN-LAST:event_BTConjuntosActionPerformed

    private void BTSeleçõesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSeleçõesActionPerformed
         TelaSelecoes TSC = new TelaSelecoes();
        TSC.setVisible(true);
    }//GEN-LAST:event_BTSeleçõesActionPerformed

    private void BTTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTimesActionPerformed
        TelaListaTimes TLT = new TelaListaTimes();
        TLT.setVisible(true);
    }//GEN-LAST:event_BTTimesActionPerformed

    private void BTduvidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTduvidasActionPerformed
        TelaDuvidas TD = new TelaDuvidas();
        TD.setVisible(true);
    }//GEN-LAST:event_BTduvidasActionPerformed

    private void BTTermosDeerviçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTermosDeerviçoActionPerformed
        JOptionPane.showMessageDialog(null, "você ja está nesta pagina");
        TelaTermoseServicos TTS = new TelaTermoseServicos();
        TTS.setVisible(true);
    }//GEN-LAST:event_BTTermosDeerviçoActionPerformed

    private void BTConjuntos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntos1ActionPerformed
        TelaCamisetas TC = new TelaCamisetas();
        TC.setVisible(true);
    }//GEN-LAST:event_BTConjuntos1ActionPerformed

    private void BTQuemSomosNosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTQuemSomosNosActionPerformed
        TelaQuemSomosNos TQSN = new TelaQuemSomosNos();
        TQSN.setVisible(true);
    }//GEN-LAST:event_BTQuemSomosNosActionPerformed

    private void BTPaginaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTPaginaInicialActionPerformed
        PaginaInicial PGI = new PaginaInicial();
        PGI.setVisible(true);
    }//GEN-LAST:event_BTPaginaInicialActionPerformed

    private void BtHamburguer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtHamburguer2ActionPerformed
        TelaMenuHamburguer TMH = new TelaMenuHamburguer ();
       TMH.setVisible(true);
    }//GEN-LAST:event_BtHamburguer2ActionPerformed

    private void BTPaginaInicial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTPaginaInicial2ActionPerformed
        PaginaInicial PGI = new PaginaInicial();
        PGI.setVisible(true);
    }//GEN-LAST:event_BTPaginaInicial2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuemSomosNos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTConjuntos;
    private javax.swing.JButton BTConjuntos1;
    private javax.swing.JButton BTInsta;
    private javax.swing.JButton BTPaginaInicial;
    private javax.swing.JButton BTPaginaInicial2;
    private javax.swing.JButton BTQuemSomosNos;
    private javax.swing.JButton BTRastrearPedido;
    private javax.swing.JButton BTSeleções;
    private javax.swing.JButton BTTermosDeerviço;
    private javax.swing.JButton BTTimes;
    private javax.swing.JButton BTduvidas;
    private javax.swing.JButton BTwpp;
    private javax.swing.JButton BtHamburguer2;
    private javax.swing.JButton BtPesquisar2;
    private javax.swing.JLabel LabelCategoria;
    private javax.swing.JLabel LabelInformações;
    private javax.swing.JLabel LabelInformações1;
    private javax.swing.JPanel PainelNavBar1;
    private javax.swing.JPanel PainelNavBar3;
    private javax.swing.JTextField TextPesquisa2;
    private javax.swing.JTextArea TextQuemSomosNos;
    private javax.swing.JLabel TituloQuemSomosNos;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
