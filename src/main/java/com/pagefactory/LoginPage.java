package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(xpath = "//input[@name = 'username']")
	private WebElement username;

	@FindBy(xpath = "//input[@name = 'password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement loginBtn;
	
	@FindBy(css = ".oxd-text.oxd-text--p.oxd-alert-content-text")
	private WebElement errorMsg;
	
	@FindBy(css = ".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
	private WebElement dashboardTxt;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public WebElement getErrorMsg() {
		return errorMsg;
	}
	
	public WebElement getDashboardTxt() {
		return dashboardTxt;
	}
}
