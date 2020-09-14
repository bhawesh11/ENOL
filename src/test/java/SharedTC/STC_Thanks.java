package SharedTC;

import ApplicationPages.IncidentDetails;
import ApplicationPages.MyContactInformation;
import ApplicationPages.Thanks;

import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_Thanks {

	public void saveClaimNumber(Testing test) {
		test.setPage(Thanks.class);
		Thanks thanks = (Thanks) PageFactory.initElements(test.driver,
				test.getPage());
		
		String claimNo = test.webFunctions().readInfo(test,thanks.text_ClaimNumber);
		test.getLogger().info("Claim#:"+ claimNo);
		test.setOutput("Claim", claimNo);
	}
}