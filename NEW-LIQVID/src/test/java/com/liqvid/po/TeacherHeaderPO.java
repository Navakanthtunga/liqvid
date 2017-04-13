package com.liqvid.po;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TeacherHeaderPO 
{
	WebDriver driver = null;
	public TeacherHeaderPO(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// To identify Text in header
		@FindBy(id="spnTitle")
		private WebElement eleHeaderText;
		public WebElement getEleHeaderText(){
			return eleHeaderText;
		}
    //text in center of header
		@FindBy(xpath="//span[@id='spnTitle2']")
		private WebElement eleHeaderCenterText;
		public WebElement getEleHeaderCenterText(){
			return eleHeaderCenterText;
		}
	//about us icon
		@FindBy(id="imgAboutUs")
		private WebElement eleAboutUsIcon;
		public WebElement getEleAboutUsIcon(){
			return eleAboutUsIcon;
		}
	//about home icon
		@FindBy(id="imgHome")
		private WebElement eleAboutHomeIcon;
		public WebElement getEleAboutHomeIcon(){
			return eleAboutHomeIcon;
		}
		//A.R.t icon
		   @FindBy(xpath="(//img[@id='imgArt'])[1]")
		   private WebElement eleArtIcon;
		   public WebElement getEleArtIcon()
		   {
			   return eleArtIcon;
		   }
		   
		 
		   
	  
 }
    

