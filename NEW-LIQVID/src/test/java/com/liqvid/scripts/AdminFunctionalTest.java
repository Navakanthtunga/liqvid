package com.liqvid.scripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;
import com.liqvid.library.BaseLib;
import com.liqvid.library.GenericLib;
import com.liqvid.po.AdminBatchReportPo;
import com.liqvid.po.AdminHomePo;
import com.liqvid.po.AdminProfilePagePo;
import com.liqvid.po.AdminRegConfirmPagePo;
import com.liqvid.po.AdminSignupPo;
import com.liqvid.po.CreateBatchPo;
import com.liqvid.po.DataBasePo;
import com.liqvid.po.ForgotPasswordPo;
import com.liqvid.po.LicensePO;
import com.liqvid.po.ResourcesPo;
import com.liqvid.po.StudentRegistrationPo;
import com.liqvid.po.StudentSignInPo;
import com.liqvid.po.StudentUploadPo;
import com.liqvid.po.SuccessfulRegisterationPo;
import com.liqvid.po.TeacherRegistrationPo;

public class AdminFunctionalTest extends BaseLib{
	StudentSignInPo studentSignInPo=null;
	AdminHomePo adminHomePo=null;
	CreateBatchPo createbatchpo=null;
	AdminBatchReportPo adminbatchreportpo=null;
	StudentUploadPo studentuploadpo=null;
	ResourcesPo resourcespo=null;
	TeacherRegistrationPo teacherregistrationpo=null;
	StudentRegistrationPo studentregisterationpo=null;
	SuccessfulRegisterationPo successfulregisterationpo=null;
	AdminProfilePagePo adminprofilepagepo=null;
	ForgotPasswordPo forgotpassword=null;
	LicensePO licensepo=null;
	AdminSignupPo adminSignupPo=null;
	AdminSignupPo adminsignuppo=null;
	AdminHomePo adminhomepo=null;
	AdminRegConfirmPagePo adminRegConfimPagePo=null;
	ForgotPasswordPo forgotPasswordPo=null;
	@Test(priority=1,enabled=true,description="Useless Test")
	public void sample() throws Throwable
	{
		System.out.println("******************");
	}
	@Test(priority=1,enabled=false,description=" Verify the error messages in Admin Signup Page, Verify the registartion process by entering valid License Key, Verify the error messages in Admin Signup Page, Verify Admin Signup process")
	public void validateLicense() throws Throwable
	{	
		licensepo=new LicensePO(driver);
		studentSignInPo=new StudentSignInPo(driver);
		adminsignuppo=new AdminSignupPo(driver);
		adminRegConfimPagePo=new AdminRegConfirmPagePo(driver);
		adminhomepo=new AdminHomePo(driver);
		try {
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONPAGEURL"));
			//loadURL(GenericLib.toReadExcelData(GenericLib.sTestDataFile, "Sheet1", "Tc_000_01", "URL"));
			Thread.sleep(5000);
			// To verify the elements in License Page  
			studentSignInPo.elementStatus(licensepo.getEleLogo(),"English Edge logo ","displayed");
			studentSignInPo.elementStatus(licensepo.getEleEnglishEdgeSetupText(),"English Edge Setup Text ","displayed");
			studentSignInPo.elementStatus(licensepo.getEleRegistrationHeading(),"Welcome to EnglishEdge registration process' text ","displayed");
			studentSignInPo.elementStatus(licensepo.getEleRegistrationInstructions(),"Instructions in registration page ","displayed");
			studentSignInPo.elementStatus(licensepo.getEleLicenseKeyText(),"License Key Text","displayed");
			studentSignInPo.elementStatus(licensepo.getEleLicenseKeyField(),"License Key field ","displayed");
			studentSignInPo.elementStatus(licensepo.getEleSubmitButton(),"Submit button ","displayed");
			studentSignInPo.elementStatus(licensepo.getEleCustomerSupportText(),"Customer Support text ","displayed");
			studentSignInPo.elementStatus(licensepo.getEleCustomerCareContactDetails(),"Customer Care Contact details ","displayed");
			studentSignInPo.elementStatus(licensepo.getEleCustomerCareEmailId(),"Customer Care Email Id ","displayed");
			studentSignInPo.elementStatus(licensepo.getEleEnglishEdgeWebsitelink(),"English edge website link ","displayed");
			studentSignInPo.elementStatus(licensepo.getEleEnglishEdgeWebsitelinkFooter(),"English edge website link at the Footer ","displayed");
			Thread.sleep(20000);
			// To verify 'This value is required.' error message
			licensepo.getEleSubmitButton().click();
			// To verify 'This value is too short. It should have 6 characters or more.' error message
			licensepo.getEleLicenseKeyField().sendKeys("456");
			Thread.sleep(20000);
			licensepo.getEleSubmitButton().click();
			Thread.sleep(1000);
			studentSignInPo.elementStatus(licensepo.getEleErrMsg(),"This value is too short error message ","displayed");
			// To verify the alert when an Invalid license key is passed
			licensepo.getEleLicenseKeyField().sendKeys("45789d6"); //976799 
			Thread.sleep(20000);
			licensepo.getEleSubmitButton().click();
			Thread.sleep(4000);
			studentSignInPo.elementStatus(licensepo.getEleAlert(),"Alert ","displayed");
			studentSignInPo.elementStatus(licensepo.getEleCloseAlert(),"Close icon of alert ","displayed");
			Thread.sleep(20000);
			// To close the alert
			licensepo.getEleCloseAlert().click();
			// To pass valid license key
			licensepo.getEleLicenseKeyField().sendKeys("4BE1C3"); 
			Thread.sleep(20000);
			licensepo.getEleSubmitButton().click();
			Thread.sleep(20000);
			// Admin SIgnUp 
			studentSignInPo.elementStatus(adminsignuppo.getEleSignUpText(),"Sign-Up page should be ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleEnglishEdgeSetupText(),"'English Edge' Setup Text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleEnglishEdgeLogo(),"English Edge Logo ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleSignUpText(),"'Sign-up' text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleCenterNameText(),"Center Name text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleCenterField(),"Center Name Field","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleCenterAddressText(),"Center Address text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleCenterAddressField(),"Center Address Field ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleCountryText(),"Country  text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleCountryDropDown(),"DropDown ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleStateText(),"'State' text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleStateDropDown(),"'State' dropdown ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleCityText(),"'City' text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleCityDropDown(),"City Dropdown ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getElePincodeText(),"'PinCode' text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getElePincodeField(),"'PinCode' Field ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleAdminNameText(),"'Administrator Name' text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleAdminNameField(),"'Administrator Name' Field ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleEmailIDText(),"'Email ID' text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleEmailIdField(),"'Email ID' Field","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleEmailIdInstruction(),"'(Admin login credentials will be sent to this Email ID.)' Instruction ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleMobileNumText(),"'Mobile Number' text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleMobileNumField(),"'Mobile Number' Field ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleMobileNumInstruction(),"'(Admin login credentials will be sent to this Mobile Number.)' Instruction ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleContactNumText(),"Contact Number text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleContactNumField(),"Contact Number Field ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleContactNumInstruction(),"'(Enter landline number with STD code.)' Instruction  ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleCustomerSupportText(),"Customer Support text ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleCustomerCareContactDetails(),"Customer Care Contact details ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleCustomerCareEmailId(),"Customer Care Email Id ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleEnglishEdgeWebsitelink(),"English edge website link ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleCopyRightsText(),"CopyRights ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleEnglishEdgeWebsitelinkFooter(),"License Key field ","displayed");
			studentSignInPo.elementStatus(adminsignuppo.getEleSubmitButt(),"Customer Care Contact details ","displayed");
			Thread.sleep(20000);
			adminsignuppo.getEleSubmitButt().click();
			Thread.sleep(25000);
			// To verify 'This value is required.' Error message
			studentSignInPo.elementStatus(adminsignuppo.getEleValueReqErrMsg(),"'This value is required.' Error message ","displayed");
			adminsignuppo.getEleCenterField().sendKeys("@#$%");
			studentSignInPo.elementStatus(adminsignuppo.getAlphaOrAlphanumericErrMsg(),"'Value should be alpha/alphanumeric' Error message","displayed");
			adminsignuppo.getElePincodeField().sendKeys("*******");
			studentSignInPo.elementStatus(adminsignuppo.getEleInValidPincodeErrMsg(),"'This value should be digits.' Error message","displayed");
			adminsignuppo.getEleEmailIdField().sendKeys("gkdjasghkjghfkjghdf");
			studentSignInPo.elementStatus(adminsignuppo.getEleInValidEmailErrMsg(),"'This value should be a valid email.' Error message","displayed");
			adminsignuppo.getEleMobileNumField().sendKeys("asdfghjklm");
			adminsignuppo.getEleContactNumField().sendKeys("asdfghjklm");
			studentSignInPo.elementStatus(adminsignuppo.getEleInValidPhoneNumErrMsg(),"'This value should be a valid phone number.' Error message","displayed");
			adminsignuppo.getEleCenterField().clear();
			adminsignuppo.getElePincodeField().clear();
			adminsignuppo.getEleEmailIdField().clear();
			adminsignuppo.getEleMobileNumField().clear();
			adminsignuppo.getEleContactNumField().clear();
			adminsignuppo.getEleCenterField().sendKeys("The Oxford College Of Engineering");
			adminsignuppo.getEleCenterAddressField().sendKeys("10th Milestone, Hosur Rd");
			Thread.sleep(10000);
			adminhomepo.selectbyvisibletext(adminsignuppo.getEleCountryDropDown(),"India");
			Thread.sleep(8000);
			adminhomepo.selectbyvisibletext(adminsignuppo.getEleStateDropDown(),"KARNATAKA");
			Thread.sleep(8000);
			adminhomepo.selectbyvisibletext(adminsignuppo.getEleCityDropDown(),"BANGALORE URBAN DISTRICT");
			Thread.sleep(5000);
			adminsignuppo.getElePincodeField().sendKeys("560068");
			adminsignuppo.getEleAdminNameField().sendKeys("Navakanth");
			adminsignuppo.getEleEmailIdField().sendKeys("navakanthtunga@gmail.com");
			adminsignuppo.getEleMobileNumField().sendKeys("8550875759");
			adminsignuppo.getEleContactNumField().sendKeys("8550875759");
			Thread.sleep(30000);
			adminsignuppo.getEleSubmitButt().click();
			Thread.sleep(5000);
			studentSignInPo.elementStatus(adminRegConfimPagePo.getEleRegEmailId(),"To identify Email ID","displayed");
		    String expectedId = adminRegConfimPagePo.getEleRegEmailId().getText();
		    if(GenericLib.getCongigValue(GenericLib.sConfigFile,"FORGOTPASSWORDLOGINID").equalsIgnoreCase(expectedId))
		    {
		    	studentSignInPo.elementStatus(adminRegConfimPagePo.getEleRegEmailId(),"Email ID is","displayed");	
		    }
		    else
		    {
		    	studentSignInPo.elementStatus(adminsignuppo.getEleInValidEmailErrMsg(),"Invalid Email ID is","displayed");	 
		    }
		    String expectedPhoneno = adminRegConfimPagePo.getEleRegMobileNum().getText();
		    if(GenericLib.getCongigValue(GenericLib.sConfigFile,"ADMINPHONENO").equalsIgnoreCase(expectedPhoneno))
		    {
		    	studentSignInPo.elementStatus(adminRegConfimPagePo.getEleRegMobileNum(),"Mobile Number is","displayed");	
		    }
		    else
		    {
		    	studentSignInPo.elementStatus(adminsignuppo.getEleInValidPhoneNumErrMsg(),"Invalid phone no is","displayed");	 	
		    }
		    adminRegConfimPagePo.getEleNextButt();
		    LoginGmail();
			Thread.sleep(5000);
		} 
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=2,enabled=false,description="verify 'click here' link functionality and resend admin credential")
	public void credential() throws Exception
	{
		licensepo=new LicensePO(driver);
		studentSignInPo=new StudentSignInPo(driver);
		adminsignuppo=new AdminSignupPo(driver);
		adminRegConfimPagePo=new AdminRegConfirmPagePo(driver);
		forgotPasswordPo=new ForgotPasswordPo(driver);
		adminhomepo=new AdminHomePo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile,"REGESTARTIONCONFIRMATION"));
			studentSignInPo.elementStatus(adminsignuppo.getEleEnglishEdgeSetupText(),"'English Edge' Setup Text ","displayed");
			studentSignInPo.elementStatus(adminRegConfimPagePo.getEleLogo(),"English edge logo is","displayed");
		    System.out.println(adminRegConfimPagePo.getEleListConfirmationInstr().getText());
		    Thread.sleep(10000);
		    adminRegConfimPagePo.getEleClickhereLink().click();
		    Thread.sleep(5000);
		    adminRegConfimPagePo.getEleCloseIcon().click();
		    Thread.sleep(5000);
		    adminRegConfimPagePo.getEleClickhereLink().click();
		    Thread.sleep(5000);
		    studentSignInPo.elementStatus(adminRegConfimPagePo.getEleResetPage(),"Reset page is","displayed");
		    studentSignInPo.elementStatus(adminRegConfimPagePo.getElePageTitle()," page title is","displayed");
		    studentSignInPo.elementStatus(adminRegConfimPagePo.getEleStep1Text()," step 1 is","displayed");
		    studentSignInPo.elementStatus(adminRegConfimPagePo.getEleStep1Instr()," step 1 instruction is","displayed");
		    studentSignInPo.elementStatus(adminRegConfimPagePo.getEleCustomerCareEmailId(),"cuctomecare mailid is","displayed");
		    studentSignInPo.elementStatus(adminRegConfimPagePo.getEleStep2Text(),"step 2 is","displayed");
		    Thread.sleep(5000);
		    adminRegConfimPagePo.getEleClickHereResendPwd().click();
		    LoginGmail();
		    Thread.sleep(10000);
		    loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile,"REGESTARTIONCONFIRMATION"));
		    studentSignInPo.elementStatus(adminRegConfimPagePo.getEleAlert(),"credential has send to email/mobile meassage is","displayed");
		    Thread.sleep(5000);
		    adminRegConfimPagePo.getEleClickhereLink().click();
		    Thread.sleep(5000);
		    adminRegConfimPagePo.getEleClickHereUpdateEmailIDorPwd().click();
		    Thread.sleep(10000);
		    studentSignInPo.elementStatus(adminRegConfimPagePo.getEleResetMobileorEmailPage(),"Reset Email/Mobile page is","displayed");
		    studentSignInPo.elementStatus(adminRegConfimPagePo.getEleEmailText()," email text is","displayed");
		    adminRegConfimPagePo.getEleResetEmailField().clear();
		    adminRegConfimPagePo.getEleResetEmailField().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile,"FORGOTPASSWORDLOGINID"));
		    studentSignInPo.elementStatus(adminRegConfimPagePo.getEleMobiletext(),"phone number text is","displayed");
		    adminRegConfimPagePo.getEleResetMobileField().clear();
		    adminRegConfimPagePo.getEleResetMobileField().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile,"ADMINPHONENO"));
		    Thread.sleep(5000);
		    adminRegConfimPagePo.getEleCloseButton().click();
		    Thread.sleep(5000);
		    adminRegConfimPagePo.getEleClickhereLink().click();
		    Thread.sleep(5000);
		    adminRegConfimPagePo.getEleClickHereUpdateEmailIDorPwd().click();
		    Thread.sleep(5000);
		    adminRegConfimPagePo.getEleResetEmailField().clear();
		    adminRegConfimPagePo.getEleResetEmailField().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile,"FORGOTPASSWORDLOGINID"));
		    Thread.sleep(5000);
		    adminRegConfimPagePo.getEleResetMobileField().clear();
		    adminRegConfimPagePo.getEleResetMobileField().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile,"ADMINPHONENO"));
		    Thread.sleep(10000);
		    adminRegConfimPagePo.getEleSubmitButton().click();
		    Thread.sleep(10000);
		    adminRegConfimPagePo.getEleNextButt().click();
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=3,enabled=false,description="Verify the error when user launches the application from different mac-address")
	public void launchAppFromDifferentmacAddress(String browser) throws Throwable
	{   
		studentSignInPo=new StudentSignInPo(driver);
		databasepo=new DataBasePo(driver);
		String defaultmacValue;
		String newmacvalue;
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataBaseURL"));
			Thread.sleep(2000);
			databasepo.databaseLogin(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataUsername"),GenericLib.getCongigValue(GenericLib.sConfigFile, "DataPassword"));
			Thread.sleep(2000);
			databasepo.getMacAddress();
			Thread.sleep(2000);
			studentSignInPo.elementStatus(databasepo.getEleCenterMacFld(),"Mac Address in center Settings table ", "displayed");
			defaultmacValue=databasepo.getEleCenterMacFld().getAttribute("value");
			newmacvalue=defaultmacValue+"123";
			databasepo.getEleCenterMacFld().clear();
			databasepo.getEleCenterMacFld().sendKeys(newmacvalue);
			databasepo.getEleYesBtn().click();
			databasepo.databaseLogout();
			Thread.sleep(2000);
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			NXGReports.addStep("Application is redirected to "+driver.getCurrentUrl(), LogAs.PASSED,null);
			studentSignInPo.elementStatus(studentSignInPo.getEleInvalidMacErrMsg(),"'OOPS!'Unauthorized Access ", "displayed");
			Thread.sleep(2000);
			// clean up code  
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataBaseURL"));
			Thread.sleep(2000);
			databasepo.getEleUserNameTxtFld().clear();
			databasepo.databaseLogin(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataUsername"),GenericLib.getCongigValue(GenericLib.sConfigFile, "DataPassword"));
			Thread.sleep(2000);
			databasepo.getMacAddress();
			Thread.sleep(2000);
			databasepo.getEleCenterMacFld().clear();
			databasepo.getEleCenterMacFld().sendKeys(defaultmacValue);
			databasepo.getEleYesBtn().click();
			databasepo.databaseLogout();
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}		
	}
	@Parameters("browser")
	@Test(priority=4,enabled=false,description="Verify the error when user launches the application without internet connection. ")
	public void launchAppWithoutInternet(String browser) throws Throwable
	{   
		studentSignInPo=new StudentSignInPo(driver);
		databasepo=new DataBasePo(driver);
		String ipAddressVal;
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataBaseURL"));
			Thread.sleep(2000);
			databasepo.databaseLogin(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataUsername"),GenericLib.getCongigValue(GenericLib.sConfigFile, "DataPassword"));
			Thread.sleep(2000);
			databasepo.getMacAddress();
			Thread.sleep(2000);
			studentSignInPo.elementStatus(databasepo.getEleCenterIPFld(),"IP Address in center Settings table ", "displayed");
			ipAddressVal=databasepo.getEleCenterIPFld().getAttribute("value");
			System.out.println(ipAddressVal);
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}		
	}
	@Parameters("browser")
	@Test(priority=5,enabled=false,description="Stop the Server, Verify the error when user launches the application.")
	public void launchAppWithoutServer(String browser) throws Throwable
	{   
		studentSignInPo=new StudentSignInPo(driver);
		licensepo=new LicensePO(driver);
		String englishedgeexeFilepath=GenericLib.sDirPath+"\\resources\\controlServer\\runenglishedge.exe";
		String stopServerexeFilepath=GenericLib.sDirPath+"\\resources\\controlServer\\CloseApache.exe";
		try
		{
		Runtime.getRuntime().exec(englishedgeexeFilepath);	
		Thread.sleep(30000);
		Runtime.getRuntime().exec(stopServerexeFilepath);
		Thread.sleep(5000);
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONPAGEURL"));
		studentSignInPo.elementStatus(licensepo.getEleLicenseKeyField(),"License Key field ","displayed");		
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}		
	}
	@Parameters("browser")
	@Test(priority=6,enabled=false,description="Relaunching the Server")
	public void reLaunchServer(String browser) throws Throwable
	{   
		studentSignInPo=new StudentSignInPo(driver);
		licensepo=new LicensePO(driver);
		String englishedgeexeFilepath=GenericLib.sDirPath+"\\resources\\controlServer\\runenglishedge.exe";
		String closeServerexeFilepath=GenericLib.sDirPath+"\\resources\\controlServer\\Closeuwamp.exe";
		try
		{
			Runtime.getRuntime().exec(closeServerexeFilepath);
			Thread.sleep(10000);
			Runtime.getRuntime().exec(englishedgeexeFilepath);	
			Thread.sleep(30000);;
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONPAGEURL"));
			studentSignInPo.elementStatus(licensepo.getEleLicenseKeyField(),"License Key field ","displayed");	
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}	
	}	
	@Parameters("browser")
	@Test(priority=7,enabled=false,description="Verify Teacher registration with valid details for one section and class")
	public void teacherRegistration(String browser) throws Throwable
	{
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		teacherregistrationpo=new TeacherRegistrationPo(driver);
		studentregisterationpo= new StudentRegistrationPo(driver);
		successfulregisterationpo= new SuccessfulRegisterationPo(driver);
		String defaultTeacherTxt=null;
		String actualTeacherTxt=null;
		try {
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(5000);	
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(8000);
			studentSignInPo.elementStatus(adminHomePo.getEleTeachersCount(),"Teachers count","displayed");
			defaultTeacherTxt=adminHomePo.getEleTeachersCount().getText();
			int defaultTeacherCnt=adminHomePo.convertToInteger(defaultTeacherTxt);
			NXGReports.addStep("Teacher Count Before creating a new teacher in Admin Home page is "+ defaultTeacherCnt, LogAs.PASSED, null);
			adminHomePo.getEleSignOutText().click();
			Thread.sleep(4000);
			studentSignInPo.getEleRegisterBtn().click();
			Thread.sleep(5000);	
			studentSignInPo.elementStatus(teacherregistrationpo.getEleTeacherTab(),"'Teacher' Tab ","displayed");
			teacherregistrationpo.getEleFirstName().sendKeys("Teacher");
			teacherregistrationpo.getElelastName().sendKeys("t1");
			teacherregistrationpo.getEleEmailId().sendKeys("navakanthtunga@gmail.com");
			teacherregistrationpo.getEleMobileNum().sendKeys("8550875759");
			teacherregistrationpo.getEleDobField().click();
			teacherregistrationpo.SelectDateOfBirth(1992, "Jun",13);
			adminHomePo.selectbyvisibletext(teacherregistrationpo.getEleGenderSelect(), "Male");
			teacherregistrationpo.getElePassword().sendKeys("raghukiran92");
			teacherregistrationpo.getEleConfirmPassword().sendKeys("raghukiran92");
			adminHomePo.selectbyindexvalue(teacherregistrationpo.getEleClassSelectDropdown1(), 1);
			Thread.sleep(2000);
			adminHomePo.selectbyindexvalue(teacherregistrationpo.getEleSectionSelectDropdown1(), 1);
			teacherregistrationpo.getEleSignUpButt().click();
			Thread.sleep(2000);
			NXGReports.addStep(" New Teacher is created ", LogAs.PASSED, null);
			studentSignInPo.elementStatus(successfulregisterationpo.getEleSucessfullyRegisteredMsg(),"'You have successfully registered !!!' ","displayed");
			studentSignInPo.elementStatus(successfulregisterationpo.getEleRegLoginId(),"New teacher 'Login Id' ","displayed");
			System.out.println(successfulregisterationpo.getEleRegLoginId().getText());
			String regLoginID=successfulregisterationpo.getEleRegLoginId().getText();
			studentSignInPo.elementStatus(successfulregisterationpo.getEleRegPassword(),"New teacher 'Password' ","displayed");
			System.out.println(successfulregisterationpo.getEleRegPassword().getText());
			String regPassword=successfulregisterationpo.getEleRegPassword().getText();
			studentSignInPo.elementStatus(successfulregisterationpo.getEleClickHereText(),"'Click Here to Login' text ","displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleEnglishEdgeWebLink(),"'English Edge Website Link' ","displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleCopyRights(),"'CopyRights' ","displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleCodeVersionDateText(),"'Code''Version' 'Date' ","displayed");
			Thread.sleep(5000);
			successfulregisterationpo.getEleClickHereLink().click();
			Thread.sleep(5000);
			studentSignInPo.getEleUserNameTextField().sendKeys(successfulregisterationpo.getvalue(regLoginID, 11));
			studentSignInPo.getElePasswordTextFiled().sendKeys(successfulregisterationpo.getvalue(regPassword, 11));
			//studentSignInPo.getEleSignInBtn().click();
			Thread.sleep(3000);
			// To verify the count in Admin home page
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(8000);
			studentSignInPo.elementStatus(adminHomePo.getEleTeachersCount(),"Teachers count","displayed");
			actualTeacherTxt=adminHomePo.getEleTeachersCount().getText();
			int actualteacherCnt=adminHomePo.convertToInteger(actualTeacherTxt);
			if(actualteacherCnt-defaultTeacherCnt==1){
				NXGReports.addStep("Teacher Count after creating new teacher in Admin Home page is "+ actualteacherCnt, LogAs.PASSED, null);
			}
			else{
				NXGReports.addStep("Teacher Count is not updated correctly in Admin Home page, The count is "+actualteacherCnt, LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
		} catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=8,enabled=false,description="Verify the count of Teachers in the admin home page by deleting the Teacher from  Database")
	public void verifyTeacherCount(String browser) throws Throwable
	{   
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		databasepo=new DataBasePo(driver);
		String defaultTeacherTxt;
		String actualTeacherTxt;
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(20000);
			defaultTeacherTxt=adminHomePo.getEleTeachersCount().getText();
			int defaultTeacherCnt=adminHomePo.convertToInteger(defaultTeacherTxt);
			NXGReports.addStep("The teachers count in Admin Home page is : "+defaultTeacherCnt, LogAs.PASSED, null);
			Thread.sleep(5000);
			adminHomePo.getEleSignOutText().click();
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataBaseURL"));
			Thread.sleep(2000);
			databasepo.databaseLogin(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataUsername"),GenericLib.getCongigValue(GenericLib.sConfigFile, "DataPassword"));
			Thread.sleep(2000);
			databasepo.deleteFromDB();
			NXGReports.addStep("Deleted a teacher from Database", LogAs.PASSED, null);
			Thread.sleep(3000);
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(20000);
			actualTeacherTxt=adminHomePo.getEleTeachersCount().getText();
			int actualTeacherCnt=adminHomePo.convertToInteger(actualTeacherTxt);
			NXGReports.addStep("The teachers count in Admin Home page after deleting a teacher from database is : "+defaultTeacherCnt, LogAs.PASSED, null);
			if(actualTeacherCnt==defaultTeacherCnt){
				NXGReports.addStep("No of Teachers Count in Admin Home page is not decreasing after deleting a Teacher from Database.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}		
	}
	@Parameters("browser")
	@Test(priority=9,enabled=false,description="Verify all the error messages in the teacher registration page")
	public void teacherErrorMessages(String browser) throws Throwable
	{
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		teacherregistrationpo=new TeacherRegistrationPo(driver);
		studentregisterationpo= new StudentRegistrationPo(driver);
		successfulregisterationpo= new SuccessfulRegisterationPo(driver);
		try {
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(5000);	
			studentSignInPo.getEleRegisterBtn().click();
			Thread.sleep(5000);	
			studentSignInPo.elementStatus(teacherregistrationpo.getEleTeacherTab(),"'Teacher' Tab ","displayed");
			Thread.sleep(2000);
			// To verify 'This value is required.' Error message
			teacherregistrationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(teacherregistrationpo.getEleValueReqErrMsg(),"'This value is required.' Error message ","displayed");
			// To verify 'Value should be alpha/alphanumeric'
			teacherregistrationpo.getEleFirstName().sendKeys("123");
			teacherregistrationpo.getElelastName().sendKeys("!@#$");
			teacherregistrationpo.getEleSignUpButt().click();
			Thread.sleep(1000);
			studentSignInPo.elementStatus(teacherregistrationpo.getAlphaOrAlphanumericErrMsg(),"'Value should be alpha/alphanumeric' Error message ","displayed");
			teacherregistrationpo.getEleFirstName().clear();
			teacherregistrationpo.getElelastName().clear();
			// To verify 'This value should be a valid email.' error message 
			teacherregistrationpo.getEleEmailId().sendKeys("navakanthtunga@gmailcom");
			Thread.sleep(1000);
			teacherregistrationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(teacherregistrationpo.getEleInValidEmailErrMsg(),"'This value should be a valid email.' Error message ","displayed");
			Thread.sleep(2000);
			teacherregistrationpo.getEleEmailId().clear();
			// To verify 'Mobile number should not be 0' error message
			teacherregistrationpo.getEleMobileNum().sendKeys("0000000000");
			teacherregistrationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(teacherregistrationpo.getEleInValidPhoneNumErrMsg2(),"'Mobile number should not be 0' error message ","displayed");
			Thread.sleep(2000);
			// To verify 'This value should be a valid phone number.' error message
			teacherregistrationpo.getEleMobileNum().clear();
			teacherregistrationpo.getEleMobileNum().sendKeys("9*9*9*9*9*");
			teacherregistrationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(teacherregistrationpo.getEleInValidPhoneNumErrMsg1(),"'This value should be a valid phone number.' error message ","displayed");
			Thread.sleep(2000);
			// To verify 'This value is too short. It should have 6 characters or more.' error message
			teacherregistrationpo.getElePassword().sendKeys("raghu");
			teacherregistrationpo.getEleConfirmPassword().sendKeys("raghu");
			teacherregistrationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(teacherregistrationpo.getEleValueIsShortErrorMsg(),"'This value is too short. It should have 6 characters or more.' error message ","displayed");
			Thread.sleep(2000);
			// To verify 'This value should be the same.' error message
			teacherregistrationpo.getElePassword().clear();
			teacherregistrationpo.getEleConfirmPassword().clear();
			teacherregistrationpo.getElePassword().sendKeys("raghukiran");
			teacherregistrationpo.getEleConfirmPassword().sendKeys("raghu");
			teacherregistrationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(teacherregistrationpo.getEleValueShouldSameErrorMsg(),"'This value should be the same.' error message ","displayed");
			Thread.sleep(2000);
			// To verify 'This value should be alphanumeric.' error message
			teacherregistrationpo.getElePassword().clear();
			teacherregistrationpo.getEleConfirmPassword().clear();
			teacherregistrationpo.getElePassword().sendKeys("test123@");
			teacherregistrationpo.getEleConfirmPassword().sendKeys("test123@");
			teacherregistrationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(teacherregistrationpo.getEleAlphaNumericErrMsg(),"'This value should be alphanumeric.' error message ","displayed");
		} catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}	
	@Parameters("browser")
	@Test(priority=10,enabled=false,description="Click on Add button, Verify the functionality of remove button and Verify 'This value is required.'error messages at newely added classes and sections in the teacher registration page")
	public void teacherRegistrationForMulitpleBatches(String browser) throws Throwable
	{
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		teacherregistrationpo=new TeacherRegistrationPo(driver);
		studentregisterationpo= new StudentRegistrationPo(driver);
		successfulregisterationpo= new SuccessfulRegisterationPo(driver);
		try {
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(5000);	
			studentSignInPo.getEleRegisterBtn().click();
			Thread.sleep(5000);	
			studentSignInPo.elementStatus(teacherregistrationpo.getEleTeacherTab(),"'Teacher' Tab ","displayed");
			Thread.sleep(2000);		
			studentSignInPo.elementStatus(teacherregistrationpo.getEleAddButt(),"Add button ","displayed");
			for(int i=0;i<=3;i++){
			teacherregistrationpo.getEleAddButt().click();
			}
			// To verify 'This value is required.' Error message
			teacherregistrationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(teacherregistrationpo.getEleValueReqErrMsg(),"'This value is required.' Error message ","displayed");
			Thread.sleep(2000);
			studentSignInPo.elementStatus(teacherregistrationpo.getEleRemoveButton(),"Remove button ","displayed");
			for(int i=0;i<=3;i++){
			teacherregistrationpo.getEleRemoveButton().click();
			}
			// Teacher registration with valid details for multiple sections, classes.
			teacherregistrationpo.getEleFirstName().sendKeys("Teacher");
			teacherregistrationpo.getElelastName().sendKeys("t1");
			teacherregistrationpo.getEleEmailId().sendKeys("navakanthtunga@gmail.com");
			teacherregistrationpo.getEleMobileNum().sendKeys("8550875759");
			teacherregistrationpo.getEleDobField().click();
			teacherregistrationpo.SelectDateOfBirth(1992, "Jun",13);
			adminHomePo.selectbyvisibletext(teacherregistrationpo.getEleGenderSelect(), "Male");
			teacherregistrationpo.getElePassword().sendKeys("raghukiran92");
			teacherregistrationpo.getEleConfirmPassword().sendKeys("raghukiran9");
			adminHomePo.selectbyindexvalue(teacherregistrationpo.getEleClassSelectDropdown1(), 1);
			Thread.sleep(2000);
			adminHomePo.selectbyindexvalue(teacherregistrationpo.getEleSectionSelectDropdown1(), 1);
			for(int i=0;i<=1;i++){
				teacherregistrationpo.getEleAddButt().click();
				}
			adminHomePo.selectbyindexvalue(teacherregistrationpo.getEleClassSelectDropdown2(), 1);
			Thread.sleep(2000);
			adminHomePo.selectbyindexvalue(teacherregistrationpo.getEleSectionSelectDropdown2(), 1);
			Thread.sleep(2000);
			adminHomePo.selectbyindexvalue(teacherregistrationpo.getEleClassSelectDropdown3(), 1);
			Thread.sleep(2000);
			adminHomePo.selectbyindexvalue(teacherregistrationpo.getEleSectionSelectDropdown3(), 1);
			teacherregistrationpo.getEleSignUpButt().click();
		} catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		}	
	@Parameters("browser")
	@Test(priority=11,enabled=false,description="Verify students registration with valid mobile number and valid details, and login with the credentials")
	public void studentRegistrationWithMobileNumber(String browser) throws Throwable{	
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		teacherregistrationpo=new TeacherRegistrationPo(driver);
		studentregisterationpo= new StudentRegistrationPo(driver);
		successfulregisterationpo= new SuccessfulRegisterationPo(driver);
		String defaultStudentTxt=null;
		String actualStudentTxt=null;
		try {
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(5000);	
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(8000);
			// To get the Student count in Admin home page.
			studentSignInPo.elementStatus(adminHomePo.getEleStudentsCount(),"Student count","displayed");
			defaultStudentTxt=adminHomePo.getEleTeachersCount().getText();
			int defaultStudentCnt=adminHomePo.convertToInteger(defaultStudentTxt);
			NXGReports.addStep("Student Count Before creating a new Student in Admin Home page is "+ defaultStudentCnt, LogAs.PASSED, null);
			adminHomePo.getEleSignOutText().click();
			Thread.sleep(4000);
			studentSignInPo.getEleRegisterBtn().click();
			Thread.sleep(5000);	
			studentSignInPo.elementStatus(studentregisterationpo.getEleStudentTab(),"'Student' Tab   ","displayed");
			studentregisterationpo.getEleStudentTab().click();
			studentregisterationpo.getEleFirstName().sendKeys("Student");
			studentregisterationpo.getElelastName().sendKeys("s2");
			studentregisterationpo.getEleEmailId().sendKeys("navakanthtunga@gmail.com");
			studentregisterationpo.getEleMobileNum().sendKeys("8550875759");
			Thread.sleep(2000);
			studentregisterationpo.getEleDobField().click();
			teacherregistrationpo.SelectDateOfBirth(1992, "Jun",13);
			adminHomePo.selectbyvisibletext(studentregisterationpo.getEleGenderSelect(), "Male");
			studentregisterationpo.getElePassword().sendKeys("raghukiran92");
			studentregisterationpo.getEleConfirmPassword().sendKeys("raghukiran92");
			adminHomePo.selectbyindexvalue(studentregisterationpo.getEleClassSelectDropdown(), 1);
			Thread.sleep(5000);
			adminHomePo.selectbyindexvalue(studentregisterationpo.getEleSectionSelectDropdown(), 1);
			Thread.sleep(5000);
			studentregisterationpo.getEleSignUpButt().click();
			Thread.sleep(5000);
			// To verify Registration confirmation 
			studentSignInPo.elementStatus(successfulregisterationpo.getEleSucessfullyRegisteredMsg(),"'You have successfully registered !!!' ","displayed");
			studentSignInPo.elementStatus(successfulregisterationpo.getEleRegLoginId(),"'Login Id' ","displayed");
			System.out.println(successfulregisterationpo.getEleRegLoginId().getText());
			String regLoginID=successfulregisterationpo.getEleRegLoginId().getText();
			studentSignInPo.elementStatus(successfulregisterationpo.getEleRegPassword(),"'Password' ","displayed");
			System.out.println(successfulregisterationpo.getEleRegPassword().getText());
			String regPassword=successfulregisterationpo.getEleRegPassword().getText();
			studentSignInPo.elementStatus(successfulregisterationpo.getEleClickHereText(),"'Click Here to Login' text ","displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleEnglishEdgeWebLink(),"'English Edge Website Link' ","displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleCopyRights(),"'CopyRights' ","displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleCodeVersionDateText(),"'Code''Version' 'Date' ","displayed");
			Thread.sleep(5000);
			successfulregisterationpo.getEleClickHereLink().click();
			Thread.sleep(15000);
			// To login with registered credentials
			studentSignInPo.getEleUserNameTextField().sendKeys(successfulregisterationpo.getvalue(regLoginID, 11));
			studentSignInPo.getElePasswordTextFiled().sendKeys(successfulregisterationpo.getvalue(regPassword, 11));
			// To verify the Student count in Admin home page
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(8000);
			studentSignInPo.elementStatus(adminHomePo.getEleStudentsCount(),"Student  count","displayed");
			actualStudentTxt=adminHomePo.getEleStudentsCount().getText();
			int actualStudentCnt=adminHomePo.convertToInteger(actualStudentTxt);
			if(actualStudentCnt-defaultStudentCnt==1){
				NXGReports.addStep("Student Count after creating new Student in Admin Home page is "+ actualStudentCnt, LogAs.PASSED, null);
			}
			else{
				NXGReports.addStep("Student Count is not updated correctly in Admin Home page, The count is "+actualStudentCnt, LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			// To verify the Student count in Teacher home page
			
		} catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		}
	@Parameters("browser")
	@Test(priority=12,enabled=false,description="Verify the count of Students in the admin home page by deleting the Teacher from  Database")
	public void verifyStudentCount(String browser) throws Throwable
	{   
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		databasepo=new DataBasePo(driver);
		String defaultStudentTxt;
		String actualStudentTxt;
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(20000);
			defaultStudentTxt=adminHomePo.getEleStudentsCount().getText();
			int defaultStudentCnt=adminHomePo.convertToInteger(defaultStudentTxt);
			NXGReports.addStep("The Student count in Admin Home page is : "+defaultStudentCnt, LogAs.PASSED, null);
			Thread.sleep(5000);
			adminHomePo.getEleSignOutText().click();
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataBaseURL"));
			Thread.sleep(2000);
			databasepo.databaseLogin(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataUsername"),GenericLib.getCongigValue(GenericLib.sConfigFile, "DataPassword"));
			Thread.sleep(2000);
			databasepo.deleteFromDB();
			NXGReports.addStep("Deleted a Student from Database ", LogAs.PASSED, null);
			Thread.sleep(3000);
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(20000);
			actualStudentTxt=adminHomePo.getEleStudentsCount().getText();
			int actualStudentCnt=adminHomePo.convertToInteger(actualStudentTxt);
			NXGReports.addStep("The Students count in Admin Home page after deleting a Student from database is : "+defaultStudentCnt, LogAs.PASSED, null);
			if(actualStudentCnt==defaultStudentCnt){
				NXGReports.addStep("No of Students Count in Admin Home page is not decreasing after deleting a Student from Database.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
			
		}		
}	
	@Parameters("browser")
	@Test(priority=13,enabled=false,description="Verify students registration without valid mobile number and valid details, and login with the credentials")
	public void studentRegistrationWithoutMobileNumber(String browser) throws Throwable{	
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		teacherregistrationpo=new TeacherRegistrationPo(driver);
		studentregisterationpo= new StudentRegistrationPo(driver);
		successfulregisterationpo= new SuccessfulRegisterationPo(driver);
		try {
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(5000);	
			studentSignInPo.getEleRegisterBtn().click();
			Thread.sleep(5000);	
			studentSignInPo.elementStatus(studentregisterationpo.getEleStudentTab(),"'Student' Tab   ","displayed");
			studentregisterationpo.getEleStudentTab().click();
			studentregisterationpo.getEleFirstName().sendKeys("Student");
			studentregisterationpo.getElelastName().sendKeys("s2");
			studentregisterationpo.getEleEmailId().sendKeys("navakanthtunga@gmail.com");
			Thread.sleep(2000);
			studentregisterationpo.getEleDobField().click();
			teacherregistrationpo.SelectDateOfBirth(1992, "Jun",13);
			adminHomePo.selectbyvisibletext(studentregisterationpo.getEleGenderSelect(), "Male");
			studentregisterationpo.getElePassword().sendKeys("raghukiran92");
			studentregisterationpo.getEleConfirmPassword().sendKeys("raghukiran92");
			adminHomePo.selectbyindexvalue(studentregisterationpo.getEleClassSelectDropdown(), 1);
			Thread.sleep(5000);
			adminHomePo.selectbyindexvalue(studentregisterationpo.getEleSectionSelectDropdown(), 1);
			Thread.sleep(5000);
			studentregisterationpo.getEleSignUpButt().click();
			Thread.sleep(5000);
			// To verify Registration confirmation 
			studentSignInPo.elementStatus(successfulregisterationpo.getEleSucessfullyRegisteredMsg(),"'You have successfully registered !!!' ","displayed");
			studentSignInPo.elementStatus(successfulregisterationpo.getEleRegLoginId(),"'Login Id' ","displayed");
			System.out.println(successfulregisterationpo.getEleRegLoginId().getText());
			String regLoginID=successfulregisterationpo.getEleRegLoginId().getText();
			studentSignInPo.elementStatus(successfulregisterationpo.getEleRegPassword(),"'Password' ","displayed");
			System.out.println(successfulregisterationpo.getEleRegPassword().getText());
			String regPassword=successfulregisterationpo.getEleRegPassword().getText();
			studentSignInPo.elementStatus(successfulregisterationpo.getEleClickHereText(),"'Click Here to Login' text ","displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleEnglishEdgeWebLink(),"'English Edge Website Link' ","displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleCopyRights(),"'CopyRights' ","displayed");
			studentSignInPo.elementStatus(studentSignInPo.getEleCodeVersionDateText(),"'Code''Version' 'Date' ","displayed");
			Thread.sleep(5000);
			successfulregisterationpo.getEleClickHereLink().click();
			Thread.sleep(15000);
			// To login with registered credentials
			studentSignInPo.getEleUserNameTextField().sendKeys(successfulregisterationpo.getvalue(regLoginID, 11));
			studentSignInPo.getElePasswordTextFiled().sendKeys(successfulregisterationpo.getvalue(regPassword, 11));
		} catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		}
	@Parameters("browser")
	@Test(priority=14,enabled=false,description="To verify all the error messages in Student Registeration page")
	public void studentErrorMessages(String browser) throws Throwable{	
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		teacherregistrationpo=new TeacherRegistrationPo(driver);
		studentregisterationpo= new StudentRegistrationPo(driver);
		successfulregisterationpo= new SuccessfulRegisterationPo(driver);
		try {
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(5000);	
			studentSignInPo.getEleRegisterBtn().click();
			Thread.sleep(5000);	
			studentSignInPo.elementStatus(studentregisterationpo.getEleStudentTab(),"'Student' Tab ","displayed");
			studentregisterationpo.getEleStudentTab().click();
			Thread.sleep(1000);
			// To Verify 'This value is required.' error message 
			studentregisterationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(studentregisterationpo.getEleValueReqErrMsg(),"'This value is required.' error message ","displayed");
			// To verify 'Value should be alpha/alphanumeric' error message
			studentregisterationpo.getEleFirstName().sendKeys("*/*/*");
			studentregisterationpo.getElelastName().sendKeys("/*/*/*");
			studentregisterationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(studentregisterationpo.getAlphaOrAlphanumericErrMsg(),"'Value should be alpha/alphanumeric' error message ","displayed");
			studentregisterationpo.getEleFirstName().clear();
			studentregisterationpo.getElelastName().clear();
			// To verify 'This value should be a valid email.' error message
			studentregisterationpo.getEleEmailId().sendKeys("navakanthtunga@gmailcom");
			studentregisterationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(studentregisterationpo.getEleInValidEmailErrMsg(),"'This value should be a valid email.' error message ","displayed");
			studentregisterationpo.getEleEmailId().clear();
			// To verify 'Mobile number should not be 0' error message
			studentregisterationpo.getEleMobileNum().sendKeys("0000000000");
			studentregisterationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(studentregisterationpo.getEleInValidPhoneNumErrMsg2(),"'Mobile number should not be 0' error message ","displayed");
			Thread.sleep(2000);
			// To verify 'This value should be a valid phone number.' error message
			studentregisterationpo.getEleMobileNum().clear();
			studentregisterationpo.getEleMobileNum().sendKeys("9*9*9*9*9*");
			studentregisterationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(studentregisterationpo.getEleInValidPhoneNumErrMsg1(),"'This value should be a valid phone number.' error message ","displayed");
			Thread.sleep(2000);
			studentregisterationpo.getEleMobileNum().clear();
			// To verify 'This value is too short. It should have 6 characters or more.' error message
			studentregisterationpo.getElePassword().sendKeys("raghu");
			studentregisterationpo.getEleConfirmPassword().sendKeys("raghu");
			studentregisterationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(studentregisterationpo.getEleValueIsShortErrorMsg(),"'This value is too short. It should have 6 characters or more.' error message ","displayed");
			Thread.sleep(2000);
			// To verify 'This value should be the same.' error message
			studentregisterationpo.getElePassword().clear();
			studentregisterationpo.getEleConfirmPassword().clear();
			studentregisterationpo.getElePassword().sendKeys("raghukiran");
			studentregisterationpo.getEleConfirmPassword().sendKeys("raghu");
			studentregisterationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(studentregisterationpo.getEleValueShouldSameErrorMsg(),"'This value should be the same.' error message ","displayed");
			Thread.sleep(2000);
			// To verify 'This value should be alphanumeric.' error message
			studentregisterationpo.getElePassword().clear();
			studentregisterationpo.getEleConfirmPassword().clear();
			studentregisterationpo.getElePassword().sendKeys("test123@");
			studentregisterationpo.getEleConfirmPassword().sendKeys("test123@");
			studentregisterationpo.getEleSignUpButt().click();
			studentSignInPo.elementStatus(studentregisterationpo.getEleAlphaNumericErrMsg(),"'This value should be alphanumeric.' error message ","displayed");
		} catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		}	
	@Parameters("browser")
	@Test(priority=15,enabled=false,description="Verify Forgot Password functionality with valid and invalid registered details and login to gmail and check the credential")
	public void verifyCredentialsFromGmail(String browser) throws Exception
	{   
		studentSignInPo=new StudentSignInPo(driver);
		forgotpassword=new ForgotPasswordPo(driver);
		adminSignupPo=new AdminSignupPo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			studentSignInPo.getEleForgotPwdLink().click();
			Thread.sleep(4000);
			studentSignInPo.elementStatus(studentSignInPo.getEleAdminForgotPasswordInstrTxt(),"To retrieve Admin password please instruction text", "displayed");
			studentSignInPo.getEleClickHereLnk().click();
			studentSignInPo.elementStatus(studentSignInPo.getEleAdminPasswordResetTxt(),"Welcome to Admin password reset console text", "displayed");
			Thread.sleep(5000);
			studentSignInPo.getEleLoginIDTxtFld().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "INVALIDFORGOTPASSWORDLOGINID"));
			studentSignInPo.getEleSubmitBtn().click();
			Thread.sleep(5000);
			studentSignInPo.elementStatus(forgotpassword.getEleInvalidMailIdErrorMsg(),"Incorrect Login ID. Please provide the correct Login ID.", "displayed");
			Thread.sleep(5000);
			studentSignInPo.getEleLoginIDTxtFld().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "FORGOTPASSWORDLOGINID"));
			studentSignInPo.getEleSubmitBtn().click();
			Thread.sleep(5000);
			studentSignInPo.elementStatus(studentSignInPo.getEleConfirmationText()," Credentials has been sent to your registered Email/Mobile text", "displayed");
			LoginGmail();
			Thread.sleep(5000); 
			studentSignInPo.elementStatus(studentSignInPo.getElePwdErrorMessage(),"Incorrect username or password. text", "displayed");
			NXGReports.addStep("Successfully error message has displayed for invalid password", LogAs.PASSED, null);
			Thread.sleep(10000); 
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		}
	@Parameters("browser")
	@Test(priority=16,enabled=false,description="Verify all the error messages in the 'Admin profile' page, Verify change password functionality with valid data and login with new password and After Changing Password try to Login with old password.")
	public void profilePage(String browser) throws Throwable{	
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		adminprofilepagepo=new AdminProfilePagePo(driver);
		teacherregistrationpo=new TeacherRegistrationPo(driver);
		try {
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(28000);
			adminHomePo.getEleDropDownIcon().click();
			Thread.sleep(2000);
			adminHomePo.getEleProfileOption().click();
			Thread.sleep(4000);
			// To Verify 'This value is required.' error message
			adminprofilepagepo.getEleFirstNameTxtFld().clear();
			adminprofilepagepo.getEleLastNameTxtFld().clear();
			adminprofilepagepo.getEleEmailIdTxtFld().clear();
			adminprofilepagepo.getElePhoneTextBox().clear();
			adminHomePo.selectbyindexvalue(adminprofilepagepo.getEleSelGender(), 0);
			adminprofilepagepo.getEleChangePasswordButton().click();
			adminprofilepagepo.getUpdateButton().click();
			studentSignInPo.elementStatus(adminprofilepagepo.getEleValueReqErrMsg(), "'The Value is required.' error message", "displayed");
			// To verify 'This value should be a valid email.'error message
			adminprofilepagepo.getEleEmailIdTxtFld().sendKeys("navakanthtunga@gmailcom");
			adminprofilepagepo.getUpdateButton().click();
			studentSignInPo.elementStatus(adminprofilepagepo.getEleMailIdErrMsg(), "'This value should be a valid email.' error message", "displayed");
			// To verify 'This value should be a valid phone number.'error message
			adminprofilepagepo.getElePhoneTextBox().sendKeys("9*9*9*9*9*");
			adminprofilepagepo.getUpdateButton().click();
			studentSignInPo.elementStatus(adminprofilepagepo.getElePhoneNumErrMsg(), "'This value should be a valid phone number.' error message", "displayed");
			// To verify 'Invalid Password' error message
			adminprofilepagepo.getEleOldPwdTextBox().sendKeys("abc11345");
			adminprofilepagepo.getUpdateButton().click();
			studentSignInPo.elementStatus(adminprofilepagepo.getEleOldPwdErrMsg(), "'Invalid Password' error message", "displayed");
			// To verify 'This value is too short. It should have 6 characters or more.' error message
			adminprofilepagepo.getEleNewPwdTextBox().sendKeys("123");
			adminprofilepagepo.getEleConNewPwdTextBox().sendKeys("123");
			adminprofilepagepo.getUpdateButton().click();
			Thread.sleep(2000);
			studentSignInPo.elementStatus(adminprofilepagepo.getEleValueShortErrMsg(), "'This value is too short. It should have 6 characters or more.' error message", "displayed");
			// To verify 'This value should be the same.' error message
			adminprofilepagepo.getEleNewPwdTextBox().sendKeys("123456");
			adminprofilepagepo.getEleConNewPwdTextBox().sendKeys("12345697");
			adminprofilepagepo.getUpdateButton().click();
			studentSignInPo.elementStatus(adminprofilepagepo.getEleValueShortErrMsg(), "'This value should be the same.' error message", "displayed");		
			adminprofilepagepo.getEleFirstNameTxtFld().clear();
			adminprofilepagepo.getEleFirstNameTxtFld().sendKeys("ADMIN");
			adminprofilepagepo.getEleLastNameTxtFld().clear();
			adminprofilepagepo.getEleLastNameTxtFld().sendKeys("admin");
			adminprofilepagepo.getEleEmailIdTxtFld().clear();
			adminprofilepagepo.getEleEmailIdTxtFld().sendKeys("navakanthtunga@gmail.com");
			adminprofilepagepo.getElePhoneTextBox().clear();
			adminprofilepagepo.getElePhoneTextBox().sendKeys("8550875759");
			adminprofilepagepo.getEleCalenderIcon().click();
			//teacherregistrationpo.SelectDateOfBirth(1995, "Jun",13);
			adminHomePo.selectbyvisibletext(adminprofilepagepo.getEleSelGender(), "Male");
			// To change password
			adminprofilepagepo.getEleOldPwdTextBox().clear();
			adminprofilepagepo.getEleOldPwdTextBox().sendKeys("raghukiran92");
			adminprofilepagepo.getEleNewPwdTextBox().clear();
			adminprofilepagepo.getEleNewPwdTextBox().sendKeys("raghukiran23");
			adminprofilepagepo.getEleConNewPwdTextBox().clear();
			adminprofilepagepo.getEleConNewPwdTextBox().sendKeys("raghukiran23");
			adminprofilepagepo.getUpdateButton().click();
			Thread.sleep(30000);
			// To verify 'Updated Successfully' Message
			studentSignInPo.elementStatus(adminprofilepagepo.getEleUpdatedSuccessfullyMsg(), "'Updated Successfully' Confirmation message", "displayed");
			// To 'Sign Out' 
			adminHomePo.getEleDropDownIcon().click();
			Thread.sleep(1000);
			adminHomePo.getEleSignOutOption().click();
			Thread.sleep(5000);
			// To login with old credentials
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(5000);
			studentSignInPo.elementStatus(studentSignInPo.getEleIncorrectUserPwd(), "'Incorrect username or password.' error message", "displayed");		
			Thread.sleep(2000);
			// Clean up code
			studentSignInPo.getEleUserNameTextField().clear();
			studentSignInPo.getElePasswordTextFiled().clear();
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "CONFIRMPASSWORD"));
			Thread.sleep(30000);
			adminHomePo.getEleDropDownIcon().click();
			Thread.sleep(2000);
			adminHomePo.getEleProfileOption().click();
			Thread.sleep(8000);
			adminprofilepagepo.getEleChangePasswordButton().click();
			Thread.sleep(2000);
			adminprofilepagepo.getEleOldPwdTextBox().sendKeys("raghukiran23");
			adminprofilepagepo.getEleNewPwdTextBox().sendKeys("raghukiran92");
			adminprofilepagepo.getEleConNewPwdTextBox().sendKeys("raghukiran92");
			Thread.sleep(1000);
			adminprofilepagepo.getUpdateButton().click();
			Thread.sleep(30000);
			studentSignInPo.elementStatus(adminprofilepagepo.getEleUpdatedSuccessfullyMsg(), "'Updated Successfully' Confirmation message", "displayed");
		}
		catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
}
	@Parameters("browser")
	@Test(priority=17,enabled=false,description="Create a batch and verify no of batches created in the 'Home' Page")
	public void createBatch(String browser) throws Throwable{	
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		createbatchpo=new CreateBatchPo(driver);
		int batchescreated=0;
		int totalbatches=0;
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(12000);
			String oldbatches=adminHomePo.getEleBatchesCount().getText();
			int oldbatchescount = Integer.parseInt(oldbatches); 
			System.out.println(adminHomePo.getEleBatchesCount().getText());
			studentSignInPo.elementStatus(adminHomePo.getEleCreateBatchText(),"Create batch text ","displayed");		
			adminHomePo.getEleCreateBatchText().click();
			Thread.sleep(6000);
			// To create single batches
			adminHomePo.selectbyvisibletext(createbatchpo.getEleClassDropDown1(), "class 1");
			adminHomePo.selectbyvisibletext(createbatchpo.getEleSectionFromDropDown1(), "A");
			adminHomePo.selectbyvisibletext(createbatchpo.getEleSectionToDropDown1(), "A");
			createbatchpo.getEleCreateButton().click();
			Thread.sleep(2000);
			// To verify the Confirmation table
			studentSignInPo.elementStatus(createbatchpo.getEleBatchConfirmTable(),"Batch Table ","displayed");
			Thread.sleep(2000);
			// To verify Batch status
			if(createbatchpo.getEleBatchExistsText().size()>=1){
				batchescreated=0;
				totalbatches=oldbatchescount+batchescreated;
			}
			if(createbatchpo.getEleBatchCreatedText().size()>=1){
				batchescreated=createbatchpo.getEleBatchCreatedText().size();
				totalbatches=oldbatchescount+batchescreated;
			}
			// To verify count of Updated batches 
			adminHomePo.getEleHomeText().click();
			String newbatches=adminHomePo.getEleBatchesCount().getText();
			int newbatchescount = Integer.parseInt(newbatches); 
			if(totalbatches==newbatchescount){
				NXGReports.addStep("After creating new batches, batches count is updating in Admin home page", LogAs.PASSED, null);
			}
		} catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}	
	@Parameters("browser")
	@Test(priority=18,enabled=false,description="Create mulitple batches by using 'Add' button and verify no of batches created in the 'Home' Page")
	public void createMulitpleBatches(String browser) throws Throwable{	
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		createbatchpo=new CreateBatchPo(driver);;
		int batchescreated=0;
		int totalbatches=0;
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(12000);
			String oldbatches=adminHomePo.getEleBatchesCount().getText();
			int oldbatchescount = Integer.parseInt(oldbatches); 
			System.out.println(adminHomePo.getEleBatchesCount().getText());
			studentSignInPo.elementStatus(adminHomePo.getEleCreateBatchText(),"Create batch text ","displayed");		
			adminHomePo.getEleCreateBatchText().click();
			Thread.sleep(6000);
			// To create multiple batches
			createbatchpo.multipleBatches(11);
			Thread.sleep(2000);
			// To verify the Confirmation table
			studentSignInPo.elementStatus(createbatchpo.getEleBatchConfirmTable(),"Batch Table ","displayed");
			Thread.sleep(2000);
			// To verify Batch status
			if(createbatchpo.getEleBatchExistsText().size()>=1){
				batchescreated=0;
				totalbatches=oldbatchescount+batchescreated;
			}
			if(createbatchpo.getEleBatchCreatedText().size()>=1){
				batchescreated=createbatchpo.getEleBatchCreatedText().size();
				totalbatches=oldbatchescount+batchescreated;
			}
			// To verify count of Updated batches 
			adminHomePo.getEleHomeText().click();
			String newbatches=adminHomePo.getEleBatchesCount().getText();
			int newbatchescount = Integer.parseInt(newbatches); 
			if(totalbatches==newbatchescount){
				NXGReports.addStep("After creating new batches, batches count is updating in Admin home page", LogAs.PASSED, null);
			}
		} catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=19,enabled=false,description="Verify batch creation by selecting invalid section")
	public void createBatchAlert(String browser) throws Throwable{	
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		createbatchpo=new CreateBatchPo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(12000);
			System.out.println(adminHomePo.getEleBatchesCount().getText());
			studentSignInPo.elementStatus(adminHomePo.getEleCreateBatchText(),"Create batch text ","displayed");		
			adminHomePo.getEleCreateBatchText().click();
			Thread.sleep(6000);
			// To create single batches
			adminHomePo.selectbyvisibletext(createbatchpo.getEleClassDropDown1(), "class 1");
			adminHomePo.selectbyvisibletext(createbatchpo.getEleSectionFromDropDown1(), "Z");
			adminHomePo.selectbyvisibletext(createbatchpo.getEleSectionToDropDown1(), "Y");
			createbatchpo.getEleCreateButton().click();	
			Thread.sleep(2000);
			System.out.println(driver.switchTo().alert().getText());
		}
		catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=20,enabled=false,description="Verify the count of Batches in the admin home page by deleting the Batches from  Database")
	public void verifyBatchCount(String browser) throws Exception
	{
	studentSignInPo=new StudentSignInPo(driver);
	databasepo=new DataBasePo(driver);
	adminHomePo=new AdminHomePo(driver);
	try
	{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(2000);
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
		Thread.sleep(20000);
		System.out.println(adminHomePo.getEleBatchesCount().getText());
		adminHomePo.getEleDropDownIcon().click();
		adminHomePo.getEleSignOutOption().click();
		Thread.sleep(5000);
	    loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataBaseURL"));
		Thread.sleep(2000);
		databasepo.databaseLogin(GenericLib.getCongigValue(GenericLib.sConfigFile, "DataUsername"),GenericLib.getCongigValue(GenericLib.sConfigFile, "DataPassword"));
		Thread.sleep(4000);
	    // change focus to new tab
		String switchToNewTab=Keys.chord(Keys.CONTROL,"t");
		String baseWindow=driver.getWindowHandle();
		 Set<String>  allWindows =(driver.getWindowHandles());
		 for(String currentWindow:allWindows )
		 {
			 if(!(allWindows.equals(baseWindow)))
			 {
				    driver.switchTo().frame(databasepo.getEleFrame());
					Thread.sleep(6000);
					databasepo.getEleAduroTxt().click();
					Thread.sleep(4000);
					driver.switchTo().defaultContent();
					Thread.sleep(4000);
					driver.switchTo().frame(databasepo.getEleFrameContent());
					Thread.sleep(4000);
					databasepo.getEleBatchBrowser().click();
					Thread.sleep(4000);
					databasepo.getEleSelectBatchTextBox().click();
					Thread.sleep(4000);
					databasepo.getEleDeleteIcon().click();
					Thread.sleep(4000);
					databasepo.getEleYesBtn().click();
					Thread.sleep(4000);
					driver.switchTo().defaultContent();
					driver.switchTo().frame(databasepo.getEleFrame());
					databasepo.getEleLogout().click();
					System.out.println(driver.getCurrentUrl());
					Thread.sleep(4000);
					break;
			 }
		 }
	  loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
	  Thread.sleep(5000);
	   studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
	  Thread.sleep(10000);
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(adminHomePo.getEleBatchesCount().getText());
	}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
}
	@Parameters("browser")
	@Test(priority=21,enabled=true,description="Verify the Document in Resources")
	public void ResourceDocument(String browser) throws Exception
	{
	studentSignInPo=new StudentSignInPo(driver);
	adminHomePo=new AdminHomePo(driver);
	resourcespo=new ResourcesPo(driver);
	try
	{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(2000);
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
		Thread.sleep(10000);
		adminHomePo.getEleResourcesIcon().click();
		Thread.sleep(10000);
		resourcespo.getEleTechnicalManualButton().click();
		Thread.sleep(6000);
	}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
}
	@Parameters("browser")
	@Test(priority=22,enabled=false,description="Verify Profile image change functionality by uploading images.")
	public void VerifyProfileImageUploadPNGFile(String browser) throws Exception
	{
	studentSignInPo=new StudentSignInPo(driver);
	adminHomePo=new AdminHomePo(driver);
	try
	{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(2000);
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
		Thread.sleep(10000);
		
		adminHomePo.getEleEditLink().sendKeys("D:\\Untitled.png");;
		Thread.sleep(10000);
	}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
		}
	}
	@Parameters("browser")
	@Test(priority=23,enabled=false,description="Verify Profile image change functionality with different files like .doc and .txt files")
	public void verifyUploadFileFunctionality(String browser) throws Exception
	{
	studentSignInPo=new StudentSignInPo(driver);
	adminHomePo=new AdminHomePo(driver);
	try
	{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(2000);
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
		Thread.sleep(10000);
		adminHomePo.getEleEditLink().sendKeys("C:\\Users\\CBT\\Desktop\\Teacher final.docx");
		Thread.sleep(10000);
		adminHomePo.getEleEditLink().sendKeys("C:\\Users\\CBT\\Desktop\\New Text Document.txt");
	}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
}
	@Parameters("browser")
	@Test(priority=24,enabled=false,description="Verify the functionality of  Cancel button  in the file upload popup")
	public void verifyCancelButtoninfileupload(String browser) throws Exception
	{
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		try
		{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(2000);
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
		Thread.sleep(10000);
		adminHomePo.getEleEditLink().click();
		Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(2000);
	    robot.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(2000);
	    robot.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(2000);
	    robot.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(2000);
	    robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000); 
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
	@Test(priority=25,enabled=false,description="Verify student data upload using Excel file")
	public void BulkStudentUpload(String browser) throws Exception
	{
		studentSignInPo=new StudentSignInPo(driver);
		adminHomePo=new AdminHomePo(driver);
		studentuploadpo=new StudentUploadPo(driver);
		try
		{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(10000);
			adminHomePo.getEleStudentUploadIcon().click();
			Thread.sleep(10000);
			adminHomePo.selectbyindexvalue(studentuploadpo.getEleClassDropdown(),1);
			Thread.sleep(10000);
			adminHomePo.selectbyindexvalue(studentuploadpo.getEleSectionDropdown(),2);
			studentuploadpo.getEleUploadButton().sendKeys("‪D:\\Bulk_Student_Upload.xls");
	}
	catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;	
	}
}
	
	
	
	
	}
	