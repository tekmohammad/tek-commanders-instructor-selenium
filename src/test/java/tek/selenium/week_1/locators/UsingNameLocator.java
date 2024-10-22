package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocator {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(500);
        By signInLocator = By.id("signinLink");
        driver.findElement(signInLocator).click();

        Thread.sleep(2000);
        //Locate Element with name attribute
        By emailInputLocator = By.name("email");
        WebElement emailElement = driver.findElement(emailInputLocator);
        //For input elements, you can type to those elements.
        //use sendKeys method to enter a value into an input element.
        emailElement.sendKeys("mohammad2536@gmail.com");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Password@123");

        By loginButton =By.id("loginBtn");
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();

        Thread.sleep(10000);

        driver.quit();
    }
}
