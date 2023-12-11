/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author EJFR0
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
