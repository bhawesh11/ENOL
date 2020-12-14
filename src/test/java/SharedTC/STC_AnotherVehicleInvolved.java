package SharedTC;

import ApplicationPages.AnotherVehicleInvolved;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

import static org.testng.Assert.assertTrue;

public class STC_AnotherVehicleInvolved {
    public void maxVehicleWarningMessage(Testing test)
    {
        test.setPage(AnotherVehicleInvolved.class);
        AnotherVehicleInvolved anotherVehicleInvolved= (AnotherVehicleInvolved) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, anotherVehicleInvolved.btn_AnotherVehicleInvolved,test.getTestData("DriversPassenger.VehicleInvolved"));
        test.webFunctions().click(test,anotherVehicleInvolved.btn_Next);
        for(int i=1;i<=3;i++)
        {
            test.webFunctions().type(test, anotherVehicleInvolved.textbox_VinNo, test.getTestData("DriversPassenger.Vehicle"+i+".VIN"));
            test.webFunctions().type(test, anotherVehicleInvolved.textbox_LicensePlateNumber, test.getTestData("DriversPassenger.Vehicle"+i+".PlateNumber"));
            test.webFunctions().click(test, anotherVehicleInvolved.dropdown_StateRegistered);
            test.webFunctions().click(test, anotherVehicleInvolved.dropdown_SelectState,test.getTestData("DriversPassenger.SelectState"));
            test.webFunctions().click(test, anotherVehicleInvolved.btn_MostDamage, test.getTestData("DriversPassenger.MostDamaged"));
            test.webFunctions().click(test, anotherVehicleInvolved.btn_Drivable, test.getTestData("DriversPassenger.Drivable"));
            test.webFunctions().click(test, anotherVehicleInvolved.btn_Towed, test.getTestData("DriversPassenger.Towed"));
            test.webFunctions().click(test, anotherVehicleInvolved.btn_AirbagsDeployed, test.getTestData("DriversPassenger.AirbagsDeployed"));
            test.webFunctions().click(test, anotherVehicleInvolved.btn_Next);
            test.webFunctions().click(test, anotherVehicleInvolved.btn_DriverPresent,test.getTestData("DriversPassenger.DriverPresent"));
            test.webFunctions().click(test, anotherVehicleInvolved.btn_PassengerPresent, test.getTestData("DriversPassenger.PassengerPresent"));
            test.webFunctions().click(test, anotherVehicleInvolved.btn_AnotherVehicleInvolved, test.getTestData("DriversPassenger.VehicleInvolved"));
            try{
                if(anotherVehicleInvolved.text_VehicleWarningMessage.isDisplayed()==true){
                    String ActualErrorMessage;
                    ActualErrorMessage = test.webFunctions().readInfo(test,anotherVehicleInvolved.text_VehicleWarningMessage);
                    test.getLogger().info("Actual Error Message : " + ActualErrorMessage);
                    assertTrue(ActualErrorMessage.equals(test.getTestData("DriversPassenger.ErrorMessage")));
                    test.getLogger().info("Assertion Passed, error text is correct...");
                    test.webFunctions().click(test,anotherVehicleInvolved.btn_WarningOK);
                    break;
                }
            }
            catch (Exception e){ }
            test.webFunctions().click(test, anotherVehicleInvolved.btn_Next);
        }
}
}
