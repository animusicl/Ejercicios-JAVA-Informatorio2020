import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Empleado> emp = new HashSet<>();

        Empleado emp1 = new Empleado("Layne", "Staley", "123456", 40, 280);
        Empleado emp2 = new Empleado("Maynard", "Keenan", "789101", 30, 270);
        Empleado emp3 = new Empleado("Einar", "Selvik", "111213", 50, 280);
        Empleado emp4 = new Empleado("Jeff", "Buckley", "141516", 60, 180);

        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);

        Map mapEmp = new HashMap();

        for (Empleado e : emp) {
            mapEmp.put(e.getDni(), e.calcularSueldo());
        }

        Empleado.mostrarDatos((HashMap) mapEmp);
    }
}
