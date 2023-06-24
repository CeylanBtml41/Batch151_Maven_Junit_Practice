package day08_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FilesDownload extends TestBase {
    @Test
    public void test01() {
        // 'https://the-internet.herokuapp.com/download' adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/download");

        // some-file.txt dosyasini indirelim
        driver.findElement(By.xpath("(//a)[21]")).click();
        bekle(2);
       // dosyanin bilgisayarınızda Downloads(indirilenler)'a basariyla indirilip indirilmedigini test ediniz
        //Assert.assertTrue(Files.exists(Paths.get("C:/Users/LENOVO/Downloads/some-file.txt")));

        String farkliKisim=System.getProperty("user.home");
        String ortakKisim="/Downloads/some-file.txt";
        String dosyaYolu=farkliKisim+ortakKisim;
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
