package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoreDetails {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(id="txtFirstName")
    public WebElement textBox_FirstName;

    @FindBy(id="txtLastName")
    public WebElement textBox_LastName;

    @FindBy(xpath="//*[@formcontrolname='DateOfBirth']")
    public WebElement textBox_DateOfBirth;

    @FindBy(xpath="//*[@placeholder='Phone']")
    public WebElement textBox_Phone;
  
    @FindBy(id="email")
    public WebElement textBox_Email;

    @FindBy(xpath="//*[@formcontrolname='RelationshipToInsured']//div[@class='mat-select-arrow-wrapper']")
    public WebElement dropDown_RelationshipToInsured; 
    
    @FindBy(xpath="//*[@formcontrolname='locationRadio']/*[2]")
    public WebElement dropDown_OtherLocation; 
    
    @FindBy(id="AddressLine1")
    public WebElement textBox_Address; 
    
    @FindBy(id="city")
    public WebElement textBox_City; 
    
    @FindBy(name="State")
    public WebElement textBox_State; 
    
    @FindBy(id="PostalCode")
    public WebElement textBox_PostalCode; 
    
    @FindBy(id="incident-description")
    public WebElement textBox_IncidentDescription; 
    
    @FindBy(xpath="//button[@type='submit']")
    public WebElement btn_Next;

}
