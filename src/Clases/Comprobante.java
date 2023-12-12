package Clases;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

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
 *   <li>{@code getFecha()} - Obtiene la fecha y hora de la transacción.</li>
 *   <li>{@code imprimir()} - Muestra los detalles de la transacción en un JOptionPane.</li>
 * </ul>
 * 
 * <p><strong>Atributos:</strong></p>
 * <ul>
 *   <li>{@code ID_Transaccion} - El ID de la transacción.</li>
 *   <li>{@code monto} - El monto de la transacción.</li>
 *   <li>{@code descripcion} - La descripción de la transacción.</li>
 *   <li>{@code fecha} - La fecha y hora de la transacción.</li>
 * </ul>
 * 
 * <p><strong>Constructor:</strong></p>
 * <ul>
 *   <li>{@code Comprobante()} - Crea una instancia de la clase con la fecha y hora actuales.</li>
 * </ul>
 * 
 * @author Hola
 */
public class Comprobante {
    // Atributos
    private int ID_Transaccion;
    private int monto;
    private String descripcion;
    private String fecha;

    /**
     * Constructor que inicializa la fecha y hora actuales.
     */
    public Comprobante(){
        // Obtiene la fecha y hora actuales
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaHoraActual = ahora.format(formatter);
        this.fecha = fechaHoraActual;
    }
    
    /**
     * Establece el ID de la transacción.
     *
     * @param id El ID de la transacción.
     */
    public void set_id(int id) {
        this.ID_Transaccion = id;
    }
    
    /**
     * Obtiene la fecha y hora de la transacción.
     *
     * @return La fecha y hora de la transacción.
     */
    public String getFecha(){
        return fecha;
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
     
    /**
     * Muestra los datos de la transacción en un JOptionPane.
     */
    public void imprimir(){
        // Muestra los datos y la fecha/hora en un JOptionPane
        String mensaje = "Descripción: " + descripcion + "\nMonto: " + monto+ "\nFecha y Hora: " + fecha;
        JOptionPane.showMessageDialog( null, mensaje, "Comprobante", JOptionPane.INFORMATION_MESSAGE);
    }
}
