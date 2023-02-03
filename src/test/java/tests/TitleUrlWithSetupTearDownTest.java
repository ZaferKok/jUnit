package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleUrlWithSetupTearDownTest {

    WebDriver driver = new FirefoxDriver();

    @Before
    public void setup() throws InterruptedException {

        driver.get("https://www.infotechacademy.eu/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @After
    public void tearDown(){

        driver.close();

    }

    @Test
    public void titleTest() throws InterruptedException {

        String expectedTitle = "Info Tech Academy - The Source of Change";
        String actualTitle = driver.getTitle();
        System.out.println("title = " + actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("TEST BAŞARILI");
        }else {
            System.out.println("FAIL!!!");
        }

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Test
    public void urlTest() throws InterruptedException {

        String expectedUrl = "https://infotechacademy.eu/";
        String actualUrl = driver.getCurrentUrl();
        System.out.println("url = " + actualUrl);

        if(actualUrl.equals(expectedUrl)){
            System.out.println("TEST BAŞARILI");
        }else {
            System.out.println("FAIL!!!");
        }

        Assert.assertEquals(expectedUrl, actualUrl);

    }
}
