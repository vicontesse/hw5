public class Main{
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Exception's string argument");
        } catch (RuntimeException e) {
            System.out.println("Look!" + e.getMessage());
        } finally {
            System.out.println("I was there");
        }

}
}
