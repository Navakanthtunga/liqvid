package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateBatchPo {
	WebDriver driver=null;
	public CreateBatchPo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
// To identify the elements in Class section 
	
	@FindBy(xpath="(//div[@class='col-sm-4'])[1]")
	private WebElement eleClsSect;
	public WebElement getEleClsSect(){
		return eleClsSect;
	}
// To identify the elements in "section From" section 
	@FindBy(xpath="(//div[@class='col-sm-4'])[2]")
	private WebElement eleSelFrm;
	public WebElement getEleSelFrm(){
		return eleSelFrm;
	}
// To identify the elements in "section To" section
	@FindBy(xpath="(//div[@class='col-sm-4'])[3]")
	private WebElement eleSelTo;
	public WebElement getEleSelTo(){
		return eleSelTo;
}
// To identify Class Dropdown  1
	@FindBy(id="fld_class1")
	private WebElement eleClDrDwn1;
	public WebElement getEleClDrDwn1(){
		return eleClDrDwn1;
	}
// To identify "Section From" Dropdown  1 
	@FindBy(id="fld_section1")
	private WebElement eleSeFrDrDwn1;
	public WebElement getEleSeFrDrDwn1(){
		return eleSeFrDrDwn1;
	}
// To identify "Section To" drop down   1
	@FindBy(id="fld_sectionT1")
	private WebElement eleSeToDrDwn1;
	public WebElement getEleSeToDrDwn1(){
		return eleSeToDrDwn1;
	}
// To identify "Add" button 
	@FindBy(id="//p[contains(text(),'ADD')]")
	private WebElement eleAddButt;
	public WebElement getEleAddButt(){
		return eleAddButt;
	}
// To identify Class Dropdown  2	
	@FindBy(id="fld_class2")
	private WebElement eleClDrDwn2;
	public WebElement getEleClDrDwn2(){
		return eleClDrDwn2;
	}
// To identify "Section From" Dropdown  2
	@FindBy(id="fld_section2")
	private WebElement eleSeFrDrDwn2;
	public WebElement getEleSeFrDrDwn2(){
		return eleSeFrDrDwn2;
	}
// To identify "Section To" drop down   2
	@FindBy(id="fld_sectionT2")
	private WebElement eleSeToDrDwn2;
	public WebElement getEleSeToDrDwn2(){
		return eleSeToDrDwn2;
	}
// To identify Class Dropdown  3	
	@FindBy(id="fld_class3")
	private WebElement eleClDrDwn3;
	public WebElement getEleClDrDwn3(){
		return eleClDrDwn3;
	}
// To identify "Section From" Dropdown  3 
	@FindBy(id="fld_section3")
	private WebElement eleSeFrDrDwn3;
	public WebElement getEleSeFrDrDwn3(){
		return eleSeFrDrDwn3;
	}
// To identify "Section To" drop down   3
	@FindBy(id="fld_sectionT3")
	private WebElement eleSeToDrDwn3;
	public WebElement getEleSeToDrDwn3(){
		return eleSeToDrDwn3;
	}
// To identify "Remove" button 
	@FindBy(id="removeMoreDtl")
	private WebElement eleRemButt;
	public WebElement getEleRemButt(){
		return eleRemButt;
	}	
// To identify create button
	@FindBy(id="removeMoreDtl")
	private WebElement eleCrtButt;
	public WebElement getEleCrtButt(){
		return eleCrtButt;
	}	
// To identify "Batch Report" text
	@FindBy(xpath="//div[contains(text(),'Batch Report')]")
	private WebElement eleBatRepText;
	public WebElement getEleBatRepText(){
		return eleBatRepText;
	}
// To identify "Batch" text
	@FindBy(xpath="//th[contains(text(),'Batch')]")
	private WebElement eleBatText;
	public WebElement getEleBatText(){
		return eleBatText;
	}	
// To identify "Status" text
	@FindBy(xpath="//th[contains(text(),'Batch')]")
	private WebElement eleStatusText;
	public WebElement getEleStatusText(){
		return eleStatusText;
	}		
// To identify Batch:01 
	@FindBy(xpath="(//tbody//tr[1])//td[1]")
	private WebElement eleBat01;
	public WebElement getEleBat01(){
		return eleBat01;
	}
// To identify Batch:01 status	
	@FindBy(xpath="(//tbody//tr[1])//td[2]")
	private WebElement eleBat01Status;
	public WebElement getEleBat01Status(){
		return eleBat01Status;
	}	
// To identify Batch:02 
	@FindBy(xpath="(//tbody//tr[2])//td[1]")
	private WebElement eleBat02;
	public WebElement getEleBat02(){
		return eleBat02;
	}
// To identify Batch:02 status	
	@FindBy(xpath="(//tbody//tr[2])//td[2]")
	private WebElement eleBat02Status;
	public WebElement getEleBat02Status(){
		return eleBat02Status;
	}
// To identify Batch:03 
	@FindBy(xpath="(//tbody//tr[3])//td[1]")
	private WebElement eleBat03;
	public WebElement getEleBat03(){
		return eleBat03;
	}
// To identify Batch:03 status	
	@FindBy(xpath="(//tbody//tr[3])//td[2]")
	private WebElement eleBat03Status;
	public WebElement getEleBat03Status(){
		return eleBat03Status;
	}

}
