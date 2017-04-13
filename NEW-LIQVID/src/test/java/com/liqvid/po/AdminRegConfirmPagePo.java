package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminRegConfirmPagePo {
	WebDriver driver;
		public AdminRegConfirmPagePo(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
			// To identify 'English Edge' text 
			@FindBy(xpath="//span[text()='EnglishEdge']")
			private WebElement eleLogo;
			public WebElement getEleLogo(){
				return eleLogo;
			}
			// To identify Confirmation Instructions
			@FindBy(xpath="//div[@class='col-sm-8 col-sm-offset-2']")
			private WebElement eleListConfirmationInstr;
			public WebElement getEleListConfirmationInstr(){
				return eleListConfirmationInstr;
			}
			// To identify Email ID
			@FindBy(xpath="(//strong//cite//code)[1]")
			private WebElement eleRegEmailId;
			public WebElement getEleRegEmailId(){
				return eleRegEmailId;
			}
			// To identify Mobile Number
			@FindBy(xpath="(//strong//cite//code)[2]")
			private WebElement eleRegMobileNum;
			public WebElement getEleRegMobileNum(){
				return eleRegMobileNum;
			}	
			// To identify Click here link
			@FindBy(xpath="//div[@class='col-sm-8 col-sm-offset-2']//a")
			private WebElement eleClickhereLink;
			public WebElement getEleClickhereLink(){
				return eleClickhereLink;
			}
			// To identify Next button
			@FindBy(xpath="//a[text()='Next']")
			private WebElement eleNextButt;
			public WebElement getEleNextButt(){
				return eleNextButt;
			}	
			// To identify Reset page
			@FindBy(xpath="(//div[@class='modal-content'])[1]")
			private WebElement eleResetPage;
			public WebElement getEleResetPage(){
				return eleResetPage;
			}		
			// To identify  page title
			@FindBy(xpath="//h4[text()='Retrieve Login Credentials']")
			private WebElement elePageTitle;
			public WebElement getElePageTitle(){
				return elePageTitle;
			}	
			// To identify close button
			@FindBy(xpath="//button[@class='close']")
			private WebElement eleCloseIcon;
			public WebElement getEleCloseIcon(){
				return eleCloseIcon;
			}	
			// To identify Reset page
			@FindBy(xpath="//u[contains(text(),'Step 1:')]")
			private WebElement eleStep1Text;
			public WebElement getEleStep1Text(){
				return eleStep1Text;
			}
			// To identify Reset page
			@FindBy(xpath="//h3[contains(text(),'spam folder')]")
			private WebElement eleStep1Instr;
			public WebElement getEleStep1Instr(){
				return eleStep1Instr;
			}		
			// To identify Reset page
			@FindBy(xpath="//h3[contains(text(),'spam folder')]//a")
			private WebElement eleCustomerCareEmailId;
			public WebElement getEleCustomerCareEmailId(){
				return eleCustomerCareEmailId;
			}	
			// To identify Reset page
			@FindBy(xpath="//u[text()='Step 2:']")
			private WebElement eleStep2Text;
			public WebElement getEleStep2Text(){
				return eleStep2Text;
			}	
			// To identify Reset page
			@FindBy(xpath="//button[text()='Click Here']")
			private WebElement eleClickHereResendPwd;
			public WebElement getEleClickHereResendPwd(){
				return eleClickHereResendPwd;
			}		
				
			// To identify Reset page
			@FindBy(xpath="//a[@data-target='#resetEmailMobile']")
			private WebElement eleClickHereUpdateEmailIDorPwd;
			public WebElement getEleClickHereUpdateEmailIDorPwd(){
				return eleClickHereUpdateEmailIDorPwd;
			}
			// To identify alert after sendening credentials
			@FindBy(xpath="//div[@class='alert alert-success']")
			private WebElement eleAlert;
			public WebElement getEleAlert(){
				return eleAlert;
			}
		  // To identify Reset page
			@FindBy(xpath="//div[@class='alert alert-success']//button")
			private WebElement eleAlertButton;
			public WebElement getEleAlertButton(){
				return eleAlertButton;
			}	
			// To identify Reset Email/Mobile page
			@FindBy(xpath="(//div[@class='modal-content'])[2]//h4")
			private WebElement eleResetMobileorEmailPage;
			public WebElement getEleResetMobileorEmailPage(){
				return eleResetMobileorEmailPage;
			}	
			// To identify email text
			@FindBy(xpath="//label[text()='Email']")
			private WebElement eleEmailText;
			public WebElement getEleEmailText(){
				return eleEmailText;
			}
			// To identify phone text
			@FindBy(xpath="//label[text()='Mobile']")
			private WebElement eleMobiletext;
			public WebElement getEleMobiletext(){
				return eleMobiletext;
			}
			// To identify  Email textbox
			@FindBy(id="resetEmail")
			private WebElement eleResetEmailField;
			public WebElement getEleResetEmailField(){
				return eleResetEmailField;
			}
			// To identify phone number textbox
			@FindBy(id="resetMobile")
			private WebElement eleResetMobileField;
			public WebElement getEleResetMobileField(){
				return eleResetMobileField;
			}	
			// To identify close button
			@FindBy(xpath="(//div[@class='modal-content'])[2]//button[1]")
			private WebElement eleCloseButton;
			public WebElement getEleCloseButton(){
				return eleCloseButton;
			}
			// To identify submit button
			@FindBy(xpath="(//div[@class='modal-content'])[2]//button[2]")
			private WebElement eleSubmitButton;
			public WebElement getEleSubmitButton(){
				return eleSubmitButton;
			}
}
