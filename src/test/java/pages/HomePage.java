package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	
	WebDriver driver;
	
	public HomePage (WebDriver driver)
{
		this.driver = driver;
}
	
//locators
By Forms_btn = By.xpath("//div[@class='element-group'][2]//div[@class='header-right']");
By Other_radio_btn = By.xpath("//input[@id='gender-radio-3']");
By Sports = By.xpath("//input[@id='hobbies-checkbox-1']");
By Reading = By.xpath("//input[@id='hobbies-checkbox-2']");
By Writing = By.xpath("//input[@id='hobbies-checkbox-3']");
By Prac_Form = By.xpath("//span[text()='Practice Form']");

public void ClickFormBtn()
{
driver.findElement(Forms_btn).click();
}

public void ClickPracForm() {
	
	driver.findElement(Prac_Form).click();
}

public void ClickRadioBtn()
{
	WebElement RadioBtn = driver.findElement(Other_radio_btn);
	// Check if it is already selected
	if(RadioBtn.isSelected())
	{
	    System.out.println("Radio button is already selected");
	} 
	else 
	{
		RadioBtn.click();
	    System.out.println("Radio button was not selected, now clicked");
	}

}
public void SelectCheckBox()
{
	driver.findElement(Sports).click();
	driver.findElement(Reading).click();
	driver.findElement(Writing).click();
}
}
