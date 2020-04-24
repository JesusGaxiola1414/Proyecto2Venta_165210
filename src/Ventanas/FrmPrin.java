/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import javax.swing.ImageIcon;
import negocio.ConProve;

/**
 *
 * @author Rayo
 */
public class FrmPrin extends javax.swing.JFrame {

    
    private ConProve c = new ConProve();

    public FrmPrin() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/venta.png")).getImage());
        this.getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        this.setTitle("Punto de venta - 189029");
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnProveedores1 = new javax.swing.JButton();
        lblProductos = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblVenta = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText(" Servicio");
        lblTitulo.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N

        lblProveedor.setText("Proveedores");
        lblProveedor.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        lblClientes.setText("Clientes");
        lblClientes.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        btnClientes.setBackground(new java.awt.Color(255, 204, 204));
        btnClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClientes.setBorderPainted(false);
        btnClientes.setFocusPainted(false);
        btnClientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        btnClientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProveedores1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedor.png"))); // NOI18N
        btnProveedores1.setBackground(new java.awt.Color(255, 204, 204));
        btnProveedores1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProveedores1.setBorderPainted(false);
        btnProveedores1.setFocusPainted(false);
        btnProveedores1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedores1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProveedores1MouseExited(evt);
            }
        });
        btnProveedores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedores1ActionPerformed(evt);
            }
        });

        lblProductos.setText("Productos");
        lblProductos.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        lblCategoria.setText("Categorias");
        lblCategoria.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        lblVenta.setText("Ventas");
        lblVenta.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        lblReportes.setText("Reportes");
        lblReportes.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto (1).png"))); // NOI18N
        btnProductos.setText("jButton1");
        btnProductos.setBackground(new java.awt.Color(255, 204, 204));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
        });
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categoria.png"))); // NOI18N
        btnCategorias.setBackground(new java.awt.Color(255, 204, 204));
        btnCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseExited(evt);
            }
        });
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venta.png"))); // NOI18N
        btnVentas.setBackground(new java.awt.Color(255, 204, 204));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte (1).png"))); // NOI18N
        btnReportes.setBackground(new java.awt.Color(255, 204, 204));
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesMouseExited(evt);
            }
        });
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProveedores1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblProveedor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblProductos)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblClientes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(lblCategoria)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblVenta)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblReportes)
                        .addGap(104, 104, 104))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblClientes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProveedores1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProveedor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVenta)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblReportes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblProductos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCategoria)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        DlgVen venta = new DlgVen(this, rootPaneCheckingEnabled);

    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        this.btnProductos.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        this.btnProductos.setBackground(new Color(255, 204, 204));
    }//GEN-LAST:event_btnProductosMouseExited

    private void btnCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseEntered
        this.btnCategorias.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnCategoriasMouseEntered

    private void btnCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseExited
        this.btnCategorias.setBackground(new Color(255, 204, 204));
    }//GEN-LAST:event_btnCategoriasMouseExited

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        this.btnVentas.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        this.btnVentas.setBackground(new Color(255, 204, 204));
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        this.btnReportes.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
        this.btnReportes.setBackground(new Color(255, 204, 204));
    }//GEN-LAST:event_btnReportesMouseExited

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        DlgCate categorias = new DlgCate(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        DlgProd productos = new DlgProd(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        DlgRep reportes = new DlgRep(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        DlgCli cliente = new DlgCli(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        this.btnClientes.setBackground(new Color(255, 204, 204));
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        // TODO add your handling code here:
        this.btnClientes.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnProveedores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedores1ActionPerformed
        DlgProv proveedor = new DlgProv(this, rootPaneCheckingEnabled);
        proveedor.setVisible(true);
    }//GEN-LAST:event_btnProveedores1ActionPerformed

    private void btnProveedores1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedores1MouseExited
        this.btnProveedores1.setBackground(new Color(255, 204, 204));
    }//GEN-LAST:event_btnProveedores1MouseExited

    private void btnProveedores1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedores1MouseEntered
        this.btnProveedores1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnProveedores1MouseEntered

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmPrin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores1;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVenta;
    // End of variables declaration//GEN-END:variables
}
