package SharedTC;

import ApplicationPages.WitnessesAndPolice;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_WitnessPolice {

	public void witnessPolice(Testing test) {
		test.setPage(WitnessesAndPolice.class);
		WitnessesAndPolice witnessPolice = (WitnessesAndPolice) PageFactory.initElements(test.driver, test.getPage());

		test.webFunctions().click(test, witnessPolice.btn_WitnessesYes);

		test.webFunctions().type(test, witnessPolice.textbox_FirstName, test.getTestData("WitnessPolice.FirstName"));
		test.webFunctions().type(test, witnessPolice.textbox_LastName, test.getTestData("WitnessPolice.LastName"));
		test.webFunctions().type(test, witnessPolice.textbox_Address, test.getTestData("WitnessPolice.Address"));
		test.webFunctions().type(test, witnessPolice.textbox_City, test.getTestData("WitnessPolice.City"));
		test.webFunctions().click(test, witnessPolice.dropdown_State);
		test.webFunctions().click(test, witnessPolice.dropdown_StateName, test.getTestData("WitnessPolice.StateName"));
		test.webFunctions().type(test, witnessPolice.textbox_PostalCode, test.getTestData("WitnessPolice.PostalCode"));
		test.webFunctions().type(test, witnessPolice.textbox_Phone, test.getTestData("WitnessPolice.Phone"));
		test.webFunctions().type(test, witnessPolice.textbox_Email, test.getTestData("WitnessPolice.Email"));
		test.webFunctions().click(test, witnessPolice.btn_PoliceContactedYes);

		test.webFunctions().type(test, witnessPolice.textbox_OfficerName,
				test.getTestData("WitnessPolice.OfficerName"));
		test.webFunctions().type(test, witnessPolice.textbox_ReportNumber,
				test.getTestData("WitnessPolice.ReportNumber"));
		test.webFunctions().click(test, witnessPolice.btn_Next);
		test.getLogger().info("Added witness and police details.");
	}

	public void witnessPolice_No(Testing test) {
		test.setPage(WitnessesAndPolice.class);
		WitnessesAndPolice witnessPolice = (WitnessesAndPolice) PageFactory.initElements(test.driver, test.getPage());

		test.webFunctions().click(test, witnessPolice.btn_WitnessesNo);
		test.webFunctions().click(test, witnessPolice.btn_PoliceContactedNo);
		test.webFunctions().click(test, witnessPolice.btn_Next);
		test.getLogger().info("Added witness and police details.");
	}
}