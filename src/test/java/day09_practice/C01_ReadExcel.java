package day09_practice;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C01_ReadExcel {

    // Ulkeler dosyasındaki 3.satırdaki indexin, 3. sutunundaki indexinin
    // "Cezayir" oldugunu test eden method olusturunuz.
    @Test
    public void test01() throws IOException {
        int satirNoIdx = 10;
        int sutunNoIdx = 2;

      String actualData= banaDataGetir(satirNoIdx,sutunNoIdx);
      String expectedData="Avusturya";
      Assert.assertEquals(expectedData,actualData);

    }

    public static String banaDataGetir(int satirNoIdx, int sutunNoIdx) throws IOException {
        String dosyaYolu="src/resources/ulkeler.xlsx";
        FileInputStream fis= new FileInputStream(dosyaYolu);
        Workbook workbook=WorkbookFactory.create(fis);

        String istenenData = workbook.getSheet("Sayfa1").getRow(satirNoIdx).getCell(sutunNoIdx).toString();

        return istenenData;
    }



}
