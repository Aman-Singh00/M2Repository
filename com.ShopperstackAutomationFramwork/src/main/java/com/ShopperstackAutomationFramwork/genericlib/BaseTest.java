package com.ShopperstackAutomationFramwork.genericlib;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;



/**
 * @author AMAN SINGH
 */

public class BaseTest extends FLib implements IautoConstant {

	public WebDriver driver;

	
	//@Parameters("browser")
	@BeforeClass()
	public void setUp() throws IOException {
		String browser = getDataFromPropertiesFile(PROP_PATH, "Browser");
		System.out.println(browser);
		String url = getDataFromPropertiesFile(PROP_PATH, "url");

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("Invalid Browser");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	
	public void toCaptureScreenshot(String methodName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREENSHOT_PATH+methodName+SCREENSHOT_EXTN);
		Files.copy(src, dest);
	}
	

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
