/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * La clase Individuo representa a un cliente individual en el sistema de banca en línea.
 * Hereda de la clase {@link Cliente} y agrega un atributo adicional para el nombre del individuo.
 * 
 * <p><strong>Atributos:</strong></p>
 * <ul>
 *   <li>{@code nombre} - Cadena que representa el nombre del individuo.</li>
 * </ul>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code Individuo(String ci_ruc, String razon_social, int pin, String direccion, int telefono, String nombre, Cuenta[] cuenta)} - Constructor que inicializa un individuo con la información proporcionada.</li>
 * </ul>
 *
 * <p>Esta clase representa a un cliente individual en el sistema de banca en línea.</p>
 * 
 * <p><strong>Autor:</strong> EJFR0</p>
 * @version 1.0
 * @see Cliente
 */
public class Individuo extends Cliente {

    /** Cadena que representa el nombre del individuo. */
    private String nombre;

    /**
     * Constructor que inicializa un individuo con la información proporcionada.
     * @param ci_ruc Número de documento o RUC del individuo.
     * @param razon_social Razón social del individuo (en este caso, se ignora).
     * @param pin PIN de acceso del individuo.
     * @param direccion Dirección del individuo.
     * @param telefono Número de teléfono del individuo.
     * @param nombre Nombre del individuo.
     * @param cuenta Arreglo de cuentas asociadas al individuo.
     */
    public Individuo(String ci_ruc, String razon_social, int pin, String direccion, int telefono, String nombre, Cuenta[] cuenta) {
        super(ci_ruc, razon_social, pin, direccion, telefono, cuenta, nombre);
    }
}



