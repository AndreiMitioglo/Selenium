package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        //1. Setup driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mitio\\IdeaProjects\\selenium_intro\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // instantiate(launch) a Chrome Browser

        //2. Maximize driver
        driver.manage().window().maximize();  // showing the full screen chrome page not half

        //3. Define implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        //4.Navigate to Google website
        driver.get("https://www.google.com/");

        //5.Validate the title
        System.out.println("The title of the page is = " + driver.getTitle()); // Google

        if(driver.getTitle().equals("Google")) System.out.println("Google title validation PASS");
        else  System.out.println("Google title validation FAILED");

        System.out.println("End of the program");

        // 6. Quit the driver
        Thread.sleep(3000); // wait for 3 sec
        driver.quit();

    }
}
