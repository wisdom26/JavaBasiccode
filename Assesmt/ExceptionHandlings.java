import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandlings {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the file path:");

            String filePath = scanner.nextLine();

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
