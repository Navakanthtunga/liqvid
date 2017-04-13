package com.liqvid.po;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminHomePo {
	WebDriver driver=null;
	public AdminHomePo(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		// To identify logo in Home Page
		@FindBy(xpath="//a[@class='navbar-brand logoImg']//img")
		private WebElement eleEnglishEdgeLogo;
		public WebElement getEleEnglishEdgeLogo(){
			return eleEnglishEdgeLogo;
		}
		// To identify Version Code in Home Page
		@FindBy(xpath="//p[@class='versionCode']")
		private WebElement eleVersionCode;
		public WebElement getEleVersionCode(){
			return eleVersionCode;
		}		
		// To identify  Home icon in Home Page
		@FindBy(xpath="//li[@id='home']//i")
		private WebElement eleHomeIcon;
		public WebElement getEleHomeIcon(){
			return eleHomeIcon; 
		}
		// To identify  Home Text in Home Page
		@FindBy(xpath="//span[contains(text(),'Home')]")
		private WebElement eleHomeText;
		public WebElement getEleHomeText(){
			return eleHomeText; 
		}
		// To identify license update icon in Home Page
		@FindBy(xpath="//a[@ href='license_update.php']//i")
		private WebElement eleLicenseUpdateIcon;
		public WebElement getEleLicenseUpdateIcon(){
			return eleLicenseUpdateIcon;
		}
		// To identify license update text in Home Page
		@FindBy(xpath="//span[text()='License Update']")
		private WebElement eleLicenseUpdateText;
		public WebElement getEleLicenseUpdateText(){
			return eleLicenseUpdateText;
		}
		// To identify Create Batch icon in Home Page
		@FindBy(xpath="//a[@ href='createBatch.php']//i")
		private WebElement eleCreateBatchIcon;
		public WebElement getEleCreateBatchIcon(){
			return eleCreateBatchIcon;
		}
		// To identify Create Batch text in Home Page
		@FindBy(xpath="//span[contains(text(),'Create Batch')]")
		private WebElement eleCreateBatchText;
		public WebElement getEleCreateBatchText(){
			return eleCreateBatchText;
		}
		// To identify Batch report icon in Home Page
		@FindBy(xpath="//a[@ href='batchreport.php']//i")
		private WebElement eleBatchReportIcon;
		public WebElement getEleBatchReportIcon(){
			return eleBatchReportIcon;
		}
		// To identify Batch report text in Home Page
		@FindBy(xpath="//span[text()='Batch Report']")
		private WebElement eleBatchReportText;
		public WebElement getEleBatchReportText(){
			return eleBatchReportText;
		}
		// To identify Student Upload icon in Home Page
		@FindBy(xpath="//a[@href='bulkUpload.php']//i")
		private WebElement eleStudentUploadIcon;
		public WebElement getEleStudentUploadIcon(){
			return eleStudentUploadIcon;
		}
		// To identify Student Upload text in Home Page
		@FindBy(xpath="//span[text()='Student Upload']")
		private WebElement eleStudentUploadText;
		public WebElement getEleStudentUploadText(){
			return eleStudentUploadText;
		}
		// To identify Resources icon in Home Page
		@FindBy(xpath="//a[@href='resources.php']//i")
		private WebElement eleResourcesIcon;
		public WebElement getEleResourcesIcon(){
			return eleResourcesIcon;
		}
		// To identify Resources text in Home Page
		@FindBy(xpath="//span[text()='Resources']")
		private WebElement eleResourcesText;
		public WebElement getEleResourcesText(){
			return eleResourcesText;
		}		
		// To identify Sign out icon in Home Page
		@FindBy(xpath="//a[@href='logout.php']//i")
		private WebElement eleSignOutIcon;
		public WebElement getEleSignOutIcon(){
			return eleSignOutIcon;
		}
		// To identify Sign out text in Home Page
		@FindBy(xpath="//span[text()='Sign out']")
		private WebElement eleSignOutText;
		public WebElement getEleSignOutText(){
			return eleSignOutText;
		}		
		// To identify 'Welcome!' username text in Home Page
		@FindBy(xpath="//div[contains(text(),'Welcome!')]")
		private WebElement eleWelcomeUserNameText;
		public WebElement getEleWelcomeUserNameText(){
			return eleWelcomeUserNameText;
		}
		// To identify Profile Image in Home Page
		@FindBy(xpath="//form[@id='profile-pic-form']//img")
		private WebElement eleProfileImage;
		public WebElement getEleProfileImage(){
			return eleProfileImage;
		}
		// To identify Edit link in Home Page
		@FindBy(id="fileImgProfile")
		private WebElement eleEditLink;
		public WebElement getEleEditLink(){
			return eleEditLink;
		}
		// To identify Last Login text in Home Page
		@FindBy(xpath="//div[contains(text(),'Last Login')]")
		private WebElement eleLastLoginDate;
		public WebElement getEleLastLoginDate(){
			return eleLastLoginDate;
		}
		// To identify Last Sync text in Home Page
		@FindBy(xpath="//div[contains(text(),'Last Sync')]")
		private WebElement eleLastSyncDate;
		public WebElement getEleLastSyncDate(){
			return eleLastSyncDate;
		}
		// To identify License Expiry Date in Home Page
		@FindBy(xpath="//div[contains(text(),'Licence Expiry Date')]")
		private WebElement eleLicenseExpiryDate;
		public WebElement getEleLicenseExpiryDate(){
			return eleLicenseExpiryDate;
		}
		// To identify Acess URL text in Home Page
		@FindBy(xpath="//div[contains(text(),'Access URL')]")
		private WebElement eleAccessUrl;
		public WebElement getEleAccUrl(){
			return eleAccessUrl;
		}
		// To identify Admin Details in Home Page
		@FindBy(xpath="//div[@ class='col-sm-9']")
		private List<WebElement> eleAdminDetails;
		public List<WebElement> getEleAdminDetails(){
			return eleAdminDetails;
		}
		// To identify Courses details section in Home Page
		@FindBy(xpath="(//div[@ class='col-sm-6 col-md-3 padder-v b-light'])[1]")
		private WebElement eleCourseSection;
		public WebElement getEleCourseSection(){
			return eleCourseSection;
		}
		// To identify Batches details section in Home Page
		@FindBy(xpath="//div[@ class='col-sm-6 col-md-3 padder-v b-r b-l b-light lt']")
		private WebElement eleBatchSection;
		public WebElement getEleBatchSection(){
			return eleBatchSection;
		}
		// To identify Teachers details section in Home Page
		@FindBy(xpath="(//div[@ class='col-sm-6 col-md-3 padder-v b-light'])[2]")
		private WebElement eleTeacherSection;
		public WebElement getEleTeacherSection(){
			return eleTeacherSection;
		}
		
		// To identify Student details section in Home Page
		@FindBy(xpath="//div [@class='col-sm-6 col-md-3 padder-v b-l b-light lt']")
		private WebElement eleStudentSection;
		public WebElement getEleStudentSection(){
			return eleStudentSection;
		}
		//To identify No of courses in Home Page
		@FindBy(xpath="(//a[@href='#']//strong)[1]")
		private WebElement eleCoursesCount;
		public WebElement getEleCoursesCount(){
			return eleCoursesCount;
		}
		// To identify No of Batches in Home Page
		@FindBy(xpath="(//a[@href='#']//strong)[2]")
		private WebElement eleBatchesCount;
		public WebElement getEleBatchesCount(){
			return eleBatchesCount;
		}
		// To identify No of Teachers in Home Page
		@FindBy(xpath="(//a[@href='#']//strong)[3]")
		private WebElement eleTeachersCount;
		public WebElement getEleTeachersCount(){
			return eleTeachersCount;
		}
		// To identify No of students in Home Page
		@FindBy(xpath="(//a[@href='#']//strong)[4]")
		private WebElement eleStudentsCount;
		public WebElement getEleStudentsCount(){
			return eleStudentsCount;
		}
		// To identify the chart in Home Page
		@FindBy(id="chartColumn")
		private WebElement eleChart;
		public WebElement getEleChart(){
			return eleChart;
		}
		// To identify the 1st paragraph text Home Page
		@FindBy(xpath="(//div[@ id='coursebased']//div//p)[1]")
		private WebElement eleParagarph1Text;
		public WebElement getEleParagraph1Text(){
			return eleParagarph1Text;
		}
		// To identify the 2nd Paragraph text Home Page
		@FindBy(xpath="(//div[@ id='coursebased']//div//p)[2]")
		private WebElement eleParagarph2Text;
		public WebElement getEleParagraph2Text(){
			return eleParagarph2Text;
		}
		// TO identify profile image in the header Home Page
		@FindBy(xpath="//img[@id='viewImgProfileHeader']")
		private WebElement eleHeaderProfileImage;
		public WebElement getEleHeaderProfileImage(){
			return eleHeaderProfileImage;
		}
		// TO identify Admin Name in the dropdown Home Page
		@FindBy(xpath="//span[@id='userDtl']/span")
		private WebElement eleAdminNameInDropdown;
		public WebElement getEleAdminNameInDropdown(){
			return eleAdminNameInDropdown;
		}			
		// To identify Profile dropdown icon Home Page
		@FindBy(xpath="//span[@id='userDtl']/b")
		private WebElement eleDropDownIcon;
		public WebElement getEleDropDownIcon(){
			return eleDropDownIcon;
		}
		// To identify Profile Home Page
		@FindBy(xpath="//a[text()='Profile']")
		private WebElement eleProfileOption;
		public WebElement getEleProfileOption(){
			return eleProfileOption;
		}		
		// To identify sign out Home Page
		@FindBy(xpath="//a[text()='Sign out']")
		private WebElement eleSignOutOption;
		public WebElement getEleSignOutOption(){
			return eleSignOutOption;
		}		
		// To identify Notification icon Home Page
		@FindBy(xpath="//a[@class='dropdown-toggle dk']//i")
		private WebElement eleNotificationIcon;
		public WebElement getEleNotificationicon(){
			return eleNotificationIcon;
		}	
		// To identify Notification Count Home Page 
		@FindBy(xpath="//a[@class='dropdown-toggle dk']//span")
		private WebElement eleNotificationCount;
		public WebElement getEleNotificationCount(){
			return eleNotificationCount;
		}
		
		public void selectbyindexvalue(WebElement element, int indexValue){
			Select select=new Select(element);
			select.selectByIndex(indexValue);
			select.getOptions().size();
		}
		
		public int getsize(WebElement element){
			Select select=new Select(element);
			int size=select.getOptions().size();
			return size;
		}		
		public void selectbyvalue(WebElement element, String Value){
			Select select=new Select(element);
			select.selectByValue(Value);
		}
		public void selectbyvisibletext(WebElement element, String visibletext){
			Select select=new Select(element);
			select.selectByVisibleText(visibletext);
		}
		public int convertToInteger(String stringData){
		int	integerValue=Integer.parseInt(stringData);
			return integerValue;
		}
 
}
