package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(connection = "Admin")
public class EditLines {
@PageRow()
	public static class EditLineItemsTable {
		
		@TextType()
		@FindBy(xpath = ".//td[2]//div")
		public WebElement productName;
		
		@TextType()
		@FindBy(xpath = ".//td[9]//select")
		public WebElement revenueType;
		
		@TextType()
		@FindBy(xpath = ".//td[10]//input")
		public WebElement revenueStartDate;

		@TextType()
		@FindBy(xpath = ".//td[11]//input")
		public WebElement term;

		@TextType()
		@FindBy(xpath = ".//td[12]//select")
		public WebElement frequency;

		@TextType()
		@FindBy(xpath = ".//td[13]//select")
		public WebElement marginType;

		@TextType()
		@FindBy(xpath = ".//td[14]//input")
		public WebElement marginValue;

		@TextType()
		@FindBy(xpath = ".//td[15]//input")
		public WebElement quantity;

		@TextType()
		@FindBy(xpath = ".//td[16]//input")
		public WebElement salesPrice;

	}

	@PageTable(row = EditLineItemsTable.class, firstRowContainsHeaders = false)
	@FindBy(xpath = "//div[@class='slds-scrollable']//table/tbody/tr")
	public List<EditLineItemsTable> EditLineItemsList;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//div[@class='slds-modal__footer']//button[text()='Save']")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit BANT/Qualification']")
	public WebElement editBANTQualification;
	@TextType()
	@FindBy(xpath = "//span[text()='BANT/Qualification']/../following-sibling::div//a[@class='select']")
	public WebElement bantQualification;
	@LinkType()
	@FindBy(xpath = "//span[text()='Bid/Budget Timescale']/../following-sibling::div//a[@class='select']")
	public WebElement bidBudgetTimescale;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement qualificationSave;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit Presentations & Demos']")
	public WebElement editPresentationsAndDemos;
	@TextType()
	@FindBy(xpath = "//span[text()='Presentations & Demos']/../following-sibling::div//a[@class='select']")
	public WebElement presentationsAndDemos;
	@TextType()
	@FindBy(xpath = "//span[text()='Down Selected With Other Vendors']/../following-sibling::div//a[@class='select']")
	public WebElement downSelectedWithOtherVendors;
	@TextType()
	@FindBy(xpath = "//span[text()='Vendor Selection & DD']/../following-sibling::div//a[@class='select']")
	public WebElement vendorSelection;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement opportunityDevelopmentSave;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit In Final 2 Shortlist']")
	public WebElement editInFinal2Shortlist;
	@TextType()
	@FindBy(xpath = "//span[text()='In Final 2 Shortlist']/../following-sibling::div//a[@class='select']")
	public WebElement InFinal2Shortlist;
	
	
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement proposalDevelopmentSave;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit Current Calendar Month Close']")
	public WebElement editCurrentCalendarMonthClose;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement negotiatingSave;
	@TextType()
	@FindBy(xpath = "//span[text()='Preferred Supplier']/../following-sibling::div//a[@class='select']")
	public WebElement preferredSupplier;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit Current Calendar Month Close']")
	public WebElement editcalendarMonth;
	@TextType()
	@FindBy(xpath = "//span[text()='Current Calendar Month Close']/../following-sibling::div//a[@class='select']")
	public WebElement calendarMonth;
	@ButtonType
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Cancel']")
	public WebElement cancelBtn;
	
}
