package Imagen;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Eliana Acuña
 * @author Nicolas Cortes
 * @author Camilo Quevedo
 */

public class api extends javax.swing.JFrame {
    
    Mejora objTransforma=new Mejora();
    Histograma histoGrama = new Histograma();
    BrilloContraste ByC = new BrilloContraste();
    N_esima nsimo = new N_esima();
    
    // Seccion histogramas
    int histoGris[]=new int[256];
    int histoR[]=new int[256];
    int histoG[]=new int[256];
    int histoB[]=new int[256];
    
    // Modificacion de brillo
    int k_RGB, k_R, k_G, k_B;
    
    // Definicion de variables globales
    
    //File archivo;
    BufferedImage imagOrig, imagOut;
    
    // ---------------- Fin ----------------------

    
    
    public api() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        imgOri = new javax.swing.JLabel();
        Abrir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        imgRes = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelH = new javax.swing.JPanel();
        histograma = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        histogGris = new javax.swing.JButton();
        histogB = new javax.swing.JButton();
        histogG = new javax.swing.JButton();
        histogR = new javax.swing.JButton();
        histograma2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        sliderCont = new javax.swing.JSlider();
        LabelContraste = new javax.swing.JLabel();
        btnContraste = new javax.swing.JButton();
        BtnEcualizacion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        menosBrilloB = new javax.swing.JButton();
        masBrilloB = new javax.swing.JButton();
        val_B = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        menosBrilloG = new javax.swing.JButton();
        masBrilloG = new javax.swing.JButton();
        val_G = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        menosBrilloR = new javax.swing.JButton();
        masBrilloR = new javax.swing.JButton();
        val_R = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        menosBrilloRGB = new javax.swing.JButton();
        masBrilloRGB = new javax.swing.JButton();
        val_RGB = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Label_RGB = new javax.swing.JLabel();
        Label_Rojo = new javax.swing.JLabel();
        Label_Verde = new javax.swing.JLabel();
        Label_Azul = new javax.swing.JLabel();
        aplicaBrillo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        sliderPotencia = new javax.swing.JSlider();
        ActionPotencia = new javax.swing.JButton();
        nPotencia = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        sliderRaiz = new javax.swing.JSlider();
        ActionRaiz = new javax.swing.JButton();
        nRaiz = new javax.swing.JLabel();
        GammaPanel1 = new javax.swing.JPanel();
        sliderLog = new javax.swing.JSlider();
        ActionLog = new javax.swing.JButton();
        nLog = new javax.swing.JLabel();
        GammaPanel = new javax.swing.JPanel();
        sliderGamma = new javax.swing.JSlider();
        ActionGamma = new javax.swing.JButton();
        nGamma = new javax.swing.JLabel();
        Restaurar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Imagenes Java");
        setMaximumSize(new java.awt.Dimension(930, 410));
        setMinimumSize(new java.awt.Dimension(930, 410));
        setPreferredSize(new java.awt.Dimension(880, 720));
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(imgOri);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 42, 520, 300);

        Abrir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Abrir.setText("Abrir imagen");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        getContentPane().add(Abrir);
        Abrir.setBounds(320, 10, 120, 25);

        jScrollPane2.setViewportView(imgRes);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 350, 520, 300);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(100, 40));

        panelH.setPreferredSize(new java.awt.Dimension(345, 620));

        histograma.setBackground(new java.awt.Color(255, 255, 255));
        histograma.setBorder(new javax.swing.border.MatteBorder(null));
        histograma.setPreferredSize(new java.awt.Dimension(300, 255));

        javax.swing.GroupLayout histogramaLayout = new javax.swing.GroupLayout(histograma);
        histograma.setLayout(histogramaLayout);
        histogramaLayout.setHorizontalGroup(
            histogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        histogramaLayout.setVerticalGroup(
            histogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setPreferredSize(new java.awt.Dimension(320, 50));

        histogGris.setText("Gris");
        histogGris.setPreferredSize(new java.awt.Dimension(70, 30));
        histogGris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histogGrisActionPerformed(evt);
            }
        });

        histogB.setText("Azul");
        histogB.setPreferredSize(new java.awt.Dimension(70, 30));
        histogB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histogBActionPerformed(evt);
            }
        });

        histogG.setText("Verde");
        histogG.setPreferredSize(new java.awt.Dimension(70, 30));
        histogG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histogGActionPerformed(evt);
            }
        });

        histogR.setText("Rojo");
        histogR.setPreferredSize(new java.awt.Dimension(70, 30));
        histogR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histogRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(histogR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(histogG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(histogB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(histogGris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(histogR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histogG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histogB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histogGris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        histograma2.setBackground(new java.awt.Color(255, 255, 255));
        histograma2.setBorder(new javax.swing.border.MatteBorder(null));
        histograma2.setPreferredSize(new java.awt.Dimension(300, 255));

        javax.swing.GroupLayout histograma2Layout = new javax.swing.GroupLayout(histograma2);
        histograma2.setLayout(histograma2Layout);
        histograma2Layout.setHorizontalGroup(
            histograma2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        histograma2Layout.setVerticalGroup(
            histograma2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelHLayout = new javax.swing.GroupLayout(panelH);
        panelH.setLayout(panelHLayout);
        panelHLayout.setHorizontalGroup(
            panelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(histograma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(histograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHLayout.setVerticalGroup(
            panelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(histograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(histograma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Histograma", panelH);

        jPanel2.setPreferredSize(new java.awt.Dimension(340, 582));

        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel5.setPreferredSize(new java.awt.Dimension(300, 100));

        sliderCont.setMajorTickSpacing(50);
        sliderCont.setMaximum(200);
        sliderCont.setMinorTickSpacing(10);
        sliderCont.setPaintLabels(true);
        sliderCont.setPaintTicks(true);
        sliderCont.setValue(100);
        sliderCont.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderContStateChanged(evt);
            }
        });
        sliderCont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sliderContMouseReleased(evt);
            }
        });

        LabelContraste.setText("Contraste");

        btnContraste.setText("Automático");
        btnContraste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContrasteMouseClicked(evt);
            }
        });

        BtnEcualizacion.setText("Ecualizacion");
        BtnEcualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEcualizacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LabelContraste)
                    .addComponent(sliderCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnContraste, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEcualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelContraste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sliderCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEcualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnContraste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 102));

        jPanel10.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 100));

        menosBrilloB.setText("-");
        menosBrilloB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menosBrilloBMousePressed(evt);
            }
        });

        masBrilloB.setText("+");
        masBrilloB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masBrilloBMouseClicked(evt);
            }
        });

        val_B.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menosBrilloB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(val_B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(masBrilloB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menosBrilloB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masBrilloB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(val_B))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel9.setPreferredSize(new java.awt.Dimension(300, 100));

        menosBrilloG.setText("-");
        menosBrilloG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menosBrilloGMousePressed(evt);
            }
        });

        masBrilloG.setText("+");
        masBrilloG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masBrilloGMouseClicked(evt);
            }
        });

        val_G.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menosBrilloG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(val_G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(masBrilloG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menosBrilloG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masBrilloG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(val_G))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 100));

        menosBrilloR.setText("-");
        menosBrilloR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menosBrilloRMousePressed(evt);
            }
        });

        masBrilloR.setText("+");
        masBrilloR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masBrilloRMouseClicked(evt);
            }
        });

        val_R.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menosBrilloR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(val_R, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(masBrilloR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menosBrilloR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masBrilloR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(val_R))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel8.setPreferredSize(new java.awt.Dimension(300, 100));

        menosBrilloRGB.setText("-");
        menosBrilloRGB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menosBrilloRGBMousePressed(evt);
            }
        });
        menosBrilloRGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosBrilloRGBActionPerformed(evt);
            }
        });

        masBrilloRGB.setText("+");
        masBrilloRGB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masBrilloRGBMouseClicked(evt);
            }
        });
        masBrilloRGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masBrilloRGBActionPerformed(evt);
            }
        });

        val_RGB.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menosBrilloRGB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(val_RGB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(masBrilloRGB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menosBrilloRGB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masBrilloRGB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(val_RGB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Brillo");

        Label_RGB.setText("RGB");

        Label_Rojo.setText("Rojo");

        Label_Verde.setText("Verde");

        Label_Azul.setText("Azul");

        aplicaBrillo.setText("Aplicar brillo");
        aplicaBrillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicaBrilloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_RGB)
                    .addComponent(Label_Rojo)
                    .addComponent(Label_Verde)
                    .addComponent(Label_Azul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(aplicaBrillo)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Label_RGB)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Label_Rojo)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Label_Verde)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aplicaBrillo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Label_Azul)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton1.setText("Negativo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Brillo y contraste", jPanel2);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 140));

        sliderPotencia.setBackground(new java.awt.Color(255, 255, 255));
        sliderPotencia.setMajorTickSpacing(100);
        sliderPotencia.setMinimum(10);
        sliderPotencia.setMinorTickSpacing(10);
        sliderPotencia.setPaintLabels(true);
        sliderPotencia.setPaintTicks(true);
        sliderPotencia.setMaximumSize(new java.awt.Dimension(300, 45));
        sliderPotencia.setMinimumSize(new java.awt.Dimension(30, 45));
        sliderPotencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sliderPotenciaMouseReleased(evt);
            }
        });

        ActionPotencia.setText("Potencia");
        ActionPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPotenciaActionPerformed(evt);
            }
        });

        nPotencia.setText("1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ActionPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sliderPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nPotencia)
                .addGap(18, 18, 18)
                .addComponent(ActionPotencia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setPreferredSize(new java.awt.Dimension(300, 140));

        sliderRaiz.setBackground(new java.awt.Color(255, 255, 255));
        sliderRaiz.setMajorTickSpacing(100);
        sliderRaiz.setMinimum(1);
        sliderRaiz.setMinorTickSpacing(10);
        sliderRaiz.setPaintLabels(true);
        sliderRaiz.setPaintTicks(true);
        sliderRaiz.setMaximumSize(new java.awt.Dimension(300, 45));
        sliderRaiz.setMinimumSize(new java.awt.Dimension(30, 45));
        sliderRaiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sliderRaizMouseReleased(evt);
            }
        });

        ActionRaiz.setText("Raiz");
        ActionRaiz.setActionCommand("Raiz");
        ActionRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionRaizActionPerformed(evt);
            }
        });

        nRaiz.setText("1");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ActionRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sliderRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nRaiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ActionRaiz)
                .addGap(7, 7, 7))
        );

        GammaPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GammaPanel1.setPreferredSize(new java.awt.Dimension(300, 140));

        sliderLog.setBackground(new java.awt.Color(255, 255, 255));
        sliderLog.setMajorTickSpacing(256);
        sliderLog.setMaximum(255);
        sliderLog.setMinorTickSpacing(10);
        sliderLog.setPaintLabels(true);
        sliderLog.setPaintTicks(true);
        sliderLog.setMaximumSize(new java.awt.Dimension(300, 45));
        sliderLog.setMinimumSize(new java.awt.Dimension(30, 45));
        sliderLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sliderLogMouseReleased(evt);
            }
        });

        ActionLog.setText("Logaritmo");
        ActionLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionLogActionPerformed(evt);
            }
        });

        nLog.setText("1");

        javax.swing.GroupLayout GammaPanel1Layout = new javax.swing.GroupLayout(GammaPanel1);
        GammaPanel1.setLayout(GammaPanel1Layout);
        GammaPanel1Layout.setHorizontalGroup(
            GammaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GammaPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(GammaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ActionLog, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nLog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        GammaPanel1Layout.setVerticalGroup(
            GammaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GammaPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sliderLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ActionLog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GammaPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GammaPanel.setPreferredSize(new java.awt.Dimension(300, 140));

        sliderGamma.setBackground(new java.awt.Color(255, 255, 255));
        sliderGamma.setMajorTickSpacing(200);
        sliderGamma.setMaximum(200);
        sliderGamma.setMinimum(1);
        sliderGamma.setMinorTickSpacing(10);
        sliderGamma.setPaintLabels(true);
        sliderGamma.setPaintTicks(true);
        sliderGamma.setMaximumSize(new java.awt.Dimension(300, 45));
        sliderGamma.setMinimumSize(new java.awt.Dimension(30, 45));
        sliderGamma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sliderGammaMouseReleased(evt);
            }
        });

        ActionGamma.setText("Gamma");
        ActionGamma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionGammaActionPerformed(evt);
            }
        });

        nGamma.setText("1");

        javax.swing.GroupLayout GammaPanelLayout = new javax.swing.GroupLayout(GammaPanel);
        GammaPanel.setLayout(GammaPanelLayout);
        GammaPanelLayout.setHorizontalGroup(
            GammaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GammaPanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(GammaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ActionGamma, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderGamma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nGamma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        GammaPanelLayout.setVerticalGroup(
            GammaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GammaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sliderGamma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nGamma)
                .addGap(18, 18, 18)
                .addComponent(ActionGamma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GammaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GammaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GammaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(GammaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("N-sima", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(540, 40, 340, 640);

        Restaurar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Restaurar.setText("Restaurar");
        Restaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaurarActionPerformed(evt);
            }
        });
        getContentPane().add(Restaurar);
        Restaurar.setBounds(40, 10, 120, 25);

        Guardar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar);
        Guardar.setBounds(180, 10, 120, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        
        imagOrig = objTransforma.AbrirImagen();
        imgOri.setIcon(new ImageIcon(imagOrig));
        histoGrama.llenarHistograma(imagOrig);
        
        histoR = histoGrama.getHistoR();
        histoG = histoGrama.getHistoG();
        histoB = histoGrama.getHistoB();
        histoGris = histoGrama.getHistoGris();
        
        imagOut = imagOrig;
        imgRes.setIcon(new ImageIcon(imagOut));
        
        //objTransforma.HistoLine(panelH.getGraphics());
    }//GEN-LAST:event_AbrirActionPerformed

    private void RestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaurarActionPerformed
        imagOut = imagOrig;
        imgRes.setIcon(new ImageIcon(imagOut));
    }//GEN-LAST:event_RestaurarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarActionPerformed

    private void ActionGammaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionGammaActionPerformed
        float n_gamma = Float.valueOf(nGamma.getText());
        nsimo.setImagenActual(imagOrig);
        imagOut = nsimo.Gamma(n_gamma);
        imgRes.setIcon(new ImageIcon(imagOut));
    }//GEN-LAST:event_ActionGammaActionPerformed

    private void sliderGammaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderGammaMouseReleased
        float a=(float)sliderGamma.getValue()/100;
        nGamma.setText(String.valueOf(a));
    }//GEN-LAST:event_sliderGammaMouseReleased

    private void ActionRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionRaizActionPerformed
        float n_raiz = Float.valueOf(nRaiz.getText());
        nsimo.setImagenActual(imagOrig);
        imagOut = nsimo.raiz(n_raiz);
        imgRes.setIcon(new ImageIcon(imagOut));
    }//GEN-LAST:event_ActionRaizActionPerformed

    private void sliderRaizMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderRaizMouseReleased
        float a=(float)sliderRaiz.getValue()/100;
        nRaiz.setText(String.valueOf(a));
    }//GEN-LAST:event_sliderRaizMouseReleased

    private void ActionPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionPotenciaActionPerformed
        float n_potencia = Float.valueOf(nPotencia.getText());
        nsimo.setImagenActual(imagOrig);
        imagOut = nsimo.potencia(n_potencia);
        imgRes.setIcon(new ImageIcon(imagOut));
    }//GEN-LAST:event_ActionPotenciaActionPerformed

    private void sliderPotenciaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderPotenciaMouseReleased
        float a=(float)sliderPotencia.getValue()/10;
        nPotencia.setText(String.valueOf(a));
    }//GEN-LAST:event_sliderPotenciaMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        imagOut = ByC.Negativo(imagOut);
        imgRes.setIcon(new ImageIcon(imagOut));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aplicaBrilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicaBrilloActionPerformed
        imagOut = ByC.Brillo(imagOut, k_RGB, k_R, k_G, k_B);
        imgRes.setIcon(new ImageIcon(imagOut));
    }//GEN-LAST:event_aplicaBrilloActionPerformed

    private void masBrilloRGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masBrilloRGBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masBrilloRGBActionPerformed

    private void masBrilloRGBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masBrilloRGBMouseClicked
        k_RGB = Integer.parseInt(val_RGB.getText());
        k_RGB++;
        val_RGB.setText(String.valueOf(k_RGB));

    }//GEN-LAST:event_masBrilloRGBMouseClicked

    private void menosBrilloRGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosBrilloRGBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menosBrilloRGBActionPerformed

    private void menosBrilloRGBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosBrilloRGBMousePressed
        k_RGB = Integer.parseInt(val_RGB.getText());
        k_RGB--;
        val_RGB.setText(String.valueOf(k_RGB));
    }//GEN-LAST:event_menosBrilloRGBMousePressed

    private void masBrilloRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masBrilloRMouseClicked
        k_R = Integer.parseInt(val_R.getText());
        k_R++;
        val_R.setText(String.valueOf(k_R));
    }//GEN-LAST:event_masBrilloRMouseClicked

    private void menosBrilloRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosBrilloRMousePressed
        k_R = Integer.parseInt(val_R.getText());
        k_R--;
        val_R.setText(String.valueOf(k_R));
    }//GEN-LAST:event_menosBrilloRMousePressed

    private void masBrilloGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masBrilloGMouseClicked
        k_G = Integer.parseInt(val_G.getText());
        k_G++;
        val_G.setText(String.valueOf(k_G));
    }//GEN-LAST:event_masBrilloGMouseClicked

    private void menosBrilloGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosBrilloGMousePressed
        k_G = Integer.parseInt(val_G.getText());
        k_G--;
        val_G.setText(String.valueOf(k_G));
    }//GEN-LAST:event_menosBrilloGMousePressed

    private void masBrilloBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masBrilloBMouseClicked
        k_B = Integer.parseInt(val_B.getText());
        k_B++;
        val_B.setText(String.valueOf(k_B));
    }//GEN-LAST:event_masBrilloBMouseClicked

    private void menosBrilloBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosBrilloBMousePressed
        k_B = Integer.parseInt(val_B.getText());
        k_B--;
        val_B.setText(String.valueOf(k_B));
    }//GEN-LAST:event_menosBrilloBMousePressed

    private void BtnEcualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEcualizacionActionPerformed
        // TODO add your handling code here:
        Ecualizacion ecua = new Ecualizacion();
        ///imagOut = ecua.ecualizacion(imagOut);
        imgRes.setIcon(new ImageIcon(ecua.ecualizacion(imagOut)));
    }//GEN-LAST:event_BtnEcualizacionActionPerformed

    private void btnContrasteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContrasteMouseClicked
        ByC.setImagenActual(imagOut);
        imgRes.setIcon(new ImageIcon(ByC.ContAuto(imagOut)));
        //imgRes.setIcon(new ImageIcon(objTransforma.ContAuto()));
        //objTransforma.HistoLine(panelH.getGraphics());
    }//GEN-LAST:event_btnContrasteMouseClicked

    private void sliderContMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderContMouseReleased
        ByC.setImagenActual(imagOut);
        float a=(float)sliderCont.getValue()/100.0f;
        imgRes.setIcon(new ImageIcon(ByC.Contraste(imagOut, a)));
    }//GEN-LAST:event_sliderContMouseReleased

    private void sliderContStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderContStateChanged
        /*ByC.setImagenActual(imagOut);
        float a=(float)sliderCont.getValue()/100.0f;
        imgRes.setIcon(new ImageIcon(ByC.Contraste(imagOut, a)));*/
        //objTransforma.HistoLine(panelH.getGraphics());
    }//GEN-LAST:event_sliderContStateChanged

    private void histogRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histogRActionPerformed
        // TODO add your handling code here:
        //histograma.repaint();
        histoGrama.llenarHistograma(imagOrig);
        histoGrama.HistoGraphR(histograma.getGraphics());
        
        histoGrama.llenarHistograma(imagOut);
        histoGrama.HistoGraphR(histograma2.getGraphics());
    }//GEN-LAST:event_histogRActionPerformed

    private void histogGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histogGActionPerformed
        // TODO add your handling code here:
        //histograma.repaint();
        histoGrama.llenarHistograma(imagOrig);
        histoGrama.HistoGraphG(histograma.getGraphics());
        
        histoGrama.llenarHistograma(imagOut);
        histoGrama.HistoGraphG(histograma2.getGraphics());
    }//GEN-LAST:event_histogGActionPerformed

    private void histogBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histogBActionPerformed
        // TODO add your handling code here:
        //histograma.repaint();
        histoGrama.llenarHistograma(imagOrig);
        histoGrama.HistoGraphB(histograma.getGraphics());
        
        histoGrama.llenarHistograma(imagOut);
        histoGrama.HistoGraphB(histograma2.getGraphics());
    }//GEN-LAST:event_histogBActionPerformed

    private void histogGrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histogGrisActionPerformed
        // TODO add your handling code here:
        //histograma.repaint();
        histoGrama.llenarHistograma(imagOrig);
        histoGrama.HistoGraph(histograma.getGraphics());
        
        histoGrama.llenarHistograma(imagOut);
        histoGrama.HistoGraph(histograma2.getGraphics());
    }//GEN-LAST:event_histogGrisActionPerformed

    private void sliderLogMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderLogMouseReleased
        float a=(float)sliderLog.getValue();
        nLog.setText(String.valueOf(a));
    }//GEN-LAST:event_sliderLogMouseReleased

    private void ActionLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionLogActionPerformed
        float n_Log = Float.valueOf(nLog.getText());
        nsimo.setImagenActual(imagOrig);
        imagOut = nsimo.Logaritmo(n_Log);
        imgRes.setIcon(new ImageIcon(imagOut));
    }//GEN-LAST:event_ActionLogActionPerformed
    
    /**
     *
     * @param args por defecto
     */
    public static void main(String args[]) {      
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new api().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir;
    private javax.swing.JButton ActionGamma;
    private javax.swing.JButton ActionLog;
    private javax.swing.JButton ActionPotencia;
    private javax.swing.JButton ActionRaiz;
    private javax.swing.JButton BtnEcualizacion;
    private javax.swing.JPanel GammaPanel;
    private javax.swing.JPanel GammaPanel1;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel LabelContraste;
    private javax.swing.JLabel Label_Azul;
    private javax.swing.JLabel Label_RGB;
    private javax.swing.JLabel Label_Rojo;
    private javax.swing.JLabel Label_Verde;
    private javax.swing.JButton Restaurar;
    private javax.swing.JButton aplicaBrillo;
    private javax.swing.JButton btnContraste;
    private javax.swing.JButton histogB;
    private javax.swing.JButton histogG;
    private javax.swing.JButton histogGris;
    private javax.swing.JButton histogR;
    private javax.swing.JPanel histograma;
    private javax.swing.JPanel histograma2;
    private javax.swing.JLabel imgOri;
    private javax.swing.JLabel imgRes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton masBrilloB;
    private javax.swing.JButton masBrilloG;
    private javax.swing.JButton masBrilloR;
    private javax.swing.JButton masBrilloRGB;
    private javax.swing.JButton menosBrilloB;
    private javax.swing.JButton menosBrilloG;
    private javax.swing.JButton menosBrilloR;
    private javax.swing.JButton menosBrilloRGB;
    private javax.swing.JLabel nGamma;
    private javax.swing.JLabel nLog;
    private javax.swing.JLabel nPotencia;
    private javax.swing.JLabel nRaiz;
    private javax.swing.JPanel panelH;
    private javax.swing.JSlider sliderCont;
    private javax.swing.JSlider sliderGamma;
    private javax.swing.JSlider sliderLog;
    private javax.swing.JSlider sliderPotencia;
    private javax.swing.JSlider sliderRaiz;
    private javax.swing.JLabel val_B;
    private javax.swing.JLabel val_G;
    private javax.swing.JLabel val_R;
    private javax.swing.JLabel val_RGB;
    // End of variables declaration//GEN-END:variables
}
