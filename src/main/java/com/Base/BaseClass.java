package com.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected static WebDriver driver;
	Actions a;
	JavascriptExecutor js;
	public void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public void clickElement(WebElement  element) {
		element.click();
	}
	
	public void inputValue(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void screenshot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType .FILE);
		File dest = new File("C:\\Users\\WELCOME\\eclipse-workspace\\Screenshot\\"+fileName+".png");
		FileHandler.copy(src, dest);
		
		
	//	System.out.println("File name is : "+fileName);
		
	}
	
	public void dropDown(WebElement element,String option, String value) {
		Select s = new Select(element);
		if(option.equals("value")) {
		s.selectByValue(value);
		}
		else if(option.equals("text")) {
			s.selectByVisibleText(value);
		}
		else if (option.equals("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
		
	}
	
	public void mouseHover(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	
	public void rightClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).build().perform();
	}
	
	public void dragDrop(WebElement src, WebElement dest) {
		a = new Actions(driver);
		a.dragAndDrop(src, dest);
	}
	
	public void scrollByValue(int xValue, int yValue) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+xValue+","+yValue+")");
	}
	
	public void clickUsingJSE(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	
	public void scrollIntoElement(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
	
	public void inputUsingJSE(String id, String value) {
		js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('"+id+"').value('"+value+"');");
	}
	
	public void switchToFrame(String option,String value) {
		if(option.equals("index")) {
			int index = Integer.parseInt(value);
			driver.switchTo().frame(index);
		}else if ((option.equals("id"))||(option.equals("name"))){
			driver.switchTo().frame(value);
		}
		
	}
	
	public void switchFrameUsingElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void switchWindow(int index) {
		Set<String> all_tab_id = driver.getWindowHandles();
		List<String> tab_id_list = new LinkedList<>(all_tab_id);
		
		driver.switchTo().window(tab_id_list.get(index));
		
	}
	
	public void keyDown(int noOfTimes) throws AWTException {
		Robot r = new Robot();
		
		for(int i=0;i<noOfTimes;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
		
	}
	
}


