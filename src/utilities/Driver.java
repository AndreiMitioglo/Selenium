package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    //1. Private Constructor
    private Driver(){

    }
    //2. PRivate Driver
    private static WebDriver driver;

    //3. Get driver method
    public static WebDriver getDriver(){
       if (driver == null){
           // Telling your system where is your chrome driver is located
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\mitio\\IdeaProjects\\selenium_intro\\chromedriver_win32\\chromedriver.exe");
           // Create a object of the web browser that you automating
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           // waiting only that web element to be EXISTED
           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       }
        return driver;

    }

    public static void quitDriver(){
        if (driver != null){
            driver.manage().deleteAllCookies(); // deleting all cookies
            driver.quit();
            driver = null;
        }
    }
}
