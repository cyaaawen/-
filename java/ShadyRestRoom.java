import java.util.Scanner;

public class ShadyRestRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a room type:");
        System.out.println("1 - Queen bed");
        System.out.println("2 - King bed");
        System.out.println("3 - Suite with king bed and pullout couch");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        int price;
        switch (choice) {
            case 1:
                price = 125;
                System.out.println("Room type: Queen bed");
                break;
            case 2:
                price = 139;
                System.out.println("Room type: King bed");
                break;
            case 3:
                price = 165;
                System.out.println("Room type: Suite with king bed and pullout couch");
                break;
            default:
                price = 0;
                System.out.println("Invalid room type.");
        }

        System.out.println("Room price: $" + price);
    }
}
