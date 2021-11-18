package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

import pages.OrangePages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OrangeHRP_StepDefenations {

	WebDriver driver;
	OrangePages OrangeOR;

	@Given("^the user opens the browser$")
	public void the_user_opens_the_browser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		OrangeOR = new OrangePages(driver);
	}

	@Then("^the user runs the URL$")
	public void the_user_runs_the_URL() throws InterruptedException {

		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);

	}

	@SuppressWarnings("deprecation")
	@Given("^I am in OrangeHRP Application$")
	public void i_am_in_OrangeHRP_Application() throws InterruptedException {

		String title = driver.getTitle();
		boolean status = title.contains("OrangeHRM");
		Assert.assertTrue(status);
		System.out.println("The user is an OrangeHRM home page");
	}

	@Then("^Login to Application$")
	public void login_to_Application() throws InterruptedException {

		OrangeOR.GetLoginUserName("Admin");
		Thread.sleep(2000);
		OrangeOR.GetPassword("admin123");
		Thread.sleep(2000);
		OrangeOR.SetSubmitOnLoginButton();
		Thread.sleep(2000);
	}

	@SuppressWarnings("deprecation")
	@When("^Dashboard page is available$")
	public void dashboard_page_is_available() {
		String OnDashBoard;
		OnDashBoard = OrangeOR.getDashBoardCOnfirmation();
		Assert.assertEquals("Dashboard", OnDashBoard);
		System.out.println("User is in " + OnDashBoard + " Menu");

	}

	@SuppressWarnings("deprecation")
	@When("^click on Admin menu$")
	public void click_on_Admin_menu() throws InterruptedException {

		OrangeOR.GetAdminTab();
		String TabName = OrangeOR.GetAdminTabConfirmation();

		Assert.assertEquals("Admin", TabName);
		System.out.println("User is in " + TabName + "Menu");

	}

	@Then("^Click on Job$")
	public void click_on_Job() throws InterruptedException {

		WebElement JobMenu = driver.findElement(By.xpath(" //a[@id='menu_admin_Job']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(JobMenu).build().perform();
		Thread.sleep(3000);
		System.out.println("Mouse is above job menu ");
		OrangeOR.GetJobMenu();
		Thread.sleep(3000);

	}

	@SuppressWarnings("deprecation")
	@Then("^validate text – Job Title$")
	public void validate_text_Job_Title() {
		String JobTitle = driver.findElement(By.xpath("//h1[contains(text(),'Job Titles')]")).getText();
		Assert.assertEquals("Job Titles", JobTitle);
		System.out.println("User is in " + JobTitle + "Menu");

	}

	@Then("^click on PIM menu$")
	public void click_on_PIM_menu() throws InterruptedException {

		OrangeOR.GetPImTab();
		Thread.sleep(3000);

	}

	@SuppressWarnings("deprecation")
	@Then("^validate User in PIM Menu$")
	public void validate_User_in_PIM_Menu() {
		String URL = driver.getCurrentUrl();
		boolean status = URL.contains("pim");
//	Assert.assertEquals(true, status);
		Assert.assertTrue(status);
		System.out.println("User is on PIM Tab");

	}

	@Then("^click on Time menu$")
	public void click_on_Time_menu() throws InterruptedException {
		OrangeOR.GetTimeTab();
		Thread.sleep(3000);

	}

	@SuppressWarnings("deprecation")
	@Then("^validate User in Time Menu$")
	public void validate_User_in_Time_Menu() {

		String URL = driver.getCurrentUrl();
		boolean status = URL.contains("time");
		// Assert.assertEquals("time", status);
		Assert.assertTrue(status);
		System.out.println("User is on time Tab");

	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.close();
	}

}
