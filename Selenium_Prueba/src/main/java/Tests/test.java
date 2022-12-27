package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Carlos.Villarreal\\eclipse-workspace\\Selenium_Prueba\\src\\main\\resources\\drivers\\chromedriver.exe");

        //Initialize the browser
        WebDriver driver = new ChromeDriver();

        //Open facebook
        driver.get("https://www.facebook.com");

        //Open google
        //driver.get("https://www.google.com");

        //Open linkedin
        //driver.get("https://www.linkedin.com");

        //Maximize the browser
        driver.manage().window().maximize();

        //Close the browser
        driver.close();


    }
}
