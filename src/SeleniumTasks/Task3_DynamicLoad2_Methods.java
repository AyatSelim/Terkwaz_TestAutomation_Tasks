package SeleniumTasks;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Task3_DynamicLoad2_Methods {
	
	public Task3_DynamicLoad2_Methods(WebDriver driver) {
		
		this.driver = driver;
	}
	
 WebDriver driver ;

String Start_Button_Xpath = "//div[@id='start']/button" ;
String Load_Bar_ID = "loading";
String Endmsg_id = "finish";


WebElement Start_Button ;                                     
WebElement Endmsg  ;

	
public void Click_Start_Button() 
{
	Start_Button = this.driver.findElement(By.xpath(Start_Button_Xpath)); 
	Start_Button.click();
}

public void Check_Loading_Bar_Invisible() 
{
	  WebDriverWait  wait = new WebDriverWait(this.driver , 10);
	  wait.withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);  
      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(Load_Bar_ID)));
	
}

public void Validate_Text() 
{
	Endmsg = this.driver.findElement(By.id(Endmsg_id)) ;
	Assert.assertEquals("Hello World!", Endmsg.getText());
}



}
