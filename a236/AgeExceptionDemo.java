import java.util.Scanner;

public class AgeExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String ageInput = sc.nextLine();

            int age = Integer.parseInt(ageInput);

            System.out.println("Age entered: " + age);

            // Demonstrating ArithmeticException
            int result = age / 0;

            System.out.println("Result: " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter a valid number.");
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        System.out.println("Program completed.");

        sc.close();
    }
}