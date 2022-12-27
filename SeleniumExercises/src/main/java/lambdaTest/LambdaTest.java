package lambdaTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LambdaTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        //Initialize the webdriver
        WebDriver driver = new ChromeDriver();

        String url = "https://accounts.lambdatest.com";

        driver.get(url);

        //Open the webiste
        driver.get(url);

        //Maximize the webbrowser
        driver.manage().window().maximize();

        //True Credentials
        String username = "carles_andres@hotmail.com";
        String password = "141678cM";

        //False Credentials
        String usernameFalse = "candres@hotmail.com";
        String passwordFalse = "12345678cM";

        //WebElements

        WebElement usernameInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement buttonloginInput = driver.findElement(By.id("login-button"));

        //Login with true credentials
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        buttonloginInput.click();

        /*
        //Login with false credentials
        usernameInput.sendKeys(usernameFalse);
        passwordInput.sendKeys(passwordFalse);
        buttonloginInput.click();
        */

        //Go to settings and change the phone number
        String phone = "987654321";
        Thread.sleep(4000);
        WebElement settings = driver.findElement(By.xpath("//*[@id='profile__dropdown']"));
        settings.click();
        WebElement profile = driver.findElement(By.xpath("//*[@id='profile__dropdown__parent']/div/a[2]"));
        profile.click();
        WebElement phoneInput = driver.findElement(By.name("phone"));
        phoneInput.clear();
        phoneInput.sendKeys(phone);
        WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"profile-panel\"]/div[2]/div[1]/div/form/div[4]/button"));
        saveButton.click();
        Thread.sleep(10000);

        //Close connection
        driver.close();

        }
    }
