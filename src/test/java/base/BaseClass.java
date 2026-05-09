package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class BaseClass 
{
	protected WebDriver driver;
	
	@BeforeTest
	public void Setup()
	{
	driver = new ChromeDriver();
	driver.get("https://demoqa.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
}