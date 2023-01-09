public class CurrentAccount extends Account implements Tax {

    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        super.balance = super.balance + value;
    }

    @Override
    public boolean withdraw(double value) {
        double withdrawValue = value + 0.20;
        return super.withdraw(withdrawValue);
    }

    @Override
    public double getTaxValue() {
        return super.balance * 0.01;
    }
}
