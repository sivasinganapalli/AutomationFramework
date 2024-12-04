package testcases;

import base.BaseTest;
import pages.LoginPage;
import utils.ConfigReader;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @BeforeMethod
    public void setUp() {
        initializeDriver();
    }

    @Test
    public void testLogin() {
    	String username = ConfigReader.getProperty("username");
    	String password = ConfigReader.getProperty("password");
    	

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
    }
}
