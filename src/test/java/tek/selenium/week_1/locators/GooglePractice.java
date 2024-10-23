package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePractice {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        By searchInputLocator = By.name("q");
        WebElement searchInputElement = driver.findElement(searchInputLocator);
        searchInputElement.sendKeys("Tekschool");

        Thread.sleep(1000);

        By searchBtnLocator = By.name("btnK");
        WebElement searchBtnElement = driver.findElement(searchBtnLocator);
        searchBtnElement.click();

       By firstLinkLocator = By.partialLinkText("TEK SCHOOL Modern");
       WebElement firstLinkElement = driver.findElement(firstLinkLocator);
       firstLinkElement.click();


        Thread.sleep(5000);
        driver.quit();
    }
}
