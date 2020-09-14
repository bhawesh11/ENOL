package SharedTC;

import ApplicationPages.IncidentDetails;
import ApplicationPages.MyContactInformation;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_MyContactInformation {

	public void myContactInformation(Testing test) {
		test.setPage(MyContactInformation.class);
		MyContactInformation myContactInformation = (MyContactInformation) PageFactory.initElements(test.driver,
				test.getPage());
		
		test.webFunctions().type(test, myContactInformation.textBox_Email, "smoke@test.kom");
		test.webFunctions().type(test, myContactInformation.btn_Phone, "854-896-8541");
		test.webFunctions().click(test, myContactInformation.btn_PreferredTime_8to12);
		test.webFunctions().click(test, myContactInformation.btn_FileYourClaim);
		test.getLogger().info("Attempted to submit the claim.");
	}
}