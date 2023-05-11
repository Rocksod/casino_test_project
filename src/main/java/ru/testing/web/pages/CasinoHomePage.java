package ru.testing.web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import ru.testing.api.entities.User;

import static com.codeborne.selenide.Selenide.$;
import static data.Constants.*;

public class CasinoHomePage  {
    public final SelenideElement casinoSignUpButton =
            $(By.xpath(".//a[@ng-click='auth_modal.showRegistration()' and @translate='frontend.links.sign_up']"));
    public final SelenideElement emailField =
            $(By.xpath("//input[@class='form-control ng-pristine ng-valid ng-empty ng-touched']"));
    public final SelenideElement passwordField =
            $(By.xpath("//*[@type='password' and contains(@class, 'password_with_toggle__input')]"));
    public final SelenideElement nameField = $(By.xpath(".//input[@placeholder='Имя']"));
    public final SelenideElement surnameField = $(By.xpath(".//input[@placeholder='Фамилия']"));
    public final SelenideElement telephoneField =
            $(By.xpath(".//input[@type='tel']"));
    public final SelenideElement maleGenderRadio = $(By.id("m"));
    public final SelenideElement femaleGenderRadio = $(By.id("f"));
    public final SelenideElement ddBirthdayField = $(By.xpath(".//input[contains(@class,'birthday-dd')]"));
    public final SelenideElement mmBirthdayField = $(By.xpath(".//input[contains(@class,'birthday-mm')]"));
    public final SelenideElement yyyyBirthdayField = $(By.xpath(".//input[contains(@class,'birthday-yyyy')]"));
    public final SelenideElement currencyButton = $(By.id("user_currency"));
    public final SelenideElement agreementCheckbox =
            $(By.xpath(".//input[@placeholder='" + AGREEMENT_ELEMENT_TEXT + " ']"));
    public final SelenideElement submitButton = $(By.name("submit"));

    public final SelenideElement successSignUpMessage =
            $(By.xpath(".//*[contains(text(),'" + SUCCESS_REGISTRATION_MESSAGE_TEXT + "')]"));
    public final SelenideElement autoregistrationButton =
            $(By.xpath("//button[contains(@translate,'frontend.links.autoregister')]"));
    public final SelenideElement depositButton =
            $(By.xpath("//button[@class='btn btn_lg btn-success ng-binding'][text()='" + DEPOSIT_BUTTON_TEXT + "']"));
    public final SelenideElement username = $(By.xpath("//div[@class='user__name ng-binding']"));

    public void clickHomePageSignUpButton() {
        casinoSignUpButton.click();
        autoregistrationButton.waitUntil(Condition.visible, DEFAULT_TIMEOUT);
    }

    public void fillEmail(String email) {
        emailField.setValue(email);
    }

    public void fillPassword(String password) {
        passwordField.setValue(password);
    }

    public void fillFirstName(String name) {
        nameField.setValue(name);
    }

    public void fillLastName(String lastname) {
        surnameField.setValue(lastname);
    }

    public void fillTelephone(String telephone) {
        telephoneField.setValue(telephone);
    }

    public void setMaleGender() {
        maleGenderRadio.click();
    }

    public void setFemaleGender() {
        femaleGenderRadio.click();
    }

    public void fillBirthday(String dd, String mm, String yyyy) {
        ddBirthdayField.setValue(dd);
        mmBirthdayField.setValue(mm);
        yyyyBirthdayField.setValue(yyyy);
    }

    public void setCurrency(String currency) {
        SelenideElement option = $(By.xpath(".//option[@label='" + currency + "']"));
        currencyButton.click();
        option.click();
    }

    public void acceptAgreement() {
        agreementCheckbox.click();
    }

    public void submit() {
        submitButton.click();
    }

    public void waitSuccessSignUpMessage() {
        successSignUpMessage.waitUntil(Condition.visible, DEFAULT_TIMEOUT);
    }

    public void clickAutoregistrationButton() {
        autoregistrationButton.doubleClick();
    }

    public void assertUserLogin() {
        Assertions.assertAll(
                () -> casinoSignUpButton.should(Condition.not(Condition.visible)),
                () -> username.should(Condition.visible),
                () -> depositButton.should(Condition.visible)
        );
    }

    public void fillInSignUpForm(User user) {
        fillFirstName(user.getFirstName());
        fillLastName(user.getLastName());
        fillEmail(user.getEmail());
        fillPassword(user.getPassword());
        fillTelephone(user.getMobilePhone());
        fillBirthday(user.getDayOfBirth(), user.getMonthOfBirth(), user.getYearOfBirth());
        setCurrency(user.getCurrency());
        acceptAgreement();
    }
}
