public class Flow {

    public static void main(String[] args) {
        System.out.println("Main starts.");
        method1();
        System.out.println("Main ends.");
    }

    private static void method1() {
        System.out.println("Method 1 starts.");
        try {
            method2();
        } catch (ArithmeticException | NullPointerException ex) {
            String message = ex.getMessage();
            System.out.println("Exception " + message);
            // ex.printStackTrace();
        }
        System.out.println("Method 1 ends.");
    }

    private static void method2() {
        System.out.println("Method 2 starts.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            //int a = i / 0;
            Account account = null;
            account.deposit(5);
        }
        System.out.println("Method 2 ends.");
    }

}
