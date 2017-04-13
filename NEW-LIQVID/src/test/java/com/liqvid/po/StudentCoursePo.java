package com.liqvid.po;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;
import com.liqvid.library.ParallelBaseLib;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class StudentCoursePo {
	WebDriver driver;
	StudentSignInPo studentpo;
	public StudentCoursePo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//To verify course icon	in the home page
  @FindBy(xpath="//i[@class='fa fa-gears icon']")
   private WebElement eleCourseIcon;
   public WebElement getEleCourseIcon()
   {
	   return eleCourseIcon;
   }
//To verify course tab in home page
   @FindBy(xpath="//span[contains(text(),'Courses')]")
   private WebElement eleCourseTab;
   public WebElement getEleCourseTab()
   {
	   return eleCourseTab;
   }
//To verify instruction how to start in the courses page
   @FindBy(xpath="//p[contains(text(),'To start course perform following steps')]")
   private WebElement eleInstructionText;
   public WebElement getEleInstructionText()
   {
	   return eleInstructionText;
   }
//To verify step text in the courses page
   @FindBy(xpath="(//div[text()='Step'])[1]")
   private WebElement eleStepText;
   public WebElement getEleStepText()
   {
	   return eleStepText;
   }
//To verify step 1 circle in the course page
   @FindBy(xpath="(//div[@class='timelineCircle'])[1]")
   private WebElement eleStep1Circle;
   public WebElement getEleStep1Circle()
   {
	   return eleStep1Circle;
   }
   //to verify the select batch text in the course page
   @FindBy(xpath="//div[text()='Select Batch']")
   private WebElement eleSelectBatchText;
   public WebElement getEleSelectBatchText()
   {
	   return eleSelectBatchText;
   }
 //to verify the click start course course text in the course page
   @FindBy(xpath="//div[text()='Click Start Course']")
   private WebElement eleClickcourseText;
   public WebElement getEleClickcourseText()
   {
	   return eleClickcourseText;
   }
 //to verify the select course text in the course page
   @FindBy(xpath="//div[text()='Select Course']")
   private WebElement eleSelectcourseText;
   public WebElement getEleSelectcourseText()
   {
	   return eleSelectcourseText;
   }
   
 //to verify pageCount
   @FindBy(id="pgValue")
   private WebElement elePageCount;
   public WebElement getElePageCount()
   {
	   return elePageCount;
   }
//To verify batch text in the course page
   @FindBy(xpath="//label[contains(text(),'Batch')]")
   private WebElement eleBatchText;
   public WebElement getEleBatchText()
   {
	   return eleBatchText;
   }
//To select class from batch list in the course page
   @FindBy(id="class_select")
   private WebElement eleClass;
   public WebElement getEleClass()
   {
	   return eleClass;
   }
//To verify course text in the course page
   @FindBy(xpath="//label[contains(text(),'Course')]")
   private WebElement eleCourseText;
   public WebElement getEleCourseText()
   {
	   return eleCourseText;
   }
//To verify course under course list in the course page
   @FindBy(id="course_select")
   private WebElement eleCourseSelected;
   public WebElement getEleCourseSelected()
   {
	   return eleCourseSelected;
   }
//To verify start course button in the course page
   @FindBy(xpath="//input[@value='Start Course']")
   private WebElement eleStartCourseButton;
   public WebElement getEleStartCourseButton()
   {
	   return eleStartCourseButton;
   }
//To verify Preassessment link in the course page
   @FindBy(xpath="//a[contains(text(),'Pre Assessment')]")
   private WebElement elePreAssessmentLink;
   public WebElement getElePreAssessmentLink()
   {
	   return elePreAssessmentLink;
   }
 //To verify PostAssessment link in the course page
   @FindBy(xpath="//a[contains(text(),'Post Assessment')]")
   private WebElement elePostAssessmentLink;
   public WebElement getElePostAssessmentLink()
   {
	   return elePostAssessmentLink;
   }   
 //To verify Mid1 Assessment  Link in the Course
   @FindBy(xpath="//a[contains(text(),'Mid-1 Assessment')]")
   private WebElement eleMid1AssessmentLink;
   public WebElement getEleMid1AssessmentLink()
   {
	   return eleMid1AssessmentLink;
   } 
   //To verify Mid2 Assessment  Link in the Course
   @FindBy(xpath="//a[contains(text(),'Mid-2 Assessment')]")
   private WebElement eleMid2AssessmentLink;
   public WebElement getEleMid2AssessmentLink()
   {
	   return eleMid2AssessmentLink;
   } 
//To verify english edge text in the course page
   @FindBy(xpath="//h3[contains(text(),'English Edge Assessments')]")
   private WebElement eleEnglishEdgeText;
   public WebElement getEleEnglishEdgeText()
   {
	   return eleEnglishEdgeText;
   }
//To verify Instruction text in the course page
   @FindBy(xpath="//h1[contains(text(),'Instructions')]")
   private WebElement eleInstructiontText;
   public WebElement getEleInstructiontText()
   {
	   return eleInstructiontText;
   }
//To verify start text button in the course page
   @FindBy(xpath="//a[contains(text(),'Start')]")
   private WebElement eleStartTextButton;
   public WebElement getEleStartTextButton()
   {
	   return eleStartTextButton;
   }
 //To verify start text button in the course page
   @FindBy(xpath="//iframe[@id='iframes']")
   private WebElement eleframe;
   public WebElement getEleframe()
   {
	   return eleframe;
   }
 //iframe[@id='iframes']
//To verify class1 pre assessment text in the course page
   @FindBy(xpath="//b[contains(text(),'Class 1 Pre Assessment')]")
   private WebElement eleClass1PreAssessmentText;
   public WebElement getEleClass1PreAssessmentText()
   {
	   return eleClass1PreAssessmentText;
   }
 //To verify class1 Mid 1 assessment text in the course page
   @FindBy(xpath="//b[contains(text(),'Class 2 Mid 1 Assessment')]")
   private WebElement eleClass2Mid1AssessmentText;
   public WebElement getEleClass2Mid1AssessmentText()
   {
	   return eleClass2Mid1AssessmentText;
   }  
   //To verify class1 Mid 2 assessment text in the course page
   @FindBy(xpath="//b[contains(text(),'Class 2 Mid 2 Assessment')]")
   private WebElement eleClass2Mid2AssessmentText;
   public WebElement getEleClass2Mid2AssessmentText()
   {
	   return eleClass2Mid2AssessmentText;
   }    
   
 //to verify AboutUs 
   @FindBy(id="imgAboutUs")
   private WebElement eleAboutUsBtn;
   public WebElement getEleAboutUsBtn()
   {
	   return  eleAboutUsBtn;
   }
   //To verify class1 Post assessment text in the course page
   @FindBy(xpath="//b[contains(text(),'Class 2 Post Assessment')]")
   private WebElement eleClass2PostAssessmentText;
   public WebElement getEleClass2PostAssessmentText()
   {
	   return eleClass2PostAssessmentText;
   }   
//To verify All the best text in the course page
   @FindBy(className="text-muted")
   private WebElement eleAllTheBestText;
   public WebElement getEleAllTheBestText()
   {
	   return eleAllTheBestText;
   }
//To verify test start time in the course page
   @FindBy(xpath="//section[@class='scrollable wrapper']/../div/div[1]/div")
   private WebElement eleStartTimeText;
   public WebElement getEleStartTimeText()
   {
	   return eleStartTimeText;
   }
//To verify test end time in the course page
   @FindBy(xpath="//section[@class='scrollable wrapper']/../div/div[2]/div")
   private WebElement eleEndTimeText;
   public WebElement getEleEndTimeText()
   {
	   return eleEndTimeText;
   }
//To verify previous button in the course page
   @FindBy(xpath="//button[@id='prebtn']")
   private WebElement elePreviousButton;
   public WebElement getElePreviousButton()
   {
	   return elePreviousButton;
   }
//To verify recent number in the course page
   @FindBy(id="quesCount")
   private WebElement eleRecentPageNumber;
   public WebElement getEleRecentPageNumber()
   {
	   return eleRecentPageNumber;
   }
//To verify page number out of total page in the course page
   @FindBy(xpath="//span[@id='showFinish']")
   private WebElement elePageNumber;
   public WebElement getElePageNumber()
   {
	   return elePageNumber;
   }
//To verify next button in the course page
   @FindBy(xpath="(//div[@class='actions']/..//button)[2][contains(text(),'Next')]")
   private WebElement eleNextButton;
   public WebElement getEleNextButton()
   {
	   return eleNextButton;
   }
 
//To verify radio button in the course page
   @FindBy(xpath="(//div[@class='step-content']//div//div//i)[1]")
   private WebElement eleRaduioButton;
   public WebElement getEleRaduioButton()
   {
	   return eleRaduioButton;
   }
//To verify finish text in the course page
   @FindBy(id="showFinish")
   private WebElement eleFinishText;
   public WebElement getEleFinishText()
   {
	   return eleFinishText;
   }
//To verify finish button in the course page
   @FindBy(id="netbtn")
   private WebElement eleFinishbutton;
   public WebElement getEleFinishbutton()
   {
	   return eleFinishbutton;
    }
//To verify the instruction in last page in the course page
   @FindBy(id="completeText")
   private WebElement eleFinishInstruction;
   public WebElement getEleFinishInstruction()
   {
	   return eleFinishInstruction;
   }
//To verify score at the end in the course page
   @FindBy(id="ram")
   private WebElement eleScoreText;
   public WebElement getEleScoreText()
   {
	   return eleScoreText;
   }
//To verify back button in the course page
   @FindBy(id="btnBack")
   private WebElement eleBackButton;
   public WebElement getEleBackButton()
   {
	   return eleBackButton;
   }
//To verify speaker in the course page
   @FindBy(id="buttonDispElem134")
   private WebElement elespeaker;
   public WebElement getElespeaker()
   {
	   return elespeaker;
   }
 //to verify instruction 
   @FindBy(xpath="//div[@id='slimScrollDiv1']")
   private List<WebElement> eleInstruction;
   public List<WebElement> getEleInstruction(){
	   return eleInstruction;
   }
  //to verify the completed message text
   @FindBy(id="ram")
   private WebElement eleResultMessageText;
   public WebElement getEleResultMessageText(){
	   return eleResultMessageText;
   }
   //to verify the back button is dispalyed
   @FindBy(id="btnBack")
   private WebElement eleBackBtn;
   public WebElement getEleBackBtn(){
	   return eleBackBtn;
   }
   
 //to switch to HeaderFrame
   @FindBy(xpath="//*[@id='fraheader']")
   private WebElement eleHeaderFrame;
   public WebElement getEleHeaderframe()
   {
   	   return eleHeaderFrame;
   }


   //to switch to MiddleFrame
   @FindBy(xpath="//*[@id='content']")
   private WebElement eleMiddleFrame;
   public WebElement getEleMiddleFrame()
   {
   	   return eleMiddleFrame;
   }

   //to switch to footerFrame
   @FindBy(id="frabotbar")
   private WebElement elefooterFrame;
   public WebElement getElefooterframe()
   {
   	   return elefooterFrame;
   }
   
 //to verify Home
   @FindBy(id="imgHome")
   private WebElement eleHomeBtn;
   public WebElement getEleHomeBtn()
   {
	   return  eleHomeBtn;
   }
   //to verify SessionName
   @FindBy(id="spnTitle")
   private WebElement eleSessionNameTxt;
   public WebElement getEleSessionNameTxt()
   {
	   return eleSessionNameTxt;
   }
   
   //to verify PageTitle
   @FindBy(id="spnTitle2")
   private WebElement elePageTitleTxt;
   public WebElement getElePageTitle()
   {
	   return elePageTitleTxt;
   }
   
 //to verify BackButton visible
   @FindBy(xpath="//div[@id='btnBackDiv']//img")
   private WebElement eleVisibleBackBtn;
   public WebElement getEleVisibleBackBtn()
   {
	   
	   
	   return eleVisibleBackBtn;
   }
   
   
   //to verify PageInstruction
   @FindBy(id="instructionText")
   private WebElement elePageInstructionTxt;
   public WebElement getElePageInstruction()
   {
	   return elePageInstructionTxt;
   }
   
   
  
   //to verify Home
   @FindBy(xpath="//div[@id='btnExitDiv']//img")
   private WebElement eleExitBtn;
   public WebElement getEleExitBtn()
   {
	   return  eleExitBtn;
   }
   
 //to verify Refresh
   @FindBy( id="imgRef")
   private WebElement eleRefreshBtn;
   public WebElement getEleRefreshBtn()
   {
	   return  eleRefreshBtn;
   }
   
   
  //to verify Next Button Visible
   @FindBy(xpath="//div[@id='btnNextDiv']//img")
   private WebElement eleVisibleNextBtn;
   public WebElement getEleVisibleNextBtn()
   {
	   return  eleVisibleNextBtn;
   }
   
   //to verify Next Button Hidden
   @FindBy(xpath="//div[@id='btnNextDivMO']//img")
   private WebElement eleHiddenNextBtn;
   public WebElement getEleHiddenNextBtn()
   {
	   return  eleHiddenNextBtn;
   }
  
   //to verify Settings button
   @FindBy(xpath="//div[@id='btnArtDiv']//img")
   private WebElement eleSettingsBtn;
   public WebElement getEleSettingsBtn()
   {
	   return  eleSettingsBtn;
   }
   
   
   //to verify Number of sessions
   @FindBy(xpath="//div[@class='divMiddle']//a")
   private List<WebElement> eleSessionsCount;
   public List<WebElement> getEleSessionsCount()
   {
	   return eleSessionsCount;
   }
	
   
 //to verify error message on re - attempt of assesment 
   @FindBy(xpath="//div[@id='slimScrollDiv1']//b")
   private WebElement eleAssesmentReAttemptErrorMsg;
   public WebElement getEleAssesmentReAttemptErrorMsg()
   {
	 return   eleAssesmentReAttemptErrorMsg; 
   }
   
   //to verify back button in the error page on re-attempt of assesment
   @FindBy(id="netbtn")
   private WebElement eleErrorMessageBackBtn;
   public WebElement getEleErrorMessageBackBtn()
   {
	 return   eleErrorMessageBackBtn; 
   }

   
   public void assessementPopUp() throws InterruptedException{
	   try{
	  StudentSignInPo studentpo=new StudentSignInPo(driver);
	   Thread.sleep(4000);
	   String pageNumber = getElePageNumber().getText().toString();
	   String totalpage = pageNumber.substring(5);
       int count = Integer.parseInt(totalpage);
	    Thread.sleep(6000);
	  for(int i=0;i<count;i++)
	   {
			   int k=i+1;
			  Thread.sleep(2000);
			  List<WebElement>questionlist = driver.findElements(By.xpath("(//div[contains(@id,'step')])["+k+"]"));
			  System.out.println(questionlist.size());
		  for(WebElement AssessementContents:questionlist)
				{
					
			  studentpo.elementStatus(AssessementContents,"The Assessement contents list is ", "displayed");	
				}
		  		Thread.sleep(4000);
		  		getEleNextButton().click();
		  		Thread.sleep(4000);
			   driver.switchTo().alert().accept();
			   Thread.sleep(4000);
			   WebElement element=driver.findElement(By.xpath("((//div[contains(@id,'step')])["+ k +" ]//div[@class='radio']//label[@class='radio-custom']//i[@class='fa fa-circle-o'])[1]"));
			   element.click();
			   Thread.sleep(4000);
			   getEleNextButton().click();
	  
	   }
	  Thread.sleep(2000);
	  studentpo.elementStatus(getEleFinishbutton(),"The Finish button is  ", "displayed");
	  getEleFinishbutton().click();
	  studentpo.elementStatus(getEleResultMessageText(),"The pre assessement result text is ", "displayed");
	  studentpo.elementStatus(getEleBackBtn(),"The back button is ", "displayed");
	   }catch(Exception e){
		   NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
	   }
   }
   
   public void verifyRadiobutton() throws InterruptedException
   {
	   try{
	   Thread.sleep(4000);
	   System.out.println(getEleRecentPageNumber().getText());
	   String pageNumber = getElePageNumber().getText().toString();
	   String totalpage = pageNumber.substring(5);
      int count = Integer.parseInt(totalpage);
      System.out.println(count);
      Thread.sleep(6000);
	   JavascriptExecutor j=(JavascriptExecutor) driver;
	   j.executeScript("window.scrollBy(0,1000)");
	    
	   for(int i=0;i<count;i++)
	   {
		   int k=i+1;
		   Thread.sleep(1000);

		   List<WebElement>RadioButton = driver.findElements(By.xpath("(//div[contains(@id,'step')])["+k+"]//div[@class='radio']//label"));
		   System.out.println(RadioButton.size());
		   for(int a=1;a<RadioButton.size();a++)
		   {
				 System.out.println("----------------------------");
				 System.out.println(a);
				 Thread.sleep(1000);
				 WebElement element=driver.findElement(By.xpath("((//div[contains(@id,'step')])["+ k +" ]//div[@class='radio']//label[@class='radio-custom']//i[@class='fa fa-circle-o'])["+a+"]"));
				 System.out.println(element);
				 Thread.sleep(1000);
				 element.click();
			 }
			
		   Thread.sleep(2000);
		    WebElement element1=driver.findElement(By.xpath("((//div[contains(@id,'step')])["+ k +" ]//div[@class='radio']//label[@class='radio-custom']//i[@class='fa fa-circle-o'])[1]"));
			 System.out.println(element1);
			 element1.click();
			 Thread.sleep(1000);
			 getEleNextButton().click();
	  
	   }
	   }catch(Exception e){
		   NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
	   }
	   
   }
public void verifyNextPrevbutton() throws InterruptedException
{
	try{
	
		StudentSignInPo studentpo=new StudentSignInPo(driver);
		Thread.sleep(4000);
	   String pageNumber = getElePageNumber().getText().toString();
	   System.out.println(pageNumber);
	   String totalpage = pageNumber.substring(5);
	   int count = Integer.parseInt(totalpage);
     for(int i=0;i<count;i++)
	   {
		   int k=i+1;
		   Thread.sleep(2000);
		   List<WebElement>RadioButton = driver.findElements(By.xpath("(//div[contains(@id,'step')])["+k+"]//div[@class='radio']//label"));
		   System.out.println("NO OF RADIOBUTTON="+RadioButton.size());
		   int a=1;
		   while(a<=RadioButton.size())
		   {
			  
			   System.out.println("----------------------------");
				 System.out.println("value of a="+a);
				 Thread.sleep(1000);
				 WebElement element=driver.findElement(By.xpath("((//div[contains(@id,'step')])["+k+"]//div[@class='radio']//label[@class='radio-custom'])["+a+"]"));
				 System.out.println(element);
				 Thread.sleep(1000);
				 JavascriptExecutor js = (JavascriptExecutor)driver;
			   	  js.executeScript("arguments[0].click();", element);
				 a++;
		   }
		     System.out.println("----------------------------");
		     Thread.sleep(2000);
		     WebElement element1=driver.findElement(By.xpath("((//div[contains(@id,'step')])["+ k +" ]//div[@class='radio']//label[@class='radio-custom']//i[@class='fa fa-circle-o'])[1]"));
			 System.out.println(element1);
			 element1.click();
			 Thread.sleep(1000);
			 getEleNextButton().click();
			 Thread.sleep(1000);
			 getElePreviousButton().click();
			 studentpo.elementStatus(getElePageNumber(),"This value requried error message is displayed", "displayed");
			 Thread.sleep(1000);
			 getEleNextButton().click();
			
	   }
	}catch(Exception e){
		   NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
	   }
	   
}
//To get TotalNumberOfPages
public int getTotalNumberOfPages(WebElement element1) throws InterruptedException
	{
		Thread.sleep(4000);
		String totalPageNumber=element1.getText();
		Integer totalPageCount=Integer.valueOf(totalPageNumber.substring(totalPageNumber.length()-2));
		System.out.println(totalPageCount);
		return totalPageCount;

	}

	//To Verify visibilityOfGamePageElements
	public void getVisibilityOfGamePageElements() throws InterruptedException
	{
						studentpo=new StudentSignInPo(driver);
						driver.switchTo().frame(getEleHeaderframe());
						Thread.sleep(4000);
						studentpo.elementStatus(getEleAboutUsBtn(), "AboutUs", "displayed");
						studentpo.elementStatus(getEleHomeBtn(), "Home", "displayed");
						studentpo.elementStatus(getEleExitBtn(), "Exit", "displayed");
						Thread.sleep(4000);
						driver.switchTo().defaultContent();
						Thread.sleep(4000);
						driver.switchTo().frame(getEleMiddleFrame());
						studentpo.elementStatus(getEleSettingsBtn(), "Settings", "displayed");
						driver.switchTo().defaultContent();
						Thread.sleep(4000);
						driver.switchTo().frame(getElefooterframe());
						studentpo.elementStatus(getEleVisibleNextBtn(), "Next", "displayed");

    }
			
	
//to verify GameWindowContent
	public void getGamePageContents(WebElement element1 , WebElement element2 , WebElement elelemnt3)
	{
	
						driver.switchTo().defaultContent();
						driver.switchTo().frame(getEleHeaderframe());
						NXGReports.addStep( "SessionName is  "+ getEleSessionNameTxt().getText().toString() , LogAs.PASSED, null);
						NXGReports.addStep( "PageTitle is "+ element2.getText().toString() , LogAs.PASSED, null);
						driver.switchTo().defaultContent();
						driver.switchTo().frame(getEleMiddleFrame());
					if(elelemnt3.getAttribute("style").contains("display:none;"))
					{
							System.out.println("has null value ");
					}
					else
					{
			
							NXGReports.addStep( "PageInstruction is "+  elelemnt3.getText().toString() , LogAs.PASSED, null);
						
					}
						
						driver.switchTo().defaultContent();
						driver.switchTo().frame(getElefooterframe());
						String CurrentPageNumber=element1.getText();
						NXGReports.addStep( "CurrentPageNumber is " + CurrentPageNumber , LogAs.PASSED, null);
						System.out.println(CurrentPageNumber);
		
	}
	
 //to verify status of page
     public void getPageStatus(WebElement element1 , WebElement element2 , WebElement elelemnt3, String browserName) throws InterruptedException
     {
        
        
         int pageCount=getTotalNumberOfPages(element1);
        
                 for(int i=0; i<=(pageCount-1);i++)
                 { 
                    
	                      getGamePageContents(element1,element2,elelemnt3);
	                      Thread.sleep(2000);
                     if(getEleVisibleBackBtn().isDisplayed())
                     {
                        
                       getEleVisibleBackBtn().click();
                       Thread.sleep(2000);
                       System.out.println("back button is visible ");
                       getEleVisibleNextBtn().click();
                       Thread.sleep(2000);
                       System.out.println("again cliked on next button");
                     }
                     else
                         if(driver.findElement(By.xpath("//div[@id='btnBackDivHidden']//img")).isDisplayed())
                         {
                             
                            
                         }
                    
                     Thread.sleep(4000);
                     if(getEleVisibleNextBtn().isDisplayed())
                     {
                                 getEleVisibleNextBtn().click();
                                
                     }
                    
                         else
                         if(getEleHiddenNextBtn().isDisplayed())
                         {
                                 getEleHiddenNextBtn().click();
                                
                         }
                 }
    
        
				            Thread.sleep(5000);
				            driver.switchTo().defaultContent();
				            Set<String> windowhandles=driver.getWindowHandles();
				            String prestWindowHandle=driver.getWindowHandle();
		            for(String currentWindowHandle: windowhandles)
		            {
		                if(!(currentWindowHandle.equals(prestWindowHandle)))
		                {
		                    driver.switchTo().window(currentWindowHandle);
		                
		                    break;
		                } 
		            }
      
        
		            	Thread.sleep(3000);
        
         //getEleExitBtn().click();
		            if(browserName.equals("chrome"))
		            {
		                driver.switchTo().frame(0); 
		            }
		            else
		                if(browserName.equals("firefox"))
		                {
		                    System.out.println("browswer is firefox ");
		                }
        
     }
           
		   
		   
//to switch to LatestPopupWindow after clicking on game link
public void switchToLatestPopupWindow()
{
		   Iterator<String> handleIterator=driver.getWindowHandles().iterator();
		   while(handleIterator.hasNext())
		   {
			   String handle=handleIterator.next();
			   if(!handleIterator.hasNext())
			   {
				   driver.switchTo().window(handle);
			   }
		   }
		   
}


//to switch back to parent window 
public void switchBackToParentWindow()
{
		   Set<String> windowhandles=driver.getWindowHandles();
	       String prestWindowHandle=driver.getWindowHandle();
	      
	       for(String currentWindowHandle: windowhandles)
	       {
	           if(!(currentWindowHandle.equals(prestWindowHandle)))
	           {
	             
	               driver.switchTo().window(currentWindowHandle);
	               break;
	           }  
	          
	       }
}
}







