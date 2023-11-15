/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author EJFR0
 */
public class Cliente 
{
    private String ci_ruc;
    private String razon_social;
    private String nombre; 
    private int pin; 
    private String direccion;
    private int telefono;
    
    public Cliente(String ci_ruc,String nombres,  String razon_social, int pin, String direccion, int telefono)
    {
        this.ci_ruc = ci_ruc;
        this.razon_social = razon_social;
        this.direccion = direccion; 
        this.telefono = telefono; 
        this.pin = pin;
        this.nombre = nombres;
    }
    
    public String get_ci_ruc() {
        return ci_ruc;
    }

    public void set_ci_ruc(String ci_ruc) {
        this.ci_ruc = ci_ruc;
    }

    public String get_razon_social() {
        return razon_social;
    }

    public void set_razon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public int get_pin() {
        return pin;
    }

    public void set_pin(int pin) {
        this.pin = pin;
    }

    public String get_direccion() {
        return direccion;
    }

    public void set_direccion(String direccion) {
        this.direccion = direccion;
    }

    public int get_telefono() {
        return telefono;
    }

    public void set_telefono(int telefono) {
        this.telefono = telefono;
    }
    
}
