package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
//	public LoginPage() {}
	
//	public LoginPage (int i) {}
		
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		
	}
	

	
//	Element List
//	WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
//	By USER_NAME_FIELS = By.xpath(("//input[@id='username']"));
	





	@FindBy(how = How.XPATH, using ="//input[@id='username']")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using ="//input[@type='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using ="//button[@class='btn btn-success block full-width']")
	WebElement SIGNIN_ELEMENT;

	
	
	
	
	public void insertUserName(String userName){
		USER_NAME_ELEMENT.sendKeys(userName);
		
	}
	
	public void insertPassword(String password){
		PASSWORD_ELEMENT.sendKeys(password);
		
	}
	
	public void clickSigninButton() {
		SIGNIN_ELEMENT.click();
		
	}
		
	public void performLogin(String userName, String password) {
			USER_NAME_ELEMENT.sendKeys(userName);
			PASSWORD_ELEMENT.sendKeys(password);
			SIGNIN_ELEMENT.click();
			
			}
	}
	
	
	
			
	

