/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Usuarios;

/**
 *
 * @author Esteban Solano Araya
 */
public class EmpleadoExterno extends Usuario{
    public EmpleadoExterno(String id, String nombre, String contrasenna, String correo, String detalle) {
        super();
        this.id = id; // EE0
        this.nombre = nombre;
        this.contrasenna = contrasenna;
        this.correo = correo;
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "EmpleadoExterno{" + "nombre=" + nombre + ", id=" + id + 
                ", contrasenna=" + contrasenna + ", correo= " + correo + ", detalle= " + detalle + '}';
    }

}