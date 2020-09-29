package SharedTC;

import ApplicationPages.Login;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;


public class STC_Login {
	public void login(Testing test){
        test.setPage(Login.class);
        Login login = (Login) PageFactory.initElements(test.driver, test.getPage());

        //test.webFunctions().type(test, login.textBox_Email,test.getOutput("Email"));
        //test.webFunctions().type(test, login.textBox_Password,test.getOutput("Password"));

        test.webFunctions().type(test, login.textBox_Email, "lastdryrun@vvv.com");
        test.webFunctions().type(test, login.textBox_Password, "Passw0rd");
        test.webFunctions().click(test, login.btn_SignIn);
        test.getLogger().info("Login Username : TestQrdnxbeVGH@apparentinsurance.com");
        test.getLogger().info("Policy Number : 244-000-003-73");
      test.webFunctions().staticWait(10000);
		if (test.driver.getTitle().equals("Policy"))
			test.getLogger().info("Logged in successfully.");
		else {
		}
}
}