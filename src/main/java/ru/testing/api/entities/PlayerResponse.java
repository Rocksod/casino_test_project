package ru.testing.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerResponse {

    @SerializedName("auth_fields_missed")
    private List<Object> authFieldsMissed;
    @SerializedName("autologin_link")
    private Object autologinLink;
    @SerializedName("autoregistered")
    private Boolean autoregistered;
    @SerializedName("can_issue_bonuses")
    private Boolean canIssueBonuses;
    @SerializedName("city")
    private String city;
    @SerializedName("confirmed_at")
    private Object confirmedAt;
    @SerializedName("country")
    private Object country;
    @SerializedName("created_at")
    private String createdAt;
    @JsonProperty("currency")
    private String currency;
    @SerializedName("current_sign_in_at")
    private String currentSignInAt;
    @JsonProperty("date_of_birth")
    private String dateOfBirth;
    @SerializedName("deposit_bonus_code")
    private Object depositBonusCode;
    @SerializedName("email")
    private String email;
    @JsonProperty("first_name")
    private String firstName;
    @SerializedName("gender")
    private String gender;
    @SerializedName("iban")
    private Object iban;
    @SerializedName("id")
    private Long id;
    @SerializedName("language")
    private String language;
    @JsonProperty("last_name")
    private String lastName;
    @SerializedName("license_name")
    private String licenseName;
    @JsonProperty("mobile_phone")
    private String mobilePhone;
    @SerializedName("personal_id_number")
    private Object personalIdNumber;
    @SerializedName("profession")
    private Object profession;
    @SerializedName("sow_questionnaire_expires_at")
    private Object sowQuestionnaireExpiresAt;
    @SerializedName("statuses")
    private List<Object> statuses;
    @SerializedName("two_factor_enabled")
    private Boolean twoFactorEnabled;
    @SerializedName("user_account_status")
    private String userAccountStatus;
    @SerializedName("verified")
    private Boolean verified;

    public List<Object> getAuthFieldsMissed() {
        return authFieldsMissed;
    }

    public void setAuthFieldsMissed(List<Object> authFieldsMissed) {
        this.authFieldsMissed = authFieldsMissed;
    }

    public Object getAutologinLink() {
        return autologinLink;
    }

    public void setAutologinLink(Object autologinLink) {
        this.autologinLink = autologinLink;
    }

    public Boolean getAutoregistered() {
        return autoregistered;
    }

    public void setAutoregistered(Boolean autoregistered) {
        this.autoregistered = autoregistered;
    }

    public Boolean getCanIssueBonuses() {
        return canIssueBonuses;
    }

    public void setCanIssueBonuses(Boolean canIssueBonuses) {
        this.canIssueBonuses = canIssueBonuses;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object getConfirmedAt() {
        return confirmedAt;
    }

    public void setConfirmedAt(Object confirmedAt) {
        this.confirmedAt = confirmedAt;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrentSignInAt() {
        return currentSignInAt;
    }

    public void setCurrentSignInAt(String currentSignInAt) {
        this.currentSignInAt = currentSignInAt;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Object getDepositBonusCode() {
        return depositBonusCode;
    }

    public void setDepositBonusCode(Object depositBonusCode) {
        this.depositBonusCode = depositBonusCode;
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

    public Object getIban() {
        return iban;
    }

    public void setIban(Object iban) {
        this.iban = iban;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Object getPersonalIdNumber() {
        return personalIdNumber;
    }

    public void setPersonalIdNumber(Object personalIdNumber) {
        this.personalIdNumber = personalIdNumber;
    }

    public Object getProfession() {
        return profession;
    }

    public void setProfession(Object profession) {
        this.profession = profession;
    }

    public Object getSowQuestionnaireExpiresAt() {
        return sowQuestionnaireExpiresAt;
    }

    public void setSowQuestionnaireExpiresAt(Object sowQuestionnaireExpiresAt) {
        this.sowQuestionnaireExpiresAt = sowQuestionnaireExpiresAt;
    }

    public List<Object> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Object> statuses) {
        this.statuses = statuses;
    }

    public Boolean getTwoFactorEnabled() {
        return twoFactorEnabled;
    }

    public void setTwoFactorEnabled(Boolean twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
    }

    public String getUserAccountStatus() {
        return userAccountStatus;
    }

    public void setUserAccountStatus(String userAccountStatus) {
        this.userAccountStatus = userAccountStatus;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public void assertPlayerResponse( User user) {
        assertAll("user",
                () -> assertNotNull(getId()),
                () -> assertEquals(getEmail().toLowerCase(), user.getEmail().toLowerCase()),
                () -> assertEquals(user.getCurrency(), getCurrency()),
                () -> assertEquals(user.getFirstName(), getFirstName()),
                () -> assertEquals(user.getLastName(), getLastName()),
                () -> assertEquals(user.getDateOfBirth(), getDateOfBirth()),
                () -> assertEquals(user.getMobilePhone(), getMobilePhone())
        );
    }

}
