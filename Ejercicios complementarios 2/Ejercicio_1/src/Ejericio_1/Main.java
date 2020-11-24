/*
 1- Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina. 
    Luego imprimir por pantalla el ranking
 */
package Ejericio_1;

import java.util.Scanner;

/**
 *
 * @author Guada Acosta
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lista c = new Lista();
        int flag = 1;
       
        
        while(flag == 1){
            
            System.out.println("Ingrese una ciudad favorita de Argntina: ");
            c.ciudad = scan.nextLine();
            c.ciudad.toString();
            
            c.añadirFavoritos();
            
            System.out.println("Desea continuar?\n\t1. Desea continuar \n\t2. No desea continuar");
            flag = scan.nextInt();
            scan.nextLine();
        }
        scan.close();
        c.mostrarCiudades();
        
    }
}
