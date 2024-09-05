import config.TestConfig;
import org.example.CartPage;
import org.example.HeaderPage;
import org.example.HomePage;
import org.example.Product;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class CartTest extends TestConfig {
    HeaderPage header;
    HomePage homePage;
    CartPage cartPage;
    Product product;


    @BeforeTest
    public void setup() {
        header = new HeaderPage();
        homePage = new HomePage();
        cartPage = new CartPage();
        product = new Product();


    }
    @Test
    public void openCartFromLink(){
        cartPage.openCartPage();
        assertEquals(cartPage.getTitle(),"Shopping Cart");
    }
    @Test
    public void addToCartTest() throws InterruptedException {
        homePage.openPage();
        $(byTitle("Radiant Tee")).click();
        product.clickSizeXS();
        product.clickColorBlue();
        product.addToCart();
        sleep(5000);
        assertEquals(header.getCartBadgeNumber(),"1");
        $(byText("shopping cart")).click();
        assertEquals(title(),"Shopping Cart");
        assertEquals(cartPage.getProductInCartsNumber(),2);

    }
    @Test
    public void openCartFromHomepage() throws InterruptedException {
        homePage.openPage();
        $(byTitle("Radiant Tee")).click();
        product.clickSizeXS();
        product.clickColorBlue();
        product.addToCart();
        sleep(5000);
        assertEquals(header.getCartBadgeNumber(),"1");
        header.cartIconClick();
        sleep(2000);
        header.clickProceedToCheckout();
        assertEquals(cartPage.getTitle(),"Checkout");
    }

}
