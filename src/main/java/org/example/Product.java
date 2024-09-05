package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Product {
    private final SelenideElement sizeXS = $("#option-label-size-143-item-166");
    private final SelenideElement colorBlue = $("#option-label-color-93-item-50");
    private final SelenideElement addToCartButton = $("#product-addtocart-button");
//    private final SelenideElement link;
//    private final String name;
//    private final String price;
//    private final SelenideElement addToFavButton;
//    private final SelenideElement deleteFromCart;
//    private final String productId;
//    private final SelenideElement productPicture;
//    private final SelenideElement review;
//    private final SelenideElement size;
//
//
//    public Product(String productId) {
//        this.productId = productId;
//        String productLink = String.format("[href='https://magento.softwaretestingboard.com/%s.html']", productId);
//        this.link = $(productLink);
//        this.name = link.getText();
//        SelenideElement parentCard = link.parent().parent();
//        this.price = parentCard.$(".product-items widget-product-grid").getText();
//        //this.addToCartButton = parentCard.$("#product-addtocart-button");
//        this.addToFavButton = parentCard.$(".action towishlist");
//        this.review = parentCard.$(".rating-result");
//        this.deleteFromCart = parentCard.$(".fa-trash");
//        this.productPicture = parentCard.$(".product-image-photo");
//        this.size = parentCard.$(".swatch-option text");
//        //this.sizeXS = parentCard.$("#option-label-size-143-item-166");
//        //this.colorBlue = parentCard.$("#option-label-color-93-item-50");
//    }

//    public String getProductId() {
//        return productId;
//    }


    public void addToCart() {
        this.addToCartButton.click();

    }
//
//    public String getName() {
//        return name;
//
//    }
//
//    public String getPrice() {
//        return price;
//    }
//
//    public void productPage() {
//        this.link.click();
//    }
//
//    public SelenideElement getReview() {
//        return review;
//    }
//
//    public SelenideElement getProductPicture() {
//        return productPicture;
//    }
//
//    public SelenideElement getDeleteFromCart() {
//        return deleteFromCart;
//    }
//
//    public SelenideElement getAddToFavButton() {
//        return addToFavButton;
//    }
//
//    public SelenideElement getSize() {
//        return size;
//    }

    public void clickColorBlue() {
        colorBlue.click();
    }

    public void clickSizeXS() {
         sizeXS.click();
    }
}
