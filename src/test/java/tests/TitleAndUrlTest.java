package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndUrlTest {


    @Test
    public void titleTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://infotechacademy.eu/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String expectedTitle = "Info Tech Academy - The Source of Change!";
        String actualTitle = driver.getTitle();
        System.out.println("title = " + actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("TEST BAŞARILI");
        }else {
            System.out.println("FAIL!!!");
        }
        driver.close();

    }

    @Test
    public void urlTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://infotechacademy.eu/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String expectedUrl = "https://infotechacademy.eu/";
        String actualUrl = driver.getCurrentUrl();
        System.out.println("url = " + actualUrl);

        if(actualUrl.equals(expectedUrl)){
            System.out.println("TEST BAŞARILI");
        }else {
            System.out.println("FAIL!!!");
        }
        driver.close();
    }
}
