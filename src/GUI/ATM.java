package GUI;

import javax.swing.JOptionPane;
import Sistema.Cuenta;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;

public class ATM extends javax.swing.JFrame {
    boolean opcionDepositar = false;
    boolean opcionRetirar = false;
    String digitoCajero;
    Cuenta cuenta = new Cuenta();

    public ATM() {
        initComponents();
        this.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        this.setLocationRelativeTo(null);
        pnlDatos.setVisible(false);
        pnlOpcion.setVisible(false);
        lblDepositar.setVisible(false);
        lblRetirar.setVisible(false);
        lblSalir.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        parteSuperior = new javax.swing.JPanel();
        pnlCabecera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlMarco = new javax.swing.JPanel();
        pnlMonitor = new javax.swing.JPanel();
        lblDepositar = new javax.swing.JLabel();
        lblRetirar = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        lblNoCuenta = new javax.swing.JLabel();
        txtNoCuenta = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblMoneda = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JLabel();
        pnlOpcion = new javax.swing.JPanel();
        txt_opcion = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JLabel();
        btnDepositar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        parteInferior = new javax.swing.JPanel();
        separador = new javax.swing.JPanel();
        btn_ingresar = new javax.swing.JButton();
        panelNumerico = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cajero automatico");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(631, 535));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        parteSuperior.setBackground(new java.awt.Color(102, 102, 102));
        parteSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCabecera.setBackground(new java.awt.Color(0, 0, 100));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cajero Automatico ");

        javax.swing.GroupLayout pnlCabeceraLayout = new javax.swing.GroupLayout(pnlCabecera);
        pnlCabecera.setLayout(pnlCabeceraLayout);
        pnlCabeceraLayout.setHorizontalGroup(
            pnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabeceraLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlCabeceraLayout.setVerticalGroup(
            pnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );

        parteSuperior.add(pnlCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlMarco.setBackground(new java.awt.Color(0, 0, 0));
        pnlMarco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMarco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMonitor.setBackground(new java.awt.Color(255, 255, 255));
        pnlMonitor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDepositar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblDepositar.setForeground(new java.awt.Color(0, 0, 0));
        lblDepositar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDepositar.setText("Depositar");
        pnlMonitor.add(lblDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        lblRetirar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblRetirar.setForeground(new java.awt.Color(0, 0, 0));
        lblRetirar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRetirar.setText("Retirar");
        lblRetirar.setToolTipText("");
        lblRetirar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlMonitor.add(lblRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 74, -1));

        lblSalir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(0, 0, 0));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalir.setText("Salir");
        pnlMonitor.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 100, 37, -1));

        pnlDatos.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatos.setMinimumSize(new java.awt.Dimension(430, 48));
        pnlDatos.setPreferredSize(new java.awt.Dimension(430, 60));
        pnlDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Usuario: ");
        pnlDatos.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 80, -1));

        txtNombre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setText("Nombre");
        pnlDatos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 8, 300, -1));

        lblNoCuenta.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblNoCuenta.setForeground(new java.awt.Color(0, 0, 0));
        lblNoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNoCuenta.setText("No. Cuenta:");
        lblNoCuenta.setPreferredSize(new java.awt.Dimension(100, 18));
        pnlDatos.add(lblNoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, -1));

        txtNoCuenta.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtNoCuenta.setForeground(new java.awt.Color(0, 0, 0));
        txtNoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNoCuenta.setText("12345678");
        txtNoCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtNoCuenta.setPreferredSize(new java.awt.Dimension(100, 18));
        pnlDatos.add(txtNoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 30, 80, -1));

        lblSaldo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldo.setText("Saldo:");
        lblSaldo.setMaximumSize(new java.awt.Dimension(47, 18));
        lblSaldo.setMinimumSize(new java.awt.Dimension(47, 18));
        lblSaldo.setPreferredSize(new java.awt.Dimension(60, 18));
        pnlDatos.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 50, -1));

        lblMoneda.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMoneda.setForeground(new java.awt.Color(0, 0, 0));
        lblMoneda.setText("Q");
        pnlDatos.add(lblMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 30, 17, -1));

        txtSaldo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtSaldo.setForeground(new java.awt.Color(0, 0, 0));
        txtSaldo.setText("0.00");
        txtSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txtSaldo.setMaximumSize(new java.awt.Dimension(40, 18));
        txtSaldo.setMinimumSize(new java.awt.Dimension(40, 18));
        txtSaldo.setPreferredSize(new java.awt.Dimension(45, 18));
        pnlDatos.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 140, -1));

        pnlMonitor.add(pnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 60));

        pnlOpcion.setBackground(new java.awt.Color(255, 255, 255));
        pnlOpcion.setMinimumSize(new java.awt.Dimension(400, 100));
        pnlOpcion.setPreferredSize(new java.awt.Dimension(400, 100));
        pnlOpcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_opcion.setBackground(new java.awt.Color(0, 0, 0));
        txt_opcion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_opcion.setForeground(new java.awt.Color(0, 0, 0));
        txt_opcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_opcion.setText("Opcion");
        pnlOpcion.add(txt_opcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 400, -1));

        txt_cantidad.setBackground(new java.awt.Color(0, 0, 0));
        txt_cantidad.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_cantidad.setForeground(new java.awt.Color(0, 0, 0));
        txt_cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlOpcion.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 50, 330, 30));

        pnlMonitor.add(pnlOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 25, -1, 100));

        pnlMarco.add(pnlMonitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 150));

        parteSuperior.add(pnlMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 85, 550, 170));

        btnDepositar.setBackground(new java.awt.Color(140, 140, 140));
        btnDepositar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDepositar.setForeground(new java.awt.Color(255, 255, 255));
        btnDepositar.setText("<");
        btnDepositar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDepositar.setEnabled(false);
        btnDepositar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });
        parteSuperior.add(btnDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 40, -1));

        btnRetirar.setBackground(new java.awt.Color(140, 140, 140));
        btnRetirar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setText("<");
        btnRetirar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRetirar.setEnabled(false);
        btnRetirar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        parteSuperior.add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 40, -1));

        btnSalir.setBackground(new java.awt.Color(140, 140, 140));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("<");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setEnabled(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        parteSuperior.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 40, -1));

        jPanel1.add(parteSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 260));

        parteInferior.setBackground(new java.awt.Color(102, 102, 102));

        separador.setBackground(new java.awt.Color(50, 50, 50));
        separador.setPreferredSize(new java.awt.Dimension(15, 5));

        javax.swing.GroupLayout separadorLayout = new javax.swing.GroupLayout(separador);
        separador.setLayout(separadorLayout);
        separadorLayout.setHorizontalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        separadorLayout.setVerticalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        btn_ingresar.setBackground(new java.awt.Color(255, 160, 0));
        btn_ingresar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("Ingresar ");
        btn_ingresar.setAlignmentY(5.0F);
        btn_ingresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ingresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        panelNumerico.setBackground(new java.awt.Color(102, 102, 102));
        panelNumerico.setForeground(new java.awt.Color(255, 255, 255));

        btn_1.setBackground(new java.awt.Color(102, 102, 102));
        btn_1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setText("1");
        btn_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_1.setEnabled(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setBackground(new java.awt.Color(102, 102, 102));
        btn_2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setText("2");
        btn_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_2.setEnabled(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(102, 102, 102));
        btn_3.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setText("3");
        btn_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_3.setEnabled(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_4.setBackground(new java.awt.Color(102, 102, 102));
        btn_4.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setText("4");
        btn_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_4.setEnabled(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_5.setBackground(new java.awt.Color(102, 102, 102));
        btn_5.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setText("5");
        btn_5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_5.setEnabled(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_6.setBackground(new java.awt.Color(102, 102, 102));
        btn_6.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setText("6");
        btn_6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_6.setEnabled(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_7.setBackground(new java.awt.Color(102, 102, 102));
        btn_7.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setText("7");
        btn_7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_7.setEnabled(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setBackground(new java.awt.Color(102, 102, 102));
        btn_8.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setText("8");
        btn_8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_8.setEnabled(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setBackground(new java.awt.Color(102, 102, 102));
        btn_9.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setText("9");
        btn_9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_9.setEnabled(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_0.setBackground(new java.awt.Color(102, 102, 102));
        btn_0.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setText("0");
        btn_0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_0.setEnabled(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(160, 0, 0));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar ");
        btn_cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cancelar.setEnabled(false);
        btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_borrar.setBackground(new java.awt.Color(160, 160, 0));
        btn_borrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar.setText("Borrar");
        btn_borrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_borrar.setEnabled(false);
        btn_borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_aceptar.setBackground(new java.awt.Color(0, 160, 0));
        btn_aceptar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_aceptar.setForeground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_aceptar.setEnabled(false);
        btn_aceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNumericoLayout = new javax.swing.GroupLayout(panelNumerico);
        panelNumerico.setLayout(panelNumericoLayout);
        panelNumericoLayout.setHorizontalGroup(
            panelNumericoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumericoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNumericoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNumericoLayout.createSequentialGroup()
                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelNumericoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelNumericoLayout.createSequentialGroup()
                                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelNumericoLayout.createSequentialGroup()
                        .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNumericoLayout.createSequentialGroup()
                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelNumericoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNumericoLayout.setVerticalGroup(
            panelNumericoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumericoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNumericoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNumericoLayout.createSequentialGroup()
                        .addGroup(panelNumericoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelNumericoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelNumericoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNumericoLayout.createSequentialGroup()
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout parteInferiorLayout = new javax.swing.GroupLayout(parteInferior);
        parteInferior.setLayout(parteInferiorLayout);
        parteInferiorLayout.setHorizontalGroup(
            parteInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parteInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNumerico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        parteInferiorLayout.setVerticalGroup(
            parteInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parteInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parteInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelNumerico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(parteInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 271, 625, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //---- Boton Ingresar
    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // Establecemos contraseña
        String Pass;
        String Pin = "1234";
        do {
        // Aqui se obtiene la contraseña ingresada para comprobar los datos
        Pass = new String(JOptionPane.showInputDialog("Ingrese código PIN:"));
        if (Pass.equals(Pin)) {
            cuenta.setNombre(JOptionPane.showInputDialog("Ingrese su nombre."));
            cuenta.setNumeroCuenta(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de cuenta.")));
            pnlDatos.setVisible(true);
            txtNombre.setText(cuenta.getNombre());
            txtSaldo.setText(actualizarSaldo());
            txtNoCuenta.setText(String.valueOf(cuenta.getNumeroCuenta()));
            btn_ingresar.setEnabled(false);
            habilitarBotones(0);
        } else {
            JOptionPane.showMessageDialog(this, "El codigo PIN ingresado es incorrecto.");
        }
        } while (!Pass.equals(Pin));
    }//GEN-LAST:event_btn_ingresarActionPerformed

    //---- Boton Depositar
    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        pnlDatos.setVisible(false);
        opcionDepositar = true;
        txt_opcion.setText("Ingrese la cantidad a depositar:");
        pnlOpcion.setVisible(true);
        habilitarBotones(1);
    }//GEN-LAST:event_btnDepositarActionPerformed

    //-----Boton Retirar
    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        opcionRetirar = true;

        if (cuenta.getSaldo() == 0) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para hacer un retiro.");
        } else {
            pnlDatos.setVisible(false);
            txt_opcion.setText("Ingrese la cantidad a retirar:");
            pnlOpcion.setVisible(true);
            habilitarBotones(1);
        }
    }//GEN-LAST:event_btnRetirarActionPerformed

    //----Boton Salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios, Puede retirar su tarjeta");
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    //----Boton #1
    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "1";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "1";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn_1ActionPerformed

    //----Boton #2
    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "2";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "2";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn_2ActionPerformed

    //----Boton #3
    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "3";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "3";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn_3ActionPerformed

    //----Boton #4
    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "4";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "4";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn_4ActionPerformed

    //----Boton #5
    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "5";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "5";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn_5ActionPerformed

    //----Boton #6
    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "6";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "6";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn_6ActionPerformed

    //----Boton #7
    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "7";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "7";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn_7ActionPerformed

    //----Boton #8
    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "8";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "8";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn_8ActionPerformed

    //----Boton #9
    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "9";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "9";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn_9ActionPerformed

    //----Boton #0
    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "0";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "0";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn_0ActionPerformed

    //----Boton cancelar
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        if (opcionDepositar == true || opcionRetirar == true) {
            opcionDepositar = false;
            opcionRetirar = false;
            pnlOpcion.setVisible(false);
            txt_cantidad.setText("");
            pnlDatos.setVisible(true);
        }
        habilitarBotones(0);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    //----Boton Borrar
    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        if (!txt_cantidad.getText().equals("")) {
            txt_cantidad.setText(txt_cantidad.getText().substring(0, txt_cantidad.getText().length() - 1));
        }
    }//GEN-LAST:event_btn_borrarActionPerformed

    //----Boton Aceptar
    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        pnlOpcion.setVisible(false);
        if (txt_cantidad.getText().equals("")) {
            opcionDepositar = false;
            opcionRetirar = false;
        }
        if (opcionDepositar == true) {
            opcionDepositar = false;
            //PENDIENTE crear mensajes por error de deposito
            if (cuenta.depositar(Double.parseDouble(String.valueOf(txt_cantidad.getText()))) == false) {
                JOptionPane.showMessageDialog(null, "Ingresa una cantidad mayor a cero para realizar el deposito.");
            }
        } else if (opcionRetirar == true) {
            opcionRetirar = false;
            if (cuenta.retirar(Double.parseDouble(String.valueOf(txt_cantidad.getText()))) == false) {
                JOptionPane.showMessageDialog(null, "No es posible retirar una cantidad mayor que el saldo actual.");
            }
        }
        txtSaldo.setText(actualizarSaldo());
        txt_cantidad.setText("");
        pnlDatos.setVisible(true);
        habilitarBotones(0);
    }//GEN-LAST:event_btn_aceptarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM().setVisible(true);
            }
        });
    }
    
    public String actualizarSaldo(){
        DecimalFormat formato = new DecimalFormat("#,##0.00");
            String saldoFormateado = formato.format(cuenta.getSaldo());
            return saldoFormateado;
    }

    public void habilitarBotones(int n) {
        //Esta variable define si los botones se habilitan o no
        boolean estado = false;
        //Si n es igual a 1 los botones se habilitan
        if (n == 1) {
            estado = true;
        } else if (n == 0) { //si es igual a 0 los botones se deshabilitan
            estado = false;
        }
        //Cuando los botones numericos esten activados desaparecen los botones del menu y viceversa
        //Botones numericos
        btn_1.setEnabled(estado);
        btn_2.setEnabled(estado);
        btn_3.setEnabled(estado);
        btn_4.setEnabled(estado);
        btn_5.setEnabled(estado);
        btn_6.setEnabled(estado);
        btn_7.setEnabled(estado);
        btn_8.setEnabled(estado);
        btn_9.setEnabled(estado);
        btn_0.setEnabled(estado);
        btn_cancelar.setEnabled(estado);
        btn_borrar.setEnabled(estado);
        btn_aceptar.setEnabled(estado);
        //Botones del menu
        btnDepositar.setEnabled(!estado);
        lblDepositar.setVisible(!estado);
        btnRetirar.setEnabled(!estado);
        lblRetirar.setVisible(!estado);
        btnSalir.setEnabled(!estado);
        lblSalir.setVisible(!estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDepositar;
    private javax.swing.JLabel lblMoneda;
    private javax.swing.JLabel lblNoCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRetirar;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel panelNumerico;
    private javax.swing.JPanel parteInferior;
    private javax.swing.JPanel parteSuperior;
    private javax.swing.JPanel pnlCabecera;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlMarco;
    private javax.swing.JPanel pnlMonitor;
    private javax.swing.JPanel pnlOpcion;
    private javax.swing.JPanel separador;
    private javax.swing.JLabel txtNoCuenta;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtSaldo;
    private javax.swing.JLabel txt_cantidad;
    private javax.swing.JLabel txt_opcion;
    // End of variables declaration//GEN-END:variables
}