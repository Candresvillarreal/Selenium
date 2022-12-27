package vuelos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Vuelos {

    public static void main(String[] args) throws InterruptedException {

        String origin = " ";
        String destination = " ";
        String date = " ";

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        //Initialize the webdriver
        WebDriver driver = new ChromeDriver();
        String url = "https://www.cheapflights.com/";
        String url1 = "https://www.edreams.net/travel/?mktportal=kayakC&utm_campaign="+origin+"-"+ destination+"&utm_content=S8Q1_erg0Su7qJfxrNtj26tP%7EdiB8EL3-0HtyM%7E2OKM%7EGaW4X7NIO1g%3D%3D&utm_medium=partners&utm_source=cheapflights&toLocale=en_US&utm_term=flight#/results/type=O;from.iata="+origin+";to.iata="+destination+"+;dep=" +date+ ";ret=" +date+";class=TOURIST;direct=false;adults=1;children=0;infants=0;internalSearch=true";

        //Open the webiste
        //driver.get(url1);

        //Maximize the webbrowser
        driver.manage().window().maximize();

        //List of origins
        List<String> origins = List.of("AGP", "SVQ", "ALC", "MAD");

        //List of destinations
        List<String> destinations = List.of("BER", "LON", "BRN", "MIL");

        //List of dates
        List<String> dates = List.of("2022-12-02", "2022-12-07", "2022-12-18", "2023-01-06", "2023-01-22");

        for (int i = 0; i < origins.size(); i++) {
            for (int j = 0; j < destinations.size(); j++) {
                for (int k = 0; k < dates.size(); k++) {
                    origin = origins.get(i);
                    destination = destinations.get(j);
                    date = dates.get(k);
                    //System.out.println("Origin: " + origin + " Destination: " + destination + " Fecha: " + date);
                    driver.get(url1);
                    WebElement bestPrice = driver.findElement(By.cssSelector("div[data-key='2']"));
                    System.out.println("Origen: " + origin + " Destino: " + destination + " Fecha: " + date + " Precio: " + bestPrice);
                    driver.close();
                }
            }
        /*
        WebElement fromInput = driver.findElement(By.className("lNCO-inner"));

        fromInput.click();
        Thread.sleep(1000);
        fromInput.click();
        Thread.sleep(1000);
        fromInput.clear();
        Thread.sleep(1000);
        fromInput.sendKeys("svq");
        //fromInput.clear();
        //


        /*
        //Accepting Cookies
        WebElement cookies = driver.findElement(By.id("L2AGLb"));
        cookies.click();

        //Searching
        String search = "most viewed science fiction movie trailer ever";
        WebElement searchInput = driver.findElement(By.className("gLFyf"));
        searchInput.sendKeys(search);
        WebElement searchLauncher = driver.findElement(By.name("btnK"));
        searchLauncher.submit();
        */
        }
    }

}
