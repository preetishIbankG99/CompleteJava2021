package encapsulationexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EncapsulationSeleniumTest {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("url");
        EncapsulationSelenium es=new EncapsulationSelenium();
        es.setUsername("admin");
        es.setPassword("admin123");
        es.clickLoginbtn();

    }
}
