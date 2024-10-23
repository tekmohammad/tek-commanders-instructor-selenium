package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameActivity {

    /*
    Navigate to Facebook.com and enter username and password.
    (please use dummy data)

     */
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        Thread.sleep(1000);

        By emailLocator = By.name("email");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("mohammad@gmail.com");

        By passLocator = By.name("pass");
        WebElement passElement = driver.findElement(passLocator);
        passElement.sendKeys("WrongPassword");


        By loginButton = By.name("login");
        driver.findElement(loginButton).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
