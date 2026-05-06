package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class FormFillingTest extends BaseClass {

@Test
 void RegForm() 
{
	HomePage hp = new HomePage(driver);
	hp.ClickFormBtn();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	hp.ClickPracForm();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    hp.ClickRadioBtn();
    hp.SelectCheckBox();
}
}
