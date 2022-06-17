package pageobjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CloseOpportunity"                                
     , summary=""
     , relativeUrl=""
     , connection="MisterSales"
     )             
public class CloseOpportunity {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement Save;
			
}
