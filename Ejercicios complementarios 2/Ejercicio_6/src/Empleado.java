import java.util.HashMap;
import java.util.Map;


public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private int horasTrabajadas;
    private float valorHora;

    public Empleado(String nombre, String apellido, String dni, int horasTrabajadas, float valorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }


    public String getDni() {
        return dni;
    }


    public float calcularSueldo(){
        return this.horasTrabajadas * this.valorHora;
    }

    public static void mostrarDatos(HashMap em){
        em.forEach((k,v) -> System.out.println("DNI: " + k + " SUELDO: $" + v)); //expresion lambda
    }
}
