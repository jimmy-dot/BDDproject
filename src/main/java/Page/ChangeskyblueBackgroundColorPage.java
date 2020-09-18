package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeskyblueBackgroundColorPage {
	WebDriver driver;
	
	public ChangeskyblueBackgroundColorPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]") WebElement SKYBLUE_BUTTON;
	@FindBy(how = How.CSS, using = "body[style=\"background-color: skyblue;\"]") WebElement SKYBLUE_COLOR_ELEMENT;

		
		
	public void clickOnSkyBlueButton() {
		SKYBLUE_BUTTON.click();
	}
	
	
	public void assertSkyBlueColor() {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(SKYBLUE_COLOR_ELEMENT));
		
	}
	
	

}
