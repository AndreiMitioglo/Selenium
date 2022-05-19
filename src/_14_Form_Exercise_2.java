import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _14_Form_Exercise_2 {

/*
    Go to https://www.techglobalschool.com/
    Scroll down to the bottom of the page

    Send keys to subscribe form and make sure the keys sent are passed
    Enter “John” to “Enter your first name” input box
    Enter “Doe” to “Enter your last name” input box
    Enter “john.doe@gmail.com” to “Add your email” input box
    Validate the keys sent are passed in the DOM

 */

    /*
      Go to https://www.techglobalschool.com/
      Scroll down to the bottom of the page

      Send keys to subscribe form and make sure the keys sent are passed
      Enter "John" to "Enter your first name" input box
      Enter "Doe" to "Enter your last name" input box
      Enter "john.doe@gmail.com" to "Add your email" input box
      Validate the keys sent are passed in the DOM

       */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement firstNameInputBox = driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement lastNameInputBox = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement emailNameInputBox = driver.findElement(By.id("input_comp-khwb0zsz"));

        String name = "John";
        String lName = "Doe";
        String email = "johndoe@gmail.com";

        firstNameInputBox.sendKeys(name);
        lastNameInputBox.sendKeys(lName);
        emailNameInputBox.sendKeys(email);

        System.out.println(firstNameInputBox.getAttribute("value").equals(name)); // true
        System.out.println(lastNameInputBox.getAttribute("value").equals(lName)); // true
        System.out.println(emailNameInputBox.getAttribute("value").equals(email)); // true

        System.out.println(firstNameInputBox.getAttribute("maxLength")); // 100
        System.out.println(lastNameInputBox.getAttribute("maxLength")); // 100
        System.out.println(emailNameInputBox.getAttribute("maxLength")); // 250

        Thread.sleep(2000);
        firstNameInputBox.clear();
        Thread.sleep(2000);
        firstNameInputBox.sendKeys("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111");
        System.out.println(firstNameInputBox.getAttribute("value")); // 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
        System.out.println(firstNameInputBox.getAttribute("value").length()); // 100

        Driver.quitDriver();
    }
}
