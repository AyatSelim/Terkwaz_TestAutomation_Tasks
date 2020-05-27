package SeleniumTasks;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1_Run extends Base_Class
{
	
	
	String URL = "https://www.google.com/ncr";
	String search_key= "Selenium Webdriver" ;

@Test(priority=1)
public void Task1_1Run() throws InterruptedException{
		
	this.Test_Setup();
	
	    Navigate_to_Landing_Page_Method Nav_Page = new Navigate_to_Landing_Page_Method (this.driver); 
	    Nav_Page.Set_URL(URL);	
 
		Task1_Validate_Text_Methods V_Text = new Task1_Validate_Text_Methods(this.driver);
		V_Text.Enter_Text(search_key);
		V_Text.Valiadte_Text();
		
		
		
	}

}
