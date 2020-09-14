package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncidentDetails {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(id="all-other-claim")
    public WebElement link_AllOtherClaim;

    @FindBy(id="txtPolicyNumber")
    public WebElement textBox_PolicyNumber;

    @FindBy(name="IncidentDate")
    public WebElement textBox_IncidentDate;

    @FindBy(name="IncidentTime")
    public WebElement textBox_IncidentTime;
  
    @FindBy(xpath="//*[@placeholder='AM/PM']//div[@class='mat-select-arrow-wrapper']")
    public WebElement dropDown_AMPM;
    
    @FindBy(xpath="(//span[contains(text(),'AM')])[2]")
    public WebElement option_AM;
    
    public String numberOfVehiclesInvolved = "//span[text()='{0}']/../../input";
    
    @FindBy(xpath="//button[@type='submit']")
    public WebElement btn_Next;

}
