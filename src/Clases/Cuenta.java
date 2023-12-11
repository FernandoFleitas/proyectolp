/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 * La clase Cuenta representa una cuenta asociada a un cliente en el sistema de banca en línea.
 * 
 * <p><strong>Atributos:</strong></p>
 * <ul>
 *   <li>{@code ID} - Identificador único de la cuenta.</li>
 *   <li>{@code pin_transaccion} - PIN de transacción asociado a la cuenta.</li>
 *   <li>{@code saldo} - Saldo actual de la cuenta.</li>
 *   <li>{@code tarjetas} - Lista de tarjetas de crédito asociadas a la cuenta.</li>
 *   <li>{@code Movimientos} - Lista de movimientos asociados a la cuenta.</li>
 *   <li>{@code tarjeta_debito} - Tarjeta de débito asociada a la cuenta.</li>
 * </ul>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code Cuenta(int ID, int pin_transaccion, int saldo)} - Constructor que inicializa una cuenta con la información proporcionada.</li>
 *   <li>{@code getID()} - Devuelve el identificador único de la cuenta.</li>
 *   <li>{@code setID(int ID)} - Establece el identificador único de la cuenta.</li>
 *   <li>{@code getPinTransaccion()} - Devuelve el PIN de transacción de la cuenta.</li>
 *   <li>{@code setPinTransaccion(int pin_transaccion)} - Establece el PIN de transacción de la cuenta.</li>
 *   <li>{@code getSaldo()} - Devuelve el saldo actual de la cuenta.</li>
 *   <li>{@code setSaldo(int saldo)} - Establece el saldo actual de la cuenta.</li>
 *   <li>{@code getTarjetas()} - Devuelve la lista de tarjetas de crédito asociadas a la cuenta.</li>
 *   <li>{@code setTarjetas(Tarjeta_Credito tarjeta)} - Añade una tarjeta de crédito a la lista de tarjetas asociadas a la cuenta.</li>
 *   <li>{@code getMovimientos()} - Devuelve la lista de movimientos asociados a la cuenta.</li>
 *   <li>{@code setMovimientos(Comprobante comprobante)} - Añade un comprobante a la lista de movimientos asociados a la cuenta.</li>
 *   <li>{@code getTarjeta_debito()} - Devuelve la tarjeta de débito asociada a la cuenta.</li>
 *   <li>{@code setTarjeta_debito(Tarjeta_Debito tarjeta_debito)} - Establece la tarjeta de débito asociada a la cuenta.</li>
 * </ul>
 *
 * <p>Esta clase representa una cuenta asociada a un cliente en el sistema de banca en línea.</p>
 * 
 * <p><strong>Autor:</strong> EJFR0</p>
 * @version 1.0
 */
public class Cuenta {
    
    /** Identificador único de la cuenta. */
    private int ID;
    /** PIN de transacción asociado a la cuenta. */
    private int pin_transaccion;
    /** Saldo actual de la cuenta. */
    private int saldo;
    /** Lista de tarjetas de crédito asociadas a la cuenta. */
    private ArrayList<Tarjeta_Credito> tarjetas;
    /** Lista de movimientos asociados a la cuenta. */
    private ArrayList<Comprobante> Movimientos;
    /** Tarjeta de débito asociada a la cuenta. */
    private Tarjeta_Debito tarjeta_debito;

    /**
     * Constructor que inicializa una cuenta con la información proporcionada.
     * @param ID Identificador único de la cuenta.
     * @param pin_transaccion PIN de transacción asociado a la cuenta.
     * @param saldo Saldo actual de la cuenta.
     */
    public Cuenta(int ID, int pin_transaccion, int saldo) {
        
        this.ID = ID;
        this.pin_transaccion = pin_transaccion;
        this.saldo = saldo;
        this.tarjetas = new ArrayList<Tarjeta_Credito>();
        this.Movimientos = new ArrayList<Comprobante>();
        
    }

    /**
     * Devuelve el identificador único de la cuenta.
     * @return El identificador único de la cuenta.
     */
    public int getID() {
        return ID;
    }

    /**
     * Establece el identificador único de la cuenta.
     * @param ID El nuevo identificador único de la cuenta.
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Devuelve el PIN de transacción de la cuenta.
     * @return El PIN de transacción de la cuenta.
     */
    public int getPinTransaccion() {
        return pin_transaccion;
    }

    /**
     * Establece el PIN de transacción de la cuenta.
     * @param pin_transaccion El nuevo PIN de transacción de la cuenta.
     */
    public void setPinTransaccion(int pin_transaccion) {
        this.pin_transaccion = pin_transaccion;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return El saldo actual de la cuenta.
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo actual de la cuenta.
     * @param saldo El nuevo saldo actual de la cuenta.
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
        tarjeta_debito.setSaldo(saldo);
    }

    /**
     * Devuelve la lista de tarjetas de crédito asociadas a la cuenta.
     * @return La lista de tarjetas de crédito asociadas a la cuenta.
     */
    public ArrayList<Tarjeta_Credito> getTarjetas() {
        return tarjetas;
    }
    

    /**
     * Añade una tarjeta de crédito a la lista de tarjetas asociadas a la cuenta.
     * @param tarjeta La tarjeta de crédito a añadir.
     */
    public void setTarjetas(Tarjeta_Credito tarjeta){
        tarjetas.add (tarjeta);
    }

    /**
     * Devuelve la lista de movimientos asociados a la cuenta.
     * @return La lista de movimientos asociados a la cuenta.
     */
    public ArrayList<Comprobante> getMovimientos() {
        return Movimientos;
    }
    
    /**
     * Añade un comprobante a la lista de movimientos asociados a la cuenta.
     * @param comprobante El comprobante a añadir.
     */
    public void setMovimientos(Comprobante comprobante){
        Movimientos.add(comprobante);
    }

    /**
     * Devuelve la tarjeta de débito asociada a la cuenta.
     * @return La tarjeta de débito asociada a la cuenta.
     */
    public Tarjeta_Debito getTarjeta_debito() {
        return tarjeta_debito;
    }

    /**
     * Establece la tarjeta de débito asociada a la cuenta.
     * @param tarjeta_debito La nueva tarjeta de débito asociada a la cuenta.
     */
    public void setTarjeta_debito(Tarjeta_Debito tarjeta_debito) {
        this.tarjeta_debito = tarjeta_debito;
    }
    
}
