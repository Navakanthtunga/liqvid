package com.liqvid.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyProfile {
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
			System.out.println("**********");
			
			Thread.sleep(30000);
			// To identify profile drop down icon
			driver.findElement(By.xpath("(//a[@ class='dropdown-toggle']//span)[3]")).click();
			System.out.println("**********");
		
			Thread.sleep(5000);
			// To click on profile 
			driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath(("//label[contains(text(),'First Name')]"))).getText());
			System.out.println(driver.findElement(By.xpath(("//label[contains(text(),'Last Name')]"))).getText());
			System.out.println(driver.findElement(By.xpath(("//label[contains(text(),'Email ID')]"))).getText());
			System.out.println(driver.findElement(By.xpath(("//label[contains(text(),'Phone')]"))).getText());
			System.out.println(driver.findElement(By.xpath(("//label[contains(text(),'Date Of Birth')]"))).getText());
			System.out.println(driver.findElement(By.xpath(("//label[contains(text(),'Gender')]"))).getText());
			System.out.println(driver.findElement(By.xpath(("//a[contains(text(),'Change Password')]"))).isDisplayed());
			System.out.println(driver.findElement(By.id(("gender"))).isDisplayed());
			
			driver.findElement(By.name("first_name")).sendKeys("xyz");
			driver.findElement(By.name("last_name")).sendKeys("xyz");
			driver.findElement(By.name("email_id")).sendKeys("xyz@ghhui.com");
			driver.findElement(By.name("phone")).sendKeys("7894561230");
			driver.findElement(By.xpath(("//a[contains(text(),'Change Password')]"))).click();
			
			//Thread.sleep(5000);
			
			System.out.println(driver.findElement(By.xpath(("//label[contains(text(),'Old Password')]"))).getText());
			System.out.println(driver.findElement(By.xpath(("//label[contains(text(),' New Password')]"))).getText());
			System.out.println(driver.findElement(By.xpath(("//label[contains(text(),'Confirm Password')]"))).getText());
			System.out.println(driver.findElement(By.name(("update"))).getText());
			driver.findElement(By.name("update")).click();
			driver.findElement(By.id("oldPassword")).sendKeys("xyz");
			driver.findElement(By.id("newPassword")).sendKeys("xyz");
			driver.findElement(By.id("cnfPassword")).sendKeys("xyz");
			driver.findElement(By.name("update")).click();
			

}
}

