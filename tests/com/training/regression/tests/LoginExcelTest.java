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
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginThirdWeekPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginExcelTest {
	private WebDriver driver;
	private String baseUrl;
    //private LoginPOM loginPOM;
	 private LoginThirdWeekPOM loginThirdWeekPOM;
	 
	private static Properties properties;
	private ScreenShot screenShot;

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
		// open the browser
		driver.get(baseUrl);
	}

	/*@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}*/
	@Test(priority=0,enabled= false)
	public void loginTest() throws InterruptedException
	{
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
		loginThirdWeekPOM.buttonCart();
	  
		
	}
	@Test(priority=2,enabled=false,dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void choseProduct(String chooseProd,String chooseQuantity) throws InterruptedException
	{
		
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
		loginThirdWeekPOM.inProduct(chooseProd);	
		loginThirdWeekPOM.inQuantity(chooseQuantity);
		Thread.sleep(3000);
		loginThirdWeekPOM.addProduct();
		loginThirdWeekPOM.buttonCart();
		loginThirdWeekPOM.paymentContinue();
		Thread.sleep(3000);
		loginThirdWeekPOM.paymentSave();
		

	}
	
	@Test(priority=2,enabled=true,dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void choseProduct(String categoryName,String categoryDesc,String MetaTitle,String MetaDesc) throws InterruptedException
	{
		
		loginThirdWeekPOM.sendUserName("admin");
		loginThirdWeekPOM.sendPassword("admin@123");
		loginThirdWeekPOM.clickLoginBtn();
	     //screenShot.captureScreenShot(userName);	
		loginThirdWeekPOM.catalogParent();
		loginThirdWeekPOM.clickCatalog();
		Thread.sleep(3000);
		loginThirdWeekPOM.addCategory();
		loginThirdWeekPOM.addCategoryName(categoryName);
		Thread.sleep(3000);
		loginThirdWeekPOM.addCategoryDesc(categoryDesc);
		Thread.sleep(3000);
		loginThirdWeekPOM.metTitle(MetaTitle);
		Thread.sleep(3000);
		loginThirdWeekPOM.metDesc(MetaDesc);
		Thread.sleep(3000);
		
		loginThirdWeekPOM.clickSave();	
		//loginThirdWeekPOM.inQuantity(chooseQuantity);
		//Thread.sleep(3000);
		//loginThirdWeekPOM.addProduct();
		//loginThirdWeekPOM.buttonCart();
		//loginThirdWeekPOM.paymentContinue();
		//Thread.sleep(3000);
		//loginThirdWeekPOM.paymentSave();
		

	}
	
}