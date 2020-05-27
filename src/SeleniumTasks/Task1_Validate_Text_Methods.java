package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Task1_Validate_Text_Methods {
	
	WebDriver driver ;
	
	Task1_Validate_Text_Methods (WebDriver driver){
		this.driver = driver;
	}

	WebElement Third_Result;
	WebElement Search_Box;

	
	String search_box = "q";
	String Third_Result_Path = "//div[contains(@class,'cbphWd')][contains(text(),'What is selenium')]";
	
	 public  void Enter_Text(String string ) throws InterruptedException 
	 {    
		 Search_Box = this.driver.findElement(By.name(search_box));
		 Search_Box.sendKeys(string);
		 Search_Box.sendKeys(Keys.ENTER);
		
	 }
	 
	
	 public  void Valiadte_Text( ) throws InterruptedException 
	 {    
		Third_Result = this.driver.findElement(By.xpath(Third_Result_Path));
		Assert.assertTrue(Third_Result.getText().contains("What is selenium"));
		
	 }
	
	

}
