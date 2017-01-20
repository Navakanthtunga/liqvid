package com.liqvid.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyElementsStudentUpload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Screnarios\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("http://10.10.12.189:4001/learning/index.php");
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			driver.findElement(By.id("LoginForm_username")).sendKeys("SCHOLAR72");
			driver.findElement(By.id("LoginForm_password")).sendKeys("raghukiran92");
			Thread.sleep(5000);
		
			driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
			Thread.sleep(5000);
			// Student upload text
			System.out.println(driver.findElement(By.xpath("//a[@href='bulkUpload.php']")).getText());
			// To click on student upload icon 
			driver.findElement(By.xpath("//a[@href='bulkUpload.php']//i")).click();
			// Student data upload text
			System.out.println(driver.findElement(By.xpath("//div[text()='Student Data Upload']")).getText());
			
			WebElement we1=driver.findElement(By.id("fld_class"));
			Select se1=new Select(we1);
			se1.selectByVisibleText("Class2");
			WebElement we2=driver.findElement(By.id("fld_section"));
			Select se2=new Select(we2);
			se2.selectByVisibleText("D");
			
			// To Click on upload button
			driver.findElement(By.id("uploadDiv")).click();
			// To Download Sample excel file 
			driver.findElement(By.xpath("//i[@class='fa fa-download']")).click();
		
			// To Click on submit button
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).getText());
			
			driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).submit();
			Thread.sleep(2000);
			
			// To print error messages 
			System.out.println(driver.findElement(By.xpath("(//li[contains(text(),'This value is required.')])[1]")).getText());
			System.out.println(driver.findElement(By.xpath("(//li[contains(text(),'This value is required.')])[2]")).getText());
			System.out.println(driver.findElement(By.xpath("(//li[contains(text(),'This value is required.')])[3]")).getText());
	}

}
