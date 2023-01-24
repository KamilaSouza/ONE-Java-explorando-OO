package br.com.bytebank.bank.model;

// Web Address, project name, package name
// protected - heir

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount(111, 111); // starts with balance 100

        currentAccount.deposit(100);
        try {
            currentAccount.withdraw(250);
        } catch (InsufficientBalanceException ex) {
            System.out.println("Insufficient balance: " + ex.getMessage());
        }
        System.out.println(currentAccount.getBalance());


        System.out.println();

    }


}
// Herança - para reutilização de código, use composição; para polimorfismo, use interface.