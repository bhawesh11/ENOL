package SharedTC;

import ApplicationPages.IncidentDetails;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_IncidentDetails {

	public void incidentDetails(Testing test) {
		test.setPage(IncidentDetails.class);
		IncidentDetails incidentDetails = (IncidentDetails) PageFactory.initElements(test.driver,
				test.getPage());
		
		test.webFunctions().click(test, incidentDetails.link_AllOtherClaim);
		test.webFunctions().type(test, incidentDetails.textBox_PolicyNumber,"247-000-000-02");
		String incidentDate = test.getDate(0);
		test.webFunctions().type(test, incidentDetails.textBox_IncidentDate, incidentDate);
		test.webFunctions().type(test, incidentDetails.textBox_IncidentTime, "01:01");
		test.webFunctions().dropdown(test, incidentDetails.dropDown_AMPM, incidentDetails.option_AM);
		test.webFunctions().click(test, incidentDetails.numberOfVehiclesInvolved, "1");
		test.webFunctions().click(test, incidentDetails.btn_Next);
		test.getLogger().info("Entered Incident details");
	}
}