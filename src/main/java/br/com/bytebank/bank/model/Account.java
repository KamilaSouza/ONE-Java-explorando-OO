package br.com.bytebank.bank.model;

import java.util.Objects;

/**
 * * Account Class
 */

public abstract class Account {
    protected double balance;
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
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return agency == account.agency && number == account.number;
    }

    public abstract void deposit(double value);

    public void withdraw(double value) throws InsufficientBalanceException {
        if (this.balance < value) {
            throw new InsufficientBalanceException("Balance: " + this.balance + ", Value: " + value);
        }
        this.balance = this.balance - value;
    }

    public void transfer(double value, Account receiver) throws InsufficientBalanceException {
        this.withdraw(value);
        receiver.deposit(value);
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

    @Override
    public String toString() {
        return "Number: " + this.number + ", Agency: " + this.agency;
    }
}
