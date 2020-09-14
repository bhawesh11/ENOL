package SharedTC;

import ApplicationPages.IncidentDetails;
import ApplicationPages.MoreDetails;

import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_MoreDetails {

	public void moreDetails(Testing test) {
		test.setPage(MoreDetails.class);
		MoreDetails moreDetails = (MoreDetails) PageFactory.initElements(test.driver,
				test.getPage());
		
		test.webFunctions().type(test, moreDetails.textBox_FirstName,"Raju");
		test.webFunctions().type(test, moreDetails.textBox_LastName,"FreeVastav");
		test.webFunctions().type(test, moreDetails.textBox_DateOfBirth,"11/11/1999");
		test.webFunctions().type(test, moreDetails.textBox_Phone,"888-888-8888");
		test.webFunctions().type(test, moreDetails.textBox_Email,"rajuFreeVastav@elephant.com");
		test.webFunctions().dropdown(test, moreDetails.dropDown_RelationshipToInsured,"Relative");
		test.webFunctions().click(test, moreDetails.dropDown_OtherLocation);
		test.webFunctions().type(test, moreDetails.textBox_Address,"VIP Park");
		test.webFunctions().type(test, moreDetails.textBox_City,"Boston");
		test.webFunctions().dropdown(test, moreDetails.textBox_State,"AR");
		test.webFunctions().type(test, moreDetails.textBox_PostalCode,"71603");
		test.webFunctions().type(test, moreDetails.textBox_IncidentDescription,"Aisi-Taisi Ho Gayi Gaadi Ki.");
		test.webFunctions().click(test, moreDetails.btn_Next);
		test.getLogger().info("Entered Incident details");
	}
}