package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseCSSLocatorActivity {
    /*
    In Retail App https://retail.tekschool-students.com/
    then go to Sign in and sign in with Invalid credentials
    Then print the error message
    Only use CSS Selector
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(
                By.cssSelector("a#signinLink"))
                .click();

        driver.findElement(
                By.cssSelector("input[name='email']"))
                .sendKeys("Mohammad_Wrong@gmail.com");
        driver.findElement(
                By.cssSelector("input[name='password']"))
                .sendKeys("WrongPassword");

        driver.findElement(
                By.cssSelector("button#loginBtn"))
                .click();

        Thread.sleep(1000);
       String errorMessage = driver.findElement(
                By.cssSelector("div.error"))
                .getText();

        System.out.println(errorMessage);
        driver.quit();
    }
}
