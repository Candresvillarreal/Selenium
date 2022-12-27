package robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_6;

public class RobotExercise {

    public static void main(String[] args) throws AWTException, InterruptedException {

        //Making the connection

        String url = "file:///C:/Users/Carlos.Villarreal/OneDrive%20-%20Solera%20Holdings,%20Inc/Documents/Bootcamp/Selenium/keyspage.html";
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        //RobotClass
        Robot robot = new Robot();

        //Looking for the
        WebElement input = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/input"));
        input.click();
        //Sending keys to the page
        robot.keyPress(VK_6);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_L);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_5);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_NUMPAD7);



    }
}
