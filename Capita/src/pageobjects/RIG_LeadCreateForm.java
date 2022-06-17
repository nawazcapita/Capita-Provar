package pageobjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="RIG_ Lead Create Form"                                
               , summary=""
               , connection="MisterSales"
               , auraComponent="RIG_LeadCreateForm"
               , namespacePrefix=""
     )             
public class RIG_LeadCreateForm {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement SaveNewLead;
	@ChoiceListType()
	@AuraBy(componentXPath = "//lightning:select[@label= 'Salutation']")
	public WebElement salutation;
	@TextType()
	@FindBy(xpath = "//input[@name='LastName']")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//input[@name='FirstName']")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//input[@name='Company']")
	public WebElement company;
	@TextType()
	@FindBy(xpath = "//input[@name='Email']")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//button[@name='LeadSource']")
	public WebElement leadSource;
	@TextType()
	@FindByLabel(label = "Opt In")
	public WebElement optIn;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@required='{!field.isRequired}']", qualifier = "true")
	@SalesforceField(name = "RIG_PI_CapitaOptIn__c", object = "Lead")
	public WebElement optIn1;
	@TextType()
	@FindByLabel(label = "Basis")
	public WebElement basis;
	
}
