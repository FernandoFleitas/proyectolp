/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * La clase `Pago` representa un pago asociado a un servicio en el sistema bancario.
 *
 * <p>Un pago puede estar vinculado a un servicio específico y tiene información sobre el ID
 * del servicio, el monto del pago, el método de pago y el pago mínimo requerido.</p>
 *
 * <p><strong>Constructor:</strong></p>
 * <ul>
 *   <li>{@code Pago(int ID_Servicio, int PagoMin)} - Crea una instancia de pago con un servicio
 *   específico y el pago mínimo requerido.</li>
 * </ul>
 *
 * <p><strong>Getters y Setters:</strong></p>
 * <ul>
 *   <li>{@code getID_Transaccion()} - Obtiene el ID de la transacción.</li>
 *   <li>{@code setID_Transaccion(int ID_Transaccion)} - Establece el ID de la transacción.</li>
 *   <li>{@code getID_Servicio()} - Obtiene el ID del servicio asociado al pago.</li>
 *   <li>{@code setID_Servicio(int ID_Servicio)} - Establece el ID del servicio asociado al pago.</li>
 *   <li>{@code getMonto()} - Obtiene el monto del pago.</li>
 *   <li>{@code setMonto(int Monto)} - Establece el monto del pago.</li>
 *   <li>{@code getMetodoPago()} - Obtiene el método de pago asociado al pago.</li>
 *   <li>{@code setMetodoPago(int MetodoPago)} - Establece el método de pago asociado al pago.</li>
 *   <li>{@code getPagoMin()} - Obtiene el pago mínimo requerido.</li>
 *   <li>{@code setPagoMin(int PagoMin)} - Establece el pago mínimo requerido.</li>
 * </ul>
 * 
 * @author Vargas
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
