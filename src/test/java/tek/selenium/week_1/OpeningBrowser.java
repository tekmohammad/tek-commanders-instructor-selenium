package tek.selenium.week_1;


import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowser {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.facebook.com/");

    }
}
