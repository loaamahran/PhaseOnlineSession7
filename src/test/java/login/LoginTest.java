package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.FileNotFoundException;

public class LoginTest extends BaseTests {
@Test
public void loginSucessfullTest() throws FileNotFoundException {
//Home page.click on deh b treturn login
LoginPage loginPage= homePage.clickOnLoginAndSignUp();
loginPage.loginFeature(dataModel().Login.ValidCredentials.UserName,
        dataModel().Login.ValidCredentials.Password);
}
}
