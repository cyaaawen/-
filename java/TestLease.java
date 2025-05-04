// TestLease.java
import java.util.Scanner;

public class TestLease {
    public static void main(String[] args) {
        Lease lease1 = getData();
        Lease lease2 = new Lease();

        // Show values for lease1
        showValues(lease1);
        lease1.addPetFee();
        showValues(lease1);

        // Show default values for lease2
        showValues(lease2);
    }

    // Method to get data from user
    public static Lease getData() {
        Scanner input = new Scanner(System.in);
        Lease lease = new Lease();

        System.out.print("Enter tenant's name: ");
        lease.setTenantName(input.nextLine());

        System.out.print("Enter apartment number: ");
        lease.setApartmentNumber(input.nextInt());

        System.out.print("Enter monthly rent amount: ");
        lease.setRent(input.nextDouble());

        System.out.print("Enter lease term in months: ");
        lease.setLeaseTerm(input.nextInt());

        return lease;
    }

    // Method to show lease values
    public static void showValues(Lease lease) {
        System.out.println("\nLease Details:");
        System.out.println("Tenant Name: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getApartmentNumber());
        System.out.println("Monthly Rent: $" + lease.getRent());
        System.out.println("Lease Term: " + lease.getLeaseTerm() + " months");
    }
}
