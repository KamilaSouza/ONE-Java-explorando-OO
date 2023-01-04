public class Main {
    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount(111, 111);
        currentAccount.deposit(100.0);

        SavingsAccount savingsAccount = new SavingsAccount(222, 222);
        savingsAccount.deposit(100.0);

        currentAccount.transfer(50.0, savingsAccount);

        System.out.println("Current Account balance: " + currentAccount.getBalance());
        System.out.println("Savings Account balance: " + savingsAccount.getBalance());
    }
}
