/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * La clase `Tarjeta_Debito` extiende la clase base `Tarjeta` y representa una tarjeta de débito
 * en el sistema.
 *
 * <p>Cada tarjeta de débito tiene un número de tarjeta, saldo, fecha de vencimiento y código de seguridad (CVC)
 * heredados de la clase base. Además, puede estar asociada a una cuenta específica.</p>
 *
 * <p><strong>Constructor:</strong></p>
 * <ul>
 *   <li>{@code Tarjeta_Debito(int N_Tarjeta, int Saldo, String FechaVencimiento, int CVC)} -
 *   Crea una instancia de tarjeta de débito con un número de tarjeta, saldo, fecha de vencimiento y
 *   CVC específicos.</li>
 * </ul>
 *
 * <p><strong>Getter y Setter Específicos:</strong></p>
 * <ul>
 *   <li>{@code getCuenta()} - Obtiene la cuenta asociada a la tarjeta de débito (puede ser {@code null} si no está asociada).</li>
 *   <li>{@code setCuenta(Cuenta cuenta)} - Asocia una cuenta específica a la tarjeta de débito.</li>
 * </ul>
 * 
 * <p>Los demás métodos y atributos son heredados de la clase base `Tarjeta`.</p>
 * 
 * @author Hola
 */
public class Tarjeta_Debito extends Tarjeta {
    private Cuenta cuenta;

    // Constructor
    public Tarjeta_Debito(int N_Tarjeta, int Saldo, String FechaVencimiento, int CVC) {
        super(N_Tarjeta, Saldo, FechaVencimiento, CVC);
    }

    // Getter y setter específico para Cuenta
    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}