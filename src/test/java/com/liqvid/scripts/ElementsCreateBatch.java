package com.liqvid.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementsCreateBatch {
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
		
		System.out.println(driver.findElement(By.id("cbatch")).getText());
		Thread.sleep(5000);
		driver.findElement(By.id("cbatch")).click();
		
	System.out.println(driver.findElement(By.xpath("(//div[@class='col-sm-4'])[1]")).getText());
	System.out.println(driver.findElement(By.xpath("(//div[@class='col-sm-4'])[2]")).getText());
	System.out.println(driver.findElement(By.xpath("(//div[@class='col-sm-4'])[3]")).getText());
		
		WebElement we1=driver.findElement(By.id("fld_class1"));
		
	//	Thread.sleep(5000);
		Select sel1=new Select(we1);
		sel1.selectByVisibleText("class 5");
		
		WebElement we2=driver.findElement(By.id("fld_section1"));
		
	//	Thread.sleep(5000);
		Select sel2=new Select(we2);
		sel2.selectByVisibleText("D");
	WebElement we3=driver.findElement(By.id("fld_sectionT1"));
			
		//	Thread.sleep(5000);
		Select sel3=new Select(we3);
		sel3.selectByVisibleText("Z");
	driver.findElement(By.xpath("//p[contains(text(),'ADD')]")).click();
		WebElement we4=driver.findElement(By.id("fld_class2"));
				
	//	Thread.sleep(5000);
		Select sel4=new Select(we4);
		sel4.selectByVisibleText("class 9");
					
		WebElement we5=driver.findElement(By.id("fld_section2"));
					
	//	Thread.sleep(5000);
		Select sel5=new Select(we5);
		sel5.selectByVisibleText("X");
		Thread.sleep(2000);
		WebElement we6=driver.findElement(By.id("fld_sectionT2"));
						
	//	Thread.sleep(5000);
		Select sel6=new Select(we6);
		sel6.selectByVisibleText("G");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//p[contains(text(),'ADD')]")).click();
						
	WebElement we7=driver.findElement(By.id("fld_class3"));
							
	//	Thread.sleep(5000);
		Select sel7=new Select(we7);
		sel7.selectByVisibleText("class 1");
								
	WebElement we8=driver.findElement(By.id("fld_section3"));
						
	//	Thread.sleep(5000);
	Select sel8=new Select(we8);
	sel8.selectByVisibleText("C");
	WebElement we9=driver.findElement(By.id("fld_sectionT3"));
								
	//	Thread.sleep(5000);
		Select sel9=new Select(we9);
		sel9.selectByVisibleText("N");	
		Thread.sleep(2000);
	driver.findElement(By.id("removeMoreDtl")).click();	
	
driver.findElement(By.className("btn btn-primary")).click();	
}
}