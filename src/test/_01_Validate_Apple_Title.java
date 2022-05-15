package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
        /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the title of the page is displayed as "Apple"
 */
    public static void main(String[] args) throws InterruptedException {

    WebDriver driver = Driver.getDriver();
        driver.get("https://www.apple.com/");

        System.out.println("The title of the page is = " + driver.getTitle());

        if(driver.getTitle().equals("Apple")) System.out.println("Google title validation PASS");
        else  System.out.println("Google title validation FAILED");

        System.out.println("End of the program");

        Thread.sleep(3000);
       Driver.quitDriver();

    }
}
