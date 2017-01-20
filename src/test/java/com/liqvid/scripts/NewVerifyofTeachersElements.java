package com.liqvid.scripts;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class NewVerifyofTeachersElements {

	public static void main(String[] args) throws InterruptedException {
		
	     System.setProperty("webdriver.gecko.driver", "D:\\Screnarios\\geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("http://10.10.12.189:4001/learning/index.php");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			// To verify the error messages in the sign in page 
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("LoginForm_username_em_")).getText());
			System.out.println(driver.findElement(By.id("LoginForm_password_em_")).getText());
			//
		// To get the error message that is displaying if sign in is clicked	
			//---------------------------//
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@href='http://10.10.12.189:4001/pages/registration.php']")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("tSignUp")).click();
			List<WebElement> list=driver.findElements(By.className("required"));
			
			 for(int i=0;i<=list.size()-1;i++){
					System.out.println(list.get(i).getText());
			 }
			//-----------------------//
			
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'First-time user, register here.')]")).getText());
			System.out.println(driver.findElement(By.id("teacherLi")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='First Name'])[1]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Last Name'])[1]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Email ID'])[1]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Mobile Number'])[1]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Date Of Birth'])[1]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Gender'])[1]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Password'])[1]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Confirm Password'])[1]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Select Class'])[1]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Select Section'])[1]")).getText());
			System.out.println(driver.findElement(By.id("footer-copyright")).getText());
			System.out.println(driver.findElement(By.xpath("(//a[@href='../learning/index.php'])[1]")).getText());
			
			driver.findElement(By.xpath("(//input[@id='fld_first_name'])[1]")).sendKeys("test1");
			driver.findElement(By.xpath("(//input[@id='fld_last_name'])[1]")).sendKeys("test1");
			driver.findElement(By.xpath("(//input[@id='fld_email'])[1]")).sendKeys("test1@gmail.com");
			driver.findElement(By.id("fld_mobile1")).sendKeys("9874563210");
			
			WebElement wecs=driver.findElement(By.xpath("(//div[@ class='selected-dial-code'])[1]"));
			System.out.println(wecs.getText());
			WebElement we1=driver.findElement(By.xpath("(//select [@id='fld_gender'])[1]"));
			Thread.sleep(2000);
			Select sel=new Select(we1);
			Thread.sleep(2000);
			sel.selectByVisibleText("Male");
			driver.findElement(By.id("fld_password")).sendKeys("abc");
			driver.findElement(By.xpath("(//input[@id='confirmfld_password'])[1]")).sendKeys("abc");
			// To select class -1
			WebElement we2=driver.findElement(By.id("fld_class1"));
			Select sel1=new Select(we2);
			sel1.selectByVisibleText("Class 1");
			// To select section a
			WebElement we3=driver.findElement(By.id("fld_section1"));
			Select sel2=new Select(we3);
			sel2.selectByVisibleText("A");
			// To click on add button
			driver.findElement(By.xpath("(//p[@class='btn btn-primary btnHeight'])[1]")).click();
			
			// To select class -2
			WebElement we4=driver.findElement(By.id("fld_class2"));
				Select sel3=new Select(we4);
				sel3.selectByVisibleText("Class 2");
			// To select section a
				WebElement we5=driver.findElement(By.id("fld_section2"));
				Select sel4=new Select(we5);
				sel4.selectByVisibleText("B");
			// To click on remove button
				driver.findElement(By.xpath("(//p[@class='btn btn-primary btnHeight'])[2]")).click();
				
	// To click on Sign Up button
				driver.findElement(By.name("tSignUp")).click();
		
	}

}
