package SharedTC;

import org.openqa.selenium.support.PageFactory;
import ApplicationPages.TellUsMore;
import resources.Testing;

public class STC_TellUsMore {
	public void TellUsMore_withLogin(Testing test) {

		test.setPage(TellUsMore.class);
		TellUsMore tellUsMore = (TellUsMore) PageFactory.initElements(test.driver, test.getPage());

		test.webFunctions().click(test, tellUsMore.button_Reporter_FirstOption);
		test.webFunctions().click(test, tellUsMore.button_Location_PHAddress);
		test.webFunctions().type(test, tellUsMore.textarea_IncidentDescription,test.getTestData("TellUsMore.IncidentDescription"));
		test.webFunctions().click(test, tellUsMore.button_Next);
		test.getLogger().info("Tell Us More Page Info entered, navigating to Vehicle Details Page...");
		}
	
	public void TellUsMore_WithoutLogin(Testing test){
		test.setPage(TellUsMore.class);
        TellUsMore tellUsMore = (TellUsMore) PageFactory.initElements(test.driver, test.getPage());
        
        test.webFunctions().type(test, tellUsMore.textbox_FirstName, test.getTestData("TellUsMore.FirstName"));
        test.webFunctions().type(test, tellUsMore.textbox_LastName, test.getTestData("TellUsMore.LastName"));
        test.webFunctions().type(test, tellUsMore.textbox_DOB, test.getTestData("TellUsMore.DOB"));
        test.webFunctions().type(test, tellUsMore.textbox_PhoneNo, test.getTestData("TellUsMore.PhoneNumber"));
        test.webFunctions().type(test, tellUsMore.textbox_Email, test.getTestData("TellUsMore.EmailID"));
        test.webFunctions().click(test,tellUsMore.dropdown_RelationToInsured);
        test.webFunctions().click(test,tellUsMore.dropdownValue_PolicyHolder);       
        test.webFunctions().click(test, tellUsMore.button_IncidentLocation_OtherLocation);
        test.webFunctions().type(test, tellUsMore.textbox_Address, test.getTestData("TellUsMore.Address"));
        test.webFunctions().type(test, tellUsMore.textbox_City, test.getTestData("TellUsMore.City"));
        test.webFunctions().click(test,tellUsMore.dropdown_State);
        test.webFunctions().click(test,tellUsMore.dropdownValue_State_TX); 
        test.webFunctions().type(test, tellUsMore.textbox_PostalCode, test.getTestData("TellUsMore.Zip"));
        test.webFunctions().type(test, tellUsMore.textarea_IncidentDescription, test.getTestData("TellUsMore.Accident"));
        test.webFunctions().click(test, tellUsMore.button_Next);
        test.getLogger().info("Tell Us More Page Info entered, navigating to Vehicle Details Page...");
     }

}
