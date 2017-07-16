package com.kodilla;

/**
 * Created by marcinmarczyk on 04.07.2017.
 */
public class Calculator {

    public void add(int a, int b) {
        int sum = 0;
        sum = a + b;
        System.out.println("Wynik dodawania = " + sum);
    }

    public void subtract(int c, int d) {
        int sub = 0;
        sub = c - d;
        System.out.println("Wynik odejmowania = " + sub);
    }

    public static void main (String args[]) {

        Calculator calculator = new Calculator();

        calculator.add(1,2);
        calculator.subtract(1,2);

    }
}

