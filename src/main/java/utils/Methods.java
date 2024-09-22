package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Methods {
//Elclass dh hn3ml feh implement l selenium action fe mkan wahed bs
//w hnhot feh l kol action elhagat ely kona bndefha leh zy elwait k2no reusable component
    protected WebDriver driver;
    WebDriverWait wait;
  public Methods(WebDriver driver){
 this.driver=driver;
  }
  private WebElement webElement(By locator){
  return driver.findElement(locator);
  }

    //3ayza a wait 3la eh 3la locator
    // and btgm3 kol elconditions dol 3lshan tshtghl
 protected void explicitWait(By locator, int time){
 wait=new WebDriverWait(driver, Duration.ofSeconds(time)) ;
 wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(webElement(locator)),
ExpectedConditions.presenceOfElementLocated(locator),
ExpectedConditions.elementToBeClickable(locator),
ExpectedConditions.visibilityOfElementLocated(locator)

 ));
 }
//Lw feh elay hyhsl fail f mhtaga adelo wait
 protected void click(By locator,int time){
explicitWait(locator,time);
webElement(locator).click();
 }
protected void sendKeys(By locator,String text,int time){
explicitWait(locator,time);
webElement(locator).sendKeys(text);
}

}
