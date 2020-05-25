package SeleniumTasks;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1_Run extends Base_Class
{
	
	String URL = "https://www.google.com/ncr";
	
	Task1_Validate_Text_Methods V_Text = new Task1_Validate_Text_Methods();
	
	@BeforeTest
	public void Task1_1() throws InterruptedException 
	{	

		driver.navigate().to(URL);
		
	    
	}
	
	
	@Test
	public void Task1_2() throws InterruptedException {
		
		V_Text.Valiadte_Text();
		
	}

	

}
