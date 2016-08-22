package testcases;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream ("./data/pages.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");

		for (int r = sh.getFirstRowNum(); r <= sh.getLastRowNum(); r++) {
			XSSFRow rw = sh.getRow(r);

			for (int c = rw.getFirstCellNum();c <= rw.getLastCellNum();c++){
				XSSFCell cl = rw.getCell(c);
				if (cl != null)
					System.out.println(cl.getStringCellValue());	
			}
		}
		wb.close();
		fis.close();
	}
}
