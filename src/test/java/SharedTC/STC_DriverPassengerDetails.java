package sharedTC;

import applicationPages.AnotherVehicleInvolved;
import applicationPages.DriverPassengerDetails;
import applicationPages.VehicleDetails;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

import java.sql.Driver;

public class STC_DriverPassengerDetails {

    public void driverPresent(Testing test){
        test.setPage(DriverPassengerDetails.class);
        DriverPassengerDetails driverPassengerDetails= (DriverPassengerDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,driverPassengerDetails.btn_DriverPresent,test.getTestData("DriverPresent"));
        try{
            if(driverPassengerDetails.btn_DriversAtTimeOfIncident.isDisplayed()==true){
                test.webFunctions().click(test,driverPassengerDetails.btn_DriversAtTimeOfIncident);
            }
        }catch (Exception e){ }
        try{
            if(driverPassengerDetails.textbox_DriverFirstName.isDisplayed()==true)
            {
                test.webFunctions().click(test,driverPassengerDetails.btn_DriverAsPolicyHolder,test.getTestData("DriverAsPolicyHolder"));
                test.webFunctions().type(test,driverPassengerDetails.textbox_DriverFirstName,test.getTestData("FirstName"));
                test.webFunctions().type(test,driverPassengerDetails.textbox_DriverLastName,test.getTestData("LastName"));
                test.webFunctions().type(test,driverPassengerDetails.textbox_DriverDOB,test.getTestData("DOB"));
                test.webFunctions().type(test,driverPassengerDetails.textbox_DriverAddress,test.getTestData("Address"));
                test.webFunctions().type(test,driverPassengerDetails.textbox_DriverCity,test.getTestData("City"));
                test.webFunctions().click(test,driverPassengerDetails.dropdown_DriverState);
                test.webFunctions().click(test,driverPassengerDetails.dropdown_PassengerStateName,test.getTestData("StateName"));
                test.webFunctions().type(test,driverPassengerDetails.textbox_DriverPostalCode,test.getTestData("PostalCode"));
                test.webFunctions().type(test,driverPassengerDetails.textbox_DriverPhone,test.getTestData("Phone"));
                test.webFunctions().type(test,driverPassengerDetails.textbox_DriverPostalCode,test.getTestData("PostalCode"));
            }
        }catch (Exception e){ }

        test.webFunctions().click(test,driverPassengerDetails.btn_DriverInjuredYes);
        test.webFunctions().type(test,driverPassengerDetails.textarea_DriverInjuryDescription,test.getTestData("InjuryDescription"));
    }

    public void driverNotPresent(Testing test)
    {
        test.setPage(DriverPassengerDetails.class);
        DriverPassengerDetails driverPassengerDetails= (DriverPassengerDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,driverPassengerDetails.btn_DriverPresent,test.getTestData("DriverPresent"));
    }

    public void passengerNotPresent(Testing test) {
        test.setPage(DriverPassengerDetails.class);
        DriverPassengerDetails driverPassengerDetails= (DriverPassengerDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,driverPassengerDetails.btn_PassengerPresent,test.getTestData("PassengerPresent"));
    }
    public void addPassenger(Testing test)
    {
        test.webFunctions().click(test,driverPassengerDetails.btn_PassengerPresent,test.getTestData("PassengerPresent"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerFirstName,test.getTestData("PassengerFirstName"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerLastName,test.getTestData("PassengerLastName"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerDOB,test.getTestData("PassengerDOB"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerAddress,test.getTestData("PassengerAddress"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerCity,test.getTestData("PassengerCity"));
        test.webFunctions().click(test,driverPassengerDetails.dropdown_PassengerState);
        test.webFunctions().click(test,driverPassengerDetails.dropdown_DriverStateName,test.getTestData("PassengerStateName"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerPostalCode,test.getTestData("PasengerPostalCode"));
        test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerPhone,test.getTestData("PassengerPhone"));
        test.webFunctions().click(test,driverPassengerDetails.btn_PassengerInjuredYes);
        test.webFunctions().type(test,driverPassengerDetails.textarea_PassengerInjuryDescription,test.getTestData("PassengerInjuryDescription"));
    }
    public void maxPassengerWarningMessage(Testing test)
    {
        for(int i=1;i<=8;i++)
        {
            test.webFunctions().click(test,driverPassengerDetails.btn_PassengerPresent,test.getTestData("PassengerPresent"+i""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerFirstName,test.getTestData("PassengerFirstName"+i""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerLastName,test.getTestData("PassengerLastName"+i""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerDOB,test.getTestData("PassengerDOB"+i""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerAddress,test.getTestData("PassengerAddress"+i""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerCity,test.getTestData("PassengerCity"+i""));
            test.webFunctions().click(test,driverPassengerDetails.dropdown_PassengerState);
            test.webFunctions().click(test,driverPassengerDetails.dropdown_DriverStateName,test.getTestData("PassengerStateName"+i""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerPostalCode,test.getTestData("PasengerPostalCode"+i""));
            test.webFunctions().type(test,driverPassengerDetails.textbox_PassengerPhone,test.getTestData("PassengerPhone"+i""));
            test.webFunctions().click(test,driverPassengerDetails.btn_PassengerInjuredNo);
            test.webFunctions().type(test,driverPassengerDetails.textarea_PassengerInjuryDescription,test.getTestData("PassengerInjuryDescription"+i""));

        }
        }
    }

    public void anotherVehicleNotInvolved(Testing test)
    {
        test.setPage(AnotherVehicleInvolved.class);
        AnotherVehicleInvolved anotherVehicleInvolved = (AnotherVehicleInvolved) PageFactory.initElements(test.driver, test.getPage());
    }
    public void anotherVehicleInvolved(Testing test)
    {
        test.setPage(AnotherVehicleInvolved.class);
        AnotherVehicleInvolved anotherVehicleInvolved= (AnotherVehicleInvolved) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,anotherVehicleInvolved.textbox_VinNo,test.getTestData("VIN"));
        test.webFunctions().type(test,anotherVehicleInvolved.textbox_LicensePlateNumber,test.getTestData("PlateNumber"));
        test.webFunctions().click(test,anotherVehicleInvolved.dropdown_SelectState);
        test.webFunctions().click(test,anotherVehicleInvolved.dropdown_StateRegistered,test.getTestData("StateRegistered"));
        test.webFunctions().click(test,anotherVehicleInvolved.btn_MostDamage,test.getTestData("MostDamaged"));
        test.webFunctions().click(test,anotherVehicleInvolved.btn_Drivable,test.getTestData("Drivable"));
        test.webFunctions().click(test,anotherVehicleInvolved.btn_Towed,test.getTestData("Towed"));
        test.webFunctions().click(test,anotherVehicleInvolved.btn_AirbagsDeployed,test.getTestData("AirbagsDeployed"));
        test.webFunctions().click(test,anotherVehicleInvolved.btn_Next);
        driverNotPresent(test);
    }

}

