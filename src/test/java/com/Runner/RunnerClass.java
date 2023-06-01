package com.Runner;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pom.Login_Page;

public class RunnerClass extends BaseClass {
		public static Login_Page lp;	
		
		@BeforeSuite	
	      public static void launchBrowser() throws Exception {	
	          browserLaunch("chrome");	
	          maximize();	
	          implicitWait(10);	
	          getUrl("https://www.goibibo.com");
         }	
		
	   @BeforeTest	
	      public static void login() throws InterruptedException {	
	         lp = new Login_Page(driver);	
	         inputFeed(lp.getPhoneno(), "9976107611");	
	         actionClick(lp.getContinuebutton());	
	         Scanner s = new Scanner(System.in);	
	         String otp = s.next();	
	         String otp1 = s.next();	
	         String otp2 = s.next();	
	         String otp3 = s.next();	
	         
	         inputFeed(lp.getOtpdigit1(), otp);	
	         Thread.sleep(2000);
	         
	         inputFeed(lp.getOtpdigit2(), otp1);	
	         Thread.sleep(2000);
	         
	         inputFeed(lp.getOtpdigit3(), otp2);	
	       	Thread.sleep(2000);	
	       	inputFeed(lp.getOtpdigit4(), otp3);	
	       	//	inputFeed(gl.getEmail(), "yuvicooool@gmail.com");

	       //	javaScriptClick(gl.getSubmit());	
				


	@BeforeClass	
		public static void userValidation() throws InterruptedException	{
		lp = new Login_Page(driver);	
		Thread.sleep(5000);	
		mouseHover(lp.getProfilebutton());	
		Thread.sleep(2000);	
		mouseHover(lp.getViewprofile());	
		actionClick(lp.getViewprofile());	
		Thread.sleep(2000);	
		String expectedname = "Yuvaraj K";	
		String expectedno = "9976107611";	
		String expectedemail = "yuvicooool@gmail.com";

		String actualname = lp.getUsername().getText();	
		String actualno = lp.getUsermobile().getText();	
		String actualemail = lp.getUseremail().getText();	
		Assert.assertEquals(actualname, expectedname);	
		Assert.assertEquals(actualno, expectedno);	
		Assert.assertEquals(actualemail, expectedemail);	
	}
	
	@Parameters("lastname")
	   @Test
		public static void aDetails(String lastname) throws InterruptedException {
		lp = new Login_Page(driver);
		javaScriptClick(lp.getLastname());
		javaScriptSendKeys("Last Name", lastname);
		Thread.sleep(2000);
		javaScriptClick(lp.getMale());
		Thread.sleep(2000);
		javaScriptClick(lp.getDob());
		Thread.sleep(2000);
		dropDown(lp.getYear(), "value", "1992");
		Thread.sleep(2000);
		dropDown(lp.getMonth(), "index", "4");
		Thread.sleep(2000);
		javaScriptClick(lp.getDate());
		isDisplay(lp.getFemale());
		isDisplay(lp.getCancel());
		Thread.sleep(2000);
		javaScriptScrollElement(lp.getSave());
		javaScriptClick(lp.getSave());
		Thread.sleep(5000);
		}

		@DataProvider(name = "address", indices = 0)
		public Object[][] data() {
		Object[][] data = new Object[2][2];
		data[0][0] = "no:4 5th street narasimman nagar, kodungaiyur, chennai"; 
		data[0][1] = "600118";
		return data;
		}
		
		@Test(dataProvider = "address")
		public static void billingDetails(String address, String pincode) throws InterruptedException {
		lp= new Login_Page(driver);
		javaScriptClick(lp.getBillingaddress());
		Thread.sleep(2000);
		javaScriptSendKeys("Billing Address", address); 111
		javaScriptClick(gl.getPin());
		Thread.sleep(2000);
		javaScriptSendKeys("Pincode", pincode); 115
		javaScriptClick(gl.getState());
		Thread.sleep(2000);
		javaScriptClick(gl.getTamilnadu()); 119
		javaScriptClick(gl.getSavebutton());
		Thread.sleep(2000);
		isDisplay(gl.getCancelbutton()); 123
		}
	
	 

		@AfterSuite
	public static void signOut() throws InterruptedException {
		lp = new Login_Page(driver);
		javaScriptClick(lp.getSignout());
		javaScriptClick(lp.getLogoutbutton());
		Thread.sleep(2000);
		close();
		}
	
	 }




