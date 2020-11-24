import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;

public class Carta {

    ArrayList<Character> barajas = new ArrayList<Character>();
    String cadena = "123456789JQK";


    public void crearBarajas() {

       for(int i=0; i<cadena.length();i++){
           char c = cadena.charAt (i);
           barajas.add(c);
       }
    }

   public void mostrarBarajas(){
       System.out.println("Baraja normal -> "+barajas);
       Collections.reverse(barajas);
       System.out.println("Baraja invertida -> "+barajas);
       Collections.shuffle(barajas);
       System.out.print("Baraja mezclada -> "+barajas);
    }


}
