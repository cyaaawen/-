public class NineInts {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Numbers from first to last:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nNumbers from last to first:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
