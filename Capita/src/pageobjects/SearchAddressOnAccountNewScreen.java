package pageobjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SearchAddressOnAccountNewScreen"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class SearchAddressOnAccountNewScreen {

	@TextType()
	@FindBy(xpath = "//span[text()='Billing Address']//following::span[1]")
	public WebElement BillingAddress;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Enter address']")
	public WebElement EnterAddress;
	@LinkType()
	@FindBy(xpath = "(//div[@class='optionText'])[1]")
	public WebElement PutneyBridgeUndergroundStation;
	
}
