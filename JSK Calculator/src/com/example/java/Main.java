package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //scan for the user inputs
        Scanner scan = new Scanner(System.in);
        System.out.println ("input your first number:");
        String input1 = scan.nextLine();
        System.out.println ("input your second number:");
        String input2 = scan.nextLine();


        //convert string to a double and a try catch for non number inputs.
        double number1 = 0;
        double number2 = 0;
        try {
            number1 = Double.parseDouble(input1);
            number2 = Double.parseDouble(input2);
        } catch (NumberFormatException e) {
            System.out.println("your input is not a number");
            return;
        }
        System.out.println("input operator (+,-,*,/):");
        String input3 = scan.nextLine();

        // here is the switch method
            switch (input3) {
                case "+":
                    addValues(number1, number2);
                    break;
                case "-":
                    subValues(number1, number2);
                    break;
                case "*":
                    multValues(number1, number2);
                    break;
                case "/":
                    divValues(number1, number2);
                    break;
                default:
                    System.out.println("that is not a correct operator");
            }
        }

        //the addition method
    static void addValues (double number1, double number2){
        double result = number1 + number2;
        System.out.println("The result is: " + result );

    }
    //the subraction method
    static void subValues (double number1, double number2){
        double result = number1 - number2;
        System.out.println("The result is: " + result );

    }

    //the multiplication method
    static void multValues (double number1, double number2){
        double result = number1 * number2;
        System.out.println("The result is: " + result );

    }
    //the division method
    static void divValues (double number1, double number2){
        double result = number1 / number2;
        System.out.println("The result is: " + result );

    }


}
