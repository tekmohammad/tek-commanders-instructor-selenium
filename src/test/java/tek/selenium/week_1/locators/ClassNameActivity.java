package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameActivity {

    /*
    On Retail app get the Text of Logo on Top Left Corner (TEKSCHOOL)
    Print it.
     */

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        By logoLocator = By.className("top-nav__logo");
        WebElement logoElement = driver.findElement(logoLocator);
        String logoText = logoElement.getText();

        System.out.println(logoText);

        driver.quit();
    }
}
