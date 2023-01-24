package br.com.bytebank.bank.model;

public class CurrentAccount extends Account implements Tax {

    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        super.balance = super.balance + value;
    }

    @Override
    public void withdraw(double value) throws InsufficientBalanceException {
        double withdrawValue = value + 0.20;
        super.withdraw(withdrawValue);
    }

    @Override
    public double getTaxValue() {
        return super.balance * 0.01;
    }
}
