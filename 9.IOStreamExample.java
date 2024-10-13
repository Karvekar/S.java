import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOStreamExample {

    public static void main(String[] args) {
        // Using BufferedReader to read input from the user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Requesting the user to enter some text
        System.out.print("Enter some text: ");
        try {
            // Reading the input text
            String inputText = reader.readLine();

            // Using BufferedWriter to write the input text to a file
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            // Writing the input text to the file
            writer.write(inputText);

            // Closing the writer to ensure data is flushed and the file is properly closed
            writer.close();

            System.out.println("Text successfully written to the file 'output.txt'");
        } catch (IOException e) {
            // Handling IOException that might occur during file operations
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                // Closing the BufferedReader
                reader.close();
            } catch (IOException e) {
                // Handling IOException that might occur during closing the BufferedReader
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}
