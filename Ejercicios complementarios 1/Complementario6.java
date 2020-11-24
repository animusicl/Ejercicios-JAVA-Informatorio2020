import java.util.Scanner;

public class Complementario6 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int flag=1, base, pow, rta;

        while(flag == 1){
            System.out.println("Ingrese la base: ");
            base = scan.nextInt();
            System.out.println("Ingrese la potencia: ");
            pow = scan.nextInt();

            rta = 1;
            for(int i= 0; i < pow; i++){
                rta *= base;
            }

            System.out.println(base+" elevado a "+pow+" = "+rta);
            System.out.println("\n1.\tPara Continuar\n2.\tPara Salir");
            flag = scan.nextInt();
        }
        scan.close();
    }

    public void Exponencial(int base, int pow){
        rta = 1;
            
        for(int i= 0; i < pow; i++){
                rta *= base;
            }
            System.out.println(base+" elevado a "+pow+" = "+rta);
    }

    public void pedirDatos()
}
