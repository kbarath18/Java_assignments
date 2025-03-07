import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingOutputStream {
    public static void main(String[] args) {
        String filePath = "test.txt"; 
        String content = "Hello, this is a test file!";

        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            fos.write(content.getBytes());
            fos.close();
            System.out.println("Text written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
