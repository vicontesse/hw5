import java.util.*;

public class Main2_5{
    public static void main(String[] args) {
        System.out.println("MAPS: ");
        Map<Integer, String> countries = new HashMap<Integer, String>();
        countries.put(20, "Angola");
        countries.put(233, "UK");
        countries.put(4, "Chile");
        countries.put(787, "New Zealand");
        countries.put(99, "Japan");

        System.out.println("HMap order: ");
        for (Map.Entry<Integer, String> entry : countries.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());

        Map<Integer, String> countriesTree = new TreeMap<Integer, String>(countries);
        Map<Integer, String> countriesLinked = new LinkedHashMap<Integer, String>(countriesTree);
        System.out.println("LinkedHMap order: ");
        for (Map.Entry<Integer, String> entry : countriesLinked.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
        System.out.println();

        System.out.println("SETS: ");
        Set<String> countriesSet = new HashSet<String>();
        countriesSet.add("Angola");
        countriesSet.add("UK");
        countriesSet.add("Chile");
        countriesSet.add("New Zealand");
        countriesSet.add("Japan");

        System.out.println("HSet order: ");
        Iterator <String> HSet = countriesSet.iterator();
        while (HSet.hasNext()) {
            String nextC = (String) HSet.next();
            System.out.print(nextC + " ");
            System.out.println();
        }
        Set<String> countriesTreeS = new TreeSet<String>(countriesSet);
        Set<String> countriesLinkedS = new TreeSet<String>(countriesTreeS);
        System.out.println("LinkedHSet order: ");
        Iterator <String> LHSet = countriesLinkedS.iterator();
        while (LHSet.hasNext()) {
            String nextCL = (String) LHSet.next();
            System.out.print(nextCL + " ");
            System.out.println();
        }
    }
}

