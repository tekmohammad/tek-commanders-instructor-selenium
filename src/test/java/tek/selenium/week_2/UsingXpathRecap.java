package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathRecap {

    /*
    In Retail app using your credentials login
    make sure you are logged in
    Only use relative XPATH
    WebElement -> isDisplayed();

    Search for Keyboard and Select first Keyboard on the list
    Then Click on Add to Cart and Make sure Cart Icon contains the number
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(
                        By.xpath("//a[text()='Sign in']"))
                .click();

        driver.findElement(
                        By.xpath("//input[@name='email']"))
                .sendKeys("mohammad2536@gmail.com");

        driver.findElement(
                        By.xpath("//input[@name='password']"))
                .sendKeys("Password@123");

        driver.findElement(
                        By.xpath("//button[text() = 'Login']"))
                .click();

        Thread.sleep(1000);

        boolean isLogoutDisplayed = driver.findElement(
                        By.xpath("//button[text() = 'Log out']"))
                .isDisplayed();

        if (isLogoutDisplayed) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.findElement(
                        By.xpath("//input[@class='search__input']"))
                .sendKeys("Keyboard");

        driver.findElement(
                By.xpath("//button[@id='searchBtn']"))
                        .click();
        Thread.sleep(1000);

        driver.findElement(
                By.xpath("//div[@class='products']/div[1]/img"))
                        .click();

        Thread.sleep(1000);

        //In this xpath "/.." means 1 level up to element parent
        driver.findElement(
                By.xpath("//span[text()='Add to Cart']/.."))
                        .click();

        Thread.sleep(1000);

        boolean isCartQuantityDisplayed= driver.findElement(
                By.xpath("//span[@id='cartQuantity']"))
                        .isDisplayed();

        System.out.println(isCartQuantityDisplayed);
        if(isCartQuantityDisplayed)
            System.out.println("Test Passed Cart Quantity Displayed");
        else
            System.out.println("Test Failed Cart Quantity Did not displayed");

        driver.quit();
    }
}
