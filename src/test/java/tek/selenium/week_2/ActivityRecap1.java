package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityRecap1 {

    /*
    In Retail App https://retail.tekschool-students.com/
    Search for TV and Click on First product displayed
    Then print the product title on the next page.

     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.findElement(
                By.xpath("/html/body/div/div[1]/div[1]/div[1]/div[1]/div[2]/div/input"))
                .sendKeys("TV");

        driver.findElement(
                By.xpath("/html/body/div/div[1]/div[1]/div[1]/div[1]/div[2]/div/button"))
                .click();

        Thread.sleep(1000);

        driver.findElement(
                By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/img"))
                .click();

        Thread.sleep(1000);

        String productTitle = driver.findElement(
                By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/h1"))
                .getText();

        System.out.println(productTitle);

        driver.quit();


    }

}
