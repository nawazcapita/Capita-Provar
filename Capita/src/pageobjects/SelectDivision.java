package pageobjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Select Division"                                
               , summary=""
               , connection="MisterSales"
               , auraComponent="Select"
               , namespacePrefix=""
     )             
public class SelectDivision {

	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Division']/following-sibling::div//select")
	public WebElement division;
	
}
