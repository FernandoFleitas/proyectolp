/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;
import GUI.GUI_Ayuda;

/**
 * La clase ClaseHilo1 extiende la clase Thread y se utiliza para ejecutar operaciones en un hilo separado
 * relacionadas con la interfaz gráfica de la clase {@link GUI_Ayuda}.
 * 
 * <p><strong>Atributos:</strong></p>
 * <ul>
 *   <li>{@code MenuAyuda} - Instancia de la clase {@link GUI_Ayuda} que representa el menú de ayuda.</li>
 * </ul>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code ClaseHilo1(GUI_Ayuda MenuAyuda)} - Constructor que inicializa el hilo con una instancia de {@link GUI_Ayuda}.</li>
 *   <li>{@code run()} - Método que se ejecuta cuando el hilo comienza. Invoca el método {@code ListaNombres()} de {@code MenuAyuda}.</li>
 * </ul>
 *
 * <p>Esta clase se utiliza para realizar operaciones en segundo plano relacionadas con la interfaz de usuario,
 * permitiendo una ejecución más eficiente y receptiva de la aplicación.</p>
 * 
 * @author EJFR0
 * @version 1.0
 * @see GUI_Ayuda
 */
public class ClaseHilo1 extends Thread {
    
    /** Instancia de la clase GUI_Ayuda que representa el menú de ayuda. */
    public GUI_Ayuda MenuAyuda;

    /**
     * Constructor de la clase ClaseHilo1.
     * Inicializa el hilo con una instancia de {@link GUI_Ayuda}.
     * 
     * @param MenuAyuda Instancia de {@link GUI_Ayuda} que se utilizará en el hilo.
     */
    public ClaseHilo1(GUI_Ayuda MenuAyuda) {
        this.MenuAyuda = MenuAyuda;
    }

    /**
     * Método que se ejecuta cuando el hilo comienza.
     * Invoca el método {@code ListaNombres()} de {@code MenuAyuda}.
     */
    public void run() {
        try {
            this.MenuAyuda.ListaNombres();
        } catch (Exception ex) {
            ex.printStackTrace();
            // Manejo de excepciones
        }
    }
}

