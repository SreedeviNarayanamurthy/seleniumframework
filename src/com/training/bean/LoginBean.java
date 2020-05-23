package com.training.bean;

public class LoginBean {
	private String productname;
	private String quantity;

	public LoginBean() {
	}

	public LoginBean(String productname, String quantity) {
		super();
		this.productname = productname;
		this.quantity = quantity;
	}

	public String getproductname() {
		return productname;
	}

	public void setproductname(String productname) {
		this.productname = productname;
	}

	public String getquantity() {
		return quantity;
	}

	public void setquantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "LoginBean [productname=" + productname + ", quantity=" + quantity + "]";
	}

}
