package ie.atu;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("Addition");
        add();
        System.out.println("Subtraction");
        delete();
        System.out.println("Multiplication");
        mult();
        System.out.println("Division");
        div();
    }

    public static void add()
    {
        System.out.println("Please your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);
    }

    public static void delete()
    {
        System.out.println("Please your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The final number is " + total);
    }
    public static void mult()
    {
        System.out.println("Please your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The final number is " + total);
    }
    public static void div()
    {
        System.out.println("Please your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber / secondNumber;
        System.out.println("The total is " + total);
    }
}