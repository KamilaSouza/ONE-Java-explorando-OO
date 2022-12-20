public class Account {
    private double balance;
    private int agency;
    private int number;
    private Client owner;

    private static int totalAccounts = 0;

    public Account(double balance, int agency, int number, Client owner) {
        totalAccounts++;
        this.balance = balance;
        if (agency < 0) {
            System.out.println("Can not be smaller than 0.");
        } else {
            this.agency = agency;
        }
        this.number = number;
        this.owner = owner;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double value) {
        if (this.balance >= value) {
            this.balance = this.balance - value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double value, Account receiver) {
        if (this.balance >= value) {
            this.balance = this.balance - value;
            receiver.deposit(value);
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 0) {
            System.out.println("Can not be smaller than 0.");
        } else {
            this.number = number;
        }
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
