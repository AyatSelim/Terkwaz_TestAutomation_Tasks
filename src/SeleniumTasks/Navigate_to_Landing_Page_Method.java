package SeleniumTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Navigate_to_Landing_Page_Method {
	

 WebDriver driver ;

	public Navigate_to_Landing_Page_Method (WebDriver driver )
	{
		this.driver = driver ;
				
	}
	
	public void Set_URL (String url) {

		this.driver.navigate().to(url);
	}
	
	
}
