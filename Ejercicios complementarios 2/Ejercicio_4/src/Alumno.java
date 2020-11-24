import java.util.*;


public class Alumno {

    ArrayList <String> alumnos = new ArrayList <String>();
    String[] aux = {"alumno1","alumno2","alumno3","alumno4","alumno5","alumno6","alumno7","alumno8","alumno9","alumno10","alumno11","alumno12"};

    List <String> grupo1;
    List <String> grupo2;
    List <String> grupo3;

    public void crearAuxiliar(){

        alumnos.addAll(Arrays.asList(aux));
    }

    public void dividirEnGrupos(){
        Collections.shuffle(alumnos);//mezclar el arrayList

        grupo1 = alumnos.subList(0, 4); //toma como parametros los index el ùltimo no està incluido
        grupo2 = alumnos.subList(4, 8);
        grupo3 = alumnos.subList(8, 12);

    }

    public void mostrarGrupos(){

        System.out.println("Grupo 1 -> "+ grupo1);
        System.out.println("Grupo 2 -> "+ grupo2);
        System.out.println("Grupo 3 -> "+ grupo3);
    }

}
