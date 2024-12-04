package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLogin {

	public DwsLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(className = "ico-login")
	public WebElement login_link;
	@FindBy(id = "Email")
	private WebElement Email;
	@FindBy(name = "passwod")
	private WebElement password;
	@FindBy(css = "input[id='RememberMe']")
	public WebElement remember_me;
	@FindBy(xpath = "//input[@value='log in']")
	public WebElement login_button;
	private Object email;
	public void loginLink() {
		login_link.click();
	}
	public void email(String data) {
		Email.sendKeys(data);
	
	}
	public void password(String data) {
		password.sendKeys(data);
	}
	public void rememberme() {
		remember_me.click();
	}
	public void loginButton() {
		login_button.click();
	}
	public void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

}


