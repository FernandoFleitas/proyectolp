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
    private String Cuenta;

    // Constructor
    public Tarjeta_Debito(int N_Tarjeta, int Saldo, String FechaVencimiento, int CVC, String Cuenta) {
        super(N_Tarjeta, Saldo, FechaVencimiento, CVC);
        this.Cuenta = Cuenta;
    }

    // Getter y setter específico para Cuenta
    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }
}