package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityclass.UtilityClass;

public class LoginPage extends UtilityClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Sign In']")
	private WebElement tabsignin;
	
	@FindBy(xpath="Sign Up")
	private WebElement tabsignup;
	
	@FindBy(name="email")
	private WebElement txtemail;
	public WebElement getTxtemail() {
		return txtemail;
	}
	@FindBy(name="password")
	private WebElement txtpass;
	public WebElement getTxtpass() {
		return txtpass;
	}
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement btnSignIn;
	public WebElement getTabsignin() {
		return tabsignin;
	}
	public WebElement getTabsignup() {
		return tabsignup;
	}
	public WebElement getBtnSignIn() {
		return btnSignIn;
	}
	
}
