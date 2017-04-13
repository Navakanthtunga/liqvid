package com.liqvid.po;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateBatchPo {
	WebDriver driver=null;
	public CreateBatchPo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// To identify Create Batch text in create Batch page
		@FindBy(xpath="//div[text()='Create Batch']")
		private WebElement eleCreateBatchTitle;
		public WebElement getEleCreateBatchTitle(){
			return eleCreateBatchTitle;
		}	
	
// To identify the elements in Class section in create Batch page
	@FindBy(xpath="(//div[@class='col-sm-4'])[1]")
	private WebElement eleClassSection;
	public WebElement getEleClassSection(){
		return eleClassSection;
	}
// To identify the elements in "section From" section in create Batch page
	@FindBy(xpath="(//div[@class='col-sm-4'])[2]")
	private WebElement eleSectionFrom;
	public WebElement getEleSectionFrom(){
		return eleSectionFrom;
	}
// To identify the elements in "section To" section in create Batch page
	@FindBy(xpath="(//div[@class='col-sm-4'])[3]")
	private WebElement eleSectionTo;
	public WebElement getEleSectionTo(){
		return eleSectionTo;
	}
	// To identify No of sections in the Create Batch page
	@FindBy(xpath="//div[contains(@id,'classSectionDt')]")
	private List<WebElement>  eleCountofClassSections;
	public List<WebElement>  getEleCountofClassSections(){
		return eleCountofClassSections;
	}	
// To identify "Add" button in create Batch page
	@FindBy(xpath="//p[text()='ADD']")
	private WebElement  eleAddButton;
	public WebElement  getEleAddButton(){
		return eleAddButton;
	}
// To identify "Remove" button in create Batch page
	@FindBy(id="removeMoreDtl")
	private WebElement eleRemoveButton;
	public WebElement getEleRemoveButton(){
		return eleRemoveButton;
	}	
// To identify create button in create Batch page
	@FindBy(xpath="//button[text()='Create']")
	private WebElement eleCreateButton;
	public WebElement getEleCreateButton(){
		return eleCreateButton;
	}	
	// To identify the table with batch name and status  
	@FindBy(xpath="//table[@class='table table-striped m-b-none']")
	private WebElement  eleBatchConfirmTable;
	public WebElement  getEleBatchConfirmTable(){
		return eleBatchConfirmTable;
	}
	// To identify 'Batch created' text 
	@FindBy(xpath="//td[text()='Batch created']")
	private List<WebElement>  eleBatchCreatedText;
	public List<WebElement>  getEleBatchCreatedText(){
		return eleBatchCreatedText;
	}
	// To identify 'Batch already exists' text 
	@FindBy(xpath="//td[text()='Batch already exists']")
	private List<WebElement>  eleBatchExistsText;
	public List<WebElement>  getEleBatchExistsText(){
		return eleBatchExistsText;
	}
// To identify Class Dropdown 1 in create Batch page
	@FindBy(id="fld_class1")
	private WebElement eleClassDropDown1;
	public WebElement getEleClassDropDown1(){
		return eleClassDropDown1;
	}
// To identify "Section From" Dropdown 1 in create Batch page
	@FindBy(id="fld_section1")
	private WebElement  eleSectionFromDropDown1;
	public WebElement  getEleSectionFromDropDown1(){
		return eleSectionFromDropDown1;
	}
// To identify "Section To" drop down 1 in create Batch page
	@FindBy(id="fld_sectionT1")
	private WebElement  eleSectionToDropDown1;
	public WebElement  getEleSectionToDropDown1(){
		return eleSectionToDropDown1;
	}
	//To identify all class dropdowns
	@FindBy(xpath="//select[contains(@id,'fld_class')]")
	private List<WebElement>  eleclassdropdowns;
	public List<WebElement>  getEleclassdropdowns(){
		return eleclassdropdowns;	
	}
	// To identify Class Dropdown 2 in create Batch page	
		@FindBy(id="fld_class2")
		private WebElement  eleClassDropDown2;
		public WebElement  getEleClassDropDown2(){
			return eleClassDropDown2;
		}
	// To identify "Section From" Dropdown 2 in create Batch page
	 	@FindBy(id="fld_section2")
		private WebElement  eleSectionFromDropDown2;
		public WebElement  getEleSectionFromDropDown2(){
			return eleSectionFromDropDown2;
		}
	// To identify "Section To" drop down 2 in create Batch page
		@FindBy(id="fld_sectionT2")
		private WebElement  eleSectionToDropDown2;
		public WebElement  getEleSectionToDropDown2(){
			return eleSectionToDropDown2;
		}
	// To identify Class Dropdown 3 in create Batch page
		@FindBy(id="fld_class3")
		private WebElement  eleClassDropDown3;
		public WebElement  getEleClassDropDown3(){
			return eleClassDropDown3;
		}
	// To identify "Section From" Dropdown 3 in create Batch page
		@FindBy(id="fld_section3")
		private WebElement  eleSectionFromDropDown3;
		public WebElement  getEleSectionFromDropDown3(){
			return eleSectionFromDropDown3;
		}
	// To identify "Section To" drop down 3 in create Batch page
		@FindBy(id="fld_sectionT3")
		private WebElement  eleSectionToDropDown3;
		public WebElement  getEleSectionToDropDown3(){
			return eleSectionToDropDown3;	
		}	
	// To create multiple batches	
		public void multipleBatches(int numberofbatches) throws Throwable{
		AdminHomePo	adminhomepo=new AdminHomePo(driver);
		for(int i=1;i<numberofbatches-1;i++){
			getEleAddButton().click();
			Thread.sleep(1000);
		}
		for(int i=1;i<numberofbatches;i++){
		WebElement classDropdown=driver.findElement(By.xpath("//select[@id='fld_class"+i+"']"));
		WebElement sectionFromDropdown=driver.findElement(By.xpath("//select[@id='fld_section"+i+"']"));
		WebElement sectionToDropdown=driver.findElement(By.xpath("//select[@id='fld_sectionT"+i+"']"));
		adminhomepo.selectbyindexvalue(classDropdown, i-1);	
		adminhomepo.selectbyvisibletext(sectionFromDropdown, "A");
		adminhomepo.selectbyvisibletext(sectionToDropdown, "Z");
		Thread.sleep(2000);
			}
		}
}
