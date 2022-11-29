package Codes;
import javax.swing.JOptionPane;
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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;

public class InterfaceComanda extends javax.swing.JFrame {

    public InterfaceComanda() {
        initComponents();
    }
Date data = new Date();
SimpleDateFormat format = new  SimpleDateFormat("DD/MM/YYYY");
double entrada1,entrada2,entrada3; 
double bebida1,bebida2,bebida3;
 double pratoprincipal1,pratoprincipal2,pratoprincipal3,pratoprincipal4,pratoprincipal5,pratoprincipal6;
 double sobremesa,sobremesa1,sobremesa2,sobremesa3;
 double calculoentrada,calculoentrada1,calculoentrada2,calculoentrada3;
 double calculobebida,calculobebida1,calculobebida2,calculobebida3;        
 double calculopratoprincipal,calculopratoprincipal1,calculopratoprincipal2,calculopratoprincipal3,calculopratoprincipal4,calculopratoprincipal5,calculopratoprincipal6;
 double calculosobremesa,calculosobremesa1,calculosobremesa2,calculosobremesa3;
 double calculofinal; 
 String b,e,p,s;
 MetodoPagamento M = new MetodoPagamento();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelScroll = new javax.swing.JScrollPane();
        PainelBackground = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        LabelTituloEntrada = new javax.swing.JLabel();
        LabelEntrada1 = new javax.swing.JLabel();
        LabelEntrada2 = new javax.swing.JLabel();
        LabelEntrada3 = new javax.swing.JLabel();
        LabelTituloBebida = new javax.swing.JLabel();
        LabelBebida1 = new javax.swing.JLabel();
        LabelBebida2 = new javax.swing.JLabel();
        LabelBebida3 = new javax.swing.JLabel();
        ButtonPF = new javax.swing.JTextField();
        ButtonPI = new javax.swing.JTextField();
        ButtonPA = new javax.swing.JTextField();
        ButtonBebida1 = new javax.swing.JTextField();
        ButtonBebida2 = new javax.swing.JTextField();
        ButtonBebida3 = new javax.swing.JTextField();
        LabelTituloBebida1 = new javax.swing.JLabel();
        LabelPratoPrincipal1 = new javax.swing.JLabel();
        LabelPratoPrincipal2 = new javax.swing.JLabel();
        LabelPratoPrincipal3 = new javax.swing.JLabel();
        ButtonPP1 = new javax.swing.JTextField();
        ButtonPP2 = new javax.swing.JTextField();
        ButtonPP3 = new javax.swing.JTextField();
        LabelPratoPrincipal4 = new javax.swing.JLabel();
        LabelPratoPrincipal5 = new javax.swing.JLabel();
        LabelPratoPrincipal6 = new javax.swing.JLabel();
        ButtonPP4 = new javax.swing.JTextField();
        ButtonPP5 = new javax.swing.JTextField();
        ButtonPP6 = new javax.swing.JTextField();
        LabelTituloBebida2 = new javax.swing.JLabel();
        LabelSobremesa1 = new javax.swing.JLabel();
        ButtonSobremesa1 = new javax.swing.JTextField();
        LabelSobremesa2 = new javax.swing.JLabel();
        ButtonSobremesa2 = new javax.swing.JTextField();
        LabelSobremesa3 = new javax.swing.JLabel();
        ButtonSobremesa3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ButtonCalcular = new javax.swing.JButton();
        LabelTituloBebida3 = new javax.swing.JLabel();
        CampoResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        PainelBackground.setBackground(new java.awt.Color(255, 255, 255));

        LabelTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 0, 51));
        LabelTitulo.setText("RESTAURANTE");

        LabelTituloEntrada.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LabelTituloEntrada.setForeground(new java.awt.Color(0, 51, 255));
        LabelTituloEntrada.setText("Entradas:");

        LabelEntrada1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelEntrada1.setText("Pão franês 6 - UN - R$ 15,90");
        LabelEntrada1.setToolTipText("");

        LabelEntrada2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelEntrada2.setText("Pão integral  6 - UN 17,90");
        LabelEntrada2.setToolTipText("");

        LabelEntrada3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelEntrada3.setText("Pão australiano 6 - UN 21,90");
        LabelEntrada3.setToolTipText("");

        LabelTituloBebida.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LabelTituloBebida.setForeground(new java.awt.Color(0, 51, 255));
        LabelTituloBebida.setText("Bebidas:");

        LabelBebida1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelBebida1.setText("Água com gás 1 -UN 3,50");
        LabelBebida1.setToolTipText("");

        LabelBebida2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelBebida2.setText("Coca-cola 350ML 1 -UN 6,50");
        LabelBebida2.setToolTipText("");

        LabelBebida3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelBebida3.setText("Fanta Laranja 1 -UN 6,00");
        LabelBebida3.setToolTipText("");

        LabelTituloBebida1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LabelTituloBebida1.setForeground(new java.awt.Color(0, 51, 255));
        LabelTituloBebida1.setText("Pratos Principais:");

        LabelPratoPrincipal1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelPratoPrincipal1.setText("Alaminuta completa carne 21,90");
        LabelPratoPrincipal1.setToolTipText("");

        LabelPratoPrincipal2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelPratoPrincipal2.setText("Alaminuta completa Frango 20,00");
        LabelPratoPrincipal2.setToolTipText("");

        LabelPratoPrincipal3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelPratoPrincipal3.setText("Strogonoff de Carne SEM cogumelo 25,50");
        LabelPratoPrincipal3.setToolTipText("");

        LabelPratoPrincipal4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelPratoPrincipal4.setText("Escondidinho de carne seca 22,90");
        LabelPratoPrincipal4.setToolTipText("");

        LabelPratoPrincipal5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelPratoPrincipal5.setText("Escondidinho de Frango 22,90");
        LabelPratoPrincipal5.setToolTipText("");

        LabelPratoPrincipal6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelPratoPrincipal6.setText("Carbonara 57,90");
        LabelPratoPrincipal6.setToolTipText("");

        LabelTituloBebida2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LabelTituloBebida2.setForeground(new java.awt.Color(0, 51, 255));
        LabelTituloBebida2.setText("Sobremesas:");

        LabelSobremesa1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelSobremesa1.setText("Barra de chocolate 6,50");
        LabelSobremesa1.setToolTipText("");

        LabelSobremesa2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelSobremesa2.setText("Barra de chocolate com amendoim 7,50");
        LabelSobremesa2.setToolTipText("");

        LabelSobremesa3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LabelSobremesa3.setText("Peti gateu com sorvete 15,90");
        LabelSobremesa3.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Gerar PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ButtonCalcular.setBackground(new java.awt.Color(0, 51, 204));
        ButtonCalcular.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ButtonCalcular.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCalcular.setText("Calcular");
        ButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalcularActionPerformed(evt);
            }
        });

        LabelTituloBebida3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LabelTituloBebida3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTituloBebida3.setText("Total");

        javax.swing.GroupLayout PainelBackgroundLayout = new javax.swing.GroupLayout(PainelBackground);
        PainelBackground.setLayout(PainelBackgroundLayout);
        PainelBackgroundLayout.setHorizontalGroup(
            PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(LabelTituloBebida)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                .addComponent(LabelEntrada1)
                                .addGap(12, 12, 12)
                                .addComponent(ButtonPF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                .addComponent(LabelEntrada2)
                                .addGap(31, 31, 31)
                                .addComponent(ButtonPI, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelTituloBebida1)
                                    .addComponent(LabelEntrada3))
                                .addGap(10, 10, 10)
                                .addComponent(ButtonPA, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                .addComponent(LabelSobremesa3)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonSobremesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                .addComponent(LabelSobremesa2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonSobremesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                .addComponent(LabelSobremesa1)
                                .addGap(31, 31, 31)
                                .addComponent(ButtonSobremesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(LabelTituloBebida2))
                            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                        .addComponent(LabelPratoPrincipal3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ButtonPP3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                        .addComponent(LabelPratoPrincipal6)
                                        .addGap(30, 30, 30)
                                        .addComponent(ButtonPP6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                        .addComponent(LabelPratoPrincipal5)
                                        .addGap(18, 18, 18)
                                        .addComponent(ButtonPP5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LabelPratoPrincipal2)
                                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                        .addGap(239, 239, 239)
                                        .addComponent(ButtonPP2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                        .addComponent(LabelPratoPrincipal4)
                                        .addGap(18, 18, 18)
                                        .addComponent(ButtonPP4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                        .addComponent(LabelPratoPrincipal1)
                                        .addGap(48, 48, 48)
                                        .addComponent(ButtonPP1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                        .addComponent(LabelBebida3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonBebida3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                        .addComponent(LabelBebida2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonBebida2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                        .addComponent(LabelBebida1)
                                        .addGap(33, 33, 33)
                                        .addComponent(ButtonBebida1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(LabelTituloEntrada))
                            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(LabelTitulo))
                            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(LabelTituloBebida3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonCalcular))
                            .addComponent(CampoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(353, Short.MAX_VALUE))
        );
        PainelBackgroundLayout.setVerticalGroup(
            PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBackgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelTituloEntrada)
                .addGap(20, 20, 20)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LabelEntrada1)))
                .addGap(18, 18, 18)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LabelEntrada2)))
                .addGap(18, 18, 18)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelBackgroundLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LabelEntrada3)))
                .addGap(18, 18, 18)
                .addComponent(LabelTituloBebida)
                .addGap(18, 18, 18)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBebida1)
                    .addComponent(ButtonBebida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBebida2)
                    .addComponent(ButtonBebida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelBebida3)
                    .addComponent(ButtonBebida3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LabelTituloBebida1)
                .addGap(18, 18, 18)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPratoPrincipal1)
                    .addComponent(ButtonPP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPratoPrincipal4)
                    .addComponent(ButtonPP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPratoPrincipal2)
                    .addComponent(ButtonPP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPratoPrincipal5)
                    .addComponent(ButtonPP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPratoPrincipal3)
                    .addComponent(ButtonPP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPratoPrincipal6)
                    .addComponent(ButtonPP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LabelTituloBebida2)
                .addGap(18, 18, 18)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSobremesa1)
                    .addComponent(ButtonSobremesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSobremesa2)
                    .addComponent(ButtonSobremesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSobremesa3)
                    .addComponent(ButtonSobremesa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(LabelTituloBebida3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(PainelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(ButtonCalcular))
                .addContainerGap(299, Short.MAX_VALUE))
        );

        PainelScroll.setViewportView(PainelBackground);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalcularActionPerformed
        try {
       bebida1 = Double.parseDouble(ButtonBebida1.getText());
       bebida2 = Double.parseDouble(ButtonBebida2.getText());
       bebida3 = Double.parseDouble(ButtonBebida3.getText());
       
       calculobebida1 = bebida1 * 3.50;
       calculobebida2 = bebida2 * 6.50;
       calculobebida3 = bebida3 *6.00;
       calculobebida = calculobebida1 + calculobebida2 + calculobebida3;
        } catch(NumberFormatException e){ 
            bebida1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade de bebida1"));
            bebida2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade de bebida2"));
            bebida3 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade de bebida3"));
        }    
       try {
       entrada1 = Double.parseDouble(ButtonPF.getText());
       entrada2 = Double.parseDouble(ButtonPI.getText());
       entrada3 = Double.parseDouble(ButtonPA.getText());
       
       calculoentrada1 = entrada1 * 15.90;
       calculoentrada2 = entrada2 * 17.90;
       calculoentrada3 = entrada3 * 21.90;
       calculoentrada = calculoentrada1 + calculoentrada2 + calculoentrada3;
        } catch(NumberFormatException e){ 
            entrada1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade de entrada1"));
            entrada2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade de entrada2"));
            entrada3 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade de entrada3"));
        }    
        try {
       pratoprincipal1 = Double.parseDouble(ButtonPP1.getText());
       pratoprincipal2 = Double.parseDouble(ButtonPP2.getText());
       pratoprincipal3 = Double.parseDouble(ButtonPP3.getText());
       pratoprincipal4 = Double.parseDouble(ButtonPP4.getText());
       pratoprincipal5 = Double.parseDouble(ButtonPP5.getText());
       pratoprincipal6 = Double.parseDouble(ButtonPP6.getText());    
       
            calculopratoprincipal1 = pratoprincipal1 * 21.90;
            calculopratoprincipal2 = pratoprincipal2 * 20.00;
            calculopratoprincipal3 = pratoprincipal3 * 25.50;
            calculopratoprincipal4 = pratoprincipal4 * 22.90;
            calculopratoprincipal5 = pratoprincipal5 * 22.90;
            calculopratoprincipal6 = pratoprincipal6 * 57.90;
            calculopratoprincipal = calculopratoprincipal1 + calculopratoprincipal2 + calculopratoprincipal3 + calculopratoprincipal4 + calculopratoprincipal5 + calculopratoprincipal6;                                    
        } catch(NumberFormatException e){ 
            pratoprincipal1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade de pratoprincipal1"));
            pratoprincipal2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade de pratoprincipal2"));
            pratoprincipal3 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade de pratoprincipal3"));
            pratoprincipal4 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade de pratoprincipal4"));
            pratoprincipal5 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade de pratoprincipal5"));
            pratoprincipal6 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade de pratoprincipal6"));
        }
      try {
       sobremesa1 = Double.parseDouble(ButtonSobremesa1.getText());
       sobremesa2 = Double.parseDouble(ButtonSobremesa2.getText());
       sobremesa1 = Double.parseDouble(ButtonSobremesa3.getText());
       
       calculosobremesa1 = sobremesa1 * 6.50;
       calculosobremesa2 = sobremesa2 * 7.50;
       calculosobremesa3 = sobremesa3 * 15.90;
       calculosobremesa = calculosobremesa1 + calculosobremesa2 + calculosobremesa3;
        } catch(NumberFormatException e){ 
            sobremesa1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade da barra de chocolate"));
            sobremesa2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade da barra de chocolate com amendoim"));
            sobremesa1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite novamente a quantidade do Petigateu com sorvete"));
        }    
  
       calculofinal = calculobebida + calculoentrada + calculopratoprincipal + calculosobremesa;
       CampoResultado.setText(""+calculofinal);
       JOptionPane.showMessageDialog(null, "Seu total foi: R$: "+calculofinal,"comanda", JOptionPane.WARNING_MESSAGE);
       M.MetodoPagamento();
       
      b = Double.toString(calculobebida);
      e = Double.toString(calculoentrada);
      p = Double.toString(calculopratoprincipal);
      s = Double.toString(calculosobremesa);             
    }//GEN-LAST:event_ButtonCalcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           
      Document docPDF = new Document();
        try {
            PdfWriter.getInstance(docPDF, new FileOutputStream("comanda1 PDF.pdf"));
            docPDF.open();
            docPDF.add(new Paragraph(" ==== RESTAURANTE 1DRAKOON1 ==== \n\n", new Font(Font.FontFamily.TIMES_ROMAN,25,Font.BOLD)));
            docPDF.add(new Paragraph("total de bebidas: R$: "+this.b));
            docPDF.add(new Paragraph("total de entradas: R$: "+this.e));
            docPDF.add(new Paragraph("total de Pratos Principais : R$: "+this.p));
            docPDF.add(new Paragraph("total de Sobremesas : R$: "+this.s));
            docPDF.add(new Paragraph("FORMA DE PAGAMENTO"+this.M.formapagamento));
            docPDF.add(new Paragraph("Porto Alegre RS"));
            docPDF.add(new Paragraph("\n\nGerado em: "+this.data));
        } catch (FileNotFoundException erro1) {
            java.util.logging.Logger.getLogger(InterfaceComanda.class.getName()).log(Level.SEVERE, null, erro1);
        } catch (DocumentException ex) {
            java.util.logging.Logger.getLogger(InterfaceComanda.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            docPDF.close();
        }
        try {
            //abrir o pdf
            Desktop.getDesktop().open(new File("comanda1 PDF.pdf"));
        } catch (IOException erro) {
            java.util.logging.Logger.getLogger(InterfaceComanda.class.getName()).log(Level.SEVERE, null, erro);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

//        public void MetodoPagamento (){
//        do {
//        JOptionPane.showInputDialog(null, "Digite a forma de pagamento:"); 
//        if (formapagamento.equals("débito")){
//            JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");
//        }
//        else if (formapagamento.equals("crédito")){ JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");}
//        else if (formapagamento.equals("Pix")){ JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");}
//        else if (formapagamento.equals("Dinheiro")){ JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");}
//        else {JOptionPane.showMessageDialog(null, "Esse método de pagamento não é aceito no restaurante");}
//        }while (formapagamento.equals("crédito") | formapagamento.equals("débito") | formapagamento.equals("pix") | formapagamento.equals("Dinheiro") ); // end do while
//        } // END metodoPagamento
        
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
            java.util.logging.Logger.getLogger(InterfaceComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceComanda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ButtonBebida1;
    private javax.swing.JTextField ButtonBebida2;
    private javax.swing.JTextField ButtonBebida3;
    private javax.swing.JButton ButtonCalcular;
    private javax.swing.JTextField ButtonPA;
    private javax.swing.JTextField ButtonPF;
    private javax.swing.JTextField ButtonPI;
    private javax.swing.JTextField ButtonPP1;
    private javax.swing.JTextField ButtonPP2;
    private javax.swing.JTextField ButtonPP3;
    private javax.swing.JTextField ButtonPP4;
    private javax.swing.JTextField ButtonPP5;
    private javax.swing.JTextField ButtonPP6;
    private javax.swing.JTextField ButtonSobremesa1;
    private javax.swing.JTextField ButtonSobremesa2;
    private javax.swing.JTextField ButtonSobremesa3;
    private javax.swing.JTextField CampoResultado;
    private javax.swing.JLabel LabelBebida1;
    private javax.swing.JLabel LabelBebida2;
    private javax.swing.JLabel LabelBebida3;
    private javax.swing.JLabel LabelEntrada1;
    private javax.swing.JLabel LabelEntrada2;
    private javax.swing.JLabel LabelEntrada3;
    private javax.swing.JLabel LabelPratoPrincipal1;
    private javax.swing.JLabel LabelPratoPrincipal2;
    private javax.swing.JLabel LabelPratoPrincipal3;
    private javax.swing.JLabel LabelPratoPrincipal4;
    private javax.swing.JLabel LabelPratoPrincipal5;
    private javax.swing.JLabel LabelPratoPrincipal6;
    private javax.swing.JLabel LabelSobremesa1;
    private javax.swing.JLabel LabelSobremesa2;
    private javax.swing.JLabel LabelSobremesa3;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelTituloBebida;
    private javax.swing.JLabel LabelTituloBebida1;
    private javax.swing.JLabel LabelTituloBebida2;
    private javax.swing.JLabel LabelTituloBebida3;
    private javax.swing.JLabel LabelTituloEntrada;
    private javax.swing.JPanel PainelBackground;
    private javax.swing.JScrollPane PainelScroll;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
