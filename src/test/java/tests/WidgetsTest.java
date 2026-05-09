package tests;

import org.testng.annotations.Test;

//import org.testng.annotations.Test;

import base.BaseClass;
import pages.WidgetsPage;

public class WidgetsTest extends BaseClass
{	
	
@Test
void EnterColor() 
{
WidgetsPage Wp = new WidgetsPage(driver);
Wp.OpenWidgets();
Wp.ClickAutoComplete();
Wp.ClickMultiColor();

}	
}
