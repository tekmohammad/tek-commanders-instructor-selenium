package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecapActivity2 {

    /*
    In retail app go to sign in page.
    Enter wrong credentials.
    and get error message and print it.
    Push to your repository share link the repository
     */
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By signInLink = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLink);
        signInElement.click();

        By emailInput = By.name("email");
        WebElement emailElement = driver.findElement(emailInput);
        emailElement.sendKeys("wrong@gmail.com");

        By passwordInput = By.name("password");
        WebElement passwordElement = driver.findElement(passwordInput);
        passwordElement.sendKeys("WrongPassword123");

        By loginBtn = By.id("loginBtn");
        WebElement loginElement = driver.findElement(loginBtn);
        loginElement.click();

        Thread.sleep(1000);

        By errorMessage = By.className("error");
        WebElement errorElement = driver.findElement(errorMessage);
        String errorText = errorElement.getText();
        System.out.println(errorText);
        driver.quit();
    }
}
