package SeleniumTasks;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Task1_Validate_Text_Methods {
	
	WebDriver driver ;
	
	Task1_Validate_Text_Methods (WebDriver driver){
		this.driver = driver;
	}

	String search_box = "q";
	String Third_Result_Path = "//div[contains(@class,'cbphWd')][contains(text(),'What is selenium')]"; 
	
	WebElement Search_Box;
	WebElement Third_Result;
	
   Page_Actions  P_A_Task1 = new Page_Actions();
	
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
	 
	 
	 public void Add_ScreenShot1 () throws IOException {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("scroll(0, 550)");
		 js.executeScript("arguments[0].setAttribute('style','border: solid 2px yellow')",Third_Result);
		 
		 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 P_A_Task1.Take_ScreenShot(this.driver, "_Task1.png");
		 
		 
	 }
	
	

}
