/***********************************************************************
* @author 			:		Raghukiran MR
* @description		: 		Test scripts of StudentPageLevelTest
* @module			:		Student Module
* @testmethod		:	   	sampleDatabaseTest()
* @testmethod       :       studentLoginPage()
* @testmethod		:		studentHomepage()
* @testmethod		:		studentProfilePage()
* @testmethod		:		studentCourses()
* @testmethod		:		studentResources()
* @testmethod		:		preAssessmentInstruction()
* @testmethod		:		preAssessmentTestPage()
* @testmethod		:		verifyPreAssessmentPagePopup()
* @testmethod       :       postAssessmentInstruction()
* @testmethod       :       PostAssessmentTestPage()
* @testmethod       :       verifyPostAssessmentPagePopup()
* @testmethod       :       Mid1AssessmentInstruction()
* @testmethod       :       Mid1AssessmentTestPage()
* @testmethod       :       verifyMid1AssessmentPagePopup()
* @testmethod       :       Mid2AssessmentInstruction()
* @testmethod       :       Mid2AssessmentTestPage()
* @testmethod       :       verifyMid2AssessmentPagePopup()
*/
package com.liqvid.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;
import com.liqvid.library.ParallelBaseLib;

import com.liqvid.library.BaseLib;
import com.liqvid.library.GenericLib;
import com.liqvid.po.StudentCoursePo;
import com.liqvid.po.StudentHomePo;
import com.liqvid.po.StudentSignInPo;
import com.liqvid.po.StudentProfilePo;
import com.liqvid.po.StudentResourcesPo;

public class StudentPageLevelTest extends BaseLib {
	String sTestData=null;
	String[] sData=null;
	
	StudentSignInPo studentSignInPo=null;
	StudentHomePo studenthomepo=null;
	StudentProfilePo studentprofilepo=null;
	StudentCoursePo studentcoursepo=null;
	StudentResourcesPo Studentresourcespo=null;
	/* 
	 * @Description:To clear the databases of Assessment
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=1,enabled=false,description="To clear the databases of Assessment")
	public void sampleDatabaseTest(String browser){
		try{
			databaseTest();
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	/* 
	 * @Description: To Verify the Display Of Elements On Stud0ent login Page
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=2,enabled=true, description="Display Of Elements On Student login Page")
	public void studentLoginPage(String browser) throws InterruptedException{
		studentSignInPo=new StudentSignInPo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			studentSignInPo.elementStatus(studentSignInPo.getEleLogo(),"The English Edge logo ", "displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleSignInText(),"The Sign in text ", "displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleSignInInstrText(),"The Sign in instruction text is", "displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleUserNameText(),"The Username text is", "displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleUserNameTextField(),"The Username textfield is", "displayed");
			studentSignInPo.elementStatus(studentSignInPo.getElePwdText(),"The password text is", "displayed");
			studentSignInPo.elementStatus(studentSignInPo.getElePasswordTextFiled(),"The password textfield is", "displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleSignInBtn(),"The Sign in button is", "displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleForgotPwdLink(),"The forgot password link is", "displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleRegisterInstrText(),"The register instruction text is", "displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleRegisterBtn(),"The register button is", "displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleCopyRights(),"the copyright version text is", "displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleCodeVersionDateText(),"the bulid version text is", "displayed");
	
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		}
	/* 
	 * @Description: To Verify the Display of elements on Student Home Page
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=3,enabled=false, description="Display of elements on Student Home Page")
	public void studentHomepage(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "DATE"));
			Thread.sleep(4000);
			studentSignInPo.elementStatus(studenthomepo.getEleLogo(),"The English Edge logo is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleBulidVersion(),"The English Edge bulid version is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleTotalSessionCount(),"The total session count is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleTotalSessionText(),"The total session text is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleCompletedSessionCount(),"The completed session count is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleCompletedText(),"The completed session text is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleRemainingSessionCount(),"The remaining session count is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleRemainingText(),"The remaining session text is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleHomeIcon(),"The home icon is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleHomeTab(),"The home tab is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleCoursesIcon(),"The courses icon is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleCoursesTab(),"The courses tab is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleResoursesIcon(),"The resources icon is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleResourcesTab(),"The resources tab is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleWelcomeText(),"The Welcome text is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleStudentProfileimage(),"The Student profile image option is", "displayed");
			for(WebElement eleProductlist:studenthomepo.getEleStudentDetails())
			{
				studentSignInPo.elementStatus(eleProductlist,"The Student details is ", "displayed");
			}
			for(WebElement eleProductlist:studenthomepo.getEleLastDetails())
			{
				studentSignInPo.elementStatus(eleProductlist,"The Last Login, Course and Session details is ", "displayed");
			}
			studentSignInPo.elementStatus(studenthomepo.getEleProfileDropdown(),"The Profile Dropdown is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleProfileImgInDropdown(),"The Profile Dropdown is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleProfileTextDropdown(),"The Profile text Dropdown is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleCourseCount(),"The Courses count is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleCoursesText(),"The Courses text is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleSessionCount(),"The session count is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleSessionText(),"The session text is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleTimeSpent(),"The timespent text in y axis", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleCourse(),"The course text in x axis", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleTimeSpentPerCourse(),"The timespentpercourse text is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleTimeSpentPerCourse(),"The timespentpercourse text is", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleGraph(),"The Graph is", "displayed");
			
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		
	}
	/* 
	 * @Description: To Verify the Display of elements on Student Profile Page
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=4,enabled=false, description="Display of elements on Student Profile Page")
	public void studentProfilePage(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(4000);
			studenthomepo.getEleProfileTextDropdown().click();
			studenthomepo.getEleProfileOption().click();
		
			studentSignInPo.elementStatus(studentprofilepo.getEleProfileText(),"The Profile text is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleFirstNameText(),"The firstname text is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleFirstNameTextBox(),"The firstname textbox is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleLastNameText(),"The lastname text is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleLastNameTextBox(),"The lastname textbox is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleEmailIdText(),"The Email id text is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleEmailIdTextBox(),"The Emailid textbox is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getElePhoneText(),"The phone text is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getElePhoneTextBox(),"The phone textbox is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleDateOfBirthText(),"The dateofBirth text is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleDateOfBirthTextBox(),"The dateofBirth textbox is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleDateOfBirthTextBox(),"The dateofBirth textbox is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleCalendarIcon(),"The Calander icon is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleGenderText(),"The Gender Text is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleGenderDropDown(),"The Gender dropdown is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getElePlusIcon(),"The plus icon is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleChangePwd(),"The change password link is", "displayed");
			Thread.sleep(3000);
			studentprofilepo.getEleChangePwd().click();
			studentSignInPo.elementStatus(studentprofilepo.getEleMinusIcon(),"The minus icon is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleOldPasswordText(),"The old password text is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleOldPasswordTextBox(),"The old password textbox is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleNewPasswordText(),"The new password text is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleNewPasswordTextBox(),"The new password textbox is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleConfirmPasswordText(),"The confirm password text is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleConfirmNewPasswordTextBox(),"Theconfirm password textbox is", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getEleUpdateButton(),"Update button is", "displayed");
			
			
			
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	/* 
	 * @Description: To Verify Display of elements on Student Courses page
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=5,enabled=false, description="Display of elements on Student Courses page")
	public void studentCourses(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		studentcoursepo=new StudentCoursePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(4000);
			studentcoursepo.getEleCourseTab().click();
			Thread.sleep(2000);
			studentSignInPo.elementStatus(studentcoursepo.getEleCourseText(),"Course text is", "displayed");
			studentSignInPo.elementStatus(studentcoursepo.getEleInstructionText(),"Course instruction text is", "displayed");
			studentSignInPo.elementStatus(studentcoursepo.getEleStepText(),"step text is", "displayed");
			studentSignInPo.elementStatus(studentcoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			studentSignInPo.elementStatus(studentcoursepo.getEleBatchText(),"Batch text is", "displayed");
			studentSignInPo.elementStatus(studentcoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			studentSignInPo.elementStatus(studentcoursepo.getEleSelectBatchText(),"Select batch text is", "displayed");
			studentSignInPo.elementStatus(studentcoursepo.getEleSelectcourseText(),"Select course text is", "displayed");
			studentSignInPo.elementStatus(studentcoursepo.getEleClickcourseText(),"Click course text is", "displayed");
			studentSignInPo.elementStatus(studentcoursepo.getEleCourseText(),"course text is", "displayed");
		
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	/* 
	 * @Description: To Verify Display of elements on Student Resources page
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=6,enabled=false, description="Display of elements on Student Resources page")
	public void studentResources(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		studentcoursepo=new StudentCoursePo(driver);
		Studentresourcespo=new StudentResourcesPo(driver);
		try{
			
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(4000);	
			studentSignInPo.elementStatus(studenthomepo.getEleResourcesTab(), "Resources tab is ", "displayed");
			studenthomepo.getEleResourcesTab().click();
			Thread.sleep(2000);	
			studentSignInPo.elementStatus(Studentresourcespo.getEleResourcesText(), "Resources text is ", "displayed");
			if(Studentresourcespo.getEleResourcesImage().getAttribute("src").contains(""))
			{
				studentSignInPo.elementStatus(Studentresourcespo.getEleResourcesImage(),"The resources image is ", "displayed");
			}
				else{
				
					studentSignInPo.elementStatus(Studentresourcespo.getEleResourcesImage(),"The Student profile image is ", "not displayed");
				}
			studentSignInPo.elementStatus(Studentresourcespo.getEleStudentManualText(), "Student Manual text is ", "displayed");
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	/* 
	 * @Description: To Verify Display of Elements in  Pre Assessment Instructions Page
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=7,enabled=false, description="Display of Elements in  Pre Assessment Instructions Page")
	public void preAssessmentInstruction(String browser) throws Exception{
	studentSignInPo=new StudentSignInPo(driver);
	studenthomepo=new StudentHomePo(driver);
	studentprofilepo=new StudentProfilePo(driver);
	studentcoursepo=new StudentCoursePo(driver);
	Studentresourcespo=new StudentResourcesPo(driver);
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
		Thread.sleep(4000);	
		studentcoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		studentSignInPo.elementStatus(studentcoursepo.getEleClass(), "List of Batches is ", "displayed");
		Select select=new Select(studentcoursepo.getEleClass());
		select.selectByIndex(0);
		Thread.sleep(2000);
		studentSignInPo.elementStatus(studentcoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(studentcoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		studentSignInPo.elementStatus(studentcoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		studentcoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		studentSignInPo.elementStatus(studentcoursepo.getElePreAssessmentLink(),"PreAssessmentlink","enabled");
		studentcoursepo.getElePreAssessmentLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		studentSignInPo.verifyAssessmentinstruction();
	}catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	/* 
	 * @Description: To Verify Display of Elements in  Pre Assessment Instructions Page
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=8,enabled=false, description="Display of Elements in the Pre Assessment Page")
	public void preAssessmentTestPage(String browser) throws Exception{
	studentSignInPo=new StudentSignInPo(driver);
	studenthomepo=new StudentHomePo(driver);
	studentprofilepo=new StudentProfilePo(driver);
	studentcoursepo=new StudentCoursePo(driver);
	Studentresourcespo=new StudentResourcesPo(driver);
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
		Thread.sleep(6000);	
		studentcoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		Select select=new Select(studentcoursepo.getEleClass());
		select.selectByIndex(0);
		Thread.sleep(2000);
		Select select1=new Select(studentcoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		studentcoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		studentcoursepo.getElePreAssessmentLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		studentSignInPo.handleStartTestbutton();
		Thread.sleep(2000);
		elementStatus(studentcoursepo.getEleClass1PreAssessmentText(),"The Pre Assessment text is ", "displayed");
		elementStatus(studentcoursepo.getEleAllTheBestText(),"The All the best text is ", "displayed");
		elementStatus(studentcoursepo. getEleStartTimeText(),"start time text", "displayed");
		Thread.sleep(2000);
		elementStatus(studentcoursepo.getEleEndTimeText(),"end time text is", "displayed");
		elementStatus(studentcoursepo.getElePreviousButton(),"previous button is", "enabled");
		elementStatus(studentcoursepo.getEleRecentPageNumber(),"page number is", "displayed");
		elementStatus(studentcoursepo.getEleNextButton(),"page number is", "displayed");
		Thread.sleep(2000);
		List<WebElement> elemnet = driver.findElements(By.xpath("//div[@class='h3 pull-right m-r-sm']//div[@id='countdown']"));
		for(WebElement eleTimer:elemnet)
		{
			
			studentSignInPo.elementStatus(eleTimer,"The timer value is ", "displayed");	
		}
		Thread.sleep(4000);
	}catch(Exception e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	/* 
	 * @Description: To Verify Display of Elements in  Pre Assessment Instructions Page,Display of elements in the Popup that is displayed when user clicks on "Next" button without selecting the Options
	 * @Author:RaghuKiran
	 * 
	 */
	@Parameters("browser")
	@Test(priority=9,enabled=false, description="Display of Elements in the Pre Assessment from page 1 to 37,Display of elements in the Popup that is displayed when user clicks on Next' button without selecting the Options")
	public void verifyPreAssessmentPagePopup(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		studentcoursepo=new StudentCoursePo(driver);
		Studentresourcespo=new StudentResourcesPo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(4000);	
			studentcoursepo.getEleCourseTab().click();
			Thread.sleep(2000);	
			Select select=new Select(studentcoursepo.getEleClass());
			select.selectByIndex(0);
			Thread.sleep(2000);
			Select select1=new Select(studentcoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			studentcoursepo.getEleStartCourseButton().click();
			Thread.sleep(2000);
			studentSignInPo.scrolldown();
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			studentcoursepo.getElePreAssessmentLink().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			studentSignInPo.handleStartTestbutton();
			 Thread.sleep(6000);
			studentcoursepo.assessementPopUp();
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		
		
	}
	
	/* 
	 * @Description: To Verify Display of Elements in  Post Assessment Instructions Page
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=10,enabled=false, description="Display of Elements in  post Assessment Instructions Page")
	public void postAssessmentInstruction(String browser) throws Exception{
	studentSignInPo=new StudentSignInPo(driver);
	studenthomepo=new StudentHomePo(driver);
	studentprofilepo=new StudentProfilePo(driver);
	studentcoursepo=new StudentCoursePo(driver);
	Studentresourcespo=new StudentResourcesPo(driver);
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
		Thread.sleep(4000);	
		studentcoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		studentSignInPo.elementStatus(studentcoursepo.getEleClass(), "List of Batches is ", "displayed");
		Select select=new Select(studentcoursepo.getEleClass());
		select.selectByIndex(0);
		Thread.sleep(2000);
		studentSignInPo.elementStatus(studentcoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(studentcoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		studentSignInPo.elementStatus(studentcoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		studentcoursepo.getEleStartCourseButton().click();
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		studentSignInPo.elementStatus(studentcoursepo.getElePostAssessmentLink(),"Post Assessmentlink","enabled");
		studentcoursepo.getElePostAssessmentLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		studentSignInPo.verifyAssessmentinstruction();
		
	}catch(AssertionError e)
	{
		NXGReports.addStep("Testcase FAiled.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	/* 
	 * @Description: To Verify Display of Elements in  Post Assessment  Page
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=11,enabled=false, description="Display of Elements in the Post Assessment Page")
	public void PostAssessmentTestPage(String browser) throws Exception{
	studentSignInPo=new StudentSignInPo(driver);
	studenthomepo=new StudentHomePo(driver);
	studentprofilepo=new StudentProfilePo(driver);
	studentcoursepo=new StudentCoursePo(driver);
	Studentresourcespo=new StudentResourcesPo(driver);
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
		Thread.sleep(4000);	
		studentcoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		Select select=new Select(studentcoursepo.getEleClass());
		select.selectByIndex(0);
		Thread.sleep(2000);
		Select select1=new Select(studentcoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		studentcoursepo.getEleStartCourseButton().click();
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		studentcoursepo.getElePostAssessmentLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		studentSignInPo.handleStartTestbutton();
		Thread.sleep(2000);
		studentSignInPo.elementStatus(studentcoursepo.getEleClass2PostAssessmentText(),"The Post Assessment text is ", "displayed");
		studentSignInPo.elementStatus(studentcoursepo.getEleAllTheBestText(),"The All the best text is ", "displayed");
		studentSignInPo.elementStatus(studentcoursepo. getEleStartTimeText(),"start time text", "displayed");
		Thread.sleep(2000);
		studentSignInPo.elementStatus(studentcoursepo.getEleEndTimeText(),"end time text is", "displayed");
		studentSignInPo.elementStatus(studentcoursepo.getElePreviousButton(),"previous button is", "enabled");
		studentSignInPo.elementStatus(studentcoursepo.getEleRecentPageNumber(),"page number is", "displayed");
		studentSignInPo.elementStatus(studentcoursepo.getEleNextButton(),"page number is", "displayed");
		Thread.sleep(2000);
		List<WebElement> elemnet = driver.findElements(By.xpath("//div[@class='h3 pull-right m-r-sm']//div[@id='countdown']"));
		for(WebElement eleTimer:elemnet)
		{
			
			studentSignInPo.elementStatus(eleTimer,"The timer value is ", "displayed");	
		}
		Thread.sleep(4000);
	}catch(AssertionError e)
	{
		NXGReports.addStep("Testcase FAiled.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	/* 
	 * @Description: To Verify Display of Elements in the Post Assessment from page 1 to 37,Display of elements in the Popup that is displayed when user clicks on Next' button without selecting the Options
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=12,enabled=false, description="Display of Elements in the Post Assessment from page 1 to 37,Display of elements in the Popup that is displayed when user clicks on Next' button without selecting the Options")
	public void verifyPostAssessmentPagePopup(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		studentcoursepo=new StudentCoursePo(driver);
		Studentresourcespo=new StudentResourcesPo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(4000);	
			studentcoursepo.getEleCourseTab().click();
			Thread.sleep(2000);	
			Select select=new Select(studentcoursepo.getEleClass());
			select.selectByIndex(0);
			Thread.sleep(2000);
			Select select1=new Select(studentcoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			studentcoursepo.getEleStartCourseButton().click();
			Thread.sleep(2000);
			studentSignInPo.scrolldown();
			driver.switchTo().frame(0); 
			studentcoursepo.getElePostAssessmentLink().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			studentSignInPo.handleStartTestbutton();
			 Thread.sleep(6000);
			studentcoursepo.assessementPopUp();
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase FAiled.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
}
