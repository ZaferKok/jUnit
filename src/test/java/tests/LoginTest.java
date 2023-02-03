package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

    WebDriver driver = new FirefoxDriver();

    @Before
    public void setup() throws InterruptedException {
        driver.get("http://gcreddy.com/project/admin/login.php");
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

       WebElement username = driver.findElement(By.name("username"));  // By.name
       username.sendKeys("gcreddy");
       Thread.sleep(1000);

       WebElement password = driver.findElement(By.cssSelector("input[type='password']")); // CSS yöntemi ile locate
       password.sendKeys("Temp@2020");
       Thread.sleep(1000);

       WebElement login = driver.findElement(By.cssSelector("button#tdb1")); // CSS yöntemi ile locate
       login.click();
       Thread.sleep(1000);
       // login.sendKeys(Keys.ENTER);
       // login.clear();

       WebElement loggedUsername = driver.findElement(By.xpath("//*[contains(text(),'gcreddy')]")); // XPATH yöntemi ile locate
       String name = loggedUsername.getText();
       System.out.println("loggedUsername = " + name);
       Thread.sleep(1000);

       Assert.assertTrue(name.contains("gcreddy"));

       WebElement logoff = driver.findElement(By.xpath("(//a[@class='headerLink'])[3]")); // XPATH yöntemi ile locate
       logoff.click();
    }
}
