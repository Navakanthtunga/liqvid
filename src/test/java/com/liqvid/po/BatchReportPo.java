package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BatchReportPo {
	WebDriver driver=null;
	public BatchReportPo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
// To identify class select drop down	
	@FindBy(id="fld_class")
	private WebElement eleSelClsDrDwn;
	public WebElement getEleSelClsDrDwn(){
		return eleSelClsDrDwn;
	}
// To identify Section select drop down
	@FindBy(id="fld_section")
	private WebElement eleSelSecDrDwn;
	public WebElement getEleSelSecDrDwn(){
		return eleSelSecDrDwn;
	}
//To identify User type select drop down	
	@FindBy(id="userType")
	private WebElement eleUserSelDrDwn;
	public WebElement getEleUserSelDrDwn(){
		return eleUserSelDrDwn;
	}
// To identify Submit button
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement eleSubButt;
	public WebElement getEleSubButt(){
		return eleSubButt;
	}
// To identify Name text
	@FindBy(xpath="(//thead//tr//th)[1]")
	private WebElement eleNameText;
	public WebElement getEleNameText(){
		return eleNameText;
	}
// To identify LoginId text
	@FindBy(xpath="(//thead//tr//th)[2]")
	private WebElement eleLoginIdText;
	public WebElement getEleLoginIdText(){
		return eleLoginIdText;
	}
// To identify Password text
	@FindBy(xpath="(//thead//tr//th)[3]")
	private WebElement elePwdText;
	public WebElement getElePwdText(){
		return elePwdText;
	}
// To identify 1 st Name in Report
	@FindBy(xpath="(//tbody//tr[1]//td)[1]")
	private WebElement eleBrepName1;
	public WebElement getEleBrepName1(){
		return eleBrepName1;
	}	
// To identify 1 st Login Id in Report
	@FindBy(xpath="(//tbody//tr[1]//td)[2]")
	private WebElement eleBrepLoginId1;
	public WebElement getEleBrepLoginId1(){
		return eleBrepLoginId1;
	}
// To identify 1 st Pwd in Report
	@FindBy(xpath="(//tbody//tr[1]//td)[3]")
	private WebElement eleBrepPwd1;
	public WebElement getEleBrepPwd1(){
		return eleBrepPwd1;
	}
// To identify 2 nd Name in Report
	@FindBy(xpath="(//tbody//tr[1]//td)[1]")
	private WebElement eleBrepName2;
	public WebElement getEleBrepName2(){
		return eleBrepName1;
	}	
// To identify 2 nd Login Id in Report
	@FindBy(xpath="(//tbody//tr[1]//td)[2]")
	private WebElement eleBrepLoginId2;
	public WebElement getEleBrepLoginId2(){
		return eleBrepLoginId1;
	}
// To identify 2 nd Pwd in Report
	@FindBy(xpath="(//tbody//tr[1]//td)[3]")
	private WebElement eleBrepPwd2;
	public WebElement getEleBrepPwd2(){
		return eleBrepPwd2;
	}	
	
}
