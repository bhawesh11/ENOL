package testApparent;

import SharedTC.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.Testing;
import java.io.IOException;

//import SharedTC.QuoteAndBind;
public class TC_Apparent {

	Logger log = Logger.getLogger("Test Suite");
	private final String brandName = "Apparent";

	// ==============================================================================================
	//								 *** ADDITIONAL METHODS ***

	@BeforeSuite
	public void openBrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
	}

	// ==============================================================================================
	// Creating Objects :
	STC_IncidentDetails stc_IncidentDetails = new STC_IncidentDetails();
	STC_MoreDetails stc_MoreDetails = new STC_MoreDetails();
	STC_ElephantVehicleDetails stc_ElephantVehicleDetails = new STC_ElephantVehicleDetails();
	STC_DriverPassenger stc_DriverPassenger = new STC_DriverPassenger();
	STC_WitnessPolice stc_WitnessPolice = new STC_WitnessPolice();
	STC_MyContactInformation stc_MyContactInformation=new STC_MyContactInformation();
	STC_Thanks stc_Thanks =new STC_Thanks();
	
	// ==============================================================================================
//	***_TEST_CASES_***


	// TC001
	@Test(enabled = true, priority = 5, description = "Simple Claim")
	@Parameters("ENV")
	public void TC501(String ENV) {

		Testing test = new Testing(ENV, brandName, "SimpleClaim");
		try {
			stc_IncidentDetails.incidentDetails(test);
			stc_MoreDetails.moreDetails(test);
			stc_ElephantVehicleDetails.hail(test);
			stc_DriverPassenger.D0P0V0(test);
			stc_WitnessPolice.witnessPolice(test);
			stc_MyContactInformation.myContactInformation(test);
			stc_Thanks.saveClaimNumber(test);
		} catch (Throwable e) {
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC001 method

	// ---------------------------------------------------------------------------------------

}