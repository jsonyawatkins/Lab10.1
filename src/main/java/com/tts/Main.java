package com.tts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MagicCalculator myCalculator = new MagicCalculator();

        System.out.println("Choose a function: ADD, SUBTRACT, MULTIPLY, DIVIDE, SQUARE, SQUARE ROOT, SIN, COS, TAN, or FACTORIAL");
        String function = scanner.next().toUpperCase();

        switch(function) {
            case "ADD":
                System.out.println("Enter your first value.");
                double addNum1 = scanner.nextInt();

                System.out.println("Enter your second value.");
                double addNum2 = scanner.nextInt();

                myCalculator.add(addNum1, addNum2);
                break;

            case "SUBTRACT":
                System.out.println("We will subtract the second value from your first value. Enter your first value.");
                double subNum1 = scanner.nextInt();

                System.out.println("Enter your second value.");
                double subNum2 = scanner.nextInt();

                myCalculator.subtract(subNum1, subNum2);
                break;

            case "MULTIPLY":
                System.out.println("Enter your first value.");
                double mulNum1 = scanner.nextInt();

                System.out.println("Enter your second value.");
                double mulNum2 = scanner.nextInt();

                myCalculator.multiply(mulNum1, mulNum2);
                break;

            case "DIVIDE":
                System.out.println("We will divide the first value by the second value. Enter your first value.");
                double divNum1 = scanner.nextInt();

                System.out.println("Enter your second value");
                double divNum2 = scanner.nextInt();

                myCalculator.divide(divNum1, divNum2);
                break;

            case "SQUARE":
                System.out.println("Enter your value.");
                double squNum1 = scanner.nextInt();

                myCalculator.square(squNum1);
                break;
            case "SQUARE ROOT":
            case "SQUAREROOT":
                System.out.println("Enter your value.");
                double sqrtNum1 = scanner.nextInt();

                myCalculator.squareRoot(sqrtNum1);
                break;
            case "SIN":
            case "SINE":
                System.out.println("Enter your value.");
                double sinNum1 = scanner.nextInt();

                myCalculator.SIN(sinNum1);
                break;
            case "COS":
            case "COSINE":
                System.out.println("Enter your value.");
                double cosNum1 = scanner.nextInt();

                myCalculator.COS(cosNum1);
                break;
            case "TAN":
            case "TANGENT":
                System.out.println("Enter your value.");
                double tanNum1 = scanner.nextInt();

                myCalculator.TAN(tanNum1);
                break;
            case "FACTORIAL":
                System.out.println("Enter your value.");
                double facNum1 = scanner.nextInt();

                myCalculator.factorial(facNum1);
                break;
            default:
                System.out.println("You did not enter a legitimate function. Please try again.");
                break;
        }

        System.out.println("Enter another function? (Yes or No)");
        String response = scanner.next().toUpperCase();

        if (response.equals("Y") || (response.equals("YES"))) {
            main(new String[0]);
        } else {
            System.out.println("Goodbye!");
        }
    }
}