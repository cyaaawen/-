import java.util.Scanner;

public class Inbetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        
        if (num1 == num2) {
            System.out.println("There are no integers between the entered values.");
        } else {
            int start = Math.min(num1, num2) + 1;
            int end = Math.max(num1, num2);

            System.out.println("Integers between " + num1 + " and " + num2 + ":");
            for (int i = start; i < end; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
