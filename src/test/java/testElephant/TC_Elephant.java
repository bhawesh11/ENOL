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
	STC_AnotherVehicleInvolved stc_anotherVehicleInvolved = new STC_AnotherVehicleInvolved();
	STC_LaunchPage stc_launchPage = new STC_LaunchPage();
	STC_WitnessPolice stc_WitnessPolice = new STC_WitnessPolice();
	STC_TellUsMore stc_tellUsMore = new STC_TellUsMore();
	STC_LaunchPage stc_launchpage = new STC_LaunchPage();
	STC_GlassClaimMessage stc_glassclaimmessage = new STC_GlassClaimMessage();


	
	// ==============================================================================================
//	***_TEST_CASES_***


	// TC001
	@Test(enabled = true, priority = 5, description = "Create_Claim_With_Login")
	@Parameters("ENV")
	public void TC001(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "Create_Claim_With_Login", "1D1V" );
		try {

			stc_launchPage.clickLogin(test);
			stc_login.login(test);
			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_Login(test);
			stc_tellUsMore.TellUsMore_withLogin(test);
			stc_vehicleDetails.vehicleInvolved_Login(test);
			stc_driverPassengerDetails.driverPresent(test);
			stc_driverPassengerDetails.passengerNotPresent(test);
			stc_driverPassengerDetails.anotherVehicleNotInvolved(test);
			stc_WitnessPolice.witnessPolice_No(test);
			stc_contactInformation.contactInformationPage(test);
			stc_thankyouPage.getClaimNo(test);
		} catch (Throwable e) {
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC001 method

	// --------------------------------------------------------------------------------------

	//TC002
	@Test(enabled= true,priority = 5, description="Verify Four Vehicle Termination")
	@Parameters("ENV")
	public void TC002(String ENV) throws Throwable {
		Testing test= new Testing(ENV, brandName,"VerifyFourVehicleTermination", "1D1V" );
		try{
			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_WithoutLogin(test);
			stc_incidentDetails.fourVehicleClaimMessage(test);
			stc_launchPage.clickHomeButton(test);

		} catch (Throwable e) {
			throw (e);
		} finally {
			test.tearDown();
		}
	}
	// closing TC002 method

	// --------------------------------------------------------------------------------------

	//TC003
	@Test(enabled= true,priority = 5, description="Create Claim Without VIN")
	@Parameters("ENV")
	public void TC003(String ENV) throws Throwable {
		Testing test= new Testing(ENV, brandName,"CreateClaimWithoutVIN", "1D1V" );
		try{
			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_WithoutLogin(test);
			stc_tellUsMore.TellUsMore_WithoutLogin(test);
			stc_vehicleDetails.vehicleInvolvedWithoutVin(test);
			stc_driverPassengerDetails.driverNotPresent(test);
			stc_driverPassengerDetails.passengerNotPresent(test);
			stc_driverPassengerDetails.anotherVehicleNotInvolved(test);
			stc_WitnessPolice.witnessPolice(test);
			stc_contactInformation.contactInformationPage(test);
			stc_thankyouPage.getClaimNo(test);
		} catch (Throwable e) {
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC003 method

	// --------------------------------------------------------------------------------------
	@Test(enabled = true, priority = 5, description = "Create_Claim_without_login")
	@Parameters("ENV")
	public void TC004(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "Create_Claim_without_login", "1D1V" );
		try {

			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_WithoutLogin(test);
			stc_tellUsMore.TellUsMore_WithoutLogin(test);
			stc_vehicleDetails.vehicleInvolvedWithoutVin(test);
			stc_driverPassengerDetails.driverPresent(test);
			stc_driverPassengerDetails.passengerNotPresent(test);
			stc_driverPassengerDetails.anotherVehicleNotInvolved(test);
			stc_WitnessPolice.witnessPolice_No(test);
			stc_contactInformation.contactInformationPage(test);
			stc_thankyouPage.getClaimNo(test);
		} catch (Throwable e) {
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC004 method

	// --------------------------------------------------------------------------------------
	//TC005
	@Test(enabled= true,priority = 5, description="WithVIN")
	@Parameters("ENV")
	public void TC005(String ENV) throws Throwable {
		Testing test= new Testing(ENV, brandName,"VIN/WithoutVIN", "1D1V" );
		try{
			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_WithoutLogin(test);
			stc_tellUsMore.TellUsMore_WithoutLogin(test);
			stc_vehicleDetails.vehicleInvolvedWithVin(test);
			stc_driverPassengerDetails.driverNotPresent(test);
			stc_driverPassengerDetails.passengerNotPresent(test);
			stc_driverPassengerDetails.anotherVehicleNotInvolved(test);
			stc_WitnessPolice.witnessPolice(test);
			stc_contactInformation.contactInformationPage(test);
			stc_thankyouPage.getClaimNo(test);

		} catch (Throwable e) {
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC005 method

	// --------------------------------------------------------------------------------------

    //TC006
    @Test(enabled = true, priority = 5, description = "Verify Glass Claim Message")
    @Parameters("ENV")
    public void TC006(String ENV) throws Throwable {

        Testing test = new Testing(ENV, brandName, "VerifyGlassClaimMessage", "1D1V" );
        try {
        	stc_launchpage.clickGlassOnlyClaims(test);
        	stc_glassclaimmessage.verifyGlassClaimMessage(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC006 method

	// --------------------------------------------------------------------------------------
	//TC007
    @Test(enabled = true, priority = 5, description = "Verify Duplicate Claim")
    @Parameters("ENV")
    public void TC007(String ENV) throws Throwable {

    Testing test = new Testing(ENV, brandName, "VerifyDuplicateClaim", "1D1V" );
    try {
    	stc_launchpage.clickAllOtherClaims(test);
    	stc_incidentDetails.fillIncidentDetails_WithoutLogin(test);
    	stc_incidentDetails.verifyErrorMessage(test);
    } catch (Throwable e) {
        throw (e);
    } finally {
        test.tearDown();
    }
}//closing TC007 method
	// --------------------------------------------------------------------------------------

	//	TC008
    @Test(enabled = true, priority = 5, description = "Verify Glass Claim Message")
    @Parameters("ENV")
    public void TC008(String ENV) throws Throwable {

        Testing test = new Testing(ENV, brandName, "VerifyGlassClaimMessageWithLogin", "1D1V" );
        try {
        	stc_launchpage.clickLogin(test);
        	stc_login.login(test);
        	stc_launchpage.clickGlassOnlyClaims(test);
        	stc_glassclaimmessage.verifyGlassClaimMessage(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC008 method
	// --------------------------------------------------------------------------------------

	//TC009
    @Test(enabled = true, priority = 5, description = "Verify Duplicate Claim")
    @Parameters("ENV")
    public void TC009(String ENV) throws Throwable {

    Testing test = new Testing(ENV, brandName, "VerifyDuplicateClaimWithLogin", "1D1V" );
    try {
    	stc_launchpage.clickLogin(test);
    	stc_login.login(test);
    	stc_launchpage.clickAllOtherClaims(test);
    	stc_incidentDetails.fillIncidentDetails_Login(test);
    	stc_incidentDetails.verifyErrorMessage(test);
    } catch (Throwable e) {
        throw (e);
    } finally {
        test.tearDown();
    }
}//closing TC009 method
	// --------------------------------------------------------------------------------------

	//TC0010
	@Test(enabled= true,priority = 5, description="IncidentDate_Future")
	@Parameters("ENV")
	public void TC0010(String ENV) throws Throwable {
		Testing test= new Testing(ENV, brandName,"IncidentDate_Future", "1D1V" );
		try{
			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_WithoutLogin(test);
			stc_incidentDetails.verifyErrorMessage(test);
			
		} catch (Throwable e) {
			throw (e);
		} finally {
			test.tearDown();
		}
	}
	// closing TC0010 method

	// --------------------------------------------------------------------------------------

	//TC011
	@Test(enabled= true,priority = 5, description="IncidentDate_Out_Effective")
	@Parameters("ENV")
	public void TC011(String ENV) throws Throwable {
		Testing test= new Testing(ENV, brandName,"IncidentDate_Out_Effective", "1D1V" );
		try{			
			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_WithoutLogin(test);
			stc_incidentDetails.verifyErrorMessage(test);
			
		} catch (Throwable e) {
			throw (e);
		} finally {
			test.tearDown();
		}
	}
	// closing TC011 method
	// --------------------------------------------------------------------------------------

	//TC0012
	@Test(enabled= true,priority = 5, description="Create Claim With Max Details")
	@Parameters("ENV")
	public void TC012(String ENV) throws Throwable {
		Testing test= new Testing(ENV, brandName,"CreateClaimWithMaxDetails", "1D1V" );
		try{
			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_WithoutLogin(test);
			stc_tellUsMore.TellUsMore_WithoutLogin(test);
			stc_vehicleDetails.vehicleInvolvedWithVin(test);
			stc_driverPassengerDetails.driverPresent(test);
			stc_driverPassengerDetails.maxPassengerWarningMessage(test);
			stc_driverPassengerDetails.addLastPassengerDetails(test);
			stc_anotherVehicleInvolved.maxVehicleWarningMessage(test);
			stc_anotherVehicleInvolved.anotherVehicleNo(test);
			stc_WitnessPolice.witnessPolice(test);
			stc_contactInformation.contactInformationPage(test);
			stc_thankyouPage.getClaimNo(test);
		} catch (Throwable e) {
			throw (e);
		} finally {
			test.tearDown();
		}
	
	}// closing TC012 method
	// --------------------------------------------------------------------------------------

	//TC013
	@Test(enabled= true,priority = 5, description="Max Passenger")
	@Parameters("ENV")
	public void TC013(String ENV) throws Throwable {
		Testing test= new Testing(ENV, brandName,"VerifyMaxPassengerLimit", "1D1V" );
		try{
			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_WithoutLogin(test);
			stc_tellUsMore.TellUsMore_WithoutLogin(test);
			stc_vehicleDetails.vehicleInvolvedWithVin(test);
			stc_driverPassengerDetails.driverNotPresent(test);
			stc_driverPassengerDetails.maxPassengerWarningMessage(test);
			stc_launchPage.clickHomeButton(test);

		} catch (Throwable e) {
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC013method
	
	//----------------------------------------------------------------------------------------
	//TC014
	@Test(enabled= true,priority = 5, description="Max Vehicle Alert")
	@Parameters("ENV")
	public void TC014(String ENV) throws Throwable {
		Testing test= new Testing(ENV, brandName,"VerifyMaxVehicleLimit", "1D1V" );
		try{
			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_WithoutLogin(test);
			stc_tellUsMore.TellUsMore_WithoutLogin(test);
			stc_vehicleDetails.vehicleInvolvedWithVin(test);
			stc_driverPassengerDetails.driverNotPresent(test);
			stc_driverPassengerDetails.passengerNotPresent(test);
			stc_anotherVehicleInvolved.maxVehicleWarningMessage(test);
			stc_launchPage.clickHomeButton(test);
		} catch (Throwable e) {
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC014 method

}

