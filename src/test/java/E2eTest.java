import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import config.TestConfig;
import org.example.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

public class E2eTest extends TestConfig {
    AuthPage authPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    HeaderPage headerPage;
    HomePage homePage;
    Product product;

    @BeforeTest
    public void setup() {
        authPage = new AuthPage();
        cartPage = new CartPage();
        checkoutPage = new CheckoutPage();
        headerPage = new HeaderPage();
        homePage = new HomePage();
        product = new Product();

    }

    @Test
    public void e2eTestAsGuest() throws InterruptedException {
        homePage.openPage();
        $(byTitle("Radiant Tee")).click();
        product.clickSizeXS();
        product.clickColorBlue();
        product.addToCart();
        sleep(3000);
        headerPage.cartIconClick();
        sleep(3000);
        headerPage.clickProceedToCheckout();
        sleep(3000);
        checkoutPage.emailAdress.type(authPage.email1);
        sleep(1000);
        checkoutPage.firstName.type(authPage.firstName);
        checkoutPage.lastName.type(authPage.lastName);
        checkoutPage.adress.type(authPage.address);
        checkoutPage.city.type(authPage.city);
        checkoutPage.country.selectOption("Romania");
        checkoutPage.state.selectOption("Olt");
        checkoutPage.zipCode.type("123456");
        checkoutPage.phone.type(authPage.phone);
        checkoutPage.nextBtn.click();
        checkoutPage.placeOrederBtn.click();
    }

    @Test
    public void e2eTestAuthenticated() throws InterruptedException {
        homePage.openPage();
        headerPage.signInBtn.click();
        authPage.emailField.type("John1223@gmail.com");
        authPage.passwordField.type("Tester1!");
        authPage.signInBtn.click();
        sleep(3000);
        $(byTitle("Radiant Tee")).click();
        product.clickSizeXS();
        product.clickColorBlue();
        product.addToCart();
        sleep(3000);
        headerPage.cartIconClick();
        sleep(3000);
        headerPage.clickProceedToCheckout();
        sleep(3000);
        checkoutPage.emailAdress.type(authPage.email1);
        sleep(1000);
        checkoutPage.firstName.type(authPage.firstName);
        checkoutPage.lastName.type(authPage.lastName);
        checkoutPage.adress.type(authPage.address);
        checkoutPage.city.type(authPage.city);
        checkoutPage.country.selectOption("Romania");
        checkoutPage.state.selectOption("Olt");
        checkoutPage.zipCode.type("123456");
        checkoutPage.phone.type(authPage.phone);
        checkoutPage.nextBtn.click();
    }
}
