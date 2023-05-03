package GUI;

import javax.swing.JOptionPane;
import Sistema.Cliente;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;

public class Cajero extends javax.swing.JFrame {
    //Atributos
    private boolean opcionDepositar = false;
    private boolean opcionRetirar = false;
    private String digitoCajero;
    private Cliente cuenta = new Cliente();

    //Constructor
    public Cajero() {
        initComponents();
        this.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        this.setLocationRelativeTo(null);
        pnlDatos.setVisible(false);
        pnlOpcion.setVisible(false);
        lblDepositar.setVisible(false);
        lblRetirar.setVisible(false);
        lblSalir.setVisible(false);
        pnlTarjeta.setVisible(false);
    }
    //Métodos
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
        btnIngresar = new javax.swing.JButton();
        panelNumerico = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        pnlTarjeta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

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
        parteInferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        separador.setBackground(new java.awt.Color(50, 50, 50));
        separador.setPreferredSize(new java.awt.Dimension(15, 5));

        javax.swing.GroupLayout separadorLayout = new javax.swing.GroupLayout(separador);
        separador.setLayout(separadorLayout);
        separadorLayout.setHorizontalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        separadorLayout.setVerticalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        parteInferior.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 12, 10, 230));

        btnIngresar.setBackground(new java.awt.Color(255, 160, 0));
        btnIngresar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setAlignmentY(5.0F);
        btnIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        parteInferior.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 140, 30));

        panelNumerico.setBackground(new java.awt.Color(102, 102, 102));
        panelNumerico.setForeground(new java.awt.Color(255, 255, 255));
        panelNumerico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setBackground(new java.awt.Color(102, 102, 102));
        btn1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.setEnabled(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        panelNumerico.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 99, 44));

        btn2.setBackground(new java.awt.Color(102, 102, 102));
        btn2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.setEnabled(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        panelNumerico.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 6, 99, 44));

        btn3.setBackground(new java.awt.Color(102, 102, 102));
        btn3.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.setEnabled(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        panelNumerico.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 6, 99, 44));

        btn4.setBackground(new java.awt.Color(102, 102, 102));
        btn4.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.setEnabled(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        panelNumerico.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, 99, 44));

        btn5.setBackground(new java.awt.Color(102, 102, 102));
        btn5.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.setEnabled(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        panelNumerico.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 68, 99, 44));

        btn6.setBackground(new java.awt.Color(102, 102, 102));
        btn6.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.setEnabled(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        panelNumerico.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 68, 99, 44));

        btn7.setBackground(new java.awt.Color(102, 102, 102));
        btn7.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.setEnabled(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        panelNumerico.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 130, 99, 44));

        btn8.setBackground(new java.awt.Color(102, 102, 102));
        btn8.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.setEnabled(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        panelNumerico.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 130, 99, 44));

        btn9.setBackground(new java.awt.Color(102, 102, 102));
        btn9.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.setEnabled(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        panelNumerico.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 130, 99, 44));

        btn0.setBackground(new java.awt.Color(102, 102, 102));
        btn0.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn0.setEnabled(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        panelNumerico.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 192, 99, 44));

        btnCancelar.setBackground(new java.awt.Color(160, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar ");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.setEnabled(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelNumerico.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 21, 99, 55));

        btnBorrar.setBackground(new java.awt.Color(160, 160, 0));
        btnBorrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.setEnabled(false);
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        panelNumerico.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 94, 99, 55));

        btnAceptar.setBackground(new java.awt.Color(0, 160, 0));
        btnAceptar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.setEnabled(false);
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        panelNumerico.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 167, 99, 55));

        parteInferior.add(panelNumerico, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 250));

        pnlTarjeta.setBackground(new java.awt.Color(0, 0, 51));
        pnlTarjeta.setPreferredSize(new java.awt.Dimension(110, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("xxx xxx xxx x");
        jLabel2.setToolTipText("");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("x/x");

        jPanel3.setBackground(new java.awt.Color(204, 204, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("|||||||||||");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VISA");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("mm/yy");

        javax.swing.GroupLayout pnlTarjetaLayout = new javax.swing.GroupLayout(pnlTarjeta);
        pnlTarjeta.setLayout(pnlTarjetaLayout);
        pnlTarjetaLayout.setHorizontalGroup(
            pnlTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTarjetaLayout.createSequentialGroup()
                .addGroup(pnlTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTarjetaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTarjetaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))))
                .addGap(15, 15, 15))
        );
        pnlTarjetaLayout.setVerticalGroup(
            pnlTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(pnlTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        parteInferior.add(pnlTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 120, 160));

        jPanel4.setBackground(new java.awt.Color(50, 50, 50));
        jPanel4.setPreferredSize(new java.awt.Dimension(110, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        parteInferior.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 160, 10));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(110, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        parteInferior.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 140, -1));

        jPanel1.add(parteInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 271, 625, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //---- Boton Ingresar
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
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
            btnIngresar.setEnabled(false);
            pnlTarjeta.setVisible(true);
            habilitarBotones(0);
        } else {
            JOptionPane.showMessageDialog(this, "El codigo PIN ingresado es incorrecto.");
        }
        } while (!Pass.equals(Pin));
    }//GEN-LAST:event_btnIngresarActionPerformed

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
        pnlTarjeta.setVisible(false);
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios, Puede retirar su tarjeta");
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    //----Boton #1
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "1";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "1";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    //----Boton #2
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "2";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "2";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn2ActionPerformed

    //----Boton #3
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "3";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "3";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    //----Boton #4
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "4";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "4";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn4ActionPerformed

    //----Boton #5
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "5";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "5";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn5ActionPerformed

    //----Boton #6
    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "6";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "6";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn6ActionPerformed

    //----Boton #7
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "7";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "7";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn7ActionPerformed

    //----Boton #8
    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "8";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "8";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn8ActionPerformed

    //----Boton #9
    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "9";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "9";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn9ActionPerformed

    //----Boton #0
    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            digitoCajero = txt_cantidad.getText() + "0";
            txt_cantidad.setText(digitoCajero);
        } else {
            digitoCajero = txt_cantidad.getText() + "0";
            txt_cantidad.setText(digitoCajero);
        }
    }//GEN-LAST:event_btn0ActionPerformed

    //----Boton cancelar
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (opcionDepositar == true || opcionRetirar == true) {
            opcionDepositar = false;
            opcionRetirar = false;
            pnlOpcion.setVisible(false);
            txt_cantidad.setText("");
            pnlDatos.setVisible(true);
        }
        habilitarBotones(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    //----Boton Borrar
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (!txt_cantidad.getText().equals("")) {
            txt_cantidad.setText(txt_cantidad.getText().substring(0, txt_cantidad.getText().length() - 1));
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    //----Boton Aceptar
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
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
    }//GEN-LAST:event_btnAceptarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cajero().setVisible(true);
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
        btn1.setEnabled(estado);
        btn2.setEnabled(estado);
        btn3.setEnabled(estado);
        btn4.setEnabled(estado);
        btn5.setEnabled(estado);
        btn6.setEnabled(estado);
        btn7.setEnabled(estado);
        btn8.setEnabled(estado);
        btn9.setEnabled(estado);
        btn0.setEnabled(estado);
        btnCancelar.setEnabled(estado);
        btnBorrar.setEnabled(estado);
        btnAceptar.setEnabled(estado);
        //Botones del menu
        btnDepositar.setEnabled(!estado);
        lblDepositar.setVisible(!estado);
        btnRetirar.setEnabled(!estado);
        lblRetirar.setVisible(!estado);
        btnSalir.setEnabled(!estado);
        lblSalir.setVisible(!estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
    private javax.swing.JPanel pnlTarjeta;
    private javax.swing.JPanel separador;
    private javax.swing.JLabel txtNoCuenta;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtSaldo;
    private javax.swing.JLabel txt_cantidad;
    private javax.swing.JLabel txt_opcion;
    // End of variables declaration//GEN-END:variables
}