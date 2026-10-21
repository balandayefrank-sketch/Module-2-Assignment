import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter first number: ");
        double x = input.nextDouble();

        System.out.print("Enter second number:");
        double y = input.nextDouble();

        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y)); 

        input.close();
       }
}

