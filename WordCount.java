import java.io.*;
import java.util.StringTokenizer;

public class WordCount {
    public static void main(String[] args) {

        String fileName = "sample.txt";
        int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line);
                wordCount += st.countTokens();
            }

            reader.close();

            System.out.println("Total number of words: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}