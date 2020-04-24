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
import negocio.ConClie;
import objetosNegocios.Cliente;

/**
 *
 * @author Rayo
 */
public class DlgCli extends javax.swing.JDialog {

    private ConClie control ;

   
    public DlgCli(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Clientes");
        initComponents();
        control = new ConClie();
        this.borderFormularios();
        this.cargarClientes();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    private void borderFormularios() {
        this.txtBuscar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtDireccion.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtIdCliente.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtRFC.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtTelefono1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtTelefono2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTittle = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        lbldCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblTelefono2 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTittle.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        lblTittle.setText("Clientes");

        txtIdCliente.setEditable(false);
        txtIdCliente.setText("0");

        lbldCliente.setText("ID:");

        lblNombre.setText("Nombre");

        lblRFC.setText("RFC:");

        lblDireccion.setText("Dirección:");

        lblTelefono.setText("Teléfono 1:");

        lblTelefono2.setText("Teléfono 2:");

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

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        txtTelefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefono1KeyTyped(evt);
            }
        });

        txtTelefono2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefono2KeyTyped(evt);
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

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "RFC", "Dirección", "Teléfono 1", "Teléfono 2"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefono2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDireccion)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRFC)
                                    .addComponent(lblNombre))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnGuardar)
                        .addGap(26, 26, 26)
                        .addComponent(btnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnEliminar)
                        .addGap(27, 27, 27)
                        .addComponent(btnActualizar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldCliente)
                    .addComponent(lblTittle))
                .addGap(89, 89, 89)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTittle)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldCliente))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRFC)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono2)
                            .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar))
                        .addGap(35, 35, 35))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

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
        if (txtNombre.getText().length() >= 45) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número máximo de caracteres es 45", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        if (txtRFC.getText().length() >= 15) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número máximo de caracteres", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtRFC.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        }
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (txtDireccion.getText().length() >= 100) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número máximo de caracteres es 100", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtDireccion.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtTelefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefono1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            this.txtTelefono1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtTelefono1.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
        if (txtTelefono1.getText().length() >= 15) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número máximo de caracteres es 15", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtTelefono1.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }

    }//GEN-LAST:event_txtTelefono1KeyTyped

    private void txtTelefono2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefono2KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            this.txtTelefono2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtTelefono2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
        if (txtTelefono2.getText().length() >= 15) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El número máximo de caracteres es 15", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtTelefono2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
    }//GEN-LAST:event_txtTelefono2KeyTyped

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.borderFormularios();
        this.limpiarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.verificacionDeCampos() == true) {
            if (this.txtIdCliente.getText().equalsIgnoreCase("0")) {
                this.guardarCliente();
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "¿Seguro qué desea actualizar el registro?");
                if (resp == 0) {
                    this.actualizarCliente();
                } else {
                    JOptionPane.showMessageDialog(null, "Operación Cancelada ", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            this.limpiarFormulario();
            this.cargarClientes();
        } else {
            JOptionPane.showMessageDialog(null, "Campos vacios no permitidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        this.cargarCliente();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.cargarCliente();
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro qué desea eliminar el registro?");
        if (resp == 0) {
            this.eliminarCliente();
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada ", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        this.limpiarFormulario();
        this.cargarClientes();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.cargarClientesNombre();
        this.txtBuscar.setText("");
    }//GEN-LAST:event_btnBuscarActionPerformed

    public boolean verificacionDeCampos() {
        if (txtNombre.getText().equalsIgnoreCase("") || txtDireccion.getText().equalsIgnoreCase("") || txtRFC.getText().equalsIgnoreCase("")) {
            return false;
        } else {
            return true;
        }
    }

    public void limpiarFormulario() {
        this.txtIdCliente.setText("0");
        this.txtBuscar.setText("");
        this.txtDireccion.setText("");
        this.txtNombre.setText("");
        this.txtRFC.setText("");
        this.txtTelefono1.setText("");
        this.txtTelefono2.setText("");
    }

    private void guardarCliente() {
        if (this.verificacionDeCampos() == true) {
            Cliente cliente = new Cliente();
            cliente.setNombre(txtNombre.getText());
            cliente.setRfc(txtRFC.getText());
            cliente.setDireccion(txtDireccion.getText());
            cliente.setTelefono1(txtTelefono1.getText());
            cliente.setTelefono2(txtTelefono2.getText());
            this.control.guardarCliente(cliente);
            JOptionPane.showMessageDialog(null, "Se guardo el cliente correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "No se perimiten campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarClientes() {
        List<Cliente> clientes = this.control.obtenerClientes();
        if (clientes != null) {
            DefaultTableModel modelo
                    = (DefaultTableModel) this.tblClientes.getModel();
            modelo.setRowCount(0);
            for (Cliente cliente : clientes) {
                modelo.addRow(cliente.toArray());
            }
        }
    }

    private void cargarClientesNombre() {
        int contador = 0;
        List<Cliente> clientes = this.control.obtenerClientesNombre(txtBuscar.getText());
        for (Cliente cliente : clientes) {
            contador++;
        }
        if (contador != 0) {
            DefaultTableModel modelo = (DefaultTableModel) this.tblClientes.getModel();
            modelo.setRowCount(0);
            for (Cliente cliente : clientes) {
                modelo.addRow(cliente.toArray());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron productos", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void eliminarCliente() {
        int fila = this.tblClientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un cliente.",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblClientes.getModel();
            Long idCliente = (Long) modelo.getValueAt(fila, 0);
            boolean eliminacionExitosa = this.control.eliminarCliente(idCliente);
            if (eliminacionExitosa) {
                JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente.",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar al cliente.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void actualizarCliente() {
        Cliente cliente = new Cliente();
        int fila = this.tblClientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un cliente",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblClientes.getModel();
            Long idCliente = (Long) modelo.getValueAt(fila, 0);
            if (this.verificacionDeCampos() == true) {
                cliente.setId(idCliente);
                cliente.setNombre(txtNombre.getText());
                cliente.setRfc(txtRFC.getText());
                cliente.setDireccion(txtDireccion.getText());
                cliente.setTelefono1(txtTelefono1.getText());
                cliente.setTelefono2(txtTelefono2.getText());
                boolean actualizacionExitosa = this.control.actualizarCliente(cliente);
                if (actualizacionExitosa) {
                    JOptionPane.showMessageDialog(null, "Se actualizo el cliente correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo actualizar al cliente.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se perimiten campos vacios.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void cargarCliente() {
        int fila = this.tblClientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un cliente",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblClientes.getModel();
            Long idCliente = (Long) modelo.getValueAt(fila, 0);
            Cliente cliente = control.obtenerClientePorId(idCliente);
            if (cliente != null) {
                this.txtIdCliente.setText(cliente.getId() + "");
                this.txtNombre.setText(cliente.getNombre());
                this.txtRFC.setText(cliente.getRfc());
                this.txtDireccion.setText(cliente.getDireccion());
                this.txtTelefono1.setText(cliente.getTelefono1());
                this.txtTelefono2.setText(cliente.getTelefono2());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró al cliente",
                        "Alerta", JOptionPane.WARNING_MESSAGE);
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
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefono2;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JLabel lbldCliente;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}
