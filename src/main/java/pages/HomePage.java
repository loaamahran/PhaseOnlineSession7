package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Methods;

public class HomePage extends Methods {
    public HomePage(WebDriver driver) {
        super(driver);
    }
private final By loginAndSignUp= By.partialLinkText("Signup / Login");

public LoginPage clickOnLoginAndSignUp(){
click(loginAndSignUp,6);
return new LoginPage(driver);}

    public SignupPage clickOnSignUp(){
        click(loginAndSignUp,6);
        return new SignupPage(driver);}
}
