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
import objetosNegocios.Categ;

/**
 *
 * @author Rayo
 */
public class DlgCate extends javax.swing.JDialog {

    private ConlCate control;

    
    public DlgCate(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Categorias");
        this.getContentPane().setBackground(Color.WHITE);
        control = new ConlCate();
        this.cargarCategorias();
        this.borderFormulario();
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    public boolean verificacionDeCampos() {
        if (txtNombre.getText().equalsIgnoreCase("") || this.txtAreaDescripcion.getText().equalsIgnoreCase("")) {
            return false;
        } else {
            return true;
        }
    }

    public void limpiarFormulario() {
        this.txtIdCategoria.setText("0");
        this.txtNombre.setText("");
        this.txtAreaDescripcion.setText("");
        this.txtBuscar.setText("");
    }

    public void borderFormulario() {
        this.txtBuscar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtAreaDescripcion.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtIdCategoria.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.txtNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

    }

    private void cargarCategorias() {
        List<Categ> categorias = this.control.obtenerCategorias();
        if (categorias != null) {
            DefaultTableModel modelo = (DefaultTableModel) this.jtbCategorias.getModel();
            modelo.setRowCount(0);
            for (Categ categoria : categorias) {
                modelo.addRow(categoria.toArray());
            }
        }
    }

    private void cargarCategoriasNombre() {
        int contador = 0;
        List<Categ> categorias = this.control.obtenerCategoriasNombre(txtBuscar.getText());
        for (Categ categoria : categorias) {
            contador++;
        }
        if (contador != 0) {
            DefaultTableModel modelo
                    = (DefaultTableModel) this.jtbCategorias.getModel();
            modelo.setRowCount(0);
            for (Categ categoria : categorias) {
                modelo.addRow(categoria.toArray());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron categorias", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void guardarCategoria() {
        if (this.verificacionDeCampos() == true) {
            Categ categoria = new Categ();
            categoria.setNombre(txtNombre.getText());
            categoria.setDescripcion(this.txtAreaDescripcion.getText());
            this.control.guardarCategoria(categoria);
            JOptionPane.showMessageDialog(null, "Se guardo la categoria correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se perimiten campos vacios.", "Error En Datos", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminarCategoria() {
        int fila = this.jtbCategorias.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una categoria.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.jtbCategorias.getModel();
            Long idCategoria = (Long) modelo.getValueAt(fila, 0);
            boolean eliminacionExitosa = this.control.eliminarCategoria(idCategoria);
            if (eliminacionExitosa) {
                JOptionPane.showMessageDialog(this, "categoria eliminada correctamente.",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la categoria.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void cargarCategoria() {
        int fila = this.jtbCategorias.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una categoria.",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.jtbCategorias.getModel();
            Long idCategoria = (Long) modelo.getValueAt(fila, 0);
            Categ categoria = control.obtenerCategoriaPorId(idCategoria);
            if (categoria != null) {
                this.txtIdCategoria.setText(categoria.getId().toString());
                this.txtNombre.setText(categoria.getNombre());
                this.txtAreaDescripcion.setText(categoria.getDescripcion());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró la categoria.",
                        "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void actualizarCategoria() {
        Categ categoria = new Categ();
        if (this.verificacionDeCampos() == true) {
            categoria.setId(Long.parseLong(this.txtIdCategoria.getText()));
            categoria.setDescripcion(this.txtAreaDescripcion.getText());
            categoria.setNombre(txtNombre.getText());
            boolean actualizacionExitosa = this.control.actualizarCategoria(categoria);
            if (actualizacionExitosa) {
                JOptionPane.showMessageDialog(null, "Se actualizo la categoria correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar la categoria.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se perimiten campos vacios.", "Error En Datos", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTittle = new javax.swing.JLabel();
        lblIdCategoria = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JTextField();
        txtIdCategoria = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jtbCategorias = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTittle.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        lblTittle.setText("Categorias");

        lblIdCategoria.setText("ID:");

        lblNombre.setText("Nombre:");

        lblDescripcion.setText("Descripción:");

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        txtAreaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtAreaDescripcion);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtIdCategoria.setEditable(false);
        txtIdCategoria.setText("0");
        txtIdCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCategoriaActionPerformed(evt);
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

        jtbCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripción"
            }
        ));
        jScrollPane.setViewportView(jtbCategorias);

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

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblDescripcion))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTittle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnGuardar)))
                        .addGap(53, 53, 53)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblIdCategoria))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCancelar)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(btnActualizar)
                                .addGap(60, 60, 60)
                                .addComponent(btnEliminar)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(lblTittle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCategoria)
                    .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(lblDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCategoriaActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            this.txtNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
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

    private void txtAreaDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaDescripcionKeyTyped
        if (this.txtAreaDescripcion.getText().length() >= 100) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Excedió el número maximo de caracteres", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        }

    }//GEN-LAST:event_txtAreaDescripcionKeyTyped

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.verificacionDeCampos() == true) {
            if (this.txtIdCategoria.getText().equalsIgnoreCase("0")) {
                this.guardarCategoria();
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "¿Seguro qué deseas actualizar el registro?");
                if (resp == 0) {
                    this.actualizarCategoria();
                } else {
                    JOptionPane.showMessageDialog(null, "Operación Cancelada.", "Informacion", JOptionPane.INFORMATION_MESSAGE);

                }
            }
            this.limpiarFormulario();
            this.borderFormulario();
            this.cargarCategorias();
        } else {
            JOptionPane.showMessageDialog(null, "Campos vacios no permitidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiarFormulario();
        this.borderFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        this.cargarCategoria();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
            this.cargarCategoria();
            int resp = JOptionPane.showConfirmDialog(null, "¿Seguro qué desea eliminar el registro?");
            if (resp == 0) {
                this.eliminarCategoria();
            } else {
                JOptionPane.showMessageDialog(null, "Operación Cancelada ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
            this.limpiarFormulario();
            this.borderFormulario();
            this.cargarCategorias();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
            this.cargarCategoriasNombre();
            this.txtBuscar.setText("");
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbCategorias;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblIdCategoria;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
