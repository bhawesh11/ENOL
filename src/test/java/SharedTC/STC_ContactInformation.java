package SharedTC;

import org.openqa.selenium.support.PageFactory;

import ApplicationPages.ContactInformationPage;
import resources.Testing;

public class STC_ContactInformation {
	
public void contactInformationPage(Testing test) {
		
		test.setPage(ContactInformationPage.class);
		ContactInformationPage contactinformationpage =(ContactInformationPage) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().type(test,contactinformationpage.textbox_EmailID,test.getTestData(""));
		test.webFunctions().type(test,contactinformationpage.textbox_PhoneNo,test.getTestData(""));
		test.webFunctions().click(test,contactinformationpage.chkbox_Agreement);
		test.webFunctions().click(test,contactinformationpage.dropdown_NetworkProvider);
		test.webFunctions().click(test,contactinformationpage.netwrokProvider,test.getTestData(""));
		test.webFunctions().click(test,contactinformationpage.btn_TimeToContact);
		test.webFunctions().click(test,contactinformationpage.btn_FileClaim);
		test.getLogger().info("My Contact Information page saved successfully"); 
	}

}
