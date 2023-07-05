package day09_practice;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class C02_ReadExcel  {
    //Ulkeler dosyasındakı başkent(Ingilizce) sutununu yazdırınız

    @Test
    public void test01() throws IOException {
        String dosyaYolu="src/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);

       int sonSatirIdx= workbook.getSheet("Sayfa1").getLastRowNum();
        System.out.println("sonSatirIdx = " + sonSatirIdx);

     for (int i = 0; i < sonSatirIdx; i++) {
         String satirdakiData = C01_ReadExcel.banaDataGetir(i,1);
        System.out.println(satirdakiData);
        /*
         -Static bir methoda farkli bır classtan ulaşabilmek icin  icin class ısmı kullanılır
         -instance bir methoda faklı bir classtan ulasabilmek ıcın obje olusuturulur.
         */


      }


      /*
        for (int i = 0; i <=sonSatirIdx ; i++) {
         String  satirdakiData = workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString();

            System.out.println(satirdakiData);
       */




        }

    }

