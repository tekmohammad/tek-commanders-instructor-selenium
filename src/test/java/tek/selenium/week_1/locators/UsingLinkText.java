package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkText {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        // when the target element in <a> you can use the visible text
        // of element to locate the element with method linkText();
        By signInLinkLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLinkLocator);
        signInElement.click();

        Thread.sleep(1000);
        driver.quit();
    }
}
