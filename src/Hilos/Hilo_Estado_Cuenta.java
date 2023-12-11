/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;
import GUI.GUI_Estado_Cuenta;
import GUI.GUI_Ventana_Principal;
import Clases.Cliente;
import Clases.Cuenta;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

import GUI.GUI_Estado_Cuenta;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;



/**
 *
 * @author joser
 */
public class Hilo_Estado_Cuenta extends Thread{
    Cliente []clientes;
    Cliente cliente_final;
    Cuenta cuenta_final;
    
    public Hilo_Estado_Cuenta(Cliente []clientes, Cliente cliente_final, Cuenta cuenta_final){
        this.clientes = clientes;
        this.cliente_final = cliente_final;
        this.cuenta_final = cuenta_final;
    }
    
    public void run(){
        GUI_Estado_Cuenta menu_Estado = new GUI_Estado_Cuenta();
        menu_Estado.setVisible(true);
        menu_Estado.set_Datos(clientes,cliente_final,cuenta_final);
        menu_Estado.set_Usuario_Cuenta_Tarjeta_Saldo();
        menu_Estado.agregarMovimientos();
        menu_Estado.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
