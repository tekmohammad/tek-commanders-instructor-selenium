package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity2 {
    /*
    In retail app navigate to sign in page then click on create new account
    then click on sign up button without filling the form and print all the errors displayed
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.findElement(
                By.xpath("//a[text()='Sign in']"))
                .click();
        Thread.sleep(1000);

        driver.findElement(
                By.xpath("//a[contains(text() , 'New Account')]"))
                .click();

        driver.findElement(
                By.xpath("//button[@type='submit']"))
                .click();
        Thread.sleep(1000);
        List<WebElement> errorElements  = driver.findElements(By.className("error"));
        for (WebElement element: errorElements) {
            System.out.println(element.getText());
        }

        driver.quit();
    }
}
