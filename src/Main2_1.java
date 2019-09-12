import  java.util.Random;
import java.util.ArrayList;

public class Main2_1{
    public static void main(String[] args){
        int i;
        ArrayList <Double> arrDouble = new ArrayList <Double> ();
        for (i=0; i<4; i++) {
            double start = 1;
            double end = 2;
            double random = new Random().nextDouble();
            double randouble = start + (random * (end - start));;
            arrDouble.add(randouble);
        }
        System.out.println (arrDouble);
    }
}

