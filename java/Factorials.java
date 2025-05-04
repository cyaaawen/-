import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a limit for factorial calculation: ");
        int limit = input.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println("Factorial of " + i + " is " + calculateFactorial(i));
        }
    }

    public static int calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
