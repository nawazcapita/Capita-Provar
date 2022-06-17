package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;


import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Product Picker Results Table"                                
               , summary=""
               , connection="MisterSales"
               , auraComponent="ProductPickerResultsTable"
               , namespacePrefix=""
     )             
public class ProductPickerResultsTable {

	@PageRow()
	public static class WrappedProducts {

		@BooleanType()
		@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!item.add}']", qualifier = "01u2600000U0unEAAR")
		public WebElement check;
		@ButtonType()
		@AuraBy(componentXPath = "//div[text()='Accelerate']")
		public WebElement ProductName;
		@ButtonType()
		@JavascriptBy(jspath = "return document.querySelector('tr:nth-child(12) > td:nth-child(2) > div')")
		public WebElement ProductName1;
		@BooleanType()
		@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!item.add}']", qualifier = "01u4J000003UtYUQA0")
		public WebElement check1;
		@BooleanType()
		@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!item.add}']", qualifier = "01u4J000002O7MqQAK")
		public WebElement ThirdPartyNonCapitaProductCheckbox;
	
	}

	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.wrappedProducts']")
	@PageTable(firstRowContainsHeaders = false, row = WrappedProducts.class)
	public List<WrappedProducts> wrappedProducts;
	
}
