/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.ConlCate;
import negocio.ConProd;
import negocio.ConProve;
import objetosNegocios.Categ;
import objetosNegocios.Producto;
import objetosNegocios.Prove;

/**
 *
 * @author Rayo
 */
public class DlgProd extends javax.swing.JDialog {

    private ConProd controlProducto;
    private ConProve controlProveedores;
    private ConlCate controlCategorias;

  
    public DlgProd(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Productos");
        this.getContentPane().setBackground(Color.WHITE);
        this.controlProducto = new ConProd();
        this.controlCategorias = new ConlCate();
        this.controlProveedores = new ConProve();
        this.cargarCategoriasComboBox();
        this.cargarProveedoresComboBox();
        this.cargarProductos();
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBuscar = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblTittle = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jcboxProveedores = new javax.swing.JComboBox<Object>();
        jcboxCategorias = new javax.swing.JComboBox<Object>();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblBuscar.setText("ID:");

        lblNombre.setText("Nombre:");

        lblPrecio.setText("Precio:");

        lblStock.setText("Stock:");

        lblProveedor.setText("Proveedor:");

        lblCategoria.setText("Categoria:");

        lblTittle.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        lblTittle.setText("Productos");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });

        txtIdProducto.setEditable(false);
        txtIdProducto.setText("0");
        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Stock", "Categoria", "Proveedor"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(3).setResizable(false);
            tblProductos.getColumnModel().getColumn(5).setResizable(false);
        }

        jcboxProveedores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione uno" }));

        jcboxCategorias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione uno" }));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTittle)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBuscar)
                                .addGap(242, 242, 242)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrecio)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStock)
                                .addGap(18, 18, 18)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcboxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblProveedor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jcboxProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnGuardar)
                        .addGap(44, 44, 44)
                        .addComponent(btnCancelar)
                        .addGap(84, 84, 84)
                        .addComponent(btnEliminar)
                        .addGap(74, 74, 74)
                        .addComponent(btnActualizar)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblTittle)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBuscar)
                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecio)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStock)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoria)
                            .addComponent(jcboxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProveedor)
                            .addComponent(jcboxProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (this.txtNombre.getText().length() >= 45) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número maximo de caracteres es 45", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            this.txtPrecio.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }     
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtPrecio.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
        
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        char validar = evt.getKeyChar();
        
        if (Character.isDigit(validar)) {
            this.txtStock.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        
        if (this.txtStock.getText().length()>=11) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número de caracteres máximo es 11", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtStock.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
        
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtStock.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
        
    }//GEN-LAST:event_txtStockKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.verificacionDeCampos() == true) {
            if (this.txtIdProducto.getText().equalsIgnoreCase("0")) {
                this.guardarProducto();
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "¿Seguro qué desea actualizar el registro?");
                if (resp == 0) {
                    this.actualizarProducto();
                } else {
                    JOptionPane.showMessageDialog(null, "Operación Cancelada ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            this.limpiarFormulario();
            this.bordesCampos();
            this.cargarProductos();
        } else {
            JOptionPane.showMessageDialog(null, "Campos vacios no permitidos", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiarFormulario();
        this.bordesCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.cargarProducto();
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro qué deseas eliminar el registro?");
        if (resp == 0) {
            this.eliminarProducto();
        } else {
            JOptionPane.showMessageDialog(null, "Operación Cancelada ", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        this.limpiarFormulario();
        this.cargarCategoriasComboBox();
        this.cargarProductos();
        this.cargarProveedoresComboBox();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        this.cargarProducto();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.cargarProductosNombre();
        this.txtBuscar.setText("");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed
    private void bordesCampos() {
        this.txtBuscar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtIdProducto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtPrecio.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtStock.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }

    public boolean verificacionDeCampos() {
        if (txtNombre.getText().equalsIgnoreCase("") || txtPrecio.getText().equalsIgnoreCase("") || txtStock.getText().equalsIgnoreCase("")
                || (this.jcboxCategorias.getSelectedItem() + "").equalsIgnoreCase("Seleccione 1") || (jcboxProveedores.getSelectedItem() + "").equalsIgnoreCase("Seleccione 1")) {
            return false;
        } else {
            return true;
        }
    }

    private void cargarProveedoresComboBox() {
        List<Prove> proveedores = controlProveedores.obtenerProveedores();
        if (proveedores != null) {
            jcboxProveedores.removeAllItems();
            jcboxProveedores.addItem("Selecciona uno");
            for (Prove proveedor : proveedores) {
                jcboxProveedores.addItem(proveedor);
            }
        }
    }

    private void cargarCategoriasComboBox() {
        List<Categ> categorias = controlCategorias.obtenerCategorias();
        if (categorias != null) {
            jcboxCategorias.removeAllItems();
            jcboxCategorias.addItem("Selecciona uno");
            for (Categ categoria : categorias) {
                jcboxCategorias.addItem(categoria);
            }
        }
    }

    private void cargarProductos() {
        List<Producto> productos = this.controlProducto.obtenerProductos();
        if (productos != null) {
            DefaultTableModel modelo
                    = (DefaultTableModel) this.tblProductos.getModel();
            modelo.setRowCount(0);
            for (Producto producto : productos) {
                modelo.addRow(producto.toArray());
            }
        }
    }

    private void cargarProductosNombre() {
        int contador = 0;
        List<Producto> productos = this.controlProducto.obtenerProductosNombre(txtBuscar.getText());
        for (Producto producto : productos) {
            contador++;
        }
        if (contador != 0) {
            DefaultTableModel modelo
                    = (DefaultTableModel) this.tblProductos.getModel();
            modelo.setRowCount(0);
            for (Producto producto : productos) {
                modelo.addRow(producto.toArray());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró productos.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void guardarProducto() {
        if (this.verificacionDeCampos() == true) {
            Producto producto = new Producto();
            producto.setNombre(txtNombre.getText());
            producto.setPrecioActual(Float.parseFloat(txtPrecio.getText()));
            producto.setStock(Integer.parseInt(txtStock.getText()));
            producto.setCategoria((Categ) this.jcboxCategorias.getSelectedItem());
            producto.setProveedor((Prove) jcboxProveedores.getSelectedItem());
            this.controlProducto.guardarProducto(producto);
            JOptionPane.showMessageDialog(null, "Se guardo el producto correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "No se perimiten campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void limpiarFormulario() {
        this.txtIdProducto.setText("0");
        txtBuscar.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        this.jcboxCategorias.setSelectedIndex(0);
        jcboxProveedores.setSelectedIndex(0);
    }

    private void eliminarProducto() {
        int fila = this.tblProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un producto",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblProductos.getModel();
            Long idProducto = (Long) modelo.getValueAt(fila, 0);
            boolean eliminacionExitosa = this.controlProducto.eliminarProducto(idProducto);
            if (eliminacionExitosa) {
                JOptionPane.showMessageDialog(this, "producto eliminado correctamente",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el producto",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void cargarProducto() {
        int fila = this.tblProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un producto",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblProductos.getModel();
            Long idProducto = (Long) modelo.getValueAt(fila, 0);
            Producto producto = controlProducto.obtenerPorId(idProducto);
            if (producto != null) {
                this.txtNombre.setText(producto.getNombre());
                this.txtIdProducto.setText(producto.getId() + "");
                this.txtPrecio.setText(producto.getPrecioActual() + "");
                this.txtStock.setText(producto.getStock() + "");
                this.jcboxCategorias.setSelectedItem(controlCategorias.obtenerCategoriaPorId(producto.getCategoria().getId()));
                this.jcboxProveedores.setSelectedItem(controlProveedores.obtenerProveedorPorId(producto.getProveedor().getId()));
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el producto",
                        "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void actualizarProducto() {
        Producto producto = new Producto();

        int fila = this.tblProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un producto",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblProductos.getModel();
            Long idProducto = (Long) modelo.getValueAt(fila, 0);
            if (this.verificacionDeCampos() == true) {
                producto.setId(idProducto);
                producto.setNombre(txtNombre.getText());
                producto.setPrecioActual(Float.parseFloat(txtPrecio.getText()));
                producto.setStock(Integer.parseInt(txtStock.getText()));
                producto.setCategoria((Categ) this.jcboxCategorias.getSelectedItem());
                producto.setProveedor((Prove) jcboxProveedores.getSelectedItem());
                boolean actualizacionExitosa = this.controlProducto.actualizarProducto(producto);
                if (actualizacionExitosa) {
                    JOptionPane.showMessageDialog(null, "Se actualizó el producto correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo actualizar al producto",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se perimiten campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Object> jcboxCategorias;
    private javax.swing.JComboBox<Object> jcboxProveedores;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
