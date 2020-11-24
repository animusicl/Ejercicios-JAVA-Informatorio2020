/*
 2- Crear un ArrayList, agregar 5 números enteros.
    Luego, agregar un número entero al principio de la lista y otro al final. 
    Por último, iterar e imprimir los elementos de la lista y el tamaño de la 
    misma (antes y después de agregar a en la primera y última posición).
*/
package Ejercicio_2;

import java.util.ArrayList;
import java.util.Random;



public class Lista {
    
    
    Random numero = new Random();
    ArrayList numeros = new ArrayList();
  
    
    public void agregarElementos(int num){
        numeros.add(num);
    }
    
    public void mostrarElementos(){
        
        for(int i=0; i<numeros.size(); i++){
            System.out.print(numeros.get(i)+" ");
        }
        
        System.out.println("El tamaño de la lista es de: "+numeros.size());
    }
    
    
    public void agregarDosElementos(){
        
        numeros.add(0,numero.nextInt(100));
        numeros.add(numero.nextInt(100));
    }
}
