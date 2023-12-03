/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * La clase Empresa representa a un cliente de tipo empresa en el sistema de banca en línea.
 * Hereda de la clase {@link Cliente} y agrega un atributo adicional para el nombre de la empresa.
 * 
 * <p><strong>Atributos:</strong></p>
 * <ul>
 *   <li>{@code nombre} - Cadena que representa el nombre de la empresa.</li>
 * </ul>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code Empresa(String ci_ruc, String razon_social, int pin, String direccion, int telefono, String nombre, Cuenta[] cuenta)} - Constructor que inicializa una empresa con la información proporcionada.</li>
 * </ul>
 *
 * <p>Esta clase representa a un cliente de tipo empresa en el sistema de banca en línea.</p>
 * 
 * <p><strong>Autor:</strong> EJFR0</p>
 * @version 1.0
 * @see Cliente
 */
public class Empresa extends Cliente {

    /** Cadena que representa el nombre de la empresa. */
    private String nombre;

    /**
     * Constructor que inicializa una empresa con la información proporcionada.
     * @param ci_ruc Número de documento o RUC de la empresa.
     * @param razon_social Razón social de la empresa.
     * @param pin PIN de acceso de la empresa.
     * @param direccion Dirección de la empresa.
     * @param telefono Número de teléfono de la empresa.
     * @param nombre Nombre de la empresa.
     * @param cuenta Arreglo de cuentas asociadas a la empresa.
     */
    public Empresa(String ci_ruc, String razon_social, int pin, String direccion, int telefono, String nombre, Cuenta[] cuenta) {
        super(ci_ruc, razon_social, pin, direccion, telefono, cuenta, nombre);
    }
    
    // Puedes agregar métodos adicionales según sea necesario para la clase Empresa
}

