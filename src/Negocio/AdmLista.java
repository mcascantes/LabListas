/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Nodo;

/**
 *
 * @author SRVAdmin
 */
public class AdmLista {
    private Lista lista;

    

    public AdmLista() {
        this.lista = new Lista();
    }
    
    public boolean agregar(String valor)
    {
        int val=Integer.parseInt(valor);
        boolean resultado= lista.agregarAlInicio(val);     
        
        return resultado;
    }
    
    public boolean agregarfinal(String valor)
    {
        int val=Integer.parseInt(valor);
        boolean resultado= lista.agregarAlFinal(val);     
        
        return resultado;
    }
    public Nodo getLista()
    {
        return lista.getLista();
    }
    
    
}
