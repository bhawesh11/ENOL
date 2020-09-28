package SharedTC;

import ApplicationPages.ElephantVehicleDetails;
import ApplicationPages.IncidentDetails;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_ElephantVehicleDetails {

	
	
	public void hail(Testing test) {
		test.setPage(ElephantVehicleDetails.class);
		ElephantVehicleDetails elephantVehicleDetails = (ElephantVehicleDetails) PageFactory.initElements(test.driver,
				test.getPage());
		
		test.webFunctions().type(test, elephantVehicleDetails.textBox_VIN, "1g1pc5sh4b7175473");
		test.webFunctions().click(test, elephantVehicleDetails.dropdown_WhatHappened, "Hail");
		test.webFunctions().click(test, elephantVehicleDetails.btn_Drivable_YES);
		test.webFunctions().click(test, elephantVehicleDetails.btn_Towed_NO);
		test.webFunctions().click(test, elephantVehicleDetails.btn_airbagsDeployed_NO);
		test.webFunctions().click(test, elephantVehicleDetails.btn_Next);
		test.getLogger().info("Entered Loss Reason of Elephant vehicle.");
	}
	
	public void flood(Testing test) {
		test.setPage(ElephantVehicleDetails.class);
		ElephantVehicleDetails elephantVehicleDetails = (ElephantVehicleDetails) PageFactory.initElements(test.driver,
				test.getPage());
		
		test.webFunctions().type(test, elephantVehicleDetails.textBox_VIN, "1g1pc5sh4b7175473");
		test.webFunctions().click(test, elephantVehicleDetails.dropdown_WhatHappened, "Flood");
		test.webFunctions().click(test, elephantVehicleDetails.btn_Drivable_YES);
		test.webFunctions().click(test, elephantVehicleDetails.btn_Towed_NO);
		test.webFunctions().click(test, elephantVehicleDetails.btn_airbagsDeployed_NO);
		test.webFunctions().click(test, elephantVehicleDetails.btn_Next);
		test.getLogger().info("Entered Loss Reason of Elephant vehicle.");
	}
	
	public void collision(Testing test) {
		test.setPage(ElephantVehicleDetails.class);
		ElephantVehicleDetails elephantVehicleDetails = (ElephantVehicleDetails) PageFactory.initElements(test.driver,
				test.getPage());
		
		test.webFunctions().type(test, elephantVehicleDetails.textBox_VIN, "1g1pc5sh4b7175473");
		test.webFunctions().click(test, elephantVehicleDetails.dropdown_WhatHappened, "Flood");
		test.webFunctions().click(test, elephantVehicleDetails.btn_Drivable_YES);
		test.webFunctions().click(test, elephantVehicleDetails.btn_Towed_NO);
		test.webFunctions().click(test, elephantVehicleDetails.btn_airbagsDeployed_NO);
		test.webFunctions().click(test, elephantVehicleDetails.btn_Next);
		test.getLogger().info("Entered Loss Reason of Elephant vehicle.");
	}
}