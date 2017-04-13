package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminProfilePagePo {
	WebDriver driver=null;
	public AdminProfilePagePo(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// To identify 'Profile' text
		@FindBy(xpath="//div[@ class='panel-heading heading']//div")
		private WebElement eleProfileTxt;
		public WebElement getEleProfileTxt(){
			return eleProfileTxt;
		}	
// To identify First Name text
	@FindBy(xpath="//label[contains(text(),'First Name')]")
	private WebElement eleFirstNameTxt;
	public WebElement getEleFirstNameTxt(){
		return eleFirstNameTxt;
	}
// To identify First Name Text field
	@FindBy(name="first_name")
	private WebElement eleFirstNameTxtFld;
	public WebElement getEleFirstNameTxtFld(){
		return eleFirstNameTxtFld;
	}
// To identify Last Name text 
	@FindBy(xpath="//label[contains(text(),'Last Name')]")
	private WebElement eleLastNameTxt;
	public WebElement getEleLastNameTxt(){
		return eleLastNameTxt;
	}
// To identify Last Name text field 
	@FindBy(name="last_name")
	private WebElement eleLastNameTxtFld;
	public WebElement getEleLastNameTxtFld(){
		return eleLastNameTxtFld;
	}
// To identify 	Email Id .
	@FindBy(xpath="//label[contains(text(),'Email ID')]")
	private WebElement eleEmailIdTxt;
	public WebElement getEleEmailIdTxt(){
		return eleEmailIdTxt;
	}
// To identify Email Id text box
	@FindBy(name="email_id")
	private WebElement eleEmailIdTxtFld;
	public WebElement getEleEmailIdTxtFld(){
		return eleEmailIdTxtFld;
	}
// To identify Phone Text 
	@FindBy(xpath="//label[contains(text(),'Phone')]")
	private WebElement elePhoneTxt;
	public WebElement getElePhoneTxt(){
		return elePhoneTxt;
	}
// To identify phone Text field
	@FindBy(name="phone")
	private WebElement elePhoneTextBox;
	public WebElement getElePhoneTextBox(){
		return elePhoneTextBox;
	}
// To identify Date Of Birth Text 
	@FindBy(xpath="//label[contains(text(),'Date Of Birth')]")
	private WebElement eleDobText;
	public WebElement getEleDobText(){
		return eleDobText;
	}
	// To identify Date Of Birth Text field
		@FindBy(id="date_of_birth")
		private WebElement eleDobTextbox;
		public WebElement getEleDobTextbox(){
			return eleDobText;
		}	
// To identify calander icon  
	@FindBy(xpath="//div[@id='divBirthDate']//i")
	private WebElement eleCalenderIcon;
	public WebElement getEleCalenderIcon(){
		return eleCalenderIcon;
	}
// To identify Gender Text
	@FindBy(xpath="//label[contains(text(),'Gender')]")
	private WebElement eleGenderText;
	public WebElement getGenderText(){
		return eleGenderText;
	}
// To identify Gender dropdown 
	@FindBy(id="gender")
	private WebElement eleSelGender;
	public WebElement getEleSelGender(){
		return eleSelGender;
	}
	// To identify 'Plus' icon in Change Password Button
		@FindBy(xpath="//i[@class='passwordIcon fa fa-plus']")
		private WebElement elePlusIcon;
		public WebElement getElePlusIcon(){
			return elePlusIcon;
		}
		// To identify 'Minus' icon in Change Password Button
		@FindBy(xpath="//i[@class='passwordIcon fa fa-minus']")
		private WebElement eleMinusIcon;
		public WebElement getEleMinusIcon(){
			return eleMinusIcon;
		}		
// To identify Change Password Button
	@FindBy(xpath="//a[contains(text(),'Change Password')]")
	private WebElement eleChangePasswordButton;
	public WebElement getEleChangePasswordButton(){
		return eleChangePasswordButton;
	}
// To identify Old password text 
	@FindBy(xpath="//label[contains(text(),'Old Password')]")
	private WebElement eleOldPwdText;
	public WebElement getEleOldPwdText(){
		return eleOldPwdText;
	}
// To identify Old password text box
	@FindBy(id="oldPassword")
	private WebElement eleOldPwdTextBox;
	public WebElement getEleOldPwdTextBox(){
		return eleOldPwdTextBox;
	}
// To identify 	New Password Text
	@FindBy(xpath="//label[contains(text(),' New Password')]")
	private WebElement eleNewPwdText;
	public WebElement getEleNewPwdText(){
		return eleNewPwdText;
	}
// To identify new Password text box
	@FindBy(id="newPassword")
	private WebElement eleNewPwdTextBox;
	public WebElement getEleNewPwdTextBox(){
		return eleNewPwdTextBox;
	}
// To identify Confirm password text 
	@FindBy(xpath="//label[contains(text(),'Confirm Password')]")
	private WebElement eleConNewPwdText;
	public WebElement getEleConNewPwdText(){
		return eleConNewPwdText;
	}
// To identify Confirm password text box
	@FindBy(id="cnfPassword" )
	private WebElement eleConNewPwdTextBox;
	public WebElement getEleConNewPwdTextBox(){
		return eleConNewPwdTextBox;
	}
// To identify Update button
	@FindBy(name="update")
	private WebElement eleUpdateButton;
	public WebElement getUpdateButton(){
		return eleUpdateButton;
	}
	// To identify "The Value is required." error message
		@FindBy(id="errMsg")
		private WebElement eleUpdatedSuccessfullyMsg;
		public WebElement getEleUpdatedSuccessfullyMsg(){
			return eleUpdatedSuccessfullyMsg;
		}
// To identify "The Value is required." error message
	@FindBy(xpath="//li[contains(text(),'This value is required.')]")
	private WebElement eleValueReqErrMsg;
	public WebElement getEleValueReqErrMsg(){
		return eleValueReqErrMsg;
	}
// To identify "This value should be a valid email." error message 
	@FindBy(xpath="//li[contains(text(),'This value should be a valid email.')]")
	private WebElement eleMailIdErrMsg;
	public WebElement getEleMailIdErrMsg(){
		return eleMailIdErrMsg;
	}	
// To identify "This value should be a valid phone number." error message 
	@FindBy(xpath="//li[contains(text(),'This value should be a valid phone number.')]")
	private WebElement elePhoneNumErrMsg;
	public WebElement getElePhoneNumErrMsg(){
		return elePhoneNumErrMsg;
	}	
// To identify "Invalid Old password " error message 
	@FindBy(id="oldPasswordError")
	private WebElement eleOldPwdErrMsg;
	public WebElement getEleOldPwdErrMsg(){
		return eleOldPwdErrMsg;
	}	
// To identify "This value is too short. It should have 6 characters or more." text
	@FindBy(xpath="//li[contains(text(),'This value is too short. It should have 6 characters or more.')]")
	private WebElement eleValueShortErrMsg;
	public WebElement getEleValueShortErrMsg(){
		return eleValueShortErrMsg;
	}		
// To identify "This value should be the same." Error message
	@FindBy(xpath="//li[contains(text(),'This value should be the same.')]")
	private WebElement eleValueSameErrMsg;
	public WebElement getEleValueSameErrMsg(){
		return eleValueSameErrMsg;
	}
}
