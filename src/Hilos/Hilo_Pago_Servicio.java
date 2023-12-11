/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import Clases.Cliente;
import Clases.Cuenta;
import Clases.Pago;
import Clases.Servicio;
import Clases.Tarjeta_Credito;
import GUI.GUI_Pago_Servicios;
import GUI.GUI_Ventana_Principal;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author joser
 */
public class Hilo_Pago_Servicio extends Thread{
    private Pago[] pagos;
    private Servicio[] servicios;
    private Cuenta cuenta_final;
    private Cliente cliente_final;
    private Tarjeta_Credito[] tarjetas;
    private GUI_Ventana_Principal menu_principal;
    
    public Hilo_Pago_Servicio(Pago[] pagos, Servicio[] servicios ,Cuenta cuenta_final, Cliente cliente_final, Tarjeta_Credito[] tarjetas, GUI_Ventana_Principal menu_principal){
        this.pagos = pagos;
        this.servicios = servicios;
        this.cuenta_final = cuenta_final;
        this.cliente_final = cliente_final;
        this.tarjetas = tarjetas;
        this.menu_principal = menu_principal;
    }
    
    public void run(){
        GUI_Pago_Servicios menu_Servicios = new GUI_Pago_Servicios();
        menu_Servicios.setVisible(true);
        menu_Servicios.InicializarTodo(pagos, servicios, cuenta_final, cliente_final, tarjetas, menu_principal);
        menu_Servicios.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
