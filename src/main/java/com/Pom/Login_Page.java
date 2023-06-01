package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class Login_Page extends BaseClass {
	public static WebDriver driver; 
	
	@FindBy(name = "phone")
	private WebElement phoneno; 
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement continuebutton;
	
	@FindBy(xpath = "//input[@aria-label='Please enter verification code. Digit 1']")
	private WebElement otpdigit1;
	
	@FindBy(xpath = "//input[@aria-label='Digit 2']")
		private WebElement otpdigit2; 
		
	@FindBy(xpath = "//input[@aria-label='Digit 3']")
		private WebElement otpdigit3;
		
	@FindBy(xpath = "//input[@aria-label='Digit 4']")
		private WebElement otpdigit4;
		
	@FindBy(xpath = "//input[@placeholder='Enter your full name']")
		private WebElement name;
		
    @FindBy(xpath = "//input[@placeholder='Enter your email address']")
		private WebElement email;
		
	@FindBy(xpath = "//button[contains(text(), 'Lets Go')]")
		private WebElement submit;
	
	@FindBy(xpath = "(//div[@role = 'presentation'])[2]")
	     private WebElement presentation;
	
	@FindBy(xpath = "//p[@class = 'sc-1u0cego-11 betzbV']")
      	private WebElement username;
	
	@FindBy(xpath = "(//p[@class = 'sc-1u0cego-8 hbGjrz'])[1]")
	    private WebElement usermobile;
	
	@FindBy(xpath = "(//p[@class = 'sc-1u0cego-8 hbGjrz'])[2]")
	    private WebElement useremail;
	
	@FindBy(xpath = "//p[contains (text() ,'naveenkumar ')]")
	     private WebElement viewprofile;
	
	@FindBy(xpath = "//label [@for ='Last Name']")
	     private WebElement lastname;
	
	@FindBy(xpath = "//label [@for ='Date of Birth']")
		private WebElement dob;
	
	@FindBy(xpath = "//select[@name ='year']")
	 	private WebElement year;
	
	@FindBy(xpath = "//select[@name = 'month']")
		private WebElement month;
	
	@FindBy(xpath = "//div[text()='14']")
		private WebElement date; 
	
	@FindBy(xpath = "//label[@for='male']")
		private WebElement male;
	
	@FindBy(xpath = "//label[@for='female']")
		private WebElement female;
	
	@FindBy(xpath = "(//button[text()='Save'])[1]")
		private WebElement save;
	
	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
		private WebElement cancel;
	
	@FindBy(xpath = "//label[text()='Enter Billing Address']")
		private WebElement billingaddress;
	
	@FindBy(xpath = "//label[text()='Enter Pincode']")
		private WebElement pin;

	@FindBy(xpath = "(//button[text()='Save'])[2]")
		private WebElement savebutton;
	
	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
		private WebElement cancelbutton;
	
	@FindBy(xpath = "//label[text()='State']")
		private WebElement state;
	
	@FindBy (xpath = "//li[contains(text(),'Tamil Nadu')]")
		private WebElement tamilnadu;
	
	@FindBy(xpath = "(//div[@role = 'presentation'])[2]")
		private WebElement profilebutton;
	
	@FindBy(xpath = "(//a[@class='login__dropdown__link'])[1]")
		private WebElement profname;
	
	@FindBy(xpath = "//span[text()='LOGOUT']")
		private WebElement signout;
	
	@FindBy (xpath = "//button[contains(text(),'Yes, Log out')]")
		private WebElement logoutbutton;

	
	public WebElement getLogoutbutton() {
		return logoutbutton;
		}
	
	public WebElement getPhoneno() {
		return phoneno;
		}
	 
	public WebElement getContinuebutton() {
		return continuebutton;
		}

	public WebElement getOtpdigit1() {
		return otpdigit1;
		}
	
	public WebElement getOtpdigit2() {
		return otpdigit2;
		}
	
	public WebElement getOtpdigit3() {
		return otpdigit3;
		}
	
	public WebElement getOtpdigit4() {
		return otpdigit4;
		}
	
	public WebElement getName() {
		return name;
		}
	
	public WebElement getEmail() {
		return email;
		}
	
	public WebElement getSubmit() {
		return submit;
		}

	public WebElement getTamilnadu() {
		return tamilnadu;
		}
	
	public WebElement getLastname() {
		return lastname;
		}
	
	public WebElement getDob() {
		return dob;
		}
	
	public WebElement getYear() {
		return year;
		}
	
	public WebElement getMonth() {
		return month;
		}

	public WebElement getDate() {
		return date;
		}

	public WebElement getMale() {
		return male;
		}
	
	public WebElement getFemale() {
		return female;
		}
	
	public WebElement getSave() {
		return save;
		}
	
	public WebElement getCancel() {
		return cancel;
		}

	public WebElement getBillingaddress() {
    	return billingaddress;
		}
	
	public WebElement getPin() {
		return pin;
		}
	
	public WebElement getSavebutton() {
		return savebutton;
		}
	
	public WebElement getCancelbutton() {
		return cancelbutton;
		}
	
	public WebElement getPresentation() {
		return presentation;
		}
	
	public WebElement getUsername() {
		return username;
		}
	
		public WebElement getUsermobile() {
		return usermobile;
		}
	
		public WebElement getUseremail() {
		return useremail;
		}
	
		public WebElement getViewprofile() {
		return viewprofile;
		}
	
		public WebElement getSignout() {
		return signout;
		}
	
		public WebElement getState() {
	 

		return state;
		}
	
		public WebElement getProfilebutton() {
		return profilebutton;
		}
	
	    public WebElement getProfname() {
		return profname;
		}
	
		public Login_Page(WebDriver dri) {
		driver = dri;
		PageFactory.initElements(driver, this);
	    }   
	}


