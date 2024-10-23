package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClassNameLocator {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(500);
        By signInLocator = By.id("signinLink");
        driver.findElement(signInLocator).click();

        Thread.sleep(2000);

        By subTitleLocator = By.className("login__subtitle");
        WebElement subtitleElement = driver.findElement(subTitleLocator);

        String text = subtitleElement.getText();

        System.out.println(text);

        driver.quit();
    }
}
