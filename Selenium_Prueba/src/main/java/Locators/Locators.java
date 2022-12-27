package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");

        //Initialize the webdriver
        WebDriver driver = new ChromeDriver();

        //Open the webiste
        driver.get("https://www.saucedemo.com/");

        //Maximize the webbrowser
        driver.manage().window().maximize();

        //Credentials
        String username = "standard_user";
        String password = "secret_sauce";

        //Locator by id
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        //WebElement buttonloginInput = driver.findElement(By.id("login-button"));

        //Locator by Class
        //WebElement buttonloginInput = driver.findElement(By.className("submit-button"));

        //Locator by name
        //WebElement buttonloginInput = driver.findElement(By.name("login-button"));

        //Locator by xpath
        //WebElement buttonloginInput = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        //Locator by css

        WebElement buttonloginInput = driver.findElement(By.cssSelector("input[.input.submit-button]"));
        //Login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        buttonloginInput.click();

        //Close connection
        driver.close();






    }
}
