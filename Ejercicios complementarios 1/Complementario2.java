import java.util.Scanner;


public class Complementario2 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int flag = 1;
        
        while(flag == 1){
            System.out.println("Intoduzca el primer numero: ");
            num1 = scan.nextInt();
            System.out.println("Intoduzca el segundo numero: ");
            num2 = scan.nextInt();

            System.out.println(num1+" + "+ num2+ " = "+ (num1+num2));
            System.out.println(num1+" - "+ num2+ " = "+ (num1-num2));
            System.out.println(num1+" * "+ num2+ " = "+ num1*num2);
            System.out.println(num1+" / "+ num2+ " = "+ num1/num2);
            System.out.println(num1+" % "+ num2+ " = "+ num1%num2);

            System.out.println("1.\tPara Continuar\n2.\t Para Salir");
            flag = scan.nextInt();
        }
        scan.close();
    }
    
}
