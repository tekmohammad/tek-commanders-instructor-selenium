package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathActivity {

    /*
    In Retail app click on Video Games then click on Play Station
    Then Get Text of product title. and print it.
    Only use Xpath
     */
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        By videoGameLocator = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[1]/div/div/div[2]/img");
        driver.findElement(videoGameLocator).click();

        Thread.sleep(1000);
        By psLocator = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/img");
        driver.findElement(psLocator).click();

        Thread.sleep(1000);
        By psTitleLocator = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/h1");
        String productTitleText = driver.findElement(psTitleLocator).getText();

        System.out.println(productTitleText);
        driver.quit();
    }
}
