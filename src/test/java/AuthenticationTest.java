import config.TestConfig;
import org.example.AuthPage;
import org.example.HeaderPage;
import org.example.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AuthenticationTest extends TestConfig {
    HomePage homePage;
    HeaderPage headerPage;
    AuthPage authPage;
    @BeforeTest
    public void setup(){
        homePage = new HomePage();
        headerPage = new HeaderPage();
        authPage = new AuthPage();
    }
    @Test
    public void loginTestWithValidCredentials() throws InterruptedException {
        homePage.openPage();
        headerPage.signInBtnClick();
        authPage.emailField.type("John1223@gmail.com");
        authPage.passwordField.type("Tester1!");
        authPage.signInBtn.click();
        Thread.sleep(2000);
        Assert.assertEquals(headerPage.loggedInMessage.getText(),"Welcome, qwerty qwerty!");
    }
    @Test
    public void loginTestWithInvalidCredentials()  {
        homePage.openPage();
        headerPage.signInBtnClick();
        authPage.emailField.type("John23@gmail.com");
        authPage.passwordField.type("Tester1");
        authPage.signInBtn.click();
        Assert.assertEquals(authPage.errorMSg.getText(),"The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
    }
    @Test
    public void createNewAccount(){
        homePage.openPage();
        headerPage.signUpBtn.click();
        authPage.firstNameField.type(authPage.firstName);
        authPage.lastNameField.type(authPage.lastName);
        authPage.emailAdressFieldSignUp.type(authPage.email1);
        authPage.passwordFieldSignUp.type("Tester1!");
        authPage.confirmPasswordField.type("Tester1!");
        authPage.createAnAccountBtn.click();
        Assert.assertEquals(authPage.succesMsg.getText(),"Thank you for registering with Main Website Store.");

    }
}
