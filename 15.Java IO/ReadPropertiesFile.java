import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) {
        String filePath = "config.properties"; 

        try {
            FileInputStream fis = new FileInputStream(filePath);
            Properties prop = new Properties();
            prop.load(fis);
            System.out.println("Username: " + prop.getProperty("username"));
            System.out.println("Password: " + prop.getProperty("password"));
            fis.close();
        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
        }
    }
}
