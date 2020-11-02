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



	STC_ContactInformation stc_contactInformation = new STC_ContactInformation();
	STC_DriverPassengerDetails stc_driverPassengerDetails = new STC_DriverPassengerDetails();
	STC_GlassClaimMessage stc_glassClaimMessage = new STC_GlassClaimMessage();
	STC_IncidentDetails stc_incidentDetails= new STC_IncidentDetails();
	STC_Login stc_login = new STC_Login();
	STC_Register stc_register = new STC_Register();
	STC_TerminationPage stc_terminationPage = new STC_TerminationPage();
	STC_ThankyouPage stc_thankyouPage = new STC_ThankyouPage();
	STC_VehicleDetails stc_vehicleDetails = new STC_VehicleDetails();
	STC_LaunchPage stc_launchPage = new STC_LaunchPage();
	STC_WitnessPolice stc_WitnessPolice = new STC_WitnessPolice();
	STC_TellUsMore stc_tellUsMore = new STC_TellUsMore();


	
	// ==============================================================================================
//	***_TEST_CASES_***


	// TC001
	@Test(enabled = false, priority = 5, description = "Simple Claim")
	@Parameters("ENV")
	public void TC001(String ENV) {

		Testing test = new Testing(ENV, brandName, "SimpleClaim");
		try {

			stc_WitnessPolice.witnessPolice(test);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// closing TC001 method

	//TC002
	@Test(enabled= true,priority = 5, description="4V Claim")
	@Parameters("ENV")
	public void TC002(String ENV){
		Testing test= new Testing(ENV, brandName,"4VClaim");
		try{
			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_WithoutLogin(test);
			stc_incidentDetails.fourVehicleClaimMessage(test);
			stc_launchPage.clickHomeButton(test);

				} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// closing TC002 method

	// --------------------------------------------------------------------------------------

	//TC003
	@Test(enabled= false,priority = 5, description="4V Claim")
	@Parameters("ENV")
	public void TC003(String ENV){
		Testing test= new Testing(ENV, brandName,"");
		try{
			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_WithoutLogin(test);
			stc_tellUsMore.TellUsMore_WithoutLogin(test);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}// closing TC003 method

	// --------------------------------------------------------------------------------------
}
