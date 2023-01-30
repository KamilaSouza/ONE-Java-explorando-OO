package br.com.bytebank.bank.model;

public class Arrays {

    public static void main(String[] args) {

        CurrentAccount[] accounts = new CurrentAccount[5];

        CurrentAccount cc1 = new CurrentAccount(22,11);
        accounts[0] = cc1;

        CurrentAccount cc2 = new CurrentAccount(23,12);
        accounts[1] = cc2;

        System.out.println(accounts[0].getAgency());
    }
}
