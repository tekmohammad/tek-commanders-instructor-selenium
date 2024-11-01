package tek.selenium.week_2.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity2 {
    /*
       On New Retail App https://dev.retail.tekschool-students.com/
        Navigate to Sing In page then go to sign up page.
        Fill up the form and Submit then Sign in with newly registered user
        and Validate Full Name display on User Profile Drop Down
     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        SeleniumUtility utility = new SeleniumUtility(wait);

        int randomNumber = (int)(Math.random() * 1000);
        String email = "mohammad_instructor"+randomNumber+"@tekschool.us";
        utility.click(By.linkText("Sign in"));

        utility.click(By.partialLinkText("register here"));

        utility.sendKey(By.name("firstName"), "Mohammad");
        utility.sendKey(By.name("lastName"), "Shokriyan");

        utility.sendKey(By.name("email"), email);

        utility.sendKey(By.name("password"), "Password@123");

        utility.sendKey(By.name("confirmPassword"), "Password@123");

        utility.click(By.cssSelector("button.ant-btn-primary"));

        String pageTitle = utility.getText(By.xpath("//div[text()='Sign in']"));

        if (!pageTitle.equals("Sign in"))
            throw new RuntimeException("User not in Sign in page");

        utility.sendKey(By.name("email"), email);

        utility.sendKey(By.name("password"), "Password@123");

        utility.click(By.xpath("//span[contains(text(),'Sign In')]/.."));

        utility.click(By.cssSelector("button.ant-dropdown-trigger"));

        String username = utility.getText(
                By.xpath("//ul//div[@class='ant-space-item']"));

        if (username.equals("Mohammad Shokriyan"))
            System.out.println("Test passed");
        else
            System.out.println("Test Failed");

        driver.quit();
    }
}
