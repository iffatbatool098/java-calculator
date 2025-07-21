package com.mycompany.calculator;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again;

        System.out.println("Simple Calculator");

        do {
            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Percentage");

            System.out.print("Choose option (1-7): ");
            int choice = input.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double a = input.nextDouble();
                System.out.print("Enter second number: ");
                double b = input.nextDouble();

                if (choice == 1)
                    System.out.println("Result: " + (a + b));
                else if (choice == 2)
                    System.out.println("Result: " + (a - b));
                else if (choice == 3)
                    System.out.println("Result: " + (a * b));
                else if (choice == 4) {
                    if (b == 0)
                        System.out.println("Cannot divide by zero.");
                    else
                        System.out.println("Result: " + (a / b));
                }
            } else if (choice == 5) {
                System.out.print("Enter base: ");
                double base = input.nextDouble();
                System.out.print("Enter exponent: ");
                double exp = input.nextDouble();
                System.out.println("Result: " + Math.pow(base, exp));
            } else if (choice == 6) {
                System.out.print("Enter number: ");
                double num = input.nextDouble();
                if (num < 0)
                    System.out.println("Cannot find square root of negative number.");
                else
                    System.out.println("Result: " + Math.sqrt(num));
            } else if (choice == 7) {
                System.out.print("Enter total: ");
                double total = input.nextDouble();
                System.out.print("Enter part: ");
                double part = input.nextDouble();
                if (total == 0)
                    System.out.println("Total cannot be zero.");
                else
                    System.out.println("Result: " + ((part / total) * 100) + "%");
            } else {
                System.out.println("Invalid option.");
            }

            System.out.print("Do another calculation? (yes/no): ");
            again = input.next().toLowerCase();
        } while (again.equals("yes"));

        System.out.println("Calculator closed.");
    }
}