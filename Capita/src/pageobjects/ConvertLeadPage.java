package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ConvertLeadPage"                                
     , summary=""
     , relativeUrl=""
     , connection="MisterSales"
     )             
public class ConvertLeadPage {

	@LinkType()
	@FindBy(xpath = "//div[text()='Account']//following::a[1]")
	public WebElement AccountName;
	@LinkType()
	@FindBy(xpath = "//div[text()='Contact']//following::a[1]")
	public WebElement ContactName;
	@LinkType()
	@FindBy(xpath = "//div[text()='Opportunity']//following::a[1]")
	public WebElement OpportunityName;
			
}
