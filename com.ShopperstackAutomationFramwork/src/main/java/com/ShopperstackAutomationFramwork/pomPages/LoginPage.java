package com.ShopperstackAutomationFramwork.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailTextField;

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordTextField;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginButton;
	
	
	public void loginIntoShopperstack(String username, String password)
	{
		emailTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	
	
	public void invalidLoginIntoShopperstack(String username, String password)
	{
		emailTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		emailTextField.clear();
	}

}
