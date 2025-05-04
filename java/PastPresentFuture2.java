import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter a day: ");
        int day = input.nextInt();

        LocalDate enteredDate = LocalDate.of(year, month, day);

        if (enteredDate.isBefore(currentDate)) {
            System.out.println("The entered date is in the past.");
        } else if (enteredDate.isAfter(currentDate)) {
            System.out.println("The entered date is in the future.");
        } else {
            System.out.println("The entered date is today.");
        }
    }
}
