package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePo {
WebDriver driver=null;
public AdminHomePo(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	// To identify logo 
	@FindBy(xpath="//a[@class='navbar-brand' ]//img")
	private WebElement eleLogo;
	public WebElement getEleLogo(){
		return eleLogo;
	}
	// To identify Day, Date and Time
	@FindBy(xpath="//div[@class='formalFontFamily']")
	private WebElement eleDateandTime;
	public WebElement getEleDateandTime(){
		return eleDateandTime;
	}
	// To identify  Home icon
	@FindBy(xpath="//li[@id='home']//i")
	private WebElement eleHomeIcon;
	public WebElement getEleHomeIcon(){
		return eleHomeIcon; 
	}
	// To identify  Home Text
	@FindBy(xpath="//span[contains(text(),'Home')]")
	private WebElement eleHomeText;
	public WebElement getEleHomeText(){
		return eleHomeText; 
	}
	// To identify license update icon 
	@FindBy(xpath="//a[@ href='license_update.php']//i")
	private WebElement eleLicUpIcon;
	public WebElement getEleLicUpIcon(){
		return eleLicUpIcon;
	}
	// To identify license update text
	@FindBy(xpath="//span[contains(text(),'License Update')]")
	private WebElement eleLicUpText;
	public WebElement getEleLicUpText(){
		return eleLicUpText;
	}
	// To identify Create Batch icon
	@FindBy(xpath="//a[@ href='createBatch.php']//i")
	private WebElement eleCreBatIcon;
	public WebElement getEleCreBatIcon(){
		return eleCreBatIcon;
	}
	// To identify Create Batch
	@FindBy(id="cbatch")
	private WebElement eleCreBatText;
	public WebElement getEleCreBatText(){
		return eleCreBatText;
	}
	// To identify Batch report icon
	@FindBy(xpath="//a[@ href='batchreport.php']//i")
	private WebElement eleBatRepIcon;
	public WebElement getEleBatRepIcon(){
		return eleBatRepIcon;
	}
	// To identify Batch report text
		@FindBy(xpath="//span[contains(text(),'Batch Report')]")
		private WebElement eleBatRepText;
		public WebElement getEleBatRepText(){
			return eleBatRepIcon;
		}
	// To identify Batch Student Upload icon
	@FindBy(xpath="//a[@href='bulkUpload.php']//i")
	private WebElement eleStUploadIcon;
	public WebElement getEleStUploadIcon(){
		return eleStUploadIcon;
	}
	// To identify Batch Student Upload text
		@FindBy(xpath="//span[contains(text(),'Student Upload')]")
		private WebElement eleStUploadText;
		public WebElement getEleStUploadText(){
			return eleStUploadText;
		}
	// To identify Batch Resource icon
		@FindBy(xpath="//a[@href='resources.php']//i")
		private WebElement eleResourceIcon;
		public WebElement getEleResourceIcon(){
			return eleResourceIcon;
		}
	// To identify Batch Resource text
			@FindBy(xpath="//span[contains(text(),'Resources')]")
			private WebElement eleResourceText;
			public WebElement getEleResourceText(){
				return eleResourceText;
			}		
	// To identify Batch Sign out icon
		@FindBy(xpath="//a[@href='logout.php']//i")
		private WebElement eleSignOutIcon;
		public WebElement getEleSignOutIcon(){
			return eleSignOutIcon;
		}
	// To identify Batch Sign out text
		@FindBy(xpath="//span[contains(text(),'Sign out')]")
		private WebElement eleSignOutText;
		public WebElement getEleSignOutText(){
			return eleSignOutText;
		}		
	// To identify Welcome! 
	@FindBy(xpath="//div[contains(text(),'Welcome!')]")
	private WebElement eleWelcomeText;
	public WebElement getEleWelcome(){
		return eleWelcomeText;
	}
	// To identify Profile Image
	@FindBy(xpath="//form[@id='profile-pic-form']//img")
	private WebElement eleProImg;
	public WebElement getEleProImg(){
		return eleProImg;
	}
	// To identify Last Login text
	@FindBy(xpath="//div[contains(text(),'Last Login')]")
	private WebElement eleLaLoginText;
	public WebElement getEleLaLoginText(){
		return eleLaLoginText;
	}
	// To identify Last Sync text
	@FindBy(xpath="//div[contains(text(),'Last Sync')]")
	private WebElement eleLaSyncText;
	public WebElement getEleLaSyncText(){
		return eleLaSyncText;
	}
	// To identify License Expiry text
		@FindBy(xpath="(//div[contains(text(),'Licence Expiry Date')]")
		private WebElement eleLicExpText;
		public WebElement getEleLicExpText(){
			return eleLicExpText;
		}
		// To identify Acess URL text
		@FindBy(xpath="(//div[contains(text(),'Access URL')]")
		private WebElement eleAccUrlText;
		public WebElement getEleAccUrlText(){
			return eleAccUrlText;
		}
	// To identify Admin Details
	@FindBy(xpath="//div[@ class='col-sm-9']")
	private WebElement eleAdminDetails;
	public WebElement getEleAdminDetails(){
		return eleAdminDetails;
	}
	
	// To identify Courses details box
		@FindBy(xpath="(//div[@ class='col-sm-6 col-md-3 padder-v b-light'])[1]")
		private WebElement eleCoBox;
		public WebElement getEleCoBox(){
			return eleCoBox;
		}
	// To identify Batches details box
	@FindBy(xpath="//div[@ class='col-sm-6 col-md-3 padder-v b-r b-l b-light lt']")
	private WebElement eleBaBox;
	public WebElement getEleBaBox(){
		return eleBaBox;
	}
	// To identify Teachers details Box 
	@FindBy(xpath="(//div[@ class='col-sm-6 col-md-3 padder-v b-light'])[2]")
	private WebElement eleTBox;
	public WebElement getEleTBox(){
		return eleTBox;
	}
	
	// To identify Student details Box 
		@FindBy(xpath="//div [@class='col-sm-6 col-md-3 padder-v b-l b-light lt']")
		private WebElement eleStBox;
		public WebElement getEleStBox(){
			return eleStBox;
		}
	//To identify No of courses
		@FindBy(xpath="(//a[@href='#']//strong)[1]")
		private WebElement eleCoCount;
		public WebElement getEleCoCount(){
			return eleCoCount;
		}
	// To identify No of Batches
		@FindBy(xpath="(//a[@href='#']//strong)[2]")
		private WebElement eleBatCount;
		public WebElement getEleBatCount(){
			return eleBatCount;
		}
	// To identify No of Teachers
		@FindBy(xpath="(//a[@href='#']//strong)[3]")
		private WebElement eleTeCount;
		public WebElement getEleTeCount(){
			return eleTeCount;
		}
	// To identify No of students 
		@FindBy(xpath="(//a[@href='#']//strong)[4]")
		private WebElement eleStCount;
		public WebElement getEleStCount(){
			return eleStCount;
		}
	// To identify the chart
		@FindBy(xpath="(//canvas[@ class='canvasjs-chart-canvas'])[1]")
		private WebElement eleChart;
		public WebElement getEleChart(){
			return eleChart;
		}
	// To identify the 1st paragraph text
		@FindBy(xpath="(//div[@ id='coursebased']//div//p)[1]")
		private WebElement eleParaText1;
		public WebElement getEleParaText1(){
			return eleParaText1;
		}
	// To identify the 2nd Paragraph text
		@FindBy(xpath="(//div[@ id='coursebased']//div//p)[2]")
		private WebElement eleParaText2;
		public WebElement getParaText2(){
			return eleParaText2;
		}
	// To identify Footer-Copyright
		@FindBy(id="footer-copyright")
		private WebElement eleFootCopyRightText;
		public WebElement getEleFootCopyRightText(){
			return eleFootCopyRightText;
		}
	// To identify Footer terms
		@FindBy(id="footer-terms")
		private WebElement eleFooterTerms;
		public WebElement getEleFooterTerms(){
			return eleFooterTerms;
		}
	// TO identify profile image in the header
		@FindBy(xpath="//img[@id='viewImgProfileHeader']")
		private WebElement eleHedProImg;
		public WebElement getEleHedProImg(){
			return eleHedProImg;
		}
		
		
		
	// To identify Profile dropdown icon
		@FindBy(id="userDtl")
		private WebElement eleProDropDownIcon;
		public WebElement getEleProDropDownIcon(){
			return eleProDropDownIcon;
		}
	// To identify Profile 
		@FindBy(xpath="//a[contains(text(),'Profile')]")
		private WebElement eleProfile;
		public WebElement getEleProfile(){
			return eleProfile;
		}		
	// To identify sign out
		@FindBy(xpath="//a[contains(text(),'Sign out')]")
		private WebElement eleSignOut;
		public WebElement getEleSignOut(){
			return eleSignOut;
		}					
	// To identify First Name text
		@FindBy(xpath="//label[contains(text(),'First Name')]")
		private WebElement eleFnameText;
		public WebElement getEleFnameText(){
			return eleFnameText;
		}
		
	// To identify First Name Text field
		@FindBy(name="first_name")
		private WebElement eleFnameTextBox;
		public WebElement getElleFnameTextBox(){
			return eleFnameTextBox;
		}
	// To identify Last Name text 
		@FindBy(xpath="//label[contains(text(),'Last Name')]")
		private WebElement eleLnameText;
		public WebElement getEleLnameText(){
			return eleLnameText;
		}
	// To identify Last Name text field 
		@FindBy(name="last_name")
		private WebElement eleLnameTextBox;
		public WebElement getEleLnameTextBox(){
			return eleLnameTextBox;
		}
	// To identify 	Email Id .
		@FindBy(xpath="//label[contains(text(),'Email ID')]")
		private WebElement eleEmailIdText;
		public WebElement getEleEmailIdText(){
			return eleEmailIdText;
		}
	// To identify Email Id text box
		@FindBy(name="email_id")
		private WebElement eleEmailIdTextBox;
		public WebElement getEleEmailIdTextBox(){
			return eleEmailIdTextBox;
		}
	// To identify Phone Text 
		@FindBy(xpath="//label[contains(text(),'Phone')]")
		private WebElement elePhoneText;
		public WebElement getElePhoneText(){
			return elePhoneText;
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
	// To identify Date of birth text box 
		
	// To identify calander 
		
	// To identify Gender Text
		@FindBy(xpath="//label[contains(text(),'Gender')]")
		private WebElement eleGenText;
		public WebElement getGenText(){
			return eleGenText;
		}
	// To identify Gender dropdown 
		@FindBy(id="gender")
		private WebElement eleSelGender;
		public WebElement getEleSelGender(){
			return eleSelGender;
		}
	// To identify Change Password Button
		@FindBy(xpath="//a[contains(text(),'Change Password')]")
		private WebElement eleChPwdButt;
		public WebElement getEleChPwdButt(){
			return eleChPwdButt;
		}
	// To identify Old password text 
		@FindBy(xpath="//label[contains(text(),'Old Password')]")
		private WebElement eleOldPwdText;
		public WebElement getEleOldPwdText(){
			return eleChPwdButt;
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
		private WebElement eleUpdateButt;
		public WebElement getUpdateButt(){
			return eleUpdateButt;
		}
	// To identify "The Value is required." error message
		@FindBy(xpath="//li[contains(text(),'This value is required.')]")
		private WebElement eleErrMsg;
		public WebElement getEleErrMsg(){
			return eleErrMsg;
		}
	// To identify "This value should be a valid email." error message 
		@FindBy(xpath="//li[contains(text(),'This value should be a valid email.')]")
		private WebElement eleMailIdErrMsg;
		public WebElement getEleMailIdErrMsg(){
			return eleMailIdErrMsg;
		}	
	// To identify "This value should be a valid phone number." error message 
		@FindBy(xpath="//li[contains(text(),'This value should be a valid phone number.')]")
		private WebElement elePhNoErrMsg;
		public WebElement getElePhNoErrMsg(){
			return elePhNoErrMsg;
		}	
	// To identify "Invalid Old password " error message 
		@FindBy(id="oldPasswordError")
		private WebElement eleOldPwdErrMsg;
		public WebElement getEleOldPwdErrMsg(){
			return eleOldPwdErrMsg;
		}	
	// To identify "This value is too short. It should have 6 characters or more." text
		@FindBy(xpath="//li[contains(text(),'This value is too short. It should have 6 characters or more.')]")
		private WebElement elePwdErrMsg;
		public WebElement getElePwdErrMsg(){
			return elePwdErrMsg;
		}		
	// To identify "This value should be the same." Error message
		@FindBy(xpath="//li[contains(text(),'This value should be the same.')]")
		private WebElement eleSamepwdErrMsg;
		public WebElement getEleSamepwdErrMsg(){
			return eleSamepwdErrMsg;
		}
	// To identify Notifications
}
