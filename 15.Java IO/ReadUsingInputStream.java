import java.io.FileInputStream;
import java.io.IOException;

public class ReadUsingInputStream {
    public static void main(String[] args) {
        String filePath = "test.txt"; 

        try {
            FileInputStream fis = new FileInputStream(filePath);
            int i;
            while ((i = fis.read()) != -1) { 
                System.out.print((char) i);
            }
            fis.close(); 
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
