package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Test001 {
	public static void main(String[] args) throws Throwable{

	File src=new File("C:\\Users\\Administrator\\Documents\\liqvid\\src\\test\\java\\demo\\testdata12.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	
	sheet.getRow(0).createCell(0).setCellValue("GGHF");
	sheet.getRow(1).createCell(2).setCellValue("fail");
	
	FileOutputStream fio=new FileOutputStream(src);
	wb.write(fio);
	wb.close();

	}

}
