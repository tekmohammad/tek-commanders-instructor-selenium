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
        }else {
            System.out.println("Test Failed");
        }

        driver.quit();
    }
}
