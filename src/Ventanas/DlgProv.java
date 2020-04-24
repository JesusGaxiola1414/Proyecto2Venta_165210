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
import negocio.ConProve;
import objetosNegocios.Prove;

/**
 *
 * @author Rayo
 */
public class DlgProv extends javax.swing.JDialog {

    private ConProve control;

  
    public DlgProv(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Proveedores");
        this.getContentPane().setBackground(Color.WHITE);
        control = new ConProve();
        this.cargarProveedores();
        this.setLocationRelativeTo(parent);
    }

    private void cargarProveedores() {
        List<Prove> proveedores = this.control.obtenerProveedores();
        if (proveedores != null) {
            DefaultTableModel modelo = (DefaultTableModel) this.tblProveedores.getModel();
            modelo.setRowCount(0);
            proveedores.forEach((proveedor) -> {
                modelo.addRow(proveedor.toArray());
            });
        }
    }

    private void limpiarFormularios() {
        this.txtBuscar.setText("");
        this.txtDireccion.setText("");
        this.txtNombre.setText("");
        this.txtPaginaWeb.setText("");
        this.txtRFC.setText("");
        this.txtTelefono.setText("");
        this.txtIdProveedor.setText("0");
    }

    private void cargarProveedoresNombre() {
        int contador = 0;
        List<Prove> proveedores = this.control.obtenerProveedoresNombre(txtBuscar.getText());
        for (Prove proveedor : proveedores) {
            contador++;
        }
        if (contador != 0) {
            DefaultTableModel modelo = (DefaultTableModel) tblProveedores.getModel();
            modelo.setRowCount(0);
            for (Prove proveedor : proveedores) {
                modelo.addRow(proveedor.toArray());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron proveedores", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public boolean verificacionDeCampos() {
        if (this.txtRFC.getText().equalsIgnoreCase("") || txtNombre.getText().equalsIgnoreCase("") || txtDireccion.getText().equalsIgnoreCase("")) {
            return false;
        } else {
            return true;
        }
    }

    private void guardarProveedor() {
        if (this.verificacionDeCampos() == true) {
            Prove proveedor = new Prove();
            proveedor.setNombre(txtNombre.getText());
            proveedor.setRfc(txtRFC.getText());
            proveedor.setDireccion(txtDireccion.getText());
            proveedor.setTelefono(txtTelefono.getText());
            proveedor.setPaginaweb(this.txtPaginaWeb.getText());
            this.control.guardarProveedor(proveedor);
            JOptionPane.showMessageDialog(null, "Se guardo el proveedor correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "No se perimiten campos vacios.", "Error En Datos", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminarProveedor() {
        int fila = this.tblProveedores.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un proveedor.",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblProveedores.getModel();
            Long idProveedor = (Long) modelo.getValueAt(fila, 0);
            boolean eliminacionExitosa = this.control.eliminarProveedor(idProveedor);
            if (eliminacionExitosa) {
                JOptionPane.showMessageDialog(this, "proveedor eliminado correctamente.",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar al proveedor.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void cargarProveedor() {
        int fila = this.tblProveedores.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un proveedor.",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblProveedores.getModel();
            Long idProveedor = (Long) modelo.getValueAt(fila, 0);
            Prove proveedor = control.obtenerProveedorPorId(idProveedor);
            if (proveedor != null) {
                this.txtIdProveedor.setText(proveedor.getId().toString());
                this.txtRFC.setText(proveedor.getRfc());
                this.txtNombre.setText(proveedor.getNombre());
                this.txtDireccion.setText(proveedor.getDireccion());
                this.txtTelefono.setText(proveedor.getTelefono());
                this.txtPaginaWeb.setText(proveedor.getPaginaweb());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el proveedor.",
                        "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void actualizarProveedor() {
        Prove proveedor = new Prove();
        if (this.verificacionDeCampos() == true) {
            proveedor.setId(Long.parseLong(txtIdProveedor.getText()));
            proveedor.setNombre(txtNombre.getText());
            proveedor.setRfc(txtRFC.getText());
            proveedor.setDireccion(txtDireccion.getText());
            proveedor.setTelefono(txtTelefono.getText());
            proveedor.setPaginaweb(txtPaginaWeb.getText());
            boolean actualizacionExitosa = this.control.actualizarProveedor(proveedor);
            if (actualizacionExitosa) {
                JOptionPane.showMessageDialog(null, "Se actualizo el proveedor correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el proveedor.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se perimiten campos vacios.", "Error En Datos", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIDProveedor = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblPaginaWeb = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPaginaWeb = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        Jseparator = new javax.swing.JSeparator();
        Scrollpan = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblIDProveedor.setText("IDProveedor:");

        lblRFC.setText("RFC:");

        lblNombre.setText("Nombre:");

        lblDireccion.setText("Dirección:");

        lblTelefono.setText("Teléfono:");

        lblPaginaWeb.setText("Página Web:");

        txtIdProveedor.setEditable(false);
        txtIdProveedor.setText("0");

        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtPaginaWeb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaginaWebKeyTyped(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RFC", "Nombre", "Dirección", "Teléfono", "PáginaWeb"
            }
        ));
        Scrollpan.setViewportView(tblProveedores);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Provedores ");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDProveedor)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRFC)
                                    .addComponent(lblNombre)
                                    .addComponent(lblDireccion)
                                    .addComponent(lblTelefono))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPaginaWeb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(lblPaginaWeb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Jseparator, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnBuscar)
                                .addGap(215, 215, 215))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Scrollpan, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar)
                            .addComponent(btnGuardar))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar)
                            .addComponent(btnActualizar))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIDProveedor))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRFC)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPaginaWeb)
                            .addComponent(txtPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Scrollpan, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Jseparator, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar))
                        .addContainerGap(56, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        if (txtRFC.getText().length() >= 15) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número maximo de caracteres es 15", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtRFC.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            this.txtNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }

        if (this.txtNombre.getText().length() >= 45) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número maximo de caracteres es 45", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (this.txtDireccion.getText().length() >= 45) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número maximo de caracteres es 45", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtDireccion.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped

        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            this.txtTelefono.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }

        if (this.txtTelefono.getText().length() >= 20) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número maximo de carateres es 20", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        }


    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtPaginaWebKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaginaWebKeyTyped

        if (this.txtPaginaWeb.getText().length() >= 200) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número maximo de carateres es 200", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtPaginaWeb.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
    }//GEN-LAST:event_txtPaginaWebKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiarFormularios();
        this.borderFormularios();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (this.verificacionDeCampos() == true) {
            if (txtIdProveedor.getText().equalsIgnoreCase("0")) {
                this.guardarProveedor();
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que deseas actualizar el registro?");
                if (resp == 0) {
                    this.actualizarProveedor();
                } else {
                    JOptionPane.showMessageDialog(null, "Operacion Cancelada.", "Informacion", JOptionPane.INFORMATION_MESSAGE);

                }
            }
            this.limpiarFormularios();
            this.borderFormularios();
            this.cargarProveedores();
        } else {
            JOptionPane.showMessageDialog(null, "Deben llenarse los campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.cargarProveedoresNombre();
        this.txtBuscar.setText("");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        this.cargarProveedor();
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro qué desea eliminar el registro?");
        if (resp == 0) {
            this.eliminarProveedor();
        } else {
            JOptionPane.showMessageDialog(null, "Operacion Cancelada ", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        this.limpiarFormularios();
        this.borderFormularios();
        this.cargarProveedores();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        this.cargarProveedor();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_txtBuscarKeyTyped
    public void borderFormularios() {
        this.txtBuscar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtDireccion.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtPaginaWeb.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtRFC.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtTelefono.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtIdProveedor.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Jseparator;
    private javax.swing.JScrollPane Scrollpan;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblIDProveedor;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaginaWeb;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaginaWeb;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
