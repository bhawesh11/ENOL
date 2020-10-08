package testElephant;

import SharedTC.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.Testing;
import java.io.IOException;

//import SharedTC.QuoteAndBind;
public class TC_Elephant {

	Logger log = Logger.getLogger("Test Suite");
	private final String brandName = "Elephant";

	// ==============================================================================================
	//								 *** ADDITIONAL METHODS ***

	@BeforeSuite
	public void openBrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
	}

	// ==============================================================================================
	// Creating Objects :


	STC_WitnessPolice stc_WitnessPolice = new STC_WitnessPolice();

	
	// ==============================================================================================
//	***_TEST_CASES_***


	// TC001
	@Test(enabled = true, priority = 5, description = "Simple Claim")
	@Parameters("ENV")
	public void TC001(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "SimpleClaim");
		try {

			stc_WitnessPolice.witnessPolice(test);
		} catch (Throwable e) {
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC001 method

	// ---------------------------------------------------------------------------------------

}
