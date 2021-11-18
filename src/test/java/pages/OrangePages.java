package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangePages {

	WebDriver driver;

	@FindAll(@FindBy(xpath = "//img"))
	@CacheLookup
	List<WebElement> AllImagesXpath;

	public List<WebElement> getAllImagesXpath() {

		return AllImagesXpath;

	}

	@FindAll(@FindBy(css = "img"))
	@CacheLookup
	List<WebElement> AllImagescss;

	public List<WebElement> getAllImagesCss() {

		return AllImagescss;

	}

	@FindAll(@FindBy(xpath = "//a"))
	@CacheLookup
	List<WebElement> AllLinksxpath;

	public List<WebElement> getAllLinksXpath() {
		return AllLinksxpath;
	}

	@FindAll(@FindBy(css = "a[href]"))
	@CacheLookup
	List<WebElement> AllLinksCss;

	public List<WebElement> getAllLinks1() {
		return AllLinksCss;
	}

	@FindAll(@FindBy(xpath = "//input[contains(@name,'txt')]"))
	@CacheLookup
	List<WebElement> AllTextBoxesXpath;

	public List<WebElement> getAllTextBoxesXpath() {
		return AllTextBoxesXpath;
	}

	@FindAll(@FindBy(css = "div.textInputContainer"))
	@CacheLookup
	List<WebElement> AllTextBoxesCss;

	public List<WebElement> getAllTextBoxesCss() {
		return AllTextBoxesCss;
	}
	
	@FindBy(xpath="//input[@id='txtUsername']")
 	WebElement Login ;
	public void GetLoginUserName(String UserName)
	{
		Login.clear();
		Login.sendKeys(UserName);
	}
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement EnterPassword ;
	public void GetPassword(String Password)
	{
		EnterPassword.clear();
		EnterPassword.sendKeys(Password);
		
	}
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement SubmitButton ;
	public void SetSubmitOnLoginButton()
	{
		SubmitButton.click();
	}
	
	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement ClickAdminTab;
	public void GetAdminTab() throws InterruptedException
	{
		ClickAdminTab.click();
		Thread.sleep(2000);
		
	}
	
	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement GetAdminTagText;
	public String GetAdminTabConfirmation()
	{
		return GetAdminTagText.getText();
	}
	
	@FindBy(xpath="//b[contains(text(),'PIM')]")
	WebElement PIMTab;
	public void GetPImTab()
	{
		PIMTab.click();
	}
	
	@FindBy(xpath="//b[contains(text(),'PIM')]")
	WebElement GetPIMTagText;
	public String GetPIMTabConfirmation()
	{
		return GetPIMTagText.getText();
	}
	
	@FindBy(xpath="//b[contains(text(),'Leave')]")
	WebElement LeaveTAB;
	public void GetLeaveTab()
	{
		LeaveTAB.click();
	}
	
	@FindBy(xpath="//b[contains(text(),'Leave')]")
	WebElement GetLeaveTab;
	public String GetLeaveTabConfirmation()
	{
		return GetLeaveTab.getText();
	}
	
	@FindBy(xpath="//b[contains(text(),'Directory')]")
	WebElement DirectoryText;
	public String GetDirectoryTabConfirmation()
	{
		
		return DirectoryText.getText();
	}
	
	@FindBy(xpath="//b[contains(text(),'Directory')]")
	WebElement Directory;
	public void GetDirectoryTab()
	{
		Directory.click();
	}
	
	@FindBy(xpath="//b[contains(text(),'Maintenance')]")
	WebElement Maintenance;
	public void GetMaintenanceTab()
	{
		Maintenance.click();
	}
	
	@FindBy(xpath="//b[contains(text(),'Maintenance')]")
	WebElement MaintenanceTab;
	public String GetMaintenanceTabConfirmation()
	{
		
		return MaintenanceTab.getText();
	}
	
	@FindBy(xpath="//b[contains(text(),'Dashboard')]")
	WebElement DashBoardTab;
	public void  getDashBoardUsingTabName()
	{
		DashBoardTab.click();
	}
	
	@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
	WebElement DashBoardTabHeader;
	public String getDashBoardConfirmtionUsingHeaderText()
	{
		return DashBoardTabHeader.getText();
	}
	
	@FindBy(xpath="//b[contains(text(),'Dashboard')]")
	WebElement DashBoard;
	public String getDashBoardCOnfirmation()
	{
		return DashBoard.getText();	
	}
	
	@FindBy(xpath="//a[@id='menu_admin_viewJobTitleList']")
	WebElement JobTitle;

	public void GetJobMenu()
	{
		JobTitle.click(); 
		
		
	}
	
@FindBy(xpath="//b[contains(text(),'Time')]")
	
	WebElement TimeTab;
	public void GetTimeTab()
	{
		TimeTab.click();
	}

	public OrangePages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
