package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlassClaim {
	
	@FindBy(xpath="//p[@class='copy']")
	public WebElement text_GlassClaims;
	
	@FindBy(xpath="(//div[@class='glass-only']/p//text())[2]")
	public WebElement text_GlassClaimsNo;


}

//div[@class='glass-only']
