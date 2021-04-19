package com.tts;

public class MagicCalculator extends Calculator{
    public void squareRoot(double num1) {
        double sqrt = Math.sqrt(num1);
        System.out.println("The square root of " + num1 + " is " + sqrt);
    }

    public void SIN(double num1) {
        double total = Math.sin(num1);
        System.out.println("The sin of " + num1 + " is " + total);
    }

    public void COS(double num1) {
        double total = Math.cos(num1);
        System.out.println("The cosine of " + num1 + " is " + total);
    }

    public void TAN(double num1) {
        double total = Math.tan(num1);
        System.out.println("The tangent of " + num1 + " is " + total);
    }

    public void factorial(double num1) {
        double total = 1;
        if (num1 == 0 || num1 == 1){
            total = 1;
        } else {
            for(var i = num1; i >= 1; i--){
                total = total * i;
            }
            System.out.println("The factorial of " + num1 + " is " + total);
        }
    }
}