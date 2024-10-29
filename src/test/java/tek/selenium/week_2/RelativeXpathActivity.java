package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathActivity {
    /*
    In Retail App https://retail.tekschool-students.com/
    Search for Keyboard and Click on First product displayed
    Then print the product title on the next page.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(
                By.xpath("//input[@id='searchInput']"))
                .sendKeys("TV");
        driver.findElement(
                By.xpath("//button[@class='search__btn']"))
                .click();

        Thread.sleep(1000);

        driver.findElement(
                By.xpath("//div[@class='products']/div[1]/p[@class='products__name']"))
                .click();

        Thread.sleep(1000);

        String productTitle = driver.findElement(
                By.xpath("//h1[@class='product__name']"))
                .getText();

        System.out.println(productTitle);

        driver.quit();

    }
}
