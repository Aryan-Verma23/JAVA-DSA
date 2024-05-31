import java.util.Scanner;

public class calculator
{

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in);)
        {

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result = numbers[0];

        switch (operator) 
        {
            case '+' -> {
                for (int i = 1; i < n; i++) {
                    result += numbers[i];
                }
                }
            case '-' -> {
                for (int i = 1; i < n; i++) {
                    result -= numbers[i];
                }
                }
            case '*' -> {
                for (int i = 1; i < n; i++) {
                    result *= numbers[i];
                }
                }
            case '/' -> {
                for (int i = 1; i < n; i++) {
                    if (numbers[i] != 0) {
                        result /= numbers[i];
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                }
                }
            default -> {
                System.out.println("Error: Invalid operator");
                return;
                }
        }

        System.out.println("The result is: " + result);
    }
  }
}