package com.liqvid.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyElementsHomePage {

	public static void main(String[] args) throws Exception {
		
		
	     System.setProperty("webdriver.gecko.driver", "D:\\Screnarios\\geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("http://10.10.12.189:4001/learning/index.php");
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			driver.findElement(By.id("LoginForm_username")).sendKeys("SCHOLAR72");
			driver.findElement(By.id("LoginForm_password")).sendKeys("raghukiran92");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
			System.out.println(driver.findElement(By.xpath("//a[@class='navbar-brand' ]//img")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//div[@class='formalFontFamily']")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//li[@id='home']//i")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Home')]")).getText());
			System.out.println(driver.findElement(By.xpath("//a[@ href='license_update.php']//i")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//span[contains(text(),'License Update')]")).getText());			
			driver.findElement(By.xpath("//a[@ href='createBatch.php']//i")).isDisplayed();
			System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Create Batch')]")).getText());
			System.out.println(driver.findElement(By.xpath("//a[@ href='batchreport.php']//i")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Batch Report')]")).getText());
			System.out.println(driver.findElement(By.xpath("//a[@href='bulkUpload.php']//i")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Student Upload')]")).getText());
			System.out.println(driver.findElement(By.xpath("//a[@href='resources.php']//i")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Resources')]")).getText());
			System.out.println(driver.findElement(By.xpath("//a[@href='logout.php']//i")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Sign out')]")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Welcome!')]")).getText());
			System.out.println(driver.findElement(By.xpath("//form[@id='profile-pic-form']//img")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Last Login')]")).getText());
			System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Last Sync')]")).getText());
			System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Licence Expiry Date')]")).getText());
			System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Access URL')]")).getText());
			System.out.println(driver.findElement(By.xpath("//div[@ class='col-sm-9']")).getText());
			System.out.println(driver.findElement(By.xpath("(//div[@ class='col-sm-6 col-md-3 padder-v b-light'])[1]")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//div[@ class='col-sm-6 col-md-3 padder-v b-r b-l b-light lt']")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("(//div[@ class='col-sm-6 col-md-3 padder-v b-light'])[2]")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//div [@class='col-sm-6 col-md-3 padder-v b-l b-light lt']")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("(//a[@href='#']//strong)[1]")).getText());
			System.out.println(driver.findElement(By.xpath("(//a[@href='#']//strong)[2]")).getText());
			System.out.println(driver.findElement(By.xpath("(//a[@href='#']//strong)[3]")).getText());
			System.out.println(driver.findElement(By.xpath("(//a[@href='#']//strong)[4]")).getText());
			System.out.println(driver.findElement(By.xpath("(//canvas[@ class='canvasjs-chart-canvas'])[1]")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("(//div[@ id='coursebased']//div//p)[1]")).getText());
			System.out.println(driver.findElement(By.xpath("(//div[@ id='coursebased']//div//p)[2]")).getText());
			System.out.println(driver.findElement(By.id("footer-copyright")).getText());
			System.out.println(driver.findElement(By.id("footer-terms")).getText());
			System.out.println(driver.findElement(By.xpath("//img[@id='viewImgProfileHeader']")).isDisplayed());
			
		
			
	}


}
