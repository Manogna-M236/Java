import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FitnessProfile {
    public static void main(String[] args) {

        String data = "Name: Manogna\nAge: 20\nWeight: 55 kg\nGoal: Fitness";

        try {
            // Writing data to file
            FileOutputStream fos = new FileOutputStream("profile.txt");

            fos.write(data.getBytes());
            fos.close();

            System.out.println("Profile data written successfully.");

            // Reading data from file
            FileInputStream fis = new FileInputStream("profile.txt");

            int ch;
            System.out.println("\nUser Profile:");

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println("File error: " + e);
        }
    }
}