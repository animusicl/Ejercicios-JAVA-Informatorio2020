import java.util.Scanner;

public class Complementario7 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String frase;

        System.out.println("Introduzca una frase: ");
        frase = scan.nextLine();
        scan.close();

        System.out.println(convertirMayusculas(frase));
    }


    public static String convertirMayusculas(String frase){
        String rta = "";
        char letra = ' ';

        for(int i = 0; i < frase.length(); i++){

            if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z'){
                letra = (char)(frase.charAt(i) - 32);
            }
            else {
                letra = (char)(frase.charAt(i));
            }

            rta += letra;
        }
        return rta;
    }
}

