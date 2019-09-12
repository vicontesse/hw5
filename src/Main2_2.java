import java.util.ArrayList;

public class Main2_2 {
    public static void main(String[] args) {
        System.out.println("Who is hopping? 1 of 5!");
        ArrayList<Mouse> mice = new ArrayList<Mouse>();
        Mouse mouse1 = new Mouse(1);
        mice.add(mouse1);
        Mouse mouse2 = new Mouse(3);
        mice.add(mouse2);
        Mouse mouse3 = new Mouse(5);
        mice.add(mouse3);
        Mouse mouse4 = new Mouse(10);
        mice.add(mouse4);
        Mouse mouse5 = new Mouse(7);
        mice.add(mouse5);
        for (int i = 0; i < mice.size(); i++)
            mice.get(i).hop();
    }
}