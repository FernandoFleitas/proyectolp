/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;
import GUI.GUI_Transferencias;
import GUI.GUI_Ventana_Principal;
import Clases.Cliente;
import Clases.Cuenta;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 * La clase `Hilo_Transferencia` extiende la clase `Thread` y representa un hilo para la funcionalidad
 * de transferencias en el sistema bancario.
 *
 * <p>Este hilo se encarga de crear y mostrar la interfaz gráfica de usuario para realizar transferencias
 * entre cuentas.</p>
 *
 * <p><strong>Constructor:</strong></p>
 * <ul>
 *   <li>{@code Hilo_Transferencia(Cliente[] clientes, Cliente cliente_final, Cuenta cuenta_final,
 *   GUI_Ventana_Principal ventana_principal)} - Crea una instancia de hilo de transferencia con la información
 *   necesaria para su ejecución.</li>
 * </ul>
 *
 * <p><strong>Método `run`:</strong></p>
 * <ul>
 *   <li>{@code run()} - Implementa la lógica del hilo, creando y mostrando la interfaz gráfica de transferencias.</li>
 * </ul>
 *
 * <p>El hilo utiliza una instancia de la clase `GUI_Transferencias` para la interfaz gráfica y
 * se asegura de que la interfaz se cierre correctamente al finalizar.</p>
 * 
 * @author Hola
 */
public class Hilo_Transferencia extends Thread {
    Cliente []clientes;
    Cliente cliente_final;
    Cuenta cuenta_final;
    GUI_Ventana_Principal ventana_principal;
    
    public Hilo_Transferencia(Cliente []clientes, Cliente cliente_final, Cuenta cuenta_final, GUI_Ventana_Principal ventana_principal){
        this.clientes = clientes;
        this.cliente_final = cliente_final;
        this.cuenta_final = cuenta_final;
        this.ventana_principal = ventana_principal;
    }
        
    public void run(){
        GUI_Transferencias MenuTransferencias = new GUI_Transferencias();
        MenuTransferencias.set_Datos(clientes, cliente_final, cuenta_final,ventana_principal);
        MenuTransferencias.setVisible(true);
        MenuTransferencias.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
