package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Product Picker"                                
               , summary=""
               , connection="MisterSales"
               , auraComponent="ProductPicker"
               , namespacePrefix=""
     )             
public class ProductPicker 
{

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next;

	@PageRow()
	public static class SelectedProducts {
		public InlineEditRow inlineEditRow;
	}

	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.selectedProducts']")
	@PageTable(firstRowContainsHeaders = false, row = SelectedProducts.class)
	public List<SelectedProducts> selectedProducts;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement save;
	@ButtonType()
	@AuraBy(componentXPath = "//force:modal//lightning:button[@label= 'Next Page']")
	public WebElement nextPage;

	
}
