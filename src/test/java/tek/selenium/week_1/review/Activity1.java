package tek.selenium.week_1.review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Activity1 {
    /*
    Open the new retail app https://dev.retail.tekschool-students.com/
    on Chrome Get Title and quite
    then open on Edge get Title and Quite
     */
    public static void main(String[] args) throws InterruptedException {
        /*
        Refactor this code to let user (Scanner)
        to choose which browser to open then open the app with that browser.
        chrome or edge if wrong option throw Exception
        hint: WebDriver interface can be as reference type WebDriver driver = new ChromeDriver();
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose browser between chrome and edge");
        String browser = scanner.next();

        WebDriver driver;

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Wrong browser");
        }

        driver.get("https://dev.retail.tekschool-students.com/");
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);
        driver.quit();

    }
}
