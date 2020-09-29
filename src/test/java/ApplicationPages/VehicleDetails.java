package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VehicleDetails {

    @FindBy(xpath= "(//div//input[contains(@id,'moved-col')])[1]")
    public WebElement btn_PersonalVehicle;
    
    @FindBy(xpath= "(//div//input[contains(@name,'Vin')])[1]")
    public WebElement textbox_VinNo;

    @FindBy(xpath= "//div//input[contains(@name,'DoNotHaveVin')]")
    public WebElement checkbox_DontHaveVin;

    @FindBy(xpath= "//input[contains(@id,'txtYear')]")
    public WebElement textbox_Year;

    @FindBy(xpath= "//div//mat-select[contains(@name,'Make')]")
    public WebElement dropdown_Make;

    @FindBy(xpath= "//div//mat-select[contains(@name,'Model')]")
    public WebElement dropdown_Model;

    // Will be used for both Make and Model
    public String dropdown_SelectMakeModel= "//mat-option//span[contains(text(),'{0}')]"; // Replace the Car Make or Model with {0}

    public String btn_WhatHappend= "//div//label[contains(text(),'{0}')]"; // Replace the value with {0}

    public String btn_WhatHappendType= "//div//label[contains(text(),'{0}')]"; // Replace the value with {0}

    @FindBy(xpath= "(//div//input[contains(@name,'FloodWaterType')])[1]")
    public WebElement btn_SaltWater;

    @FindBy(xpath= "(//div//input[contains(@name,'FloodWaterType')])[2]")
    public WebElement btn_FreshWater;

    public String btn_MostDamage= "//label[contains(@for,'vehicleImpactPoint')]/child::span[contains(text(),'{0}')]";

    public String btn_Drivable = "//label[contains(@for,'drivable')]/child::span[contains(text(),'{0}')]"; // Replace the Yes/No with {0}

    public String btn_Towed = "//label[contains(@for,'towed')]/child::span[contains(text(),'{0}')]";

    @FindBy(xpath= "//input[contains(@id,'AddressLine1')]")
    public WebElement textbox_TowingAddress;

    @FindBy(xpath= "//input[contains(@id,'city')]")
    public WebElement textbox_City;

    @FindBy(xpath= "//input[contains(@id,'PostalCode')]")
    public WebElement textbox_PostalCode;

    @FindBy(xpath= "//div//mat-select[contains(@name,'State')]")
    public WebElement dropdown_State;

    public String dropdownlist_StateName= "//mat-option//span[contains(text(),'{0}')]";

    public String btn_AirbagsDeployed = "//label[contains(@for,'airbagsDeployed')]/child::span[contains(text(),'{0}')]";

    @FindBy(xpath= "//span[text()='Next']")
    public WebElement btn_Next;
}
