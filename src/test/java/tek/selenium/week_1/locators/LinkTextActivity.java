package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextActivity {
    /*
    Navigate to https://www.bbc.com/
    Then Click on business link
    Then Get The text of Page Title and print it.
    Quit browser

     */
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        By businessLinkLocator = By.linkText("Business");
        WebElement businessLinkElement = driver.findElement(businessLinkLocator);
        businessLinkElement.click();

        Thread.sleep(2000);

        By titleLocator = By.className("juQBdA");
        WebElement titleElement = driver.findElement(titleLocator);
        String titleText  = titleElement.getText();
        System.out.println(titleText);

        Thread.sleep(2000);
        driver.quit();

    }
}
