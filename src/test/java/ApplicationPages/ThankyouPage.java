package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThankyouPage {
	
	@FindBy(xpath = "//*[@class='claim-number']")
	public WebElement text_ClaimNo;
	
	@FindBy(xpath = "//*[text()='View Your Claim']")
	public WebElement btn_ViewClaim;
	
	@FindBy(id = "Layer_1")
	public WebElement btn_UploadClaimDoc;		

}