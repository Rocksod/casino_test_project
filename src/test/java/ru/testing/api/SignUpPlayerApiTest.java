package ru.testing.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.testing.api.entities.PlayerResponse;
import ru.testing.api.entities.User;
import ru.testing.api.services.PlayerService;

import static ru.testing.api.entities.UserFactory.createUserWithCurrency;

/**
 * Tests for player sign-up API
 */
public class SignUpPlayerApiTest {

    /**
     * Check sign up player using api and check response
     */
    @Test
    @DisplayName("Api sign up")
    public void playerSignUpApiTest() {
        User user = createUserWithCurrency("EUR");
        PlayerService playerService = new PlayerService();

        PlayerResponse playerResponse = playerService.signUpPlayer(user);
        playerResponse.assertPlayerResponse(user);
    }

}