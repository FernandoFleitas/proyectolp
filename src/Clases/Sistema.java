/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import GUI.GUI_Inicio_Sesion; 

/**
 * La clase Sistema representa el punto de entrada principal para la aplicación de banca en línea.
 * Contiene información sobre el dominio y el nombre del sistema.
 * 
 * <p><strong>Atributos:</strong></p>
 * <ul>
 *   <li>{@code dominio} - Cadena que representa el dominio del sistema de banca en línea.</li>
 *   <li>{@code nombre} - Cadena que representa el nombre del sistema de banca en línea.</li>
 * </ul>
 *
 * <p><strong>Métodos:</strong></p>
 * <ul>
 *   <li>{@code main(String args[])} - Método principal que inicia la aplicación, redirigiendo al inicio de sesión.</li>
 * </ul>
 *
 * <p>Esta clase sirve como punto de entrada principal para la aplicación de banca en línea.</p>
 * 
 * <p><strong>Autor:</strong> EJFR0</p>
 * @version 1.0
 */
public class Sistema {
    
    /** Cadena que representa el dominio del sistema de banca en línea. */
    private String dominio = "www.WEB_Banking.com";
    /** Cadena que representa el nombre del sistema de banca en línea. */
    private String nombre = "Banking";

    /**
     * Método principal que inicia la aplicación, redirigiendo al inicio de sesión.
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String args[]) {
        GUI_Inicio_Sesion.main(args);
    }
}
