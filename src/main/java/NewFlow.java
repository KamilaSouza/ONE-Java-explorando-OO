public class NewFlow {

    public static void main(String[] args) {
        System.out.println("Main starts.");
        try {
            method1();
        } catch (ArithmeticException | NullPointerException | MyException ex) {
            String message = ex.getMessage();
            System.out.println("Exception " + message);
            ex.printStackTrace();
        }
        System.out.println("Main ends.");
    }

    private static void method1() {
        System.out.println("Method 1 starts.");
        method2();
        System.out.println("Method 1 ends.");
    }

    private static void method2() throws MyException{
        System.out.println("Method 2 starts.");

        new MyException("Its not working.");

        //System.out.println("Method 2 ends.");
    }
}
