import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        String filePath = "abcd.txt";
        String textToAppend = "This is the text to append.";

        try (FileWriter fw = new FileWriter(filePath, true)) {
            fw.write(textToAppend);
            fw.write(System.lineSeparator());
            System.out.println("Text has been appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
