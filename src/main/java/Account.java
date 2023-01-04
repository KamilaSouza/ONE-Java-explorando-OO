public class Account {
    private double balance;
    private int agency;
    private int number;
    private Client owner;

    private static int totalAccounts = 0;

    public Account(int agency, int number) {
        totalAccounts++;
        System.out.println("Total accounts: " + totalAccounts);
        this.agency = agency;
        this.number = number;
        this.balance = 100;
        System.out.println("Creating account number: " + this.number);
    }

    public void deposit(double value) {
        this.balance += value;
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
        if (this.withdraw(value)) {
            receiver.deposit(value);
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 0) {
            System.out.println("Can not be smaller than 0.");
            return;
        } else {
            this.number = number;
        }
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        if (agency < 0) {
            System.out.println("Can not be smaller than 0.");
            return;
        } else {
            this.agency = agency;
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
