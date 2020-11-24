import java.util.HashMap;
import java.util.Map;


public class Empleado {

    private String nombre;
    private String apellido;
    private int dni;
    private int horasTrabajadas;
    private float valorHora;

    public Empleado(String nombre, String apellido, int dni, int horasTrabajadas, float valorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }


    public int getDni() {
        return dni;
    }


    public float calcularSueldo(){
        return this.horasTrabajadas * this.valorHora;
    }

    public static void mostrarDatos(HashMap em){
        em.forEach((k,v) -> System.out.println("DNI: " + k + " SUELDO: $" + v)); //expresion lambda
    }
}
