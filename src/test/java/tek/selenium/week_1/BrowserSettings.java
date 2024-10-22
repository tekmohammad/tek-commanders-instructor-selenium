package tek.selenium.week_1;

import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSettings {

    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();

        driver.get("https://www.google.com/");

        //Maximize Browser
        driver.manage().window().maximize();

        String pageTitle = driver.getTitle(); //

        System.out.println(pageTitle);

        driver.quit();

    }
}
