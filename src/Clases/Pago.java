/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author EJFR0
 */
public class Pago {
    private int ID_Transaccion;
    private int ID_Servicio;
    private int Monto;
    private int MetodoPago;
    private int PagoMin;

    

    // Constructor
    public Pago(int ID_Servicio, int PagoMin) {
        this.ID_Servicio = ID_Servicio;
        this.MetodoPago = 0;
        this.PagoMin = PagoMin;
    }

    // Getters y setters
    public int getID_Transaccion() {
        return ID_Transaccion;
    }

    public void setID_Transaccion(int ID_Transaccion) {
        this.ID_Transaccion = ID_Transaccion;
    }

    public int getID_Servicio() {
        return ID_Servicio;
    }

    public void setID_Servicio(int ID_Servicio) {
        this.ID_Servicio = ID_Servicio;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public int getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(int MetodoPago) {
        this.MetodoPago = MetodoPago;
    }
    public void setPagoMin(int PagoMin) {
        this.PagoMin = PagoMin;
    }

    public int getPagoMin() {
        return PagoMin;
    }
}
