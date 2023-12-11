package Hilos;
import Clases.Cuenta;
import GUI.GUI_Ventana_Principal;
import Clases.Tarjeta_Credito;
import GUI.GUI_Pago_Tarjetas;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joser
 */
public class Hilo_Pago_Tarjeta extends Thread{
    private Tarjeta_Credito [] tarjetas;
    Cuenta cuenta_final;
    GUI_Ventana_Principal ventana_principal;
    
    public Hilo_Pago_Tarjeta(Tarjeta_Credito[] tarjetas,Cuenta cuenta_final,GUI_Ventana_Principal ventana_principal){
        this.cuenta_final = cuenta_final;
        this.tarjetas = tarjetas;
        this.ventana_principal = ventana_principal;
    }
    
    public void run(){
        GUI_Pago_Tarjetas menu_Tarjetas = new GUI_Pago_Tarjetas();
        menu_Tarjetas.setVisible(true);
        menu_Tarjetas.InicializarPagoTarjetas(tarjetas, cuenta_final, ventana_principal);
        menu_Tarjetas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
