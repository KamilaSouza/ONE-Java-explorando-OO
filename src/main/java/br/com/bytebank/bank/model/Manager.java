package br.com.bytebank.bank.model;

public class Manager extends Employee implements Authentication{

    private int password;

    @Override
    public double getBonus(){
        return super.getSalary();
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
