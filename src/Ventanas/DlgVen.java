package Ventanas;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.ConClie;
import negocio.ConProd;
import negocio.ConVe;
import objetosNegocios.Cliente;
import objetosNegocios.Producto;
import objetosNegocios.ProduVenta;
import objetosNegocios.Venta;

/**
 *
 * @author Rayo
 */
public class DlgVen extends javax.swing.JDialog {

    private ConProd controlP;
    private ConVe controlV;
    private ConClie controlC;

    
     
    public DlgVen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Ventas");
        controlP = new ConProd();
        controlV = new ConVe();
        controlC = new ConClie();
        this.cargarProductosExistentes();
        this.cargarClientesComboBox();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCliente = new javax.swing.JLabel();
        lblTittle = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblEfectivo = new javax.swing.JLabel();
        lvlCambio = new javax.swing.JLabel();
        cobxClientes = new javax.swing.JComboBox<Object>();
        txtDescuento = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtEfectivo = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRegistrarVenta = new javax.swing.JButton();
        btnCancelarVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductosExistentes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductosSeleccionados = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCancelarProducto = new javax.swing.JButton();
        lblProductoNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblCliente.setText("Cliente:");

        lblTittle.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        lblTittle.setText("Ventas");

        lblDescuento.setText("Descuento:");

        lblSubTotal.setText("Subtotal:");

        lblTotal.setText("Total:");

        lblEfectivo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblEfectivo.setText("Efectivo:");

        lvlCambio.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lvlCambio.setText("Cambio:");

        cobxClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona uno" }));

        txtDescuento.setText("0.0");
        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyTyped(evt);
            }
        });

        txtSubTotal.setEditable(false);

        txtTotal.setEditable(false);

        txtEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyTyped(evt);
            }
        });

        txtCambio.setEditable(false);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegistrarVenta.setText("Registrar venta");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        btnCancelarVenta.setText("Cancelar");
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPane1MousePressed(evt);
            }
        });

        tblProductosExistentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Nombre", "Precio actual", "Stock"
            }
        ));
        tblProductosExistentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProductosExistentesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductosExistentes);

        tblProductosSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id producto", "Nombre", "PrecioActual", "Cantidad", "MontoTotal"
            }
        ));
        jScrollPane2.setViewportView(tblProductosSeleccionados);

        jLabel9.setText("Productos seleccionados:");

        jLabel10.setText("(0.0-1.0)");

        btnCancelarProducto.setText("Cancelar pruducto");
        btnCancelarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProductoActionPerformed(evt);
            }
        });

        lblProductoNombre.setText("Buscar productor por nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblTittle))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCancelarVenta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCliente)
                                    .addComponent(lblSubTotal)
                                    .addComponent(lblDescuento)
                                    .addComponent(lblTotal))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10))
                                            .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 27, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cobxClientes, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                                            .addComponent(txtSubTotal, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEfectivo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lvlCambio)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnRegistrarVenta))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelarProducto)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnBuscar)
                                .addGap(272, 272, 272)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProductoNombre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblProductoNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblTittle)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente)
                            .addComponent(cobxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSubTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescuento)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEfectivo))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(btnCancelarProducto))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lvlCambio))
                        .addGap(34, 34, 34)
                        .addComponent(btnRegistrarVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarVenta)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProductoActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro qué desea eliminar el producto?");
        if (resp == 0) {
            this.eliminarProducto();
            this.actualizarCampos();
            this.cargarProductosExistentes();
        } else {
            JOptionPane.showMessageDialog(null, "Operación Cancelada ", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCancelarProductoActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void txtDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puedes ingresar números", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        Float x = ((txtDescuento.getText().equalsIgnoreCase("") || (txtDescuento.getText().equalsIgnoreCase("."))) ? (0F) : Float.parseFloat(txtDescuento.getText()));
        if (txtDescuento.getText().length() > 4 || x >= 1) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El descuento no puede ser mayor al 100% ni mayor 4 caracteres", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtDescuentoKeyTyped

    private void txtEfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puedes ingresar números", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        if (txtEfectivo.getText().length() > 8) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número máximo de caracteres", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtEfectivoKeyTyped

    private void txtEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyReleased
        this.actualizarCampos();
    }//GEN-LAST:event_txtEfectivoKeyReleased

    private void txtEfectivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyPressed
        this.actualizarCampos();
    }//GEN-LAST:event_txtEfectivoKeyPressed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed

        this.cancelarCompra();
        this.limpiarFormulario();

        this.cargarProductosExistentes();

    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        if (!(this.cobxClientes.getSelectedItem() + "").equalsIgnoreCase("Seleccione uno")) {
            this.registrarVenta();
            this.cargarProductosExistentes();
            this.limpiarFormulario();
            txtEfectivo.setText("");
            txtCambio.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Favor de seleccionar un cliente.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(DlgVen.class.getName()).log(Level.SEVERE, null, ex);
        }
     }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.cargarProductosNombre();
        this.txtBuscar.setText("");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jScrollPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MousePressed
//        if (evt.getClickCount() >= 1) {
//            this.seleccionarProducto();
//        }
    }//GEN-LAST:event_jScrollPane1MousePressed

    private void tblProductosExistentesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosExistentesMousePressed
        try {
            if (evt.getClickCount() >= 1) {
                this.seleccionarProducto();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_tblProductosExistentesMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.cancelarCompra();
    }//GEN-LAST:event_formWindowClosing

    public boolean verificacionDeCampos() {
        if (txtDescuento.getText().equalsIgnoreCase("") || this.txtSubTotal.getText().equalsIgnoreCase("")
                || txtTotal.getText().equalsIgnoreCase("") || (this.cobxClientes.getSelectedItem() + "").equalsIgnoreCase("Seleccione uno")
                || tblProductosSeleccionados.getRowCount() == 0 || Float.parseFloat(txtDescuento.getText()) >= 1) {
            return false;
        } else {
            return true;
        }
    }

    public void limpiarFormulario() {
        txtBuscar.setText("");
        txtDescuento.setText("0.00");
        this.cobxClientes.setSelectedIndex(0);
        txtTotal.setText("");
        txtSubTotal.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tblProductosSeleccionados.getModel();
        modelo.setRowCount(0);
    }

    private void cargarProductosExistentes() {
        int contador = 0;
        List<Producto> productos = this.controlP.obtenerProductos();
        if (productos != null) {
            DefaultTableModel modelo
                    = (DefaultTableModel) tblProductosExistentes.getModel();
            modelo.setRowCount(0);
            for (Producto producto : productos) {
                if (producto.getStock() > 0) {
                    modelo.addRow(producto.toArrayProductosExistentes());
                    contador++;
                }
            }
            if (contador <= 0) {
                JOptionPane.showMessageDialog(null, "No se encontraron productos.", "Información", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }

    private void cargarProductosNombre() {
        int contador = 0;
        List<Producto> productos = this.controlP.obtenerProductosNombre(txtBuscar.getText());
        if (productos != null) {
            DefaultTableModel modelo
                    = (DefaultTableModel) tblProductosExistentes.getModel();
            modelo.setRowCount(0);
            for (Producto producto : productos) {
                if (producto.getStock() > 0) {
                    modelo.addRow(producto.toArrayProductosExistentes());
                    contador++;
                }
            }
            if (contador <= 0) {
                JOptionPane.showMessageDialog(null, "No se encontraron productos.", "Información", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }

    private void registrarVenta() {
        if (this.verificacionDeCampos() == true) {
            Venta venta = new Venta();

            venta.setCliente((Cliente) this.cobxClientes.getSelectedItem());
            venta.setDescuento(Float.parseFloat(txtDescuento.getText()));
            venta.setFecha(new Date());
            venta.setMontoFinal(Float.parseFloat(txtTotal.getText()));

            List<ProduVenta> productosVentas = new ArrayList<>();
            DefaultTableModel modelo = (DefaultTableModel) this.tblProductosSeleccionados.getModel();

            for (int i = 0; i < tblProductosSeleccionados.getRowCount(); i++) {
                ProduVenta productoVenta = new ProduVenta();
                productoVenta.setVenta(venta);
                Long idProducto = (Long) modelo.getValueAt(i, 0);
                Producto producto = controlP.obtenerPorId(idProducto);
                if (producto != null) {
                    productoVenta.setPrecio(producto.getPrecioActual());
                    productoVenta.setCantidad((Integer) modelo.getValueAt(i, 3));
                    productoVenta.setMontoTotal(productoVenta.getCantidad() * productoVenta.getPrecio());
                } else {
                    JOptionPane.showMessageDialog(this, "no se registró la venta.",
                            "Alerta", JOptionPane.WARNING_MESSAGE);
                }

                producto.addVenta(productoVenta);
                venta.agregarProducto(productoVenta);

                this.controlV.guardarVenta(venta);
            }

            JOptionPane.showMessageDialog(null, "Se registro la venta correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se permiten: \n- Campos vacios. \n- Una venta sin productos seleccionados. \n- Un descuento igual o mayor al %100.", "Error", JOptionPane.ERROR_MESSAGE);
            this.cancelarCompra();
        }
    }

    private void cargarClientesComboBox() {
        List<Cliente> clientes = this.controlC.obtenerClientesComboBox();
        if (clientes != null) {
            this.cobxClientes.removeAllItems();
            this.cobxClientes.addItem("Seleccione uno");
            for (Cliente cliente : clientes) {
                this.cobxClientes.addItem(cliente);
            }
        }
    }

    private void cancelarCompra() {
        Integer fila = tblProductosExistentes.getSelectedRow();
        DefaultTableModel modeloSeleccionados = (DefaultTableModel) tblProductosSeleccionados.getModel();
        for (int i = 0; i < modeloSeleccionados.getRowCount(); i++) {
            Long idProducto = (Long) modeloSeleccionados.getValueAt(i, 0);
            Producto producto = this.controlP.obtenerPorId(idProducto);
            Integer cantidad = (Integer) modeloSeleccionados.getValueAt(i, 3);
            producto.setStock((producto.getStock() + cantidad));
            this.controlP.actualizarStock(producto);
        }
    }

    private void actualizarStock(Integer fila) {
        DefaultTableModel modeloSeleccionados = (DefaultTableModel) tblProductosSeleccionados.getModel();
        DefaultTableModel modeloExistentes = (DefaultTableModel) tblProductosExistentes.getModel();
        ProduVenta productos = new ProduVenta();
        Long idProducto = (Long) modeloExistentes.getValueAt(fila, 0);
        Producto producto = this.controlP.obtenerPorId(idProducto);
        producto.setStock(producto.getStock() - 1);
        this.controlP.actualizarStock(producto);
        this.cargarProductosExistentes();
    }

    private void seleccionarProducto() {
        Integer fila = tblProductosExistentes.getSelectedRow();
        DefaultTableModel modeloSeleccionados = (DefaultTableModel) tblProductosSeleccionados.getModel();
        DefaultTableModel modeloExistentes = (DefaultTableModel) tblProductosExistentes.getModel();
        ProduVenta productos = new ProduVenta();
        Long idProducto = (Long) modeloExistentes.getValueAt(fila, 0);
        this.actualizarStock(fila);
        Producto producto;

        producto = controlP.obtenerPorId(idProducto);
        for (int i = 0; i < modeloSeleccionados.getRowCount(); i++) {
            if (idProducto == (Long) modeloSeleccionados.getValueAt(i, 0)) {
                Integer cantidad = (Integer) modeloSeleccionados.getValueAt(i, 3) + 1;
                producto.setStock(producto.getStock() - 1);
                Float montoTotal = producto.getPrecioActual() * cantidad;
                modeloSeleccionados.setValueAt(cantidad, i, 3);
                modeloSeleccionados.setValueAt(montoTotal, i, 4);
                this.actualizarCampos();
                return;
            }

        }
        this.cargarProductosExistentes();
        productos.setProducto(producto);
        productos.setPrecio(producto.getPrecioActual());
        productos.setCantidad(1);
        productos.setMontoTotal(productos.getPrecio() * productos.getCantidad());
        modeloSeleccionados.addRow(productos.toArray());
        this.actualizarCampos();
    }

    private void eliminarProducto() {
        Integer fila = tblProductosSeleccionados.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un PRODUCTO",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modeloSeleccionados = (DefaultTableModel) tblProductosSeleccionados.getModel();
            Long idProducto = (Long) modeloSeleccionados.getValueAt(fila, 0);
            Producto producto = this.controlP.obtenerPorId(idProducto);
            producto.setStock(producto.getStock() + (Integer) modeloSeleccionados.getValueAt(fila, 3));
            this.controlP.actualizarStock(producto);
            modeloSeleccionados.removeRow(fila);
        }
    }

    private void actualizarCampos() {
        DefaultTableModel modeloSeleccionados = (DefaultTableModel) tblProductosSeleccionados.getModel();
        Float subtotal = 0F;
        Float total = 0F;
        for (int i = 0; i < modeloSeleccionados.getRowCount(); i++) {
            subtotal += (Float) modeloSeleccionados.getValueAt(i, 4);
        }

        total = subtotal - subtotal * ((txtDescuento.getText().equalsIgnoreCase("") || (txtDescuento.getText().equalsIgnoreCase("."))) ? (0F) : (Float.valueOf(txtDescuento.getText())));;

        txtSubTotal.setText(String.valueOf(subtotal));
        txtTotal.setText(String.valueOf(total));
        if (!txtEfectivo.getText().equalsIgnoreCase("")) {
            Float efectivo = Float.parseFloat(txtEfectivo.getText());
            this.txtCambio.setText(String.valueOf(efectivo - total));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarProducto;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JComboBox<Object> cobxClientes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblEfectivo;
    private javax.swing.JLabel lblProductoNombre;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lvlCambio;
    private javax.swing.JTable tblProductosExistentes;
    private javax.swing.JTable tblProductosSeleccionados;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
