package SeleniumTasks;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task3_DynamicLoad_Run extends Base_Class{
	
	String URL = "https://the-internet.herokuapp.com/";
	
	
	
	
	
@Test (priority=3)
	public void Task3_run() throws InterruptedException 
	{	
		this.Test_Setup();
		
		Navigate_to_Landing_Page_Method Nav_To_Page = new Navigate_to_Landing_Page_Method (this.driver) ;
		Nav_To_Page.Set_URL(URL);

		Landing_Page_Method LandingPage = new Landing_Page_Method(this.driver) ;
		LandingPage.Dynamic_Load_Link();
		
		Task3_DynamicLoad_Methods D_L_M = new Task3_DynamicLoad_Methods(this.driver);
		D_L_M.Choose_Second_Option();
		
		
		Task3_DynamicLoad2_Methods D_L2_M = new Task3_DynamicLoad2_Methods(this.driver);
		D_L2_M.Click_Start_Button();
        D_L2_M.Check_Loading_Bar_Invisible();
        D_L2_M.Validate_Text();
        
  
		
	}

	
	

}
