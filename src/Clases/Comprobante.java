package Clases;

/**
 * Clase que representa un comprobante de transacción.
 */
public class Comprobante {
    // Atributos
    private int ID_Transaccion;
    private int monto;
    private String descripcion;

    /**
     * Establece el ID de la transacción.
     *
     * @param id El ID de la transacción.
     */
    public void set_id(int id) {
        this.ID_Transaccion = id;
    }

    /**
     * Establece el monto de la transacción.
     *
     * @param monto El monto de la transacción.
     */
    public void set_monto(int monto) {
        this.monto = monto;
    }

    /**
     * Establece la descripción de la transacción.
     *
     * @param descripcion La descripción de la transacción.
     */
    public void set_descripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el ID de la transacción.
     *
     * @return El ID de la transacción.
     */
    public int get_id() {
        return ID_Transaccion;
    }

    /**
     * Obtiene el monto de la transacción.
     *
     * @return El monto de la transacción.
     */
    public int get_monto() {
        return monto;
    }

    /**
     * Obtiene la descripción de la transacción.
     *
     * @return La descripción de la transacción.
     */
    public String get_descripcion() {
        return descripcion;
    }
}
