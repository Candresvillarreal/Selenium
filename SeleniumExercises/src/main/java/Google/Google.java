package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Google {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        //Initialize the webdriver
        WebDriver driver = new ChromeDriver();
        String url = "https://google.com";

        driver.get(url);

        //Open the webiste
        driver.get(url);

        //Maximize the webbrowser
        driver.manage().window().maximize();

        //Accepting Cookies
        WebElement cookies = driver.findElement(By.id("L2AGLb"));
        cookies.click();

        //Searching
        String search = "most viewed science fiction movie trailer ever";
        WebElement searchInput = driver.findElement(By.className("gLFyf"));
        searchInput.sendKeys(search);
        WebElement searchLauncher = driver.findElement(By.name("btnK"));
        searchLauncher.submit();

        //Accessing Videos Tab, select the second video and play
        WebElement videosTab = driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a"));
        videosTab.click();
        WebElement secondVideo = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/video-voyager/div/div[1]/div[2]/div/div[1]/a/h3"));
        secondVideo.click();
        //Accepting YouTube Cookies
        Thread.sleep(8000);
        WebElement youtubeCookies = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
        youtubeCookies.click();
        WebElement youTubePlay = driver.findElement(By.className("ytp-next-button.ytp-button"));
        youTubePlay.click();

        //Closing the browser







    }
}
