package SharedTC;

import org.openqa.selenium.support.PageFactory;

import ApplicationPages.ThankyouPage;
import resources.Testing;

public class STC_ThankyouPage {
	
	public void getClaimNo(Testing test) {
		
		test.setPage(ThankyouPage.class);
		ThankyouPage thankyoupage =(ThankyouPage) PageFactory.initElements(test.driver, test.getPage());
		String ClaimNo = test.webFunctions().readInfo(test, thankyoupage.text_ClaimNo);
		test.getLogger().info("Claim Number : " +ClaimNo);
		test.getLogger().info("Claim Sucessfully Registered");
		
	}

}
