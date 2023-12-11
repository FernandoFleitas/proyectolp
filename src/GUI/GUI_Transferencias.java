/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import Clases.Cliente;
import Clases.Cuenta;
import Clases.Comprobante;
import java.awt.Dialog;

/**
 * La clase `GUI_Transferencias` representa la interfaz gráfica para realizar transferencias entre cuentas.
 *
 * <p><strong>Atributos:</strong></p>
 * <ul>
 *   <li>{@code clientes} - Arreglo de objetos `Cliente` representando la lista de clientes.</li>
 *   <li>{@code menu_validar} - Objeto `GUI_Pin_Transaccion` para validar el PIN antes de realizar la transferencia.</li>
 *   <li>{@code menu_principal} - Objeto `GUI_Ventana_Principal` representando el menú principal.</li>
 *   <li>{@code cliente_final} - Objeto `Cliente` representando al cliente que realiza la transferencia.</li>
 *   <li>{@code cuenta_final} - Objeto `Cuenta` representando la cuenta del cliente que realiza la transferencia.</li>
 *   <li>{@code cliente_destino} - Objeto `Cliente` representando al destinatario de la transferencia.</li>
 *   <li>{@code cuenta_destino} - Objeto `Cuenta` representando la cuenta del destinatario de la transferencia.</li>
 *   <li>{@code monto} - Entero que representa el monto de la transferencia.</li>
 *   <li>{@code validador} - Booleano que indica si los datos de la transferencia son válidos.</li>
 * </ul>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code set_Datos(Cliente[] clientes, Cliente cliente_final, Cuenta cuenta_final, GUI_Ventana_Principal menu_principal)} - Inicializa los datos para la transferencia.</li>
 *   <li>{@code cerrar()} - Implementación del método `cerrar` de la interfaz `Interfaz`. Actualiza la información en el menú principal y cierra la ventana de transferencias.</li>
 *   <li>{@code transferir()} - Realiza la transferencia entre cuentas y actualiza los historiales de movimientos de ambas cuentas.</li>
 *   <li>{@code validar_inputs()} - Valida los datos ingresados para la transferencia.</li>
 * </ul>
 * 
 * @author joser
 */
public class GUI_Transferencias extends javax.swing.JFrame implements Interfaz{
    
    private Cliente[] clientes;
    private GUI_Pin_Transaccion menu_validar;
    private GUI_Ventana_Principal menu_principal;
    private Cliente cliente_final;
    private Cuenta cuenta_final; 
    private Cliente cliente_destino;
    private Cuenta cuenta_destino;
    private int monto;
    private boolean validador = false;
    
    public void set_Datos(Cliente[] clientes, Cliente cliente_final, Cuenta cuenta_final, GUI_Ventana_Principal menu_principal)
    {
        this.clientes = clientes;
        this.cliente_final = cliente_final;
        this.cuenta_final = cuenta_final;
        this.menu_principal = menu_principal;
    }
    
    /**
     * Creates new form Transferencias
     */
    public GUI_Transferencias() {
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

        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        menuBar = new javax.swing.JMenuBar();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jTextField2.setText(" ");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Transferencias");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel2.setText("Cuenta Destino:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel3.setText("Monto a pagar:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setText("Nombre Destinatario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setText("CI Destinatario:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setText("Banco:");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jTextField3.setText(" ");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Continental", "Banco Basa", "Itau", "Santander" }));

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");
        helpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenuMouseClicked(evt);
            }
        });
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)
                        .addGap(138, 138, 138)
                        .addComponent(jButton2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    //Boton de Aceptar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validar_inputs();
        if(validador){
            menu_validar = new GUI_Pin_Transaccion();
            menu_validar.set_Datos(cuenta_final,this);
            menu_validar.setVisible(true);
            menu_validar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    @Override
    public void cerrar(){
        menu_principal.set_Usuario_Saldo();
        dispose();
    }
    
    public void transferir(){
        if(cuenta_final.getSaldo() >= monto){
            cuenta_final.setSaldo(cuenta_final.getSaldo() - monto);
            cuenta_destino.setSaldo(cuenta_destino.getSaldo() + monto);
            
            //Creamos el comprobante
            Comprobante comprobante_final = new Comprobante();
            comprobante_final.set_monto(-monto);
            comprobante_final.set_id(cuenta_final.getMovimientos().size()+1);
            comprobante_final.set_descripcion(cliente_destino.get_nombre()+" Cuenta "+cuenta_destino.getID());
            comprobante_final.imprimir();
            //Agrega el comprobante en el historial de la cuenta
            cuenta_final.setMovimientos(comprobante_final);
            
            //Creamos el comprobante para el destinatario
            Comprobante comprobante_final2 = new Comprobante();
            comprobante_final2.set_monto(monto);
            comprobante_final2.set_id(cuenta_destino.getMovimientos().size()+1);
            comprobante_final2.set_descripcion(cliente_final.get_nombre()+" Cuenta "+" "+cuenta_final.getID());
            //Agrega el comprobante en el historial de la cuenta
            cuenta_destino.setMovimientos(comprobante_final2);
        }
    }
    
    private void validar_inputs(){
        try
        {
            //Recopilamos los datos para validarlos
            int banco = jComboBox2.getSelectedIndex();
            String nombre = jTextField4.getText();
            String ci_ruc = jTextField3.getText().replaceAll(" ","");
            monto = Integer.parseInt(jTextField2.getText().replaceAll(" ", ""));
            int cuenta_nmr = Integer.parseInt(jTextField1.getText().replaceAll(" ",""));
            
            //Banco distinto a Continental
            if(banco != 0)return;
            if(monto<0 || cuenta_final.getSaldo()<monto){
                jTextField2.setText("");
                return;
            }
            
            for (int i = 0; i < clientes.length ; i++) {
                if (clientes[i].get_ci_ruc().equals(ci_ruc)) {
                    for (Cuenta cuentas : clientes[i].get_Cuenta()) {
                        //Si el nombre es correcto
                        if (cuentas.getID() == cuenta_nmr && clientes[i].get_nombre().toLowerCase().contains(nombre.toLowerCase())){
                                validador = true;
                                cuenta_destino = cuentas;
                                cliente_destino = clientes[i];
                                return;
                            
                        }
                    }
                    jTextField4.setText("");
                    jTextField1.setText("");
                }
            }
            jTextField3.setText("");
        }catch(Exception e)
        {
            e.printStackTrace();
            jTextField2.setText("");
            jTextField1.setText("");
        }
    }
    
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void helpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMouseClicked
        // TODO add your handling code here:
        GUI_Ayuda Menu_Ayuda = new GUI_Ayuda();
        Menu_Ayuda.setVisible(true);
        Menu_Ayuda.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_helpMenuMouseClicked

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
            java.util.logging.Logger.getLogger(GUI_Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Transferencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
