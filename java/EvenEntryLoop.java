import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter an even number or 999 to stop: ");
            number = input.nextInt();
            
            if (number == 999) {
                break;
            } else if (number % 2 == 0) {
                System.out.println("Good job!");
            } else {
                System.out.println("Error: You entered an odd number.");
            }
        } while (number != 999);
    }
}
