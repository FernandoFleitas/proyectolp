package Clases;

/**
 * La clase `Comprobante` representa un comprobante de transacción en el sistema bancario.
 *
 * <p>Este comprobante contiene información sobre la transacción, incluyendo el ID de la transacción,
 * el monto de la transacción y una descripción asociada.</p>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code set_id(int id)} - Establece el ID de la transacción.</li>
 *   <li>{@code set_monto(int monto)} - Establece el monto de la transacción.</li>
 *   <li>{@code set_descripcion(String descripcion)} - Establece la descripción de la transacción.</li>
 *   <li>{@code get_id()} - Obtiene el ID de la transacción.</li>
 *   <li>{@code get_monto()} - Obtiene el monto de la transacción.</li>
 *   <li>{@code get_descripcion()} - Obtiene la descripción de la transacción.</li>
 * </ul>
 * 
 * @author Hola
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
