package org.pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityclass.UtilityClass;

public class MensFootwear extends UtilityClass {
public MensFootwear() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//div[text()='Brand']")
private WebElement brand;
public WebElement getBrand() {
	return brand;
}
@FindBy(xpath="//div[text()='PUMA']")
private List<WebElement> Puma;

public List<WebElement> getPuma() {
	return Puma;
}
@FindBy(xpath="//div[text()='adidas']")
private WebElement Adidas;
public WebElement getAdidas() {
	return Adidas;
}
@FindBy(xpath="//div[text()='Size']")
private WebElement Size;
public WebElement getSize() {
	return Size;
}
@FindBy(xpath="//div[text()='US 10']")
private WebElement sizeus10;
public WebElement getSizeus10() {
	return sizeus10;
}
@FindBy(xpath="//div[text()='bestselling']")
private WebElement bestselling;
public WebElement getBestselling() {
	return bestselling;
}
@FindBy(xpath="//div[text()='price: low to high']")
private WebElement lowtohigh;
public WebElement getLowtohigh() {
	return lowtohigh;
}
@FindBy(xpath="//div[@class='Bb1w_ _2V55p']")
private WebElement pricefilter;
public WebElement getPricefilter() {
	return pricefilter;
}
}
