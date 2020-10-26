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
        test.webFunctions().click(test,vehicleDetails.btn_WhatHappend,test.getTestData("VehicleDetails.WhatHappend"));
        test.webFunctions().click(test,vehicleDetails.btn_WhatHappendType,test.getTestData("VehicleDetails.Type"));
        test.webFunctions().click(test,vehicleDetails.btn_MostDamage,test.getTestData("VehicleDetails.MostDamage"));
        test.webFunctions().click(test,vehicleDetails.btn_Drivable,test.getTestData("VehicleDetails.Drivable"));
        test.webFunctions().click(test,vehicleDetails.btn_Towed,test.getTestData("VehicleDetails.Towed"));
        test.webFunctions().type(test,vehicleDetails.textbox_TowingAddress,test.getTestData("VehicleDetails.TowingAddress"));
        test.webFunctions().type(test,vehicleDetails.textbox_City,test.getTestData("VehicleDetails.City"));
        test.webFunctions().click(test,vehicleDetails.dropdown_State);
        test.webFunctions().click(test,vehicleDetails.dropdownlist_StateName,test.getTestData("VehicleDetails.StateName"));
        test.webFunctions().type(test,vehicleDetails.textbox_PostalCode,test.getTestData("VehicleDetails.PostalCode"));
        test.webFunctions().click(test,vehicleDetails.btn_AirbagsDeployed,test.getTestData("VehicleDetails.AirbagsDeployed"));
        test.webFunctions().click(test,vehicleDetails.btn_Next);
    }
    public void vehicleInvolvedWithoutVin(Testing test){

        test.setPage(VehicleDetails.class);
        VehicleDetails vehicleDetails= (VehicleDetails) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,vehicleDetails.textbox_Year,test.getTestData("VehicleDetails.Year"));
        test.webFunctions().click(test,vehicleDetails.dropdown_Make);
        test.webFunctions().click(test,vehicleDetails.dropdown_SelectMakeModel,test.getTestData("VehicleDetails.Make"));
        test.webFunctions().click(test,vehicleDetails.dropdown_Model);
        test.webFunctions().click(test,vehicleDetails.dropdown_SelectMakeModel,test.getTestData("VehicleDetails.Model"));
        test.webFunctions().click(test,vehicleDetails.btn_WhatHappend,test.getTestData("VehicleDetails.WhatHappend"));
        test.webFunctions().click(test,vehicleDetails.btn_MostDamage,test.getTestData("VehicleDetails.MostDamage"));
        test.webFunctions().click(test,vehicleDetails.btn_WhatHappendType,test.getTestData("VehicleDetails.Type"));
        test.webFunctions().click(test,vehicleDetails.btn_Drivable,test.getTestData("VehicleDetails.Drivable"));
        test.webFunctions().click(test,vehicleDetails.btn_Towed,test.getTestData("VehicleDetails.Towed"));
        test.webFunctions().type(test,vehicleDetails.textbox_TowingAddress,test.getTestData("VehicleDetails.TowingAddress"));
        test.webFunctions().type(test,vehicleDetails.textbox_City,test.getTestData("VehicleDetails.City"));
        test.webFunctions().click(test,vehicleDetails.dropdown_State);
        test.webFunctions().click(test,vehicleDetails.dropdownlist_StateName,test.getTestData("VehicleDetails.StateName"));
        test.webFunctions().type(test,vehicleDetails.textbox_PostalCode,test.getTestData("VehicleDetails.PostalCode"));
        test.webFunctions().click(test,vehicleDetails.btn_AirbagsDeployed,test.getTestData("VehicleDetails.AirbagsDeployed"));
        test.webFunctions().click(test,vehicleDetails.btn_Next);
    }


}
