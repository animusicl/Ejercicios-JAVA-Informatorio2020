import java.util.Scanner;

public class Ejercicio6{

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int flag = 1;
        int numero;

        while(flag == 1){
            System.out.println("Ingrese un numero entero: ");
            numero = scan.nextInt();
            System.out.println("El numero ingresado es: "+numero);
           
            System.out.println("\n\t1(uno) para continuar.\n\t2(dos) para salir.");
            flag = scan.nextInt();
        }
        scan.close();
    }
}