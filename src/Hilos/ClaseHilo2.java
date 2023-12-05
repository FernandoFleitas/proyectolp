/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;
/**
 * La clase ClaseHilo2 extiende la clase Thread y se utiliza para ejecutar operaciones en un hilo separado
 * relacionadas con la ejecución de comandos en la línea de comandos del sistema operativo.
 * 
 * <p><strong>Atributos:</strong></p>
 * <ul>
 *   <li>{@code direccion} - Cadena que representa la dirección o comando a ejecutar en la línea de comandos.</li>
 * </ul>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code ClaseHilo2(String direccion)} - Constructor que inicializa el hilo con una dirección o comando específico.</li>
 *   <li>{@code run()} - Método que se ejecuta cuando el hilo comienza. Ejecuta el comando especificado en la línea de comandos.</li>
 * </ul>
 *
 * <p>Esta clase se utiliza para ejecutar comandos en un hilo separado, permitiendo una ejecución asíncrona
 * y proporcionando una mayor capacidad de respuesta en la aplicación.</p>
 * 
 * <p>Nota: El uso de {@code Runtime.getRuntime().exec()} puede depender del sistema operativo y puede requerir
 * consideraciones adicionales para su uso seguro.</p>
 * 
 * <p><strong>Autor:</strong> EJFR0</p>
 * @version 1.0
 */
public class ClaseHilo2 extends Thread {
    
    /** Cadena que representa la dirección o comando a ejecutar en la línea de comandos. */
    String direccion;

    /**
     * Constructor de la clase ClaseHilo2.
     * Inicializa el hilo con una dirección o comando específico.
     * 
     * @param direccion Cadena que representa la dirección o comando a ejecutar en la línea de comandos.
     */
    public ClaseHilo2(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que se ejecuta cuando el hilo comienza.
     * Ejecuta el comando especificado en la línea de comandos utilizando {@code Runtime.getRuntime().exec()}.
     */
    public void run() {
        try {
            Runtime.getRuntime().exec("cmd /c start " + direccion);
        } catch (Exception ex) {
            ex.printStackTrace();
            // Manejo de excepciones
        }
    }
}

