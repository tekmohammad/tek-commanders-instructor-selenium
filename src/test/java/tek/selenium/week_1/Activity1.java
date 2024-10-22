package tek.selenium.week_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    //Open Chrome
    //Maximize,
    //Navigate to https://www.bbc.com/
    //Get Title and the quit.
    //Commit and push to your repository
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");

        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();
    }
}
