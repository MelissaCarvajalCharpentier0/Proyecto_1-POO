/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Usuarios;

/**
 *
 * @author Esteban Solano Araya
 */
public class EmpleadoInterno extends Usuario{
    
    // Atributos
            
    // Métodos
    public EmpleadoInterno(String id, String nombre, String contrasenna, String correo) {
        super();
        this.id = id; // EI0
        this.nombre = nombre;
        this.contrasenna = contrasenna;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "EmpleadoInterno{" + "nombre= " + nombre + ", id= " + id + ", correo= " + correo + ", contrasenna= " + contrasenna + '}';
    }
    
}