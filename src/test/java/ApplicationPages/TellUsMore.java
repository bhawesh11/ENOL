package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TellUsMore {	

	@FindBy(id="txtFirstName")
    public WebElement textbox_FirstName;
	
	@FindBy(id="txtLastName")
    public WebElement textbox_LastName;
	
	@FindBy(xpath="//input[@formcontrolname='DateOfBirth']")
    public WebElement textbox_DOB;
	
	@FindBy(xpath="//input[@formcontrolname='PhoneNumber']")
    public WebElement textbox_PhoneNo;
	
	@FindBy(id="email")
    public WebElement textbox_Email;
	
	@FindBy(xpath="//span[contains(text(),'Relation to')]")
    public WebElement dropdown_RelationToInsured;
	
	@FindBy(xpath="//span[contains(text(),'Policy Holder')]")
    public WebElement dropdownValue_PolicyHolder;
	
	@FindBy(xpath="//span[contains(text(),'Relative')]")
    public WebElement dropdownValue_Relative;
	
	@FindBy(xpath="//span[contains(text(),'Attorney')]")
    public WebElement dropdownValue_Attorney;
	
	@FindBy(xpath="//span[contains(text(),'Other party involved')]")
    public WebElement dropdownValue_OtherPartyInvolved;
	
	@FindBy(xpath="//div[contains(text(),'Other Location')]")	
    public WebElement button_IncidentLocation_OtherLocation;
	
	@FindBy(id="AddressLine1")
    public WebElement textbox_Address;
	
	@FindBy(id="city")
    public WebElement textbox_City;
	
	@FindBy(xpath="//mat-label[contains(text(),'State')]//ancestor::label")
    public WebElement dropdown_State;
	
	@FindBy(xpath="//span[contains(text(),'TX')]")
    public WebElement dropdownValue_State_TX;
	
	@FindBy(xpath="//span[contains(text(),'VA')]")	
    public WebElement dropdownValue_State_VA;
	
	@FindBy(id="PostalCode")
    public WebElement textbox_PostalCode;
    
    @FindBy(id="incident-description")
    public WebElement textarea_IncidentDescription;
    
    @FindBy(xpath="//span[text()='Next']")
    public WebElement button_Next;
	
	@FindBy(id="btn_back")
    public WebElement button_Back;
	
	//-------------------------------------------------------------------------------------------------------------------------
	//LOGIN SCENARIO		
			
	@FindBy(xpath="//label[contains(text(),'Who is reporting this incident?')]//ancestor::form/mat-radio-group/mat-radio-button[1]/label")
	public WebElement button_Reporter_FirstOption;	
		
	@FindBy(xpath="//label[contains(text(),'Who is reporting this incident?')]//ancestor::form/mat-radio-group/mat-radio-button[2]/label")
	public WebElement button_Reporter_SecondOption;
	
	@FindBy(xpath="//div[contains(text(),'Policy Holder')]")
	public WebElement button_Location_PHAddress;
	
	@FindBy(xpath="//div[contains(text(),'Other Location')]")
	public WebElement button_Location_OtherLocation;
	
}
