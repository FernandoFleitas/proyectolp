/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import Clases.Cliente;
import Clases.Comprobante;
import Clases.Cuenta;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * La clase GUI_Estado_Cuenta representa la interfaz gráfica para mostrar el estado de cuenta de un cliente.
 * Permite visualizar información sobre el usuario, cuenta, tarjeta, saldo y movimientos.
 * 
 * <p>La clase utiliza la biblioteca Swing para la construcción de la interfaz gráfica y trabaja con objetos de las clases
 * {@link Cliente}, {@link Cuenta} y {@link Comprobante} para obtener y mostrar los datos necesarios.</p>
 *
 * <p><strong>Atributos:</strong></p>
 * <ul>
 *   <li>{@code clientes} - Array de objetos {@link Cliente} que almacena los clientes de la aplicación.</li>
 *   <li>{@code cliente_final} - Objeto {@link Cliente} que representa al cliente actual.</li>
 *   <li>{@code cuenta_final} - Objeto {@link Cuenta} que representa la cuenta asociada al cliente.</li>
 * </ul>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code GUI_Estado_Cuenta()} - Constructor que inicializa la interfaz.</li>
 *   <li>{@code set_Datos(Cliente[] clientes, Cliente cliente_final, Cuenta cuenta_final)} - Método para establecer los datos del cliente actual.</li>
 *   <li>{@code set_Usuario_Cuenta_Tarjeta_Saldo()} - Método para establecer y mostrar información sobre el usuario, cuenta, tarjeta y saldo.</li>
 *   <li>{@code agregarMovimientos()} - Método para agregar movimientos a la tabla de la interfaz.</li>
 * </ul>
 *
 * <p>Esta aplicación sigue el patrón de diseño Modelo-Vista-Controlador (MVC), donde esta clase sirve como parte de la vista.</p>
 * 
 * @author ferfe
 * @version 1.0
 * @see Cliente
 * @see Cuenta
 * @see Comprobante
 */
public class GUI_Estado_Cuenta extends javax.swing.JFrame {

    private Cliente[] clientes;
    private Cliente cliente_final;
    private Cuenta cuenta_final;
    

    /**
     * Constructor de la clase GUI_Estado_Cuenta.
     */
    public GUI_Estado_Cuenta() {
        initComponents();
    }
    
    /**
     * Método para establecer los datos del cliente actual.
     *
     * @param clientes Un array de objetos Cliente.
     * @param cliente_final El cliente actual.
     * @param cuenta_final La cuenta asociada al cliente.
     */
    public void set_Datos(Cliente[] clientes, Cliente cliente_final, Cuenta cuenta_final)
    {
        this.clientes = clientes;
        this.cliente_final = cliente_final;
        this.cuenta_final = cuenta_final;
        
    }
    /**
     * Método para establecer y mostrar información sobre el usuario, cuenta, tarjeta y saldo.
     */
    public void set_Usuario_Cuenta_Tarjeta_Saldo(){
        jLabel1.setText("Usuario: " + cliente_final.get_nombre());
        jLabel2.setText("Cuenta: "+ cuenta_final.getID());
        jLabel4.setText("Tarjeta Débito N°: "+ cuenta_final.getTarjeta_debito().getN_Tarjeta());
        jLabel3.setText("Saldo: "+ cuenta_final.getSaldo() + " Gs");
    }
    
    public void agregarMovimientos() {
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    
    
    for (Comprobante comprobante : cuenta_final.getMovimientos()) {
        Object[] row = {comprobante.get_descripcion(), comprobante.get_monto() + " Gs", comprobante.getFecha()};
        
        model.addRow(row);
    }

    // Agrega el evento del mouse a la tabla
    jTable2.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 1) {
                // Obtiene la fila y columna donde se hizo clic
                int fila = jTable2.getSelectedRow();
                int columna = jTable2.getSelectedColumn();

                // Verifica si se hizo clic en una celda válida
                if (fila != -1 && columna != -1) {
                    // Obtiene los datos de la fila seleccionada
                    String descripcion = jTable2.getValueAt(fila, 0).toString();
                    String monto = jTable2.getValueAt(fila, 1).toString();
                    String fecha = jTable2.getValueAt(fila, 2).toString();

                    
                    // Muestra los datos y la fecha/hora en un JOptionPane
                    String mensaje = "Descripción: " + descripcion + "\nMonto: " + monto+ "\nFecha y Hora: " + fecha;
                    JOptionPane.showMessageDialog(GUI_Estado_Cuenta.this, mensaje, "Comprobante", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    });
}
    /**
     * Este método es llamado desde el constructor para inicializar la forma.
     * ADVERTENCIA: No modifique este código. El contenido de este método siempre se regenera mediante el editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel1.setText("Usuario:------");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel2.setText("Cuenta:-------");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel3.setText("Saldo de la cuenta: --------------------");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setText("Tarjeta:-------");

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Conceptos", "Monto", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setText("Movimientos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Los argumentos de la línea de comandos.
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
            java.util.logging.Logger.getLogger(GUI_Estado_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Estado_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Estado_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Estado_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Estado_Cuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
