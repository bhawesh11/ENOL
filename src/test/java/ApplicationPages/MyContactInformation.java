package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyContactInformation {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(id="email")
    public WebElement textBox_Email;

    @FindBy(xpath="//*[@formcontrolname='PhoneNumber']")
    public WebElement btn_Phone;
    
    @FindBy(xpath="//label[contains(.,'8:00 AM - 12:00 PM EST')]")
    public WebElement btn_PreferredTime_8to12;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement btn_FileYourClaim;

}
