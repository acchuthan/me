package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityclass.UtilityClass;

public class DealsDirectHomePage extends UtilityClass{
public DealsDirectHomePage() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[@class='IQwlp _1wM2J']")
private WebElement pericon;

public WebElement getPericon() {
	return pericon;
}
@FindBy(xpath="//div[@class='_2dJP2']")
private WebElement imghome;

@FindBy(xpath="//div[text()='Men']")
private WebElement mencategory;

@FindBy(xpath="//a[text()='All Sales']")
private WebElement Allsales;

@FindBy(xpath="//a[text()='All Products']")
private WebElement Allproduct;

@FindBy(xpath="//a[text()='Clothing']")
private WebElement cloth;

public WebElement getMencategory() {
	return mencategory;
}
public WebElement getAllsales() {
	return Allsales;
}
public WebElement getAllproduct() {
	return Allproduct;
}
public WebElement getCloth() {
	return cloth;
}
public WebElement getImghome() {
	return imghome;
}
public WebElement getMydetails() {
	return mydetails;
}
@FindBy(xpath="//a[text()='My Details']")
private WebElement mydetails;
}

