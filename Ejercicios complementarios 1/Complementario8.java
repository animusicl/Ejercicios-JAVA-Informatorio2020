import java.util.Scanner;

public class Complementario8 {
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String nombre, direccion, ciudad;
        int flag = 1, edad;

        while(flag == 1) {
            scan.nextLine();
            System.out.println("Introduzca nombre y apellido: ");
            nombre = scan.nextLine();
            System.out.println("Introduzca su edad: ");
            edad = scan.nextInt();
            scan.nextLine();
            System.out.println("Introduzca su dirección: ");
            direccion = scan.nextLine();
            System.out.println("Introduzca ciudad: ");
            ciudad = scan.nextLine();
            System.out.println(ciudad+" - "+direccion+" - "+edad+" - "+nombre);

            
            System.out.println("\n1.\tPara Continuar\n2.\tPara Salir");
            flag = scan.nextInt();
        }
        scan.close();
    }
}
