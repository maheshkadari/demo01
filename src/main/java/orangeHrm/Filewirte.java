package orangeHrm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Filewirte {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("E:\\Ganesh Automation\\Files\\Testdata1.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(fi);
		XSSFSheet sh= wb.getSheetAt(0);
		int rownum=sh.getLastRowNum();
		XSSFCell cell =sh.getRow(1).createCell(2);
		cell.setCellValue("Pass");
		FileOutputStream fo=new FileOutputStream("E:\\\\Ganesh Automation\\\\Files\\\\Testdata1.xlsx");
		
		
	}

}
