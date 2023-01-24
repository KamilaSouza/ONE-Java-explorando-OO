package br.com.bytebank.bank.model;

public class InternalSystem {

    private int password = 3333;

    public void authenticate(Authentication ae) {
        boolean authenticated = ae.authenticate(this.password);
        if (authenticated) {
            System.out.println("Logged in.");
        } else {
            System.out.println("Wrong password.");
        }
    }
}
