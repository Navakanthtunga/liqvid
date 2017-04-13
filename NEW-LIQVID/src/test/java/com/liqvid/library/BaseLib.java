/***********************************************************************
 * @author 			:		RaghuKiran MR
 * @description		: 		Base library with reusable methods that can be used across porjects.
 * @method			:		setup()
 * @method			:		tearDown()
 * @method			:		loadURL()
 * @method 			:		elementStatus()
 * @method          :       visibilityOfElementWait()
 */

package com.liqvid.library;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;
import com.liqvid.po.DataBasePo;
import com.liqvid.po.ForgotPasswordPo;
import com.liqvid.po.StudentSignInPo;


public class BaseLib {
	public WebDriver driver;
	public static int sStatusCnt=0;
	WebDriverWait wait=null;
	public DataBasePo databasepo;
	ForgotPasswordPo forgotPasswordPo;
	StudentSignInPo studentSignInPo;

	
	@BeforeMethod
	public void setUp(){
		try{
		if(GenericLib.getCongigValue(GenericLib.sConfigFile, "BROWSER").equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",GenericLib.sDirPath+"\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(GenericLib.getCongigValue(GenericLib.sConfigFile, "BROWSER").equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",GenericLib.sDirPath+"\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else{
			System.setProperty("webdriver.ie.driver", GenericLib.sDirPath+"\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		NXGReports.setWebDriver(driver);
		}
		catch(Exception e){
			System.out.println("Problem in launching driver");
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	public void loadURL(String sUrl)
	{
		try{
			driver.get(sUrl);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}catch(AssertionError e){
			NXGReports.addStep("Fail to load main Auvenir URL.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}	
	}
public void elementStatus(WebElement element, String elementName, String checkType) 
	
	{
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
			    	NXGReports.addStep(elementName+ " is not displayed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
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
			    	NXGReports.addStep(elementName+ " is not enabled", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
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
				   	NXGReports.addStep(elementName+ " is not selected", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				}
				break;
			}
	}
	
	public void visibilityOfElementWait(WebElement webElement,String elementName)
	{
	   try 
	   {
		   wait = new WebDriverWait(driver, 10);
	       wait.until(ExpectedConditions.visibilityOf(webElement));
	   } 
	   catch (Exception e) 
	   {
	     	ParallelBaseLib.sStatusCnt++;
	      	NXGReports.addStep(elementName+ " is not Visible", LogAs.FAILED, null);
	   }
	} 
	
	public void xpath() throws InterruptedException{
		String pageNumber = driver.findElement(By.id("showFinish")).getText().toString();
		   String totalpage = pageNumber.substring(5);
		 int count = Integer.parseInt(totalpage);
         System.out.println(count);
		    Thread.sleep(6000);
		    for(int k=0;k<=38;k++)
		    {
		    	int j=k+1;
		    	WebElement element=driver.findElement(By.xpath("(//div[contains(@id,'step')])["+ j +"]//i[1]"));
		    	element.sendKeys(Keys.ENTER);
		    		
		    	}
	}
	public  void databaseTest(){
		databasepo=new DataBasePo(driver);
		try{
			driver.get(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataBaseURL"));
			databasepo.databaseLogin(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataUsername"),GenericLib.getCongigValue(GenericLib.sConfigFile, "DataPassword"));
			Thread.sleep(4000);
			driver.switchTo().frame(databasepo.getEleFrame());
			Thread.sleep(6000);
			databasepo.getEleTeslaText().click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			Thread.sleep(4000);
			driver.switchTo().frame(databasepo.getEleFrameContent());
			Thread.sleep(4000);
			WebElement element = databasepo.getEleBrowse();
			JavascriptExecutor je = (JavascriptExecutor)driver;
			je.executeScript("arguments[0].scrollIntoView(true);",element);
			Thread.sleep(4000);
			element.click();
			Thread.sleep(4000);
			databasepo.getEleCheckAllLink().click();
			Thread.sleep(4000);
			databasepo.getEleDeleteIcon().click();
			Thread.sleep(4000);
			databasepo.getEleYesBtn().click();
			Thread.sleep(4000);
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	public void LoginGmail() throws Exception
	{
		forgotPasswordPo=new ForgotPasswordPo(driver);
		    studentSignInPo=new StudentSignInPo(driver);
		    try
		    {
		    	loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile,"GMAILURL"));
		    	forgotPasswordPo.getEleEmailIdField().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile,"FORGOTPASSWORDLOGINID"));
				Thread.sleep(5000);
				forgotPasswordPo.getEleNextButton().click();
				Thread.sleep(5000);
				forgotPasswordPo.getElePasswordField().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile,"GMAILPASSWORD"));
				Thread.sleep(5000);
				forgotPasswordPo.getEleSigninButton().click();
				Thread.sleep(5000);
				forgotPasswordPo.getElePasswordResetLink().click();
				Thread.sleep(10000);
		        String USERNAME= forgotPasswordPo.getEleUsername().getText();
				Thread.sleep(10000); 
				System.out.println(USERNAME);
				String CURRENTUSERNAME=USERNAME.substring(10);
				System.out.println(CURRENTUSERNAME);
				GenericLib.setCongigValue(GenericLib.sConfigFile,"CURRENTUSERNAME",CURRENTUSERNAME);
				String PASSWORD= forgotPasswordPo.getElePassword().getText();
				Thread.sleep(10000); 
				System.out.println(PASSWORD);
				String CURRENTPASSWORD=PASSWORD.substring(9);
				System.out.println(CURRENTPASSWORD);
				GenericLib.setCongigValue(GenericLib.sConfigFile,"CURRENTPASSWORD",CURRENTPASSWORD);
				loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile,"REGISTRATIONURL"));
				Thread.sleep(5000); 
				studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "CURRENTUSERNAME"),GenericLib.getCongigValue(GenericLib.sConfigFile, "CURRENTPASSWORD"));
		    }
		    catch(AssertionError e)
		    {
		    	NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				throw e;
		    }
		    
	}

}


