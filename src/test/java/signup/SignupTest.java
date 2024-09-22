package signup;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupPage;

import java.io.FileNotFoundException;

public class SignupTest extends BaseTests {
@Test
public void sucessfullSignup() throws FileNotFoundException {
    SignupPage signup= homePage.clickOnSignUp();
signup.signupFeature(dataModel().Signup.name,
dataModel().Signup.email      );
}
}
