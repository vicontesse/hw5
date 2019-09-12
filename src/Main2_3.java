import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Main2_3{
    public static void main(String[] args) {
        System.out.println("Who is hopping? 1 of 5!");
        Map<String, Mouse> mice = new HashMap<String, Mouse>();
        Mouse mouse1 = new Mouse(1);
        mice.put("mouse1", mouse1);
        Mouse mouse2 = new Mouse(3);
        mice.put("mouse2", mouse2);
        Mouse mouse3 = new Mouse(5);
        mice.put("mouse3", mouse3);
        Mouse mouse4 = new Mouse(10);
        mice.put("mouse4", mouse4);
        Mouse mouse5 = new Mouse(7);
        mice.put("mouse5", mouse5);
        Iterator <String> mIter = mice.keySet().iterator();
        while (mIter.hasNext()) {
            String mmouse = (String) mIter.next();
            mice.get(mmouse).hop();
        }
    }
}


