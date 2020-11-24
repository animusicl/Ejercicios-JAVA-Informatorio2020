/*
 2- Crear un ArrayList, agregar 5 números enteros.
    Luego, agregar un número entero al principio de la lista y otro al final. 
    Por último, iterar e imprimir los elementos de la lista y el tamaño de la 
    misma (antes y después de agregar a en la primera y última posición).
*/
package Ejercicio_2;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Lista n = new Lista();
        int num;
        
        for(int i=0; i<5; i++){
            System.out.print("Introduzca un numero: ");
            num = scan.nextInt();
            n.agregarElementos(num);
        }
             
            
       n.mostrarElementos();
       n.agregarDosElementos();
       n.mostrarElementos();
    }
     
     
}
