package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Task1_Validate_Text_Methods {
	
	WebDriver driver ;
	
	String Third_Result_Path = "//div[contains(@class,'cbphWd')][contains(text(),'What is selenium')]";
	WebElement Third_Result = driver.findElement(By.xpath(Third_Result_Path));
	
	
	 public  void Valiadte_Text( ) throws InterruptedException 
	 {    
		Assert.assertTrue(Third_Result.getText().contains("What is selenium"));
		
	 }

}
