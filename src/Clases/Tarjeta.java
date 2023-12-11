/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author EJFR0
 */
public class Tarjeta {
    protected int N_Tarjeta;
    protected int Saldo;
    protected String FechaVencimiento;
    protected int CVC;

    // Constructor
    public Tarjeta(int N_Tarjeta, int Saldo, String FechaVencimiento, int CVC) {
        this.N_Tarjeta = N_Tarjeta;
        this.Saldo = Saldo;
        this.FechaVencimiento = FechaVencimiento;
        this.CVC = CVC;
    }

    // Getters y setters
    public int getN_Tarjeta() {
        return N_Tarjeta;
    }

    public void setN_Tarjeta(int N_Tarjeta) {
        this.N_Tarjeta = N_Tarjeta;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }
}