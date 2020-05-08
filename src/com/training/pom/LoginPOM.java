package com.training.pom;

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







