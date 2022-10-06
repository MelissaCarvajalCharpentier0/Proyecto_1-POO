/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Usuarios;

/**
 *
 * @author Esteban Solano A
 */
public class Administrador extends Usuario {
    public Administrador(String id, String nombre, String contrasenna) {
        super();
        this.id = id; // AD0
        this.nombre = nombre;
        this.contrasenna = contrasenna;
    }

    @Override
    public String toString() {
        return "Administrador{" + "nombre= " + nombre + ", id= " + id + ", contrasenna= " + contrasenna + '}';
    }
    
}
