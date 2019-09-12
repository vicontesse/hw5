import java.util.*;

public class Main2_4{
    public static void main(String[] args) {
        List<String> countriesA = new ArrayList<String>();
        countriesA.add("Angola");
        countriesA.add("UK");
        countriesA.add("Chile");
        countriesA.add("New Zealand");
        countriesA.add("Japan");
        List<String> countriesL = new LinkedList<String>();
        countriesL.add("Angola");
        countriesL.add("UK");
        countriesL.add("Chile");
        countriesL.add("New Zealand");
        countriesL.add("Japan");

        Collections.sort(countriesA);
        System.out.println("Sorted ArrayList: ");
        for(String sortedA: countriesA){
            System.out.println(sortedA);
        }
        Collections.sort(countriesL);
        System.out.println("Sorted LinkedList: ");
        for(String sortedL: countriesL){
            System.out.println(sortedL);
        }
        System.out.println();
        Collections.shuffle(countriesA);
        System.out.println("Shuffled ArrayList1: ");
        for(String shuffledA: countriesA){
            System.out.println(shuffledA);
        }
        System.out.println();
        Collections.shuffle(countriesA);
        System.out.println("Shuffled ArrayList2: ");
        for(String shuffledA: countriesA){
            System.out.println(shuffledA);
        }
        System.out.println();
        Collections.shuffle(countriesA);
        System.out.println("Shuffled ArrayList3: ");
        for(String shuffledA: countriesA){
            System.out.println(shuffledA);
        }
        System.out.println();
        Collections.shuffle(countriesL);
        System.out.println("Shuffled LinkedList1: ");
        for(String shuffledL: countriesL){
            System.out.println(shuffledL);
        }
        System.out.println();
        Collections.shuffle(countriesL);
        System.out.println("Shuffled LinkedList2: ");
        for(String shuffledL: countriesL){
            System.out.println(shuffledL);
        }
        System.out.println();
        Collections.shuffle(countriesL);
        System.out.println("Shuffled LinkedList3: ");
        for(String shuffledL: countriesL){
            System.out.println(shuffledL);
        }
    }
}

