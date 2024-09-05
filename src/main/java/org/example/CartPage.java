package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public SelenideElement cartTitle = $(".base");
    public SelenideElement cartList = $("#shopping-cart-table");
    private final List<ProductInCartPage> productsInCarts = new ArrayList<>();
    public void openCartPage(){
        Selenide.open("https://magento.softwaretestingboard.com/checkout/cart/");
    }
    public String getTitle(){
        return cartTitle.getText();
    }
    public List<ProductInCartPage> getProductsInCarts(){
        return this.productsInCarts;
    }
    public Integer getProductInCartsNumber (){
        return getProductsInCarts().size();
    }
}
