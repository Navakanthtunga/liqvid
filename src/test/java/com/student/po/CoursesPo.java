package com.student.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CoursesPo {
	WebDriver driver=null;
public CoursesPo(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
// To identify Courses Text
	@FindBy(xpath="//div[contains(text(),'Courses')]")
	private WebElement eleCourseText;
	public WebElement getEleCourseText(){
		return eleCourseText;
	}
// To identify "To start course perform following steps" Text
	@FindBy(xpath="//p[contains(text(),'To start course perform following steps')]")
	private WebElement eleInstrText;
	public WebElement getEleInstrText(){
		return eleInstrText;
	}
// To identify "Step" text in 1st step
	@FindBy(xpath="//div[@class='timelineStep timelineStep1']")
	private WebElement eleStepText1;
	public WebElement getEleStepText1(){
		return eleStepText1;
	}
// To identify Step no:"1"
	@FindBy(xpath="//div[@class='timelineCircle1']")
	private WebElement eleStepNo1;
	public WebElement getEleStepNo1(){
		return eleStepNo1;
	}
// To identify "Select Batch" Text
	@FindBy(xpath="//div[@class='timelineTitle1']")
	private WebElement eleSelBatText;
	public WebElement getEleSelBatText(){
		return eleSelBatText;
	}
// To identify "Step" text in 2st step
	@FindBy(xpath="//div[@class='timelineStep timelineStep2']")
	private WebElement eleStepText2;
	public WebElement getEleStepText2(){
		return eleStepText2;
	}
// To identify Step no:"2"
	@FindBy(xpath="//div[@class='timelineCircle2']")
	private WebElement eleStepNo2;
	public WebElement getEleStepNo2(){
		return eleStepNo2;
	}
// To identify "Select Batch" Text
	@FindBy(xpath="//div[@class='timelineTitle3']")
	private WebElement eleCourseBatText;
	public WebElement getEleCourseBatText(){
		return eleCourseBatText;
	}
// To identify "Step" text in 3rd step
	@FindBy(xpath="//div[@class='timelineStep timelineStep4']")
	private WebElement eleStepText3;
	public WebElement getEleStepText3(){
		return eleStepText3;
	}
// To identify Step no:"3"
	@FindBy(xpath="//div[@class='timelineCircle4']")
	private WebElement eleStepNo3;
	public WebElement getEleStepNo3(){
		return eleStepNo3;
	}
// To identify "Click Start Course" Text
	@FindBy(xpath="//div[@class='timelineTitle4']")
	private WebElement eleClStCoText;
	public WebElement getEleClStCoText(){
		return eleClStCoText;
	}
// To identify Batch text 
	@FindBy(xpath="//label[text()='Batch']")
	private WebElement eleBatText;
	public WebElement getEleBatText(){
		return eleBatText;
	}
// To identify Courses Text
	@FindBy(xpath="//label[text()='Course']")
	private WebElement eleCoText;
	public WebElement getEleCourText(){
		return eleCoText;
	}
// To Select Batch
	@FindBy(id="class_select")
	private WebElement elBatSel;
	public WebElement getEleBatSel(){
		return elBatSel;
	}
//To select Course 
	@FindBy(id="course_select")
	private WebElement eleCoSel;
	public WebElement getEleCoSel(){
		return eleCoSel;
	}
// To identify Start Course Button
	@FindBy(id="strt")
	private WebElement eleStButt;
	public WebElement getEleStButt(){
		return eleStButt;
	}

}
