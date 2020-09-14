package SharedTC;

import ApplicationPages.DriverPassenger;
import ApplicationPages.IncidentDetails;
import ApplicationPages.MoreDetails;

import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_DriverPassenger {

	public void D0P0V0(Testing test) {
		test.setPage(DriverPassenger.class);
		DriverPassenger driverPassenger = (DriverPassenger) PageFactory.initElements(test.driver,
				test.getPage());
		
		
		test.webFunctions().click(test, driverPassenger.btn_DriverAtIncdident_NO);
		test.webFunctions().click(test, driverPassenger.btn_Passenger_NO);
		test.webFunctions().click(test, driverPassenger.btn_anotherVehicleInvolved_NO);
		test.webFunctions().click(test, driverPassenger.btn_Next);
		test.getLogger().info("Entered Passenger Details.");
	}
}