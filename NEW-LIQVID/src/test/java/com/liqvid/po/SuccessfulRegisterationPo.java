package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessfulRegisterationPo {
	WebDriver driver = null;
	public SuccessfulRegisterationPo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
		// To identify "You have successfully registered !!!" message
		@FindBy(xpath="//h3[text()='You have successfully registered !!!']")
		private WebElement eleSucessfullyRegisteredMsg;
		public WebElement getEleSucessfullyRegisteredMsg(){
			return eleSucessfullyRegisteredMsg;
		}
		// To identify "Login Id" after registration
		@FindBy(xpath="//p[contains(text(),'Login Id')]") //(//p[@class='page-sub-heading'])[1]
		private WebElement eleRegLoginId;
		public WebElement getEleRegLoginId(){
			return eleRegLoginId;
		}
		// To identify "Password" after registration
		@FindBy(xpath="//p[contains(text(),'Password')]")
		private WebElement eleRegPassword;
		public WebElement getEleRegPassword(){
			return eleRegPassword;
		}
		// To identify "Click Here to Login" text after registration
		@FindBy(xpath="(//p[@class='page-sub-heading'])[3]")
		private WebElement eleClickHereText;
		public WebElement getEleClickHereText(){
			return eleClickHereText;
		}
		// To identify 'Click Here'link after registration
		@FindBy(xpath="//u[text()='Click Here']")
		private WebElement eleClickHereLink;
		public WebElement getEleClickHereLink(){
			return eleClickHereLink;
		}
public String  getvalue(String Credentials,int startIndex){

	String credentialvalue=Credentials.substring(startIndex);
	System.out.println(credentialvalue);
	return credentialvalue;
}
	
}
