package SharedTC;
import ApplicationPages.VehicleDetails;
import resources.Testing;
import org.openqa.selenium.support.PageFactory;

public class STC_VehicleDetails {

    public void vehicleInvolvedWithVin(Testing test) {

        test.setPage(VehicleDetails.class);
        VehicleDetails vehicleDetails= (VehicleDetails) PageFactory.initElements(test.driver, test.getPage());
        try{
            if(vehicleDetails.btn_PersonalVehicle.isDisplayed()==true)
            {
                test.webFunctions().click(test,vehicleDetails.btn_PersonalVehicle);
            }
        }catch(Exception e) { }
        try{
            if(vehicleDetails.textbox_VinNo.isDisplayed()==true){
                test.webFunctions().type(test,vehicleDetails.textbox_VinNo,test.getTestData("VIN"));
            }
        }catch (Exception e){ }
        test.webFunctions().click(test,vehicleDetails.btn_WhatHappend,test.getTestData("WhatHappend"));
        test.webFunctions().click(test,vehicleDetails.btn_WhatHappendType,test.getTestData("Type"));
        test.webFunctions().click(test,vehicleDetails.btn_MostDamage,test.getTestData("MostDamage"));
        test.webFunctions().click(test,vehicleDetails.btn_Drivable,test.getTestData("Drivable"));
        test.webFunctions().click(test,vehicleDetails.btn_Towed,test.getTestData("Towed"));
        test.webFunctions().type(test,vehicleDetails.textbox_TowingAddress,test.getTestData("TowingAddress"));
        test.webFunctions().type(test,vehicleDetails.textbox_City,test.getTestData("City"));
        test.webFunctions().click(test,vehicleDetails.dropdown_State);
        test.webFunctions().click(test,vehicleDetails.dropdownlist_StateName,test.getTestData("StateName"));
        test.webFunctions().type(test,vehicleDetails.textbox_PostalCode,test.getTestData("PostalCode"));
        test.webFunctions().click(test,vehicleDetails.btn_AirbagsDeployed,test.getTestData("AirbagsDeployed"));
        test.webFunctions().click(test,vehicleDetails.btn_Next);
    }
    public void vehicleInvolvedWithoutVin(Testing test){

        test.setPage(VehicleDetails.class);
        VehicleDetails vehicleDetails= (VehicleDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,vehicleDetails.textbox_Year,test.getTestData("Year"));
        test.webFunctions().click(test,vehicleDetails.dropdown_Make);
        test.webFunctions().click(test,vehicleDetails.dropdown_SelectMakeModel,test.getTestData("Make"));
        test.webFunctions().click(test,vehicleDetails.dropdown_Model);
        test.webFunctions().click(test,vehicleDetails.dropdown_SelectMakeModel,test.getTestData("Model"));
        test.webFunctions().click(test,vehicleDetails.btn_WhatHappend,test.getTestData("WhatHappend"));
        test.webFunctions().click(test,vehicleDetails.btn_MostDamage,test.getTestData("MostDamage"));
        test.webFunctions().click(test,vehicleDetails.btn_WhatHappendType,test.getTestData("Type"));
        test.webFunctions().click(test,vehicleDetails.btn_Drivable,test.getTestData("Drivable"));
        test.webFunctions().click(test,vehicleDetails.btn_Towed,test.getTestData("Towed"));
        test.webFunctions().type(test,vehicleDetails.textbox_TowingAddress,test.getTestData("TowingAddress"));
        test.webFunctions().type(test,vehicleDetails.textbox_City,test.getTestData("City"));
        test.webFunctions().click(test,vehicleDetails.dropdown_State);
        test.webFunctions().click(test,vehicleDetails.dropdownlist_StateName,test.getTestData("StateName"));
        test.webFunctions().type(test,vehicleDetails.textbox_PostalCode,test.getTestData("PostalCode"));
        test.webFunctions().click(test,vehicleDetails.btn_AirbagsDeployed,test.getTestData("AirbagsDeployed"));
        test.webFunctions().click(test,vehicleDetails.btn_Next);
    }


}
