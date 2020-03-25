package excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public void write_excel(int r, int c, String data) {
		String filename = "C:\\Users\\845034\\Desktop\\PROJECT-CTS-master\\src\\test\\resources\\TestData\\excel.xlsx";
		String sheetname = "Sheet2";
		File f = new File(filename);
		try {

			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetname);
			XSSFRow row = sh.createRow(r);
			XSSFCell cell = row.createCell(c);

			FileOutputStream fos = new FileOutputStream(f);
			cell.setCellValue(data);
			wb.write(fos);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
