package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LeadDataCompleteness"                                
     , summary=""
     , relativeUrl=""
     , connection="MisterSales"
     )             
public class LeadDataCompleteness {

	@TextType()
	@FindBy(xpath = "//img[@src='/resource/GreenTick']")
	public WebElement dataCompleteness;
	@TextType()
	@FindBy(xpath = "//img[@src='/resource/Warning']")
	public WebElement WarningIcon;
			
}
