package com.liqvid.installation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.liqvid.library.GenericLib;

public class LiqvidInstallation 
{
	WebDriver driver;
	public static String sEnglishEdgeInstallerFile = GenericLib.sDirPath+"\\resources\\install.exe";
	public static String sLiquidInstallerFile = GenericLib.sDirPath+"\\resources\\LiqvidInstallation.exe";	
	/* 
	 * @Description: Installing the EnglishEdge.exe and to verify Registration screen is displayed.
	 * @Author: RaghuKiran MR
	 */
    @Test(priority=1,enabled=false, description="Installing the EnglishEdge.exe and to verify Registration screen is displayed.")
    public void liqvidInstallation() throws Exception
    {
		try
		{
			Runtime.getRuntime().exec(sEnglishEdgeInstallerFile);
			Thread.sleep(8000);
			Runtime.getRuntime().exec(sLiquidInstallerFile);
	    } 
		catch (Exception ex) 
		{
			ex.printStackTrace();
	    }
	}
    @Test(priority=2,enabled=true, description="VErify error message when internet connection is OFF")
    public void nointernetconnection() throws Exception
    {
		System.setProperty("webdriver.gecko.driver",GenericLib.sDirPath+"\\resources\\geckodriver.exe");
		
		//driver = new FirefoxDriver();
    	
    	try
		{
     	/*	Runtime.getRuntime().exec("D:\\Navakanth\\Autoit\\disable.exe");
     		Thread.sleep(15000);*/
     		
    		Runtime.getRuntime().exec("D:\\Navakanth\\Autoit\\runenglishedge.exe");
    		Thread.sleep(20000);
   
    		driver = new FirefoxDriver();
			//driver.get("http://10.10.12.154:4001/registration/register.php#!");
			driver.get("http://169.254.127.76:4001/registration/register.php#!");
			Thread.sleep(20000);
	    } 
		catch (Exception ex) 
		{
			ex.printStackTrace();
    }
}
}
