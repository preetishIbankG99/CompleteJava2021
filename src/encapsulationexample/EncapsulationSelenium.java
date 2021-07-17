package encapsulationexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EncapsulationSelenium {
    //Declaration
    private WebElement username;
    private WebElement password;
    private WebElement loginbtn;

    //initialization
    public void Loginpage(WebDriver driver){
        username=driver.findElement(By.className("userid"));
        password=driver.findElement(By.id("password"));
        loginbtn=driver.findElement(By.name("logbtn"));
    }
//utilization\operation
    public void setUsername(String un){
        username.sendKeys(un);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickLoginbtn() {
        loginbtn.click();
    }
}
