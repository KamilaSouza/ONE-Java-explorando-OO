package br.com.bytebank.bank.model;

public class TaxCalculator {

    private double totalTax;

    public void register(Tax t){
       double value =  t.getTaxValue();
       this.totalTax += value;
    }

    public double getTotalTax() {
        return totalTax;
    }
}
