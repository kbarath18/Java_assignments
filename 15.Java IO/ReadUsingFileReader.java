import java.io.FileReader;
import java.io.IOException;

public class ReadUsingFileReader {
    public static void main(String[] args) {
        String filePath = "test.txt"; 

        try {
            FileReader fr = new FileReader(filePath);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
