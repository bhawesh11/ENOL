package SharedTC;

import ApplicationPages.IncidentDetails;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

import static org.testng.Assert.assertTrue;

public class STC_IncidentDetails {
	
	public void fillIncidentDetails_Login(Testing test){
        test.setPage(IncidentDetails.class);
        IncidentDetails incidentDetails = (IncidentDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, incidentDetails.textbox_IncidentDate, test.getTestData("IncidentDate"));
        test.webFunctions().type(test, incidentDetails.textbox_IncidentTime, test.getTestData("IncidentTime"));
        test.webFunctions().click(test, incidentDetails.dropdown_AMPM);
        test.webFunctions().click(test, incidentDetails.dropdownValue_AM);
        test.webFunctions().click(test, incidentDetails.dropdownValue_AM);
        test.webFunctions().click(test, incidentDetails.button_VehicleInvolved,test.getTestData("VehicleInvolved"));
        test.webFunctions().click(test, incidentDetails.button_Next);
        test.getLogger().info("Incident Details Info entered, navigating to Vehicle Details Page...");
     }
	
	public void fillIncidentDetails_WithoutLogin(Testing test){
        test.setPage(IncidentDetails.class);
        IncidentDetails incidentDetails = (IncidentDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, incidentDetails.textbox_PolicyNumber, test.getTestData("PolicyNumber"));
        test.webFunctions().type(test, incidentDetails.textbox_IncidentDate, test.getTestData("IncidentDate"));
        test.webFunctions().type(test, incidentDetails.textbox_IncidentTime, test.getTestData("IncidentTime"));
        test.webFunctions().click(test, incidentDetails.dropdown_AMPM);
        test.webFunctions().click(test, incidentDetails.dropdownValue_AM);
        test.webFunctions().click(test, incidentDetails.dropdownValue_AM);
        test.webFunctions().click(test, incidentDetails.button_VehicleInvolved,test.getTestData("VehicleInvolved"));
        test.webFunctions().click(test, incidentDetails.button_Next);
        test.getLogger().info("Incident Details Info entered, navigating to Vehicle Details Page...");
     }
	
	public void verifyErrorMessage(Testing test){
		String ActualErrorMessage;
        test.setPage(IncidentDetails.class);
        IncidentDetails incidentDetails = (IncidentDetails) PageFactory.initElements(test.driver, test.getPage());
        ActualErrorMessage = test.webFunctions().readInfo(test, incidentDetails.error_IncidentDate);
        test.getLogger().info("Actual Error Message : " + ActualErrorMessage);
        assertTrue(ActualErrorMessage.equals(test.getTestData("ExpectedErrorMessage")));		
        test.getLogger().info("Assertion Passed, error text is correct...");
     }

}
