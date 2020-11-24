import java.util.Scanner;

public class Complementario9 {
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String cadena;
        char letra;
        
        System.out.println("Introduzca una cadena de caracteres: ");
        cadena = scan.nextLine();
        System.out.println("Introduzca una letra: ");
        letra = scan.next().charAt(0);
        scan.close();
        int rta = contador(cadena,letra);
        System.out.println("La letra "+letra+" se repite "+rta+" veces!");

        }

    public static int contador(String cadena, char letra){
        int contador = 0;
        cadena = cadena.toLowerCase();
        
        for (int i = 0; i < cadena.length(); i++ ){
            char c = cadena.charAt(i); 
            if(c == letra){
                contador++;
            }
        }
        return contador;
    }
        
}

