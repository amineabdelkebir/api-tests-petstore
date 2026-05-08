package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    private static Properties properties = new Properties();

    static {

        try {
            // 1. Read environment from system property
            String env = System.getProperty("env", "dev");

            // 2. Build file name dynamically
            String fileName = "config-" + env + ".properties";

            // 3. Load file from resources
            InputStream input = ConfigManager.class
                    .getClassLoader()
                    .getResourceAsStream(fileName);

            properties.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load config file", e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}