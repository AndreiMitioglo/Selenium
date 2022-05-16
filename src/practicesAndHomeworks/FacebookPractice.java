package practicesAndHomeworks;

import org.openqa.selenium.WebDriver;
import utilities.Driver;
import utilities.ValidationUtils;

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
            //get the website
            driver.get("https://www.facebook.com/");
            String expectedTitle = "Facebook - log in or sign up";
            ValidationUtils.validateTitle(driver, expectedTitle);

        }finally {
            Driver.quitDriver();
        }

    }
}


