package day10_practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class C01_WebTables extends TestBase {
    @Test
    public void test01() {
        // girisYap methodu olusturun

         girisYap();

        // https://www.hotelmycamp.com adresine gidin
        // Log in butonuna tıklayın
        // Username: manager
        // Password: Manager1!

        // sutun sayısını yazdırın
        List<WebElement> sutunBaslikSayisi= driver.findElements(By.xpath("//thead//tr[1]//th"));
        System.out.println("sutun Sayisi = " + sutunBaslikSayisi.size());

        // tum body'i yazdirin
        WebElement tumBody = driver.findElement(By.xpath("//tbody"));
        System.out.println("tumBody.getText() = " + tumBody.getText());

        // body'de bulunan satır sayısını yazdırın
        List<WebElement> satirlarListesi=driver.findElements(By.xpath("//tbody//tr"));
        System.out.println("bodydeBulunanSatirSayisi = " + satirlarListesi.size());

        System.out.println("*********************");

        // body'de bulunan satırları yazdırın
       // for (WebElement each:satirlarSayisi){
       //     System.out.println( each.getText());
       // }
        satirlarListesi.forEach(t-> System.out.println(t.getText()));

        System.out.println("*********************");

        // 4.satırdaki elementleri yazdırın
        List<WebElement> dorduncuSatirElementlerı=driver.findElements(By.xpath("//tbody//tr[4]//td"));
        dorduncuSatirElementlerı.forEach(t-> System.out.println(t.getText()));


    }

    public void girisYap() {
        // https://www.hotelmycamp.com adresine gidin
        driver.get("https://www.hotelmycamp.com");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();

        // Log in butonuna tıklayın
        driver.findElement(By.xpath("//*[text()='Log in']")).click();

        // Username: manager
        // Password: Manager1!
       //driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("manager", Keys.TAB,"Manager1!");
       //driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();

        Actions actions = new Actions(driver);

        WebElement userName = driver.findElement(By.xpath("//input[@id='UserName']"));

        actions.
                click(userName).
                sendKeys("manager").
                sendKeys(Keys.TAB).
                sendKeys("Manager1!").
                sendKeys(Keys.ENTER).
                perform();






    }
}
