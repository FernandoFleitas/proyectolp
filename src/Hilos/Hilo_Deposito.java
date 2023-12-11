/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import Clases.Cuenta;
import java.util.Scanner;
import Clases.Comprobante;

/**
 * Esta clase representa un hilo para realizar operaciones de depósito en una cuenta.
 * El hilo solicita al usuario ingresar un monto a depositar y realiza la operación
 * si el monto ingresado es un número entero positivo.
 *
 * @author joser
 */
public class Hilo_Deposito extends Thread {

    /**
     * La cuenta en la que se realizará el depósito.
     */
    private Cuenta cuenta_final;

    /**
     * Constructor que inicializa el hilo con la cuenta especificada.
     *
     * @param cuenta_final La cuenta en la que se realizarán los depósitos.
     */
    public Hilo_Deposito(Cuenta cuenta_final) {
        this.cuenta_final = cuenta_final;
    }

    /**
     * Método que se ejecuta cuando el hilo es iniciado. Solicita al usuario ingresar
     * un monto a depositar y realiza la operación si el monto es un número entero positivo.
     */
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
            cuenta_final.setSaldo(cuenta_final.getSaldo() + monto);
            System.out.println("Depósito exitoso: Gs" + monto);

            // Crear un comprobante de depósito
            Comprobante comprobante = new Comprobante();
            comprobante.set_id(cuenta_final.getMovimientos().size() + 1);
            comprobante.set_descripcion("Deposito");
            comprobante.set_monto(monto);

            // Agregar el comprobante a la lista de movimientos de la cuenta
            cuenta_final.setMovimientos(comprobante);
        } else {
            System.out.println("Por favor, ingrese un número entero positivo válido.");
        }
    }
}
