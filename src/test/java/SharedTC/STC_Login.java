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

        test.webFunctions().type(test, login.textBox_Email, "Cctqys@elephant.kom");
        test.webFunctions().type(test, login.textBox_Password, "Passw0rd");
        test.webFunctions().click(test, login.btn_SignIn);
        test.getLogger().info("Login Username : Cctqys@elephant.kom");
        test.getLogger().info("Policy Number : 244-000-001-23");
        test.webFunctions().staticWait(10000);
		if (test.driver.getTitle().equals("Policy"))
			test.getLogger().info("Logged in successfully.");
		else {
		}
}
	public void login_Apparent(Testing test) {
	test.setPage(Login.class);
    Login login_Apparent = (Login) PageFactory.initElements(test.driver, test.getPage());

    //test.webFunctions().type(test, login_Apparent.textBox_Email,test.getOutput("Email"));
    //test.webFunctions().type(test, login_Apparent.textBox_Password,test.getOutput("Password"));

    test.webFunctions().type(test, login_Apparent.textBox_Email, "Pjjawt@elephant.kom");
    test.webFunctions().type(test, login_Apparent.textBox_Password, "Passw0rd");
    test.webFunctions().click(test,login_Apparent.btn_SignIn);
    test.getLogger().info("Login Username : Pjjawt@elephant.kom");
    test.getLogger().info("Policy Number : 244-000-000-39");
    test.webFunctions().staticWait(10000);
	if (test.driver.getTitle().equals("Policy"))
		test.getLogger().info("Logged in successfully.");
	else {
	}
}
}
