import java.util.Scanner;

public class Calculator {
  
    public Calculator() {
      
    }

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
            return 0; 
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner operators = new Scanner(System.in);
        Scanner operands = new Scanner(System.in);

        System.out.println("What operation? ('+', '-', '*', '/')");
        char operator = operators.next().charAt(0);  

        System.out.println("Insert 2 numbers:");
        System.out.print("operand 1: ");
        int x = operands.nextInt();  
        System.out.print("operand 2: ");
        int y = operands.nextInt(); 

        Calculator calc = new Calculator();
        int result = 0;

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

        System.out.println("The result is: " + result);  
    }
}


