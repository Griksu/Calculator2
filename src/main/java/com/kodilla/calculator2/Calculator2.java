package com.kodilla.calculator2;

public class Calculator2 {

    public double addAtoB(double A, double B) {
        return A + B;
    }
    public double subtractCFromD(double C, double D) {
        return C - D;
    }

    public static void main(String[] args) {
        double A = 2.39;
        double B =  9.13;
        double C = 8.19;
        double D = 5.61;
        Calculator2 calculator2 = new Calculator2();
        double result1 = calculator2.addAtoB(A, B);
        double result2 = calculator2.subtractCFromD(C, D);

        System.out.println("Sum of " + A + " and " + B + " equals: "  + String.format("%.2f", result1));
        System.out.println("Difference of " + C + " and " + D + " equals: " + String.format("%.2f", result2));
    }
}
