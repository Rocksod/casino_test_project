
package ru.testing.api.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Builder
public class User {

    public User(String mobilePhone, Boolean agreedToPartnerPromotions, Boolean termsAcceptance, String email, String password, String firstName, String lastName, String currency, String dateOfBirth, String gender) {
        this.mobilePhone = mobilePhone;
        this.agreedToPartnerPromotions = agreedToPartnerPromotions;
        this.termsAcceptance = termsAcceptance;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currency = currency;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    @SerializedName("mobile_phone")
    private String mobilePhone;
    @SerializedName("agreed_to_partner_promotions")
    private Boolean agreedToPartnerPromotions;
    @SerializedName("terms_acceptance")
    private Boolean termsAcceptance;
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("currency")
    private String currency;
    @SerializedName("date_of_birth")
    private String dateOfBirth;
    @SerializedName("gender")
    private String gender;


    public Boolean getAgreedToPartnerPromotions() {
        return agreedToPartnerPromotions;
    }

    public void setAgreedToPartnerPromotions(Boolean agreedToPartnerPromotions) {
        this.agreedToPartnerPromotions = agreedToPartnerPromotions;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getTermsAcceptance() {
        return termsAcceptance;
    }

    public void setTermsAcceptance(Boolean termsAcceptance) {
        this.termsAcceptance = termsAcceptance;
    }

    public String getYearOfBirth() {
        return dateOfBirth.substring(0, 4);
    }

    public String getMonthOfBirth() {
        return dateOfBirth.substring(5, 7);
    }

    public String getDayOfBirth() {
        return dateOfBirth.substring(8, 10);
    }

}
