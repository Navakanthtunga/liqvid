package com.student.po;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Sample2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Screnarios\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("http://10.10.12.189:4001/learning/index.php");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("LoginForm_username")).sendKeys("kiran-3");
			driver.findElement(By.id("LoginForm_password")).sendKeys("raghukiran923");
			Thread.sleep(3000);		
			driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[contains(text(),'Courses')]")).click();
			WebElement we1=driver.findElement(By.id("class_select"));
			Select se1=new Select(we1);
			se1.selectByVisibleText("Class 2 - Section B");
			Thread.sleep(5000);
			WebElement we2=driver.findElement(By.id("course_select"));
			Select se2=new Select(we2);
			se2.selectByVisibleText("Course 2");
			Thread.sleep(5000);
			driver.findElement(By.id("strt")).click();		
			Thread.sleep(5000);
			int size=driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			// To click on "Farmer found the Gems!"
			driver.findElement(By.xpath("//a[contains(text(),'Farmer found the Gems!')]")).click();
			Thread.sleep(5000);
			// To get Child windows
			Set<String> handle=driver.getWindowHandles();
			handle.size();
			System.out.println(handle);
			Iterator<String> itr=handle.iterator();
			String win1=itr.next();
			String win2=itr.next();
			System.out.println(win1);
			System.out.println(win2); 
			
			// Switch to Child Window
			
			driver.switchTo().window(win2);
			System.out.println("Driver is in child window");
			System.out.println(driver.getCurrentUrl());
			int count1=driver.findElements(By.tagName("frameset")).size();
			System.out.println("Parent frame :"+count1);
			int count=driver.findElements(By.tagName("frame")).size();
			System.out.println("No of frames: "+count);
/*			
			// Switching to frame "fraheader"
			driver.switchTo().frame("fraheader");
			// To get Welcome text
			System.out.println(driver.findElement(By.id("spnTitle2")).getText());
			// To get The goat eater text
			System.out.println(driver.findElement(By.id("spnTitle")).getText());
			// About us icon 
			System.out.println(driver.findElement(By.id("imgAboutUs")).isDisplayed()); 		
			System.out.println(driver.findElement(By.id("imgAboutUs")).getAttribute("title"));
			System.out.println(driver.findElement(By.id("imgAboutUs")).getAttribute("alt"));
			// Home icon
			System.out.println(driver.findElement(By.id("imgHome")).isDisplayed());			
			System.out.println(driver.findElement(By.id("imgHome")).getAttribute("title"));
			System.out.println(driver.findElement(By.id("imgHome")).getAttribute("alt"));
			// Exit image
			System.out.println(driver.findElement(By.id("imgExit")).isDisplayed());			
			System.out.println(driver.findElement(By.id("imgExit")).getAttribute("title"));
			System.out.println(driver.findElement(By.id("imgExit")).getAttribute("alt"));
			// Switching to parent frame
			driver.switchTo().parentFrame();
			// Switching To frame content 
			driver.switchTo().frame("content");
			// Art icon
			System.out.println(driver.findElement(By.id("imgArt")).getAttribute("title"));
			// Instructions
			System.out.println(driver.findElement(By.id("instructionText")).isDisplayed());	
			// Switching to parent frame
			driver.switchTo().parentFrame();
			// Switching to frame frabotbar
			driver.switchTo().frame("frabotbar");
			// Pageindex
			String pI=driver.findElement(By.id("pgValue")).getText();
			
			System.out.println(pI);
			String str1=pI.substring(10);
			int pageCount=Integer.parseInt(str1);
			System.out.println(pageCount);
			// Back icon
			System.out.println(driver.findElement(By.id("imgBack")).isEnabled());
			System.out.println(driver.findElement(By.id("imgBack")).isDisplayed());
			System.out.println(driver.findElement(By.id("imgBack")).getAttribute("title"));
			// Refresh icon
			System.out.println(driver.findElement(By.id("imgRef")).isDisplayed());
			System.out.println(driver.findElement(By.id("imgRef")).getAttribute("alt"));
			System.out.println(driver.findElement(By.id("imgRef")).getAttribute("title"));
			// Next icon
			System.out.println(driver.findElement(By.id("imgNext")).isDisplayed());
			System.out.println(driver.findElement(By.id("imgNext")).getAttribute("title"));
			System.out.println(driver.findElement(By.id("imgNext")).getAttribute("alt"));
			// Switch to parent frame
			driver.switchTo().parentFrame();
			// Switch to frame fraheader
			driver.switchTo().frame("fraheader");
			// To click on close icon 
			driver.findElement(By.id("imgExit")).click();
			System.out.println("*****************************");*/
			// Pageindex
			// Switching to frame frabotbar
						driver.switchTo().frame("frabotbar");
						// Pageindex
			String pI=driver.findElement(By.id("pgValue")).getText();
			
			System.out.println(pI);
			String str1=pI.substring(10);
			int pageCount=Integer.parseInt(str1);
			System.out.println(pageCount);
			for(int i=1;i<=pageCount;i++){
				if(i==pageCount){
					System.out.println(i);
					driver.findElement(By.id("imgBack")).click();	
					System.out.println("Reached 23 of 23");
				}
	
				Thread.sleep(2000); 
				System.out.println("The i value is : "+i);
				driver.switchTo().parentFrame();
				driver.switchTo().frame("fraheader");
				// To get Welcome text
				System.out.println(driver.findElement(By.id("spnTitle2")).getText());
				// To get The goat eater text
				System.out.println(driver.findElement(By.id("spnTitle")).getText());
				// About us icon 
				System.out.println(driver.findElement(By.id("imgAboutUs")).isDisplayed()); 		
				System.out.println(driver.findElement(By.id("imgAboutUs")).getAttribute("title"));
				
				// Home icon
				System.out.println(driver.findElement(By.id("imgHome")).isDisplayed());			
				System.out.println(driver.findElement(By.id("imgHome")).getAttribute("title"));
				
				// Exit image
				System.out.println(driver.findElement(By.id("imgExit")).isDisplayed());			
				System.out.println(driver.findElement(By.id("imgExit")).getAttribute("title"));
				
				// Switching to parent frame
				driver.switchTo().parentFrame();
				// Switching To frame content 
				driver.switchTo().frame("content");
				// Art icon
				System.out.println(driver.findElement(By.id("imgArt")).getAttribute("title"));
				// Instructions
				System.out.println(driver.findElement(By.id("instructionText")).isDisplayed());	
				System.out.println(driver.findElement(By.id("instructionText")).getText());
				// Switching to parent frame
				driver.switchTo().parentFrame();
				// Switching to frame frabotbar
				driver.switchTo().frame("frabotbar");
				// Pageindex
			System.out.println(driver.findElement(By.id("pgValue")).getText());
				
				// Back icon

				System.out.println(driver.findElement(By.id("imgBack")).getAttribute("title"));
				// Refresh icon
				System.out.println(driver.findElement(By.id("imgRef")).isDisplayed());
				driver.findElement(By.id("imgRef")).click();
				System.out.println("screen is refreshing");
				Thread.sleep(5000);
				System.out.println(driver.findElement(By.id("imgRef")).getAttribute("title"));
				// Next icon
				Thread.sleep(5000);
				System.out.println("Waiting for Next icon");
				System.out.println(driver.findElement(By.id("imgNext")).isDisplayed());
				System.out.println(driver.findElement(By.id("imgNext")).getAttribute("title"));			
				driver.findElement(By.id("imgNext")).click();
				
			}
			
}
}
