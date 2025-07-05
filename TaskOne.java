import java.util.Scanner;

public class TaskOne {

    public static double add(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static double subtract(double[] numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public static double multiply(double[] numbers) {
        double result = 1;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }

    public static double divide(double[] numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println("Error: Division by zero!");
                return 0;
            }
            result /= numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("Welcome to Multi-Number Java Console Calculator");

        while (keepRunning) {
             
            System.out.println("\nSelect Operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

             
            System.out.print("How many numbers? ");
            int n = scanner.nextInt();

            if (n < 2) {
                System.out.println("Enter at least 2 numbers.");
                continue;
            }

            double[] numbers = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextDouble();
            }

            //operation
            double result = 0;
            switch (choice) {
                case 1:
                    result = add(numbers);
                    break;
                case 2:
                    result = subtract(numbers);
                    break;
                case 3:
                    result = multiply(numbers);
                    break;
                case 4:
                    result = divide(numbers);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
