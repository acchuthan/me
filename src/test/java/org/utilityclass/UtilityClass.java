package org.utilityclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {
	 public static WebDriver driver;
	 public static FileOutputStream output;
	 
	
	public static void toLoadBrowser() {
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	public static void toLoadURL(String url) {
		driver.get(url);
	}
	public static void toGetTitle() {
		driver.getTitle();

	}
	
	public static void tosendkeys(String textkeys) {
		Actions a = new Actions(driver);
		a.sendKeys(textkeys);
	}
	public static void togettext(WebElement element) {
		
		element.getText();

	}	
	public static void toSleep(int millisec) throws InterruptedException {
		Thread.sleep(millisec);
	}

	public static void toType(WebElement element,String Text) {
		element.sendKeys(Text);
	}
	public static void toclick(WebElement element) {
		element.click();

	}
	public static void toDropDown(WebElement element ,int index) {
		  Select s = new Select(element);
		  s.selectByIndex(index);
		}
	public static void toNavigateBack() {
		driver.navigate().back();
	}
	
	public static  void toConTextClick() {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	  }
	public static void toDoubleClick() {
		Actions a = new Actions(driver);
		a.doubleClick().perform();
	  }
	public static void toMouseOver(WebElement element ) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	  }

	public static void todraganddrop(WebElement src,WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
	
	public static void toKeyUp(WebElement element) {
		Actions a = new Actions(driver);
		a.keyUp(element, Keys.UP);

	}
	public static void toKeyDown(WebElement element) {
		Actions a = new Actions(driver);
		a.keyUp(element, Keys.DOWN);

	}
	public static void tosleep(int value) throws InterruptedException{
		Thread.sleep(value);

	}
	
	public static void tocopy() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_C);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_C);
	}
	public static void tocut() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);

	}
	public static void topaste() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	}
	public static void totabdown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void toTabUp() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_KP_UP);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_UP);
	}
	public static void toEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void toSelectAll() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_A);
	}
	public static void tobackspace() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);

	}
	public static void toAcceptSimpleAlert() {
		Alert a = driver.switchTo().alert();
	    a.accept();
	}
	public static void toDismissAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	public static void toConfirmAlert() {
		Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	}
	public static void toPromptAlert(String value) {
		Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.sendKeys(value);
	a.accept();
	}
	public static void toRefresh() {
		driver.navigate().refresh();
	}
	public static void toForward() {
		driver.navigate().forward();
	}
	public static void toBack() {
		driver.navigate().back();
	}
	public static void toNavigateWait(int value) throws InterruptedException {
		driver.navigate().wait(value);
	}
	public static void toNavigateUrl(String value) {
		driver.navigate().to(value);
	}
	public static void toClose() {
		driver.close();
	}
	public static void toQuit() {
		driver.quit();
	}
	public static void disablePopup() {
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
	}

	public static void toMaximize() {
		driver.manage().window().maximize();
	  }
	//JavaScriptExecutor
	public static void toScrollDown(String Locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", Locator);
	}
	public static void toScrollUp(String Locator) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(false)", Locator);
	}
   public static void toJavaClick(String text) {  
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", text);
}
	public static void toJavaget(String Locator) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("argumets[0].getAttriute('value')",Locator );
	}
	public static void toJavaSet(String keys,String Locator) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript( "return argument[0].setAttribute('value','keys')",Locator);
	}
	public static void takeSnap(String picName) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\user\\eclipse-workspace\\TestNGTasks\\ScreenShot"+picName+".png");

	
	}
	public static void toCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
}
