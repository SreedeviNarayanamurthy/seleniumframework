package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
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
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//driver.quit();
	}
	@Test(priority=0,enabled=false)
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.salesParent();
		loginPOM.clickOrder();
		loginPOM.sendorderidno("347");
		loginPOM.clickButtonFilter();
		loginPOM.sendorderidbycustomer("RashmiS1 Singh");
		loginPOM.clickButtonFilterforcustomer();
		loginPOM.ordercheckbox1();
		loginPOM.orderdeletebutton();
		screenShot.captureScreenShot("Test 1 and 2");
		
	}
	
	@Test(priority=1,enabled=false)
	public void validLoginTest1() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.salesParent();
		loginPOM.clickReturns();
		loginPOM.sendreturnidno("247");
		loginPOM.clickreturnButtonFilter();
		loginPOM.returnorderidbycustomer("reva sharma");
		loginPOM.clickretunButtonFilterforcustomer();
		screenShot.captureScreenShot("Testcase3");
	}
	
	@Test(priority=3,enabled=true)
	public void validLoginTest3(){
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.clickMainMenu();
		loginPOM.clickCatalog();
		loginPOM.clickFirstRow();
		loginPOM.clickDataTab();
		loginPOM.sendquantity("60");
		loginPOM.clickDataDiscount();
		loginPOM.clickAddDiscount();
		loginPOM.discountQuantity1("5");
		loginPOM.discountPrice1("100");
		loginPOM.discountStartDate("20-05-2020");
		loginPOM.discountEndDate("21-05-2020");
		loginPOM.discountSave();
		
	}
	@Test(priority=2,enabled=true)
	public void validLoginTest4()
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.clickMainMenu2();
		loginPOM.clickCatalog2();
		loginPOM.addnew();
		loginPOM.sendproductname("Finger Ring");
		loginPOM.sendproducttitle("Finger Ring for ladies");
		loginPOM.clickData();
		loginPOM.sendmodel("SKU-012");
		loginPOM.sendprice("600");
		loginPOM.sendquantity("60");
		loginPOM.clickLink();
		loginPOM.selectcategory("EARRINGS");
		loginPOM.clickLDiscount();
		loginPOM.clickLAddDiscount();
		loginPOM.discountQuantity("1");
		loginPOM.discountPrice("50");
		loginPOM.clickDateStart();
		loginPOM.sendStartDate("2020-05-20");
		loginPOM.sendEndDate("2020-05-21");
		loginPOM.clickRewardTab();
		loginPOM.clickRewardPoint("20");
		loginPOM.clickSave();
		
		
	}
	
	@Test(priority=1,enabled=true)
	public void validLoginTest5()
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.clickMainMenu3();
		loginPOM.clickMarketing();
		loginPOM.addnewcoupon();
		loginPOM.inputName("Republic Day");
		loginPOM.inputCode("RepD");
		loginPOM.inputDiscount("10");
		loginPOM.inputProduct("A Finger Ring");
		loginPOM.inputDateStart("2020-05-20");
		loginPOM.inputDateEnd("2020-05-21");
		loginPOM.clickSaveCoupon();
	}
}	
