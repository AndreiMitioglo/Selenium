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

        /*
        ** Setting up driver in Java system and launching a browser:
    1. System.setProperty("driverType",  "driverPath"); // this line sets the driver to Java system
    2. WebdDriver driver = new ChromeDriver();  // this line creates and instance of the driver

    ** Maximize browser:
    driver.manage().window().maximize(); // this line maximizes the current window if it is not already maximized
    driver.manage().window().fullscreen(): // this line fullscreens the current window if it is not already fullscreen

    ** Title validation & URL validation:
    driver.getTitle(); // this line returns the title of the current page as a String; returns null if title is not set for the page
    driver.getCurrentUrl(); // this line returns the URL of the current page as a String

    ** Selenium Navigation:
    driver.get() is used to navigate to a particular website, but it does not maintain the browser history and cookies. That's why , we cannot use forward, backward or refresh functions
    driver.navigate().to() is also used to navigate to a particular website , but it maintains the browser history and cookies. So, we can use forward, backward and refresh functions to navigate between the web pages

    driver.get("applicationURL"); // this line will navigate us to specified web application
    driver.navigate().to(); // this line is used to navigate a particular page
    driver.navigate().back(); // this line is used to navigate back to previous page
    driver.navigate().forward(); // this line is used to navigate forward to previously visited page
    driver.navigate().refresh(); // this line is used to refresh the current page

    ** Quit driver:
    driver.close(); //this line closes only the current window
    driver.quit(); //this line exits the driver, closing every associated windows, tabs, pop ups, etc.
     */
}
