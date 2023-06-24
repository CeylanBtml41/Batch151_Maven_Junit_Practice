package day08_practice;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C03_ extends TestBase {
    @Test
    public void test01() throws IOException {
        // https://www.teknosa.com/ adresine gidin
        driver.get("https://www.teknosa.com");


        try {
            driver.findElement(By.xpath("//div[@id='ins-editable-button-1580496494']")).click();
        } catch (Exception e) {
            System.out.println("cookies cıkmadı");
        }

       // arama cubuguna oppo yazip enter'a basınız
      driver.findElement(By.id("search-input")).sendKeys("oppo", Keys.ENTER);

       // sonuc yazısını yazdiriniz
        System.out.println(driver.findElement(By.xpath("//div[@class='plp-info']")).getText());

        // ilk urunun fotografını cekin
        WebElement ilkUrun= driver.findElement(By.xpath("(//a[@class=' prd-link '])[1]"));
        String dosyaYolu="src/test/java/day08_practice/sreenShot3.png";
        TakesScreenshot ts= (TakesScreenshot) driver;
        FileUtils.copyFile(ilkUrun.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));


    }
}
