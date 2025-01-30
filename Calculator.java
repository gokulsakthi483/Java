import java.util.Scanner;

public class Calculator {
    // Constructor
    public Calculator() {
        // Not necessary to initialize the scanners in the constructor
    }

    // Methods for operations
    public int addition(int x, int y) {
        return x + y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public int division(int x, int y) {
        if (y == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;  // Avoid division by zero error
        }
        return x / y;
    }

    // Main method
    public static void main(String[] args) {
        Scanner operators = new Scanner(System.in);
        Scanner operands = new Scanner(System.in);

        System.out.println("What operation? ('+', '-', '*', '/')");
        char operator = operators.next().charAt(0);  // Read operator

        System.out.println("Insert 2 numbers:");
        System.out.print("operand 1: ");
        int x = operands.nextInt();  // Read first operand
        System.out.print("operand 2: ");
        int y = operands.nextInt();  // Read second operand

        Calculator calc = new Calculator();  // Create Calculator object
        int result = 0;

        // Switch to handle the operation
        switch (operator) {
            case '+':
                result = calc.addition(x, y);
                break;
            case '-':
                result = calc.subtraction(x, y);
                break;
            case '*':
                result = calc.multiplication(x, y);
                break;
            case '/':
                result = calc.division(x, y);
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("The result is: " + result);  // Print the result
    }
}


