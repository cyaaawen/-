import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean valid;

        do {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();
            valid = validatePassword(password);

            if (!valid) {
                System.out.println("Password is not valid. It must contain:");
                System.out.println("- At least 2 uppercase letters");
                System.out.println("- At least 3 lowercase letters");
                System.out.println("- At least 1 digit");
            } else {
                System.out.println("Password is valid.");
            }
        } while (!valid);
    }

    public static boolean validatePassword(String password) {
        int upperCount = 0, lowerCount = 0, digitCount = 0;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) upperCount++;
            else if (Character.isLowerCase(c)) lowerCount++;
            else if (Character.isDigit(c)) digitCount++;
        }

        return upperCount >= 2 && lowerCount >= 3 && digitCount >= 1;
    }
}
