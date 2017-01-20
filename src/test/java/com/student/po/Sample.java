package com.student.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Screnarios\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	   // WebDriverWait wait=new WebDriverWait(driver, 1800);
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
			WebElement we2=driver.findElement(By.id("course_select"));
			Select se2=new Select(we2);
			se2.selectByVisibleText("Course 2");
			Thread.sleep(5000);
			driver.findElement(By.id("strt")).click();		
			int size=driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			// To click on pre assessment 
			driver.findElement(By.xpath("//a[contains(text(),'Pre Assessment')]")).click();
			Thread.sleep(10000);
			System.out.println("**********");
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);			
			// To click on Start test button			
			driver.switchTo().frame(0);
			System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'English Edge Assessments')]")).getText());
			System.out.println(driver.findElement(By.id("slimScrollDiv1")).getText());
			// To click on start test button
			driver.findElement(By.xpath("//a[contains(text(),'Start Test')]")).click();
			Thread.sleep(1800000);	
			// To check next button is displaying or not.....
		//System.out.println(driver.findElement(By.id("netbtn")).isDisplayed());
		
	System.out.println("**************");
	// To get Test Start Time
	System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Test Start Time : ')]")).getText());
	// To get Test End Time
	System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Test End Time : ')]")).getText());
	// To get the title of Course
	System.out.println(driver.findElement(By.xpath("//section[@id='content']//b")).getText());
	// To get All the best text
	System.out.println(driver.findElement(By.xpath("//p[contains(text(),'All the Best!')]")).getText());
	// To get Timer
	System.out.println(driver.findElement(By.id("countdown")).getText());
	// To get Question no
	System.out.println(driver.findElement(By.id("showFinish")).getText());
	// get Question and options
	System.out.println(driver.findElement(By.id("step0")).getText());
	// To click on radio button 1
	driver.findElement(By.xpath("(//div[@ id='step0']//div[@ class='radio']//label)[1]")).click();
	System.out.println(driver.findElement(By.xpath("(//div[@ id='step0']//div[@ class='radio']//label)[1]")).isEnabled());
	Thread.sleep(5000);
	// To click on Next button 
	driver.findElement(By.id("netbtn")).sendKeys(Keys.ENTER);
	System.out.println("clicked next button");
	Thread.sleep(5000);
	// To get question and options
	System.out.println(driver.findElement(By.id("step1")).getText());
	// To click on Previous button
	driver.findElement(By.id("prebtn")).sendKeys(Keys.ENTER);
	System.out.println("clicked prev button");
	System.out.println("Going to for loop");
	System.out.println(driver.findElement(By.id("slimScrollDiv1")).getText());
	System.out.println(driver.findElement(By.id("netbtn")).isDisplayed());
	/*for(int i=0;i<=31;i++){
		driver.findElement(By.xpath("(//div[@ id='step0']//div[@ class='radio']//label)[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("netbtn")).sendKeys(Keys.ENTER);
		System.out.println("clicked next button");
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("step1")).getText());
		//driver.findElement(By.id("prebtn")).sendKeys(Keys.ENTER);
		//System.out.println("clicked prev button");
	}*/
	}
}