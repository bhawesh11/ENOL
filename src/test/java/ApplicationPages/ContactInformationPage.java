package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInformationPage {

	@FindBy(id = "email")
	public WebElement textbox_EmailID;

	@FindBy(xpath = "//div[contains(text(),'Other')]")
	public WebElement btn_Other;
	
	@FindBy(xpath = "//input[@formcontrolname='PhoneNumber']")
	public WebElement textbox_PhoneNo;
	
	@FindBy(xpath = "//*[@id='ContactAgreement']/label/div")
	public WebElement chkbox_Agreement;

	@FindBy(xpath = "//*[contains(text(),'Mobile Provider')]")
	public WebElement dropdown_NetworkProvider;

	public String netwrokProvider = "//*[text()=' {0} ']";

	@FindBy(xpath = "//div[contains(text(),'8:00 AM - 12:00 PM EST')]")
	public WebElement btn_TimeToContact;

	@FindBy(xpath = "//*[text()='File Your Claim']")
	public WebElement btn_FileClaim;

	@FindBy(id = "goBackBtn")
	public WebElement btn_GoBack;
}