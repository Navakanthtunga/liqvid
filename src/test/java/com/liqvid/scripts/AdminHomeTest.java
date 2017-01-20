package com.liqvid.scripts;

import org.testng.annotations.Test;

import com.liqvid.library.BaseLib;
import com.liqvid.po.SignInPo;

public class AdminHomeTest extends BaseLib{

	SignInPo adminHome=null;

	
	@Test
public void login() throws InterruptedException{
		driver.get("http://10.10.12.189:4001/learning/index.php");
		adminHome=new SignInPo(driver);
		adminHome.getEleUname().sendKeys("SCHOLAR72");
		Thread.sleep(5000);
		adminHome.getElePassword().sendKeys("raghukiran92");
		Thread.sleep(5000);
		adminHome.EleSignInButt().click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}

}
