package com.liqvid.po;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherRegistrationPo {
	WebDriver driver=null;
	public TeacherRegistrationPo(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		// To identify "First-time user, register here." instruction text for Teacher's registration 
		@FindBy(xpath="//div[@class='panel-body panel-bodyLeft']//p") 
		private WebElement eleRegisterInstrText;
		public WebElement getEleRegisterInstructionText(){
			return eleRegisterInstrText;
		}
		// To identify Teacher tab in the registration  page	
		@FindBy(xpath="//a[@href='#teacher']")
		private WebElement eleTeacherTab;
		public WebElement getEleTeacherTab(){
			return eleTeacherTab;
		}
		// To identify First Name text 
		@FindBy(xpath="(//label[text()='First Name'])[1]")
		private WebElement eleFirstNameText;
		public WebElement getEleFirstNametext(){
			return eleFirstNameText;
		}
		// To identify Last Name text 
		@FindBy(xpath="(//label[text()='Last Name'])[1]")
		private WebElement eleLastNameText;
		public WebElement getEleLastNameText(){
			return eleLastNameText;
		}
		// To identify Email id text
		@FindBy(xpath="(//label[text()='Email ID'])[1]")
		private WebElement eleEmailIdText;
		public WebElement getEleEmailIdText(){
			return eleEmailIdText;
		}
		// To identify Mobile number text
		@FindBy(xpath="(//label[text()='Mobile Number'])[1]")
		private WebElement eleMobileNumText;
		public WebElement getEleMobileNumText(){
			return eleMobileNumText;
		}
		// To identify Date of birth Text
		@FindBy(xpath="(//label[text()='Date Of Birth'])[1]")
		private WebElement eleDobText;
		public WebElement getEleDobText(){
			return eleDobText;
		}
		// To identify gender text
		@FindBy(xpath="(//label[text()='Gender'])[1]")
		private WebElement eleGenderText;
		public WebElement getEleGenderText(){
			return eleGenderText;
		}		
		// To identify Password Text		
		@FindBy(xpath="(//label[text()='Password'])[1]")
		private WebElement elePasswordText;
		public WebElement getElePasswordText(){
			return elePasswordText;
		}
		// To identify confirm Password text
		@FindBy(xpath="(//label[text()='Confirm Password'])[1]")
		private WebElement eleConfirmPasswordText;
		public WebElement getEleConfirmPasswordText(){
			return eleConfirmPasswordText;
		}
		// To identify Select Class text 
		@FindBy (xpath="(//label[text()='Select Class'])[1]")
		private WebElement eleSelectClassText;
		public WebElement getEleSelectClassText(){
			return eleSelectClassText;
		}
		// To identify Select Section text
		@FindBy(xpath="(//label[text()='Select Section'])[1]")
		private WebElement eleSelectSectionText;
		public WebElement getEleSelectSectionText(){
			return eleSelectSectionText;
		}
		// To identify code, Version and date
		@FindBy(id="footer-copyright")
		private WebElement eleCodeVersionDateText;
		public WebElement getCodeVersionDateText(){
			return eleCodeVersionDateText;
		}	
		// To identify Copy rights text 
		@FindBy(id="footer-terms")
		private WebElement eleCopyRightsText;
		public WebElement getEleCopyRightsText(){
			return eleCopyRightsText;
		}
		// To identify Liqvid English Edge pvt ltd link
		@FindBy(xpath="//a[@href='http://www.englishedge.in/']")
		private WebElement eleWebLink;
		public WebElement getEleWebLink(){
			return eleWebLink;
		}
		// To identify note text 
		@FindBy(xpath="(//div[@class='form-group note'])[1]")
		private WebElement noteText;
		public WebElement getNoteText(){
			return noteText;
		}	
		// To identify First name text box
		@FindBy(xpath="(//input[@id='fld_first_name'])[1]")
		private WebElement eleFirstName;
		public WebElement getEleFirstName(){
			return eleFirstName;
		}
		// To identify Last Name text box
		@FindBy(xpath="(//input[@id='fld_last_name'])[1]")
		private WebElement eleLastName;
		public WebElement getElelastName(){
			return eleLastName;
		}
		// To identify Email id text box
		@FindBy(xpath="(//input[@id='fld_email'])[1]")
		private WebElement eleEmailId;
		public WebElement getEleEmailId(){
			return eleEmailId;
		}
		// To identify country select drop down
		@FindBy(xpath="(//div[@ class='selected-dial-code'])[1]")
		private WebElement eleCountrySelect;
		public WebElement getEleCountrySelect(){
			return eleCountrySelect;
		}
		// To identify mobile number 
		@FindBy(id="fld_mobile1")
		private WebElement eleMobileNum;
		public WebElement getEleMobileNum(){
			return eleMobileNum;
		}
		// To identify Date Of Birth Text field
		@FindBy(xpath="(//i[@class='fa fa-calendar'])[1]") 
		private WebElement eleDobField;
		public WebElement getEleDobField(){
			return eleDobField;
		}
		// To identify Gender drop down
		@FindBy(xpath="(//select [@id='fld_gender'])[1]")
		private WebElement eleGenderSelect;
		public WebElement getEleGenderSelect(){
			return eleGenderSelect;
		}	
		// To identify password field
		@FindBy(id="fld_password")
		private WebElement elePassword;
		public WebElement getElePassword(){
			return elePassword;
		}
		// To identify confirm password field
		@FindBy(xpath="(//input[@id='confirmfld_password'])[1]")
		private WebElement eleConfirmPassword;
		public WebElement getEleConfirmPassword(){
			return eleConfirmPassword;
		}
		// To identify select class drop down -1
		@FindBy(id="fld_class1")
		private WebElement eleClassSelectDropdown1;
		public WebElement getEleClassSelectDropdown1(){
			return eleClassSelectDropdown1;
		}
		// To identify select section drop down -1
		@FindBy(id="fld_section1")
		private WebElement eleSectionSelectDropdown1;
		public WebElement getEleSectionSelectDropdown1(){
			return eleSectionSelectDropdown1;
		}
		// To identify Add button
		@FindBy(xpath="(//p[@class='btn btn-primary btnHeight'])[1]")
		private WebElement eleAddButt;
		public WebElement getEleAddButt(){
			return eleAddButt;
		}
		
		// To identify Select class drop down-2
		@FindBy(id="fld_class2")
		private WebElement eleClassSelectDropdown2;
		public WebElement getEleClassSelectDropdown2(){
			return eleClassSelectDropdown2;
		}
		
		// To identify Select section drop down -2
		@FindBy(id="fld_section2")
		private WebElement eleSectionSelectDropdown2;
		public WebElement getEleSectionSelectDropdown2(){
			return eleSectionSelectDropdown2;
		}
		// To identify Select class drop down -3
		@FindBy(id="fld_class3")
		private WebElement getEleClassSelectDropdown3;
		public WebElement getEleClassSelectDropdown3(){
			return getEleClassSelectDropdown3;
		}
		
		// To identify Select section drop down -3
		@FindBy(id="fld_section3")
		private WebElement eleSectionSelectDropdown3;
		public WebElement getEleSectionSelectDropdown3(){
			return eleSectionSelectDropdown3;
		}
		// To identify All the dropdowns
		@FindBy(xpath="//div[contains(@id,'classSectionDt')]")
		private WebElement eleClassSections;
		public WebElement getEleClassSections(){
			return eleClassSections;
		}		
		// To identify remove button 
		@FindBy(xpath="(//p[@class='btn btn-primary btnHeight'])[2]")
		private WebElement eleRemoveButton;
		public WebElement getEleRemoveButton(){
			return eleRemoveButton;
		}
		// To identify Sign up button 
		@FindBy(name="tSignUp")
		private WebElement eleSignUpButt;
		public WebElement getEleSignUpButt(){
			return eleSignUpButt;
		}
		// To identify "Back" -Link
		@FindBy(xpath="(//a[@href='../learning/index.php'])[1]")
		private WebElement eleBackLink;
		public WebElement getEleBackLink(){
			return eleBackLink;
		}
		// To identify 'This value is required.' error message 
		@FindBy(xpath="//li[text()='This value is required.']")
		private WebElement eleValueReqErrMsg;
		public WebElement getEleValueReqErrMsg(){
			return eleValueReqErrMsg;
		}		
		// To identify 'Value should be alpha/alphanumeric' error message for invalid data
		@FindBy(xpath="//li[text()='Value should be alpha/alphanumeric']")
		private WebElement eleAlphaOrAlphanumericErrMsg;
		public WebElement getAlphaOrAlphanumericErrMsg(){
			return eleAlphaOrAlphanumericErrMsg;
		}
		// To identify 'This value should be a valid email.' error message for invalid email
		@FindBy(xpath="//li[text()='This value should be a valid email.']")
		private WebElement eleInValidEmailErrMsg;
		public WebElement getEleInValidEmailErrMsg(){
			return eleInValidEmailErrMsg;
		}	
		// To identify 'This value should be a valid phone number.' error message for invalid phone number
		@FindBy(xpath="//li[text()='This value should be a valid phone number.']")
		private WebElement eleInValidPhoneNumErrMsg1;
		public WebElement getEleInValidPhoneNumErrMsg1(){
			return eleInValidPhoneNumErrMsg1;
		}		
		// To identify 'Mobile number should not be 0' error message for invalid phone number
		@FindBy(xpath="//li[text()='Mobile number should not be 0']")
		private WebElement eleInValidPhoneNumErrMsg2;
		public WebElement getEleInValidPhoneNumErrMsg2(){
			return eleInValidPhoneNumErrMsg2;
		}			
		// To identify "This value is too short. It should have 6 characters or more." error message  for less than 6 characters
		@FindBy(xpath="//li[text()='This value is too short. It should have 6 characters or more.']")
		private WebElement eleValueIsShortErrorMsg;
		public WebElement getEleValueIsShortErrorMsg(){
		return eleValueIsShortErrorMsg;
		}	
		// To identify "This value should be the same." error message  for incorrect confirm password
		@FindBy(xpath="//li[text()='This value should be the same.']")
		private WebElement eleValueShouldSameErrorMsg;
		public WebElement getEleValueShouldSameErrorMsg(){
		return eleValueShouldSameErrorMsg;
		}
		// To identify "This value should be alphanumeric." error message for invalid data in password
		@FindBy(xpath="//li[text()='This value should be alphanumeric.']")
		private WebElement eleAlphaNumericErrMsg;
		public WebElement getEleAlphaNumericErrMsg(){
		return eleAlphaNumericErrMsg;
		}	
		// To identify 'Maximum user limit reached' error message
		@FindBy(xpath="//p[text()='Maximum user limit reached']")
		private WebElement eleMaxUserLimitErrMsg;
		public WebElement getEleMaxUserLimitErrMsg(){
		return eleMaxUserLimitErrMsg;
		}				
		
		public void SelectDateOfBirth(int year, String monthName, int expDate) throws Throwable{	
			int currentYear = Calendar.getInstance().get(Calendar.YEAR);
			int count=currentYear-year;
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).click();
			Thread.sleep(1000);
			for(int i=0;i<=count-1;i++){
					driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='prev']")).click();
				}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='"+monthName+"']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//td[text()='"+expDate+"']")).click();
		}		
}
