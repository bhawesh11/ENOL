package sharedTC;

import org.openqa.selenium.support.PageFactory;


import ApplicationPages.LaunchPage;
import resources.Testing;

public class STC_LaunchPage {
	
	public void clickGlassOnlyClaims(Testing test){
        test.setPage(LaunchPage.class);
        LaunchPage launchpage = (LaunchPage) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, launchpage.btn_GlassOnlyClaims);
        test.getLogger().info("Clicked on 'Glass Only Claims' button on Launch Page of ENOL");
     }
	
	public void clickAllOtherClaims(Testing test){
        test.setPage(LaunchPage.class);
        LaunchPage launchpage = (LaunchPage) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, launchpage.btn_AllOtherClaims);
        test.getLogger().info("Clicked on 'All Other Claims' button on Launch Page of ENOL");
     }
	
	public void clickLogin(Testing test){
        test.setPage(LaunchPage.class);
        LaunchPage launchpage = (LaunchPage) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, launchpage.btn_Login);
        test.getLogger().info("Clicked on 'Login' button on Launch Page of ENOL");
     }
	
	public void clickCreateAccount(Testing test){
        test.setPage(LaunchPage.class);
        LaunchPage launchpage = (LaunchPage) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, launchpage.btn_CreateAccount);
        test.getLogger().info("Clicked on 'Create Account' button on Launch Page of ENOL");
     }
	
	public void clickPrivacyAndSecurity(Testing test){
        test.setPage(LaunchPage.class);
        LaunchPage launchpage = (LaunchPage) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, launchpage.btn_PrivacyAndSecurity);
        test.getLogger().info("Clicked on 'Create Account' button on Launch Page of ENOL");
     }
	
	public void clickTermsOfUse(Testing test){
        test.setPage(LaunchPage.class);
        LaunchPage launchpage = (LaunchPage) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, launchpage.btn_TermsOfUse);
        test.getLogger().info("Clicked on 'Term of Use' button on Launch Page of ENOL");
     }
	
	public void clickSiteMap(Testing test){
        test.setPage(LaunchPage.class);
        LaunchPage launchpage = (LaunchPage) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, launchpage.btn_SiteMap);
        test.getLogger().info("Clicked on 'Site Map' button on Launch Page of ENOL");
     }
	
	
}
