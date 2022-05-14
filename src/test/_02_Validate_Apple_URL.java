package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) throws InterruptedException {
        /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the URL of the page is displayed as "https://www.apple.com/"

    NOTE:
    driver.getCurrentUrl(); // this line returns the URL of the current page as a String
 */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mitio\\IdeaProjects\\selenium_intro\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.apple.com/");

        System.out.println("The title of the page is = " + driver.getCurrentUrl());

        if(driver.getCurrentUrl().equals("https://www.apple.com/")) System.out.println("Google title validation PASS");
        else  System.out.println("Google title validation FAILED");

        System.out.println("End of the program");

        Thread.sleep(3000);
        driver.quit();
    }
}
