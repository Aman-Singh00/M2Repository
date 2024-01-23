package com.ShopperstackAutomationFramwork.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ShopperstackAutomationFramwork.genericlib.BaseTest;
import com.ShopperstackAutomationFramwork.genericlib.CustomeListener;
import com.ShopperstackAutomationFramwork.pomPages.LoginPage;
import com.ShopperstackAutomationFramwork.pomPages.WelcomePage;

@Listeners(CustomeListener.class)
public class ValidLogin extends BaseTest {

	//@Parameters({"username","password"})
	@Test
	public void validLogin() throws EncryptedDocumentException, IOException {
		try {

			WelcomePage page = new WelcomePage(driver);
			page.clickOnLoginButton();

			String username = readDataFromExcel(EXCEL_PATH, "Login", 1, 0);
			String password = readDataFromExcel(EXCEL_PATH, "Login", 1, 1);

			LoginPage lp = new LoginPage(driver);
			lp.loginIntoShopperstack(username, password);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
