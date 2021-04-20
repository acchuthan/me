package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityclass.UtilityClass;

public class MenCategory extends UtilityClass {
public MenCategory() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//div[text()='Men']")
private WebElement mencategory;

@FindBy(xpath="//a[text()='All Sales']")
private WebElement Allsales;

@FindBy(xpath="//a[text()='All Products']")
private WebElement Allproduct;

@FindBy(xpath="//a[text()='Clothing']")
private WebElement Cloth;

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
	return Cloth;
}

public WebElement getAccessories() {
	return Accessories;
}

public WebElement getFootwear() {
	return Footwear;
}
@FindBy(xpath="//a[text()='Accessories']")
private WebElement Accessories;

@FindBy(xpath="//a[text()='Footwear']")
private WebElement Footwear;
}
