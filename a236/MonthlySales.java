import java.util.Scanner;

public class MonthlySales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] sales = new int[12];

        System.out.println("Enter sales for 12 months:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            sales[i] = sc.nextInt();
        }

        int maximum = sales[0];
        int minimum = sales[0];

        for (int i = 1; i < 12; i++) {

            if (sales[i] > maximum)
                maximum = sales[i];

            if (sales[i] < minimum)
                minimum = sales[i];
        }

        System.out.println("\nHighest Sales: " + maximum);
        System.out.println("Lowest Sales: " + minimum);

        sc.close();
    }
}