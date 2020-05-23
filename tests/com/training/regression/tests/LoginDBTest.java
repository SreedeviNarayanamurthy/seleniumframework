package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginThirdWeekPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginDBTest {
	private WebDriver driver;
	private String baseUrl;
	//private LoginPOM loginPOM;
	private LoginThirdWeekPOM loginThirdWeekPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//loginPOM = new LoginPOM(driver);
		
		loginThirdWeekPOM = new LoginThirdWeekPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}


	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String productname, String quantity) throws InterruptedException {
		// for demonstration 
//		genericMethods.getElement("login", "id"); 
				
		/*loginPOM.sendUserName(userName);
		
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();*/
		
		loginThirdWeekPOM.sendUserName("admin");
		loginThirdWeekPOM.sendPassword("admin@123");
		loginThirdWeekPOM.clickLoginBtn();
	     //screenShot.captureScreenShot(userName);	
		loginThirdWeekPOM.salesParent();
		loginThirdWeekPOM.clickOrder();
		loginThirdWeekPOM.editOrder();
		Thread.sleep(3000);
		loginThirdWeekPOM.customer();
		loginThirdWeekPOM.delProduct();
		
		Thread.sleep(4000);
		loginThirdWeekPOM.inProduct(productname);	
		loginThirdWeekPOM.inQuantity(quantity);
		Thread.sleep(3000);
		loginThirdWeekPOM.addProduct();
		
		//screenShot.captureScreenShot(userName);

	}

}