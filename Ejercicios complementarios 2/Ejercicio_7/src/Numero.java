import java.util.ArrayList;

public class Numero {
    ArrayList arry = new ArrayList();
    String f = "Fizz", b = "Buzz", fb = "FizzBuzz";

    public void fizzBuzzFunction(int n1, int n2){

        for(int i=n1; i<n2; i++){

            if(i%2 == 0 && i%3 == 0){
                arry.add(fb);
            }
            else if(i%3 == 0){
                arry.add(b);
            }
            else if(i%2==0){
                arry.add(f);
            }
            else{
                arry.add(i);
            }
        }

    }

    public void mostrarResultados(){

        for (Object o : arry) {
            System.out.print(" "+o);
        }
    }
}
