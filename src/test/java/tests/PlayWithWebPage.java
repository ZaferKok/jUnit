package tests;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PlayWithWebPage {

    @Test
    public void play2() throws InterruptedException {

        // navigate ile get arasındaki fark
        // close ile quit arasındaki fark

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.infotechacademy.eu/");
        Thread.sleep(1000);

        Dimension d = new Dimension(300, 300 );
        driver.manage().window().setSize(d);
        Thread.sleep(1000);

        Point p = new Point(150,150);
        driver.manage().window().setPosition(p);
        Thread.sleep(1000);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.manage().window().minimize();
        Thread.sleep(1000);

        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.navigate().to("https://www.google.com/");
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);

        driver.close();
    }
}
