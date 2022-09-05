package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddContactPage extends BasePage {
	

	WebDriver driver;

	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Contact')]")
	WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement COUNTRY_DROPDOWN_ELEMENT;

	public void validateAddContactPage(String addContact) {
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), addContact, "Wrong Page!!");

	}

	public void insertFullName(String fullName) {
		FULLNAME_ELEMENT.sendKeys(fullName + generateRandomNo(999));

	}

	public void selectCompany(String company) {
	
		SelectFromDropdown(COMPANY_DROPDOWN_ELEMENT, company);
		
	}

	public void inserEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNo(999) + email);
		
	}

	}


