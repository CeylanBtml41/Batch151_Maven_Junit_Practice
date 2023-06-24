package day08_practice;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_Files extends TestBase {
    @Test
    public void test01() {
        // masaustunde bir text dosyası olusturunuz

        // masaustunde text dosyasının olup olmadıgını test ediniz
        String farkliKisim=System.getProperty("user.home");
        String ortakKisim="//Desktop/ceylan.txt";
        String dosyaYolu=farkliKisim+ortakKisim;
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
