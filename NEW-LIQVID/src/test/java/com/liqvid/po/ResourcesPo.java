package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourcesPo {
	WebDriver driver=null;
	public ResourcesPo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		// To identify "Resources" Title in Resources page
		@FindBy(xpath="//div[text()='Resources']")
		private WebElement eleResourcesTitle;
		public WebElement getEleResourcesTitle(){
			return eleResourcesTitle;
		}
		// To identify "Technical Manual" button in Resources page
		@FindBy(xpath="//div[text()='Technical Manual']")
		private WebElement eleTechnicalManualButton;
		public WebElement getEleTechnicalManualButton(){
			return eleTechnicalManualButton;
		}	
		// To identify "Resources" text in Resources page
		@FindBy(xpath="//div[@class='col-xs-3 col-center-block spaceTop borderResource text-center']//img")
		private WebElement eleHelpManualImage;
		public WebElement getEleHelpManualImage(){
			return eleHelpManualImage;
		}				
}
