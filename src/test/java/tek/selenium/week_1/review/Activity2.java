package tek.selenium.week_1.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity2 {
    /*
    On new Retail app https://dev.retail.tekschool-students.com/
    On home page search Apple and click on Search
    On product display section should be 3 card related to app
    print the count.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        By searchInputLocator = By.id("searchInput");
        WebElement searchInputElement = driver.findElement(searchInputLocator);
        searchInputElement.sendKeys("Apple");

        By searchBtnLocator = By.className("ant-input-search-button");
        WebElement searchBtnElement = driver.findElement(searchBtnLocator);
        searchBtnElement.click();

        Thread.sleep(1000);

        By productCardLocator = By.className("ant-card-hoverable");
        List<WebElement> productCards = driver.findElements(productCardLocator);

        int cardSize = productCards.size();
        System.out.println("Card Count " + cardSize);

        driver.quit();
    }
}
