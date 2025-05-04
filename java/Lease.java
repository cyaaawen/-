// Lease.java
public class Lease {
    private String tenantName;
    private int apartmentNumber;
    private double rent;
    private int leaseTerm;

    // Default constructor
    public Lease() {
        tenantName = "XXX";
        apartmentNumber = 0;
        rent = 1000;
        leaseTerm = 12;
    }

    // Getter and Setter for tenantName
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    // Getter and Setter for apartmentNumber
    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    // Getter and Setter for rent
    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    // Getter and Setter for leaseTerm
    public int getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    // Non-static method to add pet fee
    public void addPetFee() {
        rent += 10;
        explainPetPolicy();
    }

    // Static method to explain pet policy
    public static void explainPetPolicy() {
        System.out.println("A pet fee of $10 has been added to the monthly rent.");
    }
}
