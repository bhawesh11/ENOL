package SharedTC;

import ApplicationPages.ContactInformationPage;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_ContactInformation {
	
public void contactInformationPage(Testing test) {
		
		test.setPage(ContactInformationPage.class);
		ContactInformationPage contactinformationpage =(ContactInformationPage) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().type(test,contactinformationpage.textbox_EmailID,test.getTestData("ContactInformation.EmailID"));
		
		try { if(contactinformationpage.btn_Other.isDisplayed()==true) {
		test.webFunctions().click(test,contactinformationpage.btn_Other);
		}}
		catch (Exception e) {
		}
		test.webFunctions().type(test,contactinformationpage.textbox_PhoneNo,test.getTestData("ContactInformation.PhoneNo"));
		test.webFunctions().click(test,contactinformationpage.chkbox_Agreement);
		test.webFunctions().click(test,contactinformationpage.dropdown_NetworkProvider);
		test.webFunctions().click(test,contactinformationpage.netwrokProvider,test.getTestData("ContactInformation.NetworkProvider"));
		test.webFunctions().staticWait(3000);
		test.webFunctions().click(test,contactinformationpage.btn_TimeToContact);
		test.webFunctions().click(test,contactinformationpage.btn_FileClaim);
		test.getLogger().info("My Contact Information page saved successfully"); 
	}

}
