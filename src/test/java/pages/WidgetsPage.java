package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WidgetsPage {
	
	WebDriver driver;
	
	public WidgetsPage(WebDriver driver)
	{
		this.driver=driver;	
	}
	
	//locator
	By widget_btn = By.xpath("//h5[text()='Widgets']");
    By auto_complete = By.xpath("//span[text()='Auto Complete']");
    By multi_color = By.xpath("//div[@id='autoCompleteSingleContainer']//div[contains(@class, 'auto-complete__input-container')]");
    
   public void OpenWidgets() 
    {
    	WebElement element = driver.findElement(widget_btn);
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);	
    	element.click();
    }
    public void ClickAutoComplete()
    {
    	driver.findElement(auto_complete).click();
    }
    public void ClickMultiColor()
    {
    	driver.findElement(multi_color).click();
    }
}
