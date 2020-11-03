package SharedTC;

import ApplicationPages.DriverPassengerDetails;
import ApplicationPages.AnotherVehicleInvolved;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_DriverPassengerDetails {

	public void driverPresent(Testing test){
	    test.setPage(DriverPassengerDetails.class);
	    DriverPassengerDetails driverPassengerDetails= (DriverPassengerDetails) PageFactory.initElements(test.driver, test.getPage());
	    test.webFunctions().staticWait(4000);
	    test.webFunctions().click(test,driverPassengerDetails.btn_DriverPresent,test.getTestData("DriversPassenger.DriverPresent"));
	    test.webFunctions().click(test,driverPassengerDetails.btn_DriverAsPolicyHolder,test.getTestData("DriversPassenger.DriverAsPolicyHolder"));
	    try{
	        if(driverPassengerDetails.textbox_DriverFirstName.isDisplayed()==true){
	            test.webFunctions().click(test,driverPassengerDetails.btn_DriverAsPolicyHolder,test.getTestData("DriversPassenger.DriverAsPolicyHolder"));
	        }
	    }catch (Exception e){ }
	    try{
	        if(driverPassengerDetails.textbox_DriverFirstName.isDisplayed()==true)
	        {
	            test.webFunctions().type(test,driverPassengerDetails.textbox_DriverFirstName,test.getTestData("DriversPassenger.FirstName"));
	            test.webFunctions().type(test,driverPassengerDetails.textbox_DriverLastName,test.getTestData("DriversPassenger.LastName"));
	            test.webFunctions().type(test,driverPassengerDetails.textbox_DriverDOB,test.getTestData("DriversPassenger.DOB"));
	            test.webFunctions().type(test,driverPassengerDetails.textbox_DriverAddress,test.getTestData("DriversPassenger.Address"));
	            test.webFunctions().type(test,driverPassengerDetails.textbox_DriverCity,test.getTestData("DriversPassenger.City"));
	            test.webFunctions().click(test,driverPassengerDetails.dropdown_DriverState);
	            test.webFunctions().click(test,driverPassengerDetails.dropdown_PassengerStateName,test.getTestData("DriversPassenger.StateName"));
	            test.webFunctions().type(test,driverPassengerDetails.textbox_DriverPostalCode,test.getTestData("DriversPassenger.PostalCode"));
	            test.webFunctions().type(test,driverPassengerDetails.textbox_DriverPhone,test.getTestData("DriversPassenger.Phone"));
	            test.webFunctions().type(test,driverPassengerDetails.textbox_DriverPostalCode,test.getTestData("DriversPassenger.PostalCode"));
	        }
	    }catch (Exception e){ }
	    test.webFunctions().click(test,driverPassengerDetails.btn_DriverInjuredYes);
	    test.webFunctions().type(test,driverPassengerDetails.textarea_DriverInjuryDescription,test.getTestData("DriversPassenger.InjuryDescription"));
	}

    public void driverNotPresent(Testing test)
    {
        test.setPage(DriverPassengerDetails.class);
        DriverPassengerDetails driverPassengerDetails= (DriverPassengerDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,driverPassengerDetails.btn_DriverPresent,test.getTestData("DriversPassenger.DriverPresent"));
    }

    public void passengerNotPresent(Testing test) {
        test.setPage(DriverPassengerDetails.class);
        DriverPassengerDetails driverPassengerDetails= (DriverPassengerDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,driverPassengerDetails.btn_PassengerPresent,test.getTestData("DriversPassenger.PassengerPresent"));
    }
    public void addPassenger(Testing test)
    {
        test.setPage(DriverPassengerDetails.class);
        DriverPassengerDetails driverPassengerDetails= (DriverPassengerDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,driverPassengerDetails.btn_PassengerPresent,test.getTestData("DriversPassenger.PassengerPresent"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerFirstName,test.getTestData("DriversPassenger.PassengerFirstName"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerLastName,test.getTestData("DriversPassenger.PassengerLastName"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerDOB,test.getTestData("DriversPassenger.PassengerDOB"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerAddress,test.getTestData("DriversPassenger.PassengerAddress"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerCity,test.getTestData("DriversPassenger.PassengerCity"));
        test.webFunctions().click(test,driverPassengerDetails.dropdown_PassengerState);
        test.webFunctions().click(test,driverPassengerDetails.dropdown_DriverStateName,test.getTestData("DriversPassenger.PassengerStateName"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerPostalCode,test.getTestData("DriversPassenger.PasengerPostalCode"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerPhone,test.getTestData("DriversPassenger.PassengerPhone"));
        test.webFunctions().click(test,driverPassengerDetails.btn_PassengerInjuredYes);
        test.webFunctions().type(test,driverPassengerDetails.textarea_PassengerInjuryDescription,test.getTestData("DriversPassenger.PassengerInjuryDescription"));
    }
    public void maxPassengerWarningMessage(Testing test)
    {
        test.setPage(DriverPassengerDetails.class);
        DriverPassengerDetails driverPassengerDetails= (DriverPassengerDetails) PageFactory.initElements(test.driver, test.getPage());
        for(int i=1;i<=8;i++)
        {
            test.webFunctions().click(test,driverPassengerDetails.btn_PassengerPresent,test.getTestData("DriversPassenger.PassengerPresent"+i+""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerFirstName,test.getTestData("DriversPassenger.PassengerFirstName"+i+""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerLastName,test.getTestData("DriversPassenger.PassengerLastName"+i+""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerDOB,test.getTestData("DriversPassenger.PassengerDOB"+i+""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerAddress,test.getTestData("DriversPassenger.PassengerAddress"+i+""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerCity,test.getTestData("DriversPassenger.PassengerCity"+i+""));
            test.webFunctions().click(test,driverPassengerDetails.dropdown_PassengerState);
            test.webFunctions().click(test,driverPassengerDetails.dropdown_DriverStateName,test.getTestData("DriversPassenger.PassengerStateName"+i+""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerPostalCode,test.getTestData("DriversPassenger.PassengerPostalCode"+i+""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerPhone,test.getTestData("DriversPassenger.PassengerPhone"+i+""));
            test.webFunctions().click(test,driverPassengerDetails.btn_PassengerInjuredNo);
            test.webFunctions().type(test,driverPassengerDetails.textarea_PassengerInjuryDescription,test.getTestData("DriversPassenger.PassengerInjuryDescription"+i+""));

        }
        }


    public void anotherVehicleNotInvolved(Testing test)
    {           
        test.setPage(DriverPassengerDetails.class);
        DriverPassengerDetails driverPassengerDetails= (DriverPassengerDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,driverPassengerDetails.btn_AnotherVehicleInvolved, test.getTestData("DriversPassenger.VehicleInvolved") );
        test.webFunctions().click(test,driverPassengerDetails.btn_Next);
    }
    public void anotherVehicleInvolved(Testing test)
    {
        test.setPage(AnotherVehicleInvolved.class);
        test.setPage(DriverPassengerDetails.class);
        AnotherVehicleInvolved anotherVehicleInvolved= (AnotherVehicleInvolved) PageFactory.initElements(test.driver, test.getPage());
        DriverPassengerDetails driverPassengerDetails= (DriverPassengerDetails) PageFactory.initElements(test.driver,test.getPage());
        test.webFunctions().type(test,anotherVehicleInvolved.textbox_VinNo,test.getTestData("DriversPassenger.VIN"));
        test.webFunctions().type(test,anotherVehicleInvolved.textbox_LicensePlateNumber,test.getTestData("DriversPassenger.PlateNumber"));
        test.webFunctions().click(test,anotherVehicleInvolved.dropdown_SelectState);
        test.webFunctions().click(test,anotherVehicleInvolved.dropdown_StateRegistered,test.getTestData("DriversPassenger.StateRegistered"));
        test.webFunctions().click(test,anotherVehicleInvolved.btn_MostDamage,test.getTestData("DriversPassenger.MostDamaged"));
        test.webFunctions().click(test,anotherVehicleInvolved.btn_Drivable,test.getTestData("DriversPassenger.Drivable"));
        test.webFunctions().click(test,anotherVehicleInvolved.btn_Towed,test.getTestData("DriversPassenger.Towed"));
        test.webFunctions().click(test,anotherVehicleInvolved.btn_AirbagsDeployed,test.getTestData("DriversPassenger.AirbagsDeployed"));
        test.webFunctions().click(test,anotherVehicleInvolved.btn_Next);
        test.webFunctions().click(test,driverPassengerDetails.btn_DriversAtTimeOfIncident);
        test.webFunctions().click(test,driverPassengerDetails.btn_PassengerPresent,test.getTestData("DriversPassenger.PassengerPresent"));
        test.webFunctions().click(test,driverPassengerDetails.btn_AnotherVehicleInvolved,test.getTestData("DriversPassenger.VehicleInvolved"));
    }
    public void maxVehicleWarningMessage(Testing test)
    {
        test.setPage(AnotherVehicleInvolved.class);
        test.setPage(DriverPassengerDetails.class);
        AnotherVehicleInvolved anotherVehicleInvolved= (AnotherVehicleInvolved) PageFactory.initElements(test.driver, test.getPage());
        DriverPassengerDetails driverPassengerDetails= (DriverPassengerDetails) PageFactory.initElements(test.driver,test.getPage());

    }

}

