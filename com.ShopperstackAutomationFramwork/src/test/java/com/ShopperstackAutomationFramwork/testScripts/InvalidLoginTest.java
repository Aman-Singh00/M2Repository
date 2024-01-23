package com.ShopperstackAutomationFramwork.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperstackAutomationFramwork.genericlib.BaseTest;
import com.ShopperstackAutomationFramwork.genericlib.FLib;
import com.ShopperstackAutomationFramwork.pomPages.LoginPage;
import com.ShopperstackAutomationFramwork.pomPages.WelcomePage;

public class InvalidLoginTest extends BaseTest {

	@Test
	public void InvalidLoginInShopperstack() throws EncryptedDocumentException, IOException, InterruptedException {
		
		WelcomePage page = new WelcomePage(driver);
		page.clickOnLoginButton();

		LoginPage lp = new LoginPage(driver);

		int row_count = rowCount(EXCEL_PATH, "InvalidData");

		FLib fb = new FLib();

		for (int i = 1; i <= row_count; i++) {
			lp.invalidLoginIntoShopperstack(fb.readDataFromExcel(EXCEL_PATH, "InvalidData", i, 0),
					fb.readDataFromExcel(EXCEL_PATH, "InvalidData", i, 1));
			Thread.sleep(2000);
		}

	}

}
