import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three words:");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        if (words.length >= 3) {
            String acronym = (words[0].charAt(0) + "" + words[1].charAt(0) + words[2].charAt(0)).toUpperCase();
            System.out.println("Acronym: " + acronym);
        } else {
            System.out.println("Please enter at least three words.");
        }
    }
}
