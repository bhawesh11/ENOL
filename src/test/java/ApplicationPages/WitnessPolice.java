package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WitnessPolice {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(xpath="(//label[text()='Were there any witnesses?']/..//input)[1]")
    public WebElement btn_Witness_YES;

//    @FindBy(xpath="(//label[text()='Were there any witnesses?']/..//input)[1]")
    @FindBy(xpath="//label[contains(.,'No')]")
    public WebElement btn_Witness_NO;
    
    @FindBy(xpath="(//label[text()='Were the police contacted?']/..//input)[1]")
    public WebElement btn_PoliceContacted_YES;

//    @FindBy(xpath="(//label[text()='Were the police contacted?']/..//input)[1]")
    @FindBy(xpath="//div[2]/mat-radio-group/mat-radio-button[2]/label")
    public WebElement btn_PoliceContacted_NO;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement btn_Next;

}
