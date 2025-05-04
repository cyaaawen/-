import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value to count by: ");
        int countBy = input.nextInt();
        
        int count = 0;
        for (int i = countBy; i <= 500; i += countBy) {
            System.out.print(i + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println(); // Start a new line after every 10 values
            }
        }
    }
}
