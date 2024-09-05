import config.TestConfig;
import org.example.HeaderPage;
import org.example.HomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomePageTest extends TestConfig {
    HomePage homePage;
    HeaderPage header;
    @BeforeTest
    public void setup(){
        homePage = new HomePage();
        header = new HeaderPage();
    }

    @Test
    public void openPageTest(){
        homePage.openPage();
        assertFalse(header.logoIsNotVisible());
    }
}
