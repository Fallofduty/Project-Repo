package com.company;

import java.text.NumberFormat;

public class MortgageReport {
    private final MortGageCalulator calculator;
    private final NumberFormat currency;

    public MortgageReport(MortGageCalulator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance(); // currecy is being intalized here in the cosntructor
    } // passing reference of calculator


    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
  for (double balance:calculator.getRemaningBalances()){ // print all the array in a form and print it this way
      System.out.println(currency.format(balance)); // show in currecy format
  }
    }

    public void printMortgage() { //
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
