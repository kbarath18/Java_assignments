import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadUsingBufferedInputStream {
    public static void main(String[] args) {
        String filePath = "test.txt"; 

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
            bis.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
