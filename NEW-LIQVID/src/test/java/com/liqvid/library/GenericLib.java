/***********************************************************************
 * @author 			:		RaghuKiran MR
 * @description		: 		Generic library with reusable methods that can be used across porjects.
 * @method			:		getCongigValue()
 * @method			:		toReadExcelData()
 * @method			:		toWriteIntoExcel()
 * @method 			:		setStatus()
 * @method 
 */

package com.liqvid.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class GenericLib {
	public static String sFile;
	public static int iPassCount = 0;
	public static int iFailCount = 0;
	public static int iSkippedCount = 0;
	static public String sDirPath = System.getProperty("user.dir");
	public static String sTestDataFile = sDirPath+"\\TestDataNew.xlsx";
	public static String sConfigFile = sDirPath+"\\Config.properties";
	public static String imagepath=sDirPath+"\\src\\test\\resources\\images\\Liqvid.png";
	/*
	 * @author: RaghuKiran MR
	 * Description: To read the basic environment settings
	 * data from config file
	 */
	public static String getCongigValue(String sFile, String sKey) {
		Properties prop = new Properties();
		String sValue = null;
		try {
			InputStream input = new FileInputStream(sFile);
			prop.load(input);
			sValue = prop.getProperty(sKey);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sValue;
	}
	/*
	 * @author: RaghuKiran MR
	 * Description: To read the basic environment settings
	 * data from config file
	 */
	public static void setCongigValue(String sFile, String sKey, String sValue) {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(new File(sFile));
			prop.load(fis);
			fis.close();

			FileOutputStream fos = new FileOutputStream(new File(sFile));
			prop.setProperty(sKey, sValue);
			prop.store(fos, "Updating folder path");
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * @author: RaghuKiran MR
	 * Description: To read test data from excel sheet
	 */
	 public static String toReadExcelData(String filePath,String sheetName, String sTestCaseID, String key)
	 {
		 String dataNew=null;
		 try{
		 	FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = (Workbook) WorkbookFactory.create(fis);
			Sheet sht = wb.getSheet(sheetName);
			int iRowNum = sht.getLastRowNum();
			for (int i = 0; i <= iRowNum; i++) {
				if (sht.getRow(i).getCell(0).toString().equals(sTestCaseID)) {
					for(int k=1;k<=sht.getRow(i).getLastCellNum()-2;k++){
						if(sht.getRow(i).getCell(k).toString().equals(key)){
						dataNew=sht.getRow(i).getCell(k+1).getStringCellValue();
					}
						else {
							k=k++;
						}
					}
				}
			}
		 }
		 catch (Exception e)
	      {
	         e.printStackTrace();
	      }
	return dataNew ;
}
	
	public  static void setStatus(String sName, String sResult,ArrayList sTestName, ArrayList sStatus)
	{
		sName=sName.replace("test","");
		sTestName.add(sName);
		sStatus.add(sResult);
		
		if(sResult.equals("Passed"))
		{iPassCount=iPassCount+1;
		}else if(sResult.equals("Failed"))
		{iFailCount = iFailCount+1;
		}else
		{iSkippedCount = iSkippedCount+1;
		}
	}
	public void elementStatus(WebElement element, String elementName, String checkType) 
	
	{
		//BaseLib baselib=new BaseLib();
		//baselib.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		switch(checkType)
		{
			case "displayed":
				try 
			    {
			        element.isDisplayed();
			        NXGReports.addStep(elementName+ " is displayed", LogAs.PASSED, null);
			    } 
			    catch (Exception e) 
			    {
			    	ParallelBaseLib.sStatusCnt++;
			    	NXGReports.addStep(elementName+ " is not displayed", LogAs.FAILED, null);
			    }
				break;
			case "enabled":
				try 
			    {
			        element.isEnabled();
			        NXGReports.addStep(elementName+ " is enabled", LogAs.PASSED, null);
			    } 
			    catch (Exception e) 
			    {
			    	ParallelBaseLib.sStatusCnt++;
			    	NXGReports.addStep(elementName+ " is not enabled", LogAs.FAILED, null);
			    }
				break;
			case "selected":
				try 
				{
					element.isSelected();
				    NXGReports.addStep(elementName+ " is selected", LogAs.PASSED, null);  
				} 
				catch (Exception e) 
				{
				   	ParallelBaseLib.sStatusCnt++;
				   	NXGReports.addStep(elementName+ " is not selected", LogAs.FAILED, null);
				}
				break;
			}
	}
	
	
	
}