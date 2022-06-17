package pageobjects;



import org.openqa.selenium.WebElement;


import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Inline Edit Row"                                
               , summary=""
               , connection="MisterSales"
               , auraComponent="InlineEditRow"
               , namespacePrefix=""
     )             
public class InlineEditRow {

	@ChoiceListType()
	@AuraBy(componentXPath = "//force:modal//lightning:select[@value= '{!v.record.RIG_Business_Unit__c}']")
	public WebElement BusinessUnit;
	@ChoiceListType()
	@AuraBy(componentXPath = "//force:modal//lightning:select[@value= '{!v.record.RIG_Revenue_Type__c}']")
	public WebElement RevenueType;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.RIG_Revenue_Start_Date__c}']", qualifier = "dateinput")
	public WebElement Id;
	@ChoiceListType()
	@AuraBy(componentXPath = "//force:modal//lightning:select[@value= '{!v.record.RIG_Margin_Type__c}']")
	public WebElement Frequency;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.RIG_Margin_in_percent__c}']", qualifier = "marginPercent")
	public WebElement MarginType;
	@ChoiceListType()
	@AuraBy(componentXPath = "//force:modal//lightning:select[@value= '{!v.record.RIG_Margin_Type__c}']")
	public WebElement MarginType1;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.RIG_Margin_in_percent__c}']", qualifier = "marginPercent")
	public WebElement GrossMarginValue;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.Quantity}']", qualifier = "quantity")
	public WebElement Quantity;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.UnitPrice}']", qualifier = "unitprice")
	public WebElement SalesPrice_GBP_;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.RIG_Term__c}']", qualifier = "number")
	public WebElement RevenueStart_Date;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.RIG_Term__c}']", qualifier = "number")
	public WebElement Terms_Months_;
	@ChoiceListType()
	@AuraBy(componentXPath = "//force:modal//lightning:select[@value= '{!v.record.RIG_Margin_Type__c}']")
	public WebElement MarginTypeForProduct;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.RIG_Margin_in_percent__c}']", qualifier = "marginPercent")
	public WebElement GrossMarginValue1;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.Quantity}']", qualifier = "quantity")
	public WebElement QuantityForProduct;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.UnitPrice}']", qualifier = "unitprice")
	public WebElement SalesPrice_GBP_1;
	
}
