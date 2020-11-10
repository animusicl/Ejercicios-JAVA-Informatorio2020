import java.util.Scanner;

public class Ejercicio5{

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int flag = 1;
        int numero;

        while(flag == 1){
            System.out.println("Ingrese un numero entero: ");
            numero = scan.nextInt();

            for(int i = 1; i<=10; i++){
                System.out.println(numero+" * "+i+" = "+numero*i);
            }

            System.out.println("\n1.\tPara Continuar\n2.\tPara Salir");
            flag = scan.nextInt();
        }
        
        scan.close();
    }
}