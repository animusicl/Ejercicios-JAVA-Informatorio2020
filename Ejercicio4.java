import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int flag = 1;
        int numero;
        do {
            System.out.print("Ingrese un numero del 1 al 7:   ");
            numero = scan.nextInt();

            switch(numero){
                case 1: System.out.println("El dia es Domingo");
                break;
                case 2: System.out.println("El dia es Lunes");
                break;
                case 3: System.out.println("El dia es Martes");
                break;
                case 4: System.out.println("El dia es Miercoles");
                break;
                case 5: System.out.println("El dia es Jueves");
                break;
                case 6: System.out.println("El dia es Viernes");
                break;
                case 7: System.out.println("El dia es Sabado");
                break;
                default: System.out.println("El numero ingresado no es válido");
            }

            System.out.println("\n1.\tPara Continuar\n2.\tPara Salir");
            flag = scan.nextInt();
        
        } while(flag == 1);
         scan.close();
    }
}