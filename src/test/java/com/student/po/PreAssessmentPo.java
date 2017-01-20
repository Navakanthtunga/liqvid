package com.student.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreAssessmentPo {
WebDriver driver=null;
public PreAssessmentPo(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
// To identify "English Edge Assessments" Text
	@FindBy(xpath="//h3[contains(text(),'English Edge Assessments')]")
	private WebElement eleEnEdAssText;
	public WebElement getEleEnEdAssText(){
		return eleEnEdAssText;
	}
// To identify Instructions 
	@FindBy(id="slimScrollDiv1")
	private WebElement eleInstText;
	public WebElement getEleInstrText(){
		return eleInstText;
	}
// To identify "Start Test" button 
	@FindBy(xpath="//a[contains(text(),'Start Test')]")
	private WebElement eleStTeButt;
	public WebElement getEleStTeButt(){
		return eleStTeButt;
	}
// To identify Start Time text
	@FindBy(xpath="//div[contains(text(),'Test Start Time : ')]")
	private WebElement eleStTimeText;
	public WebElement getEleStTimeText(){
		return eleStTimeText;
	}
// To identify Stop Time Text
	@FindBy(xpath="//div[contains(text(),'Test End Time : ')]")
	private WebElement eleStpTimeText;
	public WebElement getEleStpTimeText(){
		return eleStpTimeText;
	}
// To identify "Course Title"
	@FindBy(xpath="//section[@id='content']//b")
	private WebElement eleCoTitle;
	public WebElement getEleCoTitle(){
		return eleCoTitle;
	}
// To identify "All the Best" Text
	@FindBy(xpath="//p[contains(text(),'All the Best!')]")
	private WebElement eleAbText;
	public WebElement getEleAbText(){
		return eleAbText;
	}
// To identify Timer
	@FindBy(id="countdown")
	private WebElement eleTimer;
	public WebElement getEleTimer(){
		return eleTimer;
	}
// To identify "Page Index"
	@FindBy(id="countdown")
	private WebElement elePagIn;
	public WebElement getElePagIn(){
		return elePagIn;
	}
// To identify Question & options
	@FindBy(xpath="step0")
	private WebElement eleQandOpt;
	public WebElement getEleQandOpt(){
		return eleQandOpt;
	}
// To identify 1st radio button
	@FindBy(xpath="(//div[@ id='step0']//div[@ class='radio']//label)[1]")
	private WebElement eleRadButt1;
	public WebElement getEleRadButt1(){
		return eleRadButt1;
	}
// To identify 2nd radio button
	@FindBy(xpath="(//div[@ id='step0']//div[@ class='radio']//label)[2]")
	private WebElement eleRadButt2;
	public WebElement getEleRadButt2(){
		return eleRadButt2;
	}
// To identify 3rd radio button
	@FindBy(xpath="(//div[@ id='step0']//div[@ class='radio']//label)[3]")
	private WebElement eleRadButt3;
	public WebElement getEleRadButt3(){
		return eleRadButt3;
	}
// To identify 4th radio button
	@FindBy(xpath="(//div[@ id='step0']//div[@ class='radio']//label)[4]")
	private WebElement eleRadButt4;
	public WebElement getEleRadButt4(){
		return eleRadButt4;
	}
// To identify Next button 
	@FindBy(id="netbtn")
	private WebElement eleNeButt;
	public WebElement getEleNeButt(){
		return eleNeButt;
	}
// To identify Prevoius Butt
	@FindBy(id="prebtn")
	private WebElement elePreButt;
	public WebElement getElePreButt(){
		return elePreButt;
	}
	
	
}
