public class Date {

    public void displayDate(int month) {
        System.out.printf("2024-%02d-01\n", month);
    }
    public void displayDate(int month, int day) {
        System.out.printf("2024-%02d-%02d\n", month, day);
    }
    public void displayDate(int year, int month, int day) {
        System.out.printf("%04d-%02d-%02d\n", year, month, day);
    }

    public static void main(String[] args) {
        Date date = new Date();

        date.displayDate(5);          
        date.displayDate(5, 7);       
        date.displayDate(2004, 5, 7); 
    }
}