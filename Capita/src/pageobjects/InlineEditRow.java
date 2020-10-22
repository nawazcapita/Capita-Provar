package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="InlineEditRow"                                
               , summary=""
               , connection="Admin"
               , auraComponent="InlineEditRow"
               , namespacePrefix=""
     )             
public class InlineEditRow {

	@PageRow()
	public static class SelectedProducts {
		public InlineEditRow2 inlineEditRow2;
	}

	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.selectedProducts']")
	@PageTable(firstRowContainsHeaders = false, row = SelectedProducts.class)
	public List<SelectedProducts> selectedProducts;
	
}
