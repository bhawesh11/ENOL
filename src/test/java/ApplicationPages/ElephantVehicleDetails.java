package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElephantVehicleDetails {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(id="txtVin")
    public WebElement textBox_VIN;
    
    @FindBy(name="DoNotHaveVin")
    public WebElement checkbox_IDoNotHaveVIN;

    @FindBy(name="Year")
    public WebElement textbox_Year;

    @FindBy(name="Make")
    public WebElement dropdown_Make;

    @FindBy(name="Model")
    public WebElement dropdown_Model;

    public String dropdown_WhatHappened="//*[@formcontrolname='WhatHappened']/../label[text()='{0}']/../input";

    @FindBy(xpath="//span[text()='Yes']/../../input[@id='drivable']")
    public WebElement btn_Drivable_YES;

    @FindBy(xpath="//span[text()='No']/../../input[@id='drivable']")
    public WebElement btn_Drivable_NO;

    @FindBy(xpath="//span[text()='Yes']/../../input[@id='towed']")
    public WebElement btn_Towed_YES;

    @FindBy(xpath="//span[text()='No']/../../input[@id='towed']")
    public WebElement btn_Towed_NO;
    
    @FindBy(xpath="//span[text()='Yes']/../../input[@id='airbagsDeployed']")
    public WebElement btn_airbagsDeployed_YES;
    
    @FindBy(xpath="//span[text()='No']/../../input[@id='airbagsDeployed']")
    public WebElement btn_airbagsDeployed_NO;
    
    @FindBy(xpath="//button[@type='submit']")
    public WebElement btn_Next;

}
