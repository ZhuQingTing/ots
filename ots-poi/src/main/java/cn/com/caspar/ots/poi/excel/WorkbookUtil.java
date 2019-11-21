package cn.com.caspar.ots.poi.excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WorkbookUtil {

    public static Workbook createBook(File file) {
        try (FileInputStream fIP = new FileInputStream(file)) {
            return new XSSFWorkbook(fIP);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
