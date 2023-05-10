package controllers;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static controllers.PropertyLoader.loadPropertyOrDefault;

public class BaseTest {
    protected static final String BASE_URL = loadPropertyOrDefault("baseUrl",
            "https://s1.casino.softswiss.com");

    @BeforeEach
    public void setUp() {
        Configuration.startMaximized = true;
        open(BASE_URL);
    }

}