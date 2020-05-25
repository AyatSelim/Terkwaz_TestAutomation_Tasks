package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_DynamicLoad_Methods {
	
WebDriver driver ;

String Path = "//div[@class='example']/a[2]" ;

WebElement Link = driver.findElement(By.xpath(Path));
	  
	  
	  public void Choose_Second_Option()
	  {
		  Link.click();
	  }
	  
	 
	  
}
