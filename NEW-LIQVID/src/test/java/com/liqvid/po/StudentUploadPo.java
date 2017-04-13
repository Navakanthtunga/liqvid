package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentUploadPo {
	WebDriver driver=null;
	public StudentUploadPo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		// To identify "Student Bulk Upload " Title in Student Upload page
		@FindBy(xpath="//div[text()='Student Bulk Upload']")
		private WebElement eleStudentBulkUploadTitle;
		public WebElement getEleStudentBulkUploadTitle(){
			return eleStudentBulkUploadTitle;
		}
		// To identify "Class" Dropdown in Student Upload page
		@FindBy(id="fld_class")
		private WebElement eleClassDropdown;
		public WebElement getEleClassDropdown(){
			return eleClassDropdown;
		}
		// To identify "Section" Dropdown in Student Upload page
		@FindBy(id="fld_section")
		private WebElement eleSectionDropdown;
		public WebElement getEleSectionDropdown(){
			return eleSectionDropdown;
		}
		// To identify "Upload" Button in Student Upload page
		@FindBy(id="uploadDiv")
		private WebElement eleUploadButton;
		public WebElement getEleUploadButton(){
			return eleUploadButton;
		}	
		// To identify "Download sample data upload file" link in Student Upload page
		@FindBy(xpath="//a[@href='updateFiles/Bulk_Student_Upload.xls']")
		private WebElement eleSampleUploadFile;
		public WebElement getEleSampleUploadFile(){
			return eleSampleUploadFile;
		}	
		// To identify "Submit" button in Student Upload page
		@FindBy(xpath="//button[text()='Submit']")
		private WebElement eleSubmitButton;
		public WebElement getEleSubmitButton(){
			return eleSubmitButton;
		}	
		// To identify "This value is required." Error Message in Student Upload page
		@FindBy(xpath="//li[text()='This value is required.']")
		private WebElement eleValueRequiredErrorMessage;
		public WebElement getEleValueReqErrMsg(){
			return eleValueRequiredErrorMessage;
		}
		// To identify File Name after selecting the file in Student Upload page
		@FindBy(id="fileName")
		private WebElement eleFileName;
		public WebElement getEleFileName(){
			return eleFileName;
		}
		// To identify 'There is something wrong.' in Student Upload page
		@FindBy(xpath="//div[@class='alert alert-success']")
		private WebElement eleErrMsgInAlert;
		public WebElement getEleErrMsgInAlert(){
			return eleErrMsgInAlert;
		}
		// To identify Alert  Close icon in Student Upload page
		@FindBy(xpath="//div[@class='alert alert-success']//i")
		private WebElement eleAlertCloseIcon;
		public WebElement getEleAlertCloseIcon(){
			return eleAlertCloseIcon;
		}
}
