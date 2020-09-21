package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {

	@FindBy(id="txtPolicy")
    public WebElement textBox_PolicyNumber;

    @FindBy(id="txtLastName")
    public WebElement textBox_LastName;

    @FindBy(id="txtDateOfBirth")
    public WebElement textBox_DateOfBirth;

    @FindBy(id="txtZipCode")
    public WebElement textBox_ZipCode;

    @FindBy(xpath="//span[text()='Continue']/..")
    public WebElement btn_Continue;

    @FindBy(id="txtPassword")
    public WebElement textBox_Password;

    @FindBy(id="txtConfirmPassword")
    public WebElement textBox_ConfirmPassword;

    @FindBy(xpath="//*[@type='submit']")
    public WebElement btn_Register;
    
    @FindBy(xpath="//span[contains(text(),'Log In')]/..")
    public WebElement btn_Login;
    
}
