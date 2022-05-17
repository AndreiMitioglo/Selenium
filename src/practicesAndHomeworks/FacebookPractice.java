package practicesAndHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import  static utilities.ValidationUtils.*; // import all ValidationUtill Class

public class FacebookPractice {
    public static void main(String[] args) {
 /*   1. Go to https://www.facebook.com/
     2. Validate the title of the page is "Facebook - Log In or Sign
     Up"
     3. Validate the URL of the page is "https://www.facebook.com/"
     4. Validate "facebook" logo is displayed
     5. Validate heading2 "Connect with friends and the world
     around you on Facebook." is displayed
     6. Validate "Email or Phone Number" input box is
             displayed
     7. Validate "Password" input box is displayed
     8. Validate "Log In" button is displayed and enabled
     9. Validate "Forgot Password?" link is displayed
     10. Validate "Create New Account" button is displayed
*/


            WebDriver driver = Driver.getDriver();


            try {
                // get the website
                driver.get("https://www.facebook.com/");

                String expectedTitle = "Facebook - log in or sign up";
                validateTitle(driver, expectedTitle);

                String expectedUrl = "https://www.facebook.com/";
                validateURL(driver, expectedUrl);

            /*
            xpath --> //tagName[@attributeName = 'attributeValue']
            css   --> tagName[attributeName = 'attributeValue']
             */
                //                         xpath -->   //img[@class = 'fb_logo _8ilh img']
                //                         css   -->     img[class = 'fb_logo _8ilh img']

//            WebElement fbLogo = driver.findElement(By.className("fb_logo"));
//            WebElement fbLogo = driver.findElement(By.cssSelector(".fb_logo"));
//            WebElement fbLogo = driver.findElement(By.xpath("//img[@class = 'fb_logo _8ilh img']"));
                WebElement fbLogo = driver.findElement(By.cssSelector("img[class = 'fb_logo _8ilh img']"));
                validateElementIsDisplayed(fbLogo, "Facebook logo");

                WebElement inputEmailPhone = driver.findElement(By.id("email"));
                validateElementIsDisplayed(inputEmailPhone, "Email or phone number input box");

                WebElement inputPassword = driver.findElement(By.id("pass"));
                validateElementIsDisplayed(inputPassword, "Password input box");

                WebElement loginButton = driver.findElement(By.name("login"));
                validateElementIsDisplayedAndEnabled(loginButton, "Login button");

                WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot password?"));
                validateElementIsDisplayed(forgotPasswordLink, "Forgot password? link");

//            WebElement createNewAccountButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
                WebElement createNewAccountButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
                validateElementIsDisplayed(createNewAccountButton, "Create New Account button");


            } finally {
                Driver.quitDriver();
            }

        }
}


