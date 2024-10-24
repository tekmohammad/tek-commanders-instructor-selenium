package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathLocator {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By logoLocator = By.xpath("/html/body/div/div[1]/div[1]/div[1]/a");

        WebElement logoElement  =driver.findElement(logoLocator);

        String text = logoElement.getText();
        System.out.println(text);

        driver.quit();
    }
}
