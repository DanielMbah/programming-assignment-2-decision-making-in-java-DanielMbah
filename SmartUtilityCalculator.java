// Programming Assignment 2: Decision-Making in Java
// Title: Smart Utility Calculator
// Author: Asi Mbah
// Date: November 2025
// Purpose: Practice using branching statements (if, if-else, else-if, switch)
//          to solve different utility problems through multiple decisions.

import java.util.Scanner;

public class SmartUtilityCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display menu
        System.out.println("==== Smart Utility Calculator ====");
        System.out.println("1. Check if a number is Even or Odd");
        System.out.println("2. Find the largest of three numbers");
        System.out.println("3. Grade Calculator");
        System.out.println("4. Simple Calculator (+, -, *, /)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // Main switch to handle menu choices
        switch (choice) {

            // Case 1: Even or Odd
            case 1:
                System.out.print("Enter an integer: ");
                int n = input.nextInt();
                if (n % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
                break;

            // Case 2: Largest of Three Numbers
            case 2:
                System.out.print("Enter first number: ");
                int a = input.nextInt();
                System.out.print("Enter second number: ");
                int b = input.nextInt();
                System.out.print("Enter third number: ");
                int c = input.nextInt();

                if (a >= b) {
                    if (a >= c) {
                        System.out.println("Largest number is: " + a);
                    } else {
                        System.out.println("Largest number is: " + c);
                    }
                } else {
                    if (b >= c) {
                        System.out.println("Largest number is: " + b);
                    } else {
                        System.out.println("Largest number is: " + c);
                    }
                }
                break;

            // Case 3: Grade Calculator
            case 3:
                System.out.print("Enter your score (0 - 100): ");
                int score = input.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Please enter between 0 and 100.");
                } else if (score >= 90) {
                    System.out.println("Grade: A");
                } else if (score >= 80) {
                    System.out.println("Grade: B");
                } else if (score >= 70) {
                    System.out.println("Grade: C");
                } else if (score >= 60) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: F");
                }
                break;

            // Case 4: Simple Calculator
            case 4:
                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();
                System.out.print("Enter an operator (+, -, *, /): ");
                char op = input.next().charAt(0);
                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                switch (op) {
                    case '+':
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case '*':
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            System.out.println("Result: " + (num1 / num2));
                        }
                        break;
                    default:
                        System.out.println("Invalid operator.");
                }
                break;

            // Case 5: Exit
            case 5:
                System.out.println("Goodbye!");
                break;

            // Invalid menu choice
            default:
                System.out.println("Invalid menu option.");
        }

        input.close();
    }
}
