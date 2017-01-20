package com.liqvid.scripts;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liqvid.library.BaseLib;
import com.liqvid.po.SignInPo;

public class VerifyElementsSignIn extends BaseLib{
SignInPo signinPage =null;
@Test
public void verifySignInPage() throws InterruptedException{
	driver.get("http://10.10.12.189:4001/learning/index.php");
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	signinPage=new SignInPo(driver);
	Assert.assertTrue(signinPage.getEleLogo().isDisplayed(), "Logo is not displayed");
	Assert.assertTrue(signinPage.getEleSignInText().isDisplayed(), "Sign In text is not displaying");
	Assert.assertTrue(signinPage.getEleSignInInstrText().isDisplayed(),"Instructions to sign in is not displaying");
	Assert.assertTrue(signinPage.getEleUnameText().isDisplayed(),"Uname text is not displaying");
	Assert.assertTrue(signinPage.getEleUname().isDisplayed(), "username text field is not displaying");
	Assert.assertTrue(signinPage.getElePwdText().isDisplayed(), "password Text is not displaying");
	Assert.assertTrue(signinPage.getElePassword().isDisplayed(), "password text field is not present");
	Assert.assertTrue(signinPage.EleSignInButt().isDisplayed(), "Sign in Button is not displayed");
	Assert.assertTrue(signinPage.getEleForgotPassLink().isDisplayed(), "Forget password link is not displaying");
	Assert.assertTrue(signinPage.getEleRegisterInstrText().isDisplayed(), "Instructions for registration is not displaying");
	Assert.assertTrue(signinPage.getEleRegister().isDisplayed(), "Register link is not displaying");
	Assert.assertTrue(signinPage.getCodeVersionDateText().isDisplayed(), "Footer Part is not displaying");
	Assert.assertTrue(signinPage.getEleCopyRightsText().isDisplayed(), "CopyRight text is not displaying");
	Assert.assertTrue(signinPage.getEleWebLink().isDisplayed(), "Link is not displayed");

	
	System.out.println(signinPage.getEleLogo().isDisplayed());
	System.out.println(signinPage.getEleUname().isDisplayed());
	System.out.println(signinPage.getElePassword().isDisplayed());
	System.out.println(signinPage.EleSignInButt().isDisplayed());
	System.out.println(signinPage.getEleForgotPassLink().isDisplayed());
	System.out.println(signinPage.getEleRegister().isDisplayed());
	System.out.println(signinPage.getEleSignInText().isDisplayed());
	System.out.println(signinPage.getEleSignInInstrText().isDisplayed());
	System.out.println(signinPage.getEleRegisterInstrText().isDisplayed());
	System.out.println(signinPage.getCodeVersionDateText().isDisplayed());
	System.out.println(signinPage.getEleCopyRightsText().isDisplayed());
	System.out.println(signinPage.getEleWebLink().isDisplayed());
	System.out.println(signinPage.getEleUnameText().isDisplayed());
	System.out.println(signinPage.getElePwdText().isDisplayed());
	
	signinPage.getEleUname().sendKeys("SCHOLAR72");
	signinPage.getElePassword().sendKeys("raghukiran92");
	signinPage.EleSignInButt().click();
//	signinPage.getEleRegister().click();
	Thread.sleep(4000);
	System.out.println("***************");
	
}
}
