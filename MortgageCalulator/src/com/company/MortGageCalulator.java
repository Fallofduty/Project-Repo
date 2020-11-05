package com.company;

import java.text.NumberFormat;

public class MortGageCalulator {
    // theese private field
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    // theese are private properties which is needed
    private int principal;
    private float annualInterest;
    private byte years;

// constructor
    public MortGageCalulator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }
    // this gets the remaning balance

    public double [] getRemaningBalances(){
        double [] balances = new double[getNumberOfPayments()]; // set the index length based on remaning balance length
        for (short month = 1; month <= balances.length; month++) {
            balances[month-1] = calculateBalance(month); // month starts at 1 but index of first element starts at 0
        }
        return balances;
    }


    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

       return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    }



    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

       return principal
                * (getNumberOfPayments())
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);


    }
    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    private int getNumberOfPayments() {
        return years *MONTHS_IN_YEAR;
    }
}
