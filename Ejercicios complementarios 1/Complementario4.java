import java.util.Scanner;

public class Complementario4 {
    
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int flag = 1, factorial, num;
       
        while(flag == 1 ){
            System.out.println("Introduzca un numero: ");
            num = scan.nextInt();
            factorial = 1;

            for(int i=1; i<=num; i++){
                factorial *= i;
            }

            System.out.println("El factorial de "+num+" es: "+factorial);

            System.out.println("\n1.\tPara Continuar\n2.\tPara Salir");
            flag = scan.nextInt();
        }
        scan.close();
    }
}
