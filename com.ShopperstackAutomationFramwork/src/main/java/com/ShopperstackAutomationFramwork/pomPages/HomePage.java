package com.ShopperstackAutomationFramwork.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "(//button[@id='addToCart'])[1]")
	private WebElement addToCartButton;
	
	@FindBy(id="cartIcon")
	private WebElement cartIcon;
	
	public void addProductIntoCart()
	{
		addToCartButton.click();
	}
	
	public void goTocart()
	{
		cartIcon.click();
	}
	

}
