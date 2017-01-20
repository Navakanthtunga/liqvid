package com.liqvid.scripts;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liqvid.library.BaseLib;
import com.liqvid.library.GenericLib;

public class SampleTest extends BaseLib {
	
	public void swtichhearderframe(){
		driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		Assert.assertTrue(driver.findElement(By.id("spnTitle2")).isDisplayed(),"The text is not displayed" );
		System.out.println(driver.findElement(By.id("spnTitle2")).getText());
	
		
	}
	public void swtichbarframe() throws InterruptedException{
		
		driver.switchTo().frame(driver.findElement(By.id("frabotbar")));
	Assert.assertTrue(driver.findElement(By.id("pgValue")).isDisplayed(),"the text is not displayed");
   	  System.out.println(driver.findElement(By.id("pgValue")).getText());
   	 WebElement element3 = driver.findElement(By.id("imgNext"));
     WebElement element4 = driver.findElement(By.id("imgRef"));
   	 JavascriptExecutor js = (JavascriptExecutor)driver;
   	  js.executeScript("arguments[0].click();", element3);
     Thread.sleep(5000);
     js.executeScript("arguments[0].click();", element4);
	
		
	}
	
	@Test(priority=1,enabled=true, description="To Verify the display of Elements in Auditor Login Page")
	public void adminLogin() throws InterruptedException, MalformedURLException{
		
		
		driver.get("http://10.10.12.189:4001/learning/index.php");
		driver.findElement(By.id("LoginForm_username")).sendKeys("RaghuKiran-1-71-2");
		driver.findElement(By.id("LoginForm_password")).sendKeys("raghukiran92");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='contentLogin']/div/div[1]/div[2]/section/div/div[3]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//b[@class='caret']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Profile']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Courses']")).click();
		Thread.sleep(5000);
	WebElement element = driver.findElement(By.id("class_select"));
		Select select=new Select(element);
		Thread.sleep(4000);
		select.selectByValue("Class2~~2");
		WebElement element1 = driver.findElement(By.id("course_select"));
		Select select1=new Select(element1);
		select1.selectByVisibleText("Course 2");
		Thread.sleep(4000);
		driver.findElement(By.id("strt")).click();
		Thread.sleep(4000);
		WebElement element2 = driver.findElement(By.xpath("//iframe[@id='iframes']"));
		driver.switchTo().frame(element2);
		driver.findElement(By.xpath(".//*[@id='index']/div/div[4]/a")).click();
		Set<String> allWindows=driver.getWindowHandles();
        Iterator<String> it = allWindows.iterator();
        String parentWindowId = it.next();
        String childWindowId = it.next();
        driver.switchTo().window(childWindowId);  
        Thread.sleep(6000);
        for(int i=1;i<=15;i++){
        	swtichhearderframe();
        	driver.switchTo().defaultContent();
        	swtichbarframe();
        	driver.switchTo().defaultContent();
        }

        driver.switchTo().window(parentWindowId);
        Thread.sleep(6000);
        driver.quit();
		
	}

}
