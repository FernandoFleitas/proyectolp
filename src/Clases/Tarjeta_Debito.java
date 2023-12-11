/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author EJFR0
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