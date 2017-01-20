package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class ResourcesPo {
		WebDriver driver=null;
		public ResourcesPo(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	// To identify Resources text
	@FindBy(xpath="//div[Contains(text(),'Resources')]")
	private WebElement eleResourcesText;
	public WebElement getEleResourcesText(){
		return eleResourcesText;
	}
	// To identify Technical manual button 
	@FindBy(xpath="//div[contains(text(),'Technical Manual')]")
	private WebElement eleTechManButt;
	public WebElement getEleTechManButt(){
		return eleTechManButt;
	}
	// To identify Help Manual Icon
	@FindBy(xpath="//div[@class='col-sm-4 text-center']//img")
	private WebElement eleHelpManIcon;
	public WebElement getHelpManIcon(){
		return eleHelpManIcon;
	}	
	
}
