import java.util.Scanner;

public class Complementario5 {
    
    public static void main(String [] args ){
        Scanner scan = new Scanner(System.in);
        int flag = 1, num1, num2, sum;

        while(flag == 1){
            System.out.println("Introduzca un entero: ");
            num1 = scan.nextInt();
            System.out.println("Introduzca un segundo numero: ");
            num2 = scan.nextInt();

            sum = 0;
            for(int i=0; i<num2; i++){
                sum += num1;
            }
            System.out.println(num1+" + "+num2+" = "+sum);

            System.out.println("\n1.\tPara Continuar\n2.\tPara Salir");
            flag = scan.nextInt();
        }
        scan.close();
    } 
}
