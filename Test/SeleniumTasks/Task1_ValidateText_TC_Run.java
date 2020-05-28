package SeleniumTasks;

import java.io.IOException;
import org.testng.annotations.Test;

public class Task1_ValidateText_TC_Run extends Base_Class
{
	
	
	String URL = "https://www.google.com/ncr";
	String search_key= "Selenium Webdriver" ;

@Test(priority=1)
public void Task1_1Run() throws InterruptedException, IOException{
		
	this.Test_Setup();
	
	    Navigate_to_Landing_Page_Method Nav_Page = new Navigate_to_Landing_Page_Method (this.driver); 
	    Nav_Page.Set_URL(URL);	
 
		Task1_Validate_Text_Methods V_Text = new Task1_Validate_Text_Methods(this.driver);
		V_Text.Enter_Text(search_key);
		V_Text.Valiadte_Text();
		V_Text.Add_ScreenShot1();
		
		
		this.Test_TearDown();
	}

}
