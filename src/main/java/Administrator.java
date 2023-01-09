public class Administrator extends Employee implements Authentication{

    private AuthenticationE authenticationE;

    public Administrator() {
        this.authenticationE = new AuthenticationE();
    }

    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public void setPassword(int password) {
        this.authenticationE.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        return this.authenticationE.authenticate(password);
    }
}
