
import java.util.Scanner;
public class Ejercicio3 {
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int flag = 1;
        int nota;

        while(flag == 1){
            System.out.print("Ingrese la nota del alumno:  ");
            nota = scan.nextInt();

            if(nota > 92){
                System.out.println("Excelente");
            }
            else if(nota > 84){
                System.out.println("Sobresaliente");
            }
            else if(nota > 74){
                System.out.println("Distinguido");
            }
            else if(nota > 59){
                System.out.println("Bueno");
            }
            else {
                System.out.println("Desaprobado");
            }
            
            System.out.print("\n1.\tPara Continuar\n2.\tPara Salir\n>>> ");
            flag = scan.nextInt();
        }
        scan.close();
    }
}