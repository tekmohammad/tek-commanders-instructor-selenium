package tek.selenium.week_1.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
    /*
    In New Retail app https://dev.retail.tekschool-students.com/
    Go to sign in page and enter wrong@email.com as email
    and passwordWrong as password
    You should error message "Email or Password is incorrect"
    print that error
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Sign in")).click();

        Thread.sleep(1000);

        driver.findElement(By.name("email")).sendKeys("Wrong@email.com");
        driver.findElement(By.name("password")).sendKeys("PasswordWrong");

        driver.findElement(By.className("ant-btn-primary")).click();

        Thread.sleep(1000);

        String errorMessage = driver.findElement(By.className("ant-alert-message")).getText();

        System.out.println(errorMessage);
        driver.quit();
    }
}
