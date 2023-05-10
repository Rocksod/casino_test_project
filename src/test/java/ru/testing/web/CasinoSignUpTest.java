package ru.testing.web;

import controllers.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.testing.api.entities.User;
import ru.testing.api.entities.UserFactory;
import ru.testing.web.pages.CasinoHomePage;

public class CasinoSignUpTest extends BaseTest {

    protected CasinoHomePage casinoHomePage = new CasinoHomePage();

    @DisplayName("Test registration of new player")
    @Test
    public void casinoSignUpTest() {
        User user = UserFactory.createUserWithCurrency("EUR");

        casinoHomePage.clickHomePageSignUpButton();
        casinoHomePage.fillInSignUpForm(user);
        casinoHomePage.submit();
        casinoHomePage.waitSuccessSignUpMessage();
    }

    @DisplayName("Another example of test registration")
    @Test
    public void autoSignUpButtonTest() {
        casinoHomePage.clickHomePageSignUpButton();
        casinoHomePage.clickAutoregistrationButton();
        casinoHomePage.assertUserLogin();
    }
}