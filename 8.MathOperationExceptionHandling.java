import java.util.Scanner;

public class MathOperationExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = performMathOperation(num1, num2);
            System.out.println("Result of the operation: " + result);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }

    private static double performMathOperation(double num1, double num2) throws ArithmeticException {
        // Perform a mathematical operation, for example, division
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        return num1 / num2;
    }
}
