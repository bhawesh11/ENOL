package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DriverPassenger {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(xpath="//span[text()='Yes']/../../input[@id='noDriverIncident']")
    public WebElement btn_DriverAtIncdident_YES;

    @FindBy(xpath="//span[text()='No']/../../input[@id='noDriverIncident']")
    public WebElement btn_DriverAtIncdident_NO;

    @FindBy(xpath="//span[text()='Yes']/../../input[@id='otherPassengerInvolved']")
    public WebElement btn_Passenger_YES;

    @FindBy(xpath="//span[text()='No']/../../input[@id='otherPassengerInvolved']")
    public WebElement btn_Passenger_NO;
    
    @FindBy(xpath="//span[text()='Yes']/../../input[@id='anotherVehicleInvolved']")
    public WebElement btn_anotherVehicleInvolved_YES;
    
    @FindBy(xpath="//span[text()='No']/../../input[@id='anotherVehicleInvolved']")
    public WebElement btn_anotherVehicleInvolved_NO;
    
    @FindBy(xpath="//button[@type='submit']")
    public WebElement btn_Next;

}
