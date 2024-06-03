import java.util.Scanner;

public class ArrayIndexHandling {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an index to access:");
            int index = scanner.nextInt();

            try {
                System.out.println("Element at index " + index + ": " + array[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index. Please enter a valid index between 0 and " + (array.length - 1));
            }
        }
    }
}
