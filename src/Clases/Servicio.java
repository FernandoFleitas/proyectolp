/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author EJFR0
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
