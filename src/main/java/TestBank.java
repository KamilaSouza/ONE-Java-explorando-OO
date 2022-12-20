public class TestBank {
    public static void main(String[] args) {
        Client client = new Client("Kamila", "123456789", "dev");
        Client client1 = new Client("Noah", "123456789", "sleeper");

        Account account = new Account(100, 15, 105, client);
        account.deposit(150);

        Account account1 = new Account(100, 13, 103, client1);

        System.out.println("Number of accounts:" + Account.getTotalAccounts());
    }

}
