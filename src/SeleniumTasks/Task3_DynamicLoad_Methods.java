package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_DynamicLoad_Methods {
	
	public Task3_DynamicLoad_Methods(WebDriver driver) {
		this.driver = driver;
	}
	
WebDriver driver ;

String Path = "//div[@class='example']/a[2]" ;

WebElement Link ;
	  
	  
	  public void Choose_Second_Option() 
	  {
		  Link = this.driver.findElement(By.xpath(Path));
		  Link.click();
		  
	  }
	  
	 
	  
}
