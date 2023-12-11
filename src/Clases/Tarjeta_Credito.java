/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * La clase `Tarjeta_Credito` extiende la clase base `Tarjeta` y representa una tarjeta de crédito
 * en el sistema.
 *
 * <p>Cada tarjeta de crédito tiene un límite de crédito adicional al número de tarjeta, saldo,
 * fecha de vencimiento y código de seguridad (CVC) heredados de la clase base.</p>
 *
 * <p><strong>Constructor:</strong></p>
 * <ul>
 *   <li>{@code Tarjeta_Credito(int N_Tarjeta, int Saldo, String FechaVencimiento, int CVC, int LimiteCredito)} -
 *   Crea una instancia de tarjeta de crédito con un número de tarjeta, saldo, fecha de vencimiento,
 *   CVC y límite de crédito específicos.</li>
 * </ul>
 *
 * <p><strong>Getter y Setter Específicos:</strong></p>
 * <ul>
 *   <li>{@code getLimiteCredito()} - Obtiene el límite de crédito de la tarjeta de crédito.</li>
 *   <li>{@code setLimiteCredito(int LimiteCredito)} - Establece el límite de crédito de la tarjeta de crédito.</li>
 * </ul>
 * 
 * <p>Los demás métodos y atributos son heredados de la clase base `Tarjeta`.</p>
 * 
 * @author [Nombre del Autor]
 */
public class Tarjeta_Credito extends Tarjeta {
    private int LimiteCredito;

    // Constructor
    public Tarjeta_Credito(int N_Tarjeta, int Saldo, String FechaVencimiento, int CVC, int LimiteCredito) {
        super(N_Tarjeta, Saldo, FechaVencimiento, CVC);
        this.LimiteCredito = LimiteCredito;
    }

    // Getter y setter específico para LimiteCredito
    public int getLimiteCredito() {
        return LimiteCredito;
    }

    public void setLimiteCredito(int LimiteCredito) {
        this.LimiteCredito = LimiteCredito;
    }
}
