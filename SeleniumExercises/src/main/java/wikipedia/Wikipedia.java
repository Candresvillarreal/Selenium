package wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class Wikipedia {

    public static void main(String[] args) {

        //Variables
        float sumGDP = 0;
        float sumTaxRevenue = 0;
        String gdp = " ";
        String taxRevenue = " ";


        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        //Initialize the webdriver
        WebDriver driver = new ChromeDriver();

        String url = "https://www.wikipedia.org/";

        driver.get(url);

        //Open the webiste
        driver.get(url);

        //Maximize the webbrowser
        driver.manage().window().maximize();

        //Select English Version
        WebElement englishVersion = driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]"));
        englishVersion.click();

        //Execute the search
        String search = "List of countries by tax revenue to gdp ratio";
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys(search);
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchButton.submit();

        //Accessing the table
        int rowCount = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr")).size();
        for (int i = 0; i < rowCount; i++) {
            gdp = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[4]")).getText();
            taxRevenue = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[5]")).getText();
            if (!gdp.contains("N/A")) {
                sumGDP += Float.parseFloat(gdp.replace("$", "").replace(",", ""));
            }
            if (!taxRevenue.contains("N/A")) {
                sumTaxRevenue += Float.parseFloat(taxRevenue.replace("$", "").replace(",", ""));
            }
        }


        System.out.println("Total GDP: " + sumGDP);
        System.out.println("Total Tax Revenue" + sumTaxRevenue);
    }
}
