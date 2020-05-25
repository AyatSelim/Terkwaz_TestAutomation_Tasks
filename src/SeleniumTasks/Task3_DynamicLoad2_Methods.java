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
	
private WebDriver driver ;

WebDriverWait  wait = new WebDriverWait(driver , 10);

String Start_Button_Xpath = "//div[@id='start']/button" ;
String Endmsg_id = "finish";

WebElement Start_Button = driver.findElement(By.xpath(Start_Button_Xpath));                                     
WebElement Endmsg = driver.findElement(By.id(Endmsg_id)) ;

	
public void Click_Start_Button() 
{
	Start_Button.click();
}

public void Check_Loading_Bar_Invisible() 
{
	
	  wait.withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);  
      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
	
}

public void Validate_Text() 
{
	
	Assert.assertEquals("Hello World!", Endmsg.getText());
}



}
