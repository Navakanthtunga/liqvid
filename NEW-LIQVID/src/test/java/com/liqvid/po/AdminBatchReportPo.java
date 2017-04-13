package com.liqvid.po;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminBatchReportPo {
	WebDriver driver=null;
	public AdminBatchReportPo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		// To identify "Batch Report" text in Batch Report page
		@FindBy(xpath="//div[contains(text(),'Batch Report')]")
		private WebElement eleBatchReportTxt;
		public WebElement getEleBatchReportTxt(){
			return eleBatchReportTxt;
		}
		// To identify Class dropdown in Batch Report page
		@FindBy(id="fld_class")
		private WebElement eleClassSelectDropdown;
		public WebElement getEleClassSelectDropdown(){
			return eleClassSelectDropdown;
		}			
		// To identify Section dropdown in Batch Report page
		@FindBy(id="fld_section")
		private WebElement eleSectionSelectDropdown;
		public WebElement getEleSectionSelectDropdown(){
			return eleSectionSelectDropdown;
		}	
		// To identify User Type dropdown in Batch Report page
		@FindBy(id="userType")
		private WebElement eleUsertypeSelectDropdown;
		public WebElement getEleUsertypeSelectDropdown(){
			return eleUsertypeSelectDropdown;
		}		
		// To identify 'This value is required.'error message
		@FindBy(xpath="//li[text()='This value is required.']")
		private List<WebElement> eleValueRequiredErrMsg;
		public List<WebElement> getEleValueRequiredErrMsg(){
			return eleValueRequiredErrMsg;
		}	
		// To identify 'Submit' button
		@FindBy(xpath="//button[text()='Submit']")
		private WebElement eleSubmitButton;
		public WebElement getEleSubmitButton(){
			return eleSubmitButton;
		}
		// To identify Error message for incorrect details
		@FindBy(xpath="//div[@class='clearfix text-center m-t']")
		private List<WebElement> eleErrmsgForIncorrectDetails;
		public List<WebElement> getEleErrmsgForIncorrectDetails(){
			return eleErrmsgForIncorrectDetails;
		}		
		// To identify Batch report table 
		@FindBy(xpath="//table[@class='table table-striped m-b-none']")
		private WebElement eleBatchReportTable;
		public WebElement getEleBatchReportTable(){
			return eleBatchReportTable;
		}		
		// To identify Name text
		@FindBy(xpath="//th[text()='Name']")
		private WebElement eleNametext;
		public WebElement getEleNametext(){
			return eleNametext;
		}	
		// To identify Login ID text
		@FindBy(xpath="//th[text()='Login ID']")
		private WebElement eleLoginIDtext;
		public WebElement getEleLoginIDtext(){
			return eleLoginIDtext;
		}			
		// To identify Password Text
		@FindBy(xpath="//th[text()='Password']")
		private WebElement elePasswordText;
		public WebElement getElePasswordText(){
			return elePasswordText;
		}			
		// To identify Row1 Name
		@FindBy(xpath="(//tbody//tr[1])//td[1]")
		private WebElement eleFirstRowName;
		public WebElement getEleFirstRowName(){
			return eleFirstRowName;
		}
		// To identify Row1 Login Id
		@FindBy(xpath="(//tbody//tr[1])//td[2]")
		private WebElement eleFirstRowLoginId;
		public WebElement getEleFirstRowLoginId(){
			return eleFirstRowLoginId;
		}	
		// To identify Row1 Password
		@FindBy(xpath="(//tbody//tr[1])//td[3]")
		private WebElement eleFirstRowPassword;
		public WebElement getEleFirstRowPassword(){
			return eleFirstRowPassword;
		}	
		// To identify Row2 Name
		@FindBy(xpath="(//tbody//tr[2])//td[1]")
		private WebElement eleSecondRowName;
		public WebElement getEleSecondRowName(){
			return eleSecondRowName;
		}
		// To identify Row2 Login Id
		@FindBy(xpath="(//tbody//tr[2])//td[2]")
		private WebElement eleSecondRowLoginId;
		public WebElement getEleSecondRowLoginId(){
			return eleSecondRowLoginId;
		}
		// To identify Row2 Login Id
		@FindBy(xpath="(//tbody//tr[2])//td[2]")
		private WebElement eleSecondRowPassword;
		public WebElement getEleSecondRowPassword(){
			return eleSecondRowPassword;
		}		
		// To identify Row3 Name
		@FindBy(xpath="(//tbody//tr[3])//td[1]")
		private WebElement eleThirdRowName;
		public WebElement getEleThirdRowName(){
			return eleThirdRowName;
		}
		// To identify Row3 Login Id
		@FindBy(xpath="(//tbody//tr[3])//td[2]")
		private WebElement eleThirdRowLoginId;
		public WebElement getEleThirdRowLoginId(){
			return eleThirdRowLoginId;
		}
		// To identify Row3 Password
		@FindBy(xpath="(//tbody//tr[3])//td[3]")
		private WebElement eleThirdRowPassword;
		public WebElement getEleThirdRowPassword(){
			return eleThirdRowPassword;
		}
}
