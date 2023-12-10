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
 *
 * @author joser
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
