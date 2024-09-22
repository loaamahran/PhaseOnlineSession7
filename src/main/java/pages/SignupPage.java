package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Methods;

public class SignupPage extends Methods {
    WebDriver driver;
    public SignupPage(WebDriver driver) {
        super(driver);
    }
    private final By nameField=By.name("name") ;
    private final By emailField=By.name("email");
    private final By signUpButton=By.cssSelector("[data-qa='signup-button']");

    public void insertName(String name){
    sendKeys(nameField,name,3);
    }
    public void insertEmail(String email){
    sendKeys(emailField,email,3);
    }
    public void clickOnSignupButton(){
     click(signUpButton,3);
    }
    public void signupFeature(String name,String email){
        insertName(name);
        insertEmail(email);
        clickOnSignupButton();
    }
}
