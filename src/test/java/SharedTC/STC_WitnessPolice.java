package SharedTC;
import ApplicationPages.WitnessesAndPolice;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_WitnessPolice {

	public void witnessPolice(Testing test) {
		test.setPage(WitnessesAndPolice.class);
		WitnessesAndPolice witnessPolice = (WitnessesAndPolice) PageFactory.initElements(test.driver,
				test.getPage());

		test.webFunctions().click(test, witnessPolice.btn_WitnessesNo);
		test.webFunctions().click(test, witnessPolice.btn_PoliceContactedNo);
		test.webFunctions().click(test, witnessPolice.btn_Next);
		test.getLogger().info("Added witness and police details.");
	}
}