package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncidentDetails {
	
	@FindBy(id="txtPolicyNumber")
    public WebElement textbox_PolicyNumber;
	
	@FindBy(name="IncidentDate")
    public WebElement textbox_IncidentDate;
	
	@FindBy(name="IncidentTime")
    public WebElement textbox_IncidentTime;
	
	@FindBy(xpath="//*[@role='listbox']")
    public WebElement dropdown_AMPM;
	
	@FindBy(xpath="//span[text()=' AM ']")
    public WebElement dropdownValue_AM;
	
	@FindBy(xpath="//span[text()=' PM ']")
    public WebElement dropdownValue_PM;

	//Dynamic Webelement
	public String button_VehicleInvolved= "//span[text()='{0}']/ancestor::div[1]/input[1]";
	
	@FindBy(xpath="//span[text()='Next']")
    public WebElement button_Next;
	
	@FindBy(id="btn_back")
    public WebElement button_Back;
	
	@FindBy(xpath="(//mat-error)[1]")
	public WebElement error_IncidentDate;

	@FindBy(xpath="//*[text()='Unfortunately, we are unable to process your claim online. Please call us at 844-937-5353. Our Claims Specialists are available 24/7 to get started working on your claim.']")
	public WebElement FourVehicle_ClaimMesssage;
			
		
}
