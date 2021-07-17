package polymorphismconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MethodOverloadingSelenium {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("url");
        //method overload having same methods name but accept different types of parameters
         //1) driver.switchTo().frame(int index)
        // 2)driver.switchTo().frame(String nameorId)
        //3)driver.switchTo().frame(Webelement element)
    //method present in Actions class ,method accepts webelement and another method accept no parameter
       // Actions act=new Actions(driver);
      //  act.click();
       // act.click(WebElement);

        //All testng assertions methods

    }
}