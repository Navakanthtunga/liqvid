package com.liqvid.scripts;

import org.openqa.selenium.WebElement;
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
import com.liqvid.po.CreateBatchPo;
import com.liqvid.po.ForgotPasswordPo;
import com.liqvid.po.LicensePO;
import com.liqvid.po.ResourcesPo;
import com.liqvid.po.StudentRegistrationPo;
import com.liqvid.po.StudentSignInPo;
import com.liqvid.po.StudentUploadPo;
import com.liqvid.po.TeacherRegistrationPo;

public class AdminPagelevelTest  extends BaseLib{
	StudentSignInPo studentSignInPo=null;
	AdminHomePo adminhomepo=null;
	CreateBatchPo createbatchpo=null;
	AdminBatchReportPo adminbatchreportpo=null;
	StudentUploadPo studentuploadpo=null;
	ResourcesPo resourcespo=null;
	TeacherRegistrationPo teacherregistrationpo=null;
	StudentRegistrationPo studentregisterationpo=null;
	StudentSignInPo studentsigninpo=null;
	AdminProfilePagePo adminprofilepagepo=null;
	ForgotPasswordPo forgotpasswordpo=null;
	LicensePO licensepo=null;
	@Parameters("browser")
	@Test(priority=1,enabled=false,description="To verify Admin login with valid username and invalid Password, invalid username and valid Password,invalid username and invalid Password,valid credentials and Verify the elements in Admin home page")
	public void verifyAdminHomePageElements(String browser) throws Throwable{	
		studentSignInPo=new StudentSignInPo(driver);
		adminhomepo=new AdminHomePo(driver);
		studentsigninpo=new StudentSignInPo(driver);
		try {
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(3000);
			// verify 'Username cannot be blank.','Password cannot be blank.' Error messages
			studentSignInPo.getEleSignInBtn().click();
			studentSignInPo.elementStatus(studentsigninpo.getElePwdErrMsg(),"'Password cannot be blank.' Error Message ","displayed");
			studentSignInPo.elementStatus(studentsigninpo.getEleUserNameErrMsg(),"'Username cannot be blank.' Error Message ","displayed");
			// Verify Admin login with invalid username and valid Password
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "InvalidUserName"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			studentSignInPo.elementStatus(studentsigninpo.getElePwdErrMsg(),"'Incorrect username or password.' Error Message ","displayed");
			studentSignInPo.getEleUserNameTextField().clear();
			studentSignInPo.getElePasswordTextFiled().clear();
			// Verify Admin login with valid username and invalid Password
			studentSignInPo.getEleUserNameTextField().clear();
			studentSignInPo.getElePasswordTextFiled().clear();
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "InvalidPassword"));
			studentSignInPo.elementStatus(studentsigninpo.getElePwdErrMsg(),"'Incorrect username or password.' Error Message ","displayed");
			// Verify Admin login with valid credentials
			studentSignInPo.getEleUserNameTextField().clear();
			studentSignInPo.getElePasswordTextFiled().clear();
			studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
			Thread.sleep(9000);
			studentSignInPo.elementStatus(adminhomepo.getEleEnglishEdgeLogo(),"English Edge logo in Admin Home ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleVersionCode(),"Version Code in Home Page ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleHomeIcon()," Home icon ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleHomeText(),"Home text ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleLicenseUpdateIcon(),"License Update icon ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleLicenseUpdateText(),"License Update text ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleCreateBatchIcon(),"Create batch icon ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleCreateBatchText(),"Create batch text ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleBatchReportIcon(),"Batch report icon ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleBatchReportText(),"Batch report text ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleStudentUploadIcon(),"Student upload icon ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleStudentUploadText(),"Student upload text ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleResourcesIcon(),"Resources icon ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleResourcesText(),"Resources text ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleSignOutIcon(),"Sign out icon ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleSignOutText(),"Sign out text ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleWelcomeUserNameText(),"Welcome! user name text ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleLastLoginDate(),"Last Login Date text ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleLastSyncDate(),"Last Sync text ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleLicenseExpiryDate(),"License Expiry text ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleAccUrl(),"Access Url ","displayed");
			System.out.println("Admin Details in the home page are : ");
			for(WebElement adminDetails:adminhomepo.getEleAdminDetails())
			{
				studentSignInPo.elementStatus(adminDetails,"The Admin details ", "displayed");
				System.out.println(adminDetails.getText());
			}
			studentSignInPo.elementStatus(adminhomepo.getEleCourseSection(),"Course Section ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleBatchSection(),"Batch Section ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleTeacherSection(),"Teacher Section ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleStudentSection(),"Student Section ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleCoursesCount(),"Course Count ","displayed");
			System.out.println("Total Number of courses :"+adminhomepo.getEleCoursesCount().getText());
			studentSignInPo.elementStatus(adminhomepo.getEleBatchesCount(),"Batch Count ","displayed");
			System.out.println("Total Number of Batches :"+adminhomepo.getEleBatchesCount().getText());
			studentSignInPo.elementStatus(adminhomepo.getEleTeachersCount(),"Teacher Count ","displayed");
			System.out.println("Total Number of Teachers :"+adminhomepo.getEleTeachersCount().getText());
			studentSignInPo.elementStatus(adminhomepo.getEleStudentsCount(),"Student Count ","displayed");
			System.out.println("Total Number of Students :"+adminhomepo.getEleStudentsCount().getText());		
			studentSignInPo.elementStatus(adminhomepo.getEleChart(),"Chart in Admin Home page ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleParagraph1Text(),"Paragraph1 in  Admin Home page ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleParagraph2Text(),"Paragraph2 in Admin Home page ","displayed");
			studentSignInPo.elementStatus(studentsigninpo.getEleCopyRights(),"Copy Rights and 'Liqvid English Edge Pvt. Ltd.' ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleAdminNameInDropdown(),"Admin Name in Drop down of Home page ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleDropDownIcon(),"Dropdown icon in Home page  ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleNotificationicon(),"Notification icon in  Home page ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleNotificationCount(),"Notification count in Home page  ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleProfileImage(),"Profile Image in Home page ","displayed");
			studentSignInPo.elementStatus(adminhomepo.getEleHeaderProfileImage(),"Profile Image in header part of Home page ","displayed");
	
		} catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Parameters("browser")
@Test(priority=2,enabled=false,description="Display of Elements after selecting Class drop down, after selecting section from drop down, after selecting section to drop down")
	public void verifyCreateBatchPageElements(String browser) throws Throwable{	
	studentSignInPo=new StudentSignInPo(driver);
	adminhomepo=new AdminHomePo(driver);
	createbatchpo=new CreateBatchPo(driver);
	try {
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(2000);
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
		Thread.sleep(12000);
		studentSignInPo.elementStatus(adminhomepo.getEleCreateBatchText(),"Create batch text ","displayed");
		adminhomepo.getEleCreateBatchText().click();
		Thread.sleep(2000);
		studentSignInPo.elementStatus(createbatchpo.getEleCreateBatchTitle(),"Create Batch text in Create page ","displayed");
		studentSignInPo.elementStatus(createbatchpo.getEleClassSection(),"Class Section in Create page ","displayed");
		studentSignInPo.elementStatus(createbatchpo.getEleSectionFrom(),"'Section from'in Create page ","displayed");
		studentSignInPo.elementStatus(createbatchpo.getEleSectionTo(),"'Section To' in Create page ","displayed");
		// Verify the elements in 'class' Drop Down
		for(int i=0;i<=adminhomepo.getsize(createbatchpo.getEleClassDropDown1())-1;i++){
		adminhomepo.selectbyindexvalue(createbatchpo.getEleClassDropDown1(), i);
		}
		// Verify the elements in 'section from' Drop Down 
		for(int i=0;i<=adminhomepo.getsize(createbatchpo.getEleSectionFromDropDown1())-1;i++){
		adminhomepo.selectbyindexvalue(createbatchpo.getEleSectionFromDropDown1(), i);
		}	
		// Verify the elements in 'section to' Drop Down 
		for(int i=0;i<=adminhomepo.getsize(createbatchpo.getEleSectionToDropDown1())-1;i++){
		adminhomepo.selectbyindexvalue(createbatchpo.getEleSectionToDropDown1(), i);
		}	
		studentSignInPo.elementStatus(createbatchpo.getEleAddButton(),"'Add' button  in Create page ","displayed");
		studentSignInPo.elementStatus(createbatchpo.getEleCreateButton(),"Create Button in Create page ","displayed");
		Thread.sleep(3000);
	} catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
}
	@Parameters("browser")
@Test(priority=3,enabled=false,description="Display of Elements in 'CreateBatch' after clicking on add button, Display of Elements in 'CreateBatch' page after clicking on remove button")
	public void verifyClassSections(String browser) throws Throwable{
	studentSignInPo=new StudentSignInPo(driver);
	adminhomepo=new AdminHomePo(driver);
	createbatchpo=new CreateBatchPo(driver);
	int classSectionCount=1;
	try {
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(2000);
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
		Thread.sleep(10000);
		studentSignInPo.elementStatus(adminhomepo.getEleCreateBatchText(),"Create batch text ","displayed");
		adminhomepo.getEleCreateBatchText().click();
		Thread.sleep(2000);
		studentSignInPo.elementStatus(createbatchpo.getEleAddButton(),"'Add' button  in Create page ","displayed");
		// To verify the functionality of 'Add' button
		for(int i=0;i<=5;i++){
			createbatchpo.getEleAddButton().click();
			classSectionCount=classSectionCount+1;
			Thread.sleep(1000);
		}		
		studentSignInPo.elementStatus(createbatchpo.getEleRemoveButton(),"Remove Button  in Create page ","displayed");
		// To verify the functionality of 'Remove' button
		for(int i=0;i<=5;i++){
			createbatchpo.getEleRemoveButton().click();
			classSectionCount=classSectionCount-1;		
			Thread.sleep(1000);
		}		
		//Verify the No of class,Section from and Section 2 dropdowns. 
		if(classSectionCount==createbatchpo.getEleCountofClassSections().size()){
			System.out.println("Add and Remove buttons are working properly.");
			NXGReports.addStep("Add and Remove buttons are working properly.", LogAs.PASSED, null);
		}
		else{
			System.out.println("Add and Remove buttons are not working properly.");
			NXGReports.addStep("Add and Remove buttons are not working properly.", LogAs.FAILED, null);
		}
	} catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
}
	@Parameters("browser")
@Test(priority=4,enabled=false,description="Display of Elements in 'Batch Report' Page without selecting any options")
	public void verifyElementsBatchReportPage(String browser) throws Throwable{		
	studentSignInPo=new StudentSignInPo(driver);
	adminhomepo=new AdminHomePo(driver);
	adminbatchreportpo =new AdminBatchReportPo(driver);
	try {
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(2000);
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
		Thread.sleep(20000);
		studentSignInPo.elementStatus(adminhomepo.getEleBatchReportText(),"'Batch Report' text ","displayed");
		adminhomepo.getEleBatchReportText().click();
		Thread.sleep(4000);
		studentSignInPo.elementStatus(adminbatchreportpo.getEleBatchReportTxt(),"'Batch Report' title ","displayed");
		studentSignInPo.elementStatus(adminbatchreportpo.getEleClassSelectDropdown(),"Class Dropdown in 'Batch Report'","displayed");
		studentSignInPo.elementStatus(adminbatchreportpo.getEleSectionSelectDropdown(),"Section Dropdown in 'Batch Report'","displayed");
		studentSignInPo.elementStatus(adminbatchreportpo.getEleUsertypeSelectDropdown(),"User Type Dropdown in 'Batch Report'","displayed");
		studentSignInPo.elementStatus(adminbatchreportpo.getEleSubmitButton(),"Submit button  in 'Batch Report'","displayed");
		// To verify Error message 'This value is required.'
		adminbatchreportpo.getEleSubmitButton().click();
		studentSignInPo.elementStatus(adminbatchreportpo.getEleSubmitButton(),"Submit button  in 'Batch Report'","displayed");
		for(WebElement valuerequirederrormessage:adminbatchreportpo.getEleValueRequiredErrMsg())
		{
			studentSignInPo.elementStatus(valuerequirederrormessage,"Error message 'This value is required.'", "displayed");
			System.out.println(valuerequirederrormessage.getText());	
		}	
		// To Select class, Section and user type
		adminhomepo.selectbyvisibletext(adminbatchreportpo.getEleClassSelectDropdown(), "class 2");
		adminhomepo.selectbyvisibletext(adminbatchreportpo.getEleSectionSelectDropdown(), "A");
		adminhomepo.selectbyvisibletext(adminbatchreportpo.getEleUsertypeSelectDropdown(), "Student");
		Thread.sleep(2000);
		System.out.println(adminbatchreportpo.getEleErrmsgForIncorrectDetails().size());
		adminbatchreportpo.getEleSubmitButton().click();
		//Verifying the Batch report table
		studentSignInPo.elementStatus(adminbatchreportpo.getEleBatchReportTable(),"Batch report table in 'Batch Report'","displayed");
		// Verifying the details based on selection
		studentSignInPo.elementStatus(adminbatchreportpo.getEleNametext(),"'Name' text in 'Batch Report'","displayed");
		studentSignInPo.elementStatus(adminbatchreportpo.getEleLoginIDtext(),"'Login ID' in 'Batch Report'","displayed");	
		studentSignInPo.elementStatus(adminbatchreportpo.getElePasswordText(),"'Password'  in 'Batch Report'","displayed");
		studentSignInPo.elementStatus(adminbatchreportpo.getEleFirstRowName(),"First row name in 'Batch Report'","displayed");
		studentSignInPo.elementStatus(adminbatchreportpo.getEleFirstRowLoginId(),"First row login id in 'Batch Report'","displayed");
		studentSignInPo.elementStatus(adminbatchreportpo.getEleFirstRowPassword(),"First row password in 'Batch Report'","displayed");
		studentSignInPo.elementStatus(adminbatchreportpo.getEleSecondRowName(),"Second row name in 'Batch Report'","displayed");
		studentSignInPo.elementStatus(adminbatchreportpo.getEleSecondRowLoginId(),"Second row login id in 'Batch Report'","displayed");
		studentSignInPo.elementStatus(adminbatchreportpo.getEleSecondRowPassword(),"Second row password in 'Batch Report'","displayed");
		adminhomepo.selectbyvisibletext(adminbatchreportpo.getEleClassSelectDropdown(), "class 2");
		adminhomepo.selectbyvisibletext(adminbatchreportpo.getEleSectionSelectDropdown(), "A");
		adminhomepo.selectbyvisibletext(adminbatchreportpo.getEleUsertypeSelectDropdown(), "Teacher");
		Thread.sleep(2000);
		System.out.println(adminbatchreportpo.getEleErrmsgForIncorrectDetails().size());
	} catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
}
	@Parameters("browser")
@Test(priority=5,enabled=false,description="Display of Elements in 'Student Upload' Page")
public void verifyElementsStudentUpload(String browser) throws Throwable{	
	studentSignInPo=new StudentSignInPo(driver);
	adminhomepo=new AdminHomePo(driver);
	studentuploadpo=new StudentUploadPo(driver);
	try {
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(2000);
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
		Thread.sleep(20000);
		studentSignInPo.elementStatus(adminhomepo.getEleStudentUploadText(),"'Batch Report' text ","displayed");
		adminhomepo.getEleStudentUploadText().click();
		Thread.sleep(4000);
		studentSignInPo.elementStatus(studentuploadpo.getEleStudentBulkUploadTitle(),"'Student Bulk Upload' Title ","displayed");
		studentSignInPo.elementStatus(studentuploadpo.getEleClassDropdown(),"Select Class Dropdown in 'Student Upload' Page ","displayed");
		studentSignInPo.elementStatus(studentuploadpo.getEleUploadButton(),"Upload Button in 'Student Upload' Page ","displayed");
		studentSignInPo.elementStatus(studentuploadpo.getEleSampleUploadFile(),"Sample dat Upload File link in 'Student Upload' Page ","displayed");
		studentuploadpo.getEleSampleUploadFile().click();
		studentSignInPo.elementStatus(studentuploadpo.getEleSubmitButton(),"Submit button in 'Student Upload' Page ","displayed");
		studentuploadpo.getEleSubmitButton().click();
		studentSignInPo.elementStatus(studentuploadpo.getEleValueReqErrMsg(),"Value required Error Message in 'Student Upload' Page ","displayed");
	} catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
@Test(priority=6,enabled=false,description="Display of Elements in 'Resources' Page")
public void verifyElementsResources(String browser) throws Throwable{	
	studentSignInPo=new StudentSignInPo(driver);
	adminhomepo=new AdminHomePo(driver);
	resourcespo=new ResourcesPo(driver);
	try {
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(2000);
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
		Thread.sleep(20000);
		studentSignInPo.elementStatus(adminhomepo.getEleResourcesText(),"'Batch Report' text ","displayed");
		adminhomepo.getEleResourcesText().click();
		Thread.sleep(4000);
		studentSignInPo.elementStatus(resourcespo.getEleResourcesTitle(),"'Resources' Title ","displayed");
		studentSignInPo.elementStatus(resourcespo.getEleTechnicalManualButton(),"'Technical Manual' Button ","displayed");
		studentSignInPo.elementStatus(resourcespo.getEleHelpManualImage(),"Help Manual Image ","displayed");
	} catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
@Test(priority=7,enabled=false,description="Display of elements in Teachers Registration page")
public void verifyTeachersregistration(String browser) throws Throwable{	
	studentSignInPo=new StudentSignInPo(driver);
	adminhomepo=new AdminHomePo(driver);
	teacherregistrationpo=new TeacherRegistrationPo(driver);
	try {
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(5000);	
		studentSignInPo.getEleRegisterBtn().click();
		Thread.sleep(5000);	
		studentSignInPo.elementStatus(teacherregistrationpo.getEleTeacherTab(),"'Teacher' Tab ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleRegisterInstructionText(),"'First-time user, register here.' instruction  ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleFirstNametext(),"'First Name' text ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleLastNameText(),"'Last Name' text ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleEmailIdText(),"'EmailId' text ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleMobileNumText(),"'Mobile Number' text ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleDobText(),"'Date Of Birth' text ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleGenderText(),"'Gender' text ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getElePasswordText(),"'Password' text ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleConfirmPasswordText(),"'Confirm Password' text ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleSelectClassText(),"'Select Class' text ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleSelectSectionText(),"'Select Section' text ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getNoteText(),"'Note ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleCopyRightsText(),"CopyRights ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getCodeVersionDateText(),"Code Version Date text ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleWebLink(),"'Liqvid English Edge Pvt. Ltd.' Link ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleFirstName(),"'First Name' text Field ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getElelastName(),"'Last Name' text Field ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleEmailId(),"'EmailId' text ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleMobileNum(),"'Mobile Number' text Field ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleDobField(),"'Date Of Birth' text Field ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleGenderSelect(),"'Gender Select' text Field ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getElePassword(),"'Password' text Field ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleConfirmPassword(),"'Confirm Password' text Field ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleClassSelectDropdown1(),"'Class Select' Dropdown text Field ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleSectionSelectDropdown1(),"'Section Select' Dropdown text Field ","displayed");
		studentSignInPo.elementStatus(teacherregistrationpo.getEleBackLink(),"'Back' link ","displayed");
		teacherregistrationpo.getEleBackLink().click();
		Thread.sleep(5000);
	} catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
@Test(priority=8,enabled=false,description="Display of elements in Student Registration page")
public void verifyStudentregistration(String browser) throws Throwable{	
	studentSignInPo=new StudentSignInPo(driver);
	adminhomepo=new AdminHomePo(driver);
	studentregisterationpo= new StudentRegistrationPo(driver);
	try {
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(5000);	
		studentSignInPo.getEleRegisterBtn().click();
		Thread.sleep(5000);	
		studentSignInPo.elementStatus(studentregisterationpo.getEleStudentTab(),"'Student' Tab   ","displayed");
		studentregisterationpo.getEleStudentTab().click();
		studentSignInPo.elementStatus(studentregisterationpo.getEleFirstNametext(),"'First Name' text ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleLastNameText(),"'Last Name' text ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleEmailIdText(),"'EmailId' text ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleMobileNumText(),"'Mobile Number' text ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleDobText(),"'Date Of Birth' text ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleGenderText(),"'Gender' text ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getElePasswordText(),"'Password' text ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleConfirmPasswordText(),"'Confirm Password' text ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleSelectClassText(),"'Select Class' text ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleSelectSectionText(),"'Select Section' text ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getNoteText(),"'Note ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleCopyRightsText(),"CopyRights ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getCodeVersionDateText(),"Code Version Date text ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleWebLink(),"'Liqvid English Edge Pvt. Ltd.' Link ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleFirstName(),"'First Name' text Field ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getElelastName(),"'Last Name' text Field ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleEmailId(),"'EmailId' text ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleMobileNum(),"'Mobile Number' text Field ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleDobField(),"'Date Of Birth' text Field ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleGenderSelect(),"'Gender Select' text Field ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getElePassword(),"'Password' text Field ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleConfirmPassword(),"'Confirm Password' text Field ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleClassSelectDropdown(),"'Class Select' Dropdown text Field ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleSectionSelectDropdown(),"'Section Select' Dropdown text Field ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleSignUpButt(),"'SignUp' Button ","displayed");
		studentregisterationpo.getEleSignUpButt().click();
		Thread.sleep(1000);
		studentSignInPo.elementStatus(studentregisterationpo.getEleValueReqErrMsg(),"'This value is required.' error message ","displayed");
		studentSignInPo.elementStatus(studentregisterationpo.getEleBackLink(),"'Back' link ","displayed");
		studentregisterationpo.getEleBackLink().click();
		Thread.sleep(5000);
	} catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
@Test(priority=8,enabled=false,description="Display of elements in 'Profile' Page after clicking on 'Change password'")
public void verifyAdminProfilePageElements(String browser) throws Throwable{	
	studentSignInPo=new StudentSignInPo(driver);
	adminhomepo=new AdminHomePo(driver);
	adminprofilepagepo=new AdminProfilePagePo(driver);
	try {
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(2000);
		studentSignInPo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "ADMINPASSWORD"));
		Thread.sleep(8000);
		adminhomepo.getEleDropDownIcon().click();
		Thread.sleep(2000);
		studentSignInPo.elementStatus(adminhomepo.getEleProfileOption(),"'Profile' option in Dropdown ","displayed");
		studentSignInPo.elementStatus(adminhomepo.getEleSignOutOption(),"'SignOut' option in Dropdown ","displayed");
		adminhomepo.getEleProfileOption().click();
		Thread.sleep(2000);
		studentSignInPo.elementStatus(adminprofilepagepo.getEleProfileTxt(),"'Profile' text ","displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleFirstNameTxt(),"'First Name' text ","displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleLastNameTxt(), "'Last name' text", "displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleEmailIdTxt(),"'Email ID' text ","displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getElePhoneTxt(), "'Phone' text", "displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleDobText(), "'Date Of Birth' text", "displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getGenderText(),"'Gender' text ","displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getElePlusIcon(),"'Plus' Icon in 'change password' button ","displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleChangePasswordButton(), "'Phone' text", "displayed");
		adminprofilepagepo.getEleChangePasswordButton().click();
		studentSignInPo.elementStatus(adminprofilepagepo.getEleMinusIcon(),"'Minus' Icon in 'change password' button ","displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleOldPwdText(), "'Old Password' text", "displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleNewPwdText(),"'New Password' text ","displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleConNewPwdText(), "'Confirm New Password' text", "displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleFirstNameTxtFld(),"'First Name' text field","displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleLastNameTxtFld(), "'Last name' text field", "displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleEmailIdTxtFld(),"'Email ID' field ","displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getElePhoneTextBox(), "'Phone' field", "displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleDobTextbox(), "'Date Of Birth' field", "displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleSelGender(),"'Gender' field ","displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleChangePasswordButton(), "'Phone' field", "displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleOldPwdTextBox(), "'Old Password' field", "displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleNewPwdTextBox(),"'New Password' field ","displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getEleConNewPwdTextBox(), "'Confirm New Password' field", "displayed");
		studentSignInPo.elementStatus(adminprofilepagepo.getUpdateButton(), "'Update' button", "displayed");
	} catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	@Parameters("browser")
@Test(priority=9,enabled=false,description="Verify the elements in Forgot Password page")
public void verifyForgotPasswordPageElements(String browser) throws Throwable{	
	studentSignInPo=new StudentSignInPo(driver);
	adminhomepo=new AdminHomePo(driver);
	studentsigninpo=new StudentSignInPo(driver);
	forgotpasswordpo = new ForgotPasswordPo(driver);
	licensepo=new LicensePO(driver);
	try {
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		Thread.sleep(3000);
		studentSignInPo.getEleForgotPwdLink().click();
		Thread.sleep(4000);
		studentSignInPo.elementStatus(forgotpasswordpo.getEleLogo(),"'English Edge' Logo ","displayed");
		studentSignInPo.elementStatus(forgotpasswordpo.getEleEnglishEdgeSetupText(),"'EnglishEdge Setup' text ","displayed");
		studentSignInPo.elementStatus(forgotpasswordpo.getEleForgotPasswdInstr(), "'Forgot Password Instructions' text", "displayed");
		studentSignInPo.elementStatus(forgotpasswordpo.getEleClickHereLink(),"'Click Here' Link ","displayed");
		studentSignInPo.elementStatus(forgotpasswordpo.getEleBackButton(), "'Back' button", "displayed");
		studentSignInPo.elementStatus(licensepo.getEleCustomerSupportText(), "'Customer Support' text", "displayed");
		studentSignInPo.elementStatus(licensepo.getEleCustomerCareContactDetails(),"Customer Care  Contact Details","displayed");
		studentSignInPo.elementStatus(licensepo.getEleCustomerCareEmailId(),"Customer Care  Email Id ","displayed");
		studentSignInPo.elementStatus(licensepo.getEleEnglishEdgeWebsitelink(), "'English Edge' Website link ", "displayed");
		studentSignInPo.elementStatus(licensepo.getEleCopyRightsText(), "'CopyRights' text", "displayed");
		studentSignInPo.elementStatus(licensepo.getEleEnglishEdgeWebsitelinkFooter(), "'Liqvid English Edge Pvt. Ltd.' link", "displayed");
		studentSignInPo.elementStatus(studentsigninpo.getEleCodeVersionDateText(), "'Code Version Date' text", "displayed");
	} catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	
}
