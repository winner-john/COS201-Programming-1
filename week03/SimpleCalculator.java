import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number:20 ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: 15");
        double num2 = input.nextDouble();
        
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        System.out.println("\n--- CALCULATOR RESULTS ---");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Quotient: Cannot divide by zero");
        }
    }
}
