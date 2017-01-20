package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherRegPo {

	WebDriver driver=null;
	public TeacherRegPo(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
// To identify instruction text for Teacher's registration 
	@FindBy(xpath="//p[contains(text(),'First-time user, register here.')]")
	private WebElement eleRegInstrText;
	public WebElement getEleRegInstrText(){
		return eleRegInstrText;
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
	private WebElement eleMobNumText;
	public WebElement getEleMobNumText(){
		return eleMobNumText;
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
	private WebElement elePwdText;
	public WebElement getElePwdText(){
		return elePwdText;
	}
// To identify confirm Password text
	
	@FindBy(xpath="(//label[text()='Confirm Password'])[1]")
	private WebElement eleCoPwdText;
	public WebElement getEleCoPwdText(){
		return eleCoPwdText;
	}
// To identify Select Class text 
	@FindBy (xpath="(//label[text()='Select Class'])[1]")
	private WebElement eleSelClsText;
	public WebElement getEleSelClsText(){
		return eleSelClsText;
	}
// To identify Select Section text
	@FindBy(xpath="(//label[text()='Select Section'])[1]")
	private WebElement eleSelSecText;
	public WebElement getEleSelSecText(){
		return eleSelSecText;
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
	// To identify clander
	
	
	// To identify Gender drop down
	@FindBy(xpath="(//select [@id='fld_gender'])[1]")
	private WebElement eleGenderSelect;
	public WebElement getEleGenderSelect(){
		return eleGenderSelect;
	}	
	// To identify password field
	@FindBy(id="fld_password")
	private WebElement elePwd;
	public WebElement getElePwd(){
		return elePwd;
	}
	// To identify confirm password field
	@FindBy(xpath="(//input[@id='confirmfld_password'])[1]")
	private WebElement eleCoPwd;
	public WebElement getEleCoPwd(){
		return eleCoPwd;
	}
	// To identify select class drop down -1
	@FindBy(id="fld_class1")
	private WebElement eleClassSel;
	public WebElement getEleClassSel(){
		return eleClassSel;
	}
	// To identify select section drop down -1
	@FindBy(id="fld_section1")
	private WebElement eleSecSel;
	public WebElement getEleSecSel(){
		return eleClassSel;
	}
	// To identify Add button
	@FindBy(xpath="(//p[@class='btn btn-primary btnHeight'])[1]")
	private WebElement eleAddButt;
	public WebElement getEleAddButt(){
		return eleAddButt;
	}
	
	// To identify Select class drop down-2
	@FindBy(id="fld_class2")
	private WebElement eleClassSel2;
	public WebElement getEleClassSel2(){
		return eleClassSel2;
	}
	
	// To identify Select section drop down -2
	@FindBy(id="fld_section2")
	private WebElement eleSecSel2;
	public WebElement getEleSecSel2(){
		return eleSecSel2;
	}
	// To identify Select class drop down -3
	@FindBy(id="fld_class3")
	private WebElement eleClassSel3;
	public WebElement getEleClassSel3(){
		return eleClassSel3;
	}
	
	// To identify Select section drop down -3
		@FindBy(id="fld_section3")
		private WebElement eleSecSel3;
		public WebElement getEleSecSel3(){
			return eleSecSel2;
		}
	// To identify remove button 
	@FindBy(xpath="(//p[@class='btn btn-primary btnHeight'])[2]")
	private WebElement eleRemoveButt;
	public WebElement getEleRemoveButt(){
		return eleRemoveButt;
	}
	// To identify Sign up button 
	@FindBy(name="tSignUp")
	private WebElement eleSignInButt;
	public WebElement getEleSignInButt(){
		return eleSignInButt;
	}
	// To identify "Back" -Link
	@FindBy(xpath="(//a[@href='../learning/index.php'])[1]")
	private WebElement eleBackLink;
	public WebElement getEleBackLink(){
		return eleBackLink;
	}
// To get the error messages that displayed if Sign up buuton is clicked
	@FindBy(xpath="//div[@ id='teacher']//li[@class='required']")
	private WebElement eleTerrMsgs;
	public WebElement getTeleErrMsgs(){
		return eleTerrMsgs;
	}
	
// To get the error messages that displayed when min length of pwd is not entered
	@FindBy(xpath="//div[@ id='teacher']//li[@class='minlength']")
	private WebElement eleTlenErrMsg;
	public WebElement getEleTlenErrMsgs(){
		return eleTlenErrMsg;
	}
	// To get the error messages that displayed when pwd is not matching
		@FindBy(xpath="//div[@ id='teacher']//li[@class='equalto']")
		private WebElement eleTpwNotMatErrMsg;
		public WebElement getEleTpwNotMatErrMsg(){
			return eleTpwNotMatErrMsg;
		}
}

