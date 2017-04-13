package com.liqvid.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;
import com.liqvid.library.BaseLib;
import com.liqvid.library.GenericLib;
import com.liqvid.po.TeacherCoursePo;
import com.liqvid.po.TeacherHeaderPO;
import com.liqvid.po.TeacherHomePo;
import com.liqvid.po.TeacherProfilePo;
import com.liqvid.po.TeacherResourcesPo;
import com.liqvid.po.TeacherSignPo;




public class TeacherPageLevel extends BaseLib
{
	String sTestData=null;
	String[] sData=null;
	
	TeacherSignPo teacherpo;
	TeacherHomePo teacherhomepo;
	TeacherProfilePo teacherprofilepo;
	TeacherCoursePo teachercoursepo;
	TeacherResourcesPo teacherresourcespo;
	TeacherHeaderPO teacherheaderpo;
	TeacherResourcesPo teacherresource;
	@Parameters("browser")
	@Test(priority=1,enabled=true,description="To clear the databases of Assessment")
	public void sampleDatabaseTest(){
		try
		{
		  databaseTest();
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=2,enabled=true,description="Display of elements on Login Page")
	public void LogInPageElement(String browser) throws Exception
	{
		teacherpo=new TeacherSignPo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			teacherpo.elementStatus(teacherpo.getEleLogo(),"The English Edge logo is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleSignInText(),"The Sign in text is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleSignInInstrText(),"The Sign in instruction text is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleUserNameText(),"The Username text is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleUserNameTextField(),"The Username textfield is", "displayed");
			teacherpo.elementStatus(teacherpo.getElePwdText(),"The password text is", "displayed");
			teacherpo.elementStatus(teacherpo.getElePasswordTextFiled(),"The password textfield is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleSignInBtn(),"The Sign in button is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleForgotPwdLink(),"The forgot password link is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleRegisterInstrText(),"The register instruction text is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleRegisterBtn(),"The register button is", "displayed");
			teacherpo.elementStatus(teacherpo.getCodeVersionDateText(),"the copyright version text is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleBulidVersionDateText(),"the bulid version text is", "displayed");
	
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=3,enabled=true, description="Display of elements on teacher Home Page")
	public void TeacherHomepage(String browser) throws Exception
	{
		teacherpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo (driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);
			teacherpo.elementStatus(teacherhomepo.getEleLogo(),"The English Edge logo is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleBulidVersion(),"The English Edge bulid version is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleTotalSessionCount(),"The total session count is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleTotalSessionText(),"The total session text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCompletedSessionCount(),"The completed session count is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCompletedText(),"The completed session text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleRemainingSessionCount(),"The remaining session count is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleRemainingText(),"The remaining session text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleHomeIcon(),"The home icon is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleHomeTab(),"The home tab is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCoursesIcon(),"The courses icon is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCoursesTab(),"The courses tab is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleResoursesIcon(),"The resources icon is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleResourcesTab(),"The resources tab is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleWelcomeText(),"The Welcome text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleTeacherProfileimage(),"The Student profile image option is", "displayed");
			for(WebElement eleProductlist:teacherhomepo.getEleTeacherDetails())
			{
				teacherpo.elementStatus(eleProductlist,"The Student details is ", "displayed");
			}
			for(WebElement eleProductlist:teacherhomepo.getEleLastDetails())
			{
				teacherpo.elementStatus(eleProductlist,"The Last Login, Course and Session details is ", "displayed");
			}
			teacherpo.elementStatus(teacherhomepo.getEleProfileDropdown(),"The Profile Dropdown is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleProfileImgInDropdown(),"The Profile Dropdown is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleProfileTextDropdown(),"The Profile text Dropdown is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCourseCount(),"The Courses count is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCoursesText(),"The Courses text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleSessionCount(),"The session count is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleSessionText(),"The session text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleTimeSpent(),"The timespent text in y axis", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCourse(),"The course text in x axis", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleTimeSpentPerCourse(),"The timespentpercourse text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleTimeSpentPerCourse(),"The timespentpercourse text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleGraph(),"The Graph is", "displayed");
			
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=4,enabled=true, description="Display of elements on teacher Profile Page")
	public void TeacherProfilePage(String browser) throws Exception{
		teacherpo=new TeacherSignPo(driver);
		teacherprofilepo=new TeacherProfilePo(driver);
		teacherhomepo=new TeacherHomePo (driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(7000);
			teacherhomepo.getEleProfileTextDropdown().click();
			teacherhomepo.getEleProfileOption().click();
		    teacherpo.elementStatus(teacherprofilepo.getEleProfileText(),"The Profile text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleFirstNameText(),"The firstname text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleFirstNameTextBox(),"The firstname textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleLastNameText(),"The lastname text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleLastNameTextBox(),"The lastname textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleEmailIdText(),"The Email id text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleEmailIdTextBox(),"The Emailid textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getElePhoneText(),"The phone text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getElePhoneTextBox(),"The phone textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleDateOfBirthText(),"The dateofBirth text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleDateOfBirthTextBox(),"The dateofBirth textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleDateOfBirthTextBox(),"The dateofBirth textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleCalendarIcon(),"The Calander icon is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleGenderText(),"The Gender Text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleGenderDropDown(),"The Gender dropdown is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getElePlusIcon(),"The plus icon is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleChangePwd(),"The change password link is", "displayed");
			Thread.sleep(3000);
			teacherprofilepo.getEleChangePwd().click();
			teacherpo.elementStatus(teacherprofilepo.getEleMinusIcon(),"The minus icon is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleOldPasswordText(),"The old password text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleOldPasswordTextBox(),"The old password textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleNewPasswordText(),"The new password text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleNewPasswordTextBox(),"The new password textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleConfirmPasswordText(),"The confirm password text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleConfirmNewPasswordTextBox(),"Theconfirm password textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleUpdateButton(),"Update button is", "displayed");
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=5,enabled=true, description="Display of elements on teacher Courses page")
	public void TeacherCourses(String browser) throws Exception{
		teacherpo=new TeacherSignPo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);
			teachercoursepo.getEleCourseTab().click();
			Thread.sleep(2000);
			teacherpo.elementStatus(teachercoursepo.getEleCourseText(),"Course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleInstructionText(),"Course instruction text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStepText(),"step text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleBatchText(),"Batch text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleSelectBatchText(),"Select batch text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleSelectcourseText(),"Select course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleClickcourseText(),"Click course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleCourseText(),"course text is", "displayed");
		
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=6,enabled=true, description="Display of elements on teacher session page in course module")
	public void TeacherSession(String browser) throws Exception{
		teacherpo=new TeacherSignPo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);
			teachercoursepo.getEleCourseTab().click();
			Thread.sleep(2000);
			teacherpo.elementStatus(teachercoursepo.getEleCourseText(),"Course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleInstructionText(),"Course instruction text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStepText(),"step text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleBatchText(),"Batch text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleSelectBatchText(),"Select batch text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleSelectcourseText(),"Select course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleClickcourseText(),"Click course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleCourseText(),"course text is", "displayed");
			Thread.sleep(6000);	
			Select select=new Select(teachercoursepo.getEleBatchSelected());
			select.selectByIndex(0);
			Thread.sleep(6000);
			Select select1=new Select(teachercoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			Thread.sleep(2000);
			teachercoursepo.getEleStartCourseButton().click();
			teacherpo.scrolldown();
			Thread.sleep(4000);
			driver.switchTo().frame(0);
			teacherpo.elementStatus(teachercoursepo.getEleSession(),"all session is","displayed");
		
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=7,enabled=true,description="Display of element in resources page")
	public void ResourcesLink(String browser) throws Exception
	{
		teacherpo=new TeacherSignPo(driver);
		teacherresource=new TeacherResourcesPo(driver);
		teacherhomepo=new TeacherHomePo (driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);
			teacherhomepo.getEleResourcesTab().click();
			NXGReports.addStep(teacherresource.getEleResourcesText().getText()," ", LogAs.PASSED, null);
			teacherpo.elementStatus(teacherresource.getEleResourcesImage(),"pdf file is","displayed");
			teacherresource.getEleTeacherManualText().click();
			
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		
	}
	@Parameters("browser")
	@Test(priority=8,enabled=true, description="Display of all sessions on teacher session page")
	public void AllSession(String browser) throws Exception{
		teacherpo=new TeacherSignPo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);
			teachercoursepo.getEleCourseTab().click();
			Thread.sleep(2000);
			teacherpo.elementStatus(teachercoursepo.getEleCourseText(),"Course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleInstructionText(),"Course instruction text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStepText(),"step text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleBatchText(),"Batch text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleSelectBatchText(),"Select batch text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleSelectcourseText(),"Select course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleClickcourseText(),"Click course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleCourseText(),"course text is", "displayed");
		    Thread.sleep(6000);	
			Select select=new Select(teachercoursepo.getEleBatchSelected());
			select.selectByIndex(0);
			Thread.sleep(6000);
			Select select1=new Select(teachercoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			Thread.sleep(2000);
			teachercoursepo.getEleStartCourseButton().click();
			teacherpo.scrolldown();
			Thread.sleep(4000);
			driver.switchTo().frame(0);
			teacherpo.elementStatus(teachercoursepo.getEleSession(),"all session is","displayed");
		    WebElement table = driver.findElement(By.xpath("//div[@class='divMiddle']"));
			List<WebElement>links = table.findElements(By.tagName("a")); 
			for(WebElement tdElement : links) 
			{ 
			 System.out.println(tdElement.getText()); 
			} 
		
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=9,enabled=true, description="Display of Elements in  Pre Assessment Instructions Page")
	public void preAssessmentInstruction(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getElePreAssessmentLink(),"PreAssessmentlink","enabled");
		teachercoursepo.getElePreAssessmentLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teacherpo.verifyAssessmentinstruction();
	}catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=10,enabled=true, description="Display of Elements in  Post Assessment Instructions Page")
	public void postAssessmentInstruction(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getElePostAssessmentLink(),"PostAssessmentlink","enabled");
		teachercoursepo.getElePostAssessmentLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teacherpo.verifyAssessmentinstruction();
	}catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=11,enabled=true, description="Display of elements on The goat eater is a game Page")
	public void TheGoatEaterLink(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
    try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleTheGoatEaterLink(),"The goat eater link","enabled");
		teachercoursepo.getEleTheGoatEaterLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
	    teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
	    teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
	    driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
	    teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=12,enabled=true, description="Display of elements on Ravi and his Family  Page")
	public void RaviandhisFamily(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleRaviandhisFamilyLink(),"Ravi and his Family Link()","enabled");
		teachercoursepo.getEleRaviandhisFamilyLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
	    teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=13,enabled=true, description="Display of elements on Your Pencil!  Page")
	public void YourPencil(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleYourPencilLink()," Your Pencil Link()","enabled");
		teachercoursepo.getEleYourPencilLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
		teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=14,enabled=true, description="Display of elements on Good Friends  Page")
	public void GoodFriends(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleGoodFriendsLink(),"Good Friends Link()","enabled");
		teachercoursepo.getEleGoodFriendsLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
	    teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=15,enabled=true, description="Display of elements on  My Rabbit Page")
	public void MyRabbit(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleMyRabbitLink(),"My Rabbit Link()","enabled");
		teachercoursepo.getEleMyRabbitLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
		teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=16,enabled=true, description="Display of elements on  The Game of Numbers Page")
	public void TheGameofNumbers(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleTheGameofNumbersLink(),"The Game of Numbers Link()","enabled");
		teachercoursepo.getEleTheGameofNumbersLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
		teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=17,enabled=true, description="Display of elements on  Greeny the Parrot Page")
	public void GreenytheParrot(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleGreenytheParrotLink(),"Greeny the Parrot Link()","enabled");
		teachercoursepo.getEleGreenytheParrotLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
		teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=18,enabled=true, description="Display of elements on  Holidays Page")
	public void Holidays(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleHolidaysLink(),"Holidays Link()","enabled");
		teachercoursepo.getEleHolidaysLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
	    teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
	    NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
		teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=19,enabled=true, description="Display of elements on  The Cowboys Page")
	public void TheCowboy(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleTheCowboyLink(),"The Cowboy Link()","enabled");
		teachercoursepo.getEleTheCowboyLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
		teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=20,enabled=true, description="Display of elements on  Feed the Geese Page")
	public void FeedtheGeese(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleFeedtheGeeseLink(),"Feedn the Geese Link()","enabled");
		teachercoursepo.getEleFeedtheGeeseLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
		teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=21,enabled=true, description="Display of elements on Jaggu the Jaguar Page")
	public void JaggutheJaguar(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleJaggutheJaguarLink(),"Jaggu the Jaguar Link()","enabled");
		teachercoursepo.getEleJaggutheJaguarLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
		driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
		teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=22,enabled=true, description="Display of elements on Nero, the Little Fish Page")
	public void NerotheLittleFish(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleNerotheLittleFishLink(),"Nero the Little Fish Link()","enabled");
		teachercoursepo.getEleNerotheLittleFishLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
		teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=23,enabled=true, description="Display of elements Tubby Sees the Frog Page")
	public void TubbySeestheFrog(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleTubbySeestheFrogLink(),"Tubby Sees the FrogLink","enabled");
		teachercoursepo.getEleTubbySeestheFrogLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
		teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=24,enabled=true, description="Display of elements Sunday Picnic Page")
	public void SundayPicnic(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleSundayPicnicLink(),"Sunday Picnic Link()","enabled");
		teachercoursepo.getEleSundayPicnicLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
		Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
		teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=25,enabled=true, description="Display of elements Visit to a Supermarket Page")
	public void VisittoaSupermarket(String browser) throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	teacherheaderpo=new TeacherHeaderPO(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getEleVisittoaSupermarketLink(),"Visit to a Supermarket Link()","enabled");
		teachercoursepo.getEleVisittoaSupermarketLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teachercoursepo.switchtochildframe();
	    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderText(),"header text is","displayed");
		teacherpo.elementStatus(teacherheaderpo.getEleHeaderCenterText(),"header text is","displayed");
		Thread.sleep(1000);
		teacherheaderpo.getEleAboutUsIcon().click();
		teacherheaderpo. getEleAboutHomeIcon().click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("content")));
	    Thread.sleep(6000);
		teacherheaderpo. getEleArtIcon().click();
		teachercoursepo.closeARTwindow();
		NXGReports.addStep(teachercoursepo.getEleWelcomeText().getText()," ", LogAs.PASSED, null);
		teachercoursepo.NextAndPrevButton();
		}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	
}
