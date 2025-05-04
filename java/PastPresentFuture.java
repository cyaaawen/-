import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();

        if (year != currentYear) {
            System.out.println("The entered date is not in this year.");
        } else if (month < currentMonth) {
            System.out.println("The entered date is in an earlier month this year.");
        } else if (month > currentMonth) {
            System.out.println("The entered date is in a later month this year.");
        } else {
            System.out.println("The entered date is in the current month.");
        }
    }
}
