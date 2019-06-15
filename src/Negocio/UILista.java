/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Nodo;
import Interfaz.FrmLista;
import javax.swing.JOptionPane;

/**
 *
 * @author SRVAdmin
 */
public class UILista {
    private AdmLista adm;   
   

    public UILista() {
        adm = new AdmLista();
    }
    
    public void agregar(FrmLista Formulario)
    {
        String Valor=Formulario.TxtValor.getText(); 
        boolean resultado=adm.agregar(Valor);
        
        if(resultado)
        {
            JOptionPane.showMessageDialog(null,"Agregado al inicio correctamente", "Info",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Error al agregar al inicio ", "Info",JOptionPane.ERROR_MESSAGE);

        }
    } 
    public void agregarfinal(FrmLista Formulario){
        String Valor=Formulario.TxtValor.getText(); 
        boolean resultado=adm.agregarfinal(Valor);
        
        if(resultado)
        {
            JOptionPane.showMessageDialog(null,"Agregado al final correctamente", "Info",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Error al final agregar", "Info",JOptionPane.ERROR_MESSAGE);

        }
        
    }
   
    
    public Nodo getLista()
    {
        return adm.getLista();
    
    }
    
    
    
}
