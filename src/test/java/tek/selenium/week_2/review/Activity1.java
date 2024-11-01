package tek.selenium.week_2.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1 {

    /*
    On New Retail App https://dev.retail.tekschool-students.com/
    Sign in with  following user and make sure You logged in and use name display
    under user profile drop down
    {
    name: "Quinn Turner",
    email: "quinn.turner@example.com",
    password: "password123",
        },
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        SeleniumUtility utility = new SeleniumUtility(wait);

        utility.click(By.linkText("Sign in"));

        utility.sendKey(By.name("email"), "quinn.turner@example.com");

        utility.sendKey(By.name("password"), "password123");

        utility.click(By.xpath("//span[contains(text(),'Sign In')]/.."));

        utility.click(By.cssSelector("button.ant-dropdown-trigger"));

        String username = utility.getText(
                By.xpath("//ul//div[@class='ant-space-item']"));

        if (username.equals("Quinn Turner"))
            System.out.println("Test passed");
        else
            System.out.println("Test Failed");

        driver.quit();
    }
}
