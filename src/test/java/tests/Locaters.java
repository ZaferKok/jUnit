package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locaters {

    WebDriver driver = new ChromeDriver();

    @Before
    public void setup() throws InterruptedException {
        driver.get("https://www.infotechacademy.eu/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void linkTest() throws InterruptedException {

/*
    Web sayfasındaki elemanlarımızı aşağıdaki yöntemler ile locate edebiliriz.
        1. By.tagName
        2. By.id
        3. By.name
        4. By.className
        5. By.linkText
        6. By.partialLinkText
        7. By.cssSelector
        8. By.xpath
*/

        WebElement aboutUsLink1 = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));

        aboutUsLink1.click(); Thread.sleep(1000);

    }
}
