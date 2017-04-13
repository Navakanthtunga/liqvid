package com.liqvid.po;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataBasePo {
	WebDriver driver;
	public DataBasePo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input_username")
	private WebElement eleUserNameTxtFld;
	public WebElement getEleUserNameTxtFld(){
		return eleUserNameTxtFld;
	}
	@FindBy(id="input_password")
	private WebElement eledatabasePasswordTxtFld;
	public WebElement getEledatabasePasswordTxtFld(){
		return eledatabasePasswordTxtFld;
	}
	@FindBy(id="input_go")
	private WebElement eleGoBtn;
	public WebElement getEleGoBtn(){
		return eleGoBtn;
	}
	@FindBy(xpath=".//*[@id='databaseList']/li[8]/ul/li[1]/a")
	private WebElement eleTeslaText;
	public WebElement getEleTeslaText(){
		return eleTeslaText;
	}
	
	@FindBy(id="tesla_555.test_instance")
	private WebElement eleTestInstanceIcon;
	public WebElement getEleTestInstanceIcon(){
		return eleTestInstanceIcon;
	}
	@FindBy(id="frame_navigation")
	private WebElement eleFrame;
	public WebElement getEleFrame(){
		return eleFrame;
	}
	@FindBy(id="tesla_555.test_instance")
	private WebElement eleTestInstance;
	public WebElement getEleTestInstance(){
		return eleTestInstance;
	}
	@FindBy(id="frame_content")
	private WebElement eleFrameContent;
	public WebElement getEleFrameContent(){
		return eleFrameContent;
	}
	@FindBy(xpath=".//*[@id='rowsDeleteForm']/button[2]")
	private WebElement eleDeleteIcon;
	public WebElement getEleDeleteIcon(){
		return eleDeleteIcon;
	}
	
	@FindBy(xpath="//a[contains(text(),'Check All')]")
	private WebElement eleCheckAllLink;
	public WebElement getEleCheckAllLink(){
		return eleCheckAllLink;
	}
	@FindBy(id="buttonYes")
	private WebElement eleYesBtn;
	public WebElement getEleYesBtn(){
		return eleYesBtn;
	}

	@FindBy(xpath=".//*[@id='tablesForm']/table/tbody[1]/tr[33]/td[2]/a/img")
	private WebElement eleBrowse;
	public WebElement getEleBrowse(){
		return eleBrowse;
	}
	//aduro text in database
	@FindBy(xpath="//a[text()='_555 (93)']")
	private WebElement eleAduroTxt;
	public WebElement getEleAduroTxt()
	{
		return eleAduroTxt;
	}
	//batch in aduro_555(93)
	@FindBy(xpath=".//*[@id='tablesForm']/table/tbody[1]/tr[6]/td[2]/a/img")
	private WebElement eleBatchBrowser;
	public WebElement getEleBatchBrowser()
	{
		return eleBatchBrowser;
	}
	   //select one textbox in batch link in database
		@FindBy(xpath=".//*[@id='id_rows_to_delete0']")
		private WebElement eleSelectBatchTextBox;
		public WebElement getEleSelectBatchTextBox()
		{
			return eleSelectBatchTextBox;
		}
		//logout link in databse
		@FindBy(xpath=".//*[@id='leftframelinks']/a[2]/img")
		private WebElement eleLogout;
		public WebElement getEleLogout()
		{
			return eleLogout;
		}
		// To identify 'User Credential' Text
		@FindBy(xpath="//label[text()='user_credential']")
		private WebElement eleUserCredentialTxt;
		public WebElement getEleUserCredentialTxt(){
			return eleUserCredentialTxt;
		}
		// To identify 'User Credential' Browse Icon
		@FindBy(xpath="//label[text()='user_credential']/..//following-sibling::td[@align='center']//img[@title='Browse']")
		private WebElement eleUserCredentialBrowseIcn;
		public WebElement getEleUserCredentialBrowseIcn(){
			return eleUserCredentialBrowseIcn;
		}		
		
		@FindBy(id="id_rows_to_delete1")
		private WebElement eleTeacherChkBx;
		public WebElement getEleTeacherChkBx(){
			return eleTeacherChkBx;
		}
		@FindBy(xpath="//button[@class='mult_submit']//img[@title='Delete']")
		private WebElement eleDeleteIcn;
		public WebElement getEleDeleteIcn(){
			return eleDeleteIcn;
		}
		@FindBy(xpath="//label[text()='center_settings']/..//following-sibling::td[@align='center']//img[@title='Browse']")
		private WebElement eleCenterSettingsBrowseIcn;
		public WebElement getEleCenterSettingsBrowseIcn(){
			return eleCenterSettingsBrowseIcn;			
		}
		@FindBy(xpath="//input[@value='Edit']")
		private WebElement eleCenterEditIcn;
		public WebElement getEleCenterEditIcn(){
			return eleCenterEditIcn;
		}	
		@FindBy(id="field_3_3")
		private WebElement eleCenterMacFld;
		public WebElement getEleCenterMacFld(){
			return eleCenterMacFld;
		}	
		@FindBy(id="field_2_3")
		private WebElement eleCenterIPFld;
		public WebElement getEleCenterIPFld(){
			return eleCenterIPFld;
		}
	public void databaseLogin(String username,String password) throws InterruptedException{
		getEleUserNameTxtFld().sendKeys(username);
		Thread.sleep(2000);
		getEledatabasePasswordTxtFld().sendKeys(password);
		Thread.sleep(2000);
		getEleGoBtn().click();
	}
	public void databaseLogout() throws Throwable{
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(getEleFrame());
		getEleLogout().click();
	}
	public void deleteFromDB() throws Throwable{
		 driver.switchTo().frame(getEleFrame());
		 getEleAduroTxt().click();
		 driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		 driver.switchTo().frame(getEleFrameContent());
			WebElement element = getEleUserCredentialTxt();
			JavascriptExecutor je = (JavascriptExecutor)driver;
			je.executeScript("arguments[0].scrollIntoView(true);",element);
			Thread.sleep(2000);
			getEleUserCredentialBrowseIcn().click();
			Thread.sleep(1000);
			getEleTeacherChkBx().click();
			getEleDeleteIcn().click();
			getEleYesBtn().click();
			Thread.sleep(2000);
			databaseLogout();
	 }
	public void getMacAddress() throws Throwable{
		 driver.switchTo().frame(getEleFrame());
		 getEleAduroTxt().click();
		 driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		 driver.switchTo().frame(getEleFrameContent());
		 getEleCenterSettingsBrowseIcn().click();
		 getEleCenterEditIcn().click();
		 
	}
}
