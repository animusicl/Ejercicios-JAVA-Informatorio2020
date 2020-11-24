import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Numero num = new Numero();
        int n1;
        int n2;


        System.out.print("Ingrese el primer numero(menor): ");
        n1= scan.nextInt();
        System.out.print("Ingrese el segundo numero(mayor): ");
        n2= scan.nextInt();
        num.fizzBuzzFunction(n1,n2);
        num.mostrarResultados();


    }
}
