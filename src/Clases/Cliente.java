/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * La clase `Cliente` representa a un cliente del sistema bancario.
 *
 * <p>Esta clase contiene información como el número de cédula de identidad o RUC del cliente,
 * la razón social en caso de ser una empresa, el PIN de seguridad, la dirección, el número de teléfono,
 * el nombre del cliente y un arreglo de cuentas asociadas a él.</p>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code get_ci_ruc()} - Devuelve el número de cédula de identidad o RUC del cliente.</li>
 *   <li>{@code set_ci_ruc(String ci_ruc)} - Establece el número de cédula de identidad o RUC del cliente.</li>
 *   <li>{@code get_razon_social()} - Devuelve la razón social del cliente (en caso de ser una empresa).</li>
 *   <li>{@code set_razon_social(String razon_social)} - Establece la razón social del cliente.</li>
 *   <li>{@code get_pin()} - Devuelve el PIN de seguridad asociado al cliente.</li>
 *   <li>{@code set_pin(int pin)} - Establece el PIN de seguridad asociado al cliente.</li>
 *   <li>{@code get_direccion()} - Devuelve la dirección del cliente.</li>
 *   <li>{@code set_direccion(String direccion)} - Establece la dirección del cliente.</li>
 *   <li>{@code get_telefono()} - Devuelve el número de teléfono del cliente.</li>
 *   <li>{@code set_telefono(int telefono)} - Establece el número de teléfono del cliente.</li>
 *   <li>{@code set_Cuenta(Cuenta[] cuenta)} - Establece las cuentas asociadas al cliente.</li>
 *   <li>{@code get_Cuenta()} - Devuelve el arreglo de cuentas asociadas al cliente.</li>
 *   <li>{@code get_nombre()} - Devuelve el nombre del cliente.</li>
 * </ul>
 * 
 * @author EJFR0
 */
public class Cliente {
    
    /** Número de cédula de identidad o RUC del cliente. */
    private String ci_ruc;
    /** Razón social del cliente (en caso de ser una empresa). */
    private String razon_social; 
    /** PIN de seguridad asociado al cliente. */
    private int pin; 
    /** Dirección del cliente. */
    private String direccion;
    /** Número de teléfono del cliente. */
    private int telefono;
    /** Nombre del cliente. */
    private String nombre;
    /** Arreglo de cuentas asociadas al cliente. */
    private Cuenta[] cuenta;
    
    /**
     * Constructor que inicializa un cliente con la información proporcionada.
     * @param ci_ruc Número de cédula de identidad o RUC del cliente.
     * @param razon_social Razón social del cliente (en caso de ser una empresa).
     * @param pin PIN de seguridad asociado al cliente.
     * @param direccion Dirección del cliente.
     * @param telefono Número de teléfono del cliente.
     * @param cuenta Arreglo de cuentas asociadas al cliente.
     * @param nombre Nombre del cliente.
     */
    public Cliente(String ci_ruc, String razon_social, int pin, String direccion, int telefono, Cuenta[] cuenta, String nombre) {
        this.ci_ruc = ci_ruc;
        this.razon_social = razon_social;
        this.direccion = direccion; 
        this.telefono = telefono; 
        this.pin = pin;
        this.cuenta = cuenta;
        this.nombre = nombre;
    }
    
    /**
     * Devuelve el número de cédula de identidad o RUC del cliente.
     * @return El número de cédula de identidad o RUC del cliente.
     */
    public String get_ci_ruc() {
        return ci_ruc;
    }

    /**
     * Establece el número de cédula de identidad o RUC del cliente.
     * @param ci_ruc El nuevo número de cédula de identidad o RUC del cliente.
     */
    public void set_ci_ruc(String ci_ruc) {
        this.ci_ruc = ci_ruc;
    }

    /**
     * Devuelve la razón social del cliente (en caso de ser una empresa).
     * @return La razón social del cliente.
     */
    public String get_razon_social() {
        return razon_social;
    }

    /**
     * Establece la razón social del cliente.
     * @param razon_social La nueva razón social del cliente.
     */
    public void set_razon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    /**
     * Devuelve el PIN de seguridad asociado al cliente.
     * @return El PIN de seguridad asociado al cliente.
     */
    public int get_pin() {
        return pin;
    }

    /**
     * Establece el PIN de seguridad asociado al cliente.
     * @param pin El nuevo PIN de seguridad asociado al cliente.
     */
    public void set_pin(int pin) {
        this.pin = pin;
    }

    /**
     * Devuelve la dirección del cliente.
     * @return La dirección del cliente.
     */
    public String get_direccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente.
     * @param direccion La nueva dirección del cliente.
     */
    public void set_direccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el número de teléfono del cliente.
     * @return El número de teléfono del cliente.
     */
    public int get_telefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     * @param telefono El nuevo número de teléfono del cliente.
     */
    public void set_telefono(int telefono) {
        this.telefono = telefono;
    }
    
    /**
     * Establece las cuentas asociadas al cliente.
     * @param cuenta El nuevo arreglo de cuentas asociadas al cliente.
     */
    public void set_Cuenta(Cuenta[] cuenta) {
        this.cuenta = cuenta; 
    }
    
    /**
     * Devuelve el arreglo de cuentas asociadas al cliente.
     * @return El arreglo de cuentas asociadas al cliente.
     */
    public Cuenta[] get_Cuenta() {
        return cuenta;
    }
    
    /**
     * Devuelve el nombre del cliente.
     * @return El nombre del cliente.
     */
    public String get_nombre() {
        return nombre;
    }
}
