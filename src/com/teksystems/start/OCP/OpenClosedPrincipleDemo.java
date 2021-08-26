package com.teksystems.start.OCP;

public class OpenClosedPrincipleDemo {
    public static void main(String[] args) {
        Addition addition = new Addition(2.2, 4.0);
        Calculator calculator = new Calculator();
        calculator.calculate(addition);
    }
}
