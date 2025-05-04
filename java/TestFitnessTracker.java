// TestFitnessTracker.java
import java.time.LocalDate;
import java.util.Scanner;

public class TestFitnessTracker {
    public static void main(String[] args) {
        FitnessTracker tracker1 = new FitnessTracker();
        FitnessTracker tracker2 = getData();

        // Display default tracker
        showValues(tracker1);
        // Display user input tracker
        showValues(tracker2);
    }

    // Method to get user data
    public static FitnessTracker getData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter activity: ");
        String activity = input.nextLine();

        System.out.print("Enter number of minutes: ");
        int minutes = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter month: ");
        int month = input.nextInt();

        System.out.print("Enter day: ");
        int day = input.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        return new FitnessTracker(activity, minutes, date);
    }

    // Method to show tracker values
    public static void showValues(FitnessTracker tracker) {
        System.out.println("\nFitness Tracker Details:");
        System.out.println("Activity: " + tracker.getActivity());
        System.out.println("Minutes: " + tracker.getMinutes());
        System.out.println("Date: " + tracker.getDate());
    }
}
