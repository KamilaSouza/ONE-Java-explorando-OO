public class Main {
    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount(111, 111);
        currentAccount.deposit(100.0);

        SavingsAccount savingsAccount = new SavingsAccount(222, 222);
        savingsAccount.deposit(100.0);

        LifeAssurance lifeAssurance = new LifeAssurance();

        TaxCalculator taxCalculator = new TaxCalculator();

        taxCalculator.register(currentAccount);
        taxCalculator.register(lifeAssurance);

        System.out.println(taxCalculator.getTotalTax());

        currentAccount.transfer(50.0, savingsAccount);

        System.out.println("Current Account balance: " + currentAccount.getBalance());
        System.out.println("Savings Account balance: " + savingsAccount.getBalance());

        Manager manager = new Manager();
        Client client = new Client("Kam","123456789", "dev");
        client.setPassword(3333);

        InternalSystem internalSystem = new InternalSystem();
        internalSystem.authenticate(client);
    }
}
// Herança - para reutilização de código, use composição; para polimorfismo, use interface.