package com.ShopperstackAutomationFramwork.testScripts;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ShopperstackAutomationFramwork.genericlib.BaseTest;
import com.ShopperstackAutomationFramwork.genericlib.FLib;
import com.ShopperstackAutomationFramwork.pomPages.HomePage;
import com.ShopperstackAutomationFramwork.pomPages.LoginPage;
import com.ShopperstackAutomationFramwork.pomPages.WelcomePage;

public class AddToCartTest extends BaseTest {

	@Test
	public void addToCartIntoShopperstack() throws EncryptedDocumentException, IOException {
		WelcomePage wp = new WelcomePage(driver);
		//Assert.fail();
		wp.getLoginButton().click();

		FLib fb = new FLib();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoShopperstack(fb.readDataFromExcel(EXCEL_PATH, "Login", 1, 0),
				fb.readDataFromExcel(EXCEL_PATH, "Login", 1, 1));

	
		HomePage hp = new HomePage(driver);
		hp.addProductIntoCart();
		hp.goTocart();

	}

}
