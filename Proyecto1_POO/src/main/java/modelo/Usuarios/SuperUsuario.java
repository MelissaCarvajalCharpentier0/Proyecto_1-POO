/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Usuarios;

/**
 *
 * @author Esteban Solano Araya
 */
public class SuperUsuario extends Usuario {
    public SuperUsuario() {
        super();
        id = "SU0";
        nombre = "SuperUsuario";
        contrasenna = "1234";
    }

    @Override
    public String toString() {
        return "SuperUsuario{" + "nombre= " + nombre + ", id= " + id + ", contrasenna= " + contrasenna + '}';
    }
}
