public class MyException extends Exception{
    static String ex;
    public MyException (String ex) {
        this.ex=ex;
    }
    static void printString (){
        System.out.println (ex);
    }

    public static void main(String[] args){
        try {
            MyException myEx = new MyException("Exception's string argument");
            throw myEx;

        }
        catch (MyException e){
            printString();
        }

    }
}

