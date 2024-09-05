package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {
    public SelenideElement firstName = $(byName("firstname"));
    public SelenideElement lastName = $(byName("lastname"));
    public SelenideElement company = $("#TL75R1K");
    public SelenideElement adress = $(byName("street[0]"));
    public SelenideElement city = $(byName("city"));
    public SelenideElement zipCode = $(byName("postcode"));
    public SelenideElement state = $(byName("region_id"));
    public SelenideElement country = $(byName("country_id"));
    public SelenideElement emailAdress = $(".input-text#customer-email");
    public SelenideElement phone = $(byName("telephone"));
    public SelenideElement shippingMethod = $("#checkout-step-shipping_method");
    public SelenideElement nextBtn = $(".primary");
    public SelenideElement placeOrederBtn = $(".action primary checkout");
}

