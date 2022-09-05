package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
        
	WebDriver driver;

	public void SelectFromDropdown(WebElement element, String visibleText) {

		Select sel1 = new Select(element);
		sel1.selectByVisibleText(visibleText);
	
}
	
	public int generateRandomNo(int boundaryNo) {

		Random rmd = new Random();
		int generatedNo = rmd.nextInt(boundaryNo);
		return generatedNo;
}
	
}
