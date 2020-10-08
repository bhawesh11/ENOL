package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WitnessesAndPolice {

   public WebElement btn_WitnessesYes;

    @FindBy(xpath = "//mat-radio-button[contains(@id,'mat-radio-13')]")
    public WebElement btn_WitnessesNo;

    @FindBy(xpath = "(//div//input[contains(@id,'txtFirstName')])[1]")
    public WebElement textbox_FirstName;

    @FindBy(xpath = "(//div//input[contains(@id,'txtLastName')])[1]")
    public WebElement textbox_LastName;

    @FindBy(xpath = "(//div//input[contains(@id,'AddressLine1')])[1]")
    public WebElement textbox_Address;

    @FindBy(xpath = "(//div//input[contains(@id,'city')])[1]")
    public WebElement textbox_City;

    @FindBy(xpath = "//div//mat-select[contains(@name,'State')]")
    public WebElement dropdown_State;

    public String dropdown_StateName = "//mat-option//span[contains(text(),'{0}')]";  // Replace the StateName with {0}

    @FindBy(xpath = "(//div//input[contains(@id,'PostalCode')])[1]")
    public WebElement textbox_PostalCode;

    @FindBy(xpath = "(//div//input[contains(@id,'txtPhone')])[1]")
    public WebElement textbox_Phone;

    @FindBy(xpath = "(//div//input[contains(@name,'Email')])[1]")
    public WebElement textbox_Email;

    @FindBy(xpath = "//mat-radio-button[contains(@id,'mat-radio-14')]")
    public WebElement btn_PoliceContactedYes;

    @FindBy(xpath = "//mat-radio-button[contains(@id,'mat-radio-15')]")
    public WebElement btn_PoliceContactedNo;

    @FindBy(xpath = "//div//input[contains(@placeholder,'Officer Name')]")
    public WebElement textbox_OfficerName;

    @FindBy(xpath = "//div//input[contains(@placeholder,'Report Number')]")
    public WebElement textbox_ReportNumber;

    @FindBy(xpath = "//span[text()='Next']")
    public WebElement btn_Next;
}
