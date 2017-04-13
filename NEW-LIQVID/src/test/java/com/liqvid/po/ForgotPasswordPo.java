package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPo {
	WebDriver driver = null;
	public static int sStatusCnt=0;
	public ForgotPasswordPo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		// To identify the web element -- Logo
		@FindBy(xpath="//a[@class='navbar-brand']//img")
		private WebElement eleLogo;
		public WebElement getEleLogo(){
			return eleLogo;
		}
		// To identify 'EnglishEdge Setup' text
		@FindBy(xpath="//div[text()='EnglishEdge Setup']")
		private WebElement eleEnglishEdgeSetupText;
		public WebElement getEleEnglishEdgeSetupText(){
			return eleEnglishEdgeSetupText;
		}	
		// To identify Forgot password Instructions
		@FindBy(xpath="//div[@class='col-sm-8 col-sm-offset-2']")
		private WebElement eleForgotPasswdInstr;
		public WebElement getEleForgotPasswdInstr(){
			return eleForgotPasswdInstr;
		}
		// To identify 'Click Here' Link
		@FindBy(xpath="//u[text()='Click Here']")
		private WebElement eleClickHereLink;
		public WebElement getEleClickHereLink(){
			return eleClickHereLink;
		}
		// To identify 'Back' button
		@FindBy(xpath="//a[text()='Back']")
		private WebElement eleBackButton;
		public WebElement getEleBackButton(){
			return eleBackButton;
		}	
	    //To verify Customer Support text in registration page
		@FindBy(xpath="//strong[text()='Customer Support']")
		private WebElement eleCustomerSupportText;
		public WebElement getEleCustomerSupportText()
		{
		   return eleCustomerSupportText;
		}
	    //To verify Customer Care Contact details in registration page
		@FindBy(xpath="(//div[@class='footerMail'])[2]")
		private WebElement eleCustomerCareContactDetails;
		public WebElement getEleCustomerCareContactDetails()
		{
			return eleCustomerCareContactDetails;
		}	   
		//To verify  Customer Care Email Id  registration page
		@FindBy(xpath="((//div[@class='footerMail'])[2])//a")
		private WebElement eleCustomerCareEmailId;
		public WebElement getEleCustomerCareEmailId()
		{
			 return eleCustomerCareEmailId;
		}	
		// To verify English edge website link in registration page  
		@FindBy(xpath="((//div[@class='footerMail'])[3])")
		private WebElement eleEnglishEdgeWebsitelink;
		public WebElement getEleEnglishEdgeWebsitelink()
		{
			return eleEnglishEdgeWebsitelink;
		}
		// To verify Copy Right text in registration page  
		@FindBy(id="footer-terms")
		private WebElement eleCopyRightsText;
		public WebElement getEleCopyRightsText()
		{
		    return eleCopyRightsText;
		}	
		// To verify Welcome to Admin password reset console 
		@FindBy(xpath="//h1[text()='Welcome to Admin password reset console']")
		private WebElement eleWelcomeText;
		public WebElement getEleWelcomeText()
		{
			return eleWelcomeText;
		}
		// To verify Login id Text box
		@FindBy(id="center_code")
		private WebElement eleLoginIdTextField;
		public WebElement getEleLoginIdTextField()
		{
			return eleLoginIdTextField;
		}
		// To verify Password Instruction text
		@FindBy(xpath="//div[@class='col-sm-12']//p")
		private WebElement elePasswdInstrText;
		public WebElement getElePasswdInstrText()
		{
			return elePasswdInstrText;
		}				
		// To verify 'Back' button 
		@FindBy(xpath="//a[text()='Back']")
		private WebElement eleConsolePageBackButton;
		public WebElement getEleConsolePageBackButton()
		{
			return eleConsolePageBackButton;
		}
		// To verify 'Submit' button
		@FindBy(xpath="//button[text()='Submit']")
		private WebElement eleSubmitButton;
		public WebElement getEleSubmitButton()
		{
			return eleSubmitButton;
		}//div[@class='alert alert-success']
		// To verify Alert
		@FindBy(xpath="//div[@class='alert alert-danger']")
		private WebElement eleErrorAlert;
		public WebElement getEleErrorAlert()
		{
			return eleErrorAlert;
		}
		// To verify Close icon in alert
		@FindBy(xpath="//div[@class='alert alert-danger']//button")
		private WebElement eleErrorCloseIcon;
		public WebElement getEleErrorCloseIcon()
		{
			return eleErrorCloseIcon;
		}
		// To verify Success Alert
		@FindBy(xpath="//div[@class='alert alert-success']")
		private WebElement eleSuccessAlert;
		public WebElement getEleSuccessAlert()
		{
			return eleSuccessAlert;
		}
		// To verify Close icon in Success alert
		@FindBy(xpath="//div[@class='alert alert-success']//button")
		private WebElement eleSucessAlertCloseIcon;
		public WebElement getEleSucessAlertCloseIcon()
		{
			return eleSucessAlertCloseIcon;
		}
		
		//To give id in gmail to verify admin credential
		@FindBy(xpath=".//*[@id='Email']")
		private WebElement eleEmailIdField;
		public WebElement getEleEmailIdField()
		{
			return eleEmailIdField;
		}
		//next button in gmail
		@FindBy(id="next")
		private WebElement eleNextButton;
		public WebElement getEleNextButton()
		{
			return eleNextButton;
		}
		//password field
		@FindBy(id="Passwd")
		private WebElement elePasswordField;
		public WebElement getElePasswordField()
		{
			return elePasswordField;
		}
		//signin button
		@FindBy(id="signIn")
		private WebElement eleSigninButton;
	    public WebElement getEleSigninButton()
		{
			return eleSigninButton;
		}
	    //click on customercare link in gmail
	    @FindBy(xpath="//b[contains(text(),'Your Password for Liqvid Network')]")
		private WebElement elePasswordResetLink;
	    public WebElement getElePasswordResetLink()
		{
			return elePasswordResetLink;
		}
	    //login id in from gmail
		 @FindBy(xpath=".//*[@id=':p2']/table/tbody/tr[3]/td/div[4]")
		private WebElement eleLogIn;
	    public WebElement getEleLogIn()
		{
			return eleLogIn;
		}
	    //user name credential
	    @FindBy(xpath="//div[@style='padding:0px 10px 10px 10px']/../div[4]")
		private WebElement eleUsername;
	    public WebElement getEleUsername()
		{
			return eleUsername;
		}
	   @FindBy(xpath="//div[@style='padding:0px 10px 10px 10px']/../div[5]")
		private WebElement elePassword;
		public WebElement getElePassword()
		{
			return elePassword;
		}
		@FindBy(xpath="//div[@class='alert alert-danger']")
		private WebElement eleInvalidMailIdErrorMsg;
		public WebElement getEleInvalidMailIdErrorMsg()
		{
			return eleInvalidMailIdErrorMsg;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
