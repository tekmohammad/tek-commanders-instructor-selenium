package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathWithFunctions {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(
                By.xpath("//a[text()='Sign in']"))
                .click();

        Thread.sleep(2000);

        //Example Using text() on Xpath
        WebElement loginButton = driver.findElement(
                By.xpath("//button[text()='Login']"));

        //Example using contains and attribute
//        WebElement loginButton = driver.findElement(
//                By.xpath("//button[contains(@class , 'login__submit')]"));

        //isEnabled method return true if the element is enabled
        //And return false if the element is Disabled
        boolean isLoginButtonEnabled =loginButton.isEnabled();

        System.out.println(isLoginButtonEnabled);
        driver.quit();
    }
}
