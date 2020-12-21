package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaunchPage {

	@FindBy(id="glass-only-claim")
    public WebElement btn_GlassOnlyClaims;
	
	@FindBy(id="all-other-claim")
    public WebElement btn_AllOtherClaims;
	
	@FindBy(id="href_login")
    public WebElement btn_Login;
	
	@FindBy(id="href_register")
    public WebElement btn_CreateAccount;
	
	@FindBy(id="home-icon")
    public WebElement btn_Home;
	
	@FindBy(id="privacySecurityLink")
    public WebElement btn_PrivacyAndSecurity;
	
	@FindBy(id="termsOfUseLink")
    public WebElement btn_TermsOfUse;
	
	@FindBy(id="siteMapUrl")
    public WebElement btn_SiteMap;

	@FindBy(xpath="//mat-dialog-container//button/span[contains(text(),'Ok')]")
    public WebElement btn_LeavePage;

}
