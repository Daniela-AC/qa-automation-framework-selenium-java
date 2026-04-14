package tests;

import base.BaseTest;
import com.test.automationexercise.pages.HomePage;
import com.test.automationexercise.pages.LoginPage;
import com.test.automationexercise.pages.UserPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    UserPage userPage;

    @BeforeEach
    public void initPages() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        userPage = new UserPage(driver);
    }

    @Test
    public void testLogInToTheAccount() {
        homePage.goToLoginPage();
        loginPage.logIn("prueba859@prueba.com", "Test123!");
        Assertions.assertTrue(userPage.getLoggedInText().contains("Logged in as"));
    }

    @Test
    public void testLogInWithWrongCredentials() {
        homePage.goToLoginPage();
        loginPage.logIn("prueba859@prueba.com", "12345");
        Assertions.assertEquals("Your email or password is incorrect!", loginPage.getWrongCredentialsMessage());
    }
}
