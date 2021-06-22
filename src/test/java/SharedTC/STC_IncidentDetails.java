package SharedTC;

import ApplicationPages.IncidentDetails;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

import static org.testng.Assert.assertTrue;

public class STC_IncidentDetails {
	
	public void fillIncidentDetails_Login(Testing test){
		test.setPage(IncidentDetails.class);
        IncidentDetails incidentDetails = (IncidentDetails) PageFactory.initElements(test.driver, test.getPage());
        test.getLogger().info("Incidate Date :"+test.getDate(test.getOutput("Effective Date")));
        test.webFunctions().type(test, incidentDetails.textbox_IncidentDate, test.getDate(test.getOutput("Effective Date")));
        test.webFunctions().type(test, incidentDetails.textbox_IncidentTime, "1200");
        test.webFunctions().click(test, incidentDetails.dropdown_AMPM);
        test.webFunctions().click(test, incidentDetails.dropdownValue_AM);
        test.webFunctions().click(test,incidentDetails.button_VehicleInvolved,test.getTestData("IncidentDetails.VehicleInvolved"));

        test.webFunctions().click(test, incidentDetails.button_Next);
        test.getLogger().info("Incident Details Info entered, navigating to Vehicle Details Page...");
     }
	
	public void fillIncidentDetails_WithoutLogin(Testing test){
		test.setPage(IncidentDetails.class);
        IncidentDetails incidentDetails = (IncidentDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().staticWait(2000);
        test.webFunctions().type(test, incidentDetails.textbox_PolicyNumber, test.getOutput("Policy Number"));
        test.getLogger().info("Incidate Date :"+test.getDate(test.getOutput("Effective Date")));
        test.webFunctions().type(test, incidentDetails.textbox_IncidentDate, test.getDate(test.getOutput("Effective Date")));
        test.webFunctions().type(test, incidentDetails.textbox_IncidentTime,  "1200");
        test.webFunctions().click(test, incidentDetails.dropdown_AMPM);
        test.webFunctions().click(test, incidentDetails.dropdownValue_AM);
        test.webFunctions().click(test,incidentDetails.button_VehicleInvolved,test.getTestData("IncidentDetails.VehicleInvolved"));

        test.webFunctions().click(test, incidentDetails.button_Next);
        test.getLogger().info("Incident Details Info entered, navigating to Vehicle Details Page...");

     }
	public void incidentDate_FutureDate(Testing test) {
		test.setPage(IncidentDetails.class);
        IncidentDetails incidentDetails = (IncidentDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, incidentDetails.textbox_PolicyNumber, test.getOutput("Policy Number"));
		test.webFunctions().type(test,incidentDetails.textbox_IncidentDate,test.getDate(2));
		test.webFunctions().type(test, incidentDetails.textbox_IncidentTime,  "1200");
        test.webFunctions().click(test, incidentDetails.dropdown_AMPM);
        test.webFunctions().click(test, incidentDetails.dropdownValue_AM);
        test.webFunctions().click(test,incidentDetails.button_VehicleInvolved,test.getTestData("IncidentDetails.VehicleInvolved"));
	}
	public void incidentDate_OutEffect(Testing test) {
		test.setPage(IncidentDetails.class);
        IncidentDetails incidentDetails = (IncidentDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, incidentDetails.textbox_PolicyNumber, test.getOutput("Policy Number"));
		test.webFunctions().type(test,incidentDetails.textbox_IncidentDate,test.getLessDate(test.getOutput("Effective Date")));
		test.webFunctions().type(test, incidentDetails.textbox_IncidentTime,  "1200");
        test.webFunctions().click(test, incidentDetails.dropdown_AMPM);
        test.webFunctions().click(test, incidentDetails.dropdownValue_AM);
        test.webFunctions().click(test,incidentDetails.button_VehicleInvolved,test.getTestData("IncidentDetails.VehicleInvolved"));
        test.webFunctions().click(test, incidentDetails.button_Next);
	}
	public void verifyErrorMessage(Testing test){
		String ActualErrorMessage;
        test.setPage(IncidentDetails.class);
        IncidentDetails incidentDetails = (IncidentDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().staticWait(20);
        ActualErrorMessage = test.webFunctions().readInfo(test, incidentDetails.error_IncidentDate);
        test.getLogger().info("Actual Error Message : " + ActualErrorMessage);
        assertTrue(ActualErrorMessage.equals(test.getTestData("IncidentDetails.ExpectedErrorMessage")));		
        test.getLogger().info("Assertion Passed, error text is correct...");
     }

     public void fourVehicleClaimMessage(Testing test){
    	 String ActualErrorMessage;
         test.setPage(IncidentDetails.class);
         IncidentDetails incidentDetails = (IncidentDetails) PageFactory.initElements(test.driver, test.getPage());
         ActualErrorMessage = test.webFunctions().readInfo(test, incidentDetails.FourVehicle_ClaimMesssage);
         test.getLogger().info("Actual Error Message : " + ActualErrorMessage);
         assertTrue(ActualErrorMessage.equals(test.getTestData("IncidentDetails.ExpectedClaimMessage")));
         test.getLogger().info("Assertion Passed, error text is correct...");


     }
   

}
