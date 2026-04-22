import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {

        String fileName = "sample.txt";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a file handling example.\n");
            writer.write("Java makes file operations easy!");
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
}