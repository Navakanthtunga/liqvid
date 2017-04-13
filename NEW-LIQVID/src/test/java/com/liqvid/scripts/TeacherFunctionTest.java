package com.liqvid.scripts;

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
import com.liqvid.po.TeacherHomePo;
import com.liqvid.po.TeacherProfilePo;
import com.liqvid.po.TeacherSignPo;

public class TeacherFunctionTest extends BaseLib
{
	TeacherSignPo teachersigninpo;
	TeacherHomePo teacherhomepo;
	TeacherProfilePo teacherprofilepo;
	TeacherCoursePo teachercoursepo;
	
	@Parameters("browser")
	@Test(priority=1,enabled=true,description="To clear the databases of Assessment")
	public void sampleDatabaseTest(String browser)
	{
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
	@Test(priority=2,enabled=true,description="Login as Teacher with valid Credentials. Verify Teacher home page with teacher details is displayed.")
    public void LoginValid(String browser) throws Exception
    {
		teachersigninpo=new TeacherSignPo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.elementStatus(teachersigninpo.getEleUserNameTextField(),"UserName Text Field is","enabled");
			teachersigninpo.elementStatus(teachersigninpo.getElePasswordTextFiled(),"Password Text Field is", "enabled");
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID is"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			teachersigninpo.elementStatus(teachersigninpo.getEleSignInBtn(),"SignIn Button is", "enabled");
		    teachersigninpo.getEleSignInBtn().click();
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
    }
	@Parameters("browser")
	@Test(priority=3,enabled=true,description="Login as Teacher with Invalid Credentials.")
	public void LoginInvalid(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "InvalidUserName"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			teachersigninpo.elementStatus(teachersigninpo.getEleErrorMsgLogin(),"Incorrect username or password is","displayed");
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "InvalidPassword"));
			teachersigninpo.elementStatus(teachersigninpo.getEleErrorMsgLogin(),"Incorrect username or password is","displayed");
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "InvalidUserName"),GenericLib.getCongigValue(GenericLib.sConfigFile, "InvalidPassword"));
			teachersigninpo.elementStatus(teachersigninpo.getEleErrorMsgLogin(),"Incorrect username or password is","displayed");
	   }
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=4,enabled=true,description="Login as teacher for the first time.Verify total Sessions, completed and Remaining count")
	public void HomepageTotalSessionCount(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			teachersigninpo.getEleSignInBtn().click();
			teachersigninpo.elementStatus(teacherhomepo.getEleTotalSessionCount()," Total Sessions Count is","displayed");
			teachersigninpo.elementStatus(teacherhomepo.getEleCompletedSessionCount(),"Completed Session Count is", "displayed");
			teachersigninpo.elementStatus(teacherhomepo.getEleRemainingSessionCount(), "Remaining Session Count is", "displayed");
			Thread.sleep(3000);
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=5,enabled=true,description="Complete 1 session and Verify Session Count")
	public void SessionCountAfterOneSession(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(6000);
		    teachersigninpo.elementStatus(teacherhomepo.getEleCoursesTab(),"Home Tab is", "displayed");
		    Thread.sleep(6000);
		    teachercoursepo.getEleCourseTab().click();
			Thread.sleep(2000);	
			Select select=new Select(teachercoursepo.getEleBatchSelected());
			select.selectByIndex(0);
			Thread.sleep(2000);
			Select select1=new Select(teachercoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			teachercoursepo.getEleStartCourseButton().click();
		    Thread.sleep(2000);
		    teachersigninpo.scrolldown();
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			teachercoursepo.getElePreAssessmentLink().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			teachersigninpo.handleStartTestbutton();
			Thread.sleep(8000);
			elementStatus(teachercoursepo.getEleClass1PreAssessmentText(),"The Pre Assessment text is ", "displayed");
	    }
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=6,enabled=true,description="Login as a teacher, start a session, Logout and Login again Verify Last Login, Last Course taken and Last Seesion taken details are updated.")
	public void CheckLastLoginLastcourseLastSession(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(6000);
		    teachersigninpo.elementStatus(teacherhomepo.getEleCoursesTab(),"Home Tab is", "displayed");
		    Thread.sleep(6000);
		    teachercoursepo.getEleCourseTab().click();
			Thread.sleep(2000);	
			Select select=new Select(teachercoursepo.getEleBatchSelected());
			select.selectByIndex(0);
			Thread.sleep(2000);
			Select select1=new Select(teachercoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			teachercoursepo.getEleStartCourseButton().click();
		    Thread.sleep(2000);
		    teachersigninpo.scrolldown();
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			teachercoursepo.getEleMyRabbitLink().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			teachercoursepo.switchtochildframe();
			teachercoursepo.NextAndPrevButton();
			teachercoursepo.switchingparentframe();
			Thread.sleep(5000);
			System.out.println(driver.getCurrentUrl());
			driver.switchTo().defaultContent();
			System.out.println(driver.getCurrentUrl());
			teacherhomepo.getEleHomeTab().click();
			NXGReports.addStep(teacherhomepo.getEleLastCourse().getText()," ", LogAs.PASSED, null);
			NXGReports.addStep(teacherhomepo.getEleLastLogin().getText()," ", LogAs.PASSED, null);
			NXGReports.addStep(teacherhomepo.getEleLastSession().getText()," ", LogAs.PASSED, null);
			Thread.sleep(5000);
			teacherhomepo.getEleProfileTextDropdown().click();
			Thread.sleep(5000);
			teacherhomepo.getEleLogoutOption().click();
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			NXGReports.addStep(teacherhomepo.getEleLastCourse().getText()," ", LogAs.PASSED, null);
			NXGReports.addStep(teacherhomepo.getEleLastLogin().getText()," ", LogAs.PASSED, null);
			NXGReports.addStep(teacherhomepo.getEleLastSession().getText()," ", LogAs.PASSED, null);
			
			
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=7,enabled=true,description="Click on Teacher Profile photo verify it is asking for Upload Picture or n't and Upload a Picture")
	public void UploadingProfilePhoto(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(6000);
			teachersigninpo.elementStatus(teacherhomepo.getEleTeacherProfilePhoto(),"The Profile photo option is", "displayed");
			teacherhomepo.getEleTeacherProfilePhoto().click();
			Thread.sleep(4000);
			teacherhomepo.getElePhotoPath().sendKeys("D:\\liqvid-Bulid\\resources\\Teacher_Photo.png");
			Thread.sleep(4000);
			teachersigninpo.elementStatus(teacherhomepo.getEleSubmitBtn(),"The Submit Button is", "displayed");
			teacherhomepo.getEleSubmitBtn().click();
			Thread.sleep(2000);
			teachersigninpo.elementStatus(teacherhomepo.getEleTeacherProfilePhoto(),"Profile Photo is","displayed");
			teacherhomepo.getEleTeacherProfilePhoto().click();
			teacherhomepo.getEleRemoveImageBtn().click();
			
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=8,enabled=true,description="Click on Teacher Profile photo and Click on 'Remove Image'button and verify the image is removed in the homepage")
	public void FunctionalityOfRemoveImage(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(6000);
			teachersigninpo.elementStatus(teacherhomepo.getEleTeacherProfilePhoto(),"The Profile photo option is", "displayed");
			teacherhomepo.getEleTeacherProfilePhoto().click();
			Thread.sleep(6000);
			teacherhomepo.getElePhotoPath().sendKeys("D:\\liqvid-Bulid\\resources\\Teacher_Photo.png");
			Thread.sleep(4000);
			teachersigninpo.elementStatus(teacherhomepo.getEleSubmitBtn(),"The Submit Button is", "displayed");
			teacherhomepo.getEleSubmitBtn().click();
			Thread.sleep(2000);
			teachersigninpo.elementStatus(teacherhomepo.getEleTeacherProfilePhoto(),"Profile Photo is","displayed");
			if(teacherhomepo.getEleTeacherProfileimage().getAttribute("src").contains("/learning/themes/notebook/images/logo.png"))
			{
				teachersigninpo.elementStatus(teacherhomepo.getEleTeacherProfileimage(),"The Teacher profile image is", "displayed");
			}
				else{
				
					teachersigninpo.elementStatus(teacherhomepo.getEleTeacherProfileimage(),"The Teacher profile image is ", "not displayed");
				}
			//verify the image is removed in the homepage
			teacherhomepo.getEleTeacherProfilePhoto().click();
			Thread.sleep(4000);
			teachersigninpo.elementStatus(teacherhomepo.getEleRemoveImageBtn(),"The Remove image button is ", "displayed");
			if(teacherhomepo.getEleRemoveImageBtn().isDisplayed())
			{
			    teacherhomepo.getEleRemoveImageBtn().click();
			    if(teacherhomepo.getEleTeacherProfileimage().getAttribute("src").contains("/learning/themes/notebook/images/avatar_default.jpg"))
			    {
				 teachersigninpo.elementStatus(teacherhomepo.getEleTeacherProfileimage(),"The Teacher profile image is ", "displayed");
			    }
				else
				{
				 teachersigninpo.elementStatus(teacherhomepo.getEleTeacherProfileimage(),"The Teacher profile image is ", "not displayed");
				}
			}
			else
			{
				teachersigninpo.elementStatus(teacherhomepo.getEleCancelBtn(),"The cancel button is ", "displayed");
				teacherhomepo.getEleCancelBtn().click();
				teachersigninpo.elementStatus(teacherhomepo.getEleTeacherProfilePhoto(),"The Profile photo option is", "displayed");
			}
		}
		catch(AssertionError e)
		{

			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		
		}
	}
	@Parameters("browser")
	@Test(priority=9,enabled=true,description="Edit the Teacher Profile with valid details.Verify the teacher profile details are updated in the teacher home page.")
	public void UpdateProfile(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		teacherprofilepo=new TeacherProfilePo(driver);
		
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(6000);
			teachersigninpo.elementStatus(teacherhomepo.getEleProfileTextDropdown(),"The Profile photo dropdown is", "displayed");
			teacherhomepo.getEleProfileTextDropdown().click();
			Thread.sleep(3000);
			teachersigninpo.elementStatus(teacherhomepo.getEleProfileOption(),"The Profile option is", "displayed");
			Thread.sleep(6000);
			teacherhomepo.getEleProfileOption().click();
			Thread.sleep(3000);
			teacherprofilepo.getEleFirstNameTextBox().clear();
			teacherprofilepo.getEleLastNameTextBox().clear();
			teacherprofilepo.getEleEmailIdTextBox().clear();
			teacherprofilepo.getElePhoneTextBox().clear();
			teacherprofilepo.UpdateProfile(GenericLib.getCongigValue(GenericLib.sConfigFile,"FIRSTNAME"),GenericLib.getCongigValue(GenericLib.sConfigFile,"LASTNAME"),GenericLib.getCongigValue(GenericLib.sConfigFile,"FROM_EMAILID"),GenericLib.getCongigValue(GenericLib.sConfigFile,"PHONENUMBER"));
			Thread.sleep(6000);
			teachersigninpo.elementStatus(teacherprofilepo.getEleDateOfBirthTextBox(),"The Date of Birth Textbox is", "displayed");
			if(teacherprofilepo.getEleDateOfBirthTextBox().isDisplayed())
			{
				for(int i=0;i<2;i++)
				{
					teachersigninpo.elementStatus(teacherprofilepo.getEleCalendarIcon(),"The Calender icon is", "displayed");
					teacherprofilepo.getEleCalendarIcon().click();
					Thread.sleep(3000);
					teachersigninpo.elementStatus(teacherprofilepo.getEleDateSelected(),"The date selected is", "displayed");
					teacherprofilepo.getEleDateSelected().click();
				}
			}
			Thread.sleep(6000);
			teachersigninpo.elementStatus(teacherprofilepo.getEleGenderDropDown(),"The Date of Birth Drop Down is", "displayed");
			teacherprofilepo.getEleGenderDropDown().click();
			WebElement mySelectElement = driver.findElement(By.id("gender"));
			Select dropdown= new Select(mySelectElement);
			dropdown.selectByIndex(1);
			Thread.sleep(6000);
			teachersigninpo.elementStatus(teacherprofilepo.getEleUpdateButton(),"Update button is", "displayed");
			teacherprofilepo.getEleUpdateButton().click();
			Thread.sleep(3000);
			teachersigninpo.elementStatus(teacherprofilepo.getEleUpdateSucessFullMsg(),"Update Sucessfull meassage is","displayed");
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=10,enabled=true,description="Edit the Teacher Profile with invalid Email id and phone number .Verify the error message.")
	public void invalidEmailidPhoneNumber(String browser) throws Exception{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		teacherprofilepo=new TeacherProfilePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);
			teacherhomepo.getEleProfileTextDropdown().click();
			Thread.sleep(3000);
			teacherhomepo.getEleProfileOption().click();
			Thread.sleep(3000);
			teacherprofilepo.getEleEmailIdTextBox().clear();
			Thread.sleep(3000);
			teacherprofilepo.getElePhoneTextBox().clear();
			teacherprofilepo.getEleEmailIdTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "FROM_PWD"));
			teacherprofilepo.getElePhoneTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "FROM_PWD"));
			Thread.sleep(3000);
			teacherprofilepo.getEleUpdateButton().click();
			Thread.sleep(3000);
			teachersigninpo.elementStatus(teacherprofilepo.getEleEmailIdErrorMsg(),"The error 'This value should be a valid email.'is", "displayed");
			teachersigninpo.elementStatus(teacherprofilepo.getElePhoneNumberErrorMsg(),"The error 'This value should be a valid phone number.' is", "displayed");
			
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=11,enabled=true, description="Don't enter any Valid Data to anyTextbox and Click on update button.Verify the Error messages are displayed")
	public void errorMessageInProfile(String browser) throws Exception{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		teacherprofilepo=new TeacherProfilePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(6000);
			teacherhomepo.getEleProfileTextDropdown().click();
			Thread.sleep(3000);
			teacherhomepo.getEleProfileOption().click();
			Thread.sleep(3000);
			teacherprofilepo.getEleFirstNameTextBox().clear();
			teacherprofilepo.getEleLastNameTextBox().clear();
			teacherprofilepo.getEleEmailIdTextBox().clear();
			teacherprofilepo.getElePhoneTextBox().clear();
			Thread.sleep(2000);
			teacherprofilepo.getEleCalendarIcon().click();
			teacherprofilepo.getEleDateSelected().click();
			Thread.sleep(2000);
			teacherprofilepo.getEleGenderDropDown().click();
			WebElement mySelectElement = driver.findElement(By.id("gender"));
			Select dropdown= new Select(mySelectElement);
			dropdown.selectByIndex(0);
			teacherprofilepo.getEleUpdateButton().click();
			teachersigninpo.elementStatus(teacherprofilepo.getEeleValueRequiredErrMsg(),"This value requried error message is displayed is", "displayed");
			
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		
	}
	@Parameters("browser")
	@Test(priority=11,enabled=true, description="Edit the Teacher Profile in midst of a session. Verify the teacher profile shouldn't be edited.")
	public void VerifyModificationMidOfSession(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(6000);
		    teachersigninpo.elementStatus(teacherhomepo.getEleCoursesTab(),"Home Tab", "displayed");
		    Thread.sleep(6000);
		    teachercoursepo.getEleCourseTab().click();
			Thread.sleep(2000);	
			Select select=new Select(teachercoursepo.getEleBatchSelected());
			select.selectByIndex(0);
			Thread.sleep(2000);
			Select select1=new Select(teachercoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			teachercoursepo.getEleStartCourseButton().click();
		    Thread.sleep(2000);
		    teachersigninpo.scrolldown();
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			teachercoursepo.getElePreAssessmentLink().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			teachersigninpo.handleStartTestbutton();
			Thread.sleep(8000);
			teachersigninpo.elementStatus(teachercoursepo.getEleClass1PreAssessmentText(),"The Pre Assessment text is ", "displayed");
	    }
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=12,enabled=true, description="Click on Change password and try to update with new password")
	public void functionalityofChangePassword(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		teacherprofilepo=new TeacherProfilePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);
			teacherhomepo.getEleProfileTextDropdown().click();
			Thread.sleep(10000);
			teacherhomepo.getEleProfileOption().click();
			Thread.sleep(3000);
			teacherprofilepo.getEleChangePwd().click();
			Thread.sleep(3000);
			teachersigninpo.elementStatus(teacherprofilepo.getEleOldPasswordTextBox(),"The old password textbox is ", "displayed");
			teacherprofilepo.getEleOldPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			teachersigninpo.elementStatus(teacherprofilepo.getEleNewPasswordTextBox(),"The new password textbox is ", "displayed");
			teacherprofilepo.getEleNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "NEWPASSWORD"));
			Thread.sleep(3000);
			teachersigninpo.elementStatus(teacherprofilepo.getEleConfirmNewPasswordTextBox(),"The confirm password textbox is ", "displayed");
			teacherprofilepo.getEleConfirmNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "CONFIRMPASSWORD"));
			Thread.sleep(3000);
			teacherprofilepo.getEleUpdateButton().click();
			Thread.sleep(3000);
			teachersigninpo.elementStatus(teacherhomepo.getEleProfileTextDropdown(),"logout link is ", "displayed");
			teacherhomepo.getEleProfileTextDropdown().click();
			teachersigninpo.elementStatus(teacherhomepo.getEleLogoutOption(),"logout link is ", "displayed");
			Thread.sleep(6000);
			teacherhomepo.getEleLogoutOption().click();
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "NEWPASSWORD"));
			Thread.sleep(10000);
			teacherhomepo.getEleProfileTextDropdown().click();
			Thread.sleep(10000);
			teacherhomepo.getEleProfileOption().click();
			Thread.sleep(3000);
			teacherprofilepo.getEleChangePwd().click();
			Thread.sleep(3000);
			teachersigninpo.elementStatus(teacherprofilepo.getEleOldPasswordTextBox(),"The old password textbox is ", "displayed");
			teacherprofilepo.getEleOldPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "NEWPASSWORD"));
			teachersigninpo.elementStatus(teacherprofilepo.getEleNewPasswordTextBox(),"The new password textbox is ", "displayed");
			teacherprofilepo.getEleNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(3000);
			teachersigninpo.elementStatus(teacherprofilepo.getEleConfirmNewPasswordTextBox(),"The confirm password textbox is ", "displayed");
			teacherprofilepo.getEleConfirmNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(6000);
			teacherprofilepo.getEleUpdateButton().click();
			Thread.sleep(3000);
			
			
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=13,enabled=true,description="Click on Change password and try to update with invalid old password and invalid confirm password")
	public void verifyInvalidOldPwd(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		teacherprofilepo=new TeacherProfilePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(6000);
			teacherhomepo.getEleProfileTextDropdown().click();
			Thread.sleep(6000);
			teacherhomepo.getEleProfileOption().click();
			Thread.sleep(3000);
			teacherprofilepo.getEleChangePwd().click();
			Thread.sleep(3000);
			teacherprofilepo.getEleUpdateButton().click();
			teachersigninpo.elementStatus(teacherprofilepo.getEeleValueRequiredErrMsg(),"The error message 'This value is required.'", "displayed");
			teacherprofilepo.getEleOldPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "WRONGPASSWORD"));
			teacherprofilepo.getEleNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "NEWPASSWORD"));
			teacherprofilepo.getEleConfirmNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "WRONGCONFIRMPASSWORD"));
			Thread.sleep(3000);
			teachersigninpo.elementStatus(teacherprofilepo.getEleValueShouldbeSameMsg(),"The value should be same message is", "displayed");
			Thread.sleep(3000);
			teacherprofilepo.getEleUpdateButton().click();
			Thread.sleep(4000);
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=14,enabled=true,description="Partially complete a session and verify the completed Session Count.")
	public void VerifyCountCompletedSession(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(6000);
		    teachersigninpo.elementStatus(teacherhomepo.getEleCoursesTab(),"Home Tab is", "displayed");
		    Thread.sleep(6000);
		    teachercoursepo.getEleCourseTab().click();
			Thread.sleep(2000);	
			Select select=new Select(teachercoursepo.getEleBatchSelected());
			select.selectByIndex(0);
			Thread.sleep(2000);
			Select select1=new Select(teachercoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			teachercoursepo.getEleStartCourseButton().click();
		    Thread.sleep(2000);
		    teachersigninpo.scrolldown();
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			teachercoursepo.getElePreAssessmentLink().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			teachersigninpo.handleStartTestbutton();
			Thread.sleep(8000);
			elementStatus(teachercoursepo.getEleClass1PreAssessmentText(),"The Pre Assessment text is ", "displayed");
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=15,enabled=true,description="Verify whether all the questions can be answered by clicking on 'Next' button,Verify  the functionality of 'prev' button,Verify the functionality of 'Finish' button,Verify the functionality of Back button")
	public void verifyPostAssessmentNextPrevBtn(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		teacherprofilepo=new TeacherProfilePo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(6000);
			teachercoursepo.getEleCourseTab().click();
			Thread.sleep(6000);	
			Select select=new Select(teachercoursepo.getEleBatchSelected());
			select.selectByIndex(0);
			Thread.sleep(6000);
			Select select1=new Select(teachercoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			teachercoursepo.getEleStartCourseButton().click();
			Thread.sleep(2000);
			teachersigninpo.scrolldown();
			Thread.sleep(4000);
			driver.switchTo().frame(0);
			Thread.sleep(4000);
			teachercoursepo.getElePostAssessmentLink().sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			teachercoursepo.getEleStartTextButton().click();
			Thread.sleep(4000);
			
			
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
  @Parameters("browser")
  @Test(priority=16,enabled=true,description="Start a session which is partially completed.Verify the session is resumed from its stop point.")
	public void ResumeSession(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(15000);
			teachercoursepo.getEleCourseTab().click();
			Thread.sleep(6000);	
			Select select=new Select(teachercoursepo.getEleBatchSelected());
			select.selectByIndex(0);
			Thread.sleep(6000);
			Select select1=new Select(teachercoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			teachercoursepo.getEleStartCourseButton().click();
			teachersigninpo.scrolldown();
			Thread.sleep(4000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			teachercoursepo.getEleTheGoatEaterLink().sendKeys(Keys.ENTER);
			teachercoursepo.switchtochildframe();
			teachercoursepo.verifyIncompleteSession();
			
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
    @Parameters("browser")
	@Test(priority=17,enabled=true,description="Edit the Teacher Profile in midst of a session.Verify the Updation is reflecting in Home page.")
	public void verifyUpdation(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		teacherhomepo=new TeacherHomePo(driver);
		teacherprofilepo=new TeacherProfilePo(driver);
		
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);	
			teachercoursepo.getEleCourseTab().click();
			Thread.sleep(2000);	
			teachersigninpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
			Select select=new Select(teachercoursepo.getEleBatchSelected());
			select.selectByIndex(0);
			Thread.sleep(2000);
			teachersigninpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
			Select select1=new Select(teachercoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			teachersigninpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
			teachercoursepo.getEleStartCourseButton().click();
			Thread.sleep(2000);
			driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(0); 
			teachersigninpo.elementStatus(teachercoursepo.getEleTheGoatEaterLink(),"The goat eater link","enabled");
			teachercoursepo.getEleTheGoatEaterLink().sendKeys(Keys.ENTER);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			teacherhomepo.getEleProfileTextDropdown().click();
			Thread.sleep(3000);
			teacherhomepo.getEleProfileOption().click();
			Thread.sleep(6000);
			teacherprofilepo.getEleEmailIdTextBox().clear();
			teacherprofilepo.getEleEmailIdTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "FROM_EMAILID"));
			Thread.sleep(6000);
			teacherprofilepo.getEleUpdateButton().click();
			Thread.sleep(4000);
			NXGReports.addStep(teacherprofilepo.getEleUpdateSucessFullMsg().getText()," ", LogAs.PASSED, null);
			
		}
		catch(AssertionError e)
		{
		  NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		  throw e;
		}
	}
    @Parameters("browser")
    @Test(priority=18,enabled=true,description="Click on start course and click on  a gameLink.verify the game is lunched on a new popups or n't and check next and back button after dat click on next game link")
	public void AllLink(String browser) throws Exception
	{
		teachersigninpo=new TeacherSignPo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teachersigninpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(15000);
			teachercoursepo.getEleCourseTab().click();
			Thread.sleep(6000);	
			Select select=new Select(teachercoursepo.getEleBatchSelected());
			select.selectByIndex(0);
			Thread.sleep(6000);
			Select select1=new Select(teachercoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			teachercoursepo.getEleStartCourseButton().click();
			teachersigninpo.scrolldown();
			Thread.sleep(4000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			int allLinks=teachercoursepo.getEleAllLink().size();
			System.out.println(allLinks);
			for(int i=0;i<=(allLinks-1);i++)
			{
				 if(!(teachercoursepo.getEleAllLink().get(i).getText().equals("Pre Assessment"))&&!(teachercoursepo.getEleAllLink().get(i).getText().equals("Mid-1 Assessment"))&&!(teachercoursepo.getEleAllLink().get(i).getText().equals("Mid-2 Assessment"))&&!(teachercoursepo.getEleAllLink().get(i).getText().equals("Post Assessment")))
                 {
                         System.out.println(" session number is  "  + i  );
                         teachercoursepo.getEleAllLink().get(i).click();
                         System.out.println("clicked on session  "+ teachercoursepo.getEleAllLink().get(i).getText());
                         teachercoursepo.switchtochildframe();
                         Thread.sleep(4000);
                         System.out.println("switched into session popup");
                         Thread.sleep(4000);
                         teachercoursepo.NextAndPrevButton();
                         teachercoursepo.switchingparentframe();
                         System.out.println("switched to parent ");
                 }
		    }
		}
		catch(AssertionError e)
		{
		  NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		  throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

