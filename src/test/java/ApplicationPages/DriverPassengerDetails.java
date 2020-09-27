package applicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DriverPassengerDetails {

    public String btn_DriverPresent = "//label[contains(@for,'noDriverIncident')]/child::span[contains(text(),'')]"; // Replace the Yes/No with {0}

    public String btn_DriverAsPolicyHolder = "//label[contains(@for,'sameAsPolicyHolder')]/child::span[contains(text(),'')]"; // Replace the Yes/No with {0}

    @FindBy(xpath = "(//mat-radio-button[contains(@name,'DriverId')])[1]")
    public WebElement btn_DriversAtTimeOfIncident;

    @FindBy(xpath = "(//div//input[contains(@id,'txtFirstName')])[1]")
    public WebElement textbox_DriverFirstName;

    @FindBy(xpath = "(//div//input[contains(@id,'txtLastName')])[1]")
    public WebElement textbox_DriverLastName;

    @FindBy(xpath = "(//div//input[contains(@id,'DateOfBirth')])[1]")
    public WebElement textbox_DriverDOB;

    @FindBy(xpath = "(//div//input[contains(@id,'AddressLine1')])[1]")
    public WebElement textbox_DriverAddress;

    @FindBy(xpath = "(//div//input[contains(@id,'city')])[1]")
    public WebElement textbox_DriverCity;

    @FindBy(xpath = "(//div//mat-select[contains(@name,'State')])[1]")
    public WebElement dropdown_DriverState;

    public String dropdown_DriverStateName = "//mat-option//span[contains(text(),'{0}')]";  // Replace the StateName with {0}

    @FindBy(xpath = "(//div//input[contains(@id,'PostalCode')])[1]")
    public WebElement textbox_DriverPostalCode;

    @FindBy(xpath = "(//div//input[contains(@id,'txtPhone')])[1]")
    public WebElement textbox_DriverPhone;

    @FindBy(xpath = "(//label[contains(@for,'areYouInjured')]/child::span[contains(text(),'Yes')])[1]")
    public WebElement btn_DriverInjuredYes;

    @FindBy(xpath = "(//div//textarea[contains(@id,'injuryDescription')])[1]")
    public WebElement textarea_DriverInjuryDescription;

    public String btn_PassengerPresent=  "//label[contains(@for,'otherPassengerInvolved')]/child::span[contains(text(),'')]"; // Replace the Yes/No with {0}

    @FindBy(xpath = "(//div//input[contains(@id,'txtFirstName')]){0}") // Replace the Passenger Number with {0} (Passenger 2- [2])
    public WebElement textbox_PassengerFirstName;

    @FindBy(xpath = "(//div//input[contains(@id,'txtLastName')]){0}") // Replace the Passenger Number with {0} (Passenger 2- [2])
    public WebElement textbox_PassengerLastName;

    @FindBy(xpath = "(//div//input[contains(@id,'DateOfBirth')]){0}")// Replace the Passenger Number with {0} (Passenger 2- [2])
    public WebElement textbox_PassengerDOB;

    @FindBy(xpath = "(//div//input[contains(@id,'AddressLine1')]){0}")// Replace the Passenger Number with {0} (Passenger 2- [2])
    public WebElement textbox_PassengerAddress;

    @FindBy(xpath = "(//div//input[contains(@id,'city')]){0}") // Replace the Passenger Number with {0} (Passenger 2- [2])
    public WebElement textbox_PassengerCity;

    @FindBy(xpath = "(//div//mat-select[contains(@name,'State')]){0}") // Replace the Passenger Number with {0} (Passenger 2- [2])
    public WebElement dropdown_PassengerState;

    public String dropdown_PassengerStateName = "//mat-option//span[contains(text(),'{0}')]";  // Replace the StateName with {0}

    @FindBy(xpath = "(//div//input[contains(@id,'PostalCode')]){0}") // Replace the Passenger Number with {0} (Passenger 2- [2])
    public WebElement textbox_PassengerPostalCode;

    @FindBy(xpath = "(//div//input[contains(@id,'txtPhone')]){0}") // Replace the Passenger Number with {0} (Passenger 2- [2])
    public WebElement textbox_PassengerPhone;

    @FindBy(xpath = "(//label[contains(@for,'areYouInjured')]/child::span[contains(text(),'Yes')]){0}") // Replace the Passenger Number with {0} (Passenger 2- [2])
    public WebElement btn_PassengerInjuredYes;

    @FindBy(xpath = "(//label[contains(@for,'areYouInjured')]/child::span[contains(text(),'No')]){0}") // Replace the Passenger Number with {0} (Passenger 2- [2])
    public WebElement btn_PassengerInjuredNo;


    @FindBy(xpath = "(//div//textarea[contains(@id,'injuryDescription')]){0}") // Replace the Passenger Number with {0} (Passenger 2- [2])
    public WebElement textarea_PassengerInjuryDescription;

    @FindBy(xpath = "//div//button[contains(@id,'addPassenger')]")
    public WebElement btn_AddAnotherPassenger;

    public String btn_AnotherVehicleInvolved ="//label[contains(@for,'anotherVehicleInvolved')]/child::span[contains(text(),'')]";

    @FindBy(xpath = "//span[text()='Next']")
    public WebElement btn_Next;











}
