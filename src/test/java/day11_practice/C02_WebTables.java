package day11_practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_WebTables extends TestBase {
    @Test
    public void test01() {
        girisYap();

        //input olarak satır sayısı ve sutun sayısına sahıp excel'deki text'i dınamık olarak yazdırınız
        int satir =4;
        int sutun=4;

     WebElement arananSell= driver.findElement(By.xpath("//tbody//tr["+satir+"]//td["+sutun+"]"));
        System.out.println(arananSell.getText());



    }


    public void girisYap() {
        driver.get("https://www.hotelmycamp.com");
        driver.findElement(By.xpath("//*[@id='details-button']")).click();//gelişmiş butonuna tıkladık
        driver.findElement(By.xpath("//*[@id='proceed-link']")).click();//aşağıdaki güvenli değil ama siteye git linkine tıklattık
        driver.findElement(By.xpath("(//*[@class='nav-link'])[7]")).click();//login butonuna tıkladık
        Actions actions = new Actions(driver);
        WebElement userName = driver.findElement(By.xpath("//*[@class='form-control required']"));
        actions.
                click(userName).
                sendKeys("manager").
                sendKeys(Keys.TAB).
                sendKeys("Manager1!").
                sendKeys(Keys.ENTER).
                perform();

    }//girisyap methodu
}
