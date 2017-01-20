package com.student.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModifiedSample2 {
	
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", "D:\\Screnarios\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	GameTest1 test1=new GameTest1(driver);
	test1.login();
	Thread.sleep(5000);
	test1.selCourse();
	test1.childWin();
	test1.getChildDetails();
	
		// To get page index value	
		driver.switchTo().frame("frabotbar");
		// Pageindex
	String pI=driver.findElement(By.id("pgValue")).getText();

	System.out.println(pI);
	String str1=pI.substring(10);
	int pageCount=Integer.parseInt(str1);
	System.out.println("----------"+pageCount);
	
for(int i=1;i<=pageCount;i++){
	System.out.println("-----"+i);
	if(i==pageCount){
		
		driver.findElement(By.id("imgBack")).click();	
		System.out.println("Reached 23 of 23");
		test1.exit();
	}
	test1.headerFrame();
	test1.contentFrame();
	test1.footerFrame();
}

}
}
