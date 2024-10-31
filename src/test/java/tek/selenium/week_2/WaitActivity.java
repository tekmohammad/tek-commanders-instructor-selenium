package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitActivity {
    /*
    Sign In to retail app with your credentials
    Then go to account page and update phone number
    Make sure Success Message Toast is displayed
    NOTE: Apply Implicit and Explicit wait .

    Hint-> WebElement have clear() which should use before SendKey to input element
     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.linkText("Sign in")))
                .click();

        WebElement emailInput = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.name("email")));
        emailInput.clear();
        emailInput.sendKeys("mohammad2536@gmail.com");

        WebElement passwordElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.name("password")));
        passwordElement.clear();
        passwordElement.sendKeys("Password@123");

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[text()='Login']")))
                .click();

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.linkText("Account")))
                .click();

       WebElement phoneNoElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.name("phoneNumber")));
       phoneNoElement.clear();
       phoneNoElement.sendKeys("2023631235");

       wait.until(
               ExpectedConditions.elementToBeClickable(
                       By.cssSelector("button#personalUpdateBtn")))
               .click();

      WebElement toastMessageElement = wait.until(
               ExpectedConditions.visibilityOfElementLocated(
                       By.cssSelector("div.Toastify__toast-container")));

        System.out.println(toastMessageElement.isDisplayed());

        driver.quit();
    }

}
