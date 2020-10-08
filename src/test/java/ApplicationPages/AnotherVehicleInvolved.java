package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnotherVehicleInvolved {

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

    public String dropdown_StateRegistered= "//div[contains(@class,'select-value')]";

    @FindBy(xpath = "//mat-option//span[contains(text(),'')]")
    public WebElement dropdown_SelectState;

    public String btn_MostDamage= "//label[contains(@for,'vehicleImpactPoint')]/child::span[contains(text(),'')]";

    public String btn_Drivable = "//label[contains(@for,'drivable')]/child::span[contains(text(),'{0}')]"; // Replace the Yes/No with {0}

    public String btn_Towed = "//label[contains(@for,'towed')]/child::span[contains(text(),'{0}')]";

    public String btn_AirbagsDeployed = "//label[contains(@for,'airbagsDeployed')]/child::span[contains(text(),'{0}')]";

    @FindBy(xpath = "//span[text()='Next']")
    public WebElement btn_Next;


}
