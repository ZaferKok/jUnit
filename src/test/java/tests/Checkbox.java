package tests;

import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class Checkbox {

    WebDriver driver = new ChromeDriver();

    @Before
    public void setup() throws InterruptedException {
        driver.get("https://courses.ultimateqa.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @Test
    public void checkboxTest() throws InterruptedException {

        WebElement signIn = driver.findElement(By.partialLinkText("Sign In"));
        signIn.click();
        Thread.sleep(2000);

        //XPATH LOCATER     //input[@id='user[remember_me]']
        //CSS LOCATER       input[type='checkbox']
        WebElement checkbox = driver.findElement(By.id("user[remember_me]"));
        checkbox.click();
        Thread.sleep(2000);

        Assert.assertTrue(checkbox.isSelected());   // Validation Assert ile yapılır. Validation olmadan test yapılmış sayılmaz.
        //Assert.assertFalse(checkbox.isSelected());// Buradaki Validation içerisinde Checkbox'ın seçili olmadığı kontrol edilmiştir.
                                                    // Buna diğer bir deyişle Negatif test denir.




        // Faker veya Random klas ile farklı datalar üretip testlerinizde kullanabilirsiniz.
        Faker faker = new Faker();

        String email    = faker.internet().emailAddress();
        String name     = faker.name().name();
        String lastname = faker.name().lastName();
        String password = "Pass123!";

    }

    @After
    public void teardown(){
        driver.close();
    }
}
