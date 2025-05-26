package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    public static Properties propertyLoader(String filePath) {

        Properties properties = new Properties();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new java.io.FileReader(filePath));
            try {
                properties.load(reader);
                reader.close();
            }
            catch(IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to load properties file: " + filePath, e);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to read properties file: " + filePath, e);
        }
        return properties;
    }
}
