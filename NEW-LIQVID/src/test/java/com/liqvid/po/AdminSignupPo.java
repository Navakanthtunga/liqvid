package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminSignupPo {
	WebDriver driver;
	public AdminSignupPo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//To verify 'EnglishEdge Setup' text in Admin Sign-up page
  	@FindBy(xpath="//div[text()='EnglishEdge Setup']")
    private WebElement eleEnglishEdgeSetupText;
    public WebElement getEleEnglishEdgeSetupText()  {
    	return eleEnglishEdgeSetupText;
    }
	//To verify 'EnglishEdge' Logo in Admin Sign-up page
  	@FindBy(xpath="//a[@class='navbar-brand']//img")
    private WebElement eleEnglishEdgeLogo;
    public WebElement getEleEnglishEdgeLogo()  {
    	return eleEnglishEdgeLogo;
    }    
	// To identify 'Sign-up' text in Admin Sign-up page
	@FindBy(xpath="//h1[text()='Sign-up']")
	private WebElement eleSignUpText;
	public WebElement getEleSignUpText(){
		return eleSignUpText;
	}
	// To identify 'Center Name' text in Admin Sign-up page
	@FindBy(xpath="//big[text()='Center Name*']")
	private WebElement eleCenterNameText;
	public WebElement getEleCenterNameText(){
		return eleCenterNameText;
	}
	// To identify 'Center Name' text Field in Admin Sign-up page
	@FindBy(id="centerName")
	private WebElement eleCenterField;
	public WebElement getEleCenterField(){
		return eleCenterField;
	}	
	// To identify 'Center Address' text in Admin Sign-up page
	@FindBy(xpath="//big[text()='Center Address*']")
	private WebElement eleCenterAddressText;
	public WebElement getEleCenterAddressText(){
		return eleCenterAddressText;
	}
	// To identify 'Center Address' text Field in Admin Sign-up page
	@FindBy(id="centerAddress")
	private WebElement eleCenterAddressField;
	public WebElement getEleCenterAddressField(){
		return eleCenterAddressField;
	}	
	// To identify 'Country' text in Admin Sign-up page
	@FindBy(xpath="//big[text()='Country*']")
	private WebElement eleCountryText;
	public WebElement getEleCountryText(){
		return eleCountryText;
	}
	// To identify 'Country'dropdown in Admin Sign-up page
	@FindBy(id="country_dropdown")
	private WebElement eleCountryDropDown;
	public WebElement getEleCountryDropDown(){
		return eleCountryDropDown;
	}	
	// To identify 'State' text in Admin Sign-up page
	@FindBy(xpath="//big[text()='State*']")
	private WebElement eleStateText;
	public WebElement getEleStateText(){
		return eleStateText;
	}
	// To identify 'State' dropdown in Admin Sign-up page
	@FindBy(id="state_dropdown")
	private WebElement eleStateDropDown;
	public WebElement getEleStateDropDown(){
		return eleStateDropDown;
	}		
	// To identify 'City' text in Admin Sign-up page
	@FindBy(xpath="//big[text()='City*']")
	private WebElement eleCityText;
	public WebElement getEleCityText(){
		return eleCityText;
	}
	// To identify 'City' dropdown in Admin Sign-up page
	@FindBy(id="city_dropdown")
	private WebElement eleCityDropDown;
	public WebElement getEleCityDropDown(){
		return eleCityDropDown;
	}
	// To identify 'PinCode' text in Admin Sign-up page
	@FindBy(xpath="//big[text()='Pin Code*']")
	private WebElement elePincodeText;
	public WebElement getElePincodeText(){
		return elePincodeText;
	}
	// To identify 'PinCode' Field in Admin Sign-up page
	@FindBy(id="centerPincode")
	private WebElement elePincodeField;
	public WebElement getElePincodeField(){
		return elePincodeField;
	}
	// To identify 'Administrator Name' text in Admin Sign-up page
	@FindBy(xpath="//big[text()='Administrator Name*']")
	private WebElement eleAdminNameText;
	public WebElement getEleAdminNameText(){
		return eleAdminNameText;
	}
	// To identify 'Administrator Name' Field in Admin Sign-up page
	@FindBy(id="centerAdminName")
	private WebElement eleAdminNameField;
	public WebElement getEleAdminNameField(){
		return eleAdminNameField;
	}	
	// To identify 'Email ID' text in Admin Sign-up page
	@FindBy(xpath="//big[text()='Email ID*']")
	private WebElement eleEmailIDText;
	public WebElement getEleEmailIDText(){
		return eleEmailIDText;
	}
	// To identify 'Email ID' Field in Admin Sign-up page
	@FindBy(id="emailId")
	private WebElement eleEmailIdField;
	public WebElement getEleEmailIdField(){
		return eleEmailIdField;
	}	
	// To identify '(Admin login credentials will be sent to this Email ID.)' Instruction in Admin Sign-up page
	@FindBy(xpath="//p[text()='(Admin login credentials will be sent to this Email ID.)']")
	private WebElement eleEmailIdInstruction;
	public WebElement getEleEmailIdInstruction(){
		return eleEmailIdInstruction;
	}	
	// To identify 'Mobile Number' text in Admin Sign-up page
	@FindBy(xpath="//big[text()='Mobile Number*']")
	private WebElement eleMobileNumText;
	public WebElement getEleMobileNumText(){
		return eleMobileNumText;
	}
	// To identify 'Mobile Number' Field in Admin Sign-up page
	@FindBy(id="mobileNumber")
	private WebElement eleMobileNumField;
	public WebElement getEleMobileNumField(){
		return eleMobileNumField;
	}	
	// To identify '(Admin login credentials will be sent to this Mobile Number.)' Instruction in Admin Sign-up page
	@FindBy(xpath="//p[text()='(Admin login credentials will be sent to this Mobile Number.)']")
	private WebElement eleMobileNumInstruction;
	public WebElement getEleMobileNumInstruction(){
		return eleMobileNumInstruction;
	}	
	// To identify 'Contact Number' text in Admin Sign-up page
	@FindBy(xpath="//big[text()='Contact Number*']")
	private WebElement eleContactNumText;
	public WebElement getEleContactNumText(){
		return eleContactNumText;
	}
	// To identify 'Contact Number' Field in Admin Sign-up page
	@FindBy(id="centerContactNumber")
	private WebElement eleContactNumField;
	public WebElement getEleContactNumField(){
		return eleContactNumField;
	}	
	// To identify '(Enter landline number with STD code.)' Instruction in Admin Sign-up page
	@FindBy(xpath="//p[text()='(Enter landline number with STD code.)']")
	private WebElement eleContactNumInstruction;
	public WebElement getEleContactNumInstruction(){
		return eleContactNumInstruction;
	}
	// To identify 'Submit' Button in Admin Sign-up page
	@FindBy(xpath="//button[text()='SUBMIT']")
	private WebElement eleSubmitButt;
	public WebElement getEleSubmitButt(){
		return eleSubmitButt;
	}
    //To verify Customer Support text in registration page
	@FindBy(xpath="//strong[text()='Customer Support']")
	private WebElement eleCustomerSupportText;
	public WebElement getEleCustomerSupportText()
	{
	   return eleCustomerSupportText;
	}
    //To verify Customer Care Contact details in registration page
	@FindBy(xpath="(//div[@class='footerMail'])[2]")
	private WebElement eleCustomerCareContactDetails;
	public WebElement getEleCustomerCareContactDetails()
	{
		return eleCustomerCareContactDetails;
	}	   
	//To verify  Customer Care Email Id  registration page
	@FindBy(xpath="((//div[@class='footerMail'])[2])//a")
	private WebElement eleCustomerCareEmailId;
	public WebElement getEleCustomerCareEmailId()
	{
		 return eleCustomerCareEmailId;
	}	
	// To verify English edge website link in registration page  
	@FindBy(xpath="((//div[@class='footerMail'])[3])")
	private WebElement eleEnglishEdgeWebsitelink;
	public WebElement getEleEnglishEdgeWebsitelink()
	{
		return eleEnglishEdgeWebsitelink;
	}
	// To verify CopyRights text in registration page  
	@FindBy(id="footer-terms")
	private WebElement eleCopyRightsText;
	public WebElement getEleCopyRightsText()
	{
	    return eleCopyRightsText;
	}	
	// To verify English edge website link at the Footer of registration page  
	@FindBy(xpath="//div[@id='footer-terms']//a")
	private WebElement eleEnglishEdgeWebsitelinkFooter;
	public WebElement getEleEnglishEdgeWebsitelinkFooter()
	{
		return eleEnglishEdgeWebsitelinkFooter;
	}	
	// To verify 'This value is required.' Error message in registration page  
	@FindBy(xpath="//li[text()='This value is required.']")
	private WebElement eleValueReqErrMsg;
	public WebElement getEleValueReqErrMsg()
	{
		return eleValueReqErrMsg;
	}
	// To identify 'Value should be alpha/alphanumeric' error message for invalid data
	@FindBy(xpath="//li[text()='Value should be alpha/alphanumeric']")
	private WebElement eleAlphaOrAlphanumericErrMsg;
	public WebElement getAlphaOrAlphanumericErrMsg(){
		return eleAlphaOrAlphanumericErrMsg;
	}	
	// To identify 'This value should be a valid email.' error message for invalid email
	@FindBy(xpath="//li[text()='This value should be a valid email.']")
	private WebElement eleInValidEmailErrMsg;
	public WebElement getEleInValidEmailErrMsg(){
		return eleInValidEmailErrMsg;
	}
	// To identify 'This value should be a valid phone number.' error message for invalid phone number
	@FindBy(xpath="//li[text()='This value should be a valid phone number.']")
	private WebElement eleInValidPhoneNumErrMsg;
	public WebElement getEleInValidPhoneNumErrMsg(){
		return eleInValidPhoneNumErrMsg;
	}
	// To identify 'This value should be digits.' Error message
	@FindBy(xpath="//li[text()='This value should be digits.']")
	private WebElement eleInValidPincodeErrMsg;
	public WebElement getEleInValidPincodeErrMsg(){
		return eleInValidPincodeErrMsg;
	}	
}	

