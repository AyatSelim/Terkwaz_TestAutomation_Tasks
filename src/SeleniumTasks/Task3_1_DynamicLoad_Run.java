package SeleniumTasks;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task3_1_DynamicLoad_Run extends Base_Class{
	
	
	String URL = "https://the-internet.herokuapp.com/";
	
	Landing_Page_Method LandingPage = new Landing_Page_Method() ;
	Task3_DynamicLoad_Methods D_L_M = new Task3_DynamicLoad_Methods();
	Task3_DynamicLoad2_Methods D_L2_M = new Task3_DynamicLoad2_Methods();
	
	
	@BeforeTest
	public void Task1_1() throws InterruptedException 
	{	

		driver.navigate().to(URL);
		
	    
	}
	
	
	@Test
	public void Task1_2() throws InterruptedException {
		
		LandingPage.Dynamic_Load_Link();
		
	}
	
	
	@Test
	public void Task1_3() throws InterruptedException {
		
		D_L_M.Choose_Second_Option();
		
	}

	@Test
	public void Task1_4() throws InterruptedException {
		
		D_L2_M.Click_Start_Button();
        D_L2_M.Check_Loading_Bar_Invisible();
        D_L2_M.Validate_Text();
        //comment
		
	}
}
