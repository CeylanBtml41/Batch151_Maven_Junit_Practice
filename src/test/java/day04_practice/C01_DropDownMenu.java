package day04_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C01_DropDownMenu extends TestBase {

    @Test
    public void test01() {
        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com");

        // dropdown'dan "Books" secenegini secin
        WebElement dropDown=  driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(dropDown);
        select.selectByVisibleText("Books");

        // arama cubuguna "Java" aratın
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java", Keys.ENTER);

        // arama sonuclarinin Java icerdigini test edin
       WebElement aramaSonuclari= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(aramaSonuclari.getText().contains("Java"));


    }
}
