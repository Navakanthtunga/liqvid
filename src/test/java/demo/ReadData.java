package demo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
public static void main(String[] args) {
		
		try{
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Documents\\liqvid\\readData.xlsx");
		
		Workbook wb =  WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet("Sheet1");
		
	for(int i=0;i<=sht.getLastRowNum();i++)
		{
			int row=sht.getRow(i).getLastCellNum();
			
			for(int j=0;j<row;j++)
			{
				
				System.out.println(sht.getRow(i).getCell(j));
			}
		}
		/*for(int i=0;i<sht.getLastRowNum();i++){
			Row row=sht.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++){
				
				System.out.println(row.getCell(j));
			}
		}*/
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
}
