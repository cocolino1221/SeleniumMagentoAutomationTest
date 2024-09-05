package org.example;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage {
  public SelenideElement emailField = $("#email");
  public  SelenideElement passwordField = $("#pass");
  public  SelenideElement signInBtn = $("#send2");
  public  SelenideElement createAccount = $(".create");
  public  SelenideElement forgotPass = $(".remind");
  public SelenideElement errorMSg = $(".message-error > div:nth-child(1)");
  public SelenideElement firstNameField = $("#firstname");
  public SelenideElement lastNameField = $("#lastname");
  public SelenideElement emailAdressFieldSignUp = $("#email_address");
  public SelenideElement passwordFieldSignUp = $("#password");
  public SelenideElement confirmPasswordField = $("#password-confirmation");
  public SelenideElement createAnAccountBtn = $(".submit");
  public SelenideElement succesMsg = $(".message-success");

  Locale locale = new Locale("en-RO");
  Faker faker = new Faker(locale);

 public String firstName = faker.name().firstName();
 public String lastName = faker.name().lastName();
 public String address = faker.address().streetAddress();
 public String email1 = faker.internet().emailAddress();
 public String phone = faker.phoneNumber().cellPhone();
 public String city = faker.address().city();

}
