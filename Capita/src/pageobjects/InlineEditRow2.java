package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="InlineEditRow2"                                
               , summary=""
               , connection="Admin"
               , auraComponent="InlineEditRow"
               , namespacePrefix=""
     )             
public class InlineEditRow2 {

	@TextType()
	@AuraBy(componentXPath = "//force:modal//aura:expression[@value= '{!v.record.Name}']")
	public WebElement ProductName;
	@ChoiceListType()
	@AuraBy(componentXPath = "//force:modal//lightning:select[@value= '{!v.record.RIG_Revenue_Type__c}']")
	public WebElement RevenueType;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.RIG_Revenue_Start_Date__c}']", qualifier = "dateinput")
	public WebElement RevenueStart_Date;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.RIG_Term__c}']", qualifier = "number")
	public WebElement Term_MONTHS_;
	@ChoiceListType()
	@AuraBy(componentXPath = "//force:modal//lightning:select[@value= '{!v.record.RIG_Frequency__c}']")
	public WebElement Frequency;
	@ChoiceListType()
	@AuraBy(componentXPath = "//force:modal//lightning:select[@value= '{!v.record.RIG_Margin_Type__c}']")
	public WebElement MarginType;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.RIG_Margin_in_percent__c}']", qualifier = "marginPercent")
	public WebElement MarginValue;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.Quantity}']", qualifier = "quantity")
	public WebElement Quantity;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.record.UnitPrice}']", qualifier = "unitprice")
	public WebElement SalesPrice__GBP_;
	
}
