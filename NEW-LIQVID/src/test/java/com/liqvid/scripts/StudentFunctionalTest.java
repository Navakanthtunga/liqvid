/***********************************************************************
* @author 			:		Raghukiran MR
* @description		: 		Test scripts of StudentFunctionalTest
* @module			:		Student Module
* @testmethod		:	   	sampleDatabaseTest()
* @testmethod       :       studentHomePage()
* @testmethod		:		uploadPhotoStudentProfile()
* @testmethod		:		verifyInvalidOldPwd()
* @testmethod		:		functionalityofChangePassword()
* @testmethod		:		invalidEmailidPhoneNumber()
* @testmethod		:		errorMessageInProfile()
* @testmethod		:		verifyPreAssessmentNextPrevBtn()
* @testmethod		:		verifyPostAssessmentNextPrevBtn()
* @testmethod       :       verifyPreAssessementError()
* @testmethod       :       verifyPostAssessementError()
* @testmethod       :       changeStudentProfilePwd()
*/
package com.liqvid.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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

public class StudentFunctionalTest extends BaseLib {
	StudentSignInPo studentSignInPo=null;
	StudentHomePo studenthomepo=null;
	StudentProfilePo studentprofilepo=null;
	StudentCoursePo studentcoursepo=null;
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
	 * @Description: Login with valid credentials and verify the elements in the home page
	 * @Author:RaghuKiran
	 * 
	 */
	@Parameters("browser")
	@Test(priority=2,enabled=true, description="Login with valid credentials and verify the elements in the home page")
	public void studentHomePage(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			studentSignInPo.elementStatus(studenthomepo.getEleWelcomeText(),"The welcome text", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleHomeTab(),"The Home tab","displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleCoursesTab(),"The Cources tab","displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleResourcesTab(),"The Resources tab","displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleLogo(),"The English Edge logo","displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleBulidVersion(),"The bulid version","displayed");
			Thread.sleep(2000);
			studentSignInPo.elementStatus(studenthomepo.getEleProfileTextDropdown(),"The Profile text","displayed");
			studenthomepo.getEleProfileTextDropdown().click();
			studentSignInPo.elementStatus(studenthomepo.getEleProfileOption(),"The Profile option","displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleLogoutOption(),"The Logout option","displayed");
			Thread.sleep(2000);
			studenthomepo.getEleLogoutOption().click();
			Thread.sleep(2000);
			studentSignInPo.elementStatus(studentSignInPo.getEleSignInText(),"The Sign in text","displayed");
		}catch(AssertionError e)
			{
				NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				throw e;
			}
	}
	/* 
	 * @Description:Uploading Photo on Student Profile image and verify the image is removed in the homepage
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=3,enabled=false, description="Uploading Photo on Student Profile image,verify the image is removed in the homepage")
	public void uploadPhotoStudentProfile(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(6000);
			studentSignInPo.elementStatus(studenthomepo.getEleStudentProfilePhoto(),"The Profile photo option", "displayed");
			studenthomepo.getEleStudentProfilePhoto().click();
			Thread.sleep(4000);
			studenthomepo.getElePhotoPath().sendKeys(GenericLib.imagepath);
			Thread.sleep(4000);
			studentSignInPo.elementStatus(studenthomepo.getEleSubmitBtn(),"The Submit Button", "displayed");
			studenthomepo.getEleSubmitBtn().click();
			Thread.sleep(2000);
			studentSignInPo.elementStatus(studenthomepo.getEleEditBtn(),"The Edit Button", "displayed");
			Thread.sleep(4000);
			if(studenthomepo.getEleStudentProfileimage().getAttribute("src").contains("/learning/themes/notebook/images/logo.png"))
			{
				studentSignInPo.elementStatus(studenthomepo.getEleStudentProfileimage(),"The Student profile image is not", "displayed");
			}
				else{
				
					studentSignInPo.elementStatus(studenthomepo.getEleStudentProfileimage(),"The Student profile image is ", "not displayed");
				}
			//verify the image is removed in the homepage
			studenthomepo.getEleStudentProfilePhoto().click();
			Thread.sleep(4000);
			studentSignInPo.elementStatus(studenthomepo.getEleCancelBtn(),"The Cancel button ", "displayed");
			studentSignInPo.elementStatus(studenthomepo.getEleRemoveImageBtn(),"The Remove image button ", "displayed");
			if(studenthomepo.getEleRemoveImageBtn().isDisplayed()){
			studenthomepo.getEleRemoveImageBtn().click();
			if(studenthomepo.getEleStudentProfileimage().getAttribute("src").contains("/learning/themes/notebook/images/avatar_default.jpg"))
			{
				studentSignInPo.elementStatus(studenthomepo.getEleStudentProfileimage(),"The Student profile image is ", "displayed");
			}
				else{
				
					studentSignInPo.elementStatus(studenthomepo.getEleStudentProfileimage(),"The Student profile image is ", "not displayed");
				}
			}
			else{
				studentSignInPo.elementStatus(studenthomepo.getEleCancelBtn(),"The cancel button is ", "displayed");
				studenthomepo.getEleCancelBtn().click();
				studentSignInPo.elementStatus(studenthomepo.getEleStudentProfilePhoto(),"The Profile photo option", "displayed");
				
			}
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	/* 
	 * @Description:Changing Student Profile Password and login with change password','After Changing Password try to Login with old password'
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=12,enabled=false, description="Changing Student Profile Password and login with change password','After Changing Password try to Login with old password'")
	public void changeStudentProfilePwd(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(3000);
			studenthomepo.getEleProfileTextDropdown().click();
			Thread.sleep(3000);
			studenthomepo.getEleProfileOption().click();
			Thread.sleep(3000);
			studentSignInPo.elementStatus(studentprofilepo.getEleChangePwd(),"The Change password link", "displayed");
			studentprofilepo.getEleChangePwd().click();
			Thread.sleep(3000);
			studentSignInPo.elementStatus(studentprofilepo.getEleOldPasswordTextBox(),"The old password textfiled", "displayed");
			studentprofilepo.getEleOldPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			studentSignInPo.elementStatus(studentprofilepo.getEleNewPasswordTextBox(),"The new password textfiled", "displayed");
			studentprofilepo.getEleNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "NEWPASSWORD"));
			studentSignInPo.elementStatus(studentprofilepo.getEleConfirmNewPasswordTextBox(),"The confirm new password textfiled", "displayed");
			studentprofilepo.getEleConfirmNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "CONFIRMPASSWORD"));
			studentSignInPo.elementStatus(studentprofilepo.getEleUpdateButton(),"The update button", "displayed");
			studentprofilepo.getEleUpdateButton().click();
			studentSignInPo.elementStatus(driver.findElement(By.xpath("//p[@id='errMsg']")),"The verify message", "displayed");
			Thread.sleep(3000);
			studenthomepo.getEleProfileTextDropdown().click();
			Thread.sleep(4000);
			studenthomepo.getEleLogoutOption().click();
			//After Changing Password try to Login with old password Scenario
			Thread.sleep(3000);
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			studentSignInPo.elementStatus(studentSignInPo.getEleIncorrectUserPwd(),"The error message 'Incorrect username or password.' ", "displayed");
			Thread.sleep(3000);
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "NEWPASSWORD"));
			studentSignInPo.elementStatus(studenthomepo.getEleWelcomeText(),"the welcome message", "displayed");
			
			//clean up code 
			Thread.sleep(3000);
			studenthomepo.getEleProfileTextDropdown().click();
			Thread.sleep(4000);
			studenthomepo.getEleProfileOption().click();
			Thread.sleep(3000);
			studentprofilepo.getEleChangePwd().click();
			Thread.sleep(3000);
			studentprofilepo.getEleOldPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "NEWPASSWORD"));
			studentprofilepo.getEleNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			studentprofilepo.getEleConfirmNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			studentprofilepo.getEleUpdateButton().click();
			Thread.sleep(4000);
			}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase FAiled.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		
	}
	/* 
	 * @Description:verify the error message in the student profile page for invalid/blank password
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=4,enabled=false, description="verify the error message in the student profile page for invalid/blank password")
	public void verifyInvalidOldPwd(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(3000);
			studenthomepo.getEleProfileTextDropdown().click();
			Thread.sleep(3000);
			studenthomepo.getEleProfileOption().click();
			Thread.sleep(3000);
			studentprofilepo.getEleChangePwd().click();
			Thread.sleep(3000);
			studentprofilepo.getEleUpdateButton().click();
			studentSignInPo.elementStatus(studentprofilepo.getEeleValueRequiredErrMsg(),"The error message 'This value is required.'", "displayed");
			studentprofilepo.getEleOldPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "WRONGPASSWORD"));
			studentprofilepo.getEleNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "NEWPASSWORD"));
			studentprofilepo.getEleConfirmNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "CONFIRMPASSWORD"));
			studentprofilepo.getEleUpdateButton().click();
			Thread.sleep(4000);
			studentSignInPo.elementStatus(studentprofilepo.getEleInvalidOldPwdErrMsg(),"The error message 'Invalid Old password'", "displayed");
			Thread.sleep(4000);
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		
		
	}
	/* 
	 * @Description:Verify the functionality of 'Change Password' link after entering the values in  Old Password, New Password and confirm Password fields
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=5,enabled=false, description="Verify the functionality of 'Change Password' link after entering the values in  Old Password, New Password and confirm Password fields")
	public void functionalityofChangePassword(String browser) throws Exception{
		
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(4000);
			studenthomepo.getEleProfileTextDropdown().click();
			Thread.sleep(3000);
			studenthomepo.getEleProfileOption().click();
			Thread.sleep(3000);
			studentprofilepo.getEleChangePwd().click();
			Thread.sleep(3000);
			studentprofilepo.getEleOldPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "WRONGPASSWORD"));
			studentprofilepo.getEleNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "NEWPASSWORD"));
			Thread.sleep(3000);
			studentprofilepo.getEleConfirmNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "CONFIRMPASSWORD"));
			studentprofilepo.getEleChangePwd().click();
			studentprofilepo.getEleChangePwd().click();
			Thread.sleep(3000);
			studentprofilepo.getEleUpdateButton().click();
			Thread.sleep(3000);
			studentSignInPo.elementStatus(studentprofilepo.getEeleValueRequiredErrMsg(),"No value is present in the old password,new password and confirm password text field'", "displayed");
			
			
			
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		
	}
	/* 
	 * @Description:Verify the error messages that displayed when Invalid 'Email Id',Invalid 'Phone number' is entered
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=6,enabled=false, description=" Verify the error messages that displayed when Invalid 'Email Id',Invalid 'Phone number' is entered")
	public void invalidEmailidPhoneNumber(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(4000);
			studenthomepo.getEleProfileTextDropdown().click();
			Thread.sleep(3000);
			studenthomepo.getEleProfileOption().click();
			Thread.sleep(3000);
			studentprofilepo.getEleEmailIdTextBox().clear();
			Thread.sleep(3000);
			studentprofilepo.getElePhoneTextBox().clear();
			studentprofilepo.getEleEmailIdTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "FROM_PWD"));
			studentprofilepo.getElePhoneTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "FROM_PWD"));
			Thread.sleep(3000);
			studentprofilepo.getEleUpdateButton().click();
			Thread.sleep(3000);
			studentSignInPo.elementStatus(studentprofilepo.getEleEmailIdErrorMsg(),"The error 'This value should be a valid email.'", "displayed");
			studentSignInPo.elementStatus(studentprofilepo.getElePhoneNumberErrorMsg(),"The error 'This value should be a valid phone number.'", "displayed");
			
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	/* 
	 * @Description:Verify the error messages in the profile page
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=7,enabled=false, description="Verify the error messages in the profile page")
	public void errorMessageInProfile(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(4000);
			studenthomepo.getEleProfileTextDropdown().click();
			Thread.sleep(3000);
			studenthomepo.getEleProfileOption().click();
			Thread.sleep(3000);
			studentprofilepo.getEleChangePwd().click();
			studentprofilepo.getEleNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "InvalidPassword"));
			studentprofilepo.getEleConfirmNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "InvalidPassword"));
			studentprofilepo.getEleUpdateButton().click();
			//Verify This value is too short. It should have 6 characters or more error message is displayed.
			Thread.sleep(3000);
			studentSignInPo.elementStatus(studentprofilepo.getEleValueIsShortErrorMsg(),"This value is too short. It should have 6 characters or more.", "displayed");
			//Verify This value should be the same error message is displayed.
			Thread.sleep(3000);
			studentprofilepo.getEleConfirmNewPasswordTextBox().clear();
			studentprofilepo.getEleConfirmNewPasswordTextBox().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "NEWPASSWORD"));
			studentprofilepo.getEleUpdateButton().click();
			studentSignInPo.elementStatus(studentprofilepo.getEleValueShouldSameErrorMsg(),"This value should be the same", "displayed");
			//verify this This value is required. error message is displayed 
			studentprofilepo.getEleFirstNameTextBox().clear();
			studentprofilepo.getEleLastNameTextBox().clear();
			studentprofilepo.getEleEmailIdTextBox().clear();
			studentprofilepo.getElePhoneTextBox().clear();
			Thread.sleep(2000);
			studentprofilepo.getEleChangePwd().click();
			Thread.sleep(2000);
			studentprofilepo.getEleUpdateButton().click();
			Thread.sleep(2000);
			studentSignInPo.elementStatus(studentprofilepo.getEeleValueRequiredErrMsg(),"This value requried error message is displayed", "displayed");
			
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		
	}
	/* 
	 * @Description:Verify whether all the questions can be answered by clicking on 'Next' button,Verify  the functionality of 'prev' button,Verify the functionality of "Finish" button,Verify the functionality of Back button
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=8,enabled=false, description="Verify whether all the questions can be answered by clicking on 'Next' button,Verify  the functionality of 'prev' button,Verify the functionality of 'Finish' button,Verify the functionality of Back button")
	public void verifyPreAssessmentNextPrevBtn(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		studentcoursepo=new StudentCoursePo(driver);
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
			studentSignInPo.scrolldown();
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			studentcoursepo.getElePreAssessmentLink().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			studentSignInPo.handleStartTestbutton();
			 Thread.sleep(8000);
			elementStatus(studentcoursepo.getEleClass1PreAssessmentText(),"The Pre Assessment text is ", "displayed");
			 studentcoursepo.verifyNextPrevbutton();
			 studentSignInPo.elementStatus(studentcoursepo.getEleFinishText(),"finished text is displayed", "displayed");
			 studentSignInPo.elementStatus(studentcoursepo.getEleFinishbutton(),"finished button is displayed", "displayed");
			 studentSignInPo.elementStatus(studentcoursepo.getEleFinishInstruction(),"finished instruction is displayed", "displayed");
			 studentcoursepo.getEleFinishbutton().click();
			 studentSignInPo.elementStatus(studentcoursepo.getEleScoreText(),"Score text is displayed", "displayed");
			 studentSignInPo.elementStatus(studentcoursepo.getEleBackButton(),"Back button is displayed", "displayed");
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	/* 
	 * @Description:Verify whether all the questions can be answered by clicking on 'Next' button,Verify  the functionality of 'prev' button,Verify the functionality of "Finish" button,Verify the functionality of Back button
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=9,enabled=false, description="Verify whether all the questions can be answered by clicking on 'Next' button,Verify  the functionality of 'prev' button,Verify the functionality of 'Finish' button,Verify the functionality of Back button")
	public void verifyPostAssessmentNextPrevBtn(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		studentcoursepo=new StudentCoursePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(6000);
			studentcoursepo.getEleCourseTab().click();
			Thread.sleep(4000);	
			Select select=new Select(studentcoursepo.getEleClass());
			select.selectByIndex(0);
			Thread.sleep(4000);
			Select select1=new Select(studentcoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			studentcoursepo.getEleStartCourseButton().click();
			studentSignInPo.scrolldown();
			Thread.sleep(4000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			studentcoursepo.getElePostAssessmentLink().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			studentSignInPo.handleStartTestbutton();
			Thread.sleep(8000);
			 studentcoursepo.verifyNextPrevbutton();
			 studentSignInPo.elementStatus(studentcoursepo.getEleFinishText(),"finished text is displayed", "displayed");
			 studentSignInPo.elementStatus(studentcoursepo.getEleFinishbutton(),"finished button is displayed", "displayed");
			 studentSignInPo.elementStatus(studentcoursepo.getEleFinishInstruction(),"finished instruction is displayed", "displayed");
			 studentcoursepo.getEleFinishbutton().click();
			 studentSignInPo.elementStatus(studentcoursepo.getEleScoreText(),"Score text is displayed", "displayed");
			 studentSignInPo.elementStatus(studentcoursepo.getEleBackButton(),"Back button is displayed", "displayed");
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	/* 
	 * @Description:Verify the Message that appears when user click the start test button for the second button
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=10,enabled=false, description="Verify the Message that appears when user click the start test button for the second button")
	public void verifyPreAssessementError(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		studentcoursepo=new StudentCoursePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(6000);
			studentcoursepo.getEleCourseTab().click();
			Thread.sleep(4000);	
			Select select=new Select(studentcoursepo.getEleClass());
			select.selectByIndex(0);
			Thread.sleep(4000);
			Select select1=new Select(studentcoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			studentcoursepo.getEleStartCourseButton().click();
			studentSignInPo.scrolldown();
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			studentcoursepo.getElePreAssessmentLink().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			studentSignInPo.handleStartTestbutton();
			Thread.sleep(4000);
			 for(WebElement eleErrorMessage:studentcoursepo.getEleInstruction())
			{
				System.out.println(eleErrorMessage.getText());
				studentSignInPo.elementStatus(eleErrorMessage,"The timer value is ", "displayed");	
			}
			 Thread.sleep(4000);
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	/* 
	 * @Description:Verify the Message that appears when user click the start test button for the second button
	 * @Author:RaghuKiran
	 */
	@Parameters("browser")
	@Test(priority=11,enabled=false, description="Verify the Message that appears when user click the start test button for the second button")
	public void verifyPostAssessementError(String browser) throws Exception{
		studentSignInPo=new StudentSignInPo(driver);
		studenthomepo=new StudentHomePo(driver);
		studentprofilepo=new StudentProfilePo(driver);
		studentcoursepo=new StudentCoursePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
			Thread.sleep(6000);
			studentcoursepo.getEleCourseTab().click();
			Thread.sleep(4000);	
			Select select=new Select(studentcoursepo.getEleClass());
			select.selectByIndex(0);
			Thread.sleep(4000);
			Select select1=new Select(studentcoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			studentcoursepo.getEleStartCourseButton().click();
			studentSignInPo.scrolldown();
			Thread.sleep(4000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			studentcoursepo.getElePostAssessmentLink().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			studentSignInPo.handleStartTestbutton();
			Thread.sleep(4000);
			 for(WebElement eleErrorMessage:studentcoursepo.getEleInstruction())
			{
				System.out.println(eleErrorMessage.getText());
				studentSignInPo.elementStatus(eleErrorMessage,"The timer value is ", "displayed");	
			}
			 Thread.sleep(4000);
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
    @Test(priority=12, enabled=false,description="Start Course  on second page" )
    public void verifyGames(String browser) throws Exception
    {
        studentSignInPo=new StudentSignInPo(driver);
        studenthomepo=new StudentHomePo(driver);
        studentcoursepo=new StudentCoursePo(driver);
        try
        {
            loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
            studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile,"STUDENTLOGINIDFORGAMES"),GenericLib.getCongigValue(GenericLib.sConfigFile,"ADMINPASSWORD"));
            Thread.sleep(7000);
            studentcoursepo.getEleCourseTab().click();
            Thread.sleep(4000);
            Select selectClass=new Select(studentcoursepo.getEleClass());
            selectClass.selectByIndex(0);
            Thread.sleep(3000);
            Select selectCourse=new Select(studentcoursepo.getEleCourseSelected());
            selectCourse.selectByIndex(0);
            Thread.sleep(1000);
            studentcoursepo.getEleStartCourseButton().click();
            Thread.sleep(4000);
            studentSignInPo.scrolldown();
            Thread.sleep(4000);
            driver.switchTo().frame(0);
            Thread.sleep(2000);
          // studentcoursepo.verifySession(browser );
            System.out.println("statrted  verification of all sessions in the course ");
            List<WebElement> sessionCount=studentcoursepo.getEleSessionsCount();
            System.out.println("session count is "+ sessionCount.size());
             for(int i=0; i<=(3); i++)
             { 
                 if(!(sessionCount.get(i).getText().equals("Pre Assessment"))&&!(sessionCount.get(i).getText().equals("Mid-1 Assessment"))&&!(sessionCount.get(i).getText().equals("Mid-2 Assessment"))&&!(sessionCount.get(i).getText().equals("Post Assessment")))
                         {
                     
                                 System.out.println(" session number is  "  + i  );
                                 sessionCount.get(i).click();
                                 System.out.println("clicked on session  "+ sessionCount.get(i).getText());
                                
    	                         Thread.sleep(4000);
    	                         studentcoursepo.switchToLatestPopupWindow();
    	                         System.out.println("switched into session popup");
    	                         Thread.sleep(4000);
                                	System.out.println("game window is visible");
                                	studentcoursepo.getVisibilityOfGamePageElements();
                                	studentcoursepo.getPageStatus(studentcoursepo.getElePageCount(),studentcoursepo.getElePageTitle(),studentcoursepo.getElePageInstruction(), browser);
    	                            System.out.println("got the status of session ");
           
                         }
      
             }
           
             System.out.println("completed verification of all sessions in the course ");  
        }
        catch(AssertionError e)
        {
            NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
            throw e;
        }
    }
}
