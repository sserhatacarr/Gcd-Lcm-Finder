import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Calculate the GCD (Greatest Common Divisor)
        int gcd = findGCD(num1, num2);

        // Calculate the LCM (Least Common Multiple)
        int lcm = findLCM(num1, num2);

        // Print the results
        System.out.println("GCD (EBOB): " + gcd);
        System.out.println("LCM (EKOK): " + lcm);
    }

    // Function to calculate the GCD (Greatest Common Divisor)
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // We use Math.abs to ensure the result is always positive
    }

    // Function to calculate the LCM (Least Common Multiple)
    public static int findLCM(int a, int b) {
        return Math.abs(a * b) / findGCD(a, b);
    }
}

