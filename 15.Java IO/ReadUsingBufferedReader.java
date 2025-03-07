import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBufferedReader {
    public static void main(String[] args) {
        String filePath = "test.txt"; 

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
