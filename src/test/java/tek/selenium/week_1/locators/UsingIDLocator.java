package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDLocator {
        //Trying to Click on Sign In Button In Retail app.

    public static void main(String[] args) throws InterruptedException{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);
        //Step 1 Locate the Element
        By signInLink = By.id("signinLink");

        //Step 2 Ask Selenium to Find the Element.
        WebElement signInElement = driver.findElement(signInLink);

        //Step 3 Perform the Action.
        signInElement.click();

        Thread.sleep(10_000);

        driver.quit();
    }
}
