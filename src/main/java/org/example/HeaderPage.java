package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {
    public SelenideElement logo = $(".logo");
    public SelenideElement signInBtn = $(".authorization-link");
    public SelenideElement supportBtn =$(".not-logged-in");
    public SelenideElement signUpBtn = $("a[href='https://magento.softwaretestingboard.com/customer/account/create/']");
    public SelenideElement searchBar = $("#search");
    public SelenideElement cartIcon = $(".showcart");
    public SelenideElement cartBadge = $(".counter-number");
    public SelenideElement proceedToCheckout = $("#top-cart-btn-checkout");
    public SelenideElement loggedInMessage = $(".logged-in");
    public SelenideElement viewCart = $(".action viewcart");

    public String getCartBadgeNumber(){
        return cartBadge.getText();

    }
    public boolean logoIsNotVisible() {
        return !logo.isDisplayed();
    }
    public void signInBtnClick(){
        signInBtn.click();
    }
    public void supportBtnClick(){
        supportBtn.click();
    }
    public void signUpBtnClick(){
        signUpBtn.click();
    }
    public void cartIconClick(){
        cartIcon.click();
    }
    public String getProductsNumberFromCart(){
        return cartBadge.getText();
    }
    public boolean cartBadgeIsImplemented(){
        return cartBadge.isDisplayed();
    }

    public void clickProceedToCheckout() {
        proceedToCheckout.click();
    }
}





