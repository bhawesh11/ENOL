package ApplicationPages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import resources.BrowserFactory;
import resources.Testing;
import resources.Utility;

public class Login {

	    @FindBy(id="txtEmail")
	    public WebElement textBox_Email;

	    @FindBy(id="txtPassword")
	    public WebElement textBox_Password;

	    @FindBy(xpath="//span[text()='Sign in']/..")
	    public WebElement btn_SignIn;

	    @FindBy(xpath="//a[text()='Forgot password?']")
	    public WebElement link_ForgotPassword;

	    @FindBy(xpath="//strong[text()='Setup Online Account']/..")
	    public WebElement link_SetupOnlineAccount;


}// closing class
