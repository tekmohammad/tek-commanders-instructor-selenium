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
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.linkText("Sign in")))
                        .click();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.name("email")))
                .sendKeys("quinn.turner@example.com");

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.name("password")))
                .sendKeys("password123");

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//span[contains(text(),'Sign In')]/..")))
                .click();


        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("button.ant-dropdown-trigger")))
                .click();

        String username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//ul//div[@class='ant-space-item']")))
                .getText();

        if (username.equals("Quinn Turner"))
            System.out.println("Test passed");
        else
            System.out.println("Test Failed");

        driver.quit();
    }
}
