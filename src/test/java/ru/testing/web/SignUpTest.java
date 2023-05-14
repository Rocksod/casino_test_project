package ru.testing.web;

import controllers.BaseTest;
import data.Currency;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.testing.api.entities.User;
import ru.testing.api.entities.UserFactory;
import ru.testing.web.pages.CasinoHomePage;

/**
 * Tests for player sign-up Web
 */
public class SignUpTest extends BaseTest {

    protected CasinoHomePage casinoHomePage = new CasinoHomePage();

    /**
     * Check sign up player using web
     */
    @DisplayName("Test registration of new player")
    @Test
    public void casinoSignUpTest() {
        User user = UserFactory.createUserWithCurrency(Currency.EUR.name());

        casinoHomePage.clickHomePageSignUpButton();
        casinoHomePage.fillInSignUpForm(user);
        casinoHomePage.submit();
        casinoHomePage.waitSuccessSignUpMessage();
    }

    /**
     * Check sign up player using web and autoregistration button
     */
    @DisplayName("Test registration using autoregistration button")
    @Test
    public void autoSignUpButtonTest() {
        casinoHomePage.clickHomePageSignUpButton();
        casinoHomePage.clickAutoregistrationButton();
        casinoHomePage.assertUserLogin();
    }
}