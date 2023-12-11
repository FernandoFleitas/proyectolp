/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * La clase `Servicio` representa un servicio asociado a transacciones en el sistema bancario.
 *
 * <p>Cada servicio tiene un identificador único (ID) y un nombre que lo identifica.</p>
 *
 * <p><strong>Constructor:</strong></p>
 * <ul>
 *   <li>{@code Servicio(int ID, String Nombre)} - Crea una instancia de servicio con un ID
 *   específico y un nombre.</li>
 * </ul>
 *
 * <p><strong>Getters y Setters:</strong></p>
 * <ul>
 *   <li>{@code getID()} - Obtiene el ID del servicio.</li>
 *   <li>{@code setID(int ID)} - Establece el ID del servicio.</li>
 *   <li>{@code getNombre()} - Obtiene el nombre del servicio.</li>
 *   <li>{@code setNombre(String Nombre)} - Establece el nombre del servicio.</li>
 * </ul>
 * 
 * @author 
 */
public class Servicio {
    private int ID;
    private String Nombre;

    // Constructor
    public Servicio(int ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
    }
    // Getters y setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
