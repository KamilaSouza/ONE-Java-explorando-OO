public class CurrentAccount extends Account {

    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public boolean withdraw(double value) {
        double withdrawValue = value + 0.20;
        return super.withdraw(withdrawValue);
    }
}
