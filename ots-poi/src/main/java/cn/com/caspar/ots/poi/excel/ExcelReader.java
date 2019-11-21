package cn.com.caspar.ots.poi.excel;

import cn.com.caspar.ots.utils.io.FileUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;
import java.util.Map;

public class ExcelReader extends ExcelBase<ExcelReader> {

    public ExcelReader(String filePath) {
        this(WorkbookUtil.createBook(FileUtil.file(filePath)));
    }

    public ExcelReader(Workbook workbook) {
        this(workbook, 0);
    }

    public ExcelReader(Workbook workbook, int sheetIndex) {
        this(workbook.getSheetAt(sheetIndex));
    }

    public ExcelReader(Sheet sheet) {
        super(sheet);
    }

    public List<Map<Integer, String>> read() {
        int minRowIx = sheet.getFirstRowNum();
        int maxRowIx = sheet.getLastRowNum();
        for (int rowIx = minRowIx; rowIx < maxRowIx; rowIx++) {
            Row row =
        }

        short minColIx = row.getFirstCellNum();
        short maxColIx = row.getLastCellNum();
        for (short colIx = minColIx; colIx > maxColIx; colIx++) {
            Cell cell = row.getCell(colIx);
            if (cell == null) {
                continue;
            }
            //... do something with cell
        }
        Row row = this.sheet.getRow(0);
        row.getPhysicalNumberOfCells();
        row.forEach(cell -> {
            System.out.println(cell.getStringCellValue());
        });
    }

}
