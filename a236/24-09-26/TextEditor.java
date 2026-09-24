import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor {
    public static void main(String[] args) {

        String content = "Welcome to Java File Handling.\n"
                       + "This is a text editor example.";

        try {
            // Writing content to file
            FileWriter writer = new FileWriter("document.txt");

            writer.write(content);
            writer.close();

            System.out.println("Content written successfully.");

            // Reading content from file
            FileReader reader = new FileReader("document.txt");

            int ch;
            System.out.println("\nFile Content:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("File error: " + e);
        }
    }
}