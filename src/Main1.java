public class Main1 {
    public static void main(String[] args) {
        System.out.println("task 1.4");
        int i = 0;
        while (i < 6) {
            try {
                System.out.println(i);
                if (i < 3) {
                    throw new Exception("Too little number");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                i++;
            }
        }
    }
}
