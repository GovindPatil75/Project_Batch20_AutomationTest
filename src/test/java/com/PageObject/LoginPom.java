package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@name='email']") private WebElement txt_Email;
	
	@FindBy(how=How.XPATH,using="//input[@name='pass']") private WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']") private WebElement btn_login;
	
	//getter
	
	public WebElement gettxt_Email() {
		
		return txt_Email;
	}

    public WebElement gettxt_password() {
		
		return txt_password;
	}
    
    public WebElement getbtn_login() {
		
		return btn_login;
	}
}
