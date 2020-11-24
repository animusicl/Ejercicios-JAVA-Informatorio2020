import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horas;
        float sueldoHora;
        int flag = 1;

        Sueldo sueldo = new Sueldo();

        while(flag == 1){
            System.out.println("\t.:Ingrese los datos del Empleado:.");
            System.out.println("Horas trabajadas: ");
            horas = scan.nextInt();
            sueldo.cargarHorasTrabajadas(horas);
            System.out.println("Sueldo por hora: ");
            sueldoHora = scan.nextFloat();
            sueldo.cargarSueldoHora(sueldoHora);

            System.out.println("Desea cargar otro empleado?\n\t1- Ingrese uno para SI\n\t2- Ingrese dos para NO");
            flag = scan.nextInt();
        }

        sueldo.calcularSueldo();
        sueldo.mostrarDatos();
    }
}
