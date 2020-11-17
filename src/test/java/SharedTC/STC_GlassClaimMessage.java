package SharedTC;

import ApplicationPages.GlassClaim;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

import static org.testng.Assert.assertTrue;

public class STC_GlassClaimMessage {
	
	String ActualGlassClaimMessage;
	
	public void verifyGlassClaimMessage(Testing test){
		
		 test.setPage(GlassClaim.class);
	        GlassClaim glassClaim = (GlassClaim) PageFactory.initElements(test.driver, test.getPage());
	        ActualGlassClaimMessage = test.webFunctions().readInfo(test, glassClaim.text_GlassClaims);
	        System.out.println(ActualGlassClaimMessage);
	        //String ExpectedGlassClaimMessage = "For all glass claims, we have a specialized team who can resolve this issue quickly. At your convenience, contact us at 1-800-413-8860. We are here to help!"; 
	        		
	        test.getLogger().info("Actual Glass Claim Message : "+ActualGlassClaimMessage);
	        assertTrue(ActualGlassClaimMessage.equals(test.getTestData("GlassClaimsElephant.ExpectedMessage")));
	        test.getLogger().info("Glass Claim Message and Phone No verified succussfully...");
     }

}
