public class Administrator extends Employee implements Authentication{

    private int password;
    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public void setPassword(int password) {
        this.password = password;

    }

    @Override
    public boolean authenticate(int password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }
    }
}
