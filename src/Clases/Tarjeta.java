/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * La clase `Tarjeta` representa una tarjeta bancaria en el sistema.
 *
 * <p>Cada tarjeta tiene un número único de tarjeta, un saldo asociado, una fecha de vencimiento
 * y un código de seguridad (CVC).</p>
 *
 * <p><strong>Constructor:</strong></p>
 * <ul>
 *   <li>{@code Tarjeta(int N_Tarjeta, int Saldo, String FechaVencimiento, int CVC)} - Crea una
 *   instancia de tarjeta con un número de tarjeta, saldo, fecha de vencimiento y CVC específicos.</li>
 * </ul>
 *
 * <p><strong>Getters y Setters:</strong></p>
 * <ul>
 *   <li>{@code getN_Tarjeta()} - Obtiene el número de la tarjeta.</li>
 *   <li>{@code setN_Tarjeta(int N_Tarjeta)} - Establece el número de la tarjeta.</li>
 *   <li>{@code getSaldo()} - Obtiene el saldo asociado a la tarjeta.</li>
 *   <li>{@code setSaldo(int Saldo)} - Establece el saldo asociado a la tarjeta.</li>
 *   <li>{@code getFechaVencimiento()} - Obtiene la fecha de vencimiento de la tarjeta.</li>
 *   <li>{@code setFechaVencimiento(String FechaVencimiento)} - Establece la fecha de vencimiento de
 *   la tarjeta.</li>
 *   <li>{@code getCVC()} - Obtiene el código de seguridad (CVC) de la tarjeta.</li>
 *   <li>{@code setCVC(int CVC)} - Establece el código de seguridad (CVC) de la tarjeta.</li>
 * </ul>
 * 
 * @author [Hola]
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