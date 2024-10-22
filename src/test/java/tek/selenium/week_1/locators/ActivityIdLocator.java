package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityIdLocator {
    /*
    Navigate to Retail App Then click on Sign in
    then Click on Create new Account
    Then Quit browser
    Push to your repository and share the link
     */

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");

        driver.manage().window().maximize();

        By signInLocator = By.id("signinLink");
       WebElement signInElement = driver.findElement(signInLocator);
       signInElement.click();

       By singUpLocator = By.id("newAccountBtn");
       WebElement signUpElement = driver.findElement(singUpLocator);
       signUpElement.click();

       Thread.sleep(2000);
       driver.quit();
    }
}
