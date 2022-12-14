/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo.Elementos;

import java.util.ArrayList;

/**
 *
 * @author Melissa Carvajal Ch
 */
public class ListaComponentes {
    private ArrayList<ComponenteElemento> lista;
    
    public ListaComponentes(){
        lista = new ArrayList<ComponenteElemento>();
    }
    
    public boolean consultarComponente(String codigo){
        for (ComponenteElemento componente : lista){
            if (componente.getCodigo().equalsIgnoreCase(codigo)){
                return true;
            }  
        }
        return false;  
    }
    
    public boolean agregarComponente(ComponenteElemento unComponente){
        if (!consultarComponente(unComponente.getCodigo())){
            lista.add(unComponente);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String comps ="";
        for (ComponenteElemento unComponente: lista){
            comps += "  Codigo: "+unComponente.getCodigo()+"\n"
                    + "  Descripcion: "+ unComponente.getDescripcion()+"\n"
                    + "  Ubicacion General: "+ unComponente.getUbicacion()+"\n"
                    +"\n";
        }    
        return comps;
    }
    
}

