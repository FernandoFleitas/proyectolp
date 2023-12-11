/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;
import Clases.Cuenta;
import java.util.Scanner;
import Clases.Comprobante;

/**
 *
 * @author joser
 */
public class Hilo_Deposito extends Thread {
    private Cuenta cuenta_final;
    
    public Hilo_Deposito(Cuenta cuenta_final){
        this.cuenta_final = cuenta_final;
    }
    
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        // Crea un menú externo a la app para realizar depósitos
        
        System.out.println("Ingrese Monto a depositar:");

        // Verifica si la entrada es un entero positivo
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número entero positivo válido.");
            scanner.next(); // Limpiar el búfer de entrada
        }

        int monto = scanner.nextInt();

        if (monto > 0) {
            cuenta_final.setSaldo(cuenta_final.getSaldo()+monto);
            System.out.println("Depósito exitoso: Gs" + monto);
            Comprobante comprobante = new Comprobante();
            comprobante.set_id(cuenta_final.getMovimientos().size()+1);
            comprobante.set_descripcion("Deposito");
            comprobante.set_monto(monto);
            cuenta_final.setMovimientos(comprobante);
        } else {
            System.out.println("Por favor, ingrese un número entero positivo válido.");
        }

    }
}
