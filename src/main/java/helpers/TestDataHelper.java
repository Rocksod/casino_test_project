package helpers;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.util.Random;

import static data.Constants.*;

public class TestDataHelper {
    private static final Random random = new Random();


    private static String getRandomEmailDomain() {
       return MAIL_DOMAINS[random.nextInt(MAIL_DOMAINS.length)];
    }

    public static String generateEmail() {
       return EMAIL_PREFIX + RandomStringUtils.randomAlphabetic(5) + getRandomEmailDomain();
    }

    public static int generateRandomYear() {
        return 1950 + random.nextInt(52);
    }

    public static int generateRandomMonth() {
        return 1 + random.nextInt(12);
    }

    public static int generateRandomDay(int year, int month) { Random random = new Random();
        return 1 + random.nextInt(LocalDate.of(year, month, 1).lengthOfMonth());
    }

    public static String generateRandomDate() {
        int year = generateRandomYear();
        int month = generateRandomMonth();
        int day = generateRandomDay(year, month);
        return String.format(DATE_FORMAT, year, month, day);
    }

    public static String generatePassword(int lenght) {
        return RandomStringUtils.randomAlphanumeric(lenght);
    }

    public static String generateHardPassword() {
        return generatePassword(10) + "!";
    }

    public static String generateRandomGender() {
        return random.nextBoolean() ? GENDER_MALE  : GENDER_FEMALE;
    }

    public static String generateRandomName(int lentgh) {
        return NAME_PREFIX + RandomStringUtils.randomAlphabetic(lentgh);
    }

    public static String generateThaiPhoneNumber() {
        Random random = new Random();
        String prefix = THAI_PHONE_FORMAT;
        String number = "";
        for (int i = 0; i < 4; i++) {
            number += random.nextInt(10);
        }
        return prefix + number;
    }
}
