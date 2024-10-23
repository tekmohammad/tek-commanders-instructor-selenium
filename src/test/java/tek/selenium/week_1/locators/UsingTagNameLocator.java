package tek.selenium.week_1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UsingTagNameLocator {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");

        //Get All the links in Home Pages

        By linkLocator = By.tagName("h2");  //<a>Link</a>

// Note findElement() only return first element find in the DOM
//        WebElement element = driver.findElement(linkLocator);
//
//        String linkText = element.getText();
//
//        System.out.println("Link Text " + linkText);

       List<WebElement> allLinkElements = driver.findElements(linkLocator);

       for(WebElement element : allLinkElements) {
           String text = element.getText();
           System.out.println(text);
       }

        driver.quit();
    }
}
