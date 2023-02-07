package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {

    WebDriver driver = new ChromeDriver();

    @Before
    public void setup() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @Test
    public void checkboxTest() throws InterruptedException {

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        //select.getFirstSelectedOption();
        select.selectByIndex(2);
        Thread.sleep(2000);

        select.selectByValue("1");
        Thread.sleep(2000);

        select.selectByVisibleText("Option 2");
        Thread.sleep(2000);

        // findelement ile findelements arasındaki farkı nedir?
        // findelement elemanı locate edemezse hata verir.
        // findelements elemanı locete edemezse boş liste döner.
        List<WebElement> dropdownListe = driver.findElements(By.id("dropdown"));

        System.out.println(dropdownListe.size());

        for (WebElement element: dropdownListe) {
            System.out.println(element.getText());

        }

        String aa = dropdownListe.get(0).getText();
        System.out.println("aa = " + aa);

        String expectedElement = "Option 1";

        WebElement option1 = driver.findElement(By.xpath("//*[contains(text(),'Option 1')]"));
        String actualElement = option1.getText();
        System.out.println(actualElement);
        Thread.sleep(2000);

        Assert.assertEquals(expectedElement, actualElement);

    }

    @After
    public void teardown(){
       driver.close();
    }
}
