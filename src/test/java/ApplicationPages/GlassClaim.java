package applicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GlassClaim {
	
	@FindBy(xpath="//div[@class='glass-only']/p//text()")
	public WebElement text_GlassClaims;
	
	@FindBy(xpath="(//div[@class='glass-only']/p//text())[2]")
	public WebElement text_GlassClaimsNo;


}

//div[@class='glass-only']
