/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package GUI;
import Clases.Cliente;
import Clases.Cuenta;
import Clases.Individuo;
import Clases.Empresa;
import Clases.Tarjeta_Credito;
import Clases.Tarjeta_Debito;

/**
 * La clase GUI_Inicio_Sesion representa la interfaz gráfica para el proceso de inicio de sesión de clientes.
 * Permite a los usuarios ingresar su número de documento, seleccionar una cuenta y proporcionar un PIN de acceso.
 * La validación de los datos ingresados se realiza para permitir el acceso a la aplicación.
 * 
 * <p>La clase implementa la interfaz {@link Interfaz} y utiliza la biblioteca Swing para la construcción de la interfaz gráfica.</p>
 *
 * <p><strong>Atributos:</strong></p>
 * <ul>
 *   <li>{@code clientes} - Arreglo de objetos {@link Cliente} que almacena los clientes de la aplicación.</li>
 *   <li>{@code menu_principal} - Instancia de la clase {@link GUI_Ventana_Principal} que representa el menú principal.</li>
 *   <li>{@code validador} - Variable booleana que indica si la validación de inicio de sesión fue exitosa.</li>
 *   <li>{@code cliente_final} - Objeto {@link Cliente} que representa al cliente que ha iniciado sesión.</li>
 *   <li>{@code cuenta_final} - Objeto {@link Cuenta} que representa la cuenta asociada al inicio de sesión.</li>
 * </ul>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code GUI_Inicio_Sesion()} - Constructor que inicializa la interfaz y llama a {@code crear_Datos()}.</li>
 *   <li>{@code initComponents()} - Método generado automáticamente que inicializa los componentes de la interfaz.</li>
 *   <li>{@code jButton1ActionPerformed(ActionEvent evt)} - Manejador de eventos para el botón "Aceptar".</li>
 *   <li>{@code jTextField2ActionPerformed(ActionEvent evt)} - Manejador de eventos para el campo de texto "Cuenta".</li>
 *   <li>{@code jButton2ActionPerformed(ActionEvent evt)} - Manejador de eventos para el botón "Cancelar".</li>
 *   <li>{@code helpMenuMouseClicked(MouseEvent evt)} - Manejador de eventos para hacer clic en el menú de ayuda.</li>
 *   <li>{@code cerrar()} - Método para cerrar la interfaz.</li>
 *   <li>{@code validarPin()} - Método para procesar y validar los datos ingresados durante el inicio de sesión.</li>
 *   <li>{@code crear_Datos()} - Método para inicializar datos de prueba.</li>
 *   <li>{@code set_Datos(Cliente[] clientes, Cliente cliente_final, Cuenta cuenta_final)} - Método para establecer datos en la interfaz.</li>
 * </ul>
 *
 * <p>Esta aplicación sigue el patrón de diseño Modelo-Vista-Controlador (MVC), donde esta clase sirve como parte de la vista.</p>
 * 
 * @author EJFR0
 * @version 1.0
 * @see Interfaz
 * @see GUI_Ventana_Principal
 * @see GUI_Ayuda
 */

public class GUI_Inicio_Sesion extends javax.swing.JFrame implements Interfaz{

    /**
     * Creates new form NewApplication
     */
    private Cliente[] clientes = new Cliente[2];
    private GUI_Ventana_Principal menu_principal = new GUI_Ventana_Principal(); 

    private boolean validador = false; 
    private Cliente cliente_final;
    private Cuenta cuenta_final; 
    private Tarjeta_Credito[] tarjetas = new Tarjeta_Credito[3];
   
    /**
     * Constructor para la clase GUI_Inicio_Sesion.
     * Crea instancias de la interfaz gráfica y llama al método crear_Datos para inicializar datos.
     */
    public GUI_Inicio_Sesion() {
        this.crear_Datos();
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

        BotonAceptar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonAceptar.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        BotonAceptar.setText("Aceptar");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        BotonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel1.setText("Inicio de sesión");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel2.setText("N° de documento:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel3.setText("Cuenta:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setText("PIN de acceso:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText(" ");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                                .addComponent(BotonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAceptar)
                    .addComponent(BotonCancelar))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        // TODO add your handling code here:
        validarPin();
        if(validador)
        {   
            menu_principal.set_Datos(clientes,cliente_final,cuenta_final, tarjetas);
            menu_principal.set_Usuario_Saldo();
            menu_principal.setVisible(true);
            cerrar();
        }
       
    }//GEN-LAST:event_BotonAceptarActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void helpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMouseClicked
        // TODO add your handling code here:
        GUI_Ayuda Menu_Ayuda = new GUI_Ayuda(); 
        Menu_Ayuda.setVisible(true);
        Menu_Ayuda.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_helpMenuMouseClicked
    
    @Override
    public void cerrar()
    {
        dispose();
    }

    /**
     * Método para procesar y manejar datos.
     */
    public void validarPin()
    {
        String ci_ruc = jTextField1.getText();
        String cuenta = jTextField2.getText();
        String pin = jPasswordField1.getText();
        int pin_nmr;
        int cuenta_nmr ;
        
        try
        {
            pin_nmr = Integer.parseInt(pin);
            cuenta_nmr = Integer.parseInt(cuenta);
            
            for (int i = 0; i < 2; i++) {
                if (clientes[i].get_ci_ruc().equals(ci_ruc) && clientes[i].get_pin() == pin_nmr) {
                    for (Cuenta cuentas : clientes[i].get_Cuenta()) {

                        if (cuentas.getID() == cuenta_nmr) {
                            validador = true;
                            cliente_final = clientes[i];
                            cuenta_final = cuentas;
                            return;

                        }
                    }

                }
            }

            jLabel5.setText("Datos incorrectos");
        }catch(Exception e)
        {
            jLabel5.setText("Formato de Pin o cuenta invalido");
        }
    }
    
    public void crear_Datos()
    {
        
        Tarjeta_Credito tarjetac1 = new Tarjeta_Credito(123456789, 2000, "12/25", 123, 5000);
        Tarjeta_Credito tarjetac2 = new Tarjeta_Credito(987654321, 1000, "10/24", 456, 3000);
        Tarjeta_Credito tarjetac3 = new Tarjeta_Credito(567890123, 2000, "08/23", 789, 2000);
        
        tarjetas [0] = tarjetac1;
        tarjetas [1] = tarjetac2;
        tarjetas [2] = tarjetac3;
        
        Cuenta cuenta1 = new Cuenta(1, 1234, 1000);
        Cuenta cuenta2 = new Cuenta(2, 4321, 500);
        Cuenta cuenta3 = new Cuenta(3, 5678, 1500);
        
        Tarjeta_Debito tarjetad4 = new Tarjeta_Debito(135792468, cuenta1.getSaldo(), "11/26", 234);
        Tarjeta_Debito tarjetad5 = new Tarjeta_Debito(908876904, cuenta2.getSaldo(), "10/25", 456);
        Tarjeta_Debito tarjetad6 = new Tarjeta_Debito(345658542, cuenta3.getSaldo(), "09/24", 789);
        
        cuenta1.setTarjetas(tarjetac1);
        cuenta2.setTarjetas(tarjetac2);
        cuenta3.setTarjetas(tarjetac3);
        
        cuenta1.setTarjeta_debito(tarjetad4);
        cuenta2.setTarjeta_debito(tarjetad5);
        cuenta3.setTarjeta_debito(tarjetad6);
                
        Cuenta[] cuentaA = {cuenta1, cuenta2};
        Cuenta[] cuentaB = {cuenta3};
        
        this.clientes[0] = new Individuo("5438724","-",5438724,"Reverendo Luis Paiva",971543023,"Elias Figueredo", cuentaA);
        this.clientes[1] = new Empresa("6632458","-",6632458,"Capiata City",961951348,"Capiateña SA",cuentaB);
                            
    }
    
    public void set_Datos(Cliente[] clientes, Cliente cliente_final, Cuenta cuenta_final)
    {
        this.clientes = clientes;
        this.cliente_final = cliente_final;
        this.cuenta_final = cuenta_final;
    }
    
    
    
    /**
     * Método principal para ejecutar la aplicación.
     * Crea una instancia de GUI_Inicio_Sesion y la hace visible.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
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
            java.util.logging.Logger.getLogger(GUI_Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 GUI_Inicio_Sesion menuInicio = new GUI_Inicio_Sesion();
                 menuInicio.setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
