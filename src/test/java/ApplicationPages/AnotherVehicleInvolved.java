package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnotherVehicleInvolved {

    public String btn_AnotherVehicleInvolved ="//label[contains(@for,'anotherVehicleInvolved')]/child::span[contains(text(),'{0}')][1]/ancestor::div[1]/input[1]";

    public String btn_DriverPresent = "//label[contains(@for,'noDriverIncident')]/child::span[contains(text(),'{0}')]/ancestor::div[1]/input[1]"; // Replace the Yes/No with {0}

    public String btn_PassengerPresent= "//label[contains(@for,'otherPassengerInvolved')]/child::span[contains(text(),'{0}')][1]/ancestor::div[1]/input[1]"; // Replace the Yes/No with {0}

    @FindBy(xpath = "(//div//input[contains(@name,'Vin')])[1]")
    public WebElement textbox_VinNo;

    @FindBy(xpath = "//input[contains(@id,'Year')]")
    public WebElement textarea_Year;

    @FindBy(xpath = "//input[contains(@id,'Make')]")
    public WebElement textarea_Make;

    @FindBy(xpath = "//input[contains(@id,'Make')]")
    public WebElement textarea_Model;

    @FindBy(xpath = "//div//input[contains(@id,'LicensePlateNumber')]")
    public WebElement textbox_LicensePlateNumber;

    public String dropdown_SelectState= "//mat-option//span[contains(text(),'{0}')]";

    @FindBy(xpath = "//div[contains(@class,'select-value')]")
    public WebElement dropdown_StateRegistered;

    public String btn_MostDamage= "//label[contains(@for,'vehicleImpactPoint')]/child::span[contains(text(),'{0}')]/ancestor::div[1]/input[1]";

    public String btn_Drivable = "//label[contains(@for,'drivable')]/child::span[contains(text(),'{0}')]/ancestor::div[1]/input[1]"; // Replace the Yes/No with {0}

    public String btn_Towed = "//label[contains(@for,'towed')]/child::span[contains(text(),'{0}')]/ancestor::div[1]/input[1]";

    public String btn_AirbagsDeployed = "//label[contains(@for,'airbagsDeployed')]/child::span[contains(text(),'{0}')]/ancestor::div[1]/input[1]";

    @FindBy(xpath = "//*[text()='Often claims with this many vehicles are more complex to report online. Please continue setting up your claim and notify your Claims Specialist of the additional vehicles.']")
    public WebElement text_VehicleWarningMessage;

    @FindBy(xpath="//mat-dialog-container//button/span[contains(text(),'Ok')]/ancestor::button[1]")
    public WebElement btn_WarningOK;
    
    @FindBy(xpath="//mat-error[contains(text(),' This field is required. ')]")
    public WebElement text_FieldIsRequired;

    @FindBy(xpath = "//span[text()='Next']")
    public WebElement btn_Next;



}
