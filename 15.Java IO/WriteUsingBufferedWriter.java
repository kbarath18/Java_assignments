import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBufferedWriter {
    public static void main(String[] args) {
        String filePath = "test.txt"; 
        String content = "Writing to a file using BufferedWriter.";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write(content);
            bw.newLine();
            bw.write("This is another line.");
            bw.close();
            System.out.println("Text written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
