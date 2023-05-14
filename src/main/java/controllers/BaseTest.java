package controllers;

import com.codeborne.selenide.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import ru.testing.api.services.PlayerService;

import static com.codeborne.selenide.Selenide.open;
import static controllers.PropertyLoader.loadPropertyOrDefault;

public class BaseTest {
    protected static final String BASE_URL = loadPropertyOrDefault("baseUrl",
            "https://s1.casino.softswiss.com");
    private static final Logger logger = LogManager.getLogger(PlayerService.class);

    @BeforeEach
    public void setUp() {
        Configuration.startMaximized = true;
        open(BASE_URL);
    }

}