//package testApparent;
//
//import java.io.IOException;
//
//import resources.Testing;
//import SharedTC.*;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
//import org.testng.annotations.*;
//
////import SharedTC.QuoteAndBind;
//public class TC {
//
//
//    Logger log = Logger.getLogger("Test Suite");
//    private final String brandName="Apparent";
//
////	==============================================================================================
////										*** ADDITIONAL METHODS ***
//
//    @BeforeSuite
//    public void openBrowser() throws InterruptedException, IOException {
//        PropertyConfigurator.configure("log4j.properties");
//    }
//
//    //	==============================================================================================
////										***_TEST_CASES_***
//
//    //	TC001
//    @Test(enabled = true, priority = 5, description = "1V1D")
//    @Parameters("ENV")
//    public void TC001(String ENV) throws InterruptedException, IOException {
//
//        Testing tc001 = new Testing(ENV, brandName, "1D1V");
//        try {
//            PostalCode.postalCode(tc001);
//            Family.family(tc001);
//            Children.children(tc001);
//            PolicyHolder.policyholder(tc001);
//            Address.address(tc001);
//            VehicleDetails1of2.vehicleDetails1of2(tc001);
//            VehicleDetails2of2.vehicleDetails2of2(tc001);
//            VehicleList.vehicleList(tc001);
//            PolicyHolderDetails1of2.policyHolderDetails1of2(tc001);
//            PolicyHolderDetails2of2.policyHolderDetails2of2(tc001);
//            DriverList.driverList(tc001);
//            InsuranceHistory.insuranceHistory_No(tc001);
//            PolicyStartDate.policyStartDate(tc001);
//            Quote.quote(tc001);
//            ConfirmDriver.confirmDriver(tc001);
//            ConfirmVehicle.confirmVehicle(tc001);
//            PaymentPlan.paymentPlan(tc001);
//            Billing.billing(tc001);
//            GetInfo.GetPolicyNumber(tc001);
//
//        } catch (Throwable e) {
//            throw (e);
//        } finally {
//            tc001.tearDown();
//        }
//    }//closing TC001 method
//
////	---------------------------------------------------------------------------------------
//
//    //	TC002
////    @Test(enabled = true, priority = 5, description = "1D1V")
//    @Parameters("ENV")
//    public void TC002(String ENV) throws InterruptedException, IOException {
////Retrieve Quote
//        Testing tc001 = new Testing(ENV, brandName, "Retrieve Quote");
//        try {
//            PostalCode.postalCode(tc001);
//            Family.family(tc001);
//            Children.children(tc001);
//            PolicyHolder.policyholder(tc001);
//            Address.address(tc001);
//            VehicleDetails1of2.vehicleDetails1of2(tc001);
//            VehicleDetails2of2.vehicleDetails2of2(tc001);
//            VehicleList.vehicleList(tc001);
//            PolicyHolderDetails1of2.policyHolderDetails1of2(tc001);
//            PolicyHolderDetails2of2.policyHolderDetails2of2(tc001);
//            DriverList.driverList(tc001);
//            InsuranceHistory.insuranceHistory_No(tc001);
//            PolicyStartDate.policyStartDate(tc001);
//            Quote.quote(tc001);
////            driver.navigate().to("https://quotes-qa6.elephant.dev/#/quote-retrieve");
//            RetrieveQuote.RetrieveQuote(tc001);
//        } catch (Throwable e) {
//            throw (e);
//        } finally {
//            tc001.tearDown();
//        }
//    }
//    //---------------------------------------------------------------------------------------
//
//
//    /*
//        //	---------------------------------------------------------------------------------------
//
//        //	TC003
//        @Test(enabled=true, priority=5, description="1V1D-Quote")
//        @Parameters("ENV")
//        public void TC001(String ENV) throws InterruptedException, IOException{
//            Testing tc001 = new Testing(ENV, brandName,"1D1V");
//            try{
//            //use sheet Test2V1D.xlsx for this one
//            PostalCode.postalCode(tc001);
//            Family.family(tc001);
//            Children.children(tc001);
//            PolicyHolder.policyholder(tc001);
//            Address.address(tc001);
//            VehicleDetails1of2.vehicleDetails1of2(tc001);
//            VehicleDetails2of2.vehicleDetails2of2(tc001);
//            VehicleList.vehicleList(tc001);
//            PolicyHolderDetails1of2.policyHolderDetails1of2(tc001);
//            PolicyHolderDetails2of2.policyHolderDetails2of2(tc001);
//            DriverList.driverList(tc001);
//            InsuranceHistory.insuranceHistory_No(tc001);
//            PolicyStartDate.policyStartDate(tc001);
//            Quote.quote(tc001);
//            ConfirmDriver.confirmDriver(tc001);
//            ConfirmVehicle.confirmVehicle(tc001);
//            PaymentPlan.paymentPlan(tc001);
//            Billing.billing(tc001);
//
//        } catch (Throwable e) {
//                throw (e);
//            } finally {
//                tc001.tearDown();
//            }
//        }//closing TC003 method
//
//    //	---------------------------------------------------------------------------------------
//
//        //	TC004
//          @Test(enabled=true, priority=5, description="1V1D-Quote")
//        @Parameters("ENV")
//        public void TC001(String ENV) throws InterruptedException, IOException{
//            //script="2D1V";
//            Testing tc001 = new Testing(ENV, brandName,"1D1V");
//            try{
//
//            PostalCode.postalCode(tc001);
//            Family.family(tc001);
//            Children.children(tc001);
//            PolicyHolder.policyholder(tc001);
//            Address.address(tc001);
//            VehicleDetails1of2.vehicleDetails1of2(tc001);
//            VehicleDetails2of2.vehicleDetails2of2(tc001);
//            VehicleList.vehicleList(tc001);
//            PolicyHolderDetails1of2.policyHolderDetails1of2(tc001);
//            PolicyHolderDetails2of2.policyHolderDetails2of2(tc001);
//            DriverList.driverList(tc001);
//            InsuranceHistory.insuranceHistory_No(tc001);
//            DriverAssignment.driverAssignment(tc001);
//            PolicyStartDate.policyStartDate(tc001);
//            Quote.quote(tc001);
//            ConfirmDriver.confirmDriver(tc001);
//            ConfirmVehicle.confirmVehicle(tc001);
//            PaymentPlan.paymentPlan(tc001);
//            Billing.billing(tc001);
//
//         } catch (Throwable e) {
//                throw (e);
//            } finally {
//                tc001.tearDown();
//            }
//        }//closing TC004 method
//
//    //	---------------------------------------------------------------------------------------
//    */
//    //	TC005
////    @Test(enabled = true, priority = 5, description = "2V2D-Quote")
//    @Parameters("ENV")
//    public void TC005(String ENV) throws InterruptedException, IOException {
//
//        Testing tc005 = new Testing(ENV, brandName, "2V2D");
//        try {
//            PostalCode.postalCode(tc005);
//            Family.family(tc005);
//            Children.children(tc005);
//            PolicyHolder.policyholder(tc005);
//            Address.address(tc005);
//            VehicleDetails1of2.vehicleDetails1of2(tc005);
//            VehicleDetails2of2.vehicleDetails2of2(tc005);
//            VehicleList.vehicleList(tc005);
//            PolicyHolderDetails1of2.policyHolderDetails1of2(tc005);
//            PolicyHolderDetails2of2.policyHolderDetails2of2(tc005);
//            DriverList.driverList(tc005);
//            InsuranceHistory.insuranceHistory_No(tc005);
//            DriverAssignment.driverAssignment(tc005);
//            PolicyStartDate.policyStartDate(tc005);
//            Quote.quote(tc005);
//            ConfirmDriver.confirmDriver(tc005);
//            ConfirmVehicle.confirmVehicle(tc005);
//            PaymentPlan.paymentPlan(tc005);
//            Billing.billing(tc005);
//        } catch (Throwable e) {
//            throw (e);
//        } finally {
//            tc005.tearDown();
//        }
//    }//closing TC005 method
//
//    //	---------------------------------------------------------------------------------------
//
//
///*
//    //	TC006
//     @Test(enabled=true, priority=5, description="1V1D-Quote")
//    @Parameters("ENV")
//    public void TC001(String ENV) throws InterruptedException, IOException{
//
//        Testing tc001 = new Testing(ENV, brandName,"1D1V");
//        try{
//        //script="2D1V_Spouse";
//        PostalCode.postalCode(tc001);
//        Family.family(tc001);
//        Children.children(tc001);
//        PolicyHolder.policyholder(tc001);
//        Address.address(tc001);
//        VehicleDetails1of2.vehicleDetails1of2(tc001);
//        VehicleDetails2of2.vehicleDetails2of2(tc001);
//        VehicleList.vehicleList(tc001);
//        PolicyHolderDetails1of2.policyHolderDetails1of2(tc001);
//        PolicyHolderDetails2of2.policyHolderDetails2of2(tc001);
//        Spouse1of2.Spouse1of2(tc001);
//        Spouse2of2.Spouse2of2(tc001);
//        DriverList.driverList(tc001);
//        InsuranceHistory.insuranceHistory_Yes(tc001);
//        DriverAssignment.driverAssignment(tc001);
//        PolicyStartDate.policyStartDate(tc001);
//        Quote.quote(tc001);
//        ConfirmDriver.confirmDriver_withSpouse(tc001);
//        ConfirmVehicle.confirmVehicle(tc001);
//        PaymentPlan.paymentPlan(tc001);
//        Billing.billing(tc001);
//} catch (Throwable e) {
//            throw (e);
//        } finally {
//            tc001.tearDown();
//        }
//    }//closing TC006 method
//
////	---------------------------------------------------------------------------------------
//
//
//    //	TC007
//    @Test(enabled=true, priority=5, description="1V1D-Quote")
//    @Parameters("ENV")
//    public void TC001(String ENV) throws InterruptedException, IOException{
//
//        Testing tc001 = new Testing(ENV, brandName,"1D1V");
//        try{
//        //script="RemoveDriver";
//        PostalCode.postalCode(tc001);
//        Family.family(tc001);
//        Children.children(tc001);
//        PolicyHolder.policyholder(tc001);
//        Address.address(tc001);
//        VehicleDetails1of2.vehicleDetails1of2(tc001);
//        VehicleDetails2of2.vehicleDetails2of2(tc001);
//        VehicleList.vehicleList(tc001);
//        PolicyHolderDetails1of2.policyHolderDetails1of2(tc001);
//        PolicyHolderDetails2of2.policyHolderDetails2of2(tc001);
//        DriverList.driverList(tc001);
//        InsuranceHistory.insuranceHistory_No(tc001);
//        PolicyStartDate.policyStartDate(tc001);
//        Quote.quote(tc001);
//        RightPanel.AddDriver(tc001);
//        DriverInfo1of2.driverInfo1of2(tc001);
//        DriverInfo2of2.driverInfo2of2(tc001);
//        DriverList.driverList_RemoveDriver(tc001);
//        InsuranceHistory.insuranceHistory_No(tc001);
//        PolicyStartDate.policyStartDate(tc001);
//        Quote.quote(tc001);
//        ConfirmDriver.confirmDriver(tc001);
//        ConfirmVehicle.confirmVehicle(tc001);
//        PaymentPlan.paymentPlan(tc001);
//        Billing.billing(tc001);
//        GetInfo.GetPolicyNumber(tc001);
//} catch (Throwable e) {
//            throw (e);
//        } finally {
//            tc001.tearDown();
//        }
//    }//closing TC007 method
//
////	---------------------------------------------------------------------------------------
//
//    //	TC008
//    @Test(enabled=true, priority=5, description="1V1D-Quote")
//    @Parameters("ENV")
//    public void TC001(String ENV) throws InterruptedException, IOException{
//
//        Testing tc001 = new Testing(ENV, brandName,"1D1V");
//        try{
//       // script="Suspended License";
//        PostalCode.postalCode(tc001);
//        Family.family(tc001);
//        Children.children(tc001);
//        PolicyHolder.policyholder(tc001);
//        Address.address(tc001);
//        VehicleDetails1of2.vehicleDetails1of2(tc001);
//        VehicleDetails2of2.vehicleDetails2of2(tc001);
//        VehicleList.vehicleList(tc001);
//        PolicyHolderDetails1of2.policyHolderDetails1of2(tc001);
//        PolicyHolderDetails2of2.policyHolderDetails2of2_LicenseStatus(tc001);
//        GetInfo.GetLicenseStatus(tc001);
//} catch (Throwable e) {
//            throw (e);
//        } finally {
//            tc001.tearDown();
//        }
//    }
//    //---------------------------------------------------------------------------------------
////	TC009
//     @Test(enabled=true, priority=5, description="1V1D-Quote")
//    @Parameters("ENV")
//    public void TC001(String ENV) throws InterruptedException, IOException{
//
//        Testing tc001 = new Testing(ENV, brandName,"1D1V");
//        try{
//       // script="Morethan3DUI";
//        PostalCode.postalCode(tc001);
//        Family.family(tc001);
//        Children.children(tc001);
//        PolicyHolder.policyholder(tc001);
//        Address.address(tc001);
//        VehicleDetails1of2.vehicleDetails1of2(tc001);
//        VehicleDetails2of2.vehicleDetails2of2(tc001);
//        VehicleList.vehicleList(tc001);
//        PolicyHolderDetails1of2.policyHolderDetails1of2(tc001);
//        PolicyHolderDetails2of2.policyHolderDetails2of2(tc001);
//        incidents.add_MoreThan3DUI(tc001);
//        GetInfo.GetDUIMessage(tc001);
//} catch (Throwable e) {
//            throw (e);
//        } finally {
//            tc001.tearDown();
//        }
//    }//closing TC009 method
//
////	---------------------------------------------------------------------------------------
////	---------------------------------------------------------------------------------------
//
//    //	TC010
//     @Test(enabled=true, priority=5, description="1V1D-Quote")
//    @Parameters("ENV")
//    public void TC001(String ENV) throws InterruptedException, IOException{
//
//        Testing tc001 = new Testing(ENV, brandName,"1D1V");
//        try{
//        //script="8D8V";
//        PostalCode.postalCode(tc001);
//        Family.family(tc001);
//        Children.children(tc001);
//        PolicyHolder.policyholder(tc001);
//        Address.address(tc001);
//        VehicleDetails1of2.vehicleDetails1of2(tc001);
//        VehicleDetails2of2.vehicleDetails2of2(tc001);
//        VehicleList.vehicleList(tc001);
//        PolicyHolderDetails1of2.policyHolderDetails1of2(tc001);
//        PolicyHolderDetails2of2.policyHolderDetails2of2(tc001);
//        DriverList.driverList(tc001);
//       InsuranceHistory.insuranceHistory_No(tc001);
//        //DriverAssignment.driverAssignment(tc001);
//       // PolicyStartDate.policyStartDate(tc001);
//        //Quote.quote(tc001);
//        //ConfirmDriver.confirmDriver(tc001);
//        //ConfirmVehicle.confirmVehicle(tc001);
//        //PaymentPlan.paymentPlan(tc001);
//       // Billing.billing(tc001);
//} catch (Throwable e) {
//            throw (e);
//        } finally {
//            tc001.tearDown();
//        }
//    }//closing TC005 method
//
//    //	---------------------------------------------------------------------------------------
//
//*/
//
//
//}
