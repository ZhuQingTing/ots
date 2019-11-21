package cn.com.caspar.ots.poi.excel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExcelReaderTest {

    @Test
    public void read() {
        ExcelReader excelReader = new ExcelReader("C:\\zqt\\docs\\test.xlsx");
        excelReader.read();
    }
}