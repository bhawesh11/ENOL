package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TerminatePage {
	
	@FindBy(xpath = "//*[text()='Call us to continue your claim']")
	public WebElement textMsg;
	
	@FindBy(id = "btn_back")
	public WebElement backButton;
		
	

}