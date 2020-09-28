package SharedTC;

import ApplicationPages.WitnessPolice;

import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_WitnessPolice {

	public void witnessPolice(Testing test) {
		test.setPage(WitnessPolice.class);
		WitnessPolice witnessPolice = (WitnessPolice) PageFactory.initElements(test.driver,
				test.getPage());

		test.webFunctions().click(test, witnessPolice.btn_Witness_NO);
		test.webFunctions().click(test, witnessPolice.btn_PoliceContacted_NO);
		test.webFunctions().click(test, witnessPolice.btn_Next);
		test.getLogger().info("Added witness and police details.");
	}
}