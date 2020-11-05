package com.company;

public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000); // ask user for input
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortGageCalulator(principal,annualInterest,years);

        var report = new MortgageReport(calculator); // pasing reference of calulator here
        report.printMortgage(); // shows all the mortgae that is being printed
        report.printPaymentSchedule(); // shows payments for the mortgage


    }

}
