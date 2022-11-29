package Codes;

import java.awt.Toolkit;

public class TelaCamisetas extends javax.swing.JFrame {
    public TelaCamisetas() {
        initComponents();
        //centralizar na tela
        setLocationRelativeTo(null);
        //desmarcar o botão de maximizar
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Images/WFera Texto.Png")));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        LabelInformações1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BTInsta = new javax.swing.JButton();
        BTPaginaInicial = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PainelNavBar = new javax.swing.JPanel();
        BtHamburguer = new javax.swing.JButton();
        BtPesquisar = new javax.swing.JButton();
        TextPesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BTPaginaInicial2 = new javax.swing.JButton();
        PainelNavBar2 = new javax.swing.JPanel();
        BTConjuntos2 = new javax.swing.JButton();
        BTSeleções1 = new javax.swing.JButton();
        BTTimes1 = new javax.swing.JButton();
        LabelCategoria1 = new javax.swing.JLabel();
        BTQuemSomosNos1 = new javax.swing.JButton();
        BTduvidas1 = new javax.swing.JButton();
        BTRastrearPedido1 = new javax.swing.JButton();
        BTTermosDeerviço1 = new javax.swing.JButton();
        LabelInformações2 = new javax.swing.JLabel();
        BTConjuntos3 = new javax.swing.JButton();
        BTwpp1 = new javax.swing.JButton();
        LabelInformações3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BTInsta1 = new javax.swing.JButton();
        BTPaginaInicial1 = new javax.swing.JButton();
        PainelProdutos = new javax.swing.JPanel();
        ImagenCamiseta1 = new javax.swing.JLabel();
        DescCamiseta1 = new javax.swing.JLabel();
        LabelPreçoCamiseta1 = new javax.swing.JLabel();
        ImagenCamiseta2 = new javax.swing.JLabel();
        DescCamiseta2 = new javax.swing.JLabel();
        LabelPreçoCamiseta2 = new javax.swing.JLabel();
        ImagenCamiseta3 = new javax.swing.JLabel();
        DescCamiseta3 = new javax.swing.JLabel();
        LabelPreçoCamiseta3 = new javax.swing.JLabel();
        ImagenCamiseta4 = new javax.swing.JLabel();
        DescCamiseta4 = new javax.swing.JLabel();
        LabelPreçoCamiseta4 = new javax.swing.JLabel();
        BtComprarAgoraCamiseta1 = new javax.swing.JButton();
        BtComprarAgoraCamiseta2 = new javax.swing.JButton();
        BtComprarAgoraCamiseta3 = new javax.swing.JButton();
        BtComprarAgoraCamiseta4 = new javax.swing.JButton();
        ImagenCamiseta5 = new javax.swing.JLabel();
        DescCamiseta5 = new javax.swing.JLabel();
        LabelPreçoCamiseta5 = new javax.swing.JLabel();
        BtComprarAgoraCamiseta5 = new javax.swing.JButton();

        PainelNavBar1.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar1.setPreferredSize(new java.awt.Dimension(1250, 1050));

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

        LabelInformações1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelInformações1.setText("<html>Fique por dentro das promoções<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp cadastre seu email:");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Suporte via WhatsApp:");

        BTInsta.setBackground(new java.awt.Color(115, 115, 115));
        BTInsta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/instagram.png"))); // NOI18N

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
                    .addComponent(LabelCategoria)
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addComponent(BTConjuntos1)
                        .addGap(27, 27, 27)
                        .addComponent(BTPaginaInicial))
                    .addComponent(BTSeleções)
                    .addComponent(BTConjuntos)
                    .addComponent(BTTimes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
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
                .addGap(304, 304, 304)
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
                .addContainerGap(18, Short.MAX_VALUE)
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
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTTermosDeerviço)
                            .addComponent(BTConjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTduvidas)
                            .addComponent(BTSeleções))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTRastrearPedido)
                            .addComponent(BTTimes)))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 1050));

        jPanel1.setBackground(new java.awt.Color(250, 250, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 1050));

        PainelNavBar.setBackground(new java.awt.Color(115, 115, 115));

        BtHamburguer.setBackground(new java.awt.Color(115, 115, 115));
        BtHamburguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuHam.png"))); // NOI18N
        BtHamburguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtHamburguerActionPerformed(evt);
            }
        });

        BtPesquisar.setBackground(new java.awt.Color(115, 115, 115));
        BtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupinha.png"))); // NOI18N
        BtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });

        TextPesquisa.setBackground(new java.awt.Color(232, 232, 232));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/carrinho.png"))); // NOI18N

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        BTPaginaInicial2.setBackground(new java.awt.Color(102, 102, 102));
        BTPaginaInicial2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTPaginaInicial2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/B1.png"))); // NOI18N
        BTPaginaInicial2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTPaginaInicial2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelNavBarLayout = new javax.swing.GroupLayout(PainelNavBar);
        PainelNavBar.setLayout(PainelNavBarLayout);
        PainelNavBarLayout.setHorizontalGroup(
            PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtHamburguer)
                .addGap(24, 24, 24)
                .addComponent(TextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 871, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(14, 14, 14))
            .addGroup(PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PainelNavBarLayout.createSequentialGroup()
                    .addGap(603, 603, 603)
                    .addComponent(BTPaginaInicial2)
                    .addContainerGap(603, Short.MAX_VALUE)))
        );
        PainelNavBarLayout.setVerticalGroup(
            PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBarLayout.createSequentialGroup()
                .addGroup(PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNavBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PainelNavBarLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtHamburguer)
                            .addComponent(BtPesquisar))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PainelNavBarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BTPaginaInicial2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        PainelNavBar2.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar2.setPreferredSize(new java.awt.Dimension(1250, 1050));

        BTConjuntos2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTConjuntos2.setText("Conjuntos");
        BTConjuntos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTConjuntos2ActionPerformed(evt);
            }
        });

        BTSeleções1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTSeleções1.setText("Seleções");
        BTSeleções1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSeleções1ActionPerformed(evt);
            }
        });

        BTTimes1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTTimes1.setText("Times");
        BTTimes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTTimes1ActionPerformed(evt);
            }
        });

        LabelCategoria1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelCategoria1.setText("Categorias");

        BTQuemSomosNos1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTQuemSomosNos1.setText("Quem somos");
        BTQuemSomosNos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTQuemSomosNos1ActionPerformed(evt);
            }
        });

        BTduvidas1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTduvidas1.setText("Duvídas");
        BTduvidas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTduvidas1ActionPerformed(evt);
            }
        });

        BTRastrearPedido1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTRastrearPedido1.setText("Rastrear Pedido");

        BTTermosDeerviço1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTTermosDeerviço1.setText("Termos de Serviço");
        BTTermosDeerviço1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTTermosDeerviço1ActionPerformed(evt);
            }
        });

        LabelInformações2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelInformações2.setText("Informações");

        BTConjuntos3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTConjuntos3.setText("Camisetas");
        BTConjuntos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTConjuntos3ActionPerformed(evt);
            }
        });

        BTwpp1.setBackground(new java.awt.Color(115, 115, 115));
        BTwpp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wsp.png"))); // NOI18N

        LabelInformações3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelInformações3.setText("<html>Fique por dentro das promoções<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp cadastre seu email:");

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Suporte via WhatsApp:");

        BTInsta1.setBackground(new java.awt.Color(115, 115, 115));
        BTInsta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/instagram.png"))); // NOI18N

        BTPaginaInicial1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTPaginaInicial1.setText("Pagina inicial");
        BTPaginaInicial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTPaginaInicial1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelNavBar2Layout = new javax.swing.GroupLayout(PainelNavBar2);
        PainelNavBar2.setLayout(PainelNavBar2Layout);
        PainelNavBar2Layout.setHorizontalGroup(
            PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCategoria1)
                    .addGroup(PainelNavBar2Layout.createSequentialGroup()
                        .addComponent(BTConjuntos3)
                        .addGap(18, 18, 18)
                        .addComponent(BTPaginaInicial1))
                    .addComponent(BTSeleções1)
                    .addComponent(BTConjuntos2)
                    .addComponent(BTTimes1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addGroup(PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelInformações3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelNavBar2Layout.createSequentialGroup()
                        .addGroup(PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelNavBar2Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(BTInsta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTwpp1))
                            .addGroup(PainelNavBar2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3)))
                        .addGap(59, 59, 59)))
                .addGap(304, 304, 304)
                .addGroup(PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTQuemSomosNos1)
                    .addComponent(LabelInformações2)
                    .addComponent(BTTermosDeerviço1)
                    .addComponent(BTduvidas1)
                    .addComponent(BTRastrearPedido1))
                .addGap(64, 64, 64))
        );
        PainelNavBar2Layout.setVerticalGroup(
            PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNavBar2Layout.createSequentialGroup()
                        .addComponent(LabelInformações3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTInsta1)
                            .addComponent(BTwpp1)))
                    .addGroup(PainelNavBar2Layout.createSequentialGroup()
                        .addGroup(PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelInformações2)
                            .addComponent(LabelCategoria1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTQuemSomosNos1)
                            .addComponent(BTConjuntos3)
                            .addComponent(BTPaginaInicial1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTTermosDeerviço1)
                            .addComponent(BTConjuntos2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTduvidas1)
                            .addComponent(BTSeleções1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTRastrearPedido1)
                            .addComponent(BTTimes1))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        PainelProdutos.setBackground(new java.awt.Color(232, 226, 226));

        ImagenCamiseta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta5.jpeg"))); // NOI18N

        DescCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta1.setText("Camiseta Paris Saint Germain - cinza");

        LabelPreçoCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta1.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta1.setText("R$: 199,90");

        ImagenCamiseta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta6.jpeg"))); // NOI18N

        DescCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta2.setText("Camiseta Juventus - preta");

        LabelPreçoCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta2.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta2.setText("R$ 199,90");

        ImagenCamiseta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta4.jpeg"))); // NOI18N

        DescCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta3.setText("Camiseta Barcelona - dourado");

        LabelPreçoCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta3.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta3.setText("R$: 249,90");

        ImagenCamiseta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta8.jpeg"))); // NOI18N

        DescCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta4.setText("Camiseta Nike Olimpia");

        LabelPreçoCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta4.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta4.setText("R$: 249,90");

        BtComprarAgoraCamiseta1.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta1.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta1.setText("Comprar Agora");
        BtComprarAgoraCamiseta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta1ActionPerformed(evt);
            }
        });

        BtComprarAgoraCamiseta2.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta2.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta2.setText("Comprar Agora");
        BtComprarAgoraCamiseta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta2ActionPerformed(evt);
            }
        });

        BtComprarAgoraCamiseta3.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta3.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta3.setText("Comprar Agora");
        BtComprarAgoraCamiseta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta3ActionPerformed(evt);
            }
        });

        BtComprarAgoraCamiseta4.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta4.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta4.setText("Comprar Agora");
        BtComprarAgoraCamiseta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta4ActionPerformed(evt);
            }
        });

        ImagenCamiseta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta7.jpeg"))); // NOI18N

        DescCamiseta5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta5.setText("Conjunto Puma Inverno Vermelho");

        LabelPreçoCamiseta5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta5.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta5.setText("R$ 199,99");

        BtComprarAgoraCamiseta5.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta5.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta5.setText("Comprar Agora");
        BtComprarAgoraCamiseta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelProdutosLayout = new javax.swing.GroupLayout(PainelProdutos);
        PainelProdutos.setLayout(PainelProdutosLayout);
        PainelProdutosLayout.setHorizontalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosLayout.createSequentialGroup()
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ImagenCamiseta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ImagenCamiseta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ImagenCamiseta3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(BtComprarAgoraCamiseta2)
                        .addGap(240, 240, 240)
                        .addComponent(BtComprarAgoraCamiseta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtComprarAgoraCamiseta4)
                        .addGap(81, 81, 81)))
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addComponent(ImagenCamiseta4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProdutosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtComprarAgoraCamiseta3)
                            .addComponent(DescCamiseta4))
                        .addGap(87, 87, 87))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProdutosLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(LabelPreçoCamiseta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelPreçoCamiseta2)
                .addGap(272, 272, 272)
                .addComponent(LabelPreçoCamiseta3)
                .addGap(251, 251, 251)
                .addComponent(LabelPreçoCamiseta4)
                .addGap(129, 129, 129))
            .addGroup(PainelProdutosLayout.createSequentialGroup()
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(DescCamiseta1)
                        .addGap(138, 138, 138)
                        .addComponent(DescCamiseta2)
                        .addGap(191, 191, 191)
                        .addComponent(DescCamiseta3))
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(LabelPreçoCamiseta5))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(BtComprarAgoraCamiseta5))
                            .addComponent(ImagenCamiseta5)
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(DescCamiseta5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelProdutosLayout.setVerticalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addComponent(ImagenCamiseta4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescCamiseta4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelPreçoCamiseta4)
                        .addGap(18, 18, 18)
                        .addComponent(BtComprarAgoraCamiseta3))
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ImagenCamiseta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(ImagenCamiseta3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImagenCamiseta1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DescCamiseta3)
                            .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DescCamiseta2)
                                .addComponent(DescCamiseta1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelPreçoCamiseta3)
                            .addComponent(LabelPreçoCamiseta2)
                            .addComponent(LabelPreçoCamiseta1))
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtComprarAgoraCamiseta1)
                                    .addComponent(BtComprarAgoraCamiseta2)))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BtComprarAgoraCamiseta4)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImagenCamiseta5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DescCamiseta5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPreçoCamiseta5)
                .addGap(18, 18, 18)
                .addComponent(BtComprarAgoraCamiseta5)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PainelNavBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(PainelNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(PainelNavBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

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

    private void BTQuemSomosNosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTQuemSomosNosActionPerformed
        TelaQuemSomosNos TQSN = new TelaQuemSomosNos();
        TQSN.setVisible(true);
    }//GEN-LAST:event_BTQuemSomosNosActionPerformed

    private void BTduvidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTduvidasActionPerformed
        TelaDuvidas TD = new TelaDuvidas();
        TD.setVisible(true);
    }//GEN-LAST:event_BTduvidasActionPerformed

    private void BTTermosDeerviçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTermosDeerviçoActionPerformed
        TelaTermoseServicos TTS = new TelaTermoseServicos();
        TTS.setVisible(true);
    }//GEN-LAST:event_BTTermosDeerviçoActionPerformed

    private void BTConjuntos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntos1ActionPerformed
       TelaCamisetas TC = new TelaCamisetas();
       TC.setVisible(true);
    }//GEN-LAST:event_BTConjuntos1ActionPerformed

    private void BtComprarAgoraCamiseta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta5ActionPerformed
       TelaCarrinhoCamiseta7 TTC7 = new TelaCarrinhoCamiseta7();
      TTC7.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta5ActionPerformed

    private void BtComprarAgoraCamiseta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta4ActionPerformed
       TelaCarrinhoCamiseta4 TTC4 = new TelaCarrinhoCamiseta4();
      TTC4.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta4ActionPerformed

    private void BtComprarAgoraCamiseta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta2ActionPerformed
    TelaCarrinhoCamiseta5 TTC5 = new TelaCarrinhoCamiseta5();
      TTC5.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta2ActionPerformed

    private void BTPaginaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTPaginaInicialActionPerformed
        PaginaInicial PGI = new PaginaInicial();
        PGI.setVisible(true);
    }//GEN-LAST:event_BTPaginaInicialActionPerformed

    private void BtHamburguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtHamburguerActionPerformed
         TelaMenuHamburguer TMH = new TelaMenuHamburguer ();
       TMH.setVisible(true);
    }//GEN-LAST:event_BtHamburguerActionPerformed

    private void BTConjuntos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntos2ActionPerformed
        TelaConjuntos TCN = new TelaConjuntos();
        TCN.setVisible(true);
    }//GEN-LAST:event_BTConjuntos2ActionPerformed

    private void BTSeleções1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSeleções1ActionPerformed
        TelaSelecoes TSC = new TelaSelecoes();
        TSC.setVisible(true);
    }//GEN-LAST:event_BTSeleções1ActionPerformed

    private void BTTimes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTimes1ActionPerformed
        TelaListaTimes TLT = new TelaListaTimes();
        TLT.setVisible(true);
    }//GEN-LAST:event_BTTimes1ActionPerformed

    private void BTQuemSomosNos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTQuemSomosNos1ActionPerformed
        TelaQuemSomosNos TQSN = new TelaQuemSomosNos();
        TQSN.setVisible(true);
    }//GEN-LAST:event_BTQuemSomosNos1ActionPerformed

    private void BTduvidas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTduvidas1ActionPerformed
        TelaDuvidas TD = new TelaDuvidas();
        TD.setVisible(true);
    }//GEN-LAST:event_BTduvidas1ActionPerformed

    private void BTTermosDeerviço1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTermosDeerviço1ActionPerformed
        TelaTermoseServicos TTS = new TelaTermoseServicos();
        TTS.setVisible(true);
    }//GEN-LAST:event_BTTermosDeerviço1ActionPerformed

    private void BTConjuntos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntos3ActionPerformed
        TelaCamisetas TC = new TelaCamisetas();
        TC.setVisible(true);
    }//GEN-LAST:event_BTConjuntos3ActionPerformed

    private void BTPaginaInicial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTPaginaInicial1ActionPerformed
        PaginaInicial PGI = new PaginaInicial();
        PGI.setVisible(true);
    }//GEN-LAST:event_BTPaginaInicial1ActionPerformed

    private void BtComprarAgoraCamiseta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta1ActionPerformed
        TelaCarrinhoCamiseta6 TTC6 = new TelaCarrinhoCamiseta6();
      TTC6.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta1ActionPerformed

    private void BtComprarAgoraCamiseta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta3ActionPerformed
       TelaCarrinhoCamiseta8 TTC8 = new TelaCarrinhoCamiseta8();
      TTC8.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta3ActionPerformed

    private void BTPaginaInicial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTPaginaInicial2ActionPerformed
        PaginaInicial PGI = new PaginaInicial();
        PGI.setVisible(true);
    }//GEN-LAST:event_BTPaginaInicial2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCamisetas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTConjuntos;
    private javax.swing.JButton BTConjuntos1;
    private javax.swing.JButton BTConjuntos2;
    private javax.swing.JButton BTConjuntos3;
    private javax.swing.JButton BTInsta;
    private javax.swing.JButton BTInsta1;
    private javax.swing.JButton BTPaginaInicial;
    private javax.swing.JButton BTPaginaInicial1;
    private javax.swing.JButton BTPaginaInicial2;
    private javax.swing.JButton BTQuemSomosNos;
    private javax.swing.JButton BTQuemSomosNos1;
    private javax.swing.JButton BTRastrearPedido;
    private javax.swing.JButton BTRastrearPedido1;
    private javax.swing.JButton BTSeleções;
    private javax.swing.JButton BTSeleções1;
    private javax.swing.JButton BTTermosDeerviço;
    private javax.swing.JButton BTTermosDeerviço1;
    private javax.swing.JButton BTTimes;
    private javax.swing.JButton BTTimes1;
    private javax.swing.JButton BTduvidas;
    private javax.swing.JButton BTduvidas1;
    private javax.swing.JButton BTwpp;
    private javax.swing.JButton BTwpp1;
    private javax.swing.JButton BtComprarAgoraCamiseta1;
    private javax.swing.JButton BtComprarAgoraCamiseta2;
    private javax.swing.JButton BtComprarAgoraCamiseta3;
    private javax.swing.JButton BtComprarAgoraCamiseta4;
    private javax.swing.JButton BtComprarAgoraCamiseta5;
    private javax.swing.JButton BtHamburguer;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JLabel DescCamiseta1;
    private javax.swing.JLabel DescCamiseta2;
    private javax.swing.JLabel DescCamiseta3;
    private javax.swing.JLabel DescCamiseta4;
    private javax.swing.JLabel DescCamiseta5;
    private javax.swing.JLabel ImagenCamiseta1;
    private javax.swing.JLabel ImagenCamiseta2;
    private javax.swing.JLabel ImagenCamiseta3;
    private javax.swing.JLabel ImagenCamiseta4;
    private javax.swing.JLabel ImagenCamiseta5;
    private javax.swing.JLabel LabelCategoria;
    private javax.swing.JLabel LabelCategoria1;
    private javax.swing.JLabel LabelInformações;
    private javax.swing.JLabel LabelInformações1;
    private javax.swing.JLabel LabelInformações2;
    private javax.swing.JLabel LabelInformações3;
    private javax.swing.JLabel LabelPreçoCamiseta1;
    private javax.swing.JLabel LabelPreçoCamiseta2;
    private javax.swing.JLabel LabelPreçoCamiseta3;
    private javax.swing.JLabel LabelPreçoCamiseta4;
    private javax.swing.JLabel LabelPreçoCamiseta5;
    private javax.swing.JPanel PainelNavBar;
    private javax.swing.JPanel PainelNavBar1;
    private javax.swing.JPanel PainelNavBar2;
    private javax.swing.JPanel PainelProdutos;
    private javax.swing.JTextField TextPesquisa;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
