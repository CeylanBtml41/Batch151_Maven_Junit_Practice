package day06_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_ActionsDragAndDrop extends TestBase {

    @Test
    public void test01() {
         // https://demoqa.com/droppable adresine gidiniz
        driver.get("https://demoqa.com/droppable");

         // 'Drag me' butonunu tutup 'Drop here' kutusunun ustune birakiniz
        WebElement drag= driver.findElement(By.id("draggable"));
        WebElement drop=drag.findElement(By.xpath("(//div[@id='droppable'])[1]"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();
        bekle(2);

         // 'Drop here' yazisi yerine 'Dropped!' oldugunu test ediniz
        String dropped =driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
        Assert.assertEquals(dropped,"Dropped!");
    }
}
