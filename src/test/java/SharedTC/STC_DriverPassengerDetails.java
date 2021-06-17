package SharedTC;

import ApplicationPages.AnotherVehicleInvolved;
import ApplicationPages.DriverPassengerDetails;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

import static org.testng.Assert.assertTrue;

public class STC_DriverPassengerDetails {

	public void driverPresent(Testing test) {
		test.setPage(DriverPassengerDetails.class);
		DriverPassengerDetails driverPassengerDetails = (DriverPassengerDetails) PageFactory.initElements(test.driver,test.getPage());
		test.webFunctions().staticWait(4000);
		test.webFunctions().click(test, driverPassengerDetails.btn_DriverPresent,
				test.getTestData("DriversPassenger.DriverPresent"));
		try {
			if (driverPassengerDetails.btn_SelectDriverName.isDisplayed() == true) {
				test.webFunctions().click(test, driverPassengerDetails.btn_SelectDriverName);
			}
		} catch (Exception e) {
		}

		try {
			if (driverPassengerDetails.textbox_DriverFirstName.isDisplayed() == true) {
				test.webFunctions().click(test, driverPassengerDetails.btn_DriverAsPolicyHolder,
						test.getTestData("DriversPassenger.DriverAsPolicyHolder"));
				test.webFunctions().type(test, driverPassengerDetails.textbox_DriverFirstName,
						test.getTestData("DriversPassenger.FirstName"));
				test.webFunctions().type(test, driverPassengerDetails.textbox_DriverLastName,
						test.getTestData("DriversPassenger.LastName"));
				test.webFunctions().type(test, driverPassengerDetails.textbox_DriverDOB,
						test.getTestData("DriversPassenger.DOB"));
				test.webFunctions().type(test, driverPassengerDetails.textbox_DriverAddress,
						test.getTestData("DriversPassenger.Address"));
				test.webFunctions().type(test, driverPassengerDetails.textbox_DriverCity,
						test.getTestData("DriversPassenger.City"));
				test.webFunctions().click(test, driverPassengerDetails.dropdown_DriverState);
				test.webFunctions().click(test, driverPassengerDetails.dropdown_PassengerStateName,
						test.getTestData("DriversPassenger.StateName"));
				test.webFunctions().type(test, driverPassengerDetails.textbox_DriverPostalCode,
						test.getTestData("DriversPassenger.PostalCode"));
				test.webFunctions().type(test, driverPassengerDetails.textbox_DriverPhone,
						test.getTestData("DriversPassenger.Phone"));
				test.webFunctions().type(test, driverPassengerDetails.textbox_DriverPostalCode,
						test.getTestData("DriversPassenger.PostalCode"));
			}
		} catch (Exception e) {
		}

		test.webFunctions().click(test, driverPassengerDetails.btn_DriverInjuredYes);
		test.webFunctions().type(test, driverPassengerDetails.textarea_DriverInjuryDescription,
				test.getTestData("DriversPassenger.InjuryDescription"));
	}

	public void driverNotPresent(Testing test) {
		test.setPage(DriverPassengerDetails.class);
		DriverPassengerDetails driverPassengerDetails = (DriverPassengerDetails) PageFactory.initElements(test.driver,test.getPage());
		test.webFunctions().click(test, driverPassengerDetails.btn_DriverPresent,
				test.getTestData("DriversPassenger.DriverPresent"));
	}

	public void passengerNotPresent(Testing test) {
		test.setPage(DriverPassengerDetails.class);
		DriverPassengerDetails driverPassengerDetails = (DriverPassengerDetails) PageFactory.initElements(test.driver,test.getPage());
		test.webFunctions().click(test, driverPassengerDetails.btn_PassengerPresent,
				test.getTestData("DriversPassenger.PassengerPresent"));
	}

	public void maxPassengerWarningMessage(Testing test) {
		test.setPage(DriverPassengerDetails.class);
		DriverPassengerDetails driverPassengerDetails = (DriverPassengerDetails) PageFactory.initElements(test.driver,test.getPage());
		test.webFunctions().click(test, driverPassengerDetails.btn_PassengerPresent,
				test.getTestData("DriversPassenger.PassengerPresent"));
		for (int i = 1; i <= 8; i++) {
			try {
				if (driverPassengerDetails.btn_WarningOK.isDisplayed()) {
					String ActualErrorMessage;
					ActualErrorMessage = test.webFunctions().readInfo(test, driverPassengerDetails.text_WarningMessage);
					test.getLogger().info("Actual Error Message : " + ActualErrorMessage);
					assertTrue(ActualErrorMessage.equals(test.getTestData("MaxPassenger.ExpectedErrorMessage")));
					test.getLogger().info("Assertion Passed, error text is correct...");
					test.webFunctions().click(test, driverPassengerDetails.btn_WarningOK);
					break;
				}
			} catch (Exception e) {
			}
			System.out.println(Integer.toString(i));
			test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerFirstName, Integer.toString(i),
					test.getTestData("DriversPassenger.Passenger" + i + ".FirstName"));
			test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerLastName, Integer.toString(i),
					test.getTestData("DriversPassenger.Passenger" + i + ".LastName"));
			test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerDOB, Integer.toString(i),
					test.getTestData("DriversPassenger.Passenger" + i + ".DOB"));
			test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerAddress, Integer.toString(i),
					test.getTestData("DriversPassenger.Passenger" + i + ".Address"));
			test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerCity, Integer.toString(i),
					test.getTestData("DriversPassenger.Passenger" + i + ".City"));
			test.webFunctions().click(test, driverPassengerDetails.dropdown_PassengerState, Integer.toString(i));
			test.webFunctions().click(test, driverPassengerDetails.dropdown_PassengerStateName,
					test.getTestData("DriversPassenger.Passenger" + i + ".StateName"));
			test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerPostalCode, Integer.toString(i),
					test.getTestData("DriversPassenger.Passenger" + i + ".PostalCode"));
			test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerPhone, Integer.toString(i),
					test.getTestData("DriversPassenger.Passenger" + i + ".Phone"));
			test.webFunctions().click(test, driverPassengerDetails.btn_PassengerInjuredNo, Integer.toString(i));
			test.webFunctions().click(test, driverPassengerDetails.btn_AddAnotherPassenger);
		}
	}

	public void anotherVehicleNotInvolved(Testing test) {
		test.setPage(DriverPassengerDetails.class);
		DriverPassengerDetails driverPassengerDetails = (DriverPassengerDetails) PageFactory.initElements(test.driver,test.getPage());
		test.webFunctions().click(test, driverPassengerDetails.btn_AnotherVehicleInvolved,
				test.getTestData("DriversPassenger.VehicleInvolved"));
		test.webFunctions().click(test, driverPassengerDetails.btn_Next);
	}

	public void anotherVehicleInvolved(Testing test) {
		test.setPage(AnotherVehicleInvolved.class);
		test.setPage(DriverPassengerDetails.class);
		AnotherVehicleInvolved anotherVehicleInvolved = (AnotherVehicleInvolved) PageFactory.initElements(test.driver,test.getPage());
		DriverPassengerDetails driverPassengerDetails = (DriverPassengerDetails) PageFactory.initElements(test.driver,test.getPage());

		test.webFunctions().click(test, driverPassengerDetails.btn_AnotherVehicleInvolved,
				test.getTestData("DriversPassenger.VehicleInvolved"));
		test.webFunctions().type(test, anotherVehicleInvolved.textbox_VinNo, test.getTestData("DriversPassenger.VIN"));
		test.webFunctions().type(test, anotherVehicleInvolved.textbox_LicensePlateNumber,
				test.getTestData("DriversPassenger.PlateNumber"));
		test.webFunctions().click(test, anotherVehicleInvolved.dropdown_StateRegistered);
		test.webFunctions().click(test, anotherVehicleInvolved.dropdown_SelectState,
				test.getTestData("DriversPassenger.SelectState"));
		test.webFunctions().click(test, anotherVehicleInvolved.btn_MostDamage,
				test.getTestData("DriversPassenger.MostDamaged"));
		test.webFunctions().click(test, anotherVehicleInvolved.btn_Drivable,
				test.getTestData("DriversPassenger.Drivable"));
		test.webFunctions().click(test, anotherVehicleInvolved.btn_Towed, test.getTestData("DriversPassenger.Towed"));
		test.webFunctions().click(test, anotherVehicleInvolved.btn_AirbagsDeployed,
				test.getTestData("DriversPassenger.AirbagsDeployed"));
		test.webFunctions().click(test, anotherVehicleInvolved.btn_Next);
		// test.webFunctions().click(test,anotherVehicleInvolved.btn_DriverPresent);
		test.webFunctions().click(test, driverPassengerDetails.btn_PassengerPresent,
				test.getTestData("DriversPassenger.PassengerPresent"));
		test.webFunctions().click(test, driverPassengerDetails.btn_AnotherVehicleInvolved,
				test.getTestData("DriversPassenger.VehicleInvolved"));
	}

	public void addLastPassengerDetails(Testing test) {
		test.setPage(DriverPassengerDetails.class);
		DriverPassengerDetails driverPassengerDetails = (DriverPassengerDetails) PageFactory.initElements(test.driver,test.getPage());
		int i = 8;
		test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerFirstName, Integer.toString(i),
				test.getTestData("DriversPassenger.Passenger" + i + ".FirstName"));
		test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerLastName, Integer.toString(i),
				test.getTestData("DriversPassenger.Passenger" + i + ".LastName"));
		test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerDOB, Integer.toString(i),
				test.getTestData("DriversPassenger.Passenger" + i + ".DOB"));
		test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerAddress, Integer.toString(i),
				test.getTestData("DriversPassenger.Passenger" + i + ".Address"));
		test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerCity, Integer.toString(i),
				test.getTestData("DriversPassenger.Passenger" + i + ".City"));
		test.webFunctions().click(test, driverPassengerDetails.dropdown_PassengerState, Integer.toString(i));
		test.webFunctions().click(test, driverPassengerDetails.dropdown_PassengerStateName,
				test.getTestData("DriversPassenger.Passenger" + i + ".StateName"));
		test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerPostalCode, Integer.toString(i),
				test.getTestData("DriversPassenger.Passenger" + i + ".PostalCode"));
		test.webFunctions().type(test, driverPassengerDetails.textbox_PassengerPhone, Integer.toString(i),
				test.getTestData("DriversPassenger.Passenger" + i + ".Phone"));
		test.webFunctions().click(test, driverPassengerDetails.btn_PassengerInjuredNo, Integer.toString(i));

	}

}