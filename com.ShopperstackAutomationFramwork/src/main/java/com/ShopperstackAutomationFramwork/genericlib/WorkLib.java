package com.ShopperstackAutomationFramwork.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WorkLib {
	
	public void selectByIndex(int indexno, WebElement element)
	{
		Select s = new Select(element);
		s.selectByIndex(indexno);
	}
	
	public void selectByValue(String value , WebElement element)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void selectByVisibleText(String visibleText,WebElement element)
	{
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}
	
	public void moveMouseCursorOnElement(WebElement element, WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	
	
}
