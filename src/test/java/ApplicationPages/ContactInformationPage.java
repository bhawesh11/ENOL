package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInformationPage {

	@FindBy(id = "email")
	public WebElement textbox_EmailID;

	@FindBy(xpath = "//input[@formcontrolname='PhoneNumber']")
	public WebElement textbox_PhoneNo;
	
	
	@FindBy(xpath = "//*[@id='ContactAgreement']/label/div")
	public WebElement chkbox_Agreement;

	@FindBy(xpath = "//*[contains(text(),'Mobile Provider')]")
	public WebElement dropdown_NetworkProvider;

	public String netwrokProvider = "//*[text()=' {0} ']";

	@FindBy(xpath = "//mat-radio-group/mat-radio-button[1]/label/div[2]")
	public WebElement btn_TimeToContact;

	@FindBy(xpath = "//*[text()='File Your Claim']")
	public WebElement btn_FileClaim;

	@FindBy(id = "goBackBtn")
	public WebElement btn_GoBack;
}