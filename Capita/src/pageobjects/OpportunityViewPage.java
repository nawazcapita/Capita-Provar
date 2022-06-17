package pageobjects;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Opportunity View Page"                                
     , summary=""
     , relativeUrl=""
     , connection="MisterSales"
     )             
public class OpportunityViewPage 
{

			WebDriver driver;
			public OpportunityViewPage(WebDriver driver) 
			{
				this.driver=driver;
			}
			public void ScrollUp()
			{
				Actions a = new Actions(driver);

				//scroll up a page
				a.sendKeys(Keys.PAGE_UP).build().perform();
			
			}

			@ButtonType()
			@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit BANT/Qualification']")
			public WebElement editBANTQualification;			
			@ButtonType()
			@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
			public WebElement save;
			@ButtonType()
			@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Cancel']")
			public WebElement Cancel;
			@FindBy(xpath="(//a[text()='--None--'])[1]")
			public WebElement ClickOnBANTQualificationDropdown;
			@TextType()
			@FindBy(xpath="(//a[text()='N/A'])[1]")
			public WebElement BANTQualification;
			@FindBy(xpath = "(//a[text()='Approved'])")
			public WebElement BidBudgetTimescale;
			@FindBy(xpath="(//span[text()='Bid/Budget Timescale']/following::a[text()='--None--']")
			public WebElement ClickOnBidBudgetTimescaleDropdown;
			@TextType()
			@FindBy(xpath = "//span[normalize-space(.)='These required fields must be completed: Last Name, Company, Email, Lead Source, Opt In']")
			public WebElement VerifyErrorMessageForNameCompanyEmailLeadSourceAndOptIn;
			@ButtonType()
			@FindBy(xpath = "//button[normalize-space(.)='Edit Presentations & Demos']")
			public WebElement editPresentationsAndDemos;
			@LinkType()
			@FindBy(xpath = "(//span[text()='Presentations & Demos']//following::a[text()='--None--'])[1]")
			public WebElement Presentations_DemosDropdown;
			@LinkType()
			@FindBy(xpath = "(//span[text()='Presentations & Demos']//following::a[text()='N/A'])[1]")
			public WebElement Presentation_DemosN_Avalue;
			@LinkType()
			@FindBy(xpath = "(//span[text()='Through to next stage with other vendors']//following::a[text()='--None--'])[1]")
			public WebElement ThroughToNextStageWithOtherVendors;
			@LinkType()
			@FindBy(xpath = "(//span[text()='Through to next stage with other vendors']//following::a[text()='Yes'])")
			public WebElement ThroughToNextStageWithOtherVendorsN_AValue;
			@ButtonType()
			@FindBy(xpath = "//button[normalize-space(.)='Edit Shortlisted']")
			public WebElement EditShortlisted;
			@LinkType()
			@FindBy(xpath = "(//span[text()='Shortlisted']//following::a[text()='--None--'])[1]")
			public WebElement ShortlistedDropdown;
			@LinkType()
			@FindBy(xpath = "(//span[text()='Shortlisted']//following::a[text()='Yes'])")
			public WebElement ShortlistedYesValue;
			@LinkType()
			@FindBy(xpath = "(//span[text()='Vendor Selection & due diligence']//following::a[text()='--None--'])[1]")
			public WebElement VendorSelection_dueDiligenceDropdown;
			@LinkType()
			@FindBy(xpath = "(//span[text()='Vendor Selection & due diligence']//following::a[text()='In-Progress'])")
			public WebElement VendorSelection_dueDiligenceInProgressValue;
			@LinkType()
			@FindBy(xpath = "(//span[text()='Preferred supplier status']//following::a[text()='--None--'])[1]")
			public WebElement PreferredSupplierStatusDropdown;
			@ButtonType()
			@FindBy(xpath = "//button[normalize-space(.)='Edit Closing in this calendar month']")
			public WebElement EditClosingInThisCalendarMonth;
			@LinkType()
			@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='--None--']")
			public WebElement ClosingInThisCalendarMonth;
			@LinkType()
			@FindBy(xpath = "(//span[text()='Preferred supplier status']//following::a[text()='Yes'])[2]")
			public WebElement PreferredSupplierStatusYesValue;
			
					
			
}
