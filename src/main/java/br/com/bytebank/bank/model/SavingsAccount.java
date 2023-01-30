package br.com.bytebank.bank.model;

public class SavingsAccount extends Account{

    public SavingsAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        super.balance = super.balance + value;
    }

    @Override
    public String toString(){
        return  "SavingsAccount, " + super.toString();
    }
}
