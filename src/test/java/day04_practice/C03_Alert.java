package day04_practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class C03_Alert extends TestBase {

    @Test
    public void test02() {
        //http://demo.guru99.com/test/delete_customer.php adresine gidin
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        //customer id kısmına 53920 yazın
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("53920", Keys.ENTER);
        //submit butonuna tıklayın

        //cıkan alert mesajını yazdırın
        String alertYazisi = driver.switchTo().alert().getText();
        System.out.println("ALERT YAZISI: " + alertYazisi);

        //alerti kabul edin
        driver.switchTo().alert().accept();

        //cıkan 2. alert mesajını yazdırın
        String ikinciAlartYazisi=driver.switchTo().alert().getText();
        System.out.println("ikinciAlartYazisi = " + ikinciAlartYazisi);

        //cıkan 2. alerti kabul edin
        driver.switchTo().alert().accept();

    }
}
