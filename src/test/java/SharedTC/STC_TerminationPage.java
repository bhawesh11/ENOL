package SharedTC;

import org.openqa.selenium.support.PageFactory;

import ApplicationPages.TerminatePage;
import resources.Testing;

public class STC_TerminationPage {

public void terminationpageMessage(Testing test) {
		
		test.setPage(TerminatePage.class);
		TerminatePage terminatepage =(TerminatePage) PageFactory.initElements(test.driver, test.getPage());
		String TerminateMsg = test.webFunctions().readInfo(test, terminatepage.textMsg);
		System.out.println(TerminateMsg);
		test.getLogger().info("Terminate page");
		
	}
}