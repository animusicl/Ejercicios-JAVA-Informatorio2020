/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejericio_1;

import java.util.ArrayList;

/**
 *
 * @author Guada Acosta
 */
public class Lista {
    String ciudad;
    ArrayList ciudades = new ArrayList();
    
    
    public void añadirFavoritos(){
    
        ciudades.add(ciudad);
    }
    
    public void mostrarCiudades(){
       for (int i = 0; i < ciudades.size(); i++){
           System.out.println((i+1)+": "+ciudades.get(i));
       }
            
    }
}
