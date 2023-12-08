/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package GUI;
import Clases.Cliente;
import Clases.Cuenta;
import Clases.Individuo;
import Clases.Empresa; 

/**
 *
 * @author EJFR0
 */
public class GUI_Ventana_Principal extends javax.swing.JFrame implements Interfaz{

    /**
     * Creates new form NewApplication
     */
    private Cliente[] clientes;
    private GUI_Estado_Cuenta MenuEstadoCuenta = new GUI_Estado_Cuenta();
    private GUI_Pago_Servicios MenuPagoServicios = new GUI_Pago_Servicios();
    private GUI_Pago_Tarjetas MenuPagoTarjetas = new GUI_Pago_Tarjetas();
    private GUI_Transferencias MenuTransferencias = new GUI_Transferencias(); 
 
    private Cliente cliente_final;
    private Cuenta cuenta_final; 
    
    public GUI_Ventana_Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        helpMenu = new javax.swing.JMenu();
        MenuCerradoSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton1.setText("Visualizar estado de cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton2.setText("Transferencias");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton3.setText("Pagos de Servicios");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton4.setText("Pagos de Tarjetas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Usuario: ---------");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Cuenta:-----------");

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");
        menuBar.add(helpMenu);

        MenuCerradoSesion.setMnemonic('h');
        MenuCerradoSesion.setText("Cerrar sesion");
        MenuCerradoSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuCerradoSesionMouseClicked(evt);
            }
        });
        menuBar.add(MenuCerradoSesion);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GUI_Estado_Cuenta menu_Estado = new GUI_Estado_Cuenta();
        menu_Estado.setVisible(true);
        menu_Estado.set_Datos(clientes,cliente_final,cuenta_final);
        menu_Estado.set_Usuario_Cuenta_Tarjeta_Saldo();
        menu_Estado.agregarMovimientos();
        menu_Estado.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        GUI_Transferencias menu_Trans = new GUI_Transferencias();
        menu_Trans.set_Datos(clientes, cliente_final, cuenta_final);
        menu_Trans.setVisible(true);
        menu_Trans.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        GUI_Pago_Servicios menu_Servicios = new GUI_Pago_Servicios();
        menu_Servicios.setVisible(true);
        menu_Servicios.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        GUI_Pago_Tarjetas menu_Tarjetas = new GUI_Pago_Tarjetas();
        menu_Tarjetas.setVisible(true);
        menu_Tarjetas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MenuCerradoSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuCerradoSesionMouseClicked
        // TODO add your handling code here:
        
         GUI_Inicio_Sesion Menu_Inicio = new GUI_Inicio_Sesion();
         Menu_Inicio.set_Datos(clientes,cliente_final,cuenta_final);
         Menu_Inicio.setVisible(true);
         cerrar();
    }//GEN-LAST:event_MenuCerradoSesionMouseClicked
    
    public void set_Usuario_Saldo()
    {
        jLabel1.setText("Usuario: " + cliente_final.get_nombre());
        jLabel2.setText("Saldo: "+ cuenta_final.getSaldo() + " Gs");
    }
    
    public void set_Datos(Cliente[] clientes, Cliente cliente_final, Cuenta cuenta_final)
    {
        this.clientes = clientes;
        this.cliente_final = cliente_final;
        this.cuenta_final = cuenta_final;
    }
    
    public void cerrar() {
        dispose();
    }
    
    
    
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
            java.util.logging.Logger.getLogger(GUI_Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCerradoSesion;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
