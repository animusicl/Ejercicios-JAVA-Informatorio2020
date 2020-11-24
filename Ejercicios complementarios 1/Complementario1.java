import java.util.Scanner;

public class Complementario1 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int flag = 1;
        

        while(flag == 1){
            
            scan.nextLine();//para consumir el enter
            System.out.println("Introduzca su nombre: ");
            String usuario = scan.nextLine();
            System.out.println("Hola "+usuario);
            System.out.println("1.\tPara Continuar\n2.\t Para Salir");
            flag = scan.nextInt();
        }
        scan.close();

    }
    
}
