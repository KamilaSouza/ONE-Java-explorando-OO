public class CreateAccount {

    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 200;
        System.out.println("First account Balance: " + firstAccount.balance);

        Account secondAccount = new Account();
        secondAccount.balance = 50;
        System.out.println("Second account Balance: " + secondAccount.balance);
        secondAccount.agency = 42;

        System.out.println(secondAccount.agency);
        System.out.println(firstAccount.number);

        if(firstAccount == secondAccount){
            System.out.println("They are the same account.");
        } else {
            System.out.println("They are different.");
        }
    }
}
