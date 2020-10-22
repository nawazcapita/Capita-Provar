package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="RIG_LeadCreateForm"                                
               , summary=""
               , connection="Admin"
               , auraComponent="RIG_LeadCreateForm"
               , namespacePrefix=""
     )             
public class RIG_LeadCreateForm {

	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "RIG_Lead_Topic__c")
	@SalesforceField(name = "RIG_Lead_Topic__c", object = "Lead")
	public WebElement leadTopic;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "Description")
	@SalesforceField(name = "Description", object = "Lead")
	public WebElement description;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "RIG_Current_Status__c")
	@SalesforceField(name = "RIG_Current_Status__c", object = "Lead")
	public WebElement currentStatus;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "NextSteps__c")
	@SalesforceField(name = "NextSteps__c", object = "Lead")
	public WebElement nextSteps;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "RIG_Engagement_Type__c")
	@SalesforceField(name = "RIG_Engagement_Type__c", object = "Lead")
	public WebElement engagementType;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "RIG_Revenue_Recognition__c")
	@SalesforceField(name = "RIG_Revenue_Recognition__c", object = "Lead")
	public WebElement revenueRecognition;
	@ChoiceListType()
	@AuraBy(componentXPath = "//lightning:select[@label= 'Salutation']")
	public WebElement salutation;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "FirstName")
	@SalesforceField(name = "FirstName", object = "Lead")
	public WebElement firstName;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "LastName")
	@SalesforceField(name = "LastName", object = "Lead")
	public WebElement lastName;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "Email")
	@SalesforceField(name = "Email", object = "Lead")
	public WebElement email;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "Company")
	@SalesforceField(name = "Company", object = "Lead")
	public WebElement company;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "Phone")
	@SalesforceField(name = "Phone", object = "Lead")
	public WebElement phone;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "Industry")
	@SalesforceField(name = "Industry", object = "Lead")
	public WebElement industry;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "LeadSource")
	@SalesforceField(name = "LeadSource", object = "Lead")
	public WebElement leadSource;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "RIG_PI_CapitaOptIn__c")
	@SalesforceField(name = "RIG_PI_CapitaOptIn__c", object = "Lead")
	public WebElement optIn;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement save;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "RIG_Sector__c")
	@SalesforceField(name = "RIG_Sector__c", object = "Lead")
	public WebElement sector;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "MobilePhone")
	@SalesforceField(name = "MobilePhone", object = "Lead")
	public WebElement mobilePhone;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "Website")
	@SalesforceField(name = "Website", object = "Lead")
	public WebElement website;
	@TextType()
	@AuraBy(componentXPath = "//lightning:inputField[@fieldName='{!field.APIName}']", qualifier = "RIG_Lead_Type__c")
	@SalesforceField(name = "RIG_Lead_Type__c", object = "Lead")
	public WebElement leadType;
	
}
