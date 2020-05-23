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

public class LoginThirdWeekPOM {
	private WebDriver driver; 
	
	public LoginThirdWeekPOM(WebDriver driver) {
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
		
		@FindBy(xpath = "//*[@id='menu-sale']/ul/li[1]/a")
		private WebElement orderLnk;
		
		@FindBy(xpath="//tbody/tr[1]/td[8]/a[2]")
		private WebElement editLnk;
		
		@FindBy(xpath="//button[@id='button-customer']/i")
		private WebElement customer;
		
		@FindBy(xpath="//button[@class='btn btn-danger']/i")
			private WebElement deleteProduct;
		
		//@FindBy(xpath="//input[@id='input-product']")
		//private WebElement inputProduct;
		
		@FindBy(id="input-product")
		private WebElement inputProduct;
		
		@FindBy(id="input-quantity")
		private WebElement inputQuantity;
		
		//@FindBy(xpath="//input[@id='input-quantity']")
		//private WebElement inputQuantity;
		
		//@FindBy(xpath="//button[@id='button-product-add']")
		//private WebElement addProduct;
		
		@FindBy(id="button-product-add")
		private WebElement addProductButton;
		
		@FindBy(xpath="//button[@id='button-cart']")
		private WebElement buttoncart;
		
		@FindBy(id="button-payment-address")
		private WebElement paymentContinue;
		
		@FindBy(id="button-save")
		private WebElement buttonSave;
		
		/////////////////////////////////// Test case2
		
		@FindBy(xpath="//i[@class='fa fa-tags fw']")
	private WebElement catalogParent;
		
		public void catalogParent()
		{
			Actions act = new Actions(driver);
					act.moveToElement(catalogParent).build().perform();
			
		}
				@FindBy(xpath="//*[@id='menu-catalog']/ul/li/a")
		private WebElement catalog;
			
		
		@FindBy(xpath="//i[@class='fa fa-plus']")
		private WebElement addCategory; 
		
		@FindBy(id="input-name1")
		private WebElement categoryName;
		
		@FindBy(xpath="//div[@class='note-editable panel-body']")
				private WebElement categoryDesc;
		
		@FindBy(id="input-meta-title1")
		private WebElement MetaTitle;
		
		
		@FindBy(id="input-meta-description1")
				private WebElement MetaDescription;
		
		@FindBy(xpath="//i[@class='fa fa-save']")
		private WebElement addSave; 
		
	//////////////////////////Methods
		
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
		
		public void editOrder()
		{
			this.editLnk.click();
		}
		
		public void customer()
		{
			this.customer.click();
		}
			
		public void delProduct()
		{
			this.deleteProduct.click();
		}
		
		public void inProduct(String chooseProd)
		
		{
			this.inputProduct.sendKeys(chooseProd);
			
		}
public void inQuantity(String chooseQuantity)
		
		{
			this.inputQuantity.clear();
			this.inputQuantity.sendKeys(chooseQuantity);
			
		}
		
public void addProduct()
{
	this.addProductButton.click();
}

public void buttonCart()
{
	this.buttoncart.click();
}

public void paymentContinue()
{
	this.paymentContinue.click();
}

public void paymentSave()
{
	this.buttonSave.click();
}
////////////////////////////////Test case2

public void sendUserName1(String userName1) {
	this.username.clear();
	this.username.sendKeys(userName1);
}
public void sendPassword1(String password1) {
	this.password.clear(); 
	this.password.sendKeys(password1); 
}

public void clickCatalog()
{
	this.catalog.click();
}

public void addCategory()
{
	this.addCategory.click();
}

public void addCategoryName(String categoryName)

{
	this.categoryName.sendKeys(categoryName);
}
public void addCategoryDesc(String categoryDesc)

{
	this.categoryDesc.sendKeys(categoryDesc);
}

public void metTitle(String MetaTitle1)

{
	
	this.MetaTitle.sendKeys(MetaTitle1);
}

public void metDesc(String MetaDesc1)

{
	
	this.MetaDescription.sendKeys(MetaDesc1);
}

public void clickSave()
{
	this.addSave.click();
}

}

		
		

