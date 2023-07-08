package day11_practice;

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
        girisYap();
        //Email başlığındaki tüm elementleri (sütun) yazdırın.
        List<WebElement> basliklarListesi = driver.findElements(By.xpath("//thead//tr[1]//th"));

        //String istenenbaslık="Email"; dıyıp equals(istenenbaslık) seklınde kullanabılırım

        int emailSutunNo=0;
        for (int i = 0; i < basliklarListesi.size(); i++) {
            if (basliklarListesi.get(i).getText().equals("UserName")){
                emailSutunNo=i;
            }

        }

        List<WebElement> emailSutunList=driver.findElements(By.xpath("//tbody//tr//td["+(emailSutunNo+1)+"]"));
        for (WebElement w: emailSutunList) {
            System.out.println(w.getText());

        }




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
