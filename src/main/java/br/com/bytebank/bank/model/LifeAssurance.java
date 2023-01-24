package br.com.bytebank.bank.model;

public class LifeAssurance implements Tax{
    @Override
    public double getTaxValue() {
        return 42;
    }
}
