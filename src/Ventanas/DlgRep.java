/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.ConClie;
import negocio.ConVe;
import objetosNegocios.Cliente;
import objetosNegocios.ProduVenta;
import objetosNegocios.Venta;

/**
 *
 * @author Rayo
 */
public class DlgRep extends javax.swing.JDialog {

    private ConVe controlV;
    private ConClie controlC;

   
    public DlgRep(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        controlV = new ConVe();
        controlC = new ConClie();
        this.dtpFechaInicial.datePicker.setDateToToday();
        this.dtpFechaInicial.timePicker.setTime(LocalTime.MIN);
        this.dtpFechaFinal.datePicker.setDateToToday();
        this.dtpFechaFinal.timePicker.setTime(LocalTime.MAX);
        this.cargarVentas();
        this.cargarClientesComboBox();
        this.setTitle("Reportes ventas");
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDetallesDVenta = new javax.swing.JLabel();
        lblTittle = new javax.swing.JLabel();
        lblFechaFinal = new javax.swing.JLabel();
        lblFechaInicial = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblClienteMostrar = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblMontofinal = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        dtpFechaInicial = new com.github.lgooddatepicker.components.DateTimePicker();
        dtpFechaFinal = new com.github.lgooddatepicker.components.DateTimePicker();
        cbxClientes = new javax.swing.JComboBox<Object>();
        btnBuscar = new javax.swing.JButton();
        panVentas = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        panProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txtID = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtMontoFinal = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblDetallesDVenta.setText("Detalles de la venta");
        lblDetallesDVenta.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        lblTittle.setText("Reporte de ventas");
        lblTittle.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N

        lblFechaFinal.setText("Fecha y hora final:");

        lblFechaInicial.setText("Fecha y hora inicial:");

        lblCliente.setText("Cliente:");

        lblClienteMostrar.setText("Cliente:");

        lblID.setText("ID:");

        lblSubtotal.setText("Subtotal:");

        lblDescuento.setText("Descuento:");

        lblMontofinal.setText("Montofinal:");

        lblProductos.setText("Productos:");
        lblProductos.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        cbxClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ", "Cliente", "Fecha y hora", "Subtotal", "Descuento", "Total"
            }
        ));
        tblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblVentasMousePressed(evt);
            }
        });
        panVentas.setViewportView(tblVentas);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id producto", "Nombre", "Precio actual", "Cantidad", "Monto total"
            }
        ));
        panProductos.setViewportView(tblProductos);

        txtID.setEditable(false);

        txtSubtotal.setEditable(false);

        txtCliente.setEditable(false);

        txtMontoFinal.setEditable(false);

        txtDescuento.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblTittle))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblCliente)
                                .addGap(70, 70, 70)
                                .addComponent(cbxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblFechaInicial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtpFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblFechaFinal)
                                .addGap(18, 18, 18)
                                .addComponent(dtpFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSubtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(lblID)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblClienteMostrar)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblDetallesDVenta)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescuento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(471, 471, 471)
                        .addComponent(lblMontofinal)
                        .addGap(8, 8, 8)
                        .addComponent(txtMontoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(panVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProductos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTittle)
                            .addComponent(lblDetallesDVenta))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente)
                            .addComponent(cbxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaInicial)
                            .addComponent(dtpFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFechaFinal)
                                    .addComponent(dtpFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDescuento)
                                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)))
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClienteMostrar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSubtotal)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMontofinal)
                            .addComponent(txtMontoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblProductos)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(panVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.cargarVentas();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentasMousePressed
        if (evt.getClickCount() >= 1) {
            this.limpiarFormulario();
            this.seleccionarVenta();
        }
    }//GEN-LAST:event_tblVentasMousePressed

    public boolean verificacionDeCampos() {
        if (this.dtpFechaFinal.getDatePicker().getText().equalsIgnoreCase("")
                || this.dtpFechaFinal.getDatePicker().getText().equalsIgnoreCase("")) {
            return false;
        } else {
            return true;
        }
    }

    public void limpiarFormulario() {
        this.txtID.setText("");
        this.txtCliente.setText("");
        this.txtSubtotal.setText("");
        this.txtDescuento.setText("");
        this.txtMontoFinal.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        modelo.setRowCount(0);
    }

    private void cargarVentas() {
        List<Venta> ventas = this.controlV.obtenerVentasCliente(Date.from(dtpFechaInicial.getDateTimePermissive().atZone(ZoneId.systemDefault()).toInstant()),
                Date.from(dtpFechaFinal.getDateTimePermissive().atZone(ZoneId.systemDefault()).toInstant()),
                (cbxClientes.getSelectedIndex() == 0) ? null : (Cliente) cbxClientes.getSelectedItem());
        if (ventas != null) {
            DefaultTableModel modelo = (DefaultTableModel) tblVentas.getModel();
            modelo.setRowCount(0);
            for (Venta venta : ventas) {
                modelo.addRow(venta.toArray());
            }
        }
        if (tblVentas.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No se encontraron ventas entre esas fechas ", "Infomación", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void seleccionarVenta() {
        Integer fila = tblVentas.getSelectedRow();
        DefaultTableModel modeloProductos = (DefaultTableModel) tblProductos.getModel();
        DefaultTableModel modeloVentas = (DefaultTableModel) tblVentas.getModel();
        ProduVenta productos = new ProduVenta();

        Long idVenta = (Long) modeloVentas.getValueAt(fila, 0);
        Venta venta;
        venta = controlV.obtenerVentaPorId(idVenta);

        this.txtID.setText(String.valueOf(venta.getId()));
        txtCliente.setText(venta.getCliente().getNombre());
        txtDescuento.setText(String.valueOf(venta.getDescuento()));
        txtMontoFinal.setText(String.valueOf(venta.getMontoFinal()));
        Float subtotal = 0F;
        for (ProduVenta producto : venta.getProductos()) {
            modeloProductos.addRow(producto.toArray());
            subtotal += producto.getMontoTotal();
        }
        txtSubtotal.setText(String.valueOf(subtotal));
    }

    private void cargarClientesComboBox() {
        List<Cliente> clientes = this.controlC.obtenerClientesComboBox();
        if (clientes != null) {
            this.cbxClientes.removeAllItems();
            this.cbxClientes.addItem("Clientes");
            for (Cliente cliente : clientes) {
                this.cbxClientes.addItem(cliente);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<Object> cbxClientes;
    private com.github.lgooddatepicker.components.DateTimePicker dtpFechaFinal;
    private com.github.lgooddatepicker.components.DateTimePicker dtpFechaInicial;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblClienteMostrar;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblDetallesDVenta;
    private javax.swing.JLabel lblFechaFinal;
    private javax.swing.JLabel lblFechaInicial;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMontofinal;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JScrollPane panProductos;
    private javax.swing.JScrollPane panVentas;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMontoFinal;
    private javax.swing.JTextField txtSubtotal;
    // End of variables declaration//GEN-END:variables
}
