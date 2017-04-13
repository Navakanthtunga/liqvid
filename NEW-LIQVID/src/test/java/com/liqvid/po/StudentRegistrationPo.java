package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentRegistrationPo {
	WebDriver driver=null;
	public StudentRegistrationPo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// To identify Student tab in the registration tab
		@FindBy(id="studentLi")
		private WebElement eleStudentTab;
		public WebElement getEleStudentTab(){
			return eleStudentTab;
		}
	//To identify First Name text 
		@FindBy(xpath="(//label[text()='First Name'])[2]")
		private WebElement eleFirstNameText;
		public WebElement getEleFirstNametext(){
			return eleFirstNameText;
		}
	//To identify Last Name text 
		@FindBy(xpath="(//label[text()='Last Name'])[2]")
		private WebElement eleLastNameText;
		public WebElement getEleLastNameText(){
			return eleLastNameText;
		}
	//To identify Email id text
		@FindBy(xpath="(//label[text()='Email ID'])[2]")
		private WebElement eleEmailIdText;
		public WebElement getEleEmailIdText(){
			return eleEmailIdText;
		}
	//To identify Mobile number text
		@FindBy(xpath="(//label[text()='Mobile Number'])[2]")
		private WebElement eleMobileNumText;
		public WebElement getEleMobileNumText(){
			return eleMobileNumText;
		}
	//To identify Date of birth Text
		@FindBy(xpath="(//label[text()='Date Of Birth'])[2]")
		private WebElement eleDobText;
		public WebElement getEleDobText(){
			return eleDobText;
		}
	//To identify gender text
		@FindBy(xpath="(//label[text()='Gender'])[2]")
		private WebElement eleGenderText;
		public WebElement getEleGenderText(){
			return eleGenderText;
		}
		
	//To identify Password Text
		
		@FindBy(xpath="(//label[text()='Password'])[2]")
		private WebElement elePasswordText;
		public WebElement getElePasswordText(){
			return elePasswordText;
		}
	//To identify confirm Password text
		
		@FindBy(xpath="(//label[text()='Confirm Password'])[2]")
		private WebElement eleConfirmPasswordText;
		public WebElement getEleConfirmPasswordText(){
			return eleConfirmPasswordText;
		}
	//To identify Select Class text 
		@FindBy (xpath="(//label[text()='Select Class'])[2]")
		private WebElement eleSelectClassText;
		public WebElement getEleSelectClassText(){
			return eleSelectClassText;
		}
	//To identify Select Section text
		@FindBy(xpath="(//label[text()='Select Section'])[2]")
		private WebElement eleSelectSectionText;
		public WebElement getEleSelectSectionText(){
			return eleSelectSectionText;
	}
	// To identify First name text box
		@FindBy(xpath="(//input[@id='fld_first_name'])[2]")
		private WebElement eleFirstName;
		public WebElement getEleFirstName(){
			return eleFirstName;
		}
	// To identify Last Name text box
			@FindBy(xpath="(//input[@id='fld_last_name'])[2]")
			private WebElement eleLastName;
			public WebElement getElelastName(){
				return eleLastName;
			}
			// To identify Email id text box
			
			@FindBy(xpath="(//input[@id='fld_email'])[2]")
			private WebElement eleEmailId;
			public WebElement getEleEmailId(){
				return eleEmailId;
			}
				
			// To identify country select drop down
			@FindBy(xpath="(//div[@ class='selected-dial-code'])[2]")
			private WebElement eleCountrySelect;
			public WebElement getEleCountrySelect(){
				return eleCountrySelect;
			}
			// To identify mobile number 
			@FindBy(id="fld_mobile")
			private WebElement eleMobileNum;
			public WebElement getEleMobileNum(){
				return eleMobileNum;
			}
			// To identify Date Of Birth Text field
			@FindBy(xpath="(//i[@class='fa fa-calendar'])[2]")
			private WebElement eleDobField;
			public WebElement getEleDobField(){
				return eleDobField;
			}
			
			
			// To identify Gender drop down
			@FindBy(xpath="(//select [@id='fld_gender'])[2]")
			private WebElement eleGenderSelect;
			public WebElement getEleGenderSelect(){
				return eleGenderSelect;
			}	
			// To identify password field
			@FindBy(id="fld_Spassword")
			private WebElement elePassword;
			public WebElement getElePassword(){
				return elePassword;
			}
			// To identify confirm password field
			@FindBy(xpath="(//input[@id='confirmfld_password'])[2]")
			private WebElement eleConfirmPassword;
			public WebElement getEleConfirmPassword(){
				return eleConfirmPassword;
			}
			// To identify select class drop down 
			@FindBy(id="fld_class")
			private WebElement eleClassSelectDropdown;
			public WebElement getEleClassSelectDropdown(){
				return eleClassSelectDropdown;
			}
			// To identify select section drop down
			@FindBy(id="fld_section")
			private WebElement eleSectionSelectDropdown;
			public WebElement getEleSectionSelectDropdown(){
				return eleSectionSelectDropdown;		 
	}
			// To identify Student "sign Up" button 
			@FindBy(name="uSignUp")
			private WebElement eleSignUpButt;
			public WebElement getEleSignUpButt(){
				return eleSignUpButt;
			}
			// To identify "Back" -Link
			@FindBy(xpath="(//a[@href='../learning/index.php'])[2]")
			private WebElement eleBackLink;
			public WebElement getEleBackLink(){
				return eleBackLink;
			}
			// To identify note text 
			@FindBy(xpath="(//div[@class='form-group note'])[2]")
			private WebElement noteText;
			public WebElement getNoteText(){
				return noteText;
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
			// To identify "This value is too short. It should have 6 characters or more." error message for less than 6 characters
			@FindBy(xpath="//li[text()='This value is too short. It should have 6 characters or more.']")
			private WebElement eleValueIsShortErrorMsg;
			public WebElement getEleValueIsShortErrorMsg(){
			return eleValueIsShortErrorMsg;
			}	
			// To identify "This value should be the same." error message for incorrect confirm password
			@FindBy(xpath="//li[text()='This value should be the same.']")
			private WebElement eleValueShouldSameErrorMsg;
			public WebElement getEleValueShouldSameErrorMsg(){
			return eleValueShouldSameErrorMsg;
			}
			// To identify "This value should be alphanumeric." error message for invalid data in passwords
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
}
