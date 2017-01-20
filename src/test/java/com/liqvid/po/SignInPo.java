package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPo {
	WebDriver driver=null;
public SignInPo(WebDriver driver){
this.driver=driver;
PageFactory.initElements(driver, this);
}
	// To identify the web element -- Logo

		@FindBy(xpath="//section[@class='main-votex']//img")
		private WebElement eleLogo;
		public WebElement getEleLogo(){
			return eleLogo;
		}
	// To identify the text 'Sign in'
		@FindBy(xpath="//p[@class='student-title']")
		private WebElement eleSignInText;
		public WebElement getEleSignInText(){
			return eleSignInText;
		}
	// To identify instructions text to sign in
		
		@FindBy(xpath="//p[contains(text(),'Please register and login with your username and password.')]")
		private WebElement eleSignInInstrText;
		public WebElement getEleSignInInstrText(){
			return eleSignInInstrText;
		}
	// To identify username text 
		@FindBy(xpath="//label[contains(text(),'Username ')]")
		private WebElement eleUnameText;
		public WebElement getEleUnameText(){
			return eleUnameText;
		}
	// To identify the web element -- UserName text field
		@FindBy(xpath="//input [@id='LoginForm_username']")
		private WebElement eleUname;
		public WebElement getEleUname(){
			return eleUname;
		}
	// To identify Password text
		@FindBy(xpath="//label[contains(text(),'Password')]")
		private WebElement elePwdText;
		public WebElement getElePwdText(){
			return elePwdText;
		}
	// To identify the web element password text field
		@FindBy(xpath="//input[@id='LoginForm_password']")
		private WebElement elePassword;
		public WebElement getElePassword(){
			return elePassword;			
		}
	// To identify Web element sign in button
		@FindBy(xpath="//input[contains(@type,'submit')]")
		private WebElement  eleSignInButt;
		public WebElement EleSignInButt(){
			return eleSignInButt;
		}			
	// To identify the error message displaying at username text box
		@FindBy(id="LoginForm_username_em_")
		private WebElement eleUerrMsg;
		public WebElement getEleUerrMsg(){
			return eleUerrMsg;
		}
	// To identify the error message displaying at Password text box
		@FindBy(id="LoginForm_password_em_")
		private WebElement elePerrMsg;
		public WebElement getElePerrMsg(){
			return elePerrMsg;
		}
	// To identify the web element Forgot password
		@FindBy(xpath="//small[contains(text(),'Forgot password')]")
		private WebElement eleForgotPassLink;
		public WebElement getEleForgotPassLink(){
			return eleForgotPassLink;
		}			
	// To identify instruction text to register
		@FindBy(xpath="//p[contains(text(),'First-time user, register here.')]")
		WebElement eleRegisterInstrText;
		public WebElement getEleRegisterInstrText(){
			return eleRegisterInstrText;
		}			
	// To identify the registration web element 
		@FindBy(xpath="//small[contains(text(),'Registration')]")
		private WebElement eleRegister;
		public WebElement getEleRegister(){
			return eleRegister;
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
}