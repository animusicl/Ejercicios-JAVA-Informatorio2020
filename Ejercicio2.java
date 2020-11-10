import java.util.*;

public class Ejercicio2 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int flag = 1;
        int a;
        int b;
        int c;

        while(flag == 1){
            System.out.print("Ingrese el primero numero:  ");
            a = scan.nextInt();
            System.out.print("Ingrese el segundo numero:  ");
            b = scan.nextInt();
            System.out.print("Ingrese el tercer numero:  ");
            c = scan.nextInt();

            System.out.println("\nEl primero numero ingresado es: "+a+"\nEl segundo numero ingresado es: "+b+"\nEl tercer numero ingresado es: "+c);
            System.out.println("\n1.\tContinuar\n2.\tSalir");
            flag = scan.nextInt();

        }
        scan.close();
    }
}