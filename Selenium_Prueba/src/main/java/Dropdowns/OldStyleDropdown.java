package Dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OldStyleDropdown {
    public static void main(String[] args) {

        String url = "https://demoqa.com/select-menu";

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        Select oldStyleMenu = new Select(driver.findElement(By.id("oldSelectMenu")));
        //oldStyleMenu.selectByIndex(0);
        //oldStyleMenu.selectByValue("8");
        oldStyleMenu.selectByVisibleText("White");

    }
}
