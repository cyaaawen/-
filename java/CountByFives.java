public class CountByFives {
    public static void main(String[] args) {
        final int START = 5;
        final int STOP = 500;
        
        for (int i = START; i <= STOP; i += 5) {
            System.out.print(i + " ");
            if (i % 50 == 0) {
                System.out.println(); // Start a new line after every multiple of 50
            }
        }
    }
}
