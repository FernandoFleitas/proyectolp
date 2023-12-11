/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package GUI;
import Hilos.Hilo_Transferencia;
import Hilos.Hilo_Estado_Cuenta;
import Hilos.Hilo_Pago_Tarjeta;
import Hilos.Hilo_Pago_Servicio;
import Hilos.Hilo_Deposito;
import Clases.Cliente;
import Clases.Cuenta;
import Clases.Pago;
import Clases.Servicio;
import Clases.Tarjeta_Credito;


/**
 * La clase `GUI_Ventana_Principal` representa la interfaz gráfica de la ventana principal del sistema bancario.
 *
 * <p><strong>Atributos:</strong></p>
 * <ul>
 *   <li>{@code clientes} - Arreglo de objetos `Cliente` representando la lista de clientes.</li>
 *   <li>{@code MenuEstadoCuenta} - Objeto `GUI_Estado_Cuenta` para visualizar el estado de cuenta del usuario.</li>
 *   <li>{@code MenuPagoServicios} - Objeto `GUI_Pago_Servicios` para realizar pagos de servicios.</li>
 *   <li>{@code MenuPagoTarjetas} - Objeto `GUI_Pago_Tarjetas` para realizar pagos de tarjetas de crédito.</li>
 *   <li>{@code MenuTransferencias} - Objeto `GUI_Transferencias` para realizar transferencias entre cuentas.</li>
 *   <li>{@code tarjetas} - Arreglo de objetos `Tarjeta_Credito` representando las tarjetas de crédito asociadas al cliente.</li>
 *   <li>{@code cliente_final} - Objeto `Cliente` representando al usuario actual.</li>
 *   <li>{@code cuenta_final} - Objeto `Cuenta` representando la cuenta del usuario actual.</li>
 *   <li>{@code sAgua}, {@code sLuz}, {@code sTel} - Objetos `Servicio` representando servicios de agua, luz y teléfono.</li>
 *   <li>{@code pAgua}, {@code pLuz}, {@code pTel} - Objetos `Pago` representando pagos de servicios de agua, luz y teléfono.</li>
 *   <li>{@code arrayPagos} - Arreglo de objetos `Pago` representando los pagos realizados.</li>
 *   <li>{@code arrayServicios} - Arreglo de objetos `Servicio` representando los servicios disponibles.</li>
 * </ul>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code set_Usuario_Saldo()} - Actualiza la información del usuario y su saldo en la interfaz.</li>
 *   <li>{@code set_Datos(Cliente[] clientes, Cliente cliente_final, Cuenta cuenta_final, Tarjeta_Credito[] tarjetas)} - Inicializa los datos necesarios para la ventana principal.</li>
 *   <li>{@code cerrar()} - Cierra la ventana actual.</li>
 * </ul>
 * 
 * @author EJFR0
 */
public class GUI_Ventana_Principal extends javax.swing.JFrame implements Interfaz{

    /**
     * Creates new form NewApplication
     */
    private Cliente[] clientes;
    private Tarjeta_Credito [] tarjetas;
    private Cliente cliente_final;
    private Cuenta cuenta_final; 
    
    Servicio sAgua = new Servicio(1, "Factura Agua");
    Servicio sLuz = new Servicio(2, "Factura Luz");
    Servicio sTel = new Servicio (3, "Factura Teléfono");
        
    Pago pAgua = new Pago(sAgua.getID(), 50);
    Pago pLuz = new Pago(sLuz.getID(), 300);
    Pago pTel = new Pago(sTel.getID(), 100);
    
    Pago[] arrayPagos = new Pago[]{pAgua, pLuz, pTel};
    Servicio[] arrayServicios = new Servicio[]{sAgua, sLuz, sTel};
    
    
    
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
        jButton5 = new javax.swing.JButton();
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

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("Deposito");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");
        helpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenuMouseClicked(evt);
            }
        });
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Hilo_Estado_Cuenta hilo_estado_cuenta = new Hilo_Estado_Cuenta(clientes,cliente_final,cuenta_final);
        hilo_estado_cuenta.start();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Hilo_Transferencia hilo_transferencia = new Hilo_Transferencia(clientes,cliente_final,cuenta_final,this);
        hilo_transferencia.start();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Hilo_Pago_Servicio hilo_pago_servicio = new Hilo_Pago_Servicio(arrayPagos,arrayServicios,cuenta_final,cliente_final,tarjetas,this);
        hilo_pago_servicio.start();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Hilo_Pago_Tarjeta hilo_pago_tarjeta = new Hilo_Pago_Tarjeta(tarjetas,cuenta_final,this);
        hilo_pago_tarjeta.start();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MenuCerradoSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuCerradoSesionMouseClicked
        // TODO add your handling code here:
        
         GUI_Inicio_Sesion Menu_Inicio = new GUI_Inicio_Sesion();
         Menu_Inicio.set_Datos(clientes,cliente_final,cuenta_final);
         Menu_Inicio.setVisible(true);
         cerrar();
    }//GEN-LAST:event_MenuCerradoSesionMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        menu_deposito();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void helpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMouseClicked
        // TODO add your handling code here:
        GUI_Ayuda Menu_Ayuda = new GUI_Ayuda(); 
        Menu_Ayuda.setVisible(true);
        Menu_Ayuda.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_helpMenuMouseClicked
    
    public void menu_deposito(){
        Hilo_Deposito menu_deposito = new Hilo_Deposito(cuenta_final);
        menu_deposito.run();
        set_Usuario_Saldo();
    }
    
    public void set_Usuario_Saldo()
    {
        jLabel1.setText("Usuario: " + cliente_final.get_nombre());
        jLabel2.setText("Saldo: "+ cuenta_final.getSaldo() + " Gs");
    }
    
    public void set_Datos(Cliente[] clientes, Cliente cliente_final, Cuenta cuenta_final, Tarjeta_Credito[] tarjetas)
    {
        this.clientes = clientes;
        this.cliente_final = cliente_final;
        this.cuenta_final = cuenta_final;
        this.tarjetas = tarjetas;
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
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
