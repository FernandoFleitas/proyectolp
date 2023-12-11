package Hilos;

import Clases.Cuenta;
import Clases.Comprobante;
import javax.swing.JOptionPane;

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
        // Crea un menú externo a la app para realizar depósitos
        String inputMonto = JOptionPane.showInputDialog(null, "Ingrese Monto a depositar:", "Comprobante", JOptionPane.PLAIN_MESSAGE);

        // Verificar si el usuario ha cancelado la operación
        if (inputMonto == null) {
            return; // Salir del método si se ha cancelado la operación
        }

        try {
            int monto = Integer.parseInt(inputMonto);

            if (monto > 0) {
                cuenta_final.setSaldo(cuenta_final.getSaldo() + monto);

                // Crear un comprobante de depósito
                Comprobante comprobante = new Comprobante();
                comprobante.set_id(cuenta_final.getMovimientos().size() + 1);
                comprobante.set_descripcion("Deposito");
                comprobante.set_monto(monto);
                comprobante.imprimir();

                // Agregar el comprobante a la lista de movimientos de la cuenta
                cuenta_final.setMovimientos(comprobante);
            } else if (monto < -1) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero positivo válido.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero válido.");
        }
    }
}
