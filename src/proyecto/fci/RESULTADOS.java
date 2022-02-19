/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.fci;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author EVOTEC
 */
public class RESULTADOS extends javax.swing.JFrame {
    
    
 
        
      
        
     DefaultTableModel modelo=new DefaultTableModel();
     ArrayList<NODO> lista =new ArrayList<NODO>();
    ArbolBinario arbol = new ArbolBinario();
    public RESULTADOS() {
        initComponents();
      this.setLocationRelativeTo(null);
     try{
     
     //ESTABLESEMOS EL MODELO DE LAS COLUMNAS DE LA TABLA DANDOLE SU NOMBRE
            
            modelo.addColumn("N.ORDEN");  
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("CEDULA");
            modelo.addColumn("SERVICIO");
            modelo.addColumn("CANTIDAD");
            modelo.addColumn("PRE. UNIDAD");
            modelo.addColumn("SUBTOTAL");
            modelo.addColumn("IVA");
            modelo.addColumn("TOTAL");
            modelo.addColumn("PAGO");
            modelo.addColumn("DEUDA");
            modelo.addColumn("CAMBIO");
            modelo.addColumn("FECHA");
this.TABLA1.setModel(modelo);
              }catch(Exception e){
          
              }
              
      
      
      
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnregrear = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLA1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cedula1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        apellido1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pagando = new javax.swing.JTextField();
        cantidad1 = new javax.swing.JComboBox<>();
        REGISTAR = new javax.swing.JButton();
        pelicula = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jpelicula = new javax.swing.JLabel();
        BOTON_BUSCAR = new javax.swing.JButton();
        BUSCAR = new javax.swing.JTextField();
        ELIMINAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setText("DATOS DEL CLIENTE Y SU SERVICIO");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        btnregrear.setBackground(new java.awt.Color(0, 102, 204));
        btnregrear.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnregrear.setForeground(new java.awt.Color(255, 255, 255));
        btnregrear.setText("VACIAR");
        btnregrear.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnregrear.setPreferredSize(new java.awt.Dimension(133, 28));
        btnregrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregrearActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(0, 102, 204));
        btnsalir.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("SALIR");
        btnsalir.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        TABLA1.setAutoCreateRowSorter(true);
        TABLA1.setBackground(new java.awt.Color(204, 255, 255));
        TABLA1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 255)));
        TABLA1.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        TABLA1.setForeground(new java.awt.Color(0, 102, 204));
        TABLA1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N. ORDEN", "NOMBRES", "APELLIDOS", "CEDULA", "SERVICIO", "CANTIDAD", "PRE. UNIDAD", "SUBTOTAL", "IVA ", "TOTAL", "PAGO", "DEUDA", "ESTADO PAGO", "CAMBIO", "FECHA"
            }
        ));
        TABLA1.setRowHeight(25);
        jScrollPane2.setViewportView(TABLA1);
        if (TABLA1.getColumnModel().getColumnCount() > 0) {
            TABLA1.getColumnModel().getColumn(4).setPreferredWidth(120);
            TABLA1.getColumnModel().getColumn(6).setPreferredWidth(110);
            TABLA1.getColumnModel().getColumn(8).setPreferredWidth(80);
            TABLA1.getColumnModel().getColumn(9).setPreferredWidth(100);
            TABLA1.getColumnModel().getColumn(12).setPreferredWidth(100);
        }

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 3, 1, new java.awt.Color(0, 0, 0)));

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Georgia", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ARQUILER DE PELICULAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(387, 387, 387))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 204)));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("NOMBRES:");

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("APELLIDOS:");

        cedula1.setBackground(new java.awt.Color(204, 255, 255));
        cedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula1ActionPerformed(evt);
            }
        });
        cedula1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedula1KeyTyped(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 255));
        jLabel8.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("CEDULA:");

        nombre1.setBackground(new java.awt.Color(204, 255, 255));
        nombre1.setSelectedTextColor(new java.awt.Color(204, 255, 255));
        nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre1KeyTyped(evt);
            }
        });

        apellido1.setBackground(new java.awt.Color(204, 255, 255));
        apellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellido1KeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 0, 255));
        jLabel15.setText("PELICULA:");

        jLabel16.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 0, 255));
        jLabel16.setText("DIAS DE ARQUILER:");

        jLabel17.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 255));
        jLabel17.setText(" INGRESE PAGO:");

        pagando.setBackground(new java.awt.Color(204, 255, 255));
        pagando.setText("0");
        pagando.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pagandoKeyTyped(evt);
            }
        });

        cantidad1.setBackground(new java.awt.Color(204, 255, 255));
        cantidad1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        cantidad1.setMaximumRowCount(100);
        cantidad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        REGISTAR.setBackground(new java.awt.Color(0, 102, 204));
        REGISTAR.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        REGISTAR.setForeground(new java.awt.Color(255, 255, 255));
        REGISTAR.setText("REGISTRAR");
        REGISTAR.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        REGISTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTARActionPerformed(evt);
            }
        });

        pelicula.setBackground(new java.awt.Color(204, 255, 255));
        pelicula.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        pelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "EL_CONJURO_2", "BOG_ESPONJA", "MISION_RESCATE", "EL_EXTRAORDINARIO" }));
        pelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peliculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(apellido1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pelicula, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cedula1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pagando, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(REGISTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(pagando, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(REGISTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel3.setText("REGISTRE SUS DATOS Y SELECCIONE .");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel7.setText("PELICULAS ");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jpelicula.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 102, 255)));

        BOTON_BUSCAR.setBackground(new java.awt.Color(0, 102, 204));
        BOTON_BUSCAR.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        BOTON_BUSCAR.setForeground(new java.awt.Color(255, 255, 255));
        BOTON_BUSCAR.setText("BUSCAR:");
        BOTON_BUSCAR.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        BOTON_BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_BUSCARActionPerformed(evt);
            }
        });

        ELIMINAR.setBackground(new java.awt.Color(0, 102, 204));
        ELIMINAR.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        ELIMINAR.setForeground(new java.awt.Color(255, 255, 255));
        ELIMINAR.setText(":ELIMINAR");
        ELIMINAR.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setText("CEDULA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnregrear, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel3))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(BOTON_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(542, 542, 542)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTON_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregrear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int confirmarmodificar=0;
    private void pagandoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagandoKeyTyped
 //VALIDAMOS PARA QUE NO SE PUEDA ESCRIBIR LETRAS DONDE DEBEMOS INGRESAR UN NUMERO
        char v=evt.getKeyChar();

        if((v<'0' || v >'9')  ) evt.consume();
    }//GEN-LAST:event_pagandoKeyTyped

    private void cedula1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedula1KeyTyped
//VALIDAMOS PARA QUE NO SE PUEDA ESCRIBIR LETRAS DONDE DEBEMOS INGRESAR UN NUMERO
        char v=evt.getKeyChar();

        if(v<'0' || v >'9'   ) evt.consume();
    }//GEN-LAST:event_cedula1KeyTyped

    //ESTAS VARIABLES SON NECESARIO DECLARARLAS FUERA DEL BOTON 
//PARA QUE NO SE VUELVA A MODIFICAR SU VALOR AGREGADO EN EL BOTON 
// EJEMPLO UN ACUMULADOR SE VOLVERIA A COMVERTIR SIEMPRE EN 0

int precio_unidad;
int salir;
int orden1=0;
float cambio1;
String pago;
long subtotal1;
float  TOTAL;
float IVA ;
String Fecha;
String a;
int cantidad2;
int pagando1;
int confirmarquitar;
int confirmarsalida=0;

float deuda1;

    private void REGISTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTARActionPerformed
        try{
//VALIDAMOS PRIMERO QUE SI DONDE INGRESA EL PAGO NO AI NADA LO COMVIERTA EN 0
 if(pagando.getText().isEmpty()) {
 pagando.setText(Integer.toString(0));}
 
            // ORDEN MUESTRA EL NUMERO DE ORDEN Y CADA VES QUE REGISTRA UN NUEVO CLIENTE AUMENTA 1,2,3..
            orden1++;
            
          // (a) TOMA EL SERVICIO QUE SELECCIONAMOS 
            a= pelicula.getSelectedItem().toString();
//LUEGO DE COMPARA SEGUN EL SERVICIO QUE ELIJA SE TOMARA EL PRECIO PARA LOS 
// CALCULOS 
            if(a=="EL_CONJURO_2"){
                precio_unidad = 25;
            }
            if(a=="BOG_ESPONJA"){
                precio_unidad = 30;
            }
            if(a=="MISION_RESCATE"){
                precio_unidad = 35;
            }
            if(a=="EL_EXTRAORDINARIO"){
                precio_unidad = 16;
            }
            

            //TOMA EL VALOR QUE RECIVE LA CANTIDAD
            cantidad2=Integer.parseInt(cantidad1.getSelectedItem().toString());
            //pago TOMA EL ESTADO DE PAGO QUE SELECCIONAMOS
      
            // pagando1 TOMA EL VALOR QUE INGRESAMOS EN EL PAGO
            pagando1=Integer.parseInt(pagando.getText());
            //CALCULA EL VALOR DEL IVA
            float iva1=12;
            iva1=iva1/100;
            IVA=precio_unidad*iva1*cantidad2;
            
//CALCULA EL VALOR DEL PRECIO TOTAL
            TOTAL=IVA+(precio_unidad*cantidad2);
            
//CALCULA EL VALOR DEL SUBTOTAL
            subtotal1=precio_unidad*cantidad2;

            deuda1=TOTAL-pagando1;
if(deuda1<0){
    deuda1=0;
}
            
// VARIABLES QUE TOMAN EL VALOR DE LOS DEMAS DATOS INGRESADOS O SELECCIONADOS
            String nombre =nombre1.getText();
            String apellido=apellido1.getText();
            Fecha=FechaActual();
            String servicio=pelicula.getSelectedItem().toString();
            

//CALCULA EL CAMBIO Y SE CREA UNA CONDICION PARA QUE SI EL CAMBIO ES MENOR A 0 
//MUESTRE CAMBIO 0
            cambio1=pagando1-TOTAL;
            if(pagando1<TOTAL){
                cambio1=0;
            }
    

            //ESTA CONDICION EVALUA SI AI UN PARAMETRO ESTA VACIO (NO INGRESA ALGUN DATO) MUESTRA UN MENSAJE
            //QUE INGRESE TODOS LOS DATOS Y DEPUES LIMPIA TODOS LOS TEXFIEL Y COMBOBOX
            if (nombre1.getText().isEmpty()||apellido1.getText().isEmpty() || servicio=="SELECCIONAR" ||cantidad2<=0){
                JOptionPane.showMessageDialog(null,"INGRESE TODOS LOS DATOS","Información",JOptionPane.ERROR_MESSAGE);
                nombre1.setText("");
                apellido1.setText("");
                cedula1.setText("10");
                
                pagando.setText(Integer.toString(0));
                pelicula.setSelectedItem("SELECCIONAR");
                cantidad1.setSelectedItem("0");}

            else{
                
                ///INSERTAMOS LOS DATOS EN EL ARBOL
                
               
arbol.Añadir(orden1 ,nombre,apellido,Integer.parseInt(cedula1.getText()),a, cantidad2,  precio_unidad,subtotal1,IVA,TOTAL,pagando1,deuda1,cambio1,Fecha);
           


//EN CASO QUE TODOS LOS PARAMETROS SEAN LLENADOS POR EL USUARIO SE LLENARA
                //LLENARA LA TABLA CON LA INFORMACION USANDO ESTE ARREGLO

                String []matriz=new String[16];
                matriz[0]="" +orden1;
                matriz[1]="" +nombre1.getText();
                matriz[2]=" "+apellido1.getText();
                matriz[3]=" " + Integer.parseInt(cedula1.getText());
                matriz[4]="" + pelicula.getSelectedItem().toString();
                matriz[5]="" +cantidad1.getSelectedItem().toString();
                matriz[6]="" +precio_unidad;
                matriz[7]="" +subtotal1;
                matriz[8]="" +IVA;
                matriz[9]="" +TOTAL;
                matriz[10]="" +pagando.getText();
                matriz[11]="" +deuda1;
                matriz[12]="" +cambio1;
                matriz[13]="" +Fecha;
                modelo.addRow(matriz);
                //CREAMOS UN OBJETO CON TODOS LOS DATOS CREADOS EN LA CLASE (NODO)
                // Y LO AÑADIMOS A UNA LISTA PARA USARLA PARA CREAR ARCHIVOS
              NODO usuario= new NODO( orden1 ,nombre,apellido,Integer.parseInt(cedula1.getText()),a ,cantidad2,  precio_unidad,subtotal1,IVA,TOTAL,pagando1,deuda1,cambio1,Fecha);
              lista.add(usuario);

            //ESTE METODO GUARDA TODOS LOS DATOS EN UN ARCHIVO DE TEXTO LLAMADO DATOS_ARQUILER.txt EN ORDEN
              
            
             FileWriter flwrite=null;

               flwrite=new FileWriter("C:/Users/EVOTEC/Documents/DATOS_ARQUILER_SIMPLES.txt", true);
               
                try(BufferedWriter writer = new BufferedWriter(flwrite))
                {
             //AQUI USAMOS LA LISTA PARA TOMAR LOS DATOS DE ELLA Y CREAR EL ARCHIVO CON TODOS LOS DATOS
                   
                   NODO DATOS = new NODO( orden1 ,nombre,apellido,Integer.parseInt(cedula1.getText()),a ,cantidad2,  precio_unidad,subtotal1,IVA,TOTAL,pagando1,deuda1,cambio1,Fecha);
            
                  writer.write("ORDEN:"+DATOS.getOrden()+"   "+" NOMBRE:"+DATOS.getNombre()+"   "+"APELLIDO:"+DATOS.getApellido()+" "+ " CEDULA:"+DATOS.getCedula()+"    "+"SERVICIO:"+DATOS.getServicio()+"  "+
                            "CANTIDAD:"+DATOS.getCantidad()+"   "+"PRECIO UNITARIO:"+DATOS.getPrecio_u()+"   "+"SUBTOTAL:"+DATOS.getSubtotal()+"    "+"IVA:"+DATOS.getIva()+"   "
                            +"TOTAL:"+DATOS.getTotal()+"   "+"PAGO:"+DATOS.getPago()+"    "+DATOS.getDeuda()+"    "+"CAMBIO:"+DATOS.getCambio()+"   "+"FECHA: "+DATOS.getFecha()+" "+"\n\n"+"\n\n"); 

     
     
                    writer.close();
                    flwrite.close();
       
            }}
            
            
            
            
//ESTO LIMPIA TOSO LOS TEXFIEL Y COMBOBOX PARA VOLVER A INGRESAR NUEVOS DATOS
nombre1.setText("");
apellido1.setText("");
cedula1.setText("");
pelicula.setSelectedItem("SELECCIONAR");
pagando.setText(Integer.toString(0));

cantidad1.setSelectedItem("0");

}catch(Exception e){

 }

    }//GEN-LAST:event_REGISTARActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // SE CREA UNA CONDICION QU MUESTRA UN MESAJE SI DESEA REALMENTE SALIR
        //SI LA OPSION ES ACEPTADA CIERRA EL PROGRAMA SI NO QUEDA DENTRO DEL MISMO
        if(confirmarsalida==JOptionPane.showConfirmDialog(null, "Realmente Desea Salir", "Confirmación",
            JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE)){
        System.exit(0);//funcion de salida
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnregrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregrearActionPerformed
       // ESTE BOTON PERMITE ELIMINAR TODOS LOS DATOS DE LA TABLA EJECUTANDO NUEVAMENTE LA INTERFAZ
        if(confirmarsalida==JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR TODO", "Confirmación",
            JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE)){
        dispose();

        RESULTADOS RESUL=new RESULTADOS();
        RESUL.setVisible(true);
        }
    }//GEN-LAST:event_btnregrearActionPerformed

    private void nombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre1KeyTyped
    
        char v=evt.getKeyChar();

        if(Character.isDigit(v) ) {
       evt.consume();
    }
          
    }//GEN-LAST:event_nombre1KeyTyped

    private void apellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellido1KeyTyped
  char v=evt.getKeyChar();

        if(Character.isDigit(v) ) {
       evt.consume();}
    }//GEN-LAST:event_apellido1KeyTyped

    private void peliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peliculaActionPerformed
   ///SEGUN LA PELICULA QUE ESCOJA MUESTRA LA PELICULA EN LA IMAGEN
        int imagen = pelicula.getSelectedIndex(); 
        switch (imagen) {
            case 1:
                ImageIcon Elconjuro2= new ImageIcon(this.getClass().getResource("/imagenes/imagen1.jpg"));
                jpelicula.setIcon(Elconjuro2);
                
                
                break;
            case 2:
                ImageIcon bobesponja= new ImageIcon(this.getClass().getResource("/imagenes/imagen2.jpg"));
                jpelicula.setIcon(bobesponja);
               
                break;
            case 3:
                ImageIcon Misionrescate= new ImageIcon(this.getClass().getResource("/imagenes/imagen3.jpg"));
                jpelicula.setIcon(Misionrescate); 
               
                break;
            case 4:
               ImageIcon Elextraordinario= new ImageIcon(this.getClass().getResource("/imagenes/imagen4.jpg"));
                jpelicula.setIcon(Elextraordinario); 
             
                break;
        }           
    }//GEN-LAST:event_peliculaActionPerformed

    private void cedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula1ActionPerformed

    private void BOTON_BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_BUSCARActionPerformed
      //VALIDA SI ESTA VACIO EL CAMPO MUESTRA UN MENSAJE 
         /// SINO LLAMA AL METODO DE BUSCAR Y SE LE PASA EL VALOR QUE SE INGRESA
         //PARA SABER SI EXISTE DENTRO DEL ARBOL Y MUESTRA LOS DATOS DE ESA CEDULA
        if(BUSCAR.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"CAMPO VACIO");
        }
        else{
            int buscar1=Integer.parseInt(BUSCAR.getText());
            arbol.METODO_BUSQUEDA(buscar1);// TODO add your handling code here:
            BUSCAR.setText(null);}
    }//GEN-LAST:event_BOTON_BUSCARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
         //VALIDA SI ESTA VACIO EL CAMPO MUESTRA UN MENSAJE 
         /// SINO LLAMA AL METODO DE ELIMINAR Y SE LE PASA EL VALOR QUE SE INGRESA
         //PARA SABER SI EXISTE DENTRO DEL ARBOL
        
        if(BUSCAR.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"CAMPO VACIO");
        }
        else{
            int eliminar=Integer.parseInt(BUSCAR.getText());
            arbol.Eliminar(eliminar);// TODO add your handling code here:
            BUSCAR.setText(null);
    }   
    }//GEN-LAST:event_ELIMINARActionPerformed

    
    
    
    
    
    public static String FechaActual(){
     Date fechaf=new Date();   
       SimpleDateFormat formatofecha=new    SimpleDateFormat("dd/MM/yyyy");
       return formatofecha.format(fechaf);
    }
 

    
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
            java.util.logging.Logger.getLogger(RESULTADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RESULTADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RESULTADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RESULTADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RESULTADOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_BUSCAR;
    private javax.swing.JTextField BUSCAR;
    private javax.swing.JButton ELIMINAR;
    public javax.swing.JButton REGISTAR;
    public static javax.swing.JTable TABLA1;
    public static javax.swing.JTextField apellido1;
    private javax.swing.JButton btnregrear;
    private javax.swing.JButton btnsalir;
    public static javax.swing.JComboBox<String> cantidad1;
    public static javax.swing.JTextField cedula1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jpelicula;
    public static javax.swing.JTextField nombre1;
    public static javax.swing.JTextField pagando;
    public static javax.swing.JComboBox<String> pelicula;
    // End of variables declaration//GEN-END:variables
}
