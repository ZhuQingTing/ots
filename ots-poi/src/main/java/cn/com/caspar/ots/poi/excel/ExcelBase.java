package cn.com.caspar.ots.poi.excel;

import com.google.common.base.Preconditions;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.Closeable;
import java.io.IOException;

public class ExcelBase<T extends ExcelBase<T>> implements Closeable {

	protected Workbook workbook;

	protected Sheet sheet;

	public ExcelBase(Sheet sheet){
		Preconditions.checkNotNull(sheet);
		this.sheet = sheet;
		this.workbook = sheet.getWorkbook();
	}

	public void close() throws IOException {
	}
}
