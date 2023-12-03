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
 *   <li>{@code tarjeta_debito} - Número de tarjeta de débito asociada a la cuenta.</li>
 * </ul>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code Cuenta(int ID, int pin_transaccion, int saldo, int tarjeta_debito)} - Constructor que inicializa una cuenta con la información proporcionada.</li>
 *   <li>{@code getID()} - Devuelve el identificador único de la cuenta.</li>
 *   <li>{@code setID(int ID)} - Establece el identificador único de la cuenta.</li>
 *   <li>{@code getPinTransaccion()} - Devuelve el PIN de transacción de la cuenta.</li>
 *   <li>{@code setPinTransaccion(int pin_transaccion)} - Establece el PIN de transacción de la cuenta.</li>
 *   <li>{@code getSaldo()} - Devuelve el saldo actual de la cuenta.</li>
 *   <li>{@code setSaldo(int saldo)} - Establece el saldo actual de la cuenta.</li>
 *   <li>{@code getTarjetaDebito()} - Devuelve el número de tarjeta de débito asociada a la cuenta.</li>
 *   <li>{@code setTarjetaDebito(int tarjeta_debito)} - Establece el número de tarjeta de débito asociada a la cuenta.</li>
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
    /** Número de tarjeta de débito asociada a la cuenta. */
    private int tarjeta_debito;
    
    private ArrayList<Comprobante> Movimientos;

    /**
     * Constructor que inicializa una cuenta con la información proporcionada.
     * @param ID Identificador único de la cuenta.
     * @param pin_transaccion PIN de transacción asociado a la cuenta.
     * @param saldo Saldo actual de la cuenta.
     * @param tarjeta_debito Número de tarjeta de débito asociada a la cuenta.
     */
    public Cuenta(int ID, int pin_transaccion, int saldo, int tarjeta_debito) {
        
        this.ID = ID;
        this.pin_transaccion = pin_transaccion;
        this.saldo = saldo;
        this.tarjeta_debito = tarjeta_debito;
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
    }

    /**
     * Devuelve el número de tarjeta de débito asociada a la cuenta.
     * @return El número de tarjeta de débito asociada a la cuenta.
     */
    public int getTarjetaDebito() {
        return tarjeta_debito;
    }

    /**
     * Establece el número de tarjeta de débito asociada a la cuenta.
     * @param tarjeta_debito El nuevo número de tarjeta de débito asociada a la cuenta.
     */
    public void setTarjetaDebito(int tarjeta_debito) {
        this.tarjeta_debito = tarjeta_debito;
    }
    
    public ArrayList<Comprobante> getMovimientos(){
        return Movimientos;
    }
}

