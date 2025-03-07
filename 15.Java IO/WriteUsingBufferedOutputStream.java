import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingBufferedOutputStream {
    public static void main(String[] args) {
        String filePath = "test.txt"; 
        String content = "Buffered output stream example!";

        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
            bos.write(content.getBytes());
            bos.close();
            System.out.println("Text written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
