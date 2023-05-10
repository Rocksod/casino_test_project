package ru.testing.api.entities;

import helpers.TestDataHelper;

import static helpers.TestDataHelper.*;
import static data.Currency.*;

public class UserFactory {
    public static User createRandomUser() {
        String email = generateEmail();
        String password = generateHardPassword();
        String firstName = generateRandomName(6);
        String lastName = generateRandomName(6);
        String birthdate = generateRandomDate();
        String gender = generateRandomGender();
        String currency = getRandomCurrency().toString();
        String mobilePhone = TestDataHelper.generateThaiPhoneNumber();
        return new User(mobilePhone, false, true, email,
                password, firstName, lastName, currency, birthdate, gender);
    }

    public static User createUserWithCurrency(String currency) {
         User user = createRandomUser();
         user.setCurrency(currency);
         return user;
    }
}