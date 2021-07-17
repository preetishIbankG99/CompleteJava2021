package mukeshseleniumassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnAutomationTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/GUDU/IdeaProjects/JavaJunePractice/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://learn-automation.com/");
        String url=driver.getCurrentUrl();
        System.out.println("Url Of Webpage is::: "+url);
        System.out.println();
        String title=driver.getTitle();
        System.out.println("Title of Webpage is#### "+title);
        System.out.println();
        String sourcecode=driver.getPageSource();
        System.out.println("sourcecode of webpage is***** "+sourcecode);

    }
}
