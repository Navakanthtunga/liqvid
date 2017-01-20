package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StudentRegPo {
	WebDriver driver=null;
public StudentRegPo(WebDriver driver)
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
	private WebElement eleMobNumText;
	public WebElement getEleMobNumText(){
		return eleMobNumText;
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
	private WebElement elePwdText;
	public WebElement getElePwdText(){
		return elePwdText;
	}
//To identify confirm Password text
	
	@FindBy(xpath="(//label[text()='Confirm Password'])[2]")
	private WebElement eleCoPwdText;
	public WebElement getEleCoPwdText(){
		return eleCoPwdText;
	}
//To identify Select Class text 
	@FindBy (xpath="(//label[text()='Select Class'])[2]")
	private WebElement eleSelClsText;
	public WebElement getEleSelClsText(){
		return eleSelClsText;
	}
//To identify Select Section text
	@FindBy(xpath="(//label[text()='Select Section'])[2]")
	private WebElement eleSelSecText;
	public WebElement getEleSelSecText(){
		return eleSelSecText;
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
		// To identify clander
		
		
		// To identify Gender drop down
		@FindBy(xpath="(//select [@id='fld_gender'])[2]")
		private WebElement eleGenderSelect;
		public WebElement getEleGenderSelect(){
			return eleGenderSelect;
		}	
		// To identify password field
		@FindBy(id="fld_Spassword")
		private WebElement elePwd;
		public WebElement getElePwd(){
			return elePwd;
		}
		// To identify confirm password field
		@FindBy(xpath="(//input[@id='confirmfld_password'])[2]")
		private WebElement eleCoPwd;
		public WebElement getEleCoPwd(){
			return eleCoPwd;
		}
		// To identify select class drop down 
		@FindBy(xpath="fld_class")
		private WebElement eleClassSel;
		public WebElement getEleClassSel(){
			return eleClassSel;
		}
		// To identify select section drop down
		@FindBy(xpath="fld_section")
		private WebElement eleSecSel;
		public WebElement getEleSecSel(){
			return eleClassSel;		 
}
		// To identify Student "sign Up" button 
		@FindBy(name="uSignUp")
		private WebElement eleStSignUpButt;
		public WebElement getEleStSignUpButt(){
			return eleStSignUpButt;
		}
		// To get the error messages that displayed if Sign up buuton is clicked
		@FindBy(xpath="//div[@ id='student']//li[@class='required']")
		private WebElement eleSerrMsgs;
		public WebElement getSeleErrMsgs(){
			return eleSerrMsgs;
		}
		// To get the error messages that displayed when min length of pwd is not entered
		@FindBy(xpath="//div[@ id='student']//li[@class='minlength']")
		private WebElement eleSlenErrMsg;
		public WebElement getEleSlenErrMsgs(){
			return eleSlenErrMsg;
		}
		// To get the error messages that displayed when pwd is not matching
			@FindBy(xpath="//div[@ id='student']//li[@class='equalto']")
			private WebElement eleSpwNotMatErrMsg;
			public WebElement getEleSpwNotMatErrMsg(){
				return eleSpwNotMatErrMsg;
			}
	}		
		
