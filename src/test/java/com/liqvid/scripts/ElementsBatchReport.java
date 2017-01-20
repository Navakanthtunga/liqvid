package com.liqvid.scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementsBatchReport {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.gecko.driver", "D:\\Screnarios\\geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.get("http://10.10.12.189:4001/learning/index.php");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.id("LoginForm_username")).sendKeys("SCHOLAR72");
		driver.findElement(By.id("LoginForm_password")).sendKeys("raghukiran92");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Batch Report')]")).getText());
		
		Thread.sleep(5000);
		driver.findElement(By.id("brpt")).click();
	
		Thread.sleep(5000);
		WebElement we1=driver.findElement(By.id("fld_class"));
		Select sel=new Select(we1);
		sel.selectByVisibleText("class 1");
		
		WebElement we2=driver.findElement(By.id("fld_section"));
		Select se2=new Select(we2);
		se2.selectByVisibleText("A");
		
		WebElement we3=driver.findElement(By.id("userType"));
		Select se3=new Select(we3);
		se3.selectByVisibleText("Student");
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
}
}