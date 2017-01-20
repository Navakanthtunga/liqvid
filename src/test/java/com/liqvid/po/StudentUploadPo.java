package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentUploadPo {
	WebDriver driver=null;
	public StudentUploadPo(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// To identify Student Data Upload text
	@FindBy(xpath="//div[text()='Student Data Upload']")
	private WebElement eleStDtUpText;
	public WebElement getEleStDtUpText(){
		return eleStDtUpText;
	}
	// To identify Download icon
	@FindBy(xpath="//a[@href='bulkUpload.php']//i")
	private WebElement eleDwnldIcon;
	public WebElement getEleDwnldIcon(){
		return eleDwnldIcon;
	}
	// To identify Download Sample data upload file text
	@FindBy(xpath="//a[contains(text(),'Download sample data upload file')]")
	private WebElement eleSampFile;
	public WebElement getEleSampFile(){
		return eleSampFile;
	}
	// To identify Select class dropdown 
	@FindBy(id="fld_class")
	private WebElement eleSelClsDrDwn;
	public WebElement getEleSelClsDrDwn(){
		return eleSelClsDrDwn;
	}
	// To identify select section dropdown
	@FindBy(id="fld_section")
	private WebElement eleSelSecDrDwn;
	public WebElement getEleSelSecDrDwn(){
		return eleSelSecDrDwn;
	}
	// To identify Upload button 
	@FindBy(id="uploadDiv")
	private WebElement eleUpldButt;
	public WebElement getEleUpldButt(){
		return eleUpldButt;
	}
	// To identify Submit button 
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement eleSubButt;
	public WebElement getEleSubButt(){
		return eleSubButt;
	}
	// To identify the error message at select class drop down
	@FindBy(xpath="(//li[contains(text(),'This value is required.')])[1]")
	private WebElement eleSelClsErrMsg;
	public  WebElement getEleSelClsErrMsg(){ 
	return eleSelClsErrMsg;
	}
	// To identify the error message at select Section drop down
	@FindBy(xpath="(//li[contains(text(),'This value is required.')])[2]")
	private WebElement eleSelSecErrMsg;
	public  WebElement getEleSelSecErrMsg(){ 
		return eleSelSecErrMsg;
	}
	// To identify the error message at upload button
	@FindBy(xpath="(//li[contains(text(),'This value is required.')])[3]")
	private WebElement eleUpldErrMsg;
	public  WebElement getEleUpldErrMsg(){ 
		return eleUpldErrMsg;
	}
}
	
