package SharedTC;

import org.openqa.selenium.support.PageFactory;

import ApplicationPages.Register;
import resources.Testing;

public class STC_Register {
	  public void register(Testing test){
	        test.setPage(Register.class);
	        Register register = (Register) PageFactory.initElements(test.driver, test.getPage());
	        test.webFunctions().type(test, register.textBox_PolicyNumber, test.getOutput("Policy Number"));
	        test.webFunctions().type(test, register.textBox_LastName, test.getOutput("Last Name"));
	        test.webFunctions().type(test, register.textBox_DateOfBirth, test.getOutput("Date Of Birth"));
	        test.webFunctions().type(test, register.textBox_ZipCode, test.getOutput("ZIP"));
	        test.webFunctions().click(test, register.btn_Continue);
	        test.webFunctions().type(test, register.textBox_Password, test.getOutput("Password"));
	        test.webFunctions().type(test, register.textBox_ConfirmPassword, test.getOutput("Password"));
	        test.webFunctions().click(test, register.btn_Register);
	        test.getLogger().info("Account is activated on Portal.");
	    }
	    
	    public void goToLogin(Testing test){
	    	 test.setPage(Register.class);
	         Register register = (Register) PageFactory.initElements(test.driver, test.getPage());
	         test.webFunctions().click(test, register.btn_Login);
	    }

}
