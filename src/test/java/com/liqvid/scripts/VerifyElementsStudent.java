package com.liqvid.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyElementsStudent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Screnarios\\geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("http://10.10.12.189:4001/learning/index.php");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@href='http://10.10.12.189:4001/pages/registration.php']")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("studentLi")).click();
			System.out.println(driver.findElement(By.xpath("//p[contains(text(),'First-time user, register here.')]")).getText());
			System.out.println(driver.findElement(By.id("studentLi")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='First Name'])[2]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Last Name'])[2]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Email ID'])[2]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Mobile Number'])[2]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Date Of Birth'])[2]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Gender'])[2]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Password'])[2]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Confirm Password'])[2]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Select Class'])[2]")).getText());
			System.out.println(driver.findElement(By.xpath("(//label[text()='Select Section'])[2]")).getText());
			System.out.println(driver.findElement(By.id("footer-copyright")).getText());
			System.out.println(driver.findElement(By.xpath("(//a[@href='../learning/index.php'])[2]")).getText());
			
			driver.findElement(By.xpath("(//input[@id='fld_first_name'])[2]")).sendKeys("test1");
			driver.findElement(By.xpath("(//input[@id='fld_last_name'])[2]")).sendKeys("test1");
			driver.findElement(By.xpath("(//input[@id='fld_email'])[2]")).sendKeys("test1@gmail.com");
			driver.findElement(By.id("fld_mobile")).sendKeys("9874563210");
			
			WebElement wec1=driver.findElement(By.xpath("(//div[@ class='selected-dial-code'])[2]"));
			System.out.println(wec1.getText());
			WebElement we1=driver.findElement(By.xpath("(//select [@id='fld_gender'])[2]"));
			Thread.sleep(2000);
			Select sel=new Select(we1);
			Thread.sleep(2000);
			sel.selectByVisibleText("Male");
			driver.findElement(By.id("fld_Spassword")).sendKeys("abc");
			driver.findElement(By.xpath("(//input[@id='confirmfld_password'])[2]")).sendKeys("abc");
			
			// To select class 1
				WebElement we2=driver.findElement(By.id("fld_class"));
				Select sel1=new Select(we2);
				sel1.selectByVisibleText("Class 1");
				Thread.sleep(2000);
			// To select section a
				WebElement we3=driver.findElement(By.id("fld_section"));
				Select sel2=new Select(we3);
				sel2.selectByVisibleText("A");		
				
			driver.findElement(By.name("uSignUp")).click();
	}

}
