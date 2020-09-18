package steps;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.ChangeWhiteBackgroundColorPage;
import Page.ChangeskyblueBackgroundColorPage;
import Util.BrowserFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangeBackgroundColorTest {
	WebDriver driver;
	ChangeskyblueBackgroundColorPage changecolor;
	 ChangeWhiteBackgroundColorPage whitebackground;
	
	@Given("^I am on techfios\\.com/test website$")
	public void i_am_on_techfios_com_test_website() {
		driver = BrowserFactory.launchBrowser();
		changecolor = PageFactory.initElements(driver,ChangeskyblueBackgroundColorPage.class);
		whitebackground = PageFactory.initElements(driver,ChangeWhiteBackgroundColorPage.class);
	}

	@When("^I click on Set SkyBlue Background button;$")
	public void i_click_on_Set_SkyBlue_Background_button() {
		changecolor.clickOnSkyBlueButton();
	    
	}

	@Then("^the background color will change to sky blue;$")
	public void the_background_color_will_change_to_sky_blue() {
		changecolor.assertSkyBlueColor();
	    
	}

	@When("^I click on white Background button;$")
	public void i_click_on_white_Background_button() {
		whitebackground.clickOnWhiteButton();
	    
	}

	@Then("^the background color will change to white;$")
	public void the_background_color_will_change_to_white() {
		whitebackground.assertWhiteColor();
	}
	
	@After
	public void tearDown() {
		BrowserFactory.tearDown();
	}
}
