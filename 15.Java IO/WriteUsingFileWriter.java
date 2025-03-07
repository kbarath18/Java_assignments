import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {
    public static void main(String[] args) {
        String filePath = "test.txt"; 
        String content = "Writing to a file using FileWriter.";

        try {
            FileWriter fw = new FileWriter(filePath);
            fw.write(content);
            fw.close();
            System.out.println("Text written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
