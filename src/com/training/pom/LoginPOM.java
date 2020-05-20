package com.training.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
		// Common Elements
	@FindBy(name="username")
	private WebElement username; 
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	//Test case1 Elements
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement salesparent;
	public void salesParent()
	{
		Actions act = new Actions(driver);
				act.moveToElement(salesparent).build().perform();
		
	}
	
	@FindBy(xpath = "//*[@id=\"menu-sale\"]/ul/li[1]/a")
	private WebElement orderLnk;
	
   @FindBy(id ="input-order-id")	
      private WebElement orderid;
	
   @FindBy(id ="button-filter")	
   private WebElement buttonfilter;
   
   @FindBy(id ="input-customer")	
   private WebElement customer;
	
@FindBy(id ="button-filter")	
private WebElement buttonfiltercus;


//Test case 2 Elements

@FindBy(xpath="//input[@type='checkbox' and @value=347]")

private WebElement ordercheckbox;
public void ordercheckbox1()
{

	if (ordercheckbox.isDisplayed())
	
		System.out.println("Check bos is selectd :"+ ordercheckbox);
	
	ordercheckbox.click();	
}

@FindBy(id ="button-delete")	
private WebElement orderdeletebutton;
//private WebElement WebDriverWait;


//Test case 3 Elements

@FindBy(xpath = "//*[@id=\"menu-sale\"]/ul/li[3]/a")
private WebElement returnLnk;

@FindBy(id ="input-return-id")	
private WebElement returnid;

@FindBy(id ="button-filter")	
private WebElement returnbuttonfilter;

@FindBy(id ="input-customer")	
private WebElement return_customer;
	
@FindBy(id ="button-filter")	
private WebElement returnbuttonfiltercus;

// Medium - Test case1

@FindBy(css="i.fa.fa-tags.fw")
private WebElement mainMenu;

@FindBy(xpath="//li[@id='menu-catalog']/ul/li[2]/a")
private WebElement catalog;

@FindBy(xpath="//table[@class='table table-bordered table-hover']/tbody/tr")
private WebElement getRows;

@FindBy(xpath="//table[@class='table table-bordered table-hover']/thead/tr/td[3]")
private WebElement getHeadings;

@FindBy(xpath="//table[@class='table table-bordered table-hover']/tbody/tr/td[8]/a")
private WebElement firstrow;

@FindBy(xpath="//li//a[@href='#tab-data']")
private WebElement tabData;

@FindBy(xpath="//input[@id='input-quantity']")
private WebElement quantity1;

@FindBy(xpath="//li//a[@href='#tab-discount']")
private WebElement tabdiscount;

@FindBy(xpath="//button[@type='button' and @data-original-title='Add Discount']")
private WebElement addDiscountbutton;

@FindBy(xpath="//input[@name='product_discount[0][quantity]']")
private WebElement discountQuantity1;

@FindBy(xpath="//input[@name='product_discount[0][price]']")
private WebElement discountprice1;

@FindBy(xpath="//input[@name='product_discount[0][date_start]']")
private WebElement discountStartDate;

@FindBy(xpath="//input[@name='product_discount[0][date_end]']")
private WebElement discountEndDate;

@FindBy(xpath="//i[@class='fa fa-save']")
private WebElement discountSave;


//Medium - Test case2

@FindBy(css="i.fa.fa-tags.fw")
private WebElement mainMenu2;

@FindBy(xpath="//li[@id='menu-catalog']/ul/li[2]/a")
private WebElement catalog2;

@FindBy(css="a.btn.btn-primary")
private WebElement addnew;

@FindBy(xpath="//input[@id='input-name1']")
private WebElement productname;

@FindBy(xpath="//input[@id='input-meta-title1']")
private WebElement megaTitle;

@FindBy(xpath="//a[contains(text(),'Data')]")
private WebElement clickdata;

@FindBy(xpath="//input[@id='input-model']")
private WebElement model;

@FindBy(xpath="//input[@id='input-price']")
private WebElement price;

@FindBy(xpath="//input[@id='input-quantity']")
private WebElement quantity;

@FindBy(xpath="//a[contains(text(),'Links')]")
private WebElement clicklinks;

@FindBy(xpath="//input[@id='input-category']")
private WebElement clickinputcategory;

@FindBy(xpath="//a[contains(text(),'Discount')]")
private WebElement clickdiscount;

@FindBy(xpath="//table[@id='discount']/tfoot/tr/td/button")
private WebElement clickaddDiscount;

@FindBy(xpath="//td[@class='text-right']/following::input[1]")
private WebElement discountQuantity;

@FindBy(xpath="//td[@class='text-right']/following::input[3]")
private WebElement discountPrice;

@FindBy(xpath="//td[@class='text-left']/div/span/button")
private WebElement startdate;

@FindBy(xpath="//*[@id='discount-row0']//td[5]//input[@placeholder='Date Start']")
private WebElement sendstartdate;

@FindBy(xpath="//*[@id='discount-row0']//td[6]//input[@placeholder='Date End']")
private WebElement sendenddate;

@FindBy(xpath="//a[@href='#tab-reward']")
private WebElement rewardtab;

@FindBy(id ="input-points")	
private WebElement points;

@FindBy(xpath="//button[@type='submit']/i")
private WebElement save;

//Test case 3

@FindBy(css="i.fa.fa-share-alt")
private WebElement mainMenu3;

@FindBy(xpath="//li[@id='menu-marketing']/ul/li[3]/a")
private WebElement marketing;

@FindBy(css="a.btn.btn-primary")
private WebElement addnewcoupon;

@FindBy(xpath="//input[@id='input-name']")
private WebElement inputname;

@FindBy(xpath="//input[@id='input-code']")
private WebElement inputcode;

@FindBy(xpath="//input[@id='input-discount']")
private WebElement inputdiscount;

@FindBy(xpath="//input[@id='input-product']")
private WebElement inputproduct;

@FindBy(xpath="//div[@class='input-group date']//input[@placeholder='Date Start']")
private WebElement datestart;

@FindBy(xpath="//div[@class='input-group date']//input[@placeholder='Date End']")
private WebElement dateend;

@FindBy(xpath="//button[@class='btn btn-primary']")
private WebElement saveCoupon;


////////////////Methods

public void orderdeletebutton() throws InterruptedException
{
	this.orderdeletebutton.click();
	
	WebDriverWait wait = new WebDriverWait(driver, 20 /*timeout in seconds*/);
	wait.until(ExpectedConditions.alertIsPresent());
	Thread.sleep(3000);
	Alert alertDialog = driver.switchTo().alert();
	// Get the alert text
	String alertText = alertDialog.getText();
	System.out.println("The text displayed in the alert dialog is:"+alertText);
	// Click the OK button on the alert.
	alertDialog.accept();
	
	
}


public void sendUserName(String userName) {
		this.username.clear();
		this.username.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
		
	public void clickOrder() {
		this.orderLnk.click();
		}
	
	public void sendorderidno(String orderid) {
		this.orderid.clear();
		this.orderid.sendKeys(orderid);
		
}

	public void clickButtonFilter()
	{
	this.buttonfilter.click();	
	}
	
	public void sendorderidbycustomer(String customer) {
		this.customer.clear();
		this.customer.sendKeys(customer);
		
}

	public void clickButtonFilterforcustomer()
	{
	this.buttonfiltercus.click();
	}
		
	public void clickReturns() {
		this.returnLnk.click();
		}
		
	public void sendreturnidno(String returnid) {
		this.returnid.clear();
		this.returnid.sendKeys(returnid);
		
}

	public void clickreturnButtonFilter()
	{
	this.returnbuttonfilter.click();	
	}
	
	public void returnorderidbycustomer(String customer) {
		this.customer.clear();
		this.customer.sendKeys(customer);
		
}

	public void clickretunButtonFilterforcustomer()
	{
	this.returnbuttonfiltercus.click();
	}
	
	//Test case1 - Medium
	
	public void clickMainMenu() {
		this.mainMenu.click();
		Actions action = new Actions(driver);
		action.moveToElement(mainMenu);
				}
	
	public void clickCatalog() {
		
			this.catalog.click();
				}
	
	public void clickFirstRow() {
		
		this.firstrow.click();
	}
	public void clickDataTab() {
		
		this.tabData.click();
			}     	    	 
    	   
	public void sendquantity(String quantity) {
		this.quantity.clear();
		this.quantity.sendKeys(quantity);
	}
		public void clickDataDiscount()
		
		{
		this.tabdiscount.click();	
		}

		public void clickAddDiscount()
		{
			this.addDiscountbutton.click();
		}
		
		public void discountQuantity1(String Quantity1) {
			this.discountQuantity1.clear();
			this.discountQuantity1.sendKeys(Quantity1);
		
}
		
		public void discountPrice1(String discountPrice1)
		
		{
			
			this.discountprice1.clear();
			this.discountprice1.sendKeys(discountPrice1);
		}
		
		
		public void discountStartDate(String discountStartDate) 
	    {
		this.discountStartDate.sendKeys(discountStartDate);
		
			}
		
		public void discountEndDate(String discountEndDate) 
	    {
		this.discountEndDate.sendKeys(discountEndDate);
		
			}
		public void discountSave()
		{
			this.discountSave.click();
		}
		
	//Test case2 Methods
   
 
	public void clickMainMenu2() {
		this.mainMenu2.click();
		Actions action = new Actions(driver);
		action.moveToElement(mainMenu2);
				}
	
	public void clickCatalog2() {
		this.catalog2.click();
				}
	public void addnew() {
		this.addnew.click();
				}
	public void sendproductname(String productname) {
		this.productname.sendKeys(productname);
				}
	public void sendproducttitle(String producttitle) 
	{
				this.megaTitle.sendKeys(producttitle);
				}
	public void clickData() {
		this.clickdata.click();
		}
	
	public void sendmodel(String model) 
	            {
				this.model.sendKeys(model);
}
	public void sendprice(String price) 
    {
	this.price.sendKeys(price);
	}
	
	public void sendquantity1(String quantity1) 
    {
	this.quantity.sendKeys(quantity1);
	}
	
	public void clickLink() {
		this.clicklinks.click();
		}
	
	public void selectcategory(String category) 
    {
	this.clickinputcategory.sendKeys(category);
	}
	
	public void clickLDiscount() {
		this.clickdiscount.click();
		}
	
	public void clickLAddDiscount() {
		this.clickaddDiscount.click();
		}
	
	public void discountQuantity(String quantity) 
    {
	this.discountQuantity.sendKeys(quantity);
	
	}
	public void discountPrice(String price) 
    {
	this.discountPrice.sendKeys(price);
	
	}
	
	public void clickDateStart() {
		this.startdate.click();
		}
	public void sendStartDate(String startDate) 
    {
	this.sendstartdate.sendKeys(startDate);
	
	}
	
	public void sendEndDate(String endDate) 
    {
	this.sendenddate.sendKeys(endDate);
	
	}
	
	
	public void clickRewardTab() {
		this.rewardtab.click();
		}
	
	public void clickRewardPoint(String point) {
		this.points.sendKeys(point);
		}
	
	public void clickSave() {
		this.save.click();
		}
	
	// Test case 3
	
	public void clickMainMenu3() {
		this.mainMenu3.click();
		Actions action = new Actions(driver);
		action.moveToElement(mainMenu3);
				}
	
	public void clickMarketing() {
		this.marketing.click();
				}

	public void addnewcoupon() {
		this.addnewcoupon.click();
				}
	
	public void inputName(String couponName) 
    {
	this.inputname.sendKeys(couponName);
	
	}
	public void inputCode(String couponCode) 
    {
	this.inputcode.sendKeys(couponCode);
	
		}
	
	public void inputDiscount(String couponDiscount) 
    {
	this.inputdiscount.sendKeys(couponDiscount);
	
		}
	
	public void inputProduct(String couponProduct) 
    {
	this.inputproduct.sendKeys(couponProduct);
	
		}
	
	public void inputDateStart(String couponDateStart) 
    {
	this.datestart.sendKeys(couponDateStart);
	
		}
	
	public void inputDateEnd(String couponDateEnd) 
    {
	this.dateend.sendKeys(couponDateEnd);
	
		}
	
	public void clickSaveCoupon() {
		this.saveCoupon.click();
		}
}

/*package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}*/







