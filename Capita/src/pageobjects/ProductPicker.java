package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="ProductPicker"                                
               , summary=""
               , connection="Admin"
               , auraComponent="ProductPicker"
               , namespacePrefix=""
     )             
public class ProductPicker {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//div/div/input")
	public WebElement search;

	@PageRow()
	public static class ProductsTable {

		@BooleanType()
		@FindBy(xpath = ".//td[1]//label/span")
		public WebElement checkbox;

		@TextType()
		@FindBy(xpath = ".//td[2]/div")
		public WebElement productName;

	}

	@PageTable(row = ProductsTable.class, firstRowContainsHeaders = false)
	@FindBy(xpath = "//div[contains(@class,'cProductPickerResultsTable')]//table/tbody/tr")
	public List<ProductsTable> ProductsTableList;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement save;

	@PageRow()
	public static class ProductsTableList1 {

		@ButtonType()
		@AuraBy(componentXPath = "//force:modal//aura:expression[@value= '{!item.product.Product2.Name}']")
		public WebElement productName;
		@BooleanType()
		//@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!item.add}']", qualifier = "{!item.product.Id}")
		@FindBy(xpath = ".//td[1]//label/span")
		public WebElement select;
	}

	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.wrappedProducts']")
	@PageTable(firstRowContainsHeaders = false, row = ProductsTableList1.class)
	public List<ProductsTableList1> productsTableList1;
	
	
	
	

}
