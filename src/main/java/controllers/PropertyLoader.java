package controllers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.Properties;

public class PropertyLoader {

    private static final String PATH_TO_PROPERTIES = "src/test/resources/application.properties";

    private static Properties loadProperties(String path) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(path);
             InputStreamReader reader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8)) {
            Properties prop = new Properties();
            prop.load(reader);
            return prop;
        }
    }

    private static Optional<String> getProperty(String key) {
        Properties prop = new Properties(System.getProperties());
        try {
            prop.putAll(loadProperties(PATH_TO_PROPERTIES));
            return Optional.ofNullable(prop.getProperty(key));
        } catch (IOException e) {
            return Optional.empty();
        }
    }

    public static String loadPropertyOrDefault(String key, String defaultValue) {
        return getProperty(key).orElse(defaultValue);
    }
}