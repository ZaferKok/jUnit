package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MvnSearchTest {

    @Test
    public void jUnitIleIlkSayfaAcilisi() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com/");
        Thread.sleep(3000);

        WebElement searchBox = driver.findElement(By.xpath("//input[@class='textfield']"));
        searchBox.sendKeys("Selenium");
        Thread.sleep(3000);

        WebElement searchButton = driver.findElement(By.xpath("//input[@class='button']"));
        searchButton.click();
        Thread.sleep(3000);
    }

}
