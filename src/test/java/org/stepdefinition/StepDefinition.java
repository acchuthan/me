package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pojo.DealsDirectHomePage;
import org.pojo.LoginPage;
import org.pojo.MenCategory;
import org.pojo.MensFootwear;
import org.utilityclass.UtilityClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends UtilityClass {
	static DealsDirectHomePage homepage;
	static LoginPage login;
    @Given("user is in the Deals direct home page")
	public void user_is_in_the_Deals_direct_home_page() {
		toLoadBrowser();
	    toLoadURL("https://www.dealsdirect.com.au/");
	    toMaximize();
	}

	@When("user mouse over to Person icon")
	public void user_mouse_over_to_Person_icon() throws InterruptedException {
         homepage = new DealsDirectHomePage();
         tosleep(3000);
         toMouseOver(homepage.getPericon());
         //toclick(homepage.getPericon());
         
	}

	@When("user clicked my details in the drop down list preset in the person icon")
	public void user_clicked_my_details_in_the_drop_down_list_preset_in_the_person_icon() {
	   toclick(homepage.getPericon());
	}
	@Then("user is in the signup and signin Taskpage")
	public void user_is_in_the_signup_and_signin_Taskpage() {
		toCurrentUrl();
	}
	@When("user clicked the signin tab")
	public void user_clicked_the_signin_tab() throws InterruptedException {
		login = new LoginPage();
		tosleep(5000);
        toclick(login.getTabsignin());
	}
	@When("user entered invalid {string} and invalid {string}")
	public void user_entered_invalid_and_invalid(String email, String password) {
		login = new LoginPage();
		toType(login.getTxtemail(), email);
		toType(login.getTxtpass(), password);
	}
	@When("user entered sigin button")
	public void user_entered_sigin_button() throws InterruptedException {
		tosleep(2000);
		login = new LoginPage();
	    toclick(login.getBtnSignIn());
	}
	@Then("The system should console the text invalid username or password")
	public void the_system_should_console_the_text_invalid_username_or_password() {
	    toCurrentUrl();
	}

	@When("user entered valid {string} and valid {string}")
	public void user_entered_valid_and_valid(String email, String password) {
		toType(login.getTxtemail(), email);
		toType(login.getTxtpass(), password);
	}

	@Then("The user navigated to the next page")
	public void the_user_navigated_to_the_next_page() {
	   toCurrentUrl();
	}				
	@When("user mouseover to the mens category available in the homepage")
	public void user_mouseover_to_the_mens_category_available_in_the_homepage() throws InterruptedException {
	    MenCategory mencat = new MenCategory();
	    toSleep(3000);
	    toMouseOver(mencat.getMencategory());
	}

	@When("user selected the footware option available in the MEN catergory")
	public void user_selected_the_footware_option_available_in_the_MEN_catergory() throws InterruptedException {
		MenCategory mencat = new MenCategory();
		toSleep(3000);
		toclick(mencat.getFootwear());
	}

	@Then("user have to navigated to the footwear page")
	public void user_have_to_navigated_to_the_footwear_page() {
	    toCurrentUrl();
	}

	@When("user selected the Brand ,Size and pricefilter")
	public void user_selected_the_Brand_Size_and_pricefilter() throws InterruptedException, AWTException {
	    MensFootwear mf = new MensFootwear();
	    tosleep(3000);
//	    toclick(mf.getBrand());
//	    toSleep(3000);
//	    toMouseOver(mf.getPuma().get(1));
//	    toclick(mf.getPuma().get(1));
//	    
	    
	    //Selected the brand
	    
	    
//    toclick(mf.getBrand());
//	    toMouseOver(mf.getAdidas());
//    toclick(mf.getAdidas());
//	    
//	    tosleep(2000);
//	    toclick(mf.getSize());
//	    toMouseOver(mf.getSizeus10());
//	    toclick(mf.getSizeus10());
//	    
//	    toclick(mf.getBestselling());
	    
	    
	    
	   // toMouseOver(mf.getLowtohigh());
	   // toclick(mf.getLowtohigh());
	    
	    
//	    WebElement Brand = driver.findElement(By.xpath("//div[text()='Brand']"));
//	    Brand.click();
//	    WebElement Puma = driver.findElement(By.xpath("(//div[text()='PUMA'])[1]"));
//	    toMouseOver(Puma);
//	    toclick(Puma);
//	    driver.findElement(By.xpath(""));
//    List<WebElement> option = Brand.findElements(By.xpath("//div[text()='Brand']/following-sibling::div"));
//	    System.out.println("size"+option.size());
//    for (WebElement Element : option) {
//			String value=Element.getText();
//			if(value.equals("PUMA")) {
//				Element.click();
//				
//			}
//			
//	}

	  
	}
	@When("user set the price limits from the horizontal scrollbar")
	public void user_set_the_price_limits_from_the_horizontal_scrollbar() throws InterruptedException {
      WebElement pricefilter = driver.findElement(By.xpath("//div[@class='Bb1w_ _2V55p']"));
      Actions move = new Actions(driver);
      move.moveToElement(pricefilter).perform();
      toSleep(3000);
   //  move.moveByOffset(20, 200).perform();
   // move.release().perform();
      WebElement slider1 = driver.findElement(By.xpath("(//a[@class='_22WEV test-mysale-genie-range-slider_slider'])[1]"));
   //   move.dragAndDropBy(slider1, 50, 100).release(slider1).perform();
   //   Actions moveByOffset = move.clickAndHold(slider1).moveByOffset(20, 50).release();
   //   moveByOffset.build().perform();
      
      WebElement setpoint = driver.findElement(By.xpath("//a[@aria-valuenow='2000']"));
	setpoint.click();
	}
}
