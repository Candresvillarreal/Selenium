package links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class Links {

    public static void main(String[] args) throws InterruptedException {

        String url = "file:///C:/Users/Carlos.Villarreal/OneDrive%20-%20Solera%20Holdings,%20Inc/Documents/Bootcamp/Selenium/linksrotos.html";

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url);

        driver.manage().window().maximize();

        HttpURLConnection http = null;
        int responseCode = 200;
        String src = "";
        int counter = 1;
        System.out.println("-------------------- Checking Links --------------------");

        List<WebElement> listofLinks = driver.findElements(By.tagName("a"));
        Iterator<WebElement> links = listofLinks.iterator();

        while(links.hasNext()) {

            System.out.println("-------------------- Checking link "+ counter + " --------------------");

            src = links.next().getAttribute("href");
            if(src == null || src.isEmpty()){
                System.out.println("Link: The url does not have a value or has a value null");
                counter++;
                continue;

            }
            try {
                http = (HttpURLConnection) (new URL(src).openConnection());
                http.setRequestMethod("HEAD");
                http.connect();
                responseCode = http.getResponseCode();
                System.out.println("Response Code: " + responseCode);
                if (responseCode >= 400) {
                    System.out.println("Link " + src + "\n Is a broken link");
                } else {
                    System.out.println("Link " + src + "\n Is a valid link");
                }
            } catch (Exception e) {
                System.out.println("Error Catched: " + e);
                System.out.println("Link: " + src);

            }
            counter++;
        }

        System.out.println("-------------------- All links have been checked............");

        Thread.sleep(5000);
        driver.quit();
    }
}
